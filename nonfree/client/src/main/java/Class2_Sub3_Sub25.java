import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sa")
public final class Class2_Sub3_Sub25 extends Class2_Sub3 {

	@OriginalMember(owner = "client!sa", name = "pb", descriptor = "[I")
	private int[] anIntArray310;

	@OriginalMember(owner = "client!sa", name = "qb", descriptor = "[I")
	private int[] anIntArray311;

	@OriginalMember(owner = "client!sa", name = "mb", descriptor = "I")
	private int anInt3329;

	@OriginalMember(owner = "client!sa", name = "ob", descriptor = "I")
	private int anInt3331;

	@OriginalMember(owner = "client!sa", name = "kb", descriptor = "Z")
	private boolean aBoolean149;

	@OriginalMember(owner = "client!sa", name = "gb", descriptor = "I")
	private int anInt3324;

	@OriginalMember(owner = "client!sa", name = "wb", descriptor = "I")
	private int anInt3336;

	@OriginalMember(owner = "client!sa", name = "lb", descriptor = "I")
	private int anInt3328;

	@OriginalMember(owner = "client!sa", name = "zb", descriptor = "[I")
	private int[] anIntArray312;

	@OriginalMember(owner = "client!sa", name = "c", descriptor = "(Z)V")
	@Override
	public void method2892() {
		this.method2311();
		this.method2308();
	}

	@OriginalMember(owner = "client!sa", name = "c", descriptor = "(I)V")
	private void method2308() {
		@Pc(19) int local19;
		if (this.anInt3324 > 0) {
			this.anIntArray311 = new int[this.anInt3336];
			this.anIntArray310 = new int[this.anInt3336];
			for (local19 = 0; local19 < this.anInt3336; local19++) {
				this.anIntArray310[local19] = (int) (Math.pow((double) (this.anInt3324 / 4096), (double) local19) * 4096.0D);
				this.anIntArray311[local19] = (int) (Math.pow(2.0D, (double) local19) * 4096.0D);
			}
		} else if (this.anIntArray310 != null && this.anIntArray310.length == this.anInt3336) {
			this.anIntArray311 = new int[this.anInt3336];
			for (local19 = 0; local19 < this.anInt3336; local19++) {
				this.anIntArray311[local19] = (int) (Math.pow(2.0D, (double) local19) * 4096.0D);
			}
		}
	}

	@OriginalMember(owner = "client!sa", name = "d", descriptor = "(Z)V")
	private void method2311() {
		@Pc(8) Random local8 = new Random((long) this.anInt3331);
		for (@Pc(14) int local14 = 0; local14 < 255; local14++) {
			this.anIntArray312[local14] = -1;
		}
		for (@Pc(32) int local32 = 0; local32 < 255; local32++) {
			@Pc(39) int local39;
			do {
				local39 = Static90.method1619(local8, 255);
			} while (this.anIntArray312[local39] != -1);
			this.anIntArray312[local39 + 255] = this.anIntArray312[local39] = local32;
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIII)I")
	private int method2312(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = arg2 & 0xFFFFF000;
		@Pc(11) int local11 = arg3 & 0xFFFFF000;
		@Pc(15) int local15 = arg1 & 0xFFFFF000;
		@Pc(19) int local19 = arg3 - local11;
		@Pc(23) int local23 = local11 >> 12;
		@Pc(27) int local27 = arg2 - local7;
		@Pc(31) int local31 = local7 >> 12;
		@Pc(35) int local35 = local31 + 1;
		@Pc(39) int local39 = local31 & 0xFF;
		@Pc(43) int local43 = local23 + 1;
		@Pc(47) int local47 = arg0 & 0xFFFFF000;
		if (local43 >= local15 >> 12) {
			local43 = 0;
		}
		local43 &= 0xFF;
		local11 = local23 & 0xFF;
		@Pc(78) int local78 = this.anIntArray312[local39 + this.anIntArray312[local43]] % 4;
		@Pc(90) int local90 = this.anIntArray312[this.anIntArray312[local11] + local39] % 4;
		if (local47 >> 12 <= local35) {
			local35 = 0;
		}
		local35 &= 0xFF;
		@Pc(113) int local113 = this.anIntArray312[local35 + this.anIntArray312[local11]] % 4;
		@Pc(125) int local125 = this.anIntArray312[this.anIntArray312[local43] + local35] % 4;
		@Pc(133) int local133 = Static113.method1898(local27, local19, Static79.anIntArrayArray17[local90]);
		@Pc(143) int local143 = Static113.method1898(local27 - 4096, local19, Static79.anIntArrayArray17[local113]);
		@Pc(153) int local153 = Static113.method1898(local27, local19 - 4096, Static79.anIntArrayArray17[local78]);
		@Pc(165) int local165 = Static113.method1898(local27 - 4096, local19 + -4096, Static79.anIntArrayArray17[local125]);
		@Pc(169) int local169 = Static19.method608(local27);
		@Pc(173) int local173 = Static19.method608(local19);
		@Pc(179) int local179 = Static79.method1434(local169, local143, local133);
		@Pc(185) int local185 = Static79.method1434(local169, local165, local153);
		return Static79.method1434(local173, local185, local179);
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IBLclient!ab;)V")
	@Override
	public void method2904(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub2 arg1) {
		if (arg0 == 0) {
			this.aBoolean149 = arg1.method1698() == 1;
		} else if (arg0 == 1) {
			this.anInt3336 = arg1.method1698();
		} else if (arg0 == 2) {
			this.anInt3324 = arg1.method1659();
			if (this.anInt3324 < 0) {
				this.anIntArray310 = new int[this.anInt3336];
				for (@Pc(71) int local71 = 0; local71 < this.anInt3336; local71++) {
					this.anIntArray310[local71] = arg1.method1659();
				}
			}
		} else if (arg0 == 3) {
			this.anInt3329 = this.anInt3328 = arg1.method1698();
		} else if (arg0 == 4) {
			this.anInt3331 = arg1.method1698();
		} else if (arg0 == 5) {
			this.anInt3329 = arg1.method1698();
		} else if (arg0 == 6) {
			this.anInt3328 = arg1.method1698();
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method2889(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass33_39.method1306(arg0);
		if (super.aClass33_39.aBoolean93) {
			@Pc(25) int local25 = this.anInt3329 << 12;
			@Pc(30) int local30 = this.anInt3328 << 12;
			@Pc(37) int local37 = this.anInt3328 * Static21.anIntArray50[arg0];
			for (@Pc(39) int local39 = 0; local39 < Static54.anInt1423; local39++) {
				@Pc(43) int local43 = 0;
				@Pc(50) int local50 = this.anInt3329 * Static36.anIntArray74[local39];
				for (@Pc(52) int local52 = 0; local52 < this.anInt3336; local52++) {
					@Pc(59) int local59 = this.anIntArray311[local52];
					@Pc(64) int local64 = this.anIntArray310[local52];
					@Pc(88) int local88 = this.method2312(local25 * local59 >> 12, local30 * local59 >> 12, local59 * local50 >> 12, local37 * local59 >> 12);
					local43 += local88 * local64 >> 12;
				}
				if (this.aBoolean149) {
					local43 = (local43 >> 1) + 2048;
				}
				local16[local39] = local43;
			}
		}
		return local16;
	}
}

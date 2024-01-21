import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lb")
public final class Class1_Sub4_Sub16 extends Class1_Sub4 {

	@OriginalMember(owner = "client!lb", name = "eb", descriptor = "[I")
	private int[] anIntArray230;

	@OriginalMember(owner = "client!lb", name = "fb", descriptor = "[I")
	private int[] anIntArray231;

	@OriginalMember(owner = "client!lb", name = "db", descriptor = "I")
	private int anInt2613;

	@OriginalMember(owner = "client!lb", name = "jb", descriptor = "I")
	private int anInt2616;

	@OriginalMember(owner = "client!lb", name = "gb", descriptor = "I")
	private int anInt2614;

	@OriginalMember(owner = "client!lb", name = "cb", descriptor = "I")
	private int anInt2612;

	@OriginalMember(owner = "client!lb", name = "bb", descriptor = "[I")
	private int[] anIntArray229;

	@OriginalMember(owner = "client!lb", name = "ob", descriptor = "I")
	private int anInt2619;

	@OriginalMember(owner = "client!lb", name = "xb", descriptor = "Z")
	private boolean aBoolean109;

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method3216(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass39_38.method1880(arg0);
		if (super.aClass39_38.aBoolean110) {
			@Pc(20) int local20 = this.anInt2619 << 12;
			@Pc(25) int local25 = this.anInt2613 << 12;
			@Pc(32) int local32 = Static150.anIntArray383[arg0] * this.anInt2613;
			for (@Pc(34) int local34 = 0; local34 < Static73.anInt1888; local34++) {
				@Pc(43) int local43 = Static171.anIntArray421[local34] * this.anInt2619;
				@Pc(45) int local45 = 0;
				for (@Pc(47) int local47 = 0; local47 < this.anInt2612; local47++) {
					@Pc(54) int local54 = this.anIntArray231[local47];
					@Pc(59) int local59 = this.anIntArray230[local47];
					@Pc(83) int local83 = this.method1875(local25 * local54 >> 12, local32 * local54 >> 12, local54 * local20 >> 12, local43 * local54 >> 12);
					local45 += local83 * local59 >> 12;
				}
				if (this.aBoolean109) {
					local45 = (local45 >> 1) + 2048;
				}
				local11[local34] = local45;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!lb", name = "d", descriptor = "(I)V")
	@Override
	public void method3207() {
		this.method1878();
		this.method1877();
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(BIIII)I")
	private int method1875(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(15) int local15 = arg1 & 0xFFFFF000;
		@Pc(19) int local19 = arg2 & 0xFFFFF000;
		@Pc(23) int local23 = arg1 - local15;
		@Pc(27) int local27 = arg3 & 0xFFFFF000;
		@Pc(31) int local31 = arg0 & 0xFFFFF000;
		@Pc(35) int local35 = local15 >> 12;
		@Pc(39) int local39 = arg3 - local27;
		@Pc(43) int local43 = local35 + 1;
		@Pc(47) int local47 = local27 >> 12;
		if (local31 >> 12 <= local43) {
			local43 = 0;
		}
		local43 &= 0xFF;
		local15 = local35 & 0xFF;
		@Pc(70) int local70 = local47 + 1;
		local27 = local47 & 0xFF;
		@Pc(86) int local86 = this.anIntArray229[this.anIntArray229[local43] + local27] % 4;
		if (local70 >= local19 >> 12) {
			local70 = 0;
		}
		@Pc(105) int local105 = this.anIntArray229[this.anIntArray229[local15] + local27] % 4;
		local70 &= 0xFF;
		@Pc(121) int local121 = this.anIntArray229[this.anIntArray229[local43] + local70] % 4;
		@Pc(134) int local134 = this.anIntArray229[local70 + this.anIntArray229[local15]] % 4;
		@Pc(142) int local142 = Static19.method346(Static97.anIntArrayArray86[local105], local23, local39);
		@Pc(152) int local152 = Static19.method346(Static97.anIntArrayArray86[local134], local23, local39 - 4096);
		@Pc(162) int local162 = Static19.method346(Static97.anIntArrayArray86[local86], local23 - 4096, local39);
		@Pc(174) int local174 = Static19.method346(Static97.anIntArrayArray86[local121], local23 - 4096, local39 + -4096);
		@Pc(178) int local178 = Static175.method3161(local39);
		@Pc(182) int local182 = Static175.method3161(local23);
		@Pc(188) int local188 = Static36.method759(local152, local178, local142);
		@Pc(194) int local194 = Static36.method759(local174, local178, local162);
		return Static36.method759(local194, local182, local188);
	}

	@OriginalMember(owner = "client!lb", name = "j", descriptor = "(I)V")
	private void method1877() {
		@Pc(30) int local30;
		if (this.anInt2614 > 0) {
			this.anIntArray231 = new int[this.anInt2612];
			this.anIntArray230 = new int[this.anInt2612];
			for (local30 = 0; local30 < this.anInt2612; local30++) {
				this.anIntArray230[local30] = (int) (Math.pow((double) (this.anInt2614 / 4096), (double) local30) * 4096.0D);
				this.anIntArray231[local30] = (int) (Math.pow(2.0D, (double) local30) * 4096.0D);
			}
		} else if (this.anIntArray230 != null && this.anIntArray230.length == this.anInt2612) {
			this.anIntArray231 = new int[this.anInt2612];
			for (local30 = 0; local30 < this.anInt2612; local30++) {
				this.anIntArray231[local30] = (int) (Math.pow(2.0D, (double) local30) * 4096.0D);
			}
		}
	}

	@OriginalMember(owner = "client!lb", name = "k", descriptor = "(I)V")
	private void method1878() {
		@Pc(12) Random local12 = new Random((long) this.anInt2616);
		for (@Pc(14) int local14 = 0; local14 < 255; local14++) {
			this.anIntArray229[local14] = -1;
		}
		for (@Pc(41) int local41 = 0; local41 < 255; local41++) {
			@Pc(48) int local48;
			do {
				local48 = Static49.method1046(255, local12);
			} while (this.anIntArray229[local48] != -1);
			this.anIntArray229[local48 + 255] = this.anIntArray229[local48] = local41;
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lclient!hc;IZ)V")
	@Override
	public void method3205(@OriginalArg(0) Class1_Sub6 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.aBoolean109 = arg0.method544() == 1;
		} else if (arg1 == 1) {
			this.anInt2612 = arg0.method544();
		} else if (arg1 == 2) {
			this.anInt2614 = arg0.method497();
			if (this.anInt2614 < 0) {
				this.anIntArray230 = new int[this.anInt2612];
				for (@Pc(68) int local68 = 0; local68 < this.anInt2612; local68++) {
					this.anIntArray230[local68] = arg0.method497();
				}
			}
		} else if (arg1 == 3) {
			this.anInt2619 = this.anInt2613 = arg0.method544();
		} else if (arg1 == 4) {
			this.anInt2616 = arg0.method544();
		} else if (arg1 == 5) {
			this.anInt2619 = arg0.method544();
		} else if (arg1 == 6) {
			this.anInt2613 = arg0.method544();
		}
	}
}

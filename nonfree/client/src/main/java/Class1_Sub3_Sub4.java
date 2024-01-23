import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bf")
public final class Class1_Sub3_Sub4 extends Class1_Sub3 {

	@OriginalMember(owner = "client!bf", name = "T", descriptor = "[I")
	private int[] anIntArray36;

	@OriginalMember(owner = "client!bf", name = "Y", descriptor = "I")
	private int anInt331;

	@OriginalMember(owner = "client!bf", name = "fb", descriptor = "I")
	private int anInt337;

	@OriginalMember(owner = "client!bf", name = "ib", descriptor = "[[I")
	private int[][] anIntArrayArray2;

	@OriginalMember(owner = "client!bf", name = "ob", descriptor = "[[I")
	private int[][] anIntArrayArray3;

	@OriginalMember(owner = "client!bf", name = "sb", descriptor = "I")
	private int anInt347;

	@OriginalMember(owner = "client!bf", name = "U", descriptor = "I")
	private int anInt327 = 204;

	@OriginalMember(owner = "client!bf", name = "W", descriptor = "I")
	private int anInt329 = 409;

	@OriginalMember(owner = "client!bf", name = "bb", descriptor = "I")
	private int anInt334 = 81;

	@OriginalMember(owner = "client!bf", name = "hb", descriptor = "I")
	private int anInt338 = 4;

	@OriginalMember(owner = "client!bf", name = "R", descriptor = "I")
	private int anInt325 = 1024;

	@OriginalMember(owner = "client!bf", name = "kb", descriptor = "I")
	private int anInt340 = 8;

	@OriginalMember(owner = "client!bf", name = "qb", descriptor = "I")
	private int anInt345 = 0;

	@OriginalMember(owner = "client!bf", name = "pb", descriptor = "I")
	private int anInt344 = 1024;

	@OriginalMember(owner = "client!bf", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub4() {
		super(0, true);
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3475(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass79_41.method2341(arg0);
		if (super.aClass79_41.aBoolean125) {
			@Pc(23) int local23 = 0;
			@Pc(30) int local30;
			for (local30 = this.anInt345 + Static23.anIntArray47[arg0]; local30 < 0; local30 += 4096) {
			}
			while (local30 > 4096) {
				local30 -= 4096;
			}
			while (local23 < this.anInt340 && local30 >= this.anIntArray36[local23]) {
				local23++;
			}
			@Pc(68) int local68 = local23 - 1;
			@Pc(73) int local73 = this.anIntArray36[local23];
			@Pc(80) int local80 = this.anIntArray36[local23 - 1];
			@Pc(88) boolean local88 = (local23 & 0x1) == 0;
			if (local80 + this.anInt347 < local30 && local30 < local73 - this.anInt347) {
				for (@Pc(108) int local108 = 0; local108 < Static76.anInt1531; local108++) {
					@Pc(119) int local119 = local88 ? this.anInt344 : -this.anInt344;
					@Pc(130) int local130;
					for (local130 = (local119 * this.anInt337 >> 12) + Static106.anIntArray202[local108]; local130 < 0; local130 += 4096) {
					}
					while (local130 > 4096) {
						local130 -= 4096;
					}
					@Pc(146) int local146;
					for (local146 = 0; local146 < this.anInt338 && this.anIntArrayArray2[local68][local146] <= local130; local146++) {
					}
					@Pc(169) int local169 = local146 - 1;
					@Pc(176) int local176 = this.anIntArrayArray2[local68][local146];
					@Pc(183) int local183 = this.anIntArrayArray2[local68][local169];
					if (local130 > local183 + this.anInt347 && local130 < local176 - this.anInt347) {
						local17[local108] = this.anIntArrayArray3[local68][local169];
					} else {
						local17[local108] = 0;
					}
				}
			} else {
				Static235.method864(local17, 0, Static76.anInt1531, 0);
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IILclient!pg;)V")
	@Override
	public void method3466(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub17 arg1) {
		if (arg0 == 0) {
			this.anInt338 = arg1.method2142();
		} else if (arg0 == 1) {
			this.anInt340 = arg1.method2142();
		} else if (arg0 == 2) {
			this.anInt329 = arg1.method2178();
		} else if (arg0 == 3) {
			this.anInt327 = arg1.method2178();
		} else if (arg0 == 4) {
			this.anInt344 = arg1.method2178();
		} else if (arg0 == 5) {
			this.anInt345 = arg1.method2178();
		} else if (arg0 == 6) {
			this.anInt334 = arg1.method2178();
		} else if (arg0 == 7) {
			this.anInt325 = arg1.method2178();
		}
	}

	@OriginalMember(owner = "client!bf", name = "d", descriptor = "(B)V")
	@Override
	public void method3474() {
		this.method255();
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Z)V")
	private void method255() {
		@Pc(12) Random local12 = new Random((long) this.anInt340);
		this.anInt337 = 4096 / this.anInt338;
		this.anIntArray36 = new int[this.anInt340 + 1];
		this.anIntArray36[0] = 0;
		this.anInt347 = this.anInt334 / 2;
		this.anIntArrayArray2 = new int[this.anInt340][this.anInt338 + 1];
		this.anInt331 = 4096 / this.anInt340;
		this.anIntArrayArray3 = new int[this.anInt340][this.anInt338];
		@Pc(67) int local67 = this.anInt337 / 2;
		@Pc(72) int local72 = this.anInt331 / 2;
		for (@Pc(74) int local74 = 0; local74 < this.anInt340; local74++) {
			@Pc(81) int local81;
			@Pc(93) int local93;
			if (local74 > 0) {
				local81 = this.anInt331;
				local93 = (Static131.method2214(4096, local12) - 2048) * this.anInt327 >> 12;
				@Pc(101) int local101 = local81 + (local93 * local72 >> 12);
				this.anIntArray36[local74] = this.anIntArray36[local74 - 1] + local101;
			}
			this.anIntArrayArray2[local74][0] = 0;
			for (local81 = 0; local81 < this.anInt338; local81++) {
				if (local81 > 0) {
					local93 = this.anInt337;
					@Pc(145) int local145 = (Static131.method2214(4096, local12) - 2048) * this.anInt329 >> 12;
					local93 += local145 * local67 >> 12;
					this.anIntArrayArray2[local74][local81] = this.anIntArrayArray2[local74][local81 - 1] + local93;
				}
				this.anIntArrayArray3[local74][local81] = this.anInt325 > 0 ? 4096 - Static131.method2214(this.anInt325, local12) : 4096;
			}
			this.anIntArrayArray2[local74][this.anInt338] = 4096;
		}
		this.anIntArray36[this.anInt340] = 4096;
	}
}

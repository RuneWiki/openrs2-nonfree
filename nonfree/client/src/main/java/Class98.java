import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lk")
public abstract class Class98 {

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "[S")
	private short[] aShortArray121;

	@OriginalMember(owner = "client!lk", name = "b", descriptor = "I")
	private int anInt8109 = 4;

	@OriginalMember(owner = "client!lk", name = "h", descriptor = "I")
	private int anInt8114 = 4;

	@OriginalMember(owner = "client!lk", name = "g", descriptor = "I")
	private int anInt8113 = 0;

	@OriginalMember(owner = "client!lk", name = "f", descriptor = "[S")
	private final short[] aShortArray122 = new short[512];

	@OriginalMember(owner = "client!lk", name = "e", descriptor = "I")
	private int anInt8112 = 4;

	@OriginalMember(owner = "client!lk", name = "m", descriptor = "I")
	protected int anInt8118 = 4;

	@OriginalMember(owner = "client!lk", name = "<init>", descriptor = "(IIIII)V")
	protected Class98(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt8114 = arg3;
		this.anInt8118 = arg1;
		this.anInt8113 = arg0;
		this.anInt8112 = arg4;
		this.anInt8109 = arg2;
		this.method7050();
		this.method7049();
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(I)V")
	protected abstract void method7048();

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(B)V")
	private void method7049() {
		@Pc(12) Random local12 = new Random((long) this.anInt8113);
		for (@Pc(14) int local14 = 0; local14 < 255; local14++) {
			this.aShortArray122[local14] = (short) local14;
		}
		for (@Pc(30) int local30 = 0; local30 < 255; local30++) {
			@Pc(39) int local39 = 255 - local30;
			@Pc(46) int local46 = Static522.method7729(local12, local39);
			@Pc(51) short local51 = this.aShortArray122[local46];
			this.aShortArray122[local46] = this.aShortArray122[local39];
			this.aShortArray122[local39] = this.aShortArray122[local39 + 256] = local51;
		}
	}

	@OriginalMember(owner = "client!lk", name = "b", descriptor = "(I)V")
	private void method7050() {
		this.aShortArray121 = new short[this.anInt8118];
		for (@Pc(12) int local12 = 0; local12 < this.anInt8118; local12++) {
			this.aShortArray121[local12] = (short) Math.pow(2.0D, (double) local12);
		}
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(III)V")
	protected abstract void method7051(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!lk", name = "c", descriptor = "(I)V")
	protected abstract void method7052();

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIII)V")
	protected final void method7054() {
		@Pc(12) int[] local12 = new int[128];
		@Pc(15) int[] local15 = new int[128];
		for (@Pc(17) int local17 = 0; local17 < 128; local17++) {
			local12[local17] = (local17 << 12) / 128;
		}
		@Pc(34) int[] local34 = new int[16];
		for (@Pc(36) int local36 = 0; local36 < 128; local36++) {
			local15[local36] = (local36 << 12) / 128;
		}
		for (@Pc(56) int local56 = 0; local56 < 16; local56++) {
			local34[local56] = (local56 << 12) / 16;
		}
		this.method7052();
		for (@Pc(79) int local79 = 0; local79 < 16; local79++) {
			for (@Pc(83) int local83 = 0; local83 < 128; local83++) {
				for (@Pc(87) int local87 = 0; local87 < 128; local87++) {
					for (@Pc(91) int local91 = 0; local91 < this.anInt8118; local91++) {
						@Pc(100) int local100 = this.aShortArray121[local91] << 12;
						@Pc(107) int local107 = this.anInt8109 * local100 >> 12;
						@Pc(115) int local115 = local100 * local34[local79] >> 12;
						@Pc(122) int local122 = this.anInt8114 * local100 >> 12;
						@Pc(129) int local129 = local100 * this.anInt8112 >> 12;
						@Pc(137) int local137 = local100 * local15[local83] >> 12;
						@Pc(145) int local145 = local100 * local12[local87] >> 12;
						@Pc(150) int local150 = local137 * this.anInt8114;
						@Pc(155) int local155 = local145 * this.anInt8109;
						@Pc(160) int local160 = local115 * this.anInt8112;
						@Pc(164) int local164 = local155 >> 12;
						@Pc(168) int local168 = local164 + 1;
						@Pc(172) int local172 = local150 >> 12;
						@Pc(176) int local176 = local164 & 0xFF;
						@Pc(180) int local180 = local172 + 1;
						@Pc(184) int local184 = local172 & 0xFF;
						@Pc(188) int local188 = local160 >> 12;
						@Pc(192) int local192 = local188 + 1;
						@Pc(196) int local196 = local160 & 0xFFF;
						if (local107 > local168) {
							local168 &= 0xFF;
						} else {
							local168 = 0;
						}
						if (local180 < local122) {
							local180 &= 0xFF;
						} else {
							local180 = 0;
						}
						if (local192 >= local129) {
							local192 = 0;
						} else {
							local192 &= 0xFF;
						}
						local188 &= 0xFF;
						local137 = local150 & 0xFFF;
						local145 = local155 & 0xFFF;
						@Pc(253) int local253 = local196 - 4096;
						@Pc(258) short local258 = this.aShortArray122[local192];
						@Pc(262) int local262 = Class185_Sub1.anIntArray417[local145];
						@Pc(266) int local266 = local145 - 4096;
						@Pc(270) int local270 = local137 - 4096;
						@Pc(275) short local275 = this.aShortArray122[local188];
						@Pc(279) int local279 = Class185_Sub1.anIntArray417[local137];
						@Pc(283) int local283 = Class185_Sub1.anIntArray417[local196];
						@Pc(290) short local290 = this.aShortArray122[local258 + local180];
						@Pc(297) short local297 = this.aShortArray122[local275 + local180];
						@Pc(305) short local305 = this.aShortArray122[local184 + local275];
						@Pc(312) short local312 = this.aShortArray122[local258 + local184];
						@Pc(324) int local324 = Static191.method3257(local196, local145, this.aShortArray122[local176 + local305], local137);
						@Pc(337) int local337 = Static191.method3257(local196, local266, this.aShortArray122[local168 + local305], local137);
						@Pc(347) int local347 = local324 + (local262 * (local337 - local324) >> 12);
						@Pc(359) int local359 = Static191.method3257(local196, local145, this.aShortArray122[local297 + local176], local270);
						@Pc(371) int local371 = Static191.method3257(local196, local266, this.aShortArray122[local168 + local297], local270);
						@Pc(382) int local382 = (local262 * (local371 - local359) >> 12) + local359;
						@Pc(393) int local393 = ((local382 - local347) * local279 >> 12) + local347;
						@Pc(405) int local405 = Static191.method3257(local253, local145, this.aShortArray122[local312 + local176], local137);
						@Pc(417) int local417 = Static191.method3257(local253, local266, this.aShortArray122[local312 + local168], local137);
						@Pc(427) int local427 = (local262 * (local417 - local405) >> 12) + local405;
						@Pc(440) int local440 = Static191.method3257(local253, local145, this.aShortArray122[local176 + local290], local270);
						@Pc(453) int local453 = Static191.method3257(local253, local266, this.aShortArray122[local168 + local290], local270);
						@Pc(464) int local464 = local440 + (local262 * (local453 - local440) >> 12);
						@Pc(474) int local474 = ((local464 - local427) * local279 >> 12) + local427;
						this.method7051(((local474 - local393) * local283 >> 12) + local393, local91);
					}
					this.method7048();
				}
			}
		}
	}
}

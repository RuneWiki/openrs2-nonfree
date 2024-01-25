import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cd")
public abstract class Class6 {

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "[S")
	private short[] aShortArray83;

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "I")
	private int anInt7955 = 0;

	@OriginalMember(owner = "client!cd", name = "d", descriptor = "I")
	private int anInt7957 = 4;

	@OriginalMember(owner = "client!cd", name = "h", descriptor = "I")
	private int anInt7961 = 4;

	@OriginalMember(owner = "client!cd", name = "l", descriptor = "I")
	protected int anInt7964 = 4;

	@OriginalMember(owner = "client!cd", name = "m", descriptor = "[S")
	private final short[] aShortArray84 = new short[512];

	@OriginalMember(owner = "client!cd", name = "o", descriptor = "I")
	private int anInt7965 = 4;

	@OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(IIIII)V")
	protected Class6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt7964 = arg1;
		this.anInt7955 = arg0;
		this.anInt7965 = arg4;
		this.anInt7961 = arg3;
		this.anInt7957 = arg2;
		this.method6630();
		this.method6629();
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIBI)V")
	protected final void method6624() {
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
		this.method6625();
		for (@Pc(75) int local75 = 0; local75 < 16; local75++) {
			for (@Pc(79) int local79 = 0; local79 < 128; local79++) {
				for (@Pc(83) int local83 = 0; local83 < 128; local83++) {
					for (@Pc(87) int local87 = 0; local87 < this.anInt7964; local87++) {
						@Pc(96) int local96 = this.aShortArray83[local87] << 12;
						@Pc(104) int local104 = local96 * local15[local79] >> 12;
						@Pc(112) int local112 = local12[local83] * local96 >> 12;
						@Pc(119) int local119 = this.anInt7957 * local96 >> 12;
						@Pc(127) int local127 = local96 * local34[local75] >> 12;
						@Pc(134) int local134 = this.anInt7961 * local96 >> 12;
						@Pc(141) int local141 = local96 * this.anInt7965 >> 12;
						@Pc(146) int local146 = local127 * this.anInt7965;
						@Pc(151) int local151 = local112 * this.anInt7957;
						@Pc(156) int local156 = local104 * this.anInt7961;
						@Pc(160) int local160 = local151 >> 12;
						@Pc(164) int local164 = local160 + 1;
						@Pc(168) int local168 = local156 >> 12;
						@Pc(172) int local172 = local160 & 0xFF;
						@Pc(176) int local176 = local168 + 1;
						@Pc(180) int local180 = local168 & 0xFF;
						@Pc(184) int local184 = local146 >> 12;
						@Pc(188) int local188 = local184 + 1;
						@Pc(192) int local192 = local151 & 0xFFF;
						if (local141 <= local188) {
							local188 = 0;
						} else {
							local188 &= 0xFF;
						}
						if (local164 < local119) {
							local164 &= 0xFF;
						} else {
							local164 = 0;
						}
						if (local176 < local134) {
							local176 &= 0xFF;
						} else {
							local176 = 0;
						}
						local127 = local146 & 0xFFF;
						local184 &= 0xFF;
						local104 = local156 & 0xFFF;
						@Pc(241) int local241 = local127 - 4096;
						@Pc(245) int local245 = InputStream_Sub1.anIntArray169[local192];
						@Pc(249) int local249 = InputStream_Sub1.anIntArray169[local127];
						@Pc(253) int local253 = InputStream_Sub1.anIntArray169[local104];
						@Pc(257) int local257 = local192 - 4096;
						@Pc(261) int local261 = local104 - 4096;
						@Pc(266) short local266 = this.aShortArray84[local184];
						@Pc(271) short local271 = this.aShortArray84[local188];
						@Pc(279) short local279 = this.aShortArray84[local176 + local271];
						@Pc(286) short local286 = this.aShortArray84[local266 + local176];
						@Pc(293) short local293 = this.aShortArray84[local266 + local180];
						@Pc(300) short local300 = this.aShortArray84[local271 + local180];
						@Pc(312) int local312 = Static396.method5614(local127, this.aShortArray84[local293 + local172], local192, local104);
						@Pc(325) int local325 = Static396.method5614(local127, this.aShortArray84[local164 + local293], local257, local104);
						@Pc(337) int local337 = local312 + ((local325 - local312) * local245 >> 12);
						@Pc(349) int local349 = Static396.method5614(local127, this.aShortArray84[local286 + local172], local192, local261);
						@Pc(361) int local361 = Static396.method5614(local127, this.aShortArray84[local286 + local164], local257, local261);
						@Pc(371) int local371 = ((local361 - local349) * local245 >> 12) + local349;
						@Pc(381) int local381 = local337 + ((local371 - local337) * local253 >> 12);
						@Pc(393) int local393 = Static396.method5614(local241, this.aShortArray84[local172 + local300], local192, local104);
						@Pc(405) int local405 = Static396.method5614(local241, this.aShortArray84[local300 + local164], local257, local104);
						@Pc(415) int local415 = (local245 * (local405 - local393) >> 12) + local393;
						@Pc(427) int local427 = Static396.method5614(local241, this.aShortArray84[local279 + local172], local192, local261);
						@Pc(439) int local439 = Static396.method5614(local241, this.aShortArray84[local279 + local164], local257, local261);
						@Pc(450) int local450 = (local245 * (local439 - local427) >> 12) + local427;
						@Pc(461) int local461 = (local253 * (local450 - local415) >> 12) + local415;
						this.method6626(((local461 - local381) * local249 >> 12) + local381, local87);
					}
					this.method6628();
				}
			}
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Z)V")
	protected abstract void method6625();

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(III)V")
	protected abstract void method6626(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)V")
	protected abstract void method6628();

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "(I)V")
	private void method6629() {
		@Pc(16) Random local16 = new Random((long) this.anInt7955);
		for (@Pc(18) int local18 = 0; local18 < 255; local18++) {
			this.aShortArray84[local18] = (short) local18;
		}
		for (@Pc(32) int local32 = 0; local32 < 255; local32++) {
			@Pc(39) int local39 = 255 - local32;
			@Pc(44) int local44 = Static521.method7113(local39, local16);
			@Pc(49) short local49 = this.aShortArray84[local44];
			this.aShortArray84[local44] = this.aShortArray84[local39];
			this.aShortArray84[local39] = this.aShortArray84[local39 + 256] = local49;
		}
	}

	@OriginalMember(owner = "client!cd", name = "c", descriptor = "(I)V")
	private void method6630() {
		this.aShortArray83 = new short[this.anInt7964];
		for (@Pc(12) int local12 = 0; local12 < this.anInt7964; local12++) {
			this.aShortArray83[local12] = (short) Math.pow(2.0D, (double) local12);
		}
	}
}

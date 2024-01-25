import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nt")
public abstract class Class39 {

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "[S")
	private short[] aShortArray260;

	@OriginalMember(owner = "client!nt", name = "g", descriptor = "I")
	private int anInt7961 = 4;

	@OriginalMember(owner = "client!nt", name = "d", descriptor = "[S")
	private final short[] aShortArray261 = new short[512];

	@OriginalMember(owner = "client!nt", name = "b", descriptor = "I")
	private int anInt7957 = 4;

	@OriginalMember(owner = "client!nt", name = "c", descriptor = "I")
	protected int anInt7958 = 4;

	@OriginalMember(owner = "client!nt", name = "j", descriptor = "I")
	private int anInt7964 = 4;

	@OriginalMember(owner = "client!nt", name = "i", descriptor = "I")
	private int anInt7963 = 0;

	@OriginalMember(owner = "client!nt", name = "<init>", descriptor = "(IIIII)V")
	protected Class39(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt7958 = arg1;
		this.anInt7964 = arg3;
		this.anInt7957 = arg4;
		this.anInt7963 = arg0;
		this.anInt7961 = arg2;
		this.method6745();
		this.method6747();
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(Z)V")
	protected abstract void method6742();

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(III)V")
	protected abstract void method6743(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!nt", name = "b", descriptor = "(Z)V")
	private void method6745() {
		this.aShortArray260 = new short[this.anInt7958];
		for (@Pc(18) int local18 = 0; local18 < this.anInt7958; local18++) {
			this.aShortArray260[local18] = (short) Math.pow(2.0D, (double) local18);
		}
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(IIZI)V")
	protected final void method6746() {
		@Pc(8) int[] local8 = new int[128];
		@Pc(11) int[] local11 = new int[128];
		for (@Pc(13) int local13 = 0; local13 < 128; local13++) {
			local8[local13] = (local13 << 12) / 128;
		}
		@Pc(34) int[] local34 = new int[16];
		for (@Pc(36) int local36 = 0; local36 < 128; local36++) {
			local11[local36] = (local36 << 12) / 128;
		}
		for (@Pc(52) int local52 = 0; local52 < 16; local52++) {
			local34[local52] = (local52 << 12) / 16;
		}
		this.method6742();
		for (@Pc(75) int local75 = 0; local75 < 16; local75++) {
			for (@Pc(79) int local79 = 0; local79 < 128; local79++) {
				for (@Pc(83) int local83 = 0; local83 < 128; local83++) {
					for (@Pc(87) int local87 = 0; local87 < this.anInt7958; local87++) {
						@Pc(96) int local96 = this.aShortArray260[local87] << 12;
						@Pc(104) int local104 = local96 * local8[local83] >> 12;
						@Pc(112) int local112 = local96 * local34[local75] >> 12;
						@Pc(119) int local119 = local96 * this.anInt7964 >> 12;
						@Pc(126) int local126 = this.anInt7957 * local96 >> 12;
						@Pc(134) int local134 = local11[local79] * local96 >> 12;
						@Pc(141) int local141 = this.anInt7961 * local96 >> 12;
						@Pc(146) int local146 = local134 * this.anInt7964;
						@Pc(151) int local151 = local104 * this.anInt7961;
						@Pc(156) int local156 = local112 * this.anInt7957;
						@Pc(160) int local160 = local151 >> 12;
						@Pc(164) int local164 = local160 + 1;
						@Pc(168) int local168 = local160 & 0xFF;
						@Pc(172) int local172 = local146 >> 12;
						@Pc(176) int local176 = local172 + 1;
						@Pc(180) int local180 = local172 & 0xFF;
						@Pc(184) int local184 = local156 >> 12;
						@Pc(188) int local188 = local184 + 1;
						@Pc(192) int local192 = local146 & 0xFFF;
						if (local188 >= local126) {
							local188 = 0;
						} else {
							local188 &= 0xFF;
						}
						local184 &= 0xFF;
						if (local119 <= local176) {
							local176 = 0;
						} else {
							local176 &= 0xFF;
						}
						local104 = local151 & 0xFFF;
						local112 = local156 & 0xFFF;
						if (local141 > local164) {
							local164 &= 0xFF;
						} else {
							local164 = 0;
						}
						@Pc(253) int local253 = Class341.anIntArray649[local104];
						@Pc(258) short local258 = this.aShortArray261[local188];
						@Pc(263) short local263 = this.aShortArray261[local184];
						@Pc(267) int local267 = Class341.anIntArray649[local112];
						@Pc(271) int local271 = local112 - 4096;
						@Pc(275) int local275 = local192 - 4096;
						@Pc(279) int local279 = local104 - 4096;
						@Pc(283) int local283 = Class341.anIntArray649[local192];
						@Pc(290) short local290 = this.aShortArray261[local180 + local258];
						@Pc(297) short local297 = this.aShortArray261[local176 + local263];
						@Pc(304) short local304 = this.aShortArray261[local180 + local263];
						@Pc(311) short local311 = this.aShortArray261[local258 + local176];
						@Pc(323) int local323 = Static77.method1713(this.aShortArray261[local304 + local168], local112, local192, local104);
						@Pc(335) int local335 = Static77.method1713(this.aShortArray261[local304 + local164], local112, local192, local279);
						@Pc(345) int local345 = (local253 * (local335 - local323) >> 12) + local323;
						@Pc(357) int local357 = Static77.method1713(this.aShortArray261[local297 + local168], local112, local275, local104);
						@Pc(369) int local369 = Static77.method1713(this.aShortArray261[local164 + local297], local112, local275, local279);
						@Pc(380) int local380 = local357 + ((local369 - local357) * local253 >> 12);
						@Pc(391) int local391 = ((local380 - local345) * local283 >> 12) + local345;
						@Pc(403) int local403 = Static77.method1713(this.aShortArray261[local290 + local168], local271, local192, local104);
						@Pc(415) int local415 = Static77.method1713(this.aShortArray261[local164 + local290], local271, local192, local279);
						@Pc(426) int local426 = (local253 * (local415 - local403) >> 12) + local403;
						@Pc(438) int local438 = Static77.method1713(this.aShortArray261[local311 + local168], local271, local275, local104);
						@Pc(450) int local450 = Static77.method1713(this.aShortArray261[local311 + local164], local271, local275, local279);
						@Pc(460) int local460 = ((local450 - local438) * local253 >> 12) + local438;
						@Pc(471) int local471 = (local283 * (local460 - local426) >> 12) + local426;
						this.method6743(local87, local391 + ((local471 - local391) * local267 >> 12));
					}
					this.method6748();
				}
			}
		}
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(B)V")
	private void method6747() {
		@Pc(12) Random local12 = new Random((long) this.anInt7963);
		for (@Pc(14) int local14 = 0; local14 < 255; local14++) {
			this.aShortArray261[local14] = (short) local14;
		}
		for (@Pc(30) int local30 = 0; local30 < 255; local30++) {
			@Pc(37) int local37 = 255 - local30;
			@Pc(42) int local42 = Static231.method3920(local12, local37);
			@Pc(47) short local47 = this.aShortArray261[local42];
			this.aShortArray261[local42] = this.aShortArray261[local37];
			this.aShortArray261[local37] = this.aShortArray261[local37 + 256] = local47;
		}
	}

	@OriginalMember(owner = "client!nt", name = "c", descriptor = "(Z)V")
	protected abstract void method6748();
}

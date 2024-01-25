import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hj")
public abstract class Class103 {

	@OriginalMember(owner = "client!hj", name = "j", descriptor = "[S")
	private short[] aShortArray117;

	@OriginalMember(owner = "client!hj", name = "h", descriptor = "[S")
	private final short[] aShortArray116 = new short[512];

	@OriginalMember(owner = "client!hj", name = "i", descriptor = "I")
	protected int anInt9369 = 4;

	@OriginalMember(owner = "client!hj", name = "g", descriptor = "I")
	private int anInt9368 = 4;

	@OriginalMember(owner = "client!hj", name = "m", descriptor = "I")
	private int anInt9372 = 4;

	@OriginalMember(owner = "client!hj", name = "r", descriptor = "I")
	private int anInt9375 = 0;

	@OriginalMember(owner = "client!hj", name = "l", descriptor = "I")
	private int anInt9371 = 4;

	@OriginalMember(owner = "client!hj", name = "<init>", descriptor = "(IIIII)V")
	protected Class103(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt9372 = arg3;
		this.anInt9371 = arg4;
		this.anInt9375 = arg0;
		this.anInt9369 = arg1;
		this.anInt9368 = arg2;
		this.method7636();
		this.method7635();
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(III)V")
	protected abstract void method7632(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(BIII)V")
	protected final void method7633() {
		@Pc(12) int[] local12 = new int[128];
		@Pc(15) int[] local15 = new int[128];
		for (@Pc(17) int local17 = 0; local17 < 128; local17++) {
			local12[local17] = (local17 << 12) / 128;
		}
		@Pc(38) int[] local38 = new int[16];
		for (@Pc(40) int local40 = 0; local40 < 128; local40++) {
			local15[local40] = (local40 << 12) / 128;
		}
		for (@Pc(56) int local56 = 0; local56 < 16; local56++) {
			local38[local56] = (local56 << 12) / 16;
		}
		this.method7637();
		for (@Pc(79) int local79 = 0; local79 < 16; local79++) {
			for (@Pc(83) int local83 = 0; local83 < 128; local83++) {
				for (@Pc(87) int local87 = 0; local87 < 128; local87++) {
					for (@Pc(91) int local91 = 0; local91 < this.anInt9369; local91++) {
						@Pc(100) int local100 = this.aShortArray117[local91] << 12;
						@Pc(108) int local108 = local15[local83] * local100 >> 12;
						@Pc(116) int local116 = local38[local79] * local100 >> 12;
						@Pc(123) int local123 = local100 * this.anInt9371 >> 12;
						@Pc(130) int local130 = this.anInt9372 * local100 >> 12;
						@Pc(138) int local138 = local100 * local12[local87] >> 12;
						@Pc(145) int local145 = local100 * this.anInt9368 >> 12;
						@Pc(150) int local150 = local116 * this.anInt9371;
						@Pc(155) int local155 = local108 * this.anInt9372;
						@Pc(160) int local160 = local138 * this.anInt9368;
						@Pc(164) int local164 = local160 >> 12;
						@Pc(168) int local168 = local164 + 1;
						@Pc(172) int local172 = local164 & 0xFF;
						@Pc(176) int local176 = local155 >> 12;
						@Pc(180) int local180 = local176 + 1;
						@Pc(184) int local184 = local176 & 0xFF;
						@Pc(188) int local188 = local150 >> 12;
						@Pc(192) int local192 = local188 + 1;
						@Pc(196) int local196 = local188 & 0xFF;
						@Pc(200) int local200 = local160 & 0xFFF;
						if (local192 < local123) {
							local192 &= 0xFF;
						} else {
							local192 = 0;
						}
						local116 = local150 & 0xFFF;
						local108 = local155 & 0xFFF;
						if (local180 < local130) {
							local180 &= 0xFF;
						} else {
							local180 = 0;
						}
						if (local145 <= local168) {
							local168 = 0;
						} else {
							local168 &= 0xFF;
						}
						@Pc(250) short local250 = this.aShortArray116[local192];
						@Pc(254) int local254 = Class8_Sub5_Sub19.anIntArray584[local200];
						@Pc(258) int local258 = local116 - 4096;
						@Pc(262) int local262 = local200 - 4096;
						@Pc(266) int local266 = Class8_Sub5_Sub19.anIntArray584[local108];
						@Pc(270) int local270 = local108 - 4096;
						@Pc(275) short local275 = this.aShortArray116[local196];
						@Pc(279) int local279 = Class8_Sub5_Sub19.anIntArray584[local116];
						@Pc(286) short local286 = this.aShortArray116[local180 + local275];
						@Pc(294) short local294 = this.aShortArray116[local184 + local275];
						@Pc(301) short local301 = this.aShortArray116[local250 + local180];
						@Pc(308) short local308 = this.aShortArray116[local250 + local184];
						@Pc(320) int local320 = Static311.method8380(this.aShortArray116[local294 + local172], local108, local200, local116);
						@Pc(332) int local332 = Static311.method8380(this.aShortArray116[local294 + local168], local108, local262, local116);
						@Pc(342) int local342 = local320 + (local254 * (local332 - local320) >> 12);
						@Pc(354) int local354 = Static311.method8380(this.aShortArray116[local286 + local172], local270, local200, local116);
						@Pc(367) int local367 = Static311.method8380(this.aShortArray116[local168 + local286], local270, local262, local116);
						@Pc(378) int local378 = ((local367 - local354) * local254 >> 12) + local354;
						@Pc(389) int local389 = (local266 * (local378 - local342) >> 12) + local342;
						@Pc(401) int local401 = Static311.method8380(this.aShortArray116[local172 + local308], local108, local200, local258);
						@Pc(413) int local413 = Static311.method8380(this.aShortArray116[local168 + local308], local108, local262, local258);
						@Pc(425) int local425 = local401 + ((local413 - local401) * local254 >> 12);
						@Pc(437) int local437 = Static311.method8380(this.aShortArray116[local301 + local172], local270, local200, local258);
						@Pc(450) int local450 = Static311.method8380(this.aShortArray116[local168 + local301], local270, local262, local258);
						@Pc(461) int local461 = local437 + ((local450 - local437) * local254 >> 12);
						@Pc(473) int local473 = local425 + (local266 * (local461 - local425) >> 12);
						this.method7632((local279 * (local473 - local389) >> 12) + local389, local91);
					}
					this.method7642();
				}
			}
		}
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(I)V")
	private void method7635() {
		@Pc(12) Random local12 = new Random((long) this.anInt9375);
		for (@Pc(18) int local18 = 0; local18 < 255; local18++) {
			this.aShortArray116[local18] = (short) local18;
		}
		for (@Pc(32) int local32 = 0; local32 < 255; local32++) {
			@Pc(39) int local39 = 255 - local32;
			@Pc(44) int local44 = Static221.method4149(local39, local12);
			@Pc(49) short local49 = this.aShortArray116[local44];
			this.aShortArray116[local44] = this.aShortArray116[local39];
			this.aShortArray116[local39] = this.aShortArray116[local39 + 256] = local49;
		}
	}

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "(I)V")
	private void method7636() {
		this.aShortArray117 = new short[this.anInt9369];
		for (@Pc(12) int local12 = 0; local12 < this.anInt9369; local12++) {
			this.aShortArray117[local12] = (short) Math.pow(2.0D, (double) local12);
		}
	}

	@OriginalMember(owner = "client!hj", name = "c", descriptor = "(I)V")
	protected abstract void method7637();

	@OriginalMember(owner = "client!hj", name = "d", descriptor = "(I)V")
	protected abstract void method7642();
}

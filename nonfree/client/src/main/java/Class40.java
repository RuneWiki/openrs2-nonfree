import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dt")
public abstract class Class40 {

	@OriginalMember(owner = "client!dt", name = "h", descriptor = "[S")
	private short[] aShortArray98;

	@OriginalMember(owner = "client!dt", name = "c", descriptor = "[S")
	private final short[] aShortArray97 = new short[512];

	@OriginalMember(owner = "client!dt", name = "j", descriptor = "I")
	private int anInt5864 = 0;

	@OriginalMember(owner = "client!dt", name = "i", descriptor = "I")
	private int anInt5863 = 4;

	@OriginalMember(owner = "client!dt", name = "m", descriptor = "I")
	private int anInt5867 = 4;

	@OriginalMember(owner = "client!dt", name = "n", descriptor = "I")
	protected int anInt5868 = 4;

	@OriginalMember(owner = "client!dt", name = "r", descriptor = "I")
	private int anInt5871 = 4;

	@OriginalMember(owner = "client!dt", name = "<init>", descriptor = "(IIIII)V")
	protected Class40(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt5864 = arg0;
		this.anInt5868 = arg1;
		this.anInt5871 = arg3;
		this.anInt5867 = arg4;
		this.anInt5863 = arg2;
		this.method5282();
		this.method5284();
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(IBI)V")
	protected abstract void method5278(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(B)V")
	protected abstract void method5280();

	@OriginalMember(owner = "client!dt", name = "c", descriptor = "(I)V")
	private void method5282() {
		this.aShortArray98 = new short[this.anInt5868];
		for (@Pc(16) int local16 = 0; local16 < this.anInt5868; local16++) {
			this.aShortArray98[local16] = (short) Math.pow(2.0D, (double) local16);
		}
	}

	@OriginalMember(owner = "client!dt", name = "d", descriptor = "(I)V")
	private void method5284() {
		@Pc(12) Random local12 = new Random((long) this.anInt5864);
		for (@Pc(14) int local14 = 0; local14 < 255; local14++) {
			this.aShortArray97[local14] = (short) local14;
		}
		for (@Pc(30) int local30 = 0; local30 < 255; local30++) {
			@Pc(37) int local37 = 255 - local30;
			@Pc(42) int local42 = Static297.method5193(local12, local37);
			@Pc(47) short local47 = this.aShortArray97[local42];
			this.aShortArray97[local42] = this.aShortArray97[local37];
			this.aShortArray97[local37] = this.aShortArray97[local37 + 256] = local47;
		}
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(Z)V")
	protected abstract void method5287();

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(IBII)V")
	protected final void method5288() {
		@Pc(12) int[] local12 = new int[128];
		@Pc(15) int[] local15 = new int[128];
		@Pc(18) int[] local18 = new int[16];
		for (@Pc(20) int local20 = 0; local20 < 128; local20++) {
			local12[local20] = (local20 << 12) / 128;
		}
		for (@Pc(36) int local36 = 0; local36 < 128; local36++) {
			local15[local36] = (local36 << 12) / 128;
		}
		for (@Pc(52) int local52 = 0; local52 < 16; local52++) {
			local18[local52] = (local52 << 12) / 16;
		}
		this.method5287();
		for (@Pc(71) int local71 = 0; local71 < 16; local71++) {
			for (@Pc(75) int local75 = 0; local75 < 128; local75++) {
				for (@Pc(79) int local79 = 0; local79 < 128; local79++) {
					for (@Pc(83) int local83 = 0; local83 < this.anInt5868; local83++) {
						@Pc(92) int local92 = this.aShortArray98[local83] << 12;
						@Pc(100) int local100 = local92 * local18[local71] >> 12;
						@Pc(108) int local108 = local15[local75] * local92 >> 12;
						@Pc(115) int local115 = this.anInt5871 * local92 >> 12;
						@Pc(122) int local122 = local92 * this.anInt5867 >> 12;
						@Pc(129) int local129 = local92 * this.anInt5863 >> 12;
						@Pc(137) int local137 = local92 * local12[local79] >> 12;
						@Pc(142) int local142 = local137 * this.anInt5863;
						@Pc(147) int local147 = local100 * this.anInt5867;
						@Pc(152) int local152 = local108 * this.anInt5871;
						@Pc(156) int local156 = local142 >> 12;
						@Pc(160) int local160 = local156 + 1;
						@Pc(164) int local164 = local152 >> 12;
						@Pc(168) int local168 = local156 & 0xFF;
						@Pc(172) int local172 = local164 + 1;
						@Pc(176) int local176 = local164 & 0xFF;
						@Pc(180) int local180 = local147 >> 12;
						@Pc(184) int local184 = local180 + 1;
						@Pc(188) int local188 = local142 & 0xFFF;
						@Pc(192) int local192 = local147 & 0xFFF;
						@Pc(196) int local196 = local152 & 0xFFF;
						if (local122 > local184) {
							local184 &= 0xFF;
						} else {
							local184 = 0;
						}
						local180 &= 0xFF;
						if (local115 <= local172) {
							local172 = 0;
						} else {
							local172 &= 0xFF;
						}
						if (local129 <= local160) {
							local160 = 0;
						} else {
							local160 &= 0xFF;
						}
						@Pc(249) int local249 = local188 - 4096;
						@Pc(254) short local254 = this.aShortArray97[local184];
						@Pc(258) int local258 = local196 - 4096;
						@Pc(262) int local262 = Class119.anIntArray271[local196];
						@Pc(266) int local266 = Class119.anIntArray271[local192];
						@Pc(270) int local270 = local192 - 4096;
						@Pc(275) short local275 = this.aShortArray97[local180];
						@Pc(279) int local279 = Class119.anIntArray271[local188];
						@Pc(286) short local286 = this.aShortArray97[local172 + local275];
						@Pc(293) short local293 = this.aShortArray97[local254 + local176];
						@Pc(300) short local300 = this.aShortArray97[local176 + local275];
						@Pc(308) short local308 = this.aShortArray97[local172 + local254];
						@Pc(320) int local320 = Static206.method4917(local196, this.aShortArray97[local300 + local168], local188, local192);
						@Pc(332) int local332 = Static206.method4917(local196, this.aShortArray97[local300 + local160], local249, local192);
						@Pc(343) int local343 = local320 + ((local332 - local320) * local279 >> 12);
						@Pc(356) int local356 = Static206.method4917(local258, this.aShortArray97[local168 + local286], local188, local192);
						@Pc(368) int local368 = Static206.method4917(local258, this.aShortArray97[local286 + local160], local249, local192);
						@Pc(379) int local379 = local356 + (local279 * (local368 - local356) >> 12);
						@Pc(390) int local390 = (local262 * (local379 - local343) >> 12) + local343;
						@Pc(402) int local402 = Static206.method4917(local196, this.aShortArray97[local168 + local293], local188, local270);
						@Pc(414) int local414 = Static206.method4917(local196, this.aShortArray97[local160 + local293], local249, local270);
						@Pc(424) int local424 = (local279 * (local414 - local402) >> 12) + local402;
						@Pc(436) int local436 = Static206.method4917(local258, this.aShortArray97[local308 + local168], local188, local270);
						@Pc(448) int local448 = Static206.method4917(local258, this.aShortArray97[local308 + local160], local249, local270);
						@Pc(459) int local459 = local436 + ((local448 - local436) * local279 >> 12);
						@Pc(470) int local470 = ((local459 - local424) * local262 >> 12) + local424;
						this.method5278(local83, (local266 * (local470 - local390) >> 12) + local390);
					}
					this.method5280();
				}
			}
		}
	}
}

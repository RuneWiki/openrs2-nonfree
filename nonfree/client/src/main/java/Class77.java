import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wg")
public abstract class Class77 {

	@OriginalMember(owner = "client!wg", name = "n", descriptor = "[S")
	private short[] aShortArray107;

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "I")
	private int anInt6539 = 4;

	@OriginalMember(owner = "client!wg", name = "g", descriptor = "I")
	protected int anInt6542 = 4;

	@OriginalMember(owner = "client!wg", name = "f", descriptor = "[S")
	private final short[] aShortArray106 = new short[512];

	@OriginalMember(owner = "client!wg", name = "k", descriptor = "I")
	private int anInt6545 = 4;

	@OriginalMember(owner = "client!wg", name = "e", descriptor = "I")
	private int anInt6541 = 0;

	@OriginalMember(owner = "client!wg", name = "o", descriptor = "I")
	private int anInt6548 = 4;

	static {
		new Class182("Loaded additional fonts", "Zusatzschriftarten geladen", "Polices secondaires chargées", "Fontes principais carregadas");
	}

	@OriginalMember(owner = "client!wg", name = "<init>", descriptor = "(IIIII)V")
	protected Class77(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt6548 = arg4;
		this.anInt6542 = arg1;
		this.anInt6541 = arg0;
		this.anInt6539 = arg2;
		this.anInt6545 = arg3;
		this.method5139();
		this.method5135();
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(I)V")
	private void method5135() {
		@Pc(16) Random local16 = new Random((long) this.anInt6541);
		for (@Pc(18) int local18 = 0; local18 < 255; local18++) {
			this.aShortArray106[local18] = (short) local18;
		}
		for (@Pc(32) int local32 = 0; local32 < 255; local32++) {
			@Pc(39) int local39 = 255 - local32;
			@Pc(46) int local46 = Static434.method5743(local16, local39);
			@Pc(51) short local51 = this.aShortArray106[local46];
			this.aShortArray106[local46] = this.aShortArray106[local39];
			this.aShortArray106[local39] = this.aShortArray106[local39 + 256] = local51;
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(B)V")
	protected abstract void method5136();

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(III)V")
	protected abstract void method5137(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(Z)V")
	private void method5139() {
		this.aShortArray107 = new short[this.anInt6542];
		for (@Pc(12) int local12 = 0; local12 < this.anInt6542; local12++) {
			this.aShortArray107[local12] = (short) Math.pow(2.0D, (double) local12);
		}
	}

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "(I)V")
	protected abstract void method5140();

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIII)V")
	protected final void method5142() {
		@Pc(8) int[] local8 = new int[128];
		@Pc(11) int[] local11 = new int[128];
		for (@Pc(13) int local13 = 0; local13 < 128; local13++) {
			local8[local13] = (local13 << 12) / 128;
		}
		@Pc(34) int[] local34 = new int[16];
		for (@Pc(36) int local36 = 0; local36 < 128; local36++) {
			local11[local36] = (local36 << 12) / 128;
		}
		for (@Pc(56) int local56 = 0; local56 < 16; local56++) {
			local34[local56] = (local56 << 12) / 16;
		}
		this.method5140();
		for (@Pc(79) int local79 = 0; local79 < 16; local79++) {
			for (@Pc(83) int local83 = 0; local83 < 128; local83++) {
				for (@Pc(87) int local87 = 0; local87 < 128; local87++) {
					for (@Pc(91) int local91 = 0; local91 < this.anInt6542; local91++) {
						@Pc(100) int local100 = this.aShortArray107[local91] << 12;
						@Pc(107) int local107 = local100 * this.anInt6545 >> 12;
						@Pc(114) int local114 = this.anInt6539 * local100 >> 12;
						@Pc(122) int local122 = local100 * local34[local79] >> 12;
						@Pc(129) int local129 = local100 * this.anInt6548 >> 12;
						@Pc(137) int local137 = local100 * local8[local87] >> 12;
						@Pc(145) int local145 = local100 * local11[local83] >> 12;
						@Pc(150) int local150 = local137 * this.anInt6539;
						@Pc(155) int local155 = local145 * this.anInt6545;
						@Pc(160) int local160 = local122 * this.anInt6548;
						@Pc(164) int local164 = local150 >> 12;
						@Pc(168) int local168 = local164 + 1;
						@Pc(172) int local172 = local164 & 0xFF;
						@Pc(176) int local176 = local155 >> 12;
						@Pc(180) int local180 = local176 + 1;
						@Pc(184) int local184 = local160 >> 12;
						@Pc(188) int local188 = local176 & 0xFF;
						@Pc(192) int local192 = local184 + 1;
						if (local114 > local168) {
							local168 &= 0xFF;
						} else {
							local168 = 0;
						}
						local145 = local155 & 0xFFF;
						local122 = local160 & 0xFFF;
						if (local180 < local107) {
							local180 &= 0xFF;
						} else {
							local180 = 0;
						}
						local137 = local150 & 0xFFF;
						if (local192 >= local129) {
							local192 = 0;
						} else {
							local192 &= 0xFF;
						}
						local184 &= 0xFF;
						@Pc(258) short local258 = this.aShortArray106[local184];
						@Pc(262) int local262 = local122 - 4096;
						@Pc(266) int local266 = local137 - 4096;
						@Pc(270) int local270 = Class10_Sub2.anIntArray748[local122];
						@Pc(274) int local274 = local145 - 4096;
						@Pc(278) int local278 = Class10_Sub2.anIntArray748[local145];
						@Pc(283) short local283 = this.aShortArray106[local192];
						@Pc(287) int local287 = Class10_Sub2.anIntArray748[local137];
						@Pc(294) short local294 = this.aShortArray106[local283 + local180];
						@Pc(301) short local301 = this.aShortArray106[local258 + local188];
						@Pc(308) short local308 = this.aShortArray106[local283 + local188];
						@Pc(315) short local315 = this.aShortArray106[local258 + local180];
						@Pc(330) int local330 = Static379.method908(this.aShortArray106[local172 + local301], local145, local137, local122);
						@Pc(342) int local342 = Static379.method908(this.aShortArray106[local168 + local301], local145, local266, local122);
						@Pc(353) int local353 = ((local342 - local330) * local287 >> 12) + local330;
						@Pc(365) int local365 = Static379.method908(this.aShortArray106[local172 + local315], local274, local137, local122);
						@Pc(377) int local377 = Static379.method908(this.aShortArray106[local315 + local168], local274, local266, local122);
						@Pc(387) int local387 = local365 + ((local377 - local365) * local287 >> 12);
						@Pc(398) int local398 = local353 + (local278 * (local387 - local353) >> 12);
						@Pc(412) int local412 = Static379.method908(this.aShortArray106[local308 + local172], local145, local137, local262);
						@Pc(424) int local424 = Static379.method908(this.aShortArray106[local308 + local168], local145, local266, local262);
						@Pc(436) int local436 = local412 + ((local424 - local412) * local287 >> 12);
						@Pc(450) int local450 = Static379.method908(this.aShortArray106[local172 + local294], local274, local137, local262);
						@Pc(462) int local462 = Static379.method908(this.aShortArray106[local294 + local168], local274, local266, local262);
						@Pc(473) int local473 = local450 + ((local462 - local450) * local287 >> 12);
						@Pc(484) int local484 = local436 + ((local473 - local436) * local278 >> 12);
						this.method5137((local270 * (local484 - local398) >> 12) + local398, local91);
					}
					this.method5136();
				}
			}
		}
	}
}

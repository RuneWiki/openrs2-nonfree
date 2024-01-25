import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jn")
public abstract class Class148 {

	@OriginalMember(owner = "client!jn", name = "d", descriptor = "[S")
	private short[] aShortArray172;

	@OriginalMember(owner = "client!jn", name = "c", descriptor = "I")
	protected int anInt9349 = 4;

	@OriginalMember(owner = "client!jn", name = "h", descriptor = "I")
	private int anInt9353 = 0;

	@OriginalMember(owner = "client!jn", name = "e", descriptor = "I")
	private int anInt9350 = 4;

	@OriginalMember(owner = "client!jn", name = "j", descriptor = "I")
	private int anInt9355 = 4;

	@OriginalMember(owner = "client!jn", name = "i", descriptor = "I")
	private int anInt9354 = 4;

	@OriginalMember(owner = "client!jn", name = "l", descriptor = "[S")
	private final short[] aShortArray173 = new short[512];

	@OriginalMember(owner = "client!jn", name = "<init>", descriptor = "(IIIII)V")
	protected Class148(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt9350 = arg2;
		this.anInt9349 = arg1;
		this.anInt9355 = arg3;
		this.anInt9354 = arg4;
		this.anInt9353 = arg0;
		this.method7951();
		this.method7948();
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(Z)V")
	protected abstract void method7944();

	@OriginalMember(owner = "client!jn", name = "b", descriptor = "(Z)V")
	protected abstract void method7946();

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(IIB)V")
	protected abstract void method7947(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!jn", name = "b", descriptor = "(B)V")
	private void method7948() {
		@Pc(12) Random local12 = new Random((long) this.anInt9353);
		for (@Pc(14) int local14 = 0; local14 < 255; local14++) {
			this.aShortArray173[local14] = (short) local14;
		}
		for (@Pc(38) int local38 = 0; local38 < 255; local38++) {
			@Pc(45) int local45 = 255 - local38;
			@Pc(50) int local50 = Static610.method8052(local45, local12);
			@Pc(55) short local55 = this.aShortArray173[local50];
			this.aShortArray173[local50] = this.aShortArray173[local45];
			this.aShortArray173[local45] = this.aShortArray173[local45 + 256] = local55;
		}
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(IIII)V")
	protected final void method7949() {
		@Pc(16) int[] local16 = new int[128];
		@Pc(19) int[] local19 = new int[128];
		@Pc(22) int[] local22 = new int[16];
		for (@Pc(24) int local24 = 0; local24 < 128; local24++) {
			local16[local24] = (local24 << 12) / 128;
		}
		for (@Pc(40) int local40 = 0; local40 < 128; local40++) {
			local19[local40] = (local40 << 12) / 128;
		}
		for (@Pc(56) int local56 = 0; local56 < 16; local56++) {
			local22[local56] = (local56 << 12) / 16;
		}
		this.method7944();
		for (@Pc(79) int local79 = 0; local79 < 16; local79++) {
			for (@Pc(83) int local83 = 0; local83 < 128; local83++) {
				for (@Pc(87) int local87 = 0; local87 < 128; local87++) {
					for (@Pc(91) int local91 = 0; local91 < this.anInt9349; local91++) {
						@Pc(100) int local100 = this.aShortArray172[local91] << 12;
						@Pc(107) int local107 = local100 * this.anInt9354 >> 12;
						@Pc(115) int local115 = local19[local83] * local100 >> 12;
						@Pc(122) int local122 = local100 * this.anInt9350 >> 12;
						@Pc(129) int local129 = this.anInt9355 * local100 >> 12;
						@Pc(137) int local137 = local100 * local16[local87] >> 12;
						@Pc(145) int local145 = local100 * local22[local79] >> 12;
						@Pc(150) int local150 = local115 * this.anInt9355;
						@Pc(155) int local155 = local145 * this.anInt9354;
						@Pc(160) int local160 = local137 * this.anInt9350;
						@Pc(164) int local164 = local160 >> 12;
						@Pc(168) int local168 = local164 + 1;
						@Pc(172) int local172 = local164 & 0xFF;
						@Pc(176) int local176 = local150 >> 12;
						@Pc(180) int local180 = local176 + 1;
						@Pc(184) int local184 = local176 & 0xFF;
						@Pc(188) int local188 = local155 >> 12;
						@Pc(192) int local192 = local188 + 1;
						@Pc(196) int local196 = local155 & 0xFFF;
						if (local192 < local107) {
							local192 &= 0xFF;
						} else {
							local192 = 0;
						}
						if (local122 <= local168) {
							local168 = 0;
						} else {
							local168 &= 0xFF;
						}
						local188 &= 0xFF;
						local115 = local150 & 0xFFF;
						local137 = local160 & 0xFFF;
						if (local180 >= local129) {
							local180 = 0;
						} else {
							local180 &= 0xFF;
						}
						@Pc(245) int local245 = local115 - 4096;
						@Pc(249) int local249 = Class3_Sub2_Sub26.anIntArray476[local115];
						@Pc(253) int local253 = Class3_Sub2_Sub26.anIntArray476[local196];
						@Pc(258) short local258 = this.aShortArray173[local192];
						@Pc(262) int local262 = Class3_Sub2_Sub26.anIntArray476[local137];
						@Pc(266) int local266 = local137 - 4096;
						@Pc(271) short local271 = this.aShortArray173[local188];
						@Pc(275) int local275 = local196 - 4096;
						@Pc(282) short local282 = this.aShortArray173[local258 + local180];
						@Pc(290) short local290 = this.aShortArray173[local184 + local258];
						@Pc(297) short local297 = this.aShortArray173[local271 + local180];
						@Pc(304) short local304 = this.aShortArray173[local271 + local184];
						@Pc(316) int local316 = Static44.method1233(local115, local196, local137, this.aShortArray173[local172 + local304]);
						@Pc(328) int local328 = Static44.method1233(local115, local196, local266, this.aShortArray173[local168 + local304]);
						@Pc(340) int local340 = local316 + (local262 * (local328 - local316) >> 12);
						@Pc(352) int local352 = Static44.method1233(local245, local196, local137, this.aShortArray173[local297 + local172]);
						@Pc(364) int local364 = Static44.method1233(local245, local196, local266, this.aShortArray173[local168 + local297]);
						@Pc(375) int local375 = local352 + (local262 * (local364 - local352) >> 12);
						@Pc(386) int local386 = (local249 * (local375 - local340) >> 12) + local340;
						@Pc(398) int local398 = Static44.method1233(local115, local275, local137, this.aShortArray173[local172 + local290]);
						@Pc(410) int local410 = Static44.method1233(local115, local275, local266, this.aShortArray173[local168 + local290]);
						@Pc(422) int local422 = local398 + (local262 * (local410 - local398) >> 12);
						@Pc(434) int local434 = Static44.method1233(local245, local275, local137, this.aShortArray173[local172 + local282]);
						@Pc(446) int local446 = Static44.method1233(local245, local275, local266, this.aShortArray173[local168 + local282]);
						@Pc(457) int local457 = ((local446 - local434) * local262 >> 12) + local434;
						@Pc(468) int local468 = local422 + ((local457 - local422) * local249 >> 12);
						this.method7947(local91, local386 + ((local468 - local386) * local253 >> 12));
					}
					this.method7946();
				}
			}
		}
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(I)V")
	private void method7951() {
		this.aShortArray172 = new short[this.anInt9349];
		for (@Pc(16) int local16 = 0; local16 < this.anInt9349; local16++) {
			this.aShortArray172[local16] = (short) (int) Math.pow(2.0D, (double) local16);
		}
	}
}

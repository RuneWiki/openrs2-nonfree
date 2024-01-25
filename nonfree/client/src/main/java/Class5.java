import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hn")
public abstract class Class5 {

	@OriginalMember(owner = "client!hn", name = "g", descriptor = "[S")
	private short[] aShortArray106;

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "I")
	protected int anInt6243 = 4;

	@OriginalMember(owner = "client!hn", name = "c", descriptor = "I")
	private int anInt6245 = 0;

	@OriginalMember(owner = "client!hn", name = "b", descriptor = "I")
	private int anInt6244 = 4;

	@OriginalMember(owner = "client!hn", name = "e", descriptor = "[S")
	private final short[] aShortArray105 = new short[512];

	@OriginalMember(owner = "client!hn", name = "i", descriptor = "I")
	private int anInt6248 = 4;

	@OriginalMember(owner = "client!hn", name = "l", descriptor = "I")
	private int anInt6251 = 4;

	@OriginalMember(owner = "client!hn", name = "<init>", descriptor = "(IIIII)V")
	protected Class5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt6245 = arg0;
		this.anInt6243 = arg1;
		this.anInt6248 = arg3;
		this.anInt6251 = arg2;
		this.anInt6244 = arg4;
		this.method5022();
		this.method5026();
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(I)V")
	protected abstract void method5021();

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(B)V")
	private void method5022() {
		this.aShortArray106 = new short[this.anInt6243];
		for (@Pc(18) int local18 = 0; local18 < this.anInt6243; local18++) {
			this.aShortArray106[local18] = (short) Math.pow(2.0D, (double) local18);
		}
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(IIB)V")
	protected abstract void method5023(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!hn", name = "c", descriptor = "(I)V")
	private void method5026() {
		@Pc(12) Random local12 = new Random((long) this.anInt6245);
		for (@Pc(14) int local14 = 0; local14 < 255; local14++) {
			this.aShortArray105[local14] = (short) local14;
		}
		for (@Pc(34) int local34 = 0; local34 < 255; local34++) {
			@Pc(40) int local40 = 255 - local34;
			@Pc(45) int local45 = Static87.method4324(local40, local12);
			@Pc(50) short local50 = this.aShortArray105[local45];
			this.aShortArray105[local45] = this.aShortArray105[local40];
			this.aShortArray105[local40] = this.aShortArray105[local40 + 256] = local50;
		}
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(IIII)V")
	protected final void method5028() {
		@Pc(8) int[] local8 = new int[128];
		@Pc(11) int[] local11 = new int[128];
		for (@Pc(13) int local13 = 0; local13 < 128; local13++) {
			local8[local13] = (local13 << 12) / 128;
		}
		@Pc(30) int[] local30 = new int[16];
		for (@Pc(32) int local32 = 0; local32 < 128; local32++) {
			local11[local32] = (local32 << 12) / 128;
		}
		for (@Pc(52) int local52 = 0; local52 < 16; local52++) {
			local30[local52] = (local52 << 12) / 16;
		}
		this.method5021();
		for (@Pc(71) int local71 = 0; local71 < 16; local71++) {
			for (@Pc(75) int local75 = 0; local75 < 128; local75++) {
				for (@Pc(79) int local79 = 0; local79 < 128; local79++) {
					for (@Pc(83) int local83 = 0; local83 < this.anInt6243; local83++) {
						@Pc(92) int local92 = this.aShortArray106[local83] << 12;
						@Pc(99) int local99 = this.anInt6244 * local92 >> 12;
						@Pc(107) int local107 = local30[local71] * local92 >> 12;
						@Pc(115) int local115 = local8[local79] * local92 >> 12;
						@Pc(123) int local123 = local92 * local11[local75] >> 12;
						@Pc(130) int local130 = local92 * this.anInt6248 >> 12;
						@Pc(137) int local137 = local92 * this.anInt6251 >> 12;
						@Pc(142) int local142 = local107 * this.anInt6244;
						@Pc(147) int local147 = local123 * this.anInt6248;
						@Pc(152) int local152 = local115 * this.anInt6251;
						@Pc(156) int local156 = local152 >> 12;
						@Pc(160) int local160 = local156 + 1;
						@Pc(164) int local164 = local156 & 0xFF;
						@Pc(168) int local168 = local147 >> 12;
						@Pc(172) int local172 = local168 + 1;
						@Pc(176) int local176 = local142 >> 12;
						@Pc(180) int local180 = local168 & 0xFF;
						@Pc(184) int local184 = local176 + 1;
						if (local137 > local160) {
							local160 &= 0xFF;
						} else {
							local160 = 0;
						}
						local107 = local142 & 0xFFF;
						local115 = local152 & 0xFFF;
						if (local172 >= local130) {
							local172 = 0;
						} else {
							local172 &= 0xFF;
						}
						local176 &= 0xFF;
						local123 = local147 & 0xFFF;
						if (local184 >= local99) {
							local184 = 0;
						} else {
							local184 &= 0xFF;
						}
						@Pc(245) int local245 = Class83_Sub2_Sub1.anIntArray514[local107];
						@Pc(249) int local249 = Class83_Sub2_Sub1.anIntArray514[local115];
						@Pc(253) int local253 = local115 - 4096;
						@Pc(258) short local258 = this.aShortArray105[local184];
						@Pc(262) int local262 = local107 - 4096;
						@Pc(266) int local266 = local123 - 4096;
						@Pc(271) short local271 = this.aShortArray105[local176];
						@Pc(275) int local275 = Class83_Sub2_Sub1.anIntArray514[local123];
						@Pc(282) short local282 = this.aShortArray105[local258 + local172];
						@Pc(289) short local289 = this.aShortArray105[local271 + local172];
						@Pc(296) short local296 = this.aShortArray105[local271 + local180];
						@Pc(303) short local303 = this.aShortArray105[local180 + local258];
						@Pc(318) int local318 = Static444.method4106(local115, local107, this.aShortArray105[local164 + local296], local123);
						@Pc(331) int local331 = Static444.method4106(local253, local107, this.aShortArray105[local160 + local296], local123);
						@Pc(342) int local342 = (local249 * (local331 - local318) >> 12) + local318;
						@Pc(354) int local354 = Static444.method4106(local115, local107, this.aShortArray105[local289 + local164], local266);
						@Pc(368) int local368 = Static444.method4106(local253, local107, this.aShortArray105[local160 + local289], local266);
						@Pc(379) int local379 = local354 + ((local368 - local354) * local249 >> 12);
						@Pc(392) int local392 = Static444.method4106(local115, local262, this.aShortArray105[local164 + local303], local123);
						@Pc(402) int local402 = local342 + (local275 * (local379 - local342) >> 12);
						@Pc(414) int local414 = Static444.method4106(local253, local262, this.aShortArray105[local303 + local160], local123);
						@Pc(425) int local425 = ((local414 - local392) * local249 >> 12) + local392;
						@Pc(438) int local438 = Static444.method4106(local115, local262, this.aShortArray105[local164 + local282], local266);
						@Pc(450) int local450 = Static444.method4106(local253, local262, this.aShortArray105[local282 + local160], local266);
						@Pc(460) int local460 = ((local450 - local438) * local249 >> 12) + local438;
						@Pc(471) int local471 = ((local460 - local425) * local275 >> 12) + local425;
						this.method5023(local83, local402 + ((local471 - local402) * local245 >> 12));
					}
					this.method5029();
				}
			}
		}
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(Z)V")
	protected abstract void method5029();
}

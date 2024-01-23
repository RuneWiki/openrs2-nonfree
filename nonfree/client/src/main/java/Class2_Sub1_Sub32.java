import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pm")
public final class Class2_Sub1_Sub32 extends Class2_Sub1 {

	@OriginalMember(owner = "client!pm", name = "K", descriptor = "I")
	private int anInt4503;

	@OriginalMember(owner = "client!pm", name = "Q", descriptor = "I")
	private int anInt4509;

	@OriginalMember(owner = "client!pm", name = "V", descriptor = "I")
	private int anInt4512;

	@OriginalMember(owner = "client!pm", name = "X", descriptor = "I")
	private int anInt4514;

	@OriginalMember(owner = "client!pm", name = "Y", descriptor = "I")
	private int anInt4515;

	@OriginalMember(owner = "client!pm", name = "ab", descriptor = "I")
	private int anInt4517;

	@OriginalMember(owner = "client!pm", name = "N", descriptor = "I")
	private int anInt4506 = 0;

	@OriginalMember(owner = "client!pm", name = "Z", descriptor = "I")
	private int anInt4516 = 0;

	@OriginalMember(owner = "client!pm", name = "P", descriptor = "I")
	private int anInt4508 = 0;

	@OriginalMember(owner = "client!pm", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub32() {
		super(1, false);
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(IBII)V")
	private void method3664(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(23) int local23 = arg0 < arg1 ? arg0 : arg1;
		@Pc(34) int local34 = arg0 <= arg1 ? arg1 : arg0;
		@Pc(45) int local45 = arg2 < local23 ? arg2 : local23;
		@Pc(56) int local56 = arg2 > local34 ? arg2 : local34;
		this.anInt4512 = (local56 + local45) / 2;
		@Pc(68) int local68 = local56 - local45;
		if (local68 > 0) {
			@Pc(79) int local79 = (local56 - arg0 << 12) / local68;
			@Pc(88) int local88 = (local56 - arg1 << 12) / local68;
			@Pc(97) int local97 = (local56 - arg2 << 12) / local68;
			if (arg0 == local56) {
				this.anInt4515 = arg1 == local45 ? local97 + 20480 : -local88 + 4096;
			} else if (local56 == arg1) {
				this.anInt4515 = arg2 == local45 ? local79 + 4096 : -local97 + 12288;
			} else {
				this.anInt4515 = arg0 == local45 ? local88 + 12288 : -local79 + 20480;
			}
			this.anInt4515 /= 6;
		} else {
			this.anInt4515 = 0;
		}
		if (this.anInt4512 > 0 && this.anInt4512 < 4096) {
			this.anInt4514 = (local68 << 12) / (this.anInt4512 <= 2048 ? this.anInt4512 * 2 : 8192 - this.anInt4512 * 2);
		} else {
			this.anInt4514 = 0;
		}
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(Lclient!oe;IB)V")
	@Override
	public void method4594(@OriginalArg(0) Class2_Sub16 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt4506 = arg0.method2191();
		} else if (arg1 == 1) {
			this.anInt4516 = (arg0.method2170() << 12) / 100;
		} else if (arg1 == 2) {
			this.anInt4508 = (arg0.method2170() << 12) / 100;
		}
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method4586(@OriginalArg(0) int arg0) {
		@Pc(13) int[][] local13 = this.aClass25_41.method652(arg0);
		if (this.aClass25_41.aBoolean53) {
			@Pc(24) int[][] local24 = this.method4600(arg0, 0);
			@Pc(28) int[] local28 = local24[0];
			@Pc(32) int[] local32 = local24[2];
			@Pc(36) int[] local36 = local13[0];
			@Pc(40) int[] local40 = local24[1];
			@Pc(44) int[] local44 = local13[2];
			@Pc(48) int[] local48 = local13[1];
			for (@Pc(50) int local50 = 0; local50 < Static281.anInt5558; local50++) {
				this.method3664(local28[local50], local40[local50], local32[local50]);
				this.anInt4515 += this.anInt4506;
				this.anInt4514 += this.anInt4516;
				this.anInt4512 += this.anInt4508;
				if (this.anInt4514 < 0) {
					this.anInt4514 = 0;
				}
				if (this.anInt4514 > 4096) {
					this.anInt4514 = 4096;
				}
				while (this.anInt4515 < 0) {
					this.anInt4515 += 4096;
				}
				if (this.anInt4512 < 0) {
					this.anInt4512 = 0;
				}
				while (this.anInt4515 > 4096) {
					this.anInt4515 -= 4096;
				}
				if (this.anInt4512 > 4096) {
					this.anInt4512 = 4096;
				}
				this.method3669(this.anInt4514, this.anInt4512, this.anInt4515);
				local36[local50] = this.anInt4509;
				local48[local50] = this.anInt4517;
				local44[local50] = this.anInt4503;
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!pm", name = "b", descriptor = "(IIBI)V")
	private void method3669(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(28) int local28 = arg1 > 2048 ? arg1 + arg0 - (arg1 * arg0 >> 12) : (arg0 + 4096) * arg1 >> 12;
		if (local28 <= 0) {
			this.anInt4509 = this.anInt4517 = this.anInt4503 = arg1;
			return;
		}
		@Pc(49) int local49 = arg1 + arg1 - local28;
		@Pc(53) int local53 = arg2 * 6;
		@Pc(62) int local62 = (local28 - local49 << 12) / local28;
		@Pc(66) int local66 = local53 >> 12;
		@Pc(73) int local73 = local53 - (local66 << 12);
		@Pc(81) int local81 = local28 * local62 >> 12;
		@Pc(87) int local87 = local73 * local81 >> 12;
		@Pc(91) int local91 = local49 + local87;
		@Pc(95) int local95 = local28 - local87;
		if (local66 == 0) {
			this.anInt4509 = local28;
			this.anInt4503 = local49;
			this.anInt4517 = local91;
		} else if (local66 == 1) {
			this.anInt4509 = local95;
			this.anInt4503 = local49;
			this.anInt4517 = local28;
		} else if (local66 == 2) {
			this.anInt4509 = local49;
			this.anInt4503 = local91;
			this.anInt4517 = local28;
		} else if (local66 == 3) {
			this.anInt4509 = local49;
			this.anInt4503 = local28;
			this.anInt4517 = local95;
		} else if (local66 == 4) {
			this.anInt4517 = local49;
			this.anInt4509 = local91;
			this.anInt4503 = local28;
		} else if (local66 == 5) {
			this.anInt4517 = local49;
			this.anInt4509 = local28;
			this.anInt4503 = local95;
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!so")
public final class Class7_Sub3_Sub30 extends Class7_Sub3 {

	@OriginalMember(owner = "client!so", name = "R", descriptor = "I")
	private int anInt5941 = 2048;

	@OriginalMember(owner = "client!so", name = "P", descriptor = "I")
	private int anInt5939 = 12288;

	@OriginalMember(owner = "client!so", name = "F", descriptor = "I")
	private int anInt5932 = 0;

	@OriginalMember(owner = "client!so", name = "K", descriptor = "I")
	private int anInt5936 = 8192;

	@OriginalMember(owner = "client!so", name = "E", descriptor = "I")
	private int anInt5931 = 4096;

	@OriginalMember(owner = "client!so", name = "M", descriptor = "I")
	private int anInt5937 = 2048;

	@OriginalMember(owner = "client!so", name = "Q", descriptor = "I")
	private int anInt5940 = 0;

	@OriginalMember(owner = "client!so", name = "<init>", descriptor = "()V")
	public Class7_Sub3_Sub30() {
		super(0, true);
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(BII)Z")
	private boolean method4755(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = (arg0 - arg1) * this.anInt5939 >> 12;
		@Pc(23) int local23 = Static54.anIntArray80[local13 * 255 >> 12 & 0xFF];
		@Pc(30) int local30 = (local23 << 12) / this.anInt5939;
		@Pc(42) int local42 = (local30 << 12) / this.anInt5936;
		@Pc(49) int local49 = this.anInt5931 * local42 >> 12;
		return local49 > arg1 + arg0 && -local49 < arg1 + arg0;
	}

	@OriginalMember(owner = "client!so", name = "c", descriptor = "(B)V")
	@Override
	public void method5593() {
		Static371.method4759();
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(IZLclient!gk;)V")
	@Override
	public void method5599(@OriginalArg(0) int arg0, @OriginalArg(2) Class7_Sub14 arg1) {
		if (arg0 == 0) {
			this.anInt5937 = arg1.method3943();
		} else if (arg0 == 1) {
			this.anInt5932 = arg1.method3943();
		} else if (arg0 == 2) {
			this.anInt5940 = arg1.method3943();
		} else if (arg0 == 3) {
			this.anInt5941 = arg1.method3943();
		} else if (arg0 == 4) {
			this.anInt5939 = arg1.method3943();
		} else if (arg0 == 5) {
			this.anInt5931 = arg1.method3943();
		} else if (arg0 == 6) {
			this.anInt5936 = arg1.method3943();
		}
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method5594(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass113_41.method2456(arg0);
		if (super.aClass113_41.aBoolean181) {
			@Pc(26) int local26 = Static203.anIntArray322[arg0] - 2048;
			for (@Pc(28) int local28 = 0; local28 < Static58.anInt1052; local28++) {
				@Pc(36) int local36 = Static185.anIntArray298[local28] - 2048;
				@Pc(41) int local41 = this.anInt5937 + local36;
				@Pc(52) int local52 = local41 < -2048 ? local41 + 4096 : local41;
				@Pc(63) int local63 = local52 > 2048 ? local52 - 4096 : local52;
				@Pc(68) int local68 = this.anInt5932 + local26;
				@Pc(77) int local77 = local68 < -2048 ? local68 + 4096 : local68;
				@Pc(88) int local88 = local77 <= 2048 ? local77 : local77 - 4096;
				@Pc(94) int local94 = local36 + this.anInt5940;
				@Pc(105) int local105 = local94 >= -2048 ? local94 : local94 + 4096;
				@Pc(116) int local116 = local105 <= 2048 ? local105 : local105 - 4096;
				@Pc(121) int local121 = this.anInt5941 + local26;
				@Pc(130) int local130 = local121 < -2048 ? local121 + 4096 : local121;
				@Pc(141) int local141 = local130 > 2048 ? local130 - 4096 : local130;
				local16[local28] = this.method4755(local88, local63) || this.method4758(local141, local116) ? 4096 : 0;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!so", name = "c", descriptor = "(III)Z")
	private boolean method4758(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = this.anInt5939 * (arg0 + arg1) >> 12;
		@Pc(29) int local29 = Static54.anIntArray80[local13 * 255 >> 12 & 0xFF];
		@Pc(36) int local36 = (local29 << 12) / this.anInt5939;
		@Pc(43) int local43 = (local36 << 12) / this.anInt5936;
		@Pc(50) int local50 = this.anInt5931 * local43 >> 12;
		return arg0 - arg1 < local50 && -local50 < arg0 - arg1;
	}
}

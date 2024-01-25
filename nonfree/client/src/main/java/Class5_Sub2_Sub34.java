import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uha")
public final class Class5_Sub2_Sub34 extends Class5_Sub2 {

	@OriginalMember(owner = "client!uha", name = "H", descriptor = "I")
	private int anInt9863;

	@OriginalMember(owner = "client!uha", name = "M", descriptor = "I")
	private int anInt9867;

	@OriginalMember(owner = "client!uha", name = "O", descriptor = "I")
	private int anInt9868;

	@OriginalMember(owner = "client!uha", name = "P", descriptor = "I")
	private int anInt9869;

	@OriginalMember(owner = "client!uha", name = "U", descriptor = "I")
	private int anInt9872;

	@OriginalMember(owner = "client!uha", name = "W", descriptor = "I")
	private int anInt9874;

	@OriginalMember(owner = "client!uha", name = "K", descriptor = "I")
	private int anInt9865 = 0;

	@OriginalMember(owner = "client!uha", name = "G", descriptor = "I")
	private int anInt9862 = 0;

	@OriginalMember(owner = "client!uha", name = "V", descriptor = "I")
	private int anInt9873 = 0;

	@OriginalMember(owner = "client!uha", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub34() {
		super(1, false);
	}

	@OriginalMember(owner = "client!uha", name = "a", descriptor = "(IIII)V")
	private void method8225(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = arg1 <= arg2 ? arg2 : arg1;
		@Pc(32) int local32 = arg0 <= local12 ? local12 : arg0;
		@Pc(43) int local43 = arg2 > arg1 ? arg1 : arg2;
		@Pc(54) int local54 = local43 <= arg0 ? local43 : arg0;
		this.anInt9867 = (local54 + local32) / 2;
		@Pc(66) int local66 = local32 - local54;
		if (local66 > 0) {
			@Pc(77) int local77 = (local32 - arg1 << 12) / local66;
			@Pc(86) int local86 = (local32 - arg2 << 12) / local66;
			@Pc(95) int local95 = (local32 - arg0 << 12) / local66;
			if (arg1 == local32) {
				this.anInt9869 = local54 == arg2 ? local95 + 20480 : 4096 - local86;
			} else if (arg2 == local32) {
				this.anInt9869 = local54 == arg0 ? local77 + 4096 : -local95 + 12288;
			} else {
				this.anInt9869 = arg1 == local54 ? local86 + 12288 : 20480 - local77;
			}
			this.anInt9869 /= 6;
		} else {
			this.anInt9869 = 0;
		}
		if (this.anInt9867 > 0 && this.anInt9867 < 4096) {
			this.anInt9868 = (local66 << 12) / (this.anInt9867 > 2048 ? 8192 - (this.anInt9867 * 2) : this.anInt9867 * 2);
		} else {
			this.anInt9868 = 0;
		}
	}

	@OriginalMember(owner = "client!uha", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method8943(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass180_41.method4548(arg0);
		if (super.aClass180_41.aBoolean464) {
			@Pc(26) int[][] local26 = this.method8952(0, arg0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local16[0];
			@Pc(46) int[] local46 = local16[1];
			@Pc(50) int[] local50 = local16[2];
			for (@Pc(52) int local52 = 0; local52 < Static195.anInt3759; local52++) {
				this.method8225(local38[local52], local30[local52], local34[local52]);
				this.anInt9869 += this.anInt9862;
				this.anInt9867 += this.anInt9865;
				this.anInt9868 += this.anInt9873;
				while (this.anInt9869 < 0) {
					this.anInt9869 += 4096;
				}
				if (this.anInt9868 < 0) {
					this.anInt9868 = 0;
				}
				while (this.anInt9869 > 4096) {
					this.anInt9869 -= 4096;
				}
				if (this.anInt9867 < 0) {
					this.anInt9867 = 0;
				}
				if (this.anInt9868 > 4096) {
					this.anInt9868 = 4096;
				}
				if (this.anInt9867 > 4096) {
					this.anInt9867 = 4096;
				}
				this.method8226(this.anInt9869, this.anInt9868, this.anInt9867);
				local42[local52] = this.anInt9872;
				local46[local52] = this.anInt9874;
				local50[local52] = this.anInt9863;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!uha", name = "a", descriptor = "(IBII)V")
	private void method8226(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(30) int local30 = arg2 <= 2048 ? arg2 * (arg1 + 4096) >> 12 : arg2 + arg1 - (arg2 * arg1 >> 12);
		if (local30 <= 0) {
			this.anInt9872 = this.anInt9874 = this.anInt9863 = arg2;
			return;
		}
		@Pc(49) int local49 = arg0 * 6;
		@Pc(56) int local56 = arg2 + arg2 - local30;
		@Pc(65) int local65 = (local30 - local56 << 12) / local30;
		@Pc(69) int local69 = local49 >> 12;
		@Pc(75) int local75 = local49 - (local69 << 12);
		@Pc(83) int local83 = local65 * local30 >> 12;
		@Pc(89) int local89 = local75 * local83 >> 12;
		@Pc(93) int local93 = local89 + local56;
		@Pc(98) int local98 = local30 - local89;
		if (local69 == 0) {
			this.anInt9872 = local30;
			this.anInt9863 = local56;
			this.anInt9874 = local93;
		} else if (local69 == 1) {
			this.anInt9863 = local56;
			this.anInt9874 = local30;
			this.anInt9872 = local98;
		} else if (local69 == 2) {
			this.anInt9872 = local56;
			this.anInt9863 = local93;
			this.anInt9874 = local30;
		} else if (local69 == 3) {
			this.anInt9872 = local56;
			this.anInt9863 = local30;
			this.anInt9874 = local98;
		} else if (local69 == 4) {
			this.anInt9863 = local30;
			this.anInt9872 = local93;
			this.anInt9874 = local56;
		} else if (local69 == 5) {
			this.anInt9872 = local30;
			this.anInt9874 = local56;
			this.anInt9863 = local98;
		}
	}

	@OriginalMember(owner = "client!uha", name = "a", descriptor = "(Lclient!mc;II)V")
	@Override
	public void method8944(@OriginalArg(0) Class5_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt9862 = arg0.method7849();
		} else if (arg1 == 1) {
			this.anInt9873 = (arg0.method7861() << 12) / 100;
		} else if (arg1 == 2) {
			this.anInt9865 = (arg0.method7861() << 12) / 100;
		}
	}
}

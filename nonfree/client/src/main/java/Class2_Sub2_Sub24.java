import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!op")
public final class Class2_Sub2_Sub24 extends Class2_Sub2 {

	@OriginalMember(owner = "client!op", name = "H", descriptor = "I")
	private int anInt6870;

	@OriginalMember(owner = "client!op", name = "M", descriptor = "I")
	private int anInt6875;

	@OriginalMember(owner = "client!op", name = "P", descriptor = "I")
	private int anInt6877;

	@OriginalMember(owner = "client!op", name = "T", descriptor = "I")
	private int anInt6880;

	@OriginalMember(owner = "client!op", name = "V", descriptor = "I")
	private int anInt6882;

	@OriginalMember(owner = "client!op", name = "ab", descriptor = "I")
	private int anInt6886;

	@OriginalMember(owner = "client!op", name = "J", descriptor = "I")
	private int anInt6872 = 0;

	@OriginalMember(owner = "client!op", name = "R", descriptor = "I")
	private int anInt6879 = 0;

	@OriginalMember(owner = "client!op", name = "K", descriptor = "I")
	private int anInt6873 = 0;

	@OriginalMember(owner = "client!op", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub24() {
		super(1, false);
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method7946(@OriginalArg(0) int arg0) {
		@Pc(28) int[][] local28 = super.aClass314_41.method7006(arg0);
		if (super.aClass314_41.aBoolean653) {
			@Pc(38) int[][] local38 = this.method7947(0, arg0);
			@Pc(42) int[] local42 = local38[0];
			@Pc(46) int[] local46 = local38[1];
			@Pc(50) int[] local50 = local38[2];
			@Pc(54) int[] local54 = local28[0];
			@Pc(58) int[] local58 = local28[1];
			@Pc(62) int[] local62 = local28[2];
			for (@Pc(64) int local64 = 0; local64 < Static153.anInt3070; local64++) {
				this.method5755(local42[local64], local50[local64], local46[local64]);
				this.anInt6880 += this.anInt6872;
				this.anInt6882 += this.anInt6873;
				this.anInt6886 += this.anInt6879;
				while (this.anInt6882 < 0) {
					this.anInt6882 += 4096;
				}
				if (this.anInt6880 < 0) {
					this.anInt6880 = 0;
				}
				while (this.anInt6882 > 4096) {
					this.anInt6882 -= 4096;
				}
				if (this.anInt6880 > 4096) {
					this.anInt6880 = 4096;
				}
				if (this.anInt6886 < 0) {
					this.anInt6886 = 0;
				}
				if (this.anInt6886 > 4096) {
					this.anInt6886 = 4096;
				}
				this.method5757(this.anInt6882, this.anInt6880, this.anInt6886);
				local54[local64] = this.anInt6875;
				local58[local64] = this.anInt6870;
				local62[local64] = this.anInt6877;
			}
		}
		return local28;
	}

	@OriginalMember(owner = "client!op", name = "b", descriptor = "(IIII)V")
	private void method5755(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) int local16 = arg0 > arg2 ? arg0 : arg2;
		@Pc(23) int local23 = arg0 >= arg2 ? arg2 : arg0;
		@Pc(30) int local30 = arg1 <= local16 ? local16 : arg1;
		@Pc(41) int local41 = arg1 >= local23 ? local23 : arg1;
		this.anInt6886 = (local30 + local41) / 2;
		@Pc(53) int local53 = local30 - local41;
		if (local53 > 0) {
			@Pc(71) int local71 = (local30 - arg0 << 12) / local53;
			@Pc(79) int local79 = (local30 - arg2 << 12) / local53;
			@Pc(88) int local88 = (local30 - arg1 << 12) / local53;
			if (arg0 == local30) {
				this.anInt6882 = arg2 == local41 ? local88 + 20480 : -local79 + 4096;
			} else if (local30 == arg2) {
				this.anInt6882 = arg1 == local41 ? local71 + 4096 : -local88 + 12288;
			} else {
				this.anInt6882 = arg0 == local41 ? local79 + 12288 : 20480 - local71;
			}
			this.anInt6882 /= 6;
		} else {
			this.anInt6882 = 0;
		}
		if (this.anInt6886 > 0 && this.anInt6886 < 4096) {
			this.anInt6880 = (local53 << 12) / (this.anInt6886 <= 2048 ? this.anInt6886 * 2 : 8192 - (this.anInt6886 * 2));
		} else {
			this.anInt6880 = 0;
		}
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(ILclient!es;I)V")
	@Override
	public void method7949(@OriginalArg(1) Class2_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt6873 = arg0.method4334();
		} else if (arg1 == 1) {
			this.anInt6872 = (arg0.method4304() << 12) / 100;
		} else if (arg1 == 2) {
			this.anInt6879 = (arg0.method4304() << 12) / 100;
		}
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(IBII)V")
	private void method5757(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(27) int local27 = arg2 > 2048 ? arg2 + arg1 - (arg2 * arg1 >> 12) : arg2 * (arg1 + 4096) >> 12;
		if (local27 <= 0) {
			this.anInt6875 = this.anInt6870 = this.anInt6877 = arg2;
			return;
		}
		@Pc(36) int local36 = arg0 * 6;
		@Pc(42) int local42 = arg2 + arg2 - local27;
		@Pc(51) int local51 = (local27 - local42 << 12) / local27;
		@Pc(55) int local55 = local36 >> 12;
		@Pc(61) int local61 = local36 - (local55 << 12);
		@Pc(69) int local69 = local27 * local51 >> 12;
		@Pc(75) int local75 = local69 * local61 >> 12;
		@Pc(79) int local79 = local75 + local42;
		@Pc(83) int local83 = local27 - local75;
		if (local55 == 0) {
			this.anInt6875 = local27;
			this.anInt6877 = local42;
			this.anInt6870 = local79;
		} else if (local55 == 1) {
			this.anInt6877 = local42;
			this.anInt6875 = local83;
			this.anInt6870 = local27;
		} else if (local55 == 2) {
			this.anInt6875 = local42;
			this.anInt6877 = local79;
			this.anInt6870 = local27;
		} else if (local55 == 3) {
			this.anInt6875 = local42;
			this.anInt6870 = local83;
			this.anInt6877 = local27;
		} else if (local55 == 4) {
			this.anInt6870 = local42;
			this.anInt6877 = local27;
			this.anInt6875 = local79;
		} else if (local55 == 5) {
			this.anInt6877 = local83;
			this.anInt6870 = local42;
			this.anInt6875 = local27;
		}
	}
}

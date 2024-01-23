import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tc")
public final class Class2_Sub1_Sub31 extends Class2_Sub1 {

	@OriginalMember(owner = "client!tc", name = "U", descriptor = "I")
	private int anInt4966 = 3072;

	@OriginalMember(owner = "client!tc", name = "V", descriptor = "I")
	private int anInt4967 = 2048;

	@OriginalMember(owner = "client!tc", name = "Z", descriptor = "I")
	private int anInt4970 = 1024;

	@OriginalMember(owner = "client!tc", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub31() {
		super(1, false);
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(Z)V")
	@Override
	public void method4934() {
		this.anInt4967 = this.anInt4966 - this.anInt4970;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4940(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = this.aClass136_41.method3410(arg0);
		if (this.aClass136_41.aBoolean349) {
			@Pc(28) int[] local28 = this.method4946(arg0, 0);
			for (@Pc(30) int local30 = 0; local30 < Static114.anInt1359; local30++) {
				local17[local30] = (this.anInt4967 * local28[local30] >> 12) + this.anInt4970;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method4941(@OriginalArg(0) int arg0) {
		@Pc(13) int[][] local13 = this.aClass150_41.method3894(arg0);
		if (this.aClass150_41.aBoolean405) {
			@Pc(28) int[][] local28 = this.method4937(0, arg0);
			@Pc(32) int[] local32 = local28[0];
			@Pc(36) int[] local36 = local28[1];
			@Pc(40) int[] local40 = local28[2];
			@Pc(44) int[] local44 = local13[0];
			@Pc(48) int[] local48 = local13[1];
			@Pc(52) int[] local52 = local13[2];
			for (@Pc(54) int local54 = 0; local54 < Static114.anInt1359; local54++) {
				local44[local54] = this.anInt4970 + (this.anInt4967 * local32[local54] >> 12);
				local48[local54] = (local36[local54] * this.anInt4967 >> 12) + this.anInt4970;
				local52[local54] = this.anInt4970 + (this.anInt4967 * local40[local54] >> 12);
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lclient!wm;II)V")
	@Override
	public void method4938(@OriginalArg(0) Class2_Sub26 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt4970 = arg0.method4242();
		} else if (arg1 == 1) {
			this.anInt4966 = arg0.method4242();
		} else if (arg1 == 2) {
			this.aBoolean492 = arg0.method4261() == 1;
		}
	}
}

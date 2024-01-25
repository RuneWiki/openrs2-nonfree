import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cf")
public final class Class1_Sub4_Sub7 extends Class1_Sub4 {

	@OriginalMember(owner = "client!cf", name = "L", descriptor = "I")
	private int anInt838 = 1024;

	@OriginalMember(owner = "client!cf", name = "G", descriptor = "I")
	private int anInt834 = 2048;

	@OriginalMember(owner = "client!cf", name = "N", descriptor = "I")
	private int anInt839 = 3072;

	@OriginalMember(owner = "client!cf", name = "<init>", descriptor = "()V")
	public Class1_Sub4_Sub7() {
		super(1, false);
	}

	@OriginalMember(owner = "client!cf", name = "e", descriptor = "(I)V")
	@Override
	public void method5686() {
		this.anInt834 = this.anInt839 - this.anInt838;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lclient!ug;II)V")
	@Override
	public void method5690(@OriginalArg(0) Class1_Sub28 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt838 = arg0.method5335();
		} else if (arg1 == 1) {
			this.anInt839 = arg0.method5335();
		} else if (arg1 == 2) {
			super.aBoolean796 = arg0.method5337() == 1;
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5683(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass2_41.method10(arg0);
		if (super.aClass2_41.aBoolean5) {
			@Pc(21) int[] local21 = this.method5695(arg0, 0);
			for (@Pc(23) int local23 = 0; local23 < Static395.anInt6592; local23++) {
				local11[local23] = (this.anInt834 * local21[local23] >> 12) + this.anInt838;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method5691(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass50_41.method1086(arg0);
		if (super.aClass50_41.aBoolean131) {
			@Pc(26) int[][] local26 = this.method5696(arg0, 0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local16[0];
			@Pc(46) int[] local46 = local16[1];
			@Pc(50) int[] local50 = local16[2];
			for (@Pc(52) int local52 = 0; local52 < Static395.anInt6592; local52++) {
				local42[local52] = (this.anInt834 * local30[local52] >> 12) + this.anInt838;
				local46[local52] = this.anInt838 + (local34[local52] * this.anInt834 >> 12);
				local50[local52] = this.anInt838 + (this.anInt834 * local38[local52] >> 12);
			}
		}
		return local16;
	}
}

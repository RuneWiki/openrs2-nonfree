import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eh")
public final class Class1_Sub1_Sub11 extends Class1_Sub1 {

	@OriginalMember(owner = "client!eh", name = "Y", descriptor = "I")
	private int anInt1205 = 3072;

	@OriginalMember(owner = "client!eh", name = "Z", descriptor = "I")
	private int anInt1206 = 1024;

	@OriginalMember(owner = "client!eh", name = "jb", descriptor = "I")
	private int anInt1213 = 2048;

	@OriginalMember(owner = "client!eh", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub11() {
		super(1, false);
	}

	@OriginalMember(owner = "client!eh", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method3571(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass40_41.method1362(arg0);
		if (super.aClass40_41.aBoolean86) {
			@Pc(31) int[] local31 = this.method3580(arg0, 0);
			for (@Pc(33) int local33 = 0; local33 < Static115.anInt2578; local33++) {
				local11[local33] = this.anInt1206 + (local31[local33] * this.anInt1213 >> 12);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!eh", name = "b", descriptor = "(B)V")
	@Override
	public void method3569() {
		this.anInt1213 = this.anInt1205 - this.anInt1206;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(Lclient!fj;IB)V")
	@Override
	public void method3573(@OriginalArg(0) Class1_Sub7 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt1206 = arg0.method2765();
		} else if (arg1 == 1) {
			this.anInt1205 = arg0.method2765();
		} else if (arg1 == 2) {
			super.aBoolean231 = arg0.method2771() == 1;
		}
	}

	@OriginalMember(owner = "client!eh", name = "c", descriptor = "(II)[[I")
	@Override
	public int[][] method3576(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass33_41.method1274(arg0);
		if (super.aClass33_41.aBoolean80) {
			@Pc(26) int[][] local26 = this.method3579(arg0, 0);
			@Pc(30) int[] local30 = local26[1];
			@Pc(34) int[] local34 = local26[2];
			@Pc(38) int[] local38 = local26[0];
			@Pc(42) int[] local42 = local16[1];
			@Pc(46) int[] local46 = local16[0];
			@Pc(50) int[] local50 = local16[2];
			for (@Pc(52) int local52 = 0; local52 < Static115.anInt2578; local52++) {
				local46[local52] = this.anInt1206 + (this.anInt1213 * local38[local52] >> 12);
				local42[local52] = (local30[local52] * this.anInt1213 >> 12) + this.anInt1206;
				local50[local52] = (this.anInt1213 * local34[local52] >> 12) + this.anInt1206;
			}
		}
		return local16;
	}
}

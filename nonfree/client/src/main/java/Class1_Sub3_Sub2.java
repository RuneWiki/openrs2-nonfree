import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!be")
public final class Class1_Sub3_Sub2 extends Class1_Sub3 {

	@OriginalMember(owner = "client!be", name = "N", descriptor = "I")
	private int anInt332;

	@OriginalMember(owner = "client!be", name = "O", descriptor = "I")
	private int anInt333;

	@OriginalMember(owner = "client!be", name = "X", descriptor = "I")
	private int anInt341;

	@OriginalMember(owner = "client!be", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub2() {
		this(0);
	}

	@OriginalMember(owner = "client!be", name = "<init>", descriptor = "(I)V")
	private Class1_Sub3_Sub2(@OriginalArg(0) int arg0) {
		super(0, false);
		this.method335(arg0);
	}

	@OriginalMember(owner = "client!be", name = "c", descriptor = "(II)V")
	private void method335(@OriginalArg(1) int arg0) {
		this.anInt341 = arg0 >> 4 & 0xFF0;
		this.anInt332 = (arg0 & 0xFF) << 4;
		this.anInt333 = arg0 >> 12 & 0xFF0;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method4452(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = this.aClass56_41.method1596(arg0);
		if (this.aClass56_41.aBoolean144) {
			@Pc(27) int[] local27 = local19[0];
			@Pc(31) int[] local31 = local19[2];
			@Pc(35) int[] local35 = local19[1];
			for (@Pc(37) int local37 = 0; local37 < Static227.anInt4511; local37++) {
				local27[local37] = this.anInt333;
				local35[local37] = this.anInt341;
				local31[local37] = this.anInt332;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Lclient!cg;II)V")
	@Override
	public void method4449(@OriginalArg(0) Class1_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.method335(arg0.method2681());
		}
	}
}

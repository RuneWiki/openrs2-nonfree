import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!md")
public final class Class2_Sub1_Sub23 extends Class2_Sub1 {

	@OriginalMember(owner = "client!md", name = "R", descriptor = "I")
	private int anInt2894;

	@OriginalMember(owner = "client!md", name = "gb", descriptor = "I")
	private int anInt2904;

	@OriginalMember(owner = "client!md", name = "ib", descriptor = "I")
	private int anInt2906;

	@OriginalMember(owner = "client!md", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub23() {
		this(0);
	}

	@OriginalMember(owner = "client!md", name = "<init>", descriptor = "(I)V")
	private Class2_Sub1_Sub23(@OriginalArg(0) int arg0) {
		super(0, false);
		this.method2030(arg0);
	}

	@OriginalMember(owner = "client!md", name = "c", descriptor = "(IB)V")
	private void method2030(@OriginalArg(0) int arg0) {
		this.anInt2906 = arg0 >> 4 & 0xFF0;
		this.anInt2904 = (arg0 & 0xFF) << 4;
		this.anInt2894 = arg0 >> 12 & 0xFF0;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(Lclient!ea;II)V")
	@Override
	public void method3204(@OriginalArg(0) Class2_Sub3 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.method2030(arg0.method166());
		}
	}

	@OriginalMember(owner = "client!md", name = "b", descriptor = "(IB)[[I")
	@Override
	public int[][] method3211(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass99_41.method3152(arg0);
		if (super.aClass99_41.aBoolean280) {
			@Pc(24) int[] local24 = local11[0];
			@Pc(28) int[] local28 = local11[2];
			@Pc(32) int[] local32 = local11[1];
			for (@Pc(34) int local34 = 0; local34 < Static62.anInt1675; local34++) {
				local24[local34] = this.anInt2894;
				local32[local34] = this.anInt2906;
				local28[local34] = this.anInt2904;
			}
		}
		return local11;
	}
}

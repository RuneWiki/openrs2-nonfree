import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ci")
public final class Class1_Sub1_Sub7 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ci", name = "V", descriptor = "I")
	private int anInt763;

	@OriginalMember(owner = "client!ci", name = "Y", descriptor = "I")
	private int anInt765;

	@OriginalMember(owner = "client!ci", name = "eb", descriptor = "I")
	private int anInt768;

	@OriginalMember(owner = "client!ci", name = "<init>", descriptor = "(I)V")
	private Class1_Sub1_Sub7(@OriginalArg(0) int arg0) {
		super(0, false);
		this.method571(arg0);
	}

	@OriginalMember(owner = "client!ci", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub7() {
		this(0);
	}

	@OriginalMember(owner = "client!ci", name = "d", descriptor = "(II)V")
	private void method571(@OriginalArg(0) int arg0) {
		this.anInt765 = arg0 >> 12 & 0xFF0;
		this.anInt768 = (arg0 & 0xFF) << 4;
		this.anInt763 = arg0 >> 4 & 0xFF0;
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(Lclient!fj;IB)V")
	@Override
	public void method3573(@OriginalArg(0) Class1_Sub7 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.method571(arg0.method2745());
		}
	}

	@OriginalMember(owner = "client!ci", name = "c", descriptor = "(II)[[I")
	@Override
	public int[][] method3576(@OriginalArg(1) int arg0) {
		@Pc(18) int[][] local18 = super.aClass33_41.method1274(arg0);
		if (super.aClass33_41.aBoolean80) {
			@Pc(26) int[] local26 = local18[1];
			@Pc(30) int[] local30 = local18[2];
			@Pc(34) int[] local34 = local18[0];
			for (@Pc(36) int local36 = 0; local36 < Static115.anInt2578; local36++) {
				local34[local36] = this.anInt765;
				local26[local36] = this.anInt763;
				local30[local36] = this.anInt768;
			}
		}
		return local18;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public abstract class Class1_Sub3 extends Class1 {

	@OriginalMember(owner = "client!h", name = "x", descriptor = "I")
	public int anInt2929;

	@OriginalMember(owner = "client!h", name = "y", descriptor = "Lclient!h;")
	public Class1_Sub3 aClass1_Sub3_8;

	@OriginalMember(owner = "client!h", name = "z", descriptor = "Lclient!rd;")
	public Class1_Sub14 aClass1_Sub14_5;

	@OriginalMember(owner = "client!h", name = "A", descriptor = "Z")
	public volatile boolean aBoolean131 = true;

	@OriginalMember(owner = "client!h", name = "a", descriptor = "()Lclient!h;")
	public abstract Class1_Sub3 method2026();

	@OriginalMember(owner = "client!h", name = "b", descriptor = "()I")
	public int method2027() {
		return 255;
	}

	@OriginalMember(owner = "client!h", name = "c", descriptor = "(I)V")
	public abstract void method2028(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!h", name = "c", descriptor = "()I")
	public abstract int method2029();

	@OriginalMember(owner = "client!h", name = "a", descriptor = "([III)V")
	public abstract void method2030(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!h", name = "b", descriptor = "([III)V")
	protected final void method2031(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean131) {
			this.method2030(arg0, arg1, arg2);
		} else {
			this.method2028(arg2);
		}
	}

	@OriginalMember(owner = "client!h", name = "d", descriptor = "()Lclient!h;")
	public abstract Class1_Sub3 method2032();
}

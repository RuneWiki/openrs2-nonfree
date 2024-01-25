import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pn")
public abstract class Class2_Sub10 extends Class2 {

	@OriginalMember(owner = "client!pn", name = "k", descriptor = "I")
	public int anInt4050;

	@OriginalMember(owner = "client!pn", name = "m", descriptor = "Lclient!pn;")
	public Class2_Sub10 aClass2_Sub10_7;

	@OriginalMember(owner = "client!pn", name = "n", descriptor = "Lclient!bo;")
	public Class2_Sub7 aClass2_Sub7_5;

	@OriginalMember(owner = "client!pn", name = "l", descriptor = "Z")
	public volatile boolean aBoolean329 = true;

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "()Lclient!pn;")
	public abstract Class2_Sub10 method3360();

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(I)V")
	public abstract void method3361(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "([III)V")
	protected final void method3362(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean329) {
			this.method3363(arg0, arg1, arg2);
		} else {
			this.method3361(arg2);
		}
	}

	@OriginalMember(owner = "client!pn", name = "b", descriptor = "([III)V")
	public abstract void method3363(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!pn", name = "b", descriptor = "()Lclient!pn;")
	public abstract Class2_Sub10 method3364();

	@OriginalMember(owner = "client!pn", name = "c", descriptor = "()I")
	public int method3365() {
		return 255;
	}

	@OriginalMember(owner = "client!pn", name = "d", descriptor = "()I")
	public abstract int method3366();
}

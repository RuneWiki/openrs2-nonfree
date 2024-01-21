import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public abstract class Class1_Sub10 extends Class1 {

	@OriginalMember(owner = "client!vh", name = "l", descriptor = "Lclient!vh;")
	public Class1_Sub10 aClass1_Sub10_7;

	@OriginalMember(owner = "client!vh", name = "n", descriptor = "I")
	public int anInt3172;

	@OriginalMember(owner = "client!vh", name = "o", descriptor = "Lclient!fc;")
	public Class1_Sub11 aClass1_Sub11_5;

	@OriginalMember(owner = "client!vh", name = "m", descriptor = "Z")
	public volatile boolean aBoolean126 = true;

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "()I")
	public abstract int method2436();

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "([III)V")
	protected final void method2437(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean126) {
			this.method2442(arg0, arg1, arg2);
		} else {
			this.method2438(arg2);
		}
	}

	@OriginalMember(owner = "client!vh", name = "b", descriptor = "(I)V")
	public abstract void method2438(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!vh", name = "b", descriptor = "()Lclient!vh;")
	public abstract Class1_Sub10 method2439();

	@OriginalMember(owner = "client!vh", name = "c", descriptor = "()Lclient!vh;")
	public abstract Class1_Sub10 method2440();

	@OriginalMember(owner = "client!vh", name = "d", descriptor = "()I")
	public int method2441() {
		return 255;
	}

	@OriginalMember(owner = "client!vh", name = "b", descriptor = "([III)V")
	public abstract void method2442(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);
}

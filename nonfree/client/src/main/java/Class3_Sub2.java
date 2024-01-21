import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public abstract class Class3_Sub2 extends Class3 {

	@OriginalMember(owner = "client!mc", name = "F", descriptor = "I")
	public int anInt3260;

	@OriginalMember(owner = "client!mc", name = "G", descriptor = "Lclient!mc;")
	public Class3_Sub2 aClass3_Sub2_8;

	@OriginalMember(owner = "client!mc", name = "H", descriptor = "Lclient!fa;")
	public Class3_Sub9 aClass3_Sub9_5;

	@OriginalMember(owner = "client!mc", name = "E", descriptor = "Z")
	public volatile boolean aBoolean119 = true;

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "([III)V")
	public abstract void method2164(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "()I")
	public int method2165() {
		return 255;
	}

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "()Lclient!mc;")
	public abstract Class3_Sub2 method2166();

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "()Lclient!mc;")
	public abstract Class3_Sub2 method2167();

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "([III)V")
	protected final void method2168(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean119) {
			this.method2164(arg0, arg1, arg2);
		} else {
			this.method2169(arg2);
		}
	}

	@OriginalMember(owner = "client!mc", name = "f", descriptor = "(I)V")
	public abstract void method2169(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!mc", name = "d", descriptor = "()I")
	public abstract int method2170();
}

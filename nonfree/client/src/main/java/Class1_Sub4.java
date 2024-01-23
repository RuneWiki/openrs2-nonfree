import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public abstract class Class1_Sub4 extends Class1 {

	@OriginalMember(owner = "client!r", name = "v", descriptor = "I")
	public int anInt2999;

	@OriginalMember(owner = "client!r", name = "w", descriptor = "Lclient!r;")
	public Class1_Sub4 aClass1_Sub4_7;

	@OriginalMember(owner = "client!r", name = "x", descriptor = "Lclient!di;")
	public Class1_Sub6 aClass1_Sub6_5;

	@OriginalMember(owner = "client!r", name = "u", descriptor = "Z")
	public volatile boolean aBoolean132 = true;

	@OriginalMember(owner = "client!r", name = "a", descriptor = "()Lclient!r;")
	public abstract Class1_Sub4 method2353();

	@OriginalMember(owner = "client!r", name = "b", descriptor = "()Lclient!r;")
	public abstract Class1_Sub4 method2354();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "([III)V")
	public abstract void method2355(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!r", name = "c", descriptor = "()I")
	public abstract int method2356();

	@OriginalMember(owner = "client!r", name = "e", descriptor = "(I)V")
	public abstract void method2357(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!r", name = "d", descriptor = "()I")
	public int method2358() {
		return 255;
	}

	@OriginalMember(owner = "client!r", name = "b", descriptor = "([III)V")
	protected final void method2359(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean132) {
			this.method2355(arg0, arg1, arg2);
		} else {
			this.method2357(arg2);
		}
	}
}

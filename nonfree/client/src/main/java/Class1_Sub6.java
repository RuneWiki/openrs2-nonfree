import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public abstract class Class1_Sub6 extends Class1 {

	@OriginalMember(owner = "client!d", name = "q", descriptor = "I")
	public int anInt3090;

	@OriginalMember(owner = "client!d", name = "r", descriptor = "Lclient!ti;")
	public Class1_Sub19 aClass1_Sub19_5;

	@OriginalMember(owner = "client!d", name = "s", descriptor = "Lclient!d;")
	public Class1_Sub6 aClass1_Sub6_7;

	@OriginalMember(owner = "client!d", name = "t", descriptor = "Z")
	public volatile boolean aBoolean127 = true;

	@OriginalMember(owner = "client!d", name = "a", descriptor = "()Lclient!d;")
	public abstract Class1_Sub6 method2368();

	@OriginalMember(owner = "client!d", name = "b", descriptor = "()Lclient!d;")
	public abstract Class1_Sub6 method2369();

	@OriginalMember(owner = "client!d", name = "a", descriptor = "([III)V")
	protected final void method2370(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean127) {
			this.method2371(arg0, arg1, arg2);
		} else {
			this.method2373(arg2);
		}
	}

	@OriginalMember(owner = "client!d", name = "b", descriptor = "([III)V")
	public abstract void method2371(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!d", name = "c", descriptor = "()I")
	public int method2372() {
		return 255;
	}

	@OriginalMember(owner = "client!d", name = "b", descriptor = "(I)V")
	public abstract void method2373(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!d", name = "d", descriptor = "()I")
	public abstract int method2374();
}

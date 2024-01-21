import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public abstract class Class4_Sub2 extends Class4 {

	@OriginalMember(owner = "client!oc", name = "q", descriptor = "I")
	public int anInt1325;

	@OriginalMember(owner = "client!oc", name = "s", descriptor = "Lclient!oc;")
	public Class4_Sub2 aClass4_Sub2_5;

	@OriginalMember(owner = "client!oc", name = "t", descriptor = "Lclient!ac;")
	public Class4_Sub1 aClass4_Sub1_5;

	@OriginalMember(owner = "client!oc", name = "r", descriptor = "Z")
	public volatile boolean aBoolean47 = true;

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "()I")
	public int method963() {
		return 255;
	}

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "(I)V")
	public abstract void method964(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "()I")
	public abstract int method965();

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "([III)V")
	protected final void method966(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean47) {
			this.method968(arg0, arg1, arg2);
		} else {
			this.method964(arg2);
		}
	}

	@OriginalMember(owner = "client!oc", name = "c", descriptor = "()Lclient!oc;")
	public abstract Class4_Sub2 method967();

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "([III)V")
	public abstract void method968(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!oc", name = "d", descriptor = "()Lclient!oc;")
	public abstract Class4_Sub2 method969();
}

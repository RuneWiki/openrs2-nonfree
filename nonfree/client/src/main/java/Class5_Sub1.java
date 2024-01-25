import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aca")
public abstract class Class5_Sub1 extends Class5 {

	@OriginalMember(owner = "client!aca", name = "k", descriptor = "Lclient!nw;")
	public Class5_Sub37 aClass5_Sub37_6;

	@OriginalMember(owner = "client!aca", name = "m", descriptor = "I")
	public int anInt9642;

	@OriginalMember(owner = "client!aca", name = "n", descriptor = "Lclient!aca;")
	public Class5_Sub1 aClass5_Sub1_9;

	@OriginalMember(owner = "client!aca", name = "l", descriptor = "Z")
	public volatile boolean aBoolean693 = true;

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "()Lclient!aca;")
	public abstract Class5_Sub1 method8282();

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "([III)V")
	public abstract void method8283(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!aca", name = "b", descriptor = "()I")
	public abstract int method8284();

	@OriginalMember(owner = "client!aca", name = "c", descriptor = "()Lclient!aca;")
	public abstract Class5_Sub1 method8285();

	@OriginalMember(owner = "client!aca", name = "b", descriptor = "([III)V")
	protected final void method8286(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean693) {
			this.method8283(arg0, arg1, arg2);
		} else {
			this.method8287(arg2);
		}
	}

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(I)V")
	public abstract void method8287(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!aca", name = "d", descriptor = "()I")
	public int method8288() {
		return 255;
	}
}

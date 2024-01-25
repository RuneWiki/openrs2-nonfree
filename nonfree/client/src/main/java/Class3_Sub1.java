import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wq")
public abstract class Class3_Sub1 extends Class3 {

	@OriginalMember(owner = "client!wq", name = "j", descriptor = "I")
	public int anInt7780;

	@OriginalMember(owner = "client!wq", name = "k", descriptor = "Lclient!wq;")
	public Class3_Sub1 aClass3_Sub1_8;

	@OriginalMember(owner = "client!wq", name = "l", descriptor = "Lclient!r;")
	public Class3_Sub28 aClass3_Sub28_5;

	@OriginalMember(owner = "client!wq", name = "m", descriptor = "Z")
	public volatile boolean aBoolean518 = true;

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "([III)V")
	public abstract void method6290(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "()I")
	public abstract int method6291();

	@OriginalMember(owner = "client!wq", name = "b", descriptor = "()Lclient!wq;")
	public abstract Class3_Sub1 method6292();

	@OriginalMember(owner = "client!wq", name = "c", descriptor = "()I")
	public int method6293() {
		return 255;
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(I)V")
	public abstract void method6294(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!wq", name = "b", descriptor = "([III)V")
	protected final void method6295(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean518) {
			this.method6290(arg0, arg1, arg2);
		} else {
			this.method6294(arg2);
		}
	}

	@OriginalMember(owner = "client!wq", name = "d", descriptor = "()Lclient!wq;")
	public abstract Class3_Sub1 method6296();
}

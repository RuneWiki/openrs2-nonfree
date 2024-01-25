import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public abstract class Class3_Sub9 extends Class3 {

	@OriginalMember(owner = "client!bk", name = "j", descriptor = "I")
	public int anInt8342;

	@OriginalMember(owner = "client!bk", name = "k", descriptor = "Lclient!qv;")
	public Class3_Sub42 aClass3_Sub42_5;

	@OriginalMember(owner = "client!bk", name = "m", descriptor = "Lclient!bk;")
	public Class3_Sub9 aClass3_Sub9_7;

	@OriginalMember(owner = "client!bk", name = "l", descriptor = "Z")
	public volatile boolean aBoolean591 = true;

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "()I")
	public abstract int method6926();

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "([III)V")
	protected final void method6927(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean591) {
			this.method6930(arg0, arg1, arg2);
		} else {
			this.method6931(arg2);
		}
	}

	@OriginalMember(owner = "client!bk", name = "b", descriptor = "()Lclient!bk;")
	public abstract Class3_Sub9 method6928();

	@OriginalMember(owner = "client!bk", name = "c", descriptor = "()Lclient!bk;")
	public abstract Class3_Sub9 method6929();

	@OriginalMember(owner = "client!bk", name = "b", descriptor = "([III)V")
	public abstract void method6930(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(I)V")
	public abstract void method6931(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!bk", name = "d", descriptor = "()I")
	public int method6932() {
		return 255;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public abstract class Class3_Sub3 extends Class3 {

	@OriginalMember(owner = "client!da", name = "H", descriptor = "I")
	public int anInt3144;

	@OriginalMember(owner = "client!da", name = "I", descriptor = "Lclient!da;")
	public Class3_Sub3 aClass3_Sub3_8;

	@OriginalMember(owner = "client!da", name = "J", descriptor = "Lclient!ea;")
	public Class3_Sub5 aClass3_Sub5_5;

	@OriginalMember(owner = "client!da", name = "K", descriptor = "Z")
	public volatile boolean aBoolean174 = true;

	@OriginalMember(owner = "client!da", name = "a", descriptor = "()I")
	public abstract int method2144();

	@OriginalMember(owner = "client!da", name = "b", descriptor = "()Lclient!da;")
	public abstract Class3_Sub3 method2145();

	@OriginalMember(owner = "client!da", name = "a", descriptor = "([III)V")
	public abstract void method2146(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!da", name = "c", descriptor = "()Lclient!da;")
	public abstract Class3_Sub3 method2147();

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(I)V")
	public abstract void method2148(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!da", name = "d", descriptor = "()I")
	public int method2149() {
		return 255;
	}

	@OriginalMember(owner = "client!da", name = "b", descriptor = "([III)V")
	protected final void method2150(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean174) {
			this.method2146(arg0, arg1, arg2);
		} else {
			this.method2148(arg2);
		}
	}
}

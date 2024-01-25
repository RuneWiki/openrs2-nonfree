import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hu")
public abstract class Class4_Sub14 extends Class4 {

	@OriginalMember(owner = "client!hu", name = "j", descriptor = "Lclient!gk;")
	public Class4_Sub15 aClass4_Sub15_5;

	@OriginalMember(owner = "client!hu", name = "l", descriptor = "Lclient!hu;")
	public Class4_Sub14 aClass4_Sub14_7;

	@OriginalMember(owner = "client!hu", name = "m", descriptor = "I")
	public int anInt5995;

	@OriginalMember(owner = "client!hu", name = "k", descriptor = "Z")
	public volatile boolean aBoolean422 = true;

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(I)V")
	public abstract void method4783(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "()Lclient!hu;")
	public abstract Class4_Sub14 method4784();

	@OriginalMember(owner = "client!hu", name = "b", descriptor = "()I")
	public int method4785() {
		return 255;
	}

	@OriginalMember(owner = "client!hu", name = "c", descriptor = "()I")
	public abstract int method4786();

	@OriginalMember(owner = "client!hu", name = "d", descriptor = "()Lclient!hu;")
	public abstract Class4_Sub14 method4787();

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "([III)V")
	public abstract void method4788(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!hu", name = "b", descriptor = "([III)V")
	protected final void method4789(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean422) {
			this.method4788(arg0, arg1, arg2);
		} else {
			this.method4783(arg2);
		}
	}
}

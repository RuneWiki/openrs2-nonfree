import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ep")
public abstract class Class2_Sub2 extends Class2 {

	@OriginalMember(owner = "client!ep", name = "i", descriptor = "I")
	public int anInt8999;

	@OriginalMember(owner = "client!ep", name = "j", descriptor = "Lclient!la;")
	public Class2_Sub12 aClass2_Sub12_6;

	@OriginalMember(owner = "client!ep", name = "k", descriptor = "Lclient!ep;")
	public Class2_Sub2 aClass2_Sub2_9;

	@OriginalMember(owner = "client!ep", name = "h", descriptor = "Z")
	public volatile boolean aBoolean659 = true;

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "([III)V")
	public abstract void method7538(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "()Lclient!ep;")
	public abstract Class2_Sub2 method7539();

	@OriginalMember(owner = "client!ep", name = "b", descriptor = "([III)V")
	protected final void method7540(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean659) {
			this.method7538(arg0, arg1, arg2);
		} else {
			this.method7544(arg2);
		}
	}

	@OriginalMember(owner = "client!ep", name = "b", descriptor = "()I")
	public abstract int method7541();

	@OriginalMember(owner = "client!ep", name = "c", descriptor = "()Lclient!ep;")
	public abstract Class2_Sub2 method7542();

	@OriginalMember(owner = "client!ep", name = "d", descriptor = "()I")
	public int method7543() {
		return 255;
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(I)V")
	public abstract void method7544(@OriginalArg(0) int arg0);
}

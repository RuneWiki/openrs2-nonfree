import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public abstract class Class39 {

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "Lclient!hd;")
	protected final Class89_Sub1 aClass89_Sub1_39;

	@OriginalMember(owner = "client!qg", name = "<init>", descriptor = "(Lclient!hd;)V")
	public Class39(@OriginalArg(0) Class89_Sub1 arg0) {
		this.aClass89_Sub1_39 = arg0;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lclient!vd;)V")
	public abstract void method5242(@OriginalArg(0) Class92 arg0);

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(Z)V")
	public abstract void method5243(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)V")
	public abstract void method5244(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "()Z")
	public abstract boolean method5245();

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "(Z)V")
	public abstract void method5246(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "()V")
	public abstract void method5247();
}

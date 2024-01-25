import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public abstract class Class11 {

	@OriginalMember(owner = "client!ee", name = "d", descriptor = "(I)Z")
	public abstract boolean method6301();

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lclient!qa;B)V")
	public abstract void method6303(@OriginalArg(0) Class30 arg0);

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(ILclient!qa;)Lclient!nj;")
	public abstract Class71_Sub3 method6304(@OriginalArg(1) Class30 arg0);

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "(Lclient!qa;B)Lclient!em;")
	public abstract Class64 method6305(@OriginalArg(0) Class30 arg0);

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIILclient!qa;ZLclient!ee;Z)V")
	public abstract void method6306(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class30 arg3, @OriginalArg(5) Class11 arg4, @OriginalArg(6) boolean arg5);

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Z)V")
	public abstract void method6307();

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIILclient!qa;)Z")
	public abstract boolean method6308(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class30 arg2);
}

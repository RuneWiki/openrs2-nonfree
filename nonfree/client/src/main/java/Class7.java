import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!to")
public abstract class Class7 {

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(BLclient!qa;)V")
	public abstract void method5267(@OriginalArg(1) Class172 arg0);

	@OriginalMember(owner = "client!to", name = "c", descriptor = "(B)V")
	public abstract void method5268();

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(ILclient!qa;II)Z")
	public abstract boolean method5270(@OriginalArg(1) Class172 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(ILclient!qa;ZLclient!to;III)V")
	public abstract void method5273(@OriginalArg(0) int arg0, @OriginalArg(1) Class172 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class7 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(ZLclient!qa;)Lclient!ae;")
	public abstract Class6_Sub1 method5274(@OriginalArg(1) Class172 arg0);

	@OriginalMember(owner = "client!to", name = "b", descriptor = "(Z)Z")
	public abstract boolean method5276();
}

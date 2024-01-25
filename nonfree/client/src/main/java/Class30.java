import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jt")
public abstract class Class30 {

	@OriginalMember(owner = "client!jt", name = "d", descriptor = "(I)Z")
	public abstract boolean method7901();

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(Lclient!qa;B)V")
	public abstract void method7903(@OriginalArg(0) Class42 arg0);

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(IZIILclient!jt;ILclient!qa;)V")
	public abstract void method7904(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class30 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class42 arg5);

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(ZLclient!qa;)Lclient!nk;")
	public abstract Class218 method7906(@OriginalArg(1) Class42 arg0);

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(Lclient!qa;III)Z")
	public abstract boolean method7907(@OriginalArg(0) Class42 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!jt", name = "b", descriptor = "(ZLclient!qa;)Lclient!vw;")
	public abstract Class7_Sub8 method7908(@OriginalArg(1) Class42 arg0);

	@OriginalMember(owner = "client!jt", name = "f", descriptor = "(I)V")
	public abstract void method7909();
}

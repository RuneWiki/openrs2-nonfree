import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!co")
public abstract class Class26 {

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(Z)Z")
	public abstract boolean method5512();

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(IILclient!co;ILclient!qa;ZZ)V")
	public abstract void method5514(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class26 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class109 arg4, @OriginalArg(5) boolean arg5);

	@OriginalMember(owner = "client!co", name = "e", descriptor = "(I)V")
	public abstract void method5516();

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(Lclient!qa;III)Z")
	public abstract boolean method5517(@OriginalArg(0) Class109 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!co", name = "c", descriptor = "(ILclient!qa;)V")
	public abstract void method5519(@OriginalArg(1) Class109 arg0);

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(Lclient!qa;I)Lclient!ip;")
	public abstract Class39_Sub4 method5520(@OriginalArg(0) Class109 arg0);
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!co")
public abstract class Class47 {

	@OriginalMember(owner = "client!co", name = "c", descriptor = "(B)Z")
	public abstract boolean method7156();

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(ILclient!qa;IB)Z")
	public abstract boolean method7157(@OriginalArg(0) int arg0, @OriginalArg(1) Class9 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(ILclient!qa;)V")
	public abstract void method7161(@OriginalArg(1) Class9 arg0);

	@OriginalMember(owner = "client!co", name = "e", descriptor = "(I)V")
	public abstract void method7162();

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(Lclient!qa;I)Lclient!pl;")
	public abstract Class231 method7163(@OriginalArg(0) Class9 arg0);

	@OriginalMember(owner = "client!co", name = "b", descriptor = "(ILclient!qa;)Lclient!in;")
	public abstract Class2_Sub6 method7165(@OriginalArg(1) Class9 arg0);

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(Lclient!qa;IZIILclient!co;I)V")
	public abstract void method7166(@OriginalArg(0) Class9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class47 arg5);
}

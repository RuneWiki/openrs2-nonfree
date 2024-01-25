import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nt")
public abstract class Class4 {

	@OriginalMember(owner = "client!nt", name = "b", descriptor = "(Lclient!oa;I)Lclient!qt;")
	public abstract Class277 method7781(@OriginalArg(0) Class14 arg0);

	@OriginalMember(owner = "client!nt", name = "c", descriptor = "(B)V")
	public abstract void method7782();

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(BILclient!oa;I)Z")
	public abstract boolean method7784(@OriginalArg(1) int arg0, @OriginalArg(2) Class14 arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!nt", name = "c", descriptor = "(I)Z")
	public abstract boolean method7785();

	@OriginalMember(owner = "client!nt", name = "b", descriptor = "(Lclient!oa;B)V")
	public abstract void method7786(@OriginalArg(0) Class14 arg0);

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(ZLclient!oa;Lclient!nt;IIII)V")
	public abstract void method7787(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class14 arg1, @OriginalArg(2) Class4 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(ILclient!oa;)Lclient!ww;")
	public abstract Class98_Sub8 method7788(@OriginalArg(1) Class14 arg0);
}

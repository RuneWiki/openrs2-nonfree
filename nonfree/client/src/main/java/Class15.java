import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gfa")
public abstract class Class15 {

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(ILclient!oa;)Lclient!wc;")
	public abstract Class60_Sub8 method7155(@OriginalArg(1) Class90 arg0);

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(Lclient!oa;B)Lclient!ac;")
	public abstract Class4 method7156(@OriginalArg(0) Class90 arg0);

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(ZLclient!oa;)V")
	public abstract void method7160(@OriginalArg(1) Class90 arg0);

	@OriginalMember(owner = "client!gfa", name = "g", descriptor = "(I)Z")
	public abstract boolean method7162();

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(IILclient!gfa;IIZLclient!oa;)V")
	public abstract void method7163(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class15 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) Class90 arg5);

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(IILclient!oa;I)Z")
	public abstract boolean method7164(@OriginalArg(0) int arg0, @OriginalArg(2) Class90 arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(Z)V")
	public abstract void method7165();
}

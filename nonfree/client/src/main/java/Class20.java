import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public abstract class Class20 {

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(ILclient!qa;)V")
	public abstract void method8030(@OriginalArg(1) Class4 arg0);

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "(ILclient!qa;)Lclient!so;")
	public abstract Class271 method8031(@OriginalArg(1) Class4 arg0);

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(ZLclient!oe;ILclient!qa;III)V")
	public abstract void method8034(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class20 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class4 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!oe", name = "c", descriptor = "(B)V")
	public abstract void method8036();

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(ILclient!qa;II)Z")
	public abstract boolean method8037(@OriginalArg(1) Class4 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!oe", name = "d", descriptor = "(I)Z")
	public abstract boolean method8038();

	@OriginalMember(owner = "client!oe", name = "c", descriptor = "(ILclient!qa;)Lclient!oj;")
	public abstract Class46_Sub6 method8039(@OriginalArg(1) Class4 arg0);
}

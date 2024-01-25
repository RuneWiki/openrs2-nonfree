import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public interface Interface9 {

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(I)V")
	void method5577();

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(Lclient!ae;I)V")
	void method5578(@OriginalArg(0) Class4 arg0);

	@OriginalMember(owner = "client!vl", name = "b", descriptor = "(I)Z")
	boolean method5579();

	@OriginalMember(owner = "client!vl", name = "c", descriptor = "(I)I")
	int method5580();

	@OriginalMember(owner = "client!vl", name = "d", descriptor = "(I)I")
	int method5581();

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(Lclient!ae;ZI)Lclient!bk;")
	Class7 method5582(@OriginalArg(0) Class4 arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(B)I")
	int method5583();

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(ILclient!ae;)V")
	void method5584(@OriginalArg(1) Class4 arg0);
}

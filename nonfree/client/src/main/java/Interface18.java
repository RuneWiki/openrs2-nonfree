import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vaa")
public interface Interface18 {

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(I)I")
	int method7465();

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(ILclient!qa;)V")
	void method7466(@OriginalArg(1) Class122 arg0);

	@OriginalMember(owner = "client!vaa", name = "b", descriptor = "(I)I")
	int method7467();

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(IILclient!qa;)Lclient!r;")
	Class145 method7468(@OriginalArg(0) int arg0, @OriginalArg(2) Class122 arg1);

	@OriginalMember(owner = "client!vaa", name = "c", descriptor = "(I)I")
	int method7469();

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(Lclient!qa;I)V")
	void method7470(@OriginalArg(0) Class122 arg0);

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(B)Z")
	boolean method7471();

	@OriginalMember(owner = "client!vaa", name = "d", descriptor = "(I)V")
	void method7472();
}

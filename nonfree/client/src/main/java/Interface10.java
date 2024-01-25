import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public interface Interface10 {

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(B)I")
	int method6866();

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(I)I")
	int method6867();

	@OriginalMember(owner = "client!p", name = "b", descriptor = "(I)I")
	int method6868();

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(ZLclient!qa;)V")
	void method6869(@OriginalArg(1) Class62 arg0);

	@OriginalMember(owner = "client!p", name = "c", descriptor = "(I)V")
	void method6870();

	@OriginalMember(owner = "client!p", name = "d", descriptor = "(I)Z")
	boolean method6871();

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(ILclient!qa;)V")
	void method6872(@OriginalArg(1) Class62 arg0);

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(ILclient!qa;Z)Lclient!r;")
	Class36 method6873(@OriginalArg(0) int arg0, @OriginalArg(1) Class62 arg1);
}

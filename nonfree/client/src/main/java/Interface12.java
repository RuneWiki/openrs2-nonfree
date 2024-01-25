import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public interface Interface12 {

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(I)I")
	int method5847();

	@OriginalMember(owner = "client!wk", name = "b", descriptor = "(I)I")
	int method5848();

	@OriginalMember(owner = "client!wk", name = "c", descriptor = "(I)V")
	void method5849();

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(IILclient!qa;)Lclient!c;")
	Class31 method5850(@OriginalArg(0) int arg0, @OriginalArg(2) Class75 arg1);

	@OriginalMember(owner = "client!wk", name = "d", descriptor = "(I)I")
	int method5851();

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(Z)Z")
	boolean method5852();

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(Lclient!qa;I)V")
	void method5853(@OriginalArg(0) Class75 arg0);

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(Lclient!qa;B)V")
	void method5854(@OriginalArg(0) Class75 arg0);
}

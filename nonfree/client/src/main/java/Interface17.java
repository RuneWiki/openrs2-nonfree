import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public interface Interface17 {

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(B)Z")
	boolean method7739();

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lclient!oa;BI)Lclient!ba;")
	Class9 method7740(@OriginalArg(0) Class66 arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(Z)V")
	void method7741();

	@OriginalMember(owner = "client!qi", name = "b", descriptor = "(B)I")
	int method7742();

	@OriginalMember(owner = "client!qi", name = "b", descriptor = "(Z)I")
	int method7743();

	@OriginalMember(owner = "client!qi", name = "c", descriptor = "(Z)I")
	int method7744();

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lclient!oa;B)V")
	void method7745(@OriginalArg(0) Class66 arg0);

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lclient!oa;I)V")
	void method7746(@OriginalArg(0) Class66 arg0);
}

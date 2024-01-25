import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public interface Interface5 {

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(I)I")
	int method5337();

	@OriginalMember(owner = "client!lk", name = "b", descriptor = "(I)Z")
	boolean method5338();

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lclient!tj;IB)Lclient!qb;")
	Class124 method5339(@OriginalArg(0) Class122 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(ILclient!tj;)V")
	void method5340(@OriginalArg(1) Class122 arg0);

	@OriginalMember(owner = "client!lk", name = "b", descriptor = "(ILclient!tj;)V")
	void method5341(@OriginalArg(1) Class122 arg0);

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(B)I")
	int method5342();

	@OriginalMember(owner = "client!lk", name = "c", descriptor = "(I)V")
	void method5343();

	@OriginalMember(owner = "client!lk", name = "d", descriptor = "(I)I")
	int method5344();
}

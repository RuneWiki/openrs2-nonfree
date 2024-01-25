import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!up")
public interface Interface7 {

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(Lclient!e;I)V")
	void method4064(@OriginalArg(0) Class46 arg0);

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(I)V")
	void method4065();

	@OriginalMember(owner = "client!up", name = "b", descriptor = "(I)I")
	int method4066();

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(B)I")
	int method4067();

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(Lclient!e;B)V")
	void method4068(@OriginalArg(0) Class46 arg0);

	@OriginalMember(owner = "client!up", name = "b", descriptor = "(B)Z")
	boolean method4069();

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(Z)I")
	int method4070();

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(Lclient!e;IB)Lclient!id;")
	Class45 method4071(@OriginalArg(0) Class46 arg0, @OriginalArg(1) int arg1);
}

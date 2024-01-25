import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bs")
public interface Interface2 {

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(I)I")
	int method6034();

	@OriginalMember(owner = "client!bs", name = "b", descriptor = "(I)I")
	int method6035();

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(BLclient!za;)V")
	void method6036(@OriginalArg(1) Class200 arg0);

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(B)I")
	int method6037();

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(Lclient!za;IZ)Lclient!e;")
	Class57 method6038(@OriginalArg(0) Class200 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!bs", name = "b", descriptor = "(B)Z")
	boolean method6039();

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(Lclient!za;B)V")
	void method6040(@OriginalArg(0) Class200 arg0);

	@OriginalMember(owner = "client!bs", name = "c", descriptor = "(I)V")
	void method6041();
}

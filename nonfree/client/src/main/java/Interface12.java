import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hs")
public interface Interface12 {

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(B)I")
	int method2482();

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(ZZ)V")
	void method2483(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!hs", name = "b", descriptor = "(B)V")
	void method2484();

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(I)I")
	int method2485();

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(ZJ)Z")
	boolean method2486(@OriginalArg(1) long arg0);

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(Z)V")
	void method2487();
}

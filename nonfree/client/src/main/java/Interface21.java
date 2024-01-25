import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public interface Interface21 {

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(ZB)V")
	void method8187(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(JI)Z")
	boolean method8188(@OriginalArg(0) long arg0);

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(Z)I")
	int method8189();

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(I)V")
	void method8190();

	@OriginalMember(owner = "client!rk", name = "b", descriptor = "(I)V")
	void method8191();

	@OriginalMember(owner = "client!rk", name = "c", descriptor = "(I)I")
	int method8192();
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public interface Interface24 {

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(IZ)V")
	void method2168(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(I)V")
	void method2169();

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(B)V")
	void method2170();

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(Z)I")
	int method2171();

	@OriginalMember(owner = "client!wl", name = "b", descriptor = "(I)I")
	int method2172();

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(ZJ)Z")
	boolean method2173(@OriginalArg(1) long arg0);
}

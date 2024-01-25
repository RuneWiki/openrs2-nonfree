import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wha")
public interface Interface27 {

	@OriginalMember(owner = "client!wha", name = "a", descriptor = "(B)I")
	int method8337();

	@OriginalMember(owner = "client!wha", name = "b", descriptor = "(B)V")
	void method8338();

	@OriginalMember(owner = "client!wha", name = "a", descriptor = "(Z)Z")
	boolean method8339();

	@OriginalMember(owner = "client!wha", name = "a", descriptor = "(ILclient!ha;)V")
	void method8340(@OriginalArg(1) Class16 arg0);

	@OriginalMember(owner = "client!wha", name = "a", descriptor = "(Lclient!ha;B)V")
	void method8341(@OriginalArg(0) Class16 arg0);

	@OriginalMember(owner = "client!wha", name = "c", descriptor = "(B)I")
	int method8342();

	@OriginalMember(owner = "client!wha", name = "d", descriptor = "(B)I")
	int method8343();
}

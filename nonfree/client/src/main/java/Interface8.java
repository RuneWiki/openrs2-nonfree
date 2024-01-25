import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fla")
public interface Interface8 {

	@OriginalMember(owner = "client!fla", name = "a", descriptor = "(Z)V")
	void method7188();

	@OriginalMember(owner = "client!fla", name = "a", descriptor = "(BJ)Z")
	boolean method7189(@OriginalArg(1) long arg0);

	@OriginalMember(owner = "client!fla", name = "b", descriptor = "(Z)V")
	void method7190();

	@OriginalMember(owner = "client!fla", name = "b", descriptor = "(I)I")
	int method7191();

	@OriginalMember(owner = "client!fla", name = "a", descriptor = "(IZ)V")
	void method7192(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!fla", name = "a", descriptor = "(I)I")
	int method7193();
}

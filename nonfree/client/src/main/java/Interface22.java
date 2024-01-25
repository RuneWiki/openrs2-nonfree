import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sn")
public interface Interface22 {

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(B)I")
	int method8776();

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(Z)I")
	int method8777();

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(ZZ)V")
	void method8778(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(I)V")
	void method8779();

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(JI)Z")
	boolean method8780(@OriginalArg(0) long arg0);

	@OriginalMember(owner = "client!sn", name = "b", descriptor = "(I)V")
	void method8781();
}

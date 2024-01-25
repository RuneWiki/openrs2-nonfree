import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public interface Interface25 {

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(I)I")
	int method8986();

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(Lclient!ha;Z)V")
	void method8987(@OriginalArg(0) Class145 arg0, @OriginalArg(1) boolean arg1);

	@OriginalMember(owner = "client!vi", name = "b", descriptor = "(I)V")
	void method8988();

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(Lclient!ha;I)V")
	void method8989(@OriginalArg(0) Class145 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(B)Z")
	boolean method8990(@OriginalArg(0) byte arg0);

	@OriginalMember(owner = "client!vi", name = "b", descriptor = "(B)I")
	int method8991(@OriginalArg(0) byte arg0);

	@OriginalMember(owner = "client!vi", name = "c", descriptor = "(I)I")
	int method8992();
}

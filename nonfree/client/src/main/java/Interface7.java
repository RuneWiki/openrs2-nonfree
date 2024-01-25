import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public interface Interface7 {

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(BILclient!ja;)Lclient!rc;")
	Class78 method5792(@OriginalArg(1) int arg0, @OriginalArg(2) Class81 arg1);

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)I")
	int method5793();

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(ZLclient!ja;)V")
	void method5794(@OriginalArg(1) Class81 arg0);

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(I)I")
	int method5795();

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!ja;I)V")
	void method5796(@OriginalArg(0) Class81 arg0);

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "(I)V")
	void method5797();

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(B)Z")
	boolean method5798();

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Z)I")
	int method5799();
}

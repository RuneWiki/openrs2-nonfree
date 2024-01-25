import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public interface Interface12 {

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(ZZ)V")
	void method5728(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(Z)V")
	void method5729();

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(JI)Z")
	boolean method5730(@OriginalArg(0) long arg0);

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(B)V")
	void method5731();

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)I")
	int method5732();

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "(I)I")
	int method5733();
}

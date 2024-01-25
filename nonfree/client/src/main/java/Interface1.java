import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aca")
public interface Interface1 {

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(ZZ)V")
	void method5713(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(I)V")
	void method5714();

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(B)V")
	void method5715();

	@OriginalMember(owner = "client!aca", name = "b", descriptor = "(B)I")
	int method5716();

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(JI)Z")
	boolean method5717(@OriginalArg(0) long arg0);

	@OriginalMember(owner = "client!aca", name = "c", descriptor = "(B)I")
	int method5718();
}

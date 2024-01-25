import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public interface Interface22 {

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(B)V")
	void method6463();

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(I)I")
	int method6464();

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "(I)I")
	int method6465();

	@OriginalMember(owner = "client!sa", name = "c", descriptor = "(I)V")
	void method6466();

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(ZB)V")
	void method6467(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(JI)Z")
	boolean method6468(@OriginalArg(0) long arg0);
}

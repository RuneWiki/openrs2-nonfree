import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ida")
public interface Interface10 {

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(I)I")
	int method6289();

	@OriginalMember(owner = "client!ida", name = "b", descriptor = "(I)V")
	void method6290();

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(Z)I")
	int method6291();

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(ZB)V")
	void method6292(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!ida", name = "c", descriptor = "(I)V")
	void method6293();

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(IJ)Z")
	boolean method6294(@OriginalArg(1) long arg0);
}

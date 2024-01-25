import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hp")
public interface Interface6 {

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(IZ)V")
	void method3965(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(B)I")
	int method3966();

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(I)Z")
	boolean method3967();

	@OriginalMember(owner = "client!hp", name = "b", descriptor = "(I)V")
	void method3968();

	@OriginalMember(owner = "client!hp", name = "c", descriptor = "(I)V")
	void method3969();
}

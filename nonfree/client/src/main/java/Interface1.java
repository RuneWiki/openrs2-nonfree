import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public interface Interface1 {

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(I)V")
	void method3556(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "()V")
	void method3557();

	@OriginalMember(owner = "client!ah", name = "b", descriptor = "()I")
	int method3558();

	@OriginalMember(owner = "client!ah", name = "c", descriptor = "()V")
	void method3559();
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public interface Interface4 {

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "()V")
	void method4403();

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "()I")
	int method4404();

	@OriginalMember(owner = "client!pf", name = "c", descriptor = "()V")
	void method4405();

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(I)V")
	void method4406(@OriginalArg(0) int arg0);
}

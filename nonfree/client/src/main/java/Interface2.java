import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gn")
public interface Interface2 {

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(I)V")
	void method4852(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "()V")
	void method4853();

	@OriginalMember(owner = "client!gn", name = "b", descriptor = "()I")
	int method4854();

	@OriginalMember(owner = "client!gn", name = "c", descriptor = "()V")
	void method4855();
}

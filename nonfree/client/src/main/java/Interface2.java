import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public interface Interface2 {

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "()I")
	int method3760();

	@OriginalMember(owner = "client!fk", name = "b", descriptor = "()V")
	void method3761();

	@OriginalMember(owner = "client!fk", name = "c", descriptor = "()V")
	void method3762();

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(I)V")
	void method3763(@OriginalArg(0) int arg0);
}

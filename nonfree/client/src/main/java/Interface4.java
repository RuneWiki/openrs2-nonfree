import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public interface Interface4 {

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "()V")
	void method3791();

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(I)V")
	void method3792(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!lj", name = "b", descriptor = "()I")
	int method3793();

	@OriginalMember(owner = "client!lj", name = "c", descriptor = "()V")
	void method3794();
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public interface Interface2 {

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "()V")
	void method3520();

	@OriginalMember(owner = "client!cl", name = "b", descriptor = "()V")
	void method3521();

	@OriginalMember(owner = "client!cl", name = "c", descriptor = "()I")
	int method3522();

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(I)V")
	void method3523(@OriginalArg(0) int arg0);
}

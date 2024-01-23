import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public interface Interface3 {

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "()I")
	int method3928();

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "()V")
	void method3929();

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)V")
	void method3930(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!hc", name = "c", descriptor = "()V")
	void method3931();
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public interface Interface3 {

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "()V")
	void method3960();

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "()V")
	void method3961();

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)V")
	void method3962(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ja", name = "c", descriptor = "()I")
	int method3963();
}

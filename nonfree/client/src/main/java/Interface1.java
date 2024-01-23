import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public interface Interface1 {

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "()V")
	void method4327();

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "()V")
	void method4328();

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)V")
	void method4329(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!bb", name = "c", descriptor = "()I")
	int method4330();
}

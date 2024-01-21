import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public interface Interface1 extends Runnable {

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(B)V")
	void method185();

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "([II)V")
	void method186(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)V")
	void method187();

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "(I)V")
	void method188();

	@OriginalMember(owner = "client!cd", name = "c", descriptor = "(I)I")
	int method189();

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "(B)V")
	void method190();
}

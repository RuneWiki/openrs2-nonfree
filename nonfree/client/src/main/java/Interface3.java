import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public interface Interface3 extends Runnable {

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(Z)V")
	void method1709();

	@OriginalMember(owner = "client!u", name = "b", descriptor = "(Z)V")
	void method1710();

	@OriginalMember(owner = "client!u", name = "a", descriptor = "([II)V")
	void method1711(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(B)I")
	int method1712();

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(I)V")
	void method1713();

	@OriginalMember(owner = "client!u", name = "b", descriptor = "(I)V")
	void method1714();
}

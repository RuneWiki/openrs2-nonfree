import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public interface Interface3 extends Runnable {

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(B)V")
	void method1716();

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Z)I")
	int method1717();

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)V")
	void method1718();

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(I)V")
	void method1719();

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "(I)V")
	void method1720();

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "([II)V")
	void method1721(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1);
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public interface Interface3 extends Runnable {

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)V")
	void method1679();

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "([II)V")
	void method1680(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(B)V")
	void method1681();

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(B)V")
	void method1682();

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(I)I")
	int method1683();

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "(B)V")
	void method1684();
}

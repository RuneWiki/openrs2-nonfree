import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public interface Interface4 extends Runnable {

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "([II)V")
	void method1624(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Z)V")
	void method1625();

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "(Z)V")
	void method1626();

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(I)V")
	void method1627();

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "(I)I")
	int method1628();

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(B)V")
	void method1629();
}

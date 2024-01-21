import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public interface Interface2 extends Runnable {

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(B)V")
	void method1235();

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)I")
	int method1236();

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(I)V")
	void method1237();

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "([II)V")
	void method1238(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(B)V")
	void method1239();

	@OriginalMember(owner = "client!nd", name = "c", descriptor = "(B)V")
	void method1240();
}

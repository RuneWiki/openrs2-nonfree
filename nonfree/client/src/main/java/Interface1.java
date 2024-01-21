import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public interface Interface1 extends Runnable {

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "([II)V")
	void method38(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)V")
	void method39();

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "(I)I")
	int method40();

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Z)V")
	void method41();

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "(I)V")
	void method42();

	@OriginalMember(owner = "client!ac", name = "d", descriptor = "(I)V")
	void method43();
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public interface Interface2 extends Runnable {

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Z)V")
	void method602();

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "([II)V")
	void method603(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(B)V")
	void method604();

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(Z)V")
	void method605();

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(B)V")
	void method606();

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)I")
	int method607();
}

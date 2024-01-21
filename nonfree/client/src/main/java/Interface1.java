import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public interface Interface1 extends Runnable {

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(B)V")
	void method585();

	@OriginalMember(owner = "client!db", name = "a", descriptor = "([II)V")
	void method586(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(I)V")
	void method587();

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(I)V")
	void method588();

	@OriginalMember(owner = "client!db", name = "c", descriptor = "(I)I")
	int method589();

	@OriginalMember(owner = "client!db", name = "d", descriptor = "(I)V")
	void method590();
}

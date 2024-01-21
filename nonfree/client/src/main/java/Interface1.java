import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public interface Interface1 extends Runnable {

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "([II)V")
	void method67(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)V")
	void method68();

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Z)V")
	void method69();

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "(I)V")
	void method70();

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "(I)V")
	void method71();

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(B)I")
	int method72();
}

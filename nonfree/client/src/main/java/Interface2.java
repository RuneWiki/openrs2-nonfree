import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public interface Interface2 extends Runnable {

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(Z)V")
	void method748();

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(B)V")
	void method749();

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "([II)V")
	void method750(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)V")
	void method751();

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "(I)V")
	void method752();

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "(B)I")
	int method753();
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public interface Interface3 extends Runnable {

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(B)V")
	void method791();

	@OriginalMember(owner = "client!id", name = "a", descriptor = "([II)V")
	void method792(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(I)V")
	void method793();

	@OriginalMember(owner = "client!id", name = "b", descriptor = "(I)V")
	void method794();

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(Z)V")
	void method795();

	@OriginalMember(owner = "client!id", name = "c", descriptor = "(I)I")
	int method796();
}

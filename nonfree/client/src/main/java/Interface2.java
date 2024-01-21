import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public interface Interface2 extends Runnable {

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(I)V")
	void method793();

	@OriginalMember(owner = "client!he", name = "a", descriptor = "([II)V")
	void method794(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(I)V")
	void method795();

	@OriginalMember(owner = "client!he", name = "c", descriptor = "(I)V")
	void method796();

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Z)V")
	void method797();

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(B)I")
	int method798();
}

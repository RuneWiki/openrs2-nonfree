import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public interface Interface1 extends Runnable {

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)V")
	void method128();

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "(I)V")
	void method129();

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "([II)V")
	void method130(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(B)V")
	void method131();

	@OriginalMember(owner = "client!bb", name = "c", descriptor = "(I)I")
	int method132();

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "(B)V")
	void method133();
}

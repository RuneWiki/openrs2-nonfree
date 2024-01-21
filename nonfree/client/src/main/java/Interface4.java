import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public interface Interface4 extends Runnable {

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "([II)V")
	void method725(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)V")
	void method726();

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(I)V")
	void method727();

	@OriginalMember(owner = "client!hd", name = "c", descriptor = "(I)I")
	int method728();

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Z)V")
	void method729();

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(B)V")
	void method730();
}

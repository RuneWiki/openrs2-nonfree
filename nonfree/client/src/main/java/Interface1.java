import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public interface Interface1 extends Runnable {

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)V")
	void method871();

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(I)I")
	int method872();

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(B)V")
	void method873();

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "([II)V")
	void method874(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "(I)V")
	void method875();

	@OriginalMember(owner = "client!jc", name = "d", descriptor = "(I)V")
	void method876();
}

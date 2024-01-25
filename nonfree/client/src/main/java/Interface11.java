import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!go")
public interface Interface11 extends Interface13 {

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(B)V")
	void method7567();

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(Z)Z")
	boolean method7563();

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(II)V")
	void method7560(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(ZB)Lclient!jaclib/memory/Buffer;")
	Buffer method7569();

	@OriginalMember(owner = "client!go", name = "b", descriptor = "(B)Lclient!eea;")
	Class82 method6271();
}

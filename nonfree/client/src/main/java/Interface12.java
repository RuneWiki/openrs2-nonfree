import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!js")
public interface Interface12 extends Interface13 {

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(ZB)Lclient!jaclib/memory/Buffer;")
	Buffer method7573();

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(I)V")
	void method7572();

	@OriginalMember(owner = "client!js", name = "b", descriptor = "(I)Z")
	boolean method7574();

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(ZI)V")
	void method7563(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!js", name = "c", descriptor = "(I)Lclient!jt;")
	Class182 method7575();
}

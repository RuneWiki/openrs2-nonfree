import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!or")
public interface Interface17 extends Interface2 {

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(ZZ)Lclient!jaclib/memory/Buffer;")
	Buffer method6938();

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(B)V")
	void method6939();

	@OriginalMember(owner = "client!or", name = "b", descriptor = "(B)Lclient!ro;")
	Class292 method6940();

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(Z)Z")
	boolean method6941();

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(IB)V")
	void method6942(@OriginalArg(0) int arg0);
}

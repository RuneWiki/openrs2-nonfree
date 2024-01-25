import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ru")
public interface Interface23 extends Interface11 {

	@OriginalMember(owner = "client!ru", name = "b", descriptor = "(B)Lclient!ew;")
	Class89 method4805();

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(I)V")
	void method7627();

	@OriginalMember(owner = "client!ru", name = "c", descriptor = "(B)Z")
	boolean method4806();

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(BZ)Lclient!jaclib/memory/Buffer;")
	Buffer method4807();

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(IB)V")
	void method7624(@OriginalArg(0) int arg0);
}

import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jn")
public interface Interface9 extends Interface1 {

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(I)Z")
	boolean method6460();

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(IB)V")
	void method5935(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jn", name = "b", descriptor = "(Z)V")
	void method6461();

	@OriginalMember(owner = "client!jn", name = "b", descriptor = "(I)Lclient!ps;")
	Class254 method5937();

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(BZ)Lclient!jaclib/memory/Buffer;")
	Buffer method6462();
}

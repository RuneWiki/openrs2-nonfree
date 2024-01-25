import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vv")
public interface Interface24 extends Interface16 {

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(I)Z")
	boolean method6459();

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(ZI)Lclient!jaclib/memory/Buffer;")
	Buffer method6460();

	@OriginalMember(owner = "client!vv", name = "b", descriptor = "(I)V")
	void method9037();

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(II)V")
	void method9031(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!vv", name = "b", descriptor = "(B)Lclient!dr;")
	Class79 method6461();
}

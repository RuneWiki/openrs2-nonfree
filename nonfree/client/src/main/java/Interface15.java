import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public interface Interface15 extends Interface2 {

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(B)V")
	void method9218();

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(IZ)Lclient!jaclib/memory/Buffer;")
	Buffer method4689();

	@OriginalMember(owner = "client!lg", name = "b", descriptor = "(I)Lclient!hk;")
	Class158 method4690();

	@OriginalMember(owner = "client!lg", name = "b", descriptor = "(B)Z")
	boolean method4691();

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(II)V")
	void method9224(@OriginalArg(0) int arg0);
}

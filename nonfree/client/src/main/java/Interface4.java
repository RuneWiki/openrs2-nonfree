import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public interface Interface4 extends Interface22 {

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(BZ)Lclient!jaclib/memory/Buffer;")
	Buffer method5680();

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(B)Lclient!bja;")
	Class36 method5681();

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(I)Z")
	boolean method5682();

	@OriginalMember(owner = "client!dk", name = "b", descriptor = "(B)V")
	void method5675();

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(II)V")
	void method5678(@OriginalArg(0) int arg0);
}

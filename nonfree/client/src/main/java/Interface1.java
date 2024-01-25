import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public interface Interface1 extends Interface13 {

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(ZI)V")
	void method5227(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)Z")
	boolean method5730();

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(B)V")
	void method5728();

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(BZ)Lclient!jaclib/memory/Buffer;")
	Buffer method5729();

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "(I)Lclient!sb;")
	Class264 method5231();
}

import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lp")
public interface Interface20 extends Interface8 {

	@OriginalMember(owner = "client!lp", name = "b", descriptor = "(IZ)Lclient!jaclib/memory/Buffer;")
	Buffer method7347();

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(B)Lclient!dn;")
	Class86 method7348();

	@OriginalMember(owner = "client!lp", name = "b", descriptor = "(I)Z")
	boolean method7349();

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(IZ)V")
	void method7350(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(I)V")
	void method7351();
}

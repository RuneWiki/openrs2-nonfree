import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public interface Interface1 extends Interface4 {

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(II)V")
	void method7526(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(B)Lclient!ui;")
	Class289 method7529();

	@OriginalMember(owner = "client!af", name = "b", descriptor = "(B)V")
	void method7527();

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(I)Z")
	boolean method7521();

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IZ)Lclient!jaclib/memory/Buffer;")
	Buffer method7519();
}

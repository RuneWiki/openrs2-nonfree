import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uq")
public interface Interface24 extends Interface15 {

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(I)Z")
	boolean method6474();

	@OriginalMember(owner = "client!uq", name = "b", descriptor = "(I)V")
	void method6475();

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(II)V")
	void method6476(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(ZZ)Lclient!jaclib/memory/Buffer;")
	Buffer method6477();

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(B)Lclient!baa;")
	Class26 method6478();
}

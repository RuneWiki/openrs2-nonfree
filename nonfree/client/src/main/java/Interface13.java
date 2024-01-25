import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ip")
public interface Interface13 extends Interface4 {

	@OriginalMember(owner = "client!ip", name = "b", descriptor = "(Z)Lclient!bk;")
	Class35 method7031();

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(I)V")
	void method7032();

	@OriginalMember(owner = "client!ip", name = "c", descriptor = "(Z)Z")
	boolean method7033();

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(BZ)Lclient!jaclib/memory/Buffer;")
	Buffer method7034();

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(II)V")
	void method7035(@OriginalArg(0) int arg0);
}

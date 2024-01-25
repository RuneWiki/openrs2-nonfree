import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public interface Interface15 extends Interface4 {

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(IILclient!jaclib/memory/Source;I)Z")
	boolean method6274(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Source arg2);

	@OriginalMember(owner = "client!ql", name = "b", descriptor = "(B)V")
	void method7527();

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(IZ)Lclient!jaclib/memory/Buffer;")
	Buffer method7519();

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(IIB)Z")
	boolean method6277(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(I)Z")
	boolean method7521();
}

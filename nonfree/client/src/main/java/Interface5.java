import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lca")
public interface Interface5 extends Interface13 {

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(III)Z")
	boolean method5727(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(B)V")
	void method5728();

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(BZ)Lclient!jaclib/memory/Buffer;")
	Buffer method5729();

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(I)Z")
	boolean method5730();

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(Lclient!jaclib/memory/Source;IBI)Z")
	boolean method5731(@OriginalArg(0) Source arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2);
}

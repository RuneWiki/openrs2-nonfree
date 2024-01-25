import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public interface Interface16 extends Interface2 {

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(I)Z")
	boolean method8363();

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(BZ)Lclient!jaclib/memory/Buffer;")
	Buffer method8364();

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Z)Lclient!dw;")
	Class79 method8365();

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(II)V")
	void method8360(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!je", name = "b", descriptor = "(B)V")
	void method8358();
}

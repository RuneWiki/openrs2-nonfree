import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public interface Interface21 extends Interface14 {

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(IZ)Lclient!jaclib/memory/Buffer;")
	Buffer method6521();

	@OriginalMember(owner = "client!tj", name = "b", descriptor = "(B)V")
	void method6520();

	@OriginalMember(owner = "client!tj", name = "b", descriptor = "(I)Lclient!nb;")
	Class220 method5021();

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(II)V")
	void method5022(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(I)Z")
	boolean method6524();
}

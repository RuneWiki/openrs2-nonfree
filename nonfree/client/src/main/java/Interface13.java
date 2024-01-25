import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mda")
public interface Interface13 extends Interface5 {

	@OriginalMember(owner = "client!mda", name = "b", descriptor = "(I)Z")
	boolean method6433();

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(B)Lclient!rt;")
	Class298 method6434();

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(IB)V")
	void method6435(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!mda", name = "b", descriptor = "(B)V")
	void method6436();

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(ZI)Lclient!jaclib/memory/Buffer;")
	Buffer method6437();
}

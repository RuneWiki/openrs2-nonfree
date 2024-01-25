import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public interface Interface11 extends Interface8 {

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(ZI)Lclient!jaclib/memory/Buffer;")
	Buffer method3077();

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(BI)V")
	void method8437(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "(I)Z")
	boolean method3078();

	@OriginalMember(owner = "client!jf", name = "c", descriptor = "(I)Lclient!ok;")
	Class242 method3079();

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(Z)V")
	void method8431();
}

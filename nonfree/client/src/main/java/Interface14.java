import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oq")
public interface Interface14 extends Interface13 {

	@OriginalMember(owner = "client!oq", name = "b", descriptor = "(I)V")
	void method6765();

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(BI)V")
	void method6764(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(I)Lclient!al;")
	Class19 method6768();

	@OriginalMember(owner = "client!oq", name = "b", descriptor = "(B)Z")
	boolean method6769();

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(ZI)Lclient!jaclib/memory/Buffer;")
	Buffer method6770();
}

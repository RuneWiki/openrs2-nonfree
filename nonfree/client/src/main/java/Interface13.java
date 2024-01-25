import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sp")
public interface Interface13 extends Interface5 {

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(B)Lclient!vt;")
	Class306 method3497();

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(ZB)Lclient!jaclib/memory/Buffer;")
	Buffer method3487();

	@OriginalMember(owner = "client!sp", name = "b", descriptor = "(I)V")
	void method3493();

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(II)V")
	void method3488(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!sp", name = "c", descriptor = "(I)Z")
	boolean method3492();
}

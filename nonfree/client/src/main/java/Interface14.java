import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nq")
public interface Interface14 extends Interface5 {

	@OriginalMember(owner = "client!nq", name = "c", descriptor = "(I)Lclient!vt;")
	Class310 method3134();

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(I)Z")
	boolean method3135();

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(ZI)Lclient!jaclib/memory/Buffer;")
	Buffer method3136();

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(II)V")
	void method3137(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(Z)V")
	void method3138();
}

import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public interface Interface8 extends Interface19 {

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(I)Z")
	boolean method5081();

	@OriginalMember(owner = "client!fm", name = "b", descriptor = "(B)Lclient!al;")
	Class19 method5082();

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(B)V")
	void method5842();

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(II)V")
	void method5084(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(ZI)Lclient!jaclib/memory/Buffer;")
	Buffer method5085();
}

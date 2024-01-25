import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cda")
public interface Interface3 extends Interface20 {

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(ZB)Lclient!jaclib/memory/Buffer;")
	Buffer method5235();

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(Z)Lclient!bv;")
	Class42 method5236();

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(I)Z")
	boolean method5237();

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(II)V")
	void method5228(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(B)V")
	void method5230();
}

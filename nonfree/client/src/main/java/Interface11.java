import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iaa")
public interface Interface11 extends Interface26 {

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(IZ)Lclient!jaclib/memory/Buffer;")
	Buffer method7405();

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(B)V")
	void method8446();

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(II)V")
	void method7407(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!iaa", name = "b", descriptor = "(B)Lclient!wha;")
	Class381 method7408();

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(Z)Z")
	boolean method7409();
}

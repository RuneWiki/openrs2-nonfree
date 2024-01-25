import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public interface Interface22 extends Interface4 {

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IZ)Lclient!jaclib/memory/Buffer;")
	Buffer method7405();

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(B)Lclient!wj;")
	Class389 method7406();

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "(I)Z")
	boolean method7407();

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(II)V")
	void method7408(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ra", name = "c", descriptor = "(I)V")
	void method7409();
}

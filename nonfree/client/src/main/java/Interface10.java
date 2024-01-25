import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ida")
public interface Interface10 extends Interface12 {

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(I)Lclient!ti;")
	Class324 method7681();

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(ZB)Lclient!jaclib/memory/Buffer;")
	Buffer method7682();

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(II)V")
	void method7675(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ida", name = "b", descriptor = "(I)Z")
	boolean method7683();

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(Z)V")
	void method7671();
}

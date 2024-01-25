import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jea")
public interface Interface13 extends Interface10 {

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "(I)Lclient!jg;")
	Class172 method5599();

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "(II)V")
	void method5600(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jea", name = "b", descriptor = "(I)V")
	void method5601();

	@OriginalMember(owner = "client!jea", name = "b", descriptor = "(Z)Z")
	boolean method5602();

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "(IZ)Lclient!jaclib/memory/Buffer;")
	Buffer method5603();
}

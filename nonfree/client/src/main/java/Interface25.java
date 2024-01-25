import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uba")
public interface Interface25 extends Interface18 {

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(Z)V")
	void method8675();

	@OriginalMember(owner = "client!uba", name = "b", descriptor = "(Z)Z")
	boolean method8676();

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(BZ)Lclient!jaclib/memory/Buffer;")
	Buffer method8677();

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(I)Lclient!on;")
	Class274 method8678();

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(II)V")
	void method8679(@OriginalArg(0) int arg0);
}

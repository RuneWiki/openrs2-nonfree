import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ft")
public interface Interface8 extends Interface14 {

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(B)V")
	void method7146();

	@OriginalMember(owner = "client!ft", name = "b", descriptor = "(B)Lclient!ne;")
	Class239 method7147();

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(II)V")
	void method7148(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(BZ)Lclient!jaclib/memory/Buffer;")
	Buffer method7149();

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(I)Z")
	boolean method7150();
}

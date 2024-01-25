import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public interface Interface11 extends Interface4 {

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(BZ)Lclient!jaclib/memory/Buffer;")
	Buffer method4114();

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)Lclient!bt;")
	Class42 method4115();

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "(I)V")
	void method5772();

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(II)V")
	void method4117(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "(B)Z")
	boolean method4118();
}

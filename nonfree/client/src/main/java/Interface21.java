import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public interface Interface21 extends Interface23 {

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IZ)Lclient!jaclib/memory/Buffer;")
	Buffer method5730();

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(Z)V")
	void method7716();

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IB)V")
	void method5732(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(B)Lclient!ns;")
	Class247 method5733();

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(I)Z")
	boolean method5734();
}

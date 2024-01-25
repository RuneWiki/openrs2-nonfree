import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public interface Interface11 extends Interface18 {

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(II)V")
	void method6757(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(I)V")
	void method6754();

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(Z)Z")
	boolean method5366();

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(ZB)Lclient!jaclib/memory/Buffer;")
	Buffer method5367();

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(B)Lclient!hu;")
	Class167 method5368();
}

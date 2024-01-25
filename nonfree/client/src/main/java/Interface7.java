import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public interface Interface7 extends Interface16 {

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(ZB)Lclient!jaclib/memory/Buffer;")
	Buffer method6952();

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(I)Z")
	boolean method6954();

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(ZI)V")
	void method6949(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(Z)V")
	void method6953();

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(B)Lclient!lc;")
	Class171 method6955();
}

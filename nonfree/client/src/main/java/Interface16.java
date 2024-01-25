import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mq")
public interface Interface16 extends Interface9 {

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(I)Z")
	boolean method7862();

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(ZI)V")
	void method7863(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(BZ)Lclient!jaclib/memory/Buffer;")
	Buffer method7864();

	@OriginalMember(owner = "client!mq", name = "b", descriptor = "(B)Lclient!kn;")
	Class206 method7865();

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(B)V")
	void method7866();
}

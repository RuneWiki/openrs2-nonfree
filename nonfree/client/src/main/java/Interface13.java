import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kga")
public interface Interface13 extends Interface11 {

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(ZB)Lclient!jaclib/memory/Buffer;")
	Buffer method7648();

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(B)Lclient!vea;")
	Class340 method7649();

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(II)V")
	void method7650(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!kga", name = "b", descriptor = "(B)V")
	void method7651();

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(Z)Z")
	boolean method7652();
}

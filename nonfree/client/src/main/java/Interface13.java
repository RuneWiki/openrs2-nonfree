import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kga")
public interface Interface13 extends Interface6 {

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(II)V")
	void method6500(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!kga", name = "c", descriptor = "(Z)Lclient!jm;")
	Class160 method4653();

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(IZ)Lclient!jaclib/memory/Buffer;")
	Buffer method4654();

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(I)Z")
	boolean method4655();

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(Z)V")
	void method6496();
}

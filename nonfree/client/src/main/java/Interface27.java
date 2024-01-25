import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public interface Interface27 extends Interface2 {

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(II)V")
	void method8101(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(Z)V")
	void method8104();

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "(I)Lclient!kq;")
	Class176 method7961();

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(ZI)Lclient!jaclib/memory/Buffer;")
	Buffer method7962();

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(B)Z")
	boolean method7963();
}

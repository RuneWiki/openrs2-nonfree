import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rr")
public interface Interface19 extends Interface6 {

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(IB)V")
	void method7981(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(I)V")
	void method7982();

	@OriginalMember(owner = "client!rr", name = "b", descriptor = "(I)Lclient!wq;")
	Class376 method7983();

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(ZB)Lclient!jaclib/memory/Buffer;")
	Buffer method7984();

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(B)Z")
	boolean method7985();
}

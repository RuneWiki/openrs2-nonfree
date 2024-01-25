import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public interface Interface20 extends Interface6 {

	@OriginalMember(owner = "client!ui", name = "b", descriptor = "(I)Z")
	boolean method6241();

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(I)V")
	void method6239();

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(IB)V")
	void method6240(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(ZZ)Lclient!jaclib/memory/Buffer;")
	Buffer method6243();

	@OriginalMember(owner = "client!ui", name = "c", descriptor = "(I)Lclient!lj;")
	Class200 method6246();
}

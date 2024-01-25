import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public interface Interface4 extends Interface6 {

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(Lclient!jaclib/memory/Source;BII)Z")
	boolean method6504(@OriginalArg(0) Source arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(B)Z")
	boolean method6505();

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(ZI)Lclient!jaclib/memory/Buffer;")
	Buffer method6506();

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(III)Z")
	boolean method6507(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(Z)V")
	void method6496();
}

import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public interface Interface6 extends Interface18 {

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(Z)V")
	void method8675();

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(I)Z")
	boolean method3657();

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(ZZ)Lclient!jaclib/memory/Buffer;")
	Buffer method3658();

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(III)Z")
	boolean method3659(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(BLclient!jaclib/memory/Source;II)Z")
	boolean method3660(@OriginalArg(1) Source arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2);
}

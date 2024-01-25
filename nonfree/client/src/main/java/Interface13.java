import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public interface Interface13 extends Interface17 {

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(ZZ)Lclient!jaclib/memory/Buffer;")
	Buffer method4095();

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(I)V")
	void method4091();

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(B)Z")
	boolean method4094();

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(ILclient!jaclib/memory/Source;II)Z")
	boolean method1883(@OriginalArg(1) Source arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IBI)Z")
	boolean method1884(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);
}

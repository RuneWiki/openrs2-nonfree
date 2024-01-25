import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oda")
public interface Interface19 extends Interface2 {

	@OriginalMember(owner = "client!oda", name = "b", descriptor = "(B)V")
	void method8358();

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(Lclient!jaclib/memory/Source;IBI)Z")
	boolean method6565(@OriginalArg(0) Source arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(ZB)Lclient!jaclib/memory/Buffer;")
	Buffer method6566();

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(IBI)Z")
	boolean method6567(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(I)Z")
	boolean method6568();
}

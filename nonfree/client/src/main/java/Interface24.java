import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wr")
public interface Interface24 extends Interface11 {

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(Lclient!jaclib/memory/Source;III)Z")
	boolean method6517(@OriginalArg(0) Source arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(IBI)Z")
	boolean method6518(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(ZB)Lclient!jaclib/memory/Buffer;")
	Buffer method6519();

	@OriginalMember(owner = "client!wr", name = "b", descriptor = "(I)Z")
	boolean method6520();

	@OriginalMember(owner = "client!wr", name = "b", descriptor = "(B)V")
	void method7651();
}

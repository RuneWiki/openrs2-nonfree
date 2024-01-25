import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!su")
public interface Interface19 extends Interface5 {

	@OriginalMember(owner = "client!su", name = "b", descriptor = "(I)Z")
	boolean method6251();

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(ZZ)Lclient!jaclib/memory/Buffer;")
	Buffer method6252();

	@OriginalMember(owner = "client!su", name = "b", descriptor = "(B)V")
	void method6436();

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(IILclient!jaclib/memory/Source;I)Z")
	boolean method6254(@OriginalArg(1) int arg0, @OriginalArg(2) Source arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(IIB)Z")
	boolean method6255(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);
}

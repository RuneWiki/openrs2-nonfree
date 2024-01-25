import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lq")
public interface Interface14 extends Interface18 {

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(IZ)Lclient!jaclib/memory/Buffer;")
	Buffer method6764();

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(IIBLclient!jaclib/memory/Source;)Z")
	boolean method6765(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Source arg2);

	@OriginalMember(owner = "client!lq", name = "b", descriptor = "(I)Z")
	boolean method6766();

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(IIZ)Z")
	boolean method6767(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(I)V")
	void method6754();
}

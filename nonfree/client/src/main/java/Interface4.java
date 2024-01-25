import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bca")
public interface Interface4 extends Interface1 {

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(I)V")
	void method7384();

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(ZI)Lclient!jaclib/memory/Buffer;")
	Buffer method2465();

	@OriginalMember(owner = "client!bca", name = "b", descriptor = "(B)Z")
	boolean method2466();

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(IIILclient!jaclib/memory/Source;)Z")
	boolean method2467(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Source arg2);

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(III)Z")
	boolean method2468(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);
}

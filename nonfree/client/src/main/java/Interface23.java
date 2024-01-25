import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public interface Interface23 extends Interface10 {

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "(I)V")
	void method5601();

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(III)Z")
	boolean method5569(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(ZI)Lclient!jaclib/memory/Buffer;")
	Buffer method5570();

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lclient!jaclib/memory/Source;III)Z")
	boolean method5571(@OriginalArg(0) Source arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(I)Z")
	boolean method5572();
}

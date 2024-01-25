import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public interface Interface24 extends Interface2 {

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(B)V")
	void method9218();

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(BII)Z")
	boolean method9227(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(ZB)Lclient!jaclib/memory/Buffer;")
	Buffer method9228();

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(BILclient!jaclib/memory/Source;I)Z")
	boolean method9229(@OriginalArg(1) int arg0, @OriginalArg(2) Source arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!uh", name = "b", descriptor = "(B)Z")
	boolean method9230();
}

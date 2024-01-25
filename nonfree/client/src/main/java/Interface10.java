import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public interface Interface10 extends Interface22 {

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(IILclient!jaclib/memory/Source;I)Z")
	boolean method3993(@OriginalArg(0) int arg0, @OriginalArg(2) Source arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(IIZ)Z")
	boolean method3994(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(I)Z")
	boolean method3995();

	@OriginalMember(owner = "client!hl", name = "b", descriptor = "(B)V")
	void method5675();

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(BZ)Lclient!jaclib/memory/Buffer;")
	Buffer method3996();
}

import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public interface Interface26 extends Interface11 {

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(BZ)Lclient!jaclib/memory/Buffer;")
	Buffer method7632();

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(III)Z")
	boolean method7633(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IIILclient!jaclib/memory/Source;)Z")
	boolean method7634(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Source arg2);

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(I)V")
	void method7627();

	@OriginalMember(owner = "client!u", name = "b", descriptor = "(B)Z")
	boolean method7635();
}

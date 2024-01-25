import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public interface Interface11 extends Interface6 {

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(I)V")
	void method7982();

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(III)Z")
	boolean method6373(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(BZ)Lclient!jaclib/memory/Buffer;")
	Buffer method6374();

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(B)Z")
	boolean method6375();

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(ILclient!jaclib/memory/Source;II)Z")
	boolean method6376(@OriginalArg(0) int arg0, @OriginalArg(1) Source arg1, @OriginalArg(3) int arg2);
}

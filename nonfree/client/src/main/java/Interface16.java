import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lq")
public interface Interface16 extends Interface9 {

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(IIZ)Z")
	boolean method7121(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(BZ)Lclient!jaclib/memory/Buffer;")
	Buffer method7122();

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(Z)V")
	void method9249();

	@OriginalMember(owner = "client!lq", name = "b", descriptor = "(I)Z")
	boolean method7124();

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(Lclient!jaclib/memory/Source;BII)Z")
	boolean method7125(@OriginalArg(0) Source arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2);
}

import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!up")
public interface Interface16 extends Interface5 {

	@OriginalMember(owner = "client!up", name = "b", descriptor = "(I)V")
	void method3493();

	@OriginalMember(owner = "client!up", name = "c", descriptor = "(I)Z")
	boolean method3492();

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(ZB)Lclient!jaclib/memory/Buffer;")
	Buffer method3487();

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(ILclient!jaclib/memory/Source;II)Z")
	boolean method3463(@OriginalArg(1) Source arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(IIB)Z")
	boolean method3464(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);
}

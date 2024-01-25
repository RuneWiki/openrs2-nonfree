import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eu")
public interface Interface4 extends Interface14 {

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(B)V")
	void method7146();

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(I)Z")
	boolean method7150();

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(III)Z")
	boolean method3559(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(BZ)Lclient!jaclib/memory/Buffer;")
	Buffer method7149();

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(BIILclient!jaclib/memory/Source;)Z")
	boolean method3561(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Source arg2);
}

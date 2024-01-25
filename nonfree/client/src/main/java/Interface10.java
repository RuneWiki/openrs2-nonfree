import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public interface Interface10 {

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(BII[B)V")
	void method5743(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1);

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(I)I")
	int method5744();

	@OriginalMember(owner = "client!oj", name = "b", descriptor = "(I)J")
	long method5745();

	@OriginalMember(owner = "client!oj", name = "c", descriptor = "(I)I")
	int method5746();
}

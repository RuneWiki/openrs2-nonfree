import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ew")
public interface Interface10 {

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(I)I")
	int method6466();

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(B)J")
	long method6467();

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(I[BII)V")
	void method6468(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!ew", name = "b", descriptor = "(I)I")
	int method6469();
}

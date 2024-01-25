import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public interface Interface10 {

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(I[BII)V")
	void method5245(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(I)I")
	int method5246();

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(I)J")
	long method5247();

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Z)I")
	int method5248();
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nu")
public interface Interface10 {

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(Z)I")
	int method6547();

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(I)I")
	int method6548();

	@OriginalMember(owner = "client!nu", name = "b", descriptor = "(I)J")
	long method6549();

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(B[BII)V")
	void method6550(@OriginalArg(1) byte[] arg0, @OriginalArg(3) int arg1);
}

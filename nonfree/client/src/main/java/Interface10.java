import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public interface Interface10 {

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(Z)I")
	int method1315();

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(I)I")
	int method1316();

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(I[BII)V")
	void method1317(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1);

	@OriginalMember(owner = "client!gh", name = "b", descriptor = "(I)J")
	long method1318();
}

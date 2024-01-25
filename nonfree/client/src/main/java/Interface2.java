import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public interface Interface2 {

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(B)J")
	long method3823();

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(ZI[BI)V")
	void method3824(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1);

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)I")
	int method3825();

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(Z)I")
	int method3826();
}

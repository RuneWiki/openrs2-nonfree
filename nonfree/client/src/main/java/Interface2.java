import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public interface Interface2 {

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IZ)[I")
	int[] method1867(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(II)Z")
	boolean method1868(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(BI)I")
	int method1869(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IB)Z")
	boolean method1870(@OriginalArg(0) int arg0);
}

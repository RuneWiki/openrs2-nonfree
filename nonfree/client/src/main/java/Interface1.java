import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public interface Interface1 {

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(II)Z")
	boolean method776(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!af", name = "b", descriptor = "(II)I")
	int method777(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(BI)[I")
	int[] method778(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IB)Z")
	boolean method779(@OriginalArg(0) int arg0);
}

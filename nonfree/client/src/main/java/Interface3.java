import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public interface Interface3 {

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(II)I")
	int method616(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IZ)Z")
	boolean method617(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(ZI)Z")
	boolean method618(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(II)Z")
	boolean method619(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "(II)[I")
	int[] method620(@OriginalArg(0) int arg0);
}

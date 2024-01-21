import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public interface Interface2 {

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(II)Z")
	boolean method490(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(BI)I")
	int method491(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(II)[I")
	int[] method492(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!da", name = "c", descriptor = "(II)Z")
	boolean method493(@OriginalArg(1) int arg0);
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public interface Interface9 {

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(II)Lclient!au;")
	Class17 method947(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(ZIIFIB)[I")
	int[] method948(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IZ)Z")
	boolean method949(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)I")
	int method950();

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(FIZIIZ)[F")
	float[] method951(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3);

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(FZIBII)[I")
	int[] method952(@OriginalArg(0) float arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3);
}

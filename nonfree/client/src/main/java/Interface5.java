import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public interface Interface5 {

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IIFIIZ)[I")
	int[] method4127(@OriginalArg(1) int arg0, @OriginalArg(2) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4);

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(B)I")
	int method4128();

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(II)Lclient!vk;")
	Class355 method4129(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IZ)Z")
	boolean method4130(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IBIZIF)[I")
	int[] method4131(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) float arg3);

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(FIIIZI)[F")
	float[] method4132(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3);
}

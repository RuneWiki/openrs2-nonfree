import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public interface Interface7 {

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(IIFIIZ)[I")
	int[] method5777(@OriginalArg(1) int arg0, @OriginalArg(2) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4);

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(BI)Lclient!wm;")
	Class213 method5778(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(ZIIIIF)[F")
	float[] method5779(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) float arg3);

	@OriginalMember(owner = "client!ul", name = "b", descriptor = "(BI)Z")
	boolean method5780(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(ZIIFII)[I")
	int[] method5781(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float arg2, @OriginalArg(5) int arg3);
}

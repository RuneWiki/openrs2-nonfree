import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public interface Interface11 {

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(ZFIIIB)[I")
	int[] method6210(@OriginalArg(1) float arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3);

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(ZIIIIF)[I")
	int[] method6211(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) float arg4);

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IIBIZF)[F")
	float[] method6212(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) float arg3);

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(II)Z")
	boolean method6213(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(I)I")
	int method6214();

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(BI)Lclient!sr;")
	Class278 method6215(@OriginalArg(1) int arg0);
}

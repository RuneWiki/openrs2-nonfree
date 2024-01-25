import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public interface Interface3 {

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(BZIIIF)[I")
	int[] method6176(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) float arg3);

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(BI)Lclient!lv;")
	Class224 method6177(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(I)I")
	int method6178();

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IIFIIZ)[F")
	float[] method6179(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(4) int arg3);

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(BIIZIF)[I")
	int[] method6180(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) float arg4);

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(II)Z")
	boolean method6181(@OriginalArg(1) int arg0);
}

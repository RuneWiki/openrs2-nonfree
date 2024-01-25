import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public interface Interface2 {

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(II)Z")
	boolean method1024(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IIFBIZ)[I")
	int[] method1025(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4);

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(BFIZII)[I")
	int[] method1026(@OriginalArg(1) float arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3);

	@OriginalMember(owner = "client!d", name = "b", descriptor = "(II)Lclient!bl;")
	Class32 method1027(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(B)I")
	int method1028();

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(FIIZII)[F")
	float[] method1029(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3);
}

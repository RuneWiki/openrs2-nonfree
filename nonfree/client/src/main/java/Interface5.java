import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public interface Interface5 {

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(ZFIIIZ)[I")
	int[] method1618(@OriginalArg(1) float arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3);

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IZ)Z")
	boolean method1619(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!pe", name = "l", descriptor = "(II)Lclient!ob;")
	Class124 method1620(@OriginalArg(1) int arg0);
}

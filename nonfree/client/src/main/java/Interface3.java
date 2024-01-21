import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public interface Interface3 {

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(II)Z")
	boolean method2046(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "(II)Z")
	boolean method2047(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ph", name = "c", descriptor = "(II)I")
	int method2048(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(FII)[I")
	int[] method2049(@OriginalArg(0) float arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(ZI)[I")
	int[] method2050(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ph", name = "d", descriptor = "(II)Z")
	boolean method2051(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ph", name = "e", descriptor = "(II)Z")
	boolean method2052(@OriginalArg(0) int arg0);
}

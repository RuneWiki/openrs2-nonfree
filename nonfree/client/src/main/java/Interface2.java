import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public interface Interface2 {

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(ZIZFII)[F")
	float[] method948(@OriginalArg(1) int arg0, @OriginalArg(3) float arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3);

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IBZIIF)[I")
	int[] method949(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) float arg4);

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(ZIIIFI)[I")
	int[] method950(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) float arg2, @OriginalArg(5) int arg3);

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(II)Lclient!jh;")
	Class116 method951(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "(II)Z")
	boolean method952(@OriginalArg(0) int arg0);
}

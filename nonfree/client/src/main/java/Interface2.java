import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public interface Interface2 {

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(II)Z")
	boolean method1328(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(II)[I")
	int[] method1329(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!na", name = "c", descriptor = "(II)Z")
	boolean method1330(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!na", name = "d", descriptor = "(II)I")
	int method1331(@OriginalArg(0) int arg0);
}

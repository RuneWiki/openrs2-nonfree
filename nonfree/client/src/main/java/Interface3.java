import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public interface Interface3 {

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(ZI)I")
	int method1220(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(II)Z")
	boolean method1221(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(BI)Z")
	boolean method1222(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(BI)[I")
	int[] method1223(@OriginalArg(1) int arg0);
}

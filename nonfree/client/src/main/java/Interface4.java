import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public interface Interface4 {

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(II)[I")
	int[] method1306(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(BI)Z")
	boolean method1307(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(ZI)I")
	int method1308(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IB)Z")
	boolean method1309(@OriginalArg(0) int arg0);
}

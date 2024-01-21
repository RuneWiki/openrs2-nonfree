import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public interface Interface1 {

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IB)I")
	int method1163(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(IB)Z")
	boolean method1164(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(ZI)[I")
	int[] method1165(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(II)Z")
	boolean method1166(@OriginalArg(0) int arg0);
}

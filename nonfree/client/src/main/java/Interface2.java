import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public interface Interface2 {

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(II)Z")
	boolean method252(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "(II)Z")
	boolean method253(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIF)[I")
	int[] method254(@OriginalArg(0) int arg0, @OriginalArg(2) float arg1);

	@OriginalMember(owner = "client!hh", name = "c", descriptor = "(II)Z")
	boolean method255(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!hh", name = "d", descriptor = "(II)Z")
	boolean method256(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!hh", name = "e", descriptor = "(II)I")
	int method257(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(BI)[I")
	int[] method258(@OriginalArg(1) int arg0);
}

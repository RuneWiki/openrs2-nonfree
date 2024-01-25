import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public interface Interface1 {

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IB)I")
	int method3820(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(II)I")
	int method3821(@OriginalArg(0) int arg0);
}

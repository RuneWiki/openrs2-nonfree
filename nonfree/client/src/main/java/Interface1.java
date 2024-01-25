import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ada")
public interface Interface1 {

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(IB)I")
	int method5699(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ada", name = "b", descriptor = "(IB)I")
	int method5700(@OriginalArg(0) int arg0);
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!es")
public interface Interface6 {

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(II)I")
	int method5776(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!es", name = "b", descriptor = "(II)I")
	int method5777(@OriginalArg(1) int arg0);
}

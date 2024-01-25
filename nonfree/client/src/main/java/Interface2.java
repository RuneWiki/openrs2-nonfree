import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bfa")
public interface Interface2 {

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(II)I")
	int method5864(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(ZI)I")
	int method5865(@OriginalArg(1) int arg0);
}

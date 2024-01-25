import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public interface Interface2 {

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(ZI)I")
	int method5678(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(II)I")
	int method5679(@OriginalArg(0) int arg0);
}

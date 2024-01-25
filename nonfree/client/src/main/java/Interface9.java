import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ro")
public interface Interface9 {

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(II)I")
	int method5593(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ro", name = "b", descriptor = "(II)I")
	int method5594(@OriginalArg(1) int arg0);
}

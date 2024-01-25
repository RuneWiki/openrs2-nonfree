import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public interface Interface5 {

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(II)I")
	int method494(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "(II)I")
	int method495(@OriginalArg(0) int arg0);
}

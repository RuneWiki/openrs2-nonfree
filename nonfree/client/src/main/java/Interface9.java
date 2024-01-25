import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kca")
public interface Interface9 {

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(II)I")
	int method787(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(ZI)I")
	int method788(@OriginalArg(1) int arg0);
}

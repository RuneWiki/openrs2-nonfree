import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cp")
public interface Interface5 {

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(BI)I")
	int method4743(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(II)I")
	int method4744(@OriginalArg(0) int arg0);
}

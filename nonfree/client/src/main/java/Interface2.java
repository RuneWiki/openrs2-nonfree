import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public interface Interface2 {

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(BI)I")
	int method2733(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(II)I")
	int method2734(@OriginalArg(0) int arg0);
}

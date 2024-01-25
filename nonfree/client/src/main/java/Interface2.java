import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ada")
public interface Interface2 {

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(BI)I")
	int method2865(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(IZ)I")
	int method2866(@OriginalArg(0) int arg0);
}

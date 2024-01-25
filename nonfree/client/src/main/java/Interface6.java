import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public interface Interface6 {

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(II)I")
	int method4927(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!dk", name = "b", descriptor = "(II)I")
	int method4928(@OriginalArg(1) int arg0);
}

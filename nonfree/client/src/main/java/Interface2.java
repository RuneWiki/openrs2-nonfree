import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public interface Interface2 {

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(II)I")
	int method5153(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(II)I")
	int method5154(@OriginalArg(0) int arg0);
}

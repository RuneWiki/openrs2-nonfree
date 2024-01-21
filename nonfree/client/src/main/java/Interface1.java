import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public interface Interface1 {

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(II)Z")
	boolean method5(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "(II)[I")
	int[] method6(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ee", name = "c", descriptor = "(II)I")
	int method7(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ee", name = "d", descriptor = "(II)Z")
	boolean method8(@OriginalArg(0) int arg0);
}

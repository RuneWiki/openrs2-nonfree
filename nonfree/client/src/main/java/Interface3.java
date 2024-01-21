import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public interface Interface3 {

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(II)Z")
	boolean method5(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IZ)[I")
	int[] method6(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(ZI)I")
	int method7(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "(II)Z")
	boolean method8(@OriginalArg(1) int arg0);
}

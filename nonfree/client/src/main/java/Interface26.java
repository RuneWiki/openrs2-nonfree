import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wfa")
public interface Interface26 {

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(B)I")
	int method5255();

	@OriginalMember(owner = "client!wfa", name = "b", descriptor = "(B)J")
	long method5256();

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "([BIII)V")
	void method5257(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!wfa", name = "c", descriptor = "(B)I")
	int method5258();
}

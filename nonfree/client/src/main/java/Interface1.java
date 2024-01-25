import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cw")
public interface Interface1 {

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(Z)J")
	long method1696();

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(I)I")
	int method1697();

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(B)I")
	int method1698();

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(BI[BI)V")
	void method1699(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2);
}

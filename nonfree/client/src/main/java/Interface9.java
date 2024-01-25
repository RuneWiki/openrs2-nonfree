import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public interface Interface9 {

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(I)I")
	int method3687();

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "(I)J")
	long method3688();

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(II[BI)V")
	void method3689(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2);

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(Z)I")
	int method3690();
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public interface Interface11 {

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(B)J")
	long method5884();

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)I")
	int method5885();

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "(B)I")
	int method5886();

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(II[BI)V")
	void method5887(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1);
}

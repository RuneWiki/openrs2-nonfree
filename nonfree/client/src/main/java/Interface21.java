import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ut")
public interface Interface21 {

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(I)I")
	int method7593();

	@OriginalMember(owner = "client!ut", name = "b", descriptor = "(I)I")
	int method7594();

	@OriginalMember(owner = "client!ut", name = "c", descriptor = "(I)J")
	long method7595();

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(II[BI)V")
	void method7596(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2);
}

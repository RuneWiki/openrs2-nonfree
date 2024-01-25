import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public interface Interface17 {

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(I)I")
	int method5959();

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(II[BI)V")
	void method5960(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1);

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "(I)I")
	int method5961();

	@OriginalMember(owner = "client!pa", name = "c", descriptor = "(I)J")
	long method5962();
}

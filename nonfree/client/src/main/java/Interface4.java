import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lp")
public interface Interface4 {

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(II[BI)V")
	void method4586(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1);

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(I)I")
	int method4587();

	@OriginalMember(owner = "client!lp", name = "b", descriptor = "(I)I")
	int method4588();

	@OriginalMember(owner = "client!lp", name = "c", descriptor = "(I)J")
	long method4589();
}

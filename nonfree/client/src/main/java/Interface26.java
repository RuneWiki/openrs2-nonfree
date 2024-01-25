import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vn")
public interface Interface26 {

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(I)I")
	int method3631();

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(II[BI)V")
	void method3632(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2);

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(Z)I")
	int method3633();

	@OriginalMember(owner = "client!vn", name = "b", descriptor = "(Z)J")
	long method3634();
}

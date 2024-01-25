import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jv")
public interface Interface12 {

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(IB[BI)V")
	void method7099(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1);

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(B)I")
	int method7100();

	@OriginalMember(owner = "client!jv", name = "b", descriptor = "(B)J")
	long method7101();

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(I)I")
	int method7102();
}

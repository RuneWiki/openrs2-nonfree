import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pn")
public interface Interface14 {

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(II[BI)V")
	void method7306(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(Z)J")
	long method7307();

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(B)I")
	int method7308();

	@OriginalMember(owner = "client!pn", name = "b", descriptor = "(B)I")
	int method7309();
}

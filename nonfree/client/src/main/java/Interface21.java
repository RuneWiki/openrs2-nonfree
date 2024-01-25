import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public interface Interface21 {

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(Z)I")
	int method7916();

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(I)I")
	int method7917();

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(II[BI)V")
	void method7918(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1);

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(B)J")
	long method7919();
}

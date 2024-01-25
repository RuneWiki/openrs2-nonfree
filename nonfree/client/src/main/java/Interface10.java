import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public interface Interface10 {

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(I)J")
	long method5856();

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(II[BI)V")
	void method5857(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1);

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(B)I")
	int method5858();

	@OriginalMember(owner = "client!oi", name = "b", descriptor = "(B)I")
	int method5859();
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public interface Interface10 {

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(II[BI)V")
	void method5070(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1);

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(B)I")
	int method5071();

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(Z)J")
	long method5072();

	@OriginalMember(owner = "client!u", name = "b", descriptor = "(B)I")
	int method5073();
}

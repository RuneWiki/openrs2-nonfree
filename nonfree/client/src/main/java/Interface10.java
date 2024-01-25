import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fba")
public interface Interface10 {

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(B)J")
	long method2291();

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(II[BI)V")
	void method2292(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(I)I")
	int method2293();

	@OriginalMember(owner = "client!fba", name = "b", descriptor = "(I)I")
	int method2294();
}

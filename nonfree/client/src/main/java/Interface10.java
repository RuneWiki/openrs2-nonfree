import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lq")
public interface Interface10 {

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(BI[BI)V")
	void method3585(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(I)I")
	int method3586();

	@OriginalMember(owner = "client!lq", name = "b", descriptor = "(I)J")
	long method3587();

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(Z)I")
	int method3588();
}

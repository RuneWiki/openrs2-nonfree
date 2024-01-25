import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wia")
public interface Interface27 {

	@OriginalMember(owner = "client!wia", name = "a", descriptor = "(I)I")
	int method4866();

	@OriginalMember(owner = "client!wia", name = "a", descriptor = "(II[BI)V")
	void method4867(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2);

	@OriginalMember(owner = "client!wia", name = "a", descriptor = "(B)I")
	int method4868();

	@OriginalMember(owner = "client!wia", name = "b", descriptor = "(I)J")
	long method4869();
}

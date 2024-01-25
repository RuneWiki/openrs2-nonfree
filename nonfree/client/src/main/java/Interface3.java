import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public interface Interface3 {

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(I)I")
	int method7654();

	@OriginalMember(owner = "client!fm", name = "b", descriptor = "(I)I")
	int method7655();

	@OriginalMember(owner = "client!fm", name = "c", descriptor = "(I)J")
	long method7656();

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(IB[BI)V")
	void method7657(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1);
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public interface Interface21 {

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(I)I")
	int method5343();

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(I[BII)V")
	void method5344(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1);

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(B)I")
	int method5345();

	@OriginalMember(owner = "client!re", name = "b", descriptor = "(B)J")
	long method5346();
}

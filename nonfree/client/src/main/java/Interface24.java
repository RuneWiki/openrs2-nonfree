import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rt")
public interface Interface24 {

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(I[BII)V")
	void method9135(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(Z)I")
	int method9136();

	@OriginalMember(owner = "client!rt", name = "b", descriptor = "(I)J")
	long method9137();

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(I)I")
	int method9138();
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eq")
public interface Interface8 {

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(I[BII)V")
	void method7523(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(I)J")
	long method7524();

	@OriginalMember(owner = "client!eq", name = "b", descriptor = "(I)I")
	int method7525();

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(Z)I")
	int method7526();
}

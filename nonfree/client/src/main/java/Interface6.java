import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public interface Interface6 {

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(B)I")
	int method8716();

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(I[BBI)V")
	void method8717(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1);

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)I")
	int method8718();

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "(B)J")
	long method8719();
}

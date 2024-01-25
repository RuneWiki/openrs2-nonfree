import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public interface Interface12 {

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(III[B)V")
	void method4195(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1);

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(I)I")
	int method4196();

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "(I)I")
	int method4197();

	@OriginalMember(owner = "client!ii", name = "c", descriptor = "(I)J")
	long method4198();
}

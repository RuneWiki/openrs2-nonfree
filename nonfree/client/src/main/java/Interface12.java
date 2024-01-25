import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tu")
public interface Interface12 {

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(I)I")
	int method4731();

	@OriginalMember(owner = "client!tu", name = "b", descriptor = "(I)J")
	long method4732();

	@OriginalMember(owner = "client!tu", name = "c", descriptor = "(I)I")
	int method4733();

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(III[B)V")
	void method4734(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1);
}

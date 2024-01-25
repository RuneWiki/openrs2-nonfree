import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public interface Interface22 {

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(Z)I")
	int method4047();

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)I")
	int method4048();

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "(Z)J")
	long method4049();

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(B[BII)V")
	void method4050(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2);
}

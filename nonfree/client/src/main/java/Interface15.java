import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qo")
public interface Interface15 {

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(I)I")
	int method3790();

	@OriginalMember(owner = "client!qo", name = "b", descriptor = "(I)J")
	long method3791();

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(I[BZI)V")
	void method3792(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(B)I")
	int method3793();
}

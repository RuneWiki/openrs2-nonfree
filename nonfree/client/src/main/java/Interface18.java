import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qn")
public interface Interface18 {

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(IIZ[B)V")
	void method6570(@OriginalArg(1) int arg0, @OriginalArg(3) byte[] arg1);

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(B)I")
	int method6571();

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(I)J")
	long method6572();

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(Z)I")
	int method6573();
}

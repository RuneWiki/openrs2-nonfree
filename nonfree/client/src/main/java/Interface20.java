import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public interface Interface20 {

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(I[BII)V")
	void method6705(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(I)I")
	int method6706();

	@OriginalMember(owner = "client!tj", name = "b", descriptor = "(I)J")
	long method6707();

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(B)I")
	int method6708();
}

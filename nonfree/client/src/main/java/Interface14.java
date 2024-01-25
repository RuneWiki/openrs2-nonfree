import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public interface Interface14 {

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(I)I")
	int method6391();

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(Z)J")
	long method6392();

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "(I)I")
	int method6393();

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(I[BII)V")
	void method6394(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2);
}

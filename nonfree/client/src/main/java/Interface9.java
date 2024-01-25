import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public interface Interface9 {

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Z)I")
	int method6315();

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)I")
	int method6316();

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(B)J")
	long method6317();

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(III[B)V")
	void method6318(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1);
}

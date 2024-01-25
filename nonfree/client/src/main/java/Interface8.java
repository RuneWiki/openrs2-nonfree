import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public interface Interface8 {

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lclient!mt;[IJI)Ljava/lang/String;")
	String method303(@OriginalArg(0) Class165 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) long arg2);
}

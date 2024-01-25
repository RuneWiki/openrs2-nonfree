import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hia")
public interface Interface16 {

	@OriginalMember(owner = "client!hia", name = "a", descriptor = "(Lclient!pe;[IJZ)Ljava/lang/String;")
	String method6396(@OriginalArg(0) Class282 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) long arg2);
}

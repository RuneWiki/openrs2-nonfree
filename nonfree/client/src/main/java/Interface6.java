import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hm")
public interface Interface6 {

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(JLclient!hi;[II)Ljava/lang/String;")
	String method4094(@OriginalArg(0) long arg0, @OriginalArg(1) Class106 arg1, @OriginalArg(2) int[] arg2);
}

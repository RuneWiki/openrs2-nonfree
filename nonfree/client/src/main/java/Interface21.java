import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!op")
public interface Interface21 {

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(JLclient!fia;I[I)Ljava/lang/String;")
	String method1205(@OriginalArg(0) long arg0, @OriginalArg(1) Class117 arg1, @OriginalArg(3) int[] arg2);
}

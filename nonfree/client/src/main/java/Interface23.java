import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rw")
public interface Interface23 {

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(I[ILclient!fa;J)Ljava/lang/String;")
	String method7898(@OriginalArg(1) int[] arg0, @OriginalArg(2) Class89 arg1, @OriginalArg(3) long arg2);
}

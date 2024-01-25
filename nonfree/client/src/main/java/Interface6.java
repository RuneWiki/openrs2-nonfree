import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public interface Interface6 {

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(Lclient!je;JB[I)Ljava/lang/String;")
	String method337(@OriginalArg(0) Class127 arg0, @OriginalArg(1) long arg1, @OriginalArg(3) int[] arg2);
}

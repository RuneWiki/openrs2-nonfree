import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tp")
public interface Interface11 {

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(Lclient!ud;IJ[I)Ljava/lang/String;")
	String method273(@OriginalArg(0) Class245 arg0, @OriginalArg(2) long arg1, @OriginalArg(3) int[] arg2);
}

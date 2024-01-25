import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sp")
public interface Interface16 {

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(Lclient!oca;JB[I)Ljava/lang/String;")
	String method2686(@OriginalArg(0) Class225 arg0, @OriginalArg(1) long arg1, @OriginalArg(3) int[] arg2);
}

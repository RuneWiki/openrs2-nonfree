import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public interface Interface13 {

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lclient!ff;JI[I)Ljava/lang/String;")
	String method3416(@OriginalArg(0) Class101 arg0, @OriginalArg(1) long arg1, @OriginalArg(3) int[] arg2);
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public interface Interface20 {

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(BJ[ILclient!dj;)Ljava/lang/String;")
	String method2077(@OriginalArg(1) long arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) Class74 arg2);
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public interface Interface5 {

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(BJ[II)Ljava/lang/String;")
	String method3765(@OriginalArg(1) long arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2);
}

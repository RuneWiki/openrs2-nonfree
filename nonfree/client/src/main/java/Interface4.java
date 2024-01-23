import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public interface Interface4 {

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(JI[II)Ljava/lang/String;")
	String method3844(@OriginalArg(0) long arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2);
}

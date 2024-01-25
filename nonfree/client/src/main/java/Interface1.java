import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public interface Interface1 {

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "([IBJI)Ljava/lang/String;")
	String method1694(@OriginalArg(0) int[] arg0, @OriginalArg(2) long arg1, @OriginalArg(3) int arg2);
}

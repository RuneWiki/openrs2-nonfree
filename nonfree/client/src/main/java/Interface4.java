import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public interface Interface4 {

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(J[III)Ljava/lang/String;")
	String method4344(@OriginalArg(0) long arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2);
}

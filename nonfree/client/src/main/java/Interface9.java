import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public interface Interface9 {

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(J[III)Ljava/lang/String;")
	String method4457(@OriginalArg(0) long arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2);
}

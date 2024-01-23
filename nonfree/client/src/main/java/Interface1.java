import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public interface Interface1 {

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(J[IBI)Ljava/lang/String;")
	String method3237(@OriginalArg(0) long arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2);
}

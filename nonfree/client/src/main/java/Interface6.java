import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public interface Interface6 {

	@OriginalMember(owner = "client!k", name = "a", descriptor = "([IIJI)Ljava/lang/String;")
	String method4994(@OriginalArg(0) int[] arg0, @OriginalArg(2) long arg1, @OriginalArg(3) int arg2);
}

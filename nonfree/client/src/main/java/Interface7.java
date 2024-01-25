import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public interface Interface7 {

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "([IIJI)Ljava/lang/String;")
	String method1185(@OriginalArg(0) int[] arg0, @OriginalArg(2) long arg1, @OriginalArg(3) int arg2);
}

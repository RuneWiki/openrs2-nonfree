import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public interface Interface9 {

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "([IZIJ)Ljava/lang/String;")
	String method1715(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) long arg2);
}

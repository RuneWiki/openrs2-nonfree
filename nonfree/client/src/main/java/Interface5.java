import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ev")
public interface Interface5 {

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "([IJZLclient!sq;)Ljava/lang/String;")
	String method1353(@OriginalArg(0) int[] arg0, @OriginalArg(1) long arg1, @OriginalArg(3) Class316 arg2);
}

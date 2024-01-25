import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rs")
public interface Interface8 {

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "([IIJZ)Ljava/lang/String;")
	String method3457(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2);
}

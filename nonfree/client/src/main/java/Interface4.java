import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public interface Interface4 {

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(I[IIJ)Ljava/lang/String;")
	String method1629(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) long arg2);
}

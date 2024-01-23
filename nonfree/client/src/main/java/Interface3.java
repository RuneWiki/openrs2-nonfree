import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public interface Interface3 {

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(II[IJ)Ljava/lang/String;")
	String method236(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) long arg2);
}

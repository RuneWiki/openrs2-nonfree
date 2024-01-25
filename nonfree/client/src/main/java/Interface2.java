import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public interface Interface2 {

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(JIB[I)Ljava/lang/String;")
	String method3962(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2);
}

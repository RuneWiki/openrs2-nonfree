import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public interface Interface5 {

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(B[ILclient!cq;J)Ljava/lang/String;")
	String method4081(@OriginalArg(1) int[] arg0, @OriginalArg(2) Class63 arg1, @OriginalArg(3) long arg2);
}

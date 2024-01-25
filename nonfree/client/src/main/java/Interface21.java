import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pu")
public interface Interface21 {

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(JZ[ILclient!wg;)Ljava/lang/String;")
	String method2094(@OriginalArg(0) long arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) Class387 arg2);
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public interface Interface3 {

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(IJLclient!ak;[I)Ljava/lang/String;")
	String method2(@OriginalArg(1) long arg0, @OriginalArg(2) Class10 arg1, @OriginalArg(3) int[] arg2);
}

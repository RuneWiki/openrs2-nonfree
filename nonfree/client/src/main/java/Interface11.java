import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public interface Interface11 {

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "([IJLclient!ed;I)Ljava/lang/String;")
	String method789(@OriginalArg(0) int[] arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class93 arg2);
}

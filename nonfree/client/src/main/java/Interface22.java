import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public interface Interface22 {

	@OriginalMember(owner = "client!se", name = "a", descriptor = "([IJBLclient!fr;)Ljava/lang/String;")
	String method3000(@OriginalArg(0) int[] arg0, @OriginalArg(1) long arg1, @OriginalArg(3) Class123 arg2);
}

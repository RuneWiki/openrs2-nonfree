import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public interface Interface10 {

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(BJ[ILclient!sv;)Ljava/lang/String;")
	String method1607(@OriginalArg(1) long arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) Class222 arg2);
}

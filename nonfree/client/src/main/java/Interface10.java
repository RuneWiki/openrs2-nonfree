import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hn")
public interface Interface10 {

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(JLclient!lg;[IB)Ljava/lang/String;")
	String method1876(@OriginalArg(0) long arg0, @OriginalArg(1) Class201 arg1, @OriginalArg(2) int[] arg2);
}

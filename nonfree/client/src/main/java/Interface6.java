import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hn")
public interface Interface6 {

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(JILclient!go;[I)Ljava/lang/String;")
	String method2718(@OriginalArg(0) long arg0, @OriginalArg(2) Class97 arg1, @OriginalArg(3) int[] arg2);
}

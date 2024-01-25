import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oo")
public interface Interface16 {

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(JBLclient!fv;[I)Ljava/lang/String;")
	String method7633(@OriginalArg(0) long arg0, @OriginalArg(2) Class112 arg1, @OriginalArg(3) int[] arg2);
}

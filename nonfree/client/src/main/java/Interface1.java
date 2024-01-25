import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public interface Interface1 {

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(BJLclient!cg;[I)Ljava/lang/String;")
	String method6030(@OriginalArg(1) long arg0, @OriginalArg(2) Class37 arg1, @OriginalArg(3) int[] arg2);
}

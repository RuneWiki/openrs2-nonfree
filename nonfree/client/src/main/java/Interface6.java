import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cda")
public interface Interface6 {

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(JILclient!bja;[I)Ljava/lang/String;")
	String method3331(@OriginalArg(0) long arg0, @OriginalArg(2) Class27 arg1, @OriginalArg(3) int[] arg2);
}

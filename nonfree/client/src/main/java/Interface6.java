import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fba")
public interface Interface6 {

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(Z[ILclient!hk;J)Ljava/lang/String;")
	String method8557(@OriginalArg(1) int[] arg0, @OriginalArg(2) Class146 arg1, @OriginalArg(3) long arg2);
}

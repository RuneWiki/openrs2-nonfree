import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public interface Interface3 {

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(JLclient!ef;I[I)Ljava/lang/String;")
	String method4540(@OriginalArg(0) long arg0, @OriginalArg(1) Class61 arg1, @OriginalArg(3) int[] arg2);
}

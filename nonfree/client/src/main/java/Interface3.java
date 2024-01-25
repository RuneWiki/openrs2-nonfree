import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bq")
public interface Interface3 {

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(IJLclient!oaa;[I)Ljava/lang/String;")
	String method4297(@OriginalArg(1) long arg0, @OriginalArg(2) Class234 arg1, @OriginalArg(3) int[] arg2);
}

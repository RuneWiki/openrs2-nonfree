import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qla")
public interface Interface21 {

	@OriginalMember(owner = "client!qla", name = "a", descriptor = "(BJLclient!lda;[I)Ljava/lang/String;")
	String method2684(@OriginalArg(1) long arg0, @OriginalArg(2) Class225 arg1, @OriginalArg(3) int[] arg2);
}

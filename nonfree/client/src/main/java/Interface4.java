import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public interface Interface4 {

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(JLclient!tk;I[I)Ljava/lang/String;")
	String method3893(@OriginalArg(0) long arg0, @OriginalArg(1) Class225 arg1, @OriginalArg(3) int[] arg2);
}

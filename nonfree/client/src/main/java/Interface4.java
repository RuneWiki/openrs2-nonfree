import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public interface Interface4 {

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(I[ILclient!sd;J)Ljava/lang/String;")
	String method4322(@OriginalArg(1) int[] arg0, @OriginalArg(2) Class220 arg1, @OriginalArg(3) long arg2);
}

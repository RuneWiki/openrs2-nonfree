import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public interface Interface1 {

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(I[IJLclient!lp;)Ljava/lang/String;")
	String method5559(@OriginalArg(1) int[] arg0, @OriginalArg(2) long arg1, @OriginalArg(3) Class188 arg2);
}

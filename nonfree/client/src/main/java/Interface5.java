import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public interface Interface5 {

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IBJ[I)Ljava/lang/String;")
	String method2863(@OriginalArg(0) int arg0, @OriginalArg(2) long arg1, @OriginalArg(3) int[] arg2);
}

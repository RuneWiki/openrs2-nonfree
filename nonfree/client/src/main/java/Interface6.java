import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tn")
public interface Interface6 {

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(I[IBJ)Ljava/lang/String;")
	String method908(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) long arg2);
}

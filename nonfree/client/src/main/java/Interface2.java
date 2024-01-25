import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gp")
public interface Interface2 {

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "([IIJI)Ljava/lang/String;")
	String method697(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2);
}

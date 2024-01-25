import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lp")
public interface Interface16 {

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "([IIJLclient!hj;)Ljava/lang/String;")
	String method3725(@OriginalArg(0) int[] arg0, @OriginalArg(2) long arg1, @OriginalArg(3) Class158 arg2);
}

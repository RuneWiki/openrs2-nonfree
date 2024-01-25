import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aea")
public interface Interface1 {

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "([IIJLclient!mt;)Ljava/lang/String;")
	String method6189(@OriginalArg(0) int[] arg0, @OriginalArg(2) long arg1, @OriginalArg(3) Class228 arg2);
}

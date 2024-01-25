import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public interface Interface16 {

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "([IBJLclient!laa;)Ljava/lang/String;")
	String method4619(@OriginalArg(0) int[] arg0, @OriginalArg(2) long arg1, @OriginalArg(3) Class179 arg2);
}

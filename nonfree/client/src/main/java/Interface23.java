import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tfa")
public interface Interface23 {

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(JILclient!vq;[I)Ljava/lang/String;")
	String method1002(@OriginalArg(0) long arg0, @OriginalArg(2) Class382 arg1, @OriginalArg(3) int[] arg2);
}

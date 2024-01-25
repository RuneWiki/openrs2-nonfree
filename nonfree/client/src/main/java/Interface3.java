import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dt")
public interface Interface3 {

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(Lclient!kl;ZJ[I)Ljava/lang/String;")
	String method2011(@OriginalArg(0) Class142 arg0, @OriginalArg(2) long arg1, @OriginalArg(3) int[] arg2);
}

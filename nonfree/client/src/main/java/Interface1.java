import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public interface Interface1 {

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(Lclient!fg;ZJ[I)Ljava/lang/String;")
	String method1218(@OriginalArg(0) Class70 arg0, @OriginalArg(2) long arg1, @OriginalArg(3) int[] arg2);
}

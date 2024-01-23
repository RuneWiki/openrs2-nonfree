import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public interface Interface2 {

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(JI[II)Ljava/lang/String;")
	String method3374(@OriginalArg(0) long arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2);
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public interface Interface3 {

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(JLclient!de;B[I)Ljava/lang/String;")
	String method5449(@OriginalArg(0) long arg0, @OriginalArg(1) Class50 arg1, @OriginalArg(3) int[] arg2);
}

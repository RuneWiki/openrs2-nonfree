import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fu")
public interface Interface6 {

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(Lclient!sc;JI[I)Ljava/lang/String;")
	String method992(@OriginalArg(0) Class220 arg0, @OriginalArg(1) long arg1, @OriginalArg(3) int[] arg2);
}

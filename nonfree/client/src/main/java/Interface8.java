import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaa")
public interface Interface8 {

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(JB[ILclient!dv;)Ljava/lang/String;")
	String method7404(@OriginalArg(0) long arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) Class96 arg2);
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public interface Interface3 {

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(BJLclient!vr;[I)Ljava/lang/String;")
	String method6056(@OriginalArg(1) long arg0, @OriginalArg(2) Class266 arg1, @OriginalArg(3) int[] arg2);
}

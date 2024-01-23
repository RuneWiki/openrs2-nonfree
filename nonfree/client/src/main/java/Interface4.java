import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!to")
public interface Interface4 {

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(JII[I)Ljava/lang/String;")
	String method3902(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2);
}

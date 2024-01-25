import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iq")
public interface Interface3 {

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(JII[I)Ljava/lang/String;")
	String method2922(@OriginalArg(0) long arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2);
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public interface Interface3 {

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(JII[I)Ljava/lang/String;")
	String method4659(@OriginalArg(0) long arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2);
}

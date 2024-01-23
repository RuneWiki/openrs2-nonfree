import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public interface Interface1 {

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(IJ[II)Ljava/lang/String;")
	String method921(@OriginalArg(1) long arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2);
}

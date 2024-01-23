import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public interface Interface4 {

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(JZ[II)Ljava/lang/String;")
	String method4728(@OriginalArg(0) long arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2);
}

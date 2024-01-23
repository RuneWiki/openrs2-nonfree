import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public interface Interface3 {

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(IJ[II)Ljava/lang/String;")
	String method3806(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int[] arg2);
}

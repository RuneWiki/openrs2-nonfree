import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ls")
public interface Interface6 {

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(IJ[IZ)Ljava/lang/String;")
	String method2165(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int[] arg2);
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lu")
public interface Interface7 {

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "([ILclient!ra;IJ)Ljava/lang/String;")
	String method1255(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class208 arg1, @OriginalArg(3) long arg2);
}

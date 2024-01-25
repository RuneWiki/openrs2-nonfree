import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!su")
public interface Interface11 {

	@OriginalMember(owner = "client!su", name = "a", descriptor = "([ILclient!rr;IJ)Ljava/lang/String;")
	String method4408(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class220 arg1, @OriginalArg(3) long arg2);
}

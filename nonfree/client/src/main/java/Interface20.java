import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public interface Interface20 {

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "([ILclient!io;IJ)Ljava/lang/String;")
	String method7291(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class148 arg1, @OriginalArg(3) long arg2);
}

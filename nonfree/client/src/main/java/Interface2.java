import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fp")
public interface Interface2 {

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(II[IJ)Ljava/lang/String;")
	String method637(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) long arg2);
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dea")
public interface Interface3 {

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(IJ[ILclient!vf;)Ljava/lang/String;")
	String method4643(@OriginalArg(1) long arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) Class342 arg2);
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public interface Interface1 {

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IJ[II)Lclient!ia;")
	Class51 method3497(@OriginalArg(1) long arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2);
}

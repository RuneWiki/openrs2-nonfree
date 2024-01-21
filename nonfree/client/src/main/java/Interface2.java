import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public interface Interface2 {

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IBJ[I)Lclient!dc;")
	Class20 method2324(@OriginalArg(0) int arg0, @OriginalArg(2) long arg1, @OriginalArg(3) int[] arg2);
}

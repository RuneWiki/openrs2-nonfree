import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public interface Interface2 {

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(JBI[I)Lclient!qe;")
	Class78 method2462(@OriginalArg(0) long arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2);
}

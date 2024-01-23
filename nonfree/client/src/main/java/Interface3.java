import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public interface Interface3 {

	@OriginalMember(owner = "client!me", name = "a", descriptor = "([IBIJ)Lclient!hh;")
	Class50 method815(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) long arg2);
}

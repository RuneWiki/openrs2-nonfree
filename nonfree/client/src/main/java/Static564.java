import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static564 {

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(III)Z")
	public static boolean method8558(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IZ)Z")
	public static boolean method8559(@OriginalArg(0) int arg0) {
		for (@Pc(10) Class2_Sub1_Sub13 local10 = (Class2_Sub1_Sub13) Static61.aClass271_6.method7177(); local10 != null; local10 = (Class2_Sub1_Sub13) Static61.aClass271_6.method7175()) {
			if (Static377.method6405(local10.anInt6866) && local10.aLong181 == (long) arg0) {
				return true;
			}
		}
		return false;
	}
}

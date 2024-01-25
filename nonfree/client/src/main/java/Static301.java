import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static301 {

	@OriginalMember(owner = "client!kf", name = "zd", descriptor = "Z")
	public static boolean aBoolean334 = false;

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "(Z)V")
	public static void method4339() {
		if (Static180.anApplet6 == null) {
			return;
		}
		try {
			@Pc(10) String local10 = Static180.anApplet6.getParameter("cookiehost");
			@Pc(18) int local18 = (int) (Static566.method7936() / 86400000L) - 11745;
			@Pc(30) String local30 = "usrdob=" + local18 + "; version=1; path=/; domain=" + local10;
			Static683.method5175("document.cookie=\"" + local30 + "\"", Static180.anApplet6);
		} catch (@Pc(44) Throwable local44) {
		}
	}

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "(III)Z")
	public static boolean method4340(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x800) != 0 && (arg0 & 0x37) != 0;
	}
}

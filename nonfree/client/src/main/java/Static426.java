import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static426 {

	@OriginalMember(owner = "client!pb", name = "i", descriptor = "[B")
	public static byte[] aByteArray74;

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "Lclient!la;")
	public static final Class73 aClass73_1 = Static523.method7267();

	@OriginalMember(owner = "client!pb", name = "j", descriptor = "[I")
	public static final int[] anIntArray476 = new int[2048];

	@OriginalMember(owner = "client!pb", name = "k", descriptor = "[I")
	public static final int[] anIntArray477 = new int[2];

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IZ)I")
	public static int method6217(@OriginalArg(1) boolean arg0) {
		@Pc(10) int local10 = Static518.anInt8368;
		if (local10 == 0) {
			return arg0 ? 0 : Static326.anInt5718;
		} else if (local10 == 1) {
			return Static326.anInt5718;
		} else if (local10 == 2) {
			return 0;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Ljava/lang/String;II)Z")
	public static boolean method6218(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (Static265.aClass286_3.aBoolean536) {
			Static262.aClass155_9 = new Class155();
			Static262.aClass155_9.anInt4152 = arg1;
			Static262.aClass155_9.aString38 = arg0;
			if (Static392.aClass373_6 != Static242.aClass373_4) {
				Static262.aClass155_9.anInt4150 = Static262.aClass155_9.anInt4152 + 50000;
				Static262.aClass155_9.anInt4155 = Static262.aClass155_9.anInt4152 + 40000;
			}
			for (@Pc(33) int local33 = 0; local33 < Static537.aClass362_Sub1Array1.length; local33++) {
				if (arg1 == Static537.aClass362_Sub1Array1[local33].anInt10286) {
					Static333.anInt5840 = Static537.aClass362_Sub1Array1[local33].anInt10278;
				}
			}
			return true;
		}
		@Pc(58) String local58 = "";
		if (Static242.aClass373_4 != Static392.aClass373_6) {
			local58 = ":" + (arg1 + 7000);
		}
		@Pc(78) String local78 = "";
		if (Static112.aString22 != null) {
			local78 = "/p=" + Static112.aString22;
		}
		@Pc(126) String local126 = "http://" + arg0 + local58 + "/l=" + Static496.anInt7407 + "/a=" + Static65.anInt1744 + local78 + "/j" + (Static640.aBoolean751 ? "1" : "0") + ",o" + (Static131.aBoolean221 ? "1" : "0") + ",a2";
		try {
			Static509.aClient1.getAppletContext().showDocument(new URL(local126), "_self");
			return true;
		} catch (@Pc(136) Exception local136) {
			return false;
		}
	}
}

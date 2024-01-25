import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static153 {

	@OriginalMember(owner = "client!hj", name = "c", descriptor = "I")
	public static int anInt2663;

	@OriginalMember(owner = "client!hj", name = "e", descriptor = "I")
	public static int anInt2665;

	@OriginalMember(owner = "client!hj", name = "f", descriptor = "J")
	public static long aLong88;

	@OriginalMember(owner = "client!hj", name = "d", descriptor = "I")
	public static int anInt2664 = 0;

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(Ljava/lang/String;II)Z")
	public static boolean method2189(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		if (Static293.anInt4810 != 3) {
			Static14.aClass265_1 = new Class265();
			Static14.aClass265_1.aString199 = arg0;
			Static14.aClass265_1.anInt7137 = arg1;
			if (Static60.aClass258_1 != Static260.aClass258_7) {
				Static14.aClass265_1.anInt7133 = Static14.aClass265_1.anInt7137 + 40000;
				Static14.aClass265_1.anInt7134 = Static14.aClass265_1.anInt7137 + 50000;
			}
			return true;
		}
		@Pc(45) String local45 = "";
		if (Static60.aClass258_1 != Static260.aClass258_7) {
			local45 = ":" + (arg1 + 7000);
		}
		@Pc(60) String local60 = "";
		if (Static182.aString95 != null) {
			local60 = "/p=" + Static182.aString95;
		}
		@Pc(108) String local108 = "http://" + arg0 + local45 + "/l=" + Static331.anInt5597 + "/a=" + Static294.anInt979 + local60 + "/j" + (Static359.aBoolean442 ? "1" : "0") + ",o" + (Static79.aBoolean118 ? "1" : "0") + ",a2";
		try {
			Static320.aClient1.getAppletContext().showDocument(new URL(local108), "_self");
			return true;
		} catch (@Pc(118) Exception local118) {
			return false;
		}
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(ILjava/lang/String;ZILjava/lang/String;IIIZZJ)V")
	public static void method2190(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(10) long arg9) {
		if (!Static126.aBoolean52 && Static137.anInt6647 < 500) {
			@Pc(16) int local16 = arg3 == -1 ? Static96.anInt1855 : arg3;
			@Pc(30) Class2_Sub46 local30 = new Class2_Sub46(arg1, arg4, local16, arg7, arg5, arg9, arg0, arg6, arg2, arg8);
			Static261.aClass156_13.method3157(local30);
			Static137.anInt6647++;
		}
	}
}

import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static165 {

	@OriginalMember(owner = "client!km", name = "z", descriptor = "[[S")
	public static short[][] aShortArrayArray9;

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(II)Z")
	public static boolean method3057(@OriginalArg(1) int arg0) {
		@Pc(16) Class47_Sub1 local16 = Static208.method3703(arg0);
		if (local16 == null) {
			return false;
		} else if (Static11.anInt349 == 3) {
			@Pc(50) String local50 = "";
			if (Static226.anInt4439 != 0) {
				local50 = ":" + (local16.anInt1361 + 7000);
			}
			@Pc(68) String local68 = "";
			if (Static31.aString51 != null) {
				local68 = "/p=" + Static31.aString51;
			}
			@Pc(117) String local117 = "http://" + local16.aString78 + local50 + "/l=" + Static259.anInt3205 + "/a=" + Static255.anInt4972 + local68 + "/j" + (Static309.aBoolean444 ? "1" : "0") + ",o" + (Static132.aBoolean191 ? "1" : "0") + ",a2";
			try {
				Static334.aClient1.getAppletContext().showDocument(new URL(local117), "_self");
				return true;
			} catch (@Pc(127) Exception local127) {
				return false;
			}
		} else {
			Static13.aString28 = local16.aString78;
			Static315.anInt6021 = local16.anInt1361;
			if (Static226.anInt4439 != 0) {
				Static6.anInt195 = Static315.anInt6021 + 40000;
				Static62.anInt1434 = Static315.anInt6021 + 50000;
				Static312.anInt5956 = Static6.anInt195;
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(IIIII)V")
	public static void method3060(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class5_Sub9_Sub16 local8 = Static239.method4052(8, arg1);
		local8.method4140();
		local8.anInt4723 = arg3;
		local8.anInt4721 = arg2;
		local8.anInt4724 = arg0;
	}
}

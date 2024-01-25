import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static644 {

	@OriginalMember(owner = "client!vo", name = "N", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger6 = new BigInteger("c1007f013d1a958876a3c66e838e9843469d41646ba10112ab6a280bab25374f9d72b994183a7996d5e2c3ec645c265eb522881a9f6b6d223637643fb474870d", 16);

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(II)Lclient!tg;")
	public static Class3_Sub11_Sub16 method8952(@OriginalArg(0) int arg0) {
		@Pc(10) Class3_Sub11_Sub16 local10 = (Class3_Sub11_Sub16) Static535.aClass179_4.method4558((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static532.aClass15_135.method517(0, arg0);
		if (local25 == null || local25.length <= 1) {
			return null;
		}
		try {
			local10 = Static22.method2354(local25);
		} catch (@Pc(39) Exception local39) {
			throw new RuntimeException(local39.getMessage() + " S: " + arg0);
		}
		Static535.aClass179_4.method4562(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(Lclient!aj;I)V")
	public static void method8954(@OriginalArg(0) Class15 arg0) {
		Static13.anInt137 = arg0.method514("hitmarks");
		Static249.anInt4512 = arg0.method514("hitbar_default");
		Static473.anInt7803 = arg0.method514("timerbar_default");
		Static180.anInt3541 = arg0.method514("headicons_pk");
		Static447.anInt7409 = arg0.method514("headicons_prayer");
		Static274.anInt4797 = arg0.method514("hint_headicons");
		Static448.anInt7415 = arg0.method514("hint_mapmarkers");
		Static415.anInt6638 = arg0.method514("mapflag");
		Static498.anInt10142 = arg0.method514("cross");
		Static25.anInt546 = arg0.method514("mapdots");
		Static276.anInt4805 = arg0.method514("scrollbar");
		Static585.anInt9440 = arg0.method514("name_icons");
		Static653.anInt10389 = arg0.method514("floorshadows");
		Static268.anInt4735 = arg0.method514("compass");
		Static480.anInt7975 = arg0.method514("otherlevel");
		Static675.anInt10881 = arg0.method514("hint_mapedge");
	}

	@OriginalMember(owner = "client!vo", name = "b", descriptor = "(I)I")
	public static int method8956() {
		@Pc(5) Class165 local5 = Static643.aClass165_77;
		synchronized (Static643.aClass165_77) {
			return Static643.aClass165_77.method4399();
		}
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(Ljava/lang/String;IC)[Ljava/lang/String;")
	public static String[] method8957(@OriginalArg(0) String arg0, @OriginalArg(2) char arg1) {
		@Pc(8) int local8 = Static91.method1703(arg1, arg0);
		@Pc(13) String[] local13 = new String[local8 + 1];
		@Pc(15) int local15 = 0;
		@Pc(17) int local17 = 0;
		for (@Pc(19) int local19 = 0; local19 < local8; local19++) {
			@Pc(22) int local22;
			for (local22 = local17; arg0.charAt(local22) != arg1; local22++) {
			}
			local13[local15++] = arg0.substring(local17, local22);
			local17 = local22 + 1;
		}
		local13[local8] = arg0.substring(local17);
		return local13;
	}
}

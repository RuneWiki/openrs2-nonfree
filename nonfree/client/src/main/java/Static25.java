import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static25 {

	@OriginalMember(owner = "client!baa", name = "u", descriptor = "Lclient!ud;")
	public static Class241 aClass241_1;

	@OriginalMember(owner = "client!baa", name = "E", descriptor = "Lclient!dn;")
	public static Class69 aClass69_9;

	@OriginalMember(owner = "client!baa", name = "H", descriptor = "I")
	public static int anInt735;

	@OriginalMember(owner = "client!baa", name = "x", descriptor = "Lclient!vj;")
	public static final Class305 aClass305_26 = new Class305(7, 2);

	@OriginalMember(owner = "client!baa", name = "g", descriptor = "(I)V")
	public static void method772() {
		if (Static49.aFloat29 < 1024.0F) {
			Static49.aFloat29 = 1024.0F;
		}
		if (Static49.aFloat29 > 3072.0F) {
			Static49.aFloat29 = 3072.0F;
		}
		while (Static135.aFloat193 >= 16384.0F) {
			Static135.aFloat193 -= 16384.0F;
		}
		while (Static135.aFloat193 < 0.0F) {
			Static135.aFloat193 += 16384.0F;
		}
		@Pc(41) int local41 = Static397.anInt6990 >> 7;
		@Pc(45) int local45 = Static60.anInt1483 >> 7;
		@Pc(51) int local51 = Static508.method7754(Static60.anInt1483, Static397.anInt6990, Static322.anInt6113);
		@Pc(53) int local53 = 0;
		@Pc(79) int local79;
		if (local41 > 3 && local45 > 3 && Static237.anInt4563 - 4 > local41 && local45 < Static373.anInt6694 - 4) {
			for (local79 = local41 - 4; local79 <= local41 + 4; local79++) {
				for (@Pc(85) int local85 = local45 - 4; local85 <= local45 + 4; local85++) {
					@Pc(89) int local89 = Static322.anInt6113;
					if (local89 < 3 && Static4.method186(local85, local79)) {
						local89++;
					}
					@Pc(104) int local104 = 0;
					if (Static107.aClass102_Sub1_1.aByteArrayArrayArray19 != null && Static107.aClass102_Sub1_1.aByteArrayArrayArray19[local89] != null) {
						local104 = (Static107.aClass102_Sub1_1.aByteArrayArrayArray19[local89][local79][local85] & 0xFF) * 8;
					}
					@Pc(137) int local137 = local51 + local104 - Static296.aClass7Array11[local89].ba(local79, local85);
					if (local53 < local137) {
						local53 = local137;
					}
				}
			}
		}
		local79 = (local53 >> 0) * 1536;
		if (local79 > 786432) {
			local79 = 786432;
		}
		if (local79 < 262144) {
			local79 = 262144;
		}
		if (Static243.anInt4676 < local79) {
			Static243.anInt4676 += (local79 - Static243.anInt4676) / 24;
		} else if (local79 < Static243.anInt4676) {
			Static243.anInt4676 += (local79 - Static243.anInt4676) / 80;
		}
	}

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;B)V")
	public static void method773(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		try {
			@Pc(7) String local7 = "";
			if (arg0 != null) {
				local7 = Static99.method2035(arg0);
			}
			if (arg1 != null) {
				if (arg0 != null) {
					local7 = local7 + " | ";
				}
				local7 = local7 + arg1;
			}
			Static243.method4315(local7);
			local7 = Static286.method5045(":", "%3a", local7);
			local7 = Static286.method5045("@", "%40", local7);
			local7 = Static286.method5045("&", "%26", local7);
			local7 = Static286.method5045("#", "%23", local7);
			if (Static461.aClass229_16.anApplet1 != null) {
				@Pc(99) Class311 local99 = Static461.aClass229_16.method6078(new URL(Static461.aClass229_16.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static453.anInt7916 + "&u=" + Static410.aLong209 + "&v1=" + Static380.aString168 + "&v2=" + Static380.aString172 + "&e=" + local7));
				while (local99.anInt9169 == 0) {
					Static265.method3147(1L);
				}
				if (local99.anInt9169 == 1) {
					@Pc(118) DataInputStream local118 = (DataInputStream) local99.anObject17;
					local118.read();
					local118.close();
				}
			}
		} catch (@Pc(130) Exception local130) {
		}
	}

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(IBIII)V")
	public static void method774(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(10) int local10;
		if (arg1 > arg0) {
			for (local10 = arg0; local10 < arg1; local10++) {
				Static143.anIntArrayArray33[local10][arg2] = arg3;
			}
		} else {
			for (local10 = arg1; local10 < arg0; local10++) {
				Static143.anIntArrayArray33[local10][arg2] = arg3;
			}
		}
	}
}

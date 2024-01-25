import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static492 {

	@OriginalMember(owner = "client!qia", name = "c", descriptor = "Lclient!lja;")
	public static final Class216 aClass216_124 = new Class216(11, 3);

	@OriginalMember(owner = "client!qia", name = "j", descriptor = "Z")
	public static boolean aBoolean603 = false;

	@OriginalMember(owner = "client!qia", name = "a", descriptor = "(I)V")
	public static void method6682() {
		if (Static87.anInt1778 == 0) {
			return;
		}
		try {
			if (++Static373.anInt5588 > 2000) {
				if (Static375.aClass192_2 != null) {
					Static375.aClass192_2.method7791();
					Static375.aClass192_2 = null;
				}
				if (Static105.anInt2132 >= 2) {
					Static393.anInt5778 = -5;
					Static87.anInt1778 = 0;
					return;
				}
				Static121.aClass382_1.method8696();
				Static87.anInt1778 = 1;
				Static373.anInt5588 = 0;
				Static105.anInt2132++;
			}
			if (Static87.anInt1778 == 1) {
				Static400.aClass281_3 = Static121.aClass382_1.method8694(Static239.aClass207_2);
				Static87.anInt1778 = 2;
			}
			if (Static87.anInt1778 == 2) {
				if (Static400.aClass281_3.anInt7338 == 2) {
					throw new IOException();
				}
				if (Static400.aClass281_3.anInt7338 != 1) {
					return;
				}
				Static375.aClass192_2 = Static252.method3669((Socket) Static400.aClass281_3.anObject17);
				Static400.aClass281_3 = null;
				Static460.method6417();
				Static87.anInt1778 = 4;
			}
			if (Static87.anInt1778 == 4 && Static375.aClass192_2.method7787(1)) {
				Static375.aClass192_2.method7792(Static159.aClass4_Sub11_Sub1_1.aByteArray107, 0, 1);
				@Pc(113) int local113 = Static159.aClass4_Sub11_Sub1_1.aByteArray107[0] & 0xFF;
				Static87.anInt1778 = 0;
				Static393.anInt5778 = local113;
				Static375.aClass192_2.method7791();
				Static375.aClass192_2 = null;
			}
		} catch (@Pc(124) IOException local124) {
			if (Static375.aClass192_2 != null) {
				Static375.aClass192_2.method7791();
				Static375.aClass192_2 = null;
			}
			if (Static105.anInt2132 >= 2) {
				Static87.anInt1778 = 0;
				Static393.anInt5778 = -4;
			} else {
				Static121.aClass382_1.method8696();
				Static105.anInt2132++;
				Static87.anInt1778 = 1;
				Static373.anInt5588 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!qia", name = "a", descriptor = "(IBILclient!kq;)V")
	public static void method6685(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class199 arg2) {
		Static100.anInt2070 = arg1;
		Static180.anInt9924 = arg0;
		Static374.aClass199_9 = arg2;
	}
}

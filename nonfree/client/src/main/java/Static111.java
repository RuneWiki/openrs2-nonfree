import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static111 {

	@OriginalMember(owner = "client!fg", name = "B", descriptor = "I")
	public static int anInt6480;

	@OriginalMember(owner = "client!fg", name = "E", descriptor = "I")
	public static int anInt6481;

	@OriginalMember(owner = "client!fg", name = "A", descriptor = "Lclient!ui;")
	public static final Class242 aClass242_89 = new Class242("Loaded world map", "Weltkarte geladen", "Mappemonde chargée", "Mapa-múndi carregado");

	@OriginalMember(owner = "client!fg", name = "C", descriptor = "Z")
	public static boolean aBoolean437 = false;

	@OriginalMember(owner = "client!fg", name = "b", descriptor = "(Z)V")
	public static void method5045() {
		if (Static272.anInt4809 == 0) {
			return;
		}
		try {
			if (++Static93.anInt1997 > 2000) {
				if (Static223.aClass5_3 != null) {
					Static223.aClass5_3.method119();
					Static223.aClass5_3 = null;
				}
				if (Static239.anInt4385 >= 1) {
					Static272.anInt4809 = 0;
					Static198.anInt3783 = -5;
					return;
				}
				Static93.anInt1997 = 0;
				if (Static81.anInt1880 == Static274.anInt4849) {
					Static274.anInt4849 = Static271.anInt1484;
				} else {
					Static274.anInt4849 = Static81.anInt1880;
				}
				Static272.anInt4809 = 1;
				Static239.anInt4385++;
			}
			if (Static272.anInt4809 == 1) {
				Static105.aClass108_5 = Static89.aClass114_3.method2364(Static274.anInt4849, Static436.aString70);
				Static272.anInt4809 = 2;
			}
			@Pc(114) int local114;
			if (Static272.anInt4809 == 2) {
				if (Static105.aClass108_5.anInt2803 == 2) {
					throw new IOException();
				}
				if (Static105.aClass108_5.anInt2803 != 1) {
					return;
				}
				Static223.aClass5_3 = new Class5((Socket) Static105.aClass108_5.anObject4, Static89.aClass114_3);
				Static105.aClass108_5 = null;
				Static223.aClass5_3.method124(Static116.aClass4_Sub30_Sub1_1.aByteArray79, Static116.aClass4_Sub30_Sub1_1.anInt6244);
				Static194.method2825();
				local114 = Static223.aClass5_3.method125();
				Static194.method2825();
				if (local114 != 21) {
					Static272.anInt4809 = 0;
					Static198.anInt3783 = local114;
					Static223.aClass5_3.method119();
					Static223.aClass5_3 = null;
					return;
				}
				Static272.anInt4809 = 3;
			}
			if (Static272.anInt4809 == 3) {
				if (Static223.aClass5_3.method120() < 1) {
					return;
				}
				Static419.aStringArray41 = new String[Static223.aClass5_3.method125()];
				Static272.anInt4809 = 4;
			}
			if (Static272.anInt4809 == 4 && Static223.aClass5_3.method120() >= Static419.aStringArray41.length * 8) {
				Static349.aClass4_Sub30_Sub1_2.anInt6244 = 0;
				Static223.aClass5_3.method122(Static349.aClass4_Sub30_Sub1_2.aByteArray79, Static419.aStringArray41.length * 8, 0);
				for (local114 = 0; local114 < Static419.aStringArray41.length; local114++) {
					Static419.aStringArray41[local114] = Static345.method4817(Static349.aClass4_Sub30_Sub1_2.method4853());
				}
				Static198.anInt3783 = 21;
				Static272.anInt4809 = 0;
				Static223.aClass5_3.method119();
				Static223.aClass5_3 = null;
			}
		} catch (@Pc(212) IOException local212) {
			if (Static223.aClass5_3 != null) {
				Static223.aClass5_3.method119();
				Static223.aClass5_3 = null;
			}
			if (Static239.anInt4385 >= 1) {
				Static272.anInt4809 = 0;
				Static198.anInt3783 = -4;
			} else {
				Static93.anInt1997 = 0;
				Static239.anInt4385++;
				if (Static274.anInt4849 == Static81.anInt1880) {
					Static274.anInt4849 = Static271.anInt1484;
				} else {
					Static274.anInt4849 = Static81.anInt1880;
				}
				Static272.anInt4809 = 1;
			}
		}
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(BLclient!bo;)Z")
	public static boolean method5046(@OriginalArg(1) Class25 arg0) {
		if (arg0 == null) {
			return false;
		} else if (!arg0.aBoolean46) {
			return false;
		} else if (!arg0.method666(Static137.anInterface4_2)) {
			return false;
		} else if (Static414.aClass196_39.method4477((long) arg0.anInt859) == null) {
			return Static233.aClass196_21.method4477((long) arg0.anInt865) == null;
		} else {
			return false;
		}
	}
}

import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static115 {

	@OriginalMember(owner = "client!dm", name = "s", descriptor = "I")
	public static int anInt2379;

	@OriginalMember(owner = "client!dm", name = "A", descriptor = "I")
	public static int anInt2386 = 0;

	@OriginalMember(owner = "client!dm", name = "J", descriptor = "Lclient!uw;")
	public static final Class359 aClass359_39 = new Class359(130, 0);

	@OriginalMember(owner = "client!dm", name = "L", descriptor = "Lclient!tn;")
	public static final Class339 aClass339_5 = new Class339(1);

	@OriginalMember(owner = "client!dm", name = "M", descriptor = "Lclient!uw;")
	public static final Class359 aClass359_40 = new Class359(34, -2);

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(I)V")
	public static void method2132() {
		Static172.aClass5_Sub50_14.method7531(1, Static172.aClass5_Sub50_14.aClass12_Sub8_1);
		Static172.aClass5_Sub50_14.method7531(1, Static172.aClass5_Sub50_14.aClass12_Sub8_2);
		Static172.aClass5_Sub50_14.method7531(2, Static172.aClass5_Sub50_14.aClass12_Sub13_1);
		Static172.aClass5_Sub50_14.method7531(2, Static172.aClass5_Sub50_14.aClass12_Sub13_2);
		Static172.aClass5_Sub50_14.method7531(1, Static172.aClass5_Sub50_14.aClass12_Sub10_1);
		Static172.aClass5_Sub50_14.method7531(1, Static172.aClass5_Sub50_14.aClass12_Sub2_1);
		Static172.aClass5_Sub50_14.method7531(1, Static172.aClass5_Sub50_14.aClass12_Sub11_1);
		Static172.aClass5_Sub50_14.method7531(1, Static172.aClass5_Sub50_14.aClass12_Sub19_1);
		Static172.aClass5_Sub50_14.method7531(1, Static172.aClass5_Sub50_14.aClass12_Sub18_1);
		Static172.aClass5_Sub50_14.method7531(1, Static172.aClass5_Sub50_14.aClass12_Sub21_1);
		Static172.aClass5_Sub50_14.method7531(2, Static172.aClass5_Sub50_14.aClass12_Sub25_1);
		Static172.aClass5_Sub50_14.method7531(1, Static172.aClass5_Sub50_14.aClass12_Sub4_1);
		Static172.aClass5_Sub50_14.method7531(2, Static172.aClass5_Sub50_14.aClass12_Sub29_1);
		Static172.aClass5_Sub50_14.method7531(1, Static172.aClass5_Sub50_14.aClass12_Sub20_1);
		Static172.aClass5_Sub50_14.method7531(0, Static172.aClass5_Sub50_14.aClass12_Sub6_2);
		Static172.aClass5_Sub50_14.method7531(0, Static172.aClass5_Sub50_14.aClass12_Sub6_1);
		Static172.aClass5_Sub50_14.method7531(2, Static172.aClass5_Sub50_14.aClass12_Sub28_1);
		Static172.aClass5_Sub50_14.method7531(0, Static172.aClass5_Sub50_14.aClass12_Sub1_1);
		Static172.aClass5_Sub50_14.method7531(0, Static172.aClass5_Sub50_14.aClass12_Sub15_1);
		Static637.method8571();
		Static172.aClass5_Sub50_14.method7531(0, Static172.aClass5_Sub50_14.aClass12_Sub14_1);
		Static172.aClass5_Sub50_14.method7531(4, Static172.aClass5_Sub50_14.aClass12_Sub27_1);
		Static675.method9021();
		Static459.method6575();
		Static592.aBoolean826 = true;
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public static int method2136(@OriginalArg(0) String arg0) {
		if (!Static412.aClass268_2.aBoolean644) {
			return -1;
		} else if (Static207.aHashtable5.containsKey(arg0)) {
			return 100;
		} else {
			@Pc(20) String local20 = Static318.method4986(arg0);
			if (local20 == null) {
				return -1;
			}
			@Pc(33) String local33 = Static328.aString48 + local20;
			if (!Static610.aClass390_118.method8925("", local33)) {
				return -1;
			} else if (Static610.aClass390_118.method8916(local33)) {
				@Pc(65) byte[] local65 = Static610.aClass390_118.method8917(local33, "");
				@Pc(71) File local71;
				try {
					local71 = Static44.method603(local20);
				} catch (@Pc(73) RuntimeException local73) {
					return -1;
				}
				if (local65 == null || local71 == null) {
					return -1;
				}
				@Pc(81) boolean local81 = true;
				@Pc(85) byte[] local85 = Static125.method2265(local71);
				if (local85 != null && local85.length == local65.length) {
					for (@Pc(98) int local98 = 0; local98 < local85.length; local98++) {
						if (local85[local98] != local65[local98]) {
							local81 = false;
							break;
						}
					}
				} else {
					local81 = false;
				}
				try {
					if (!local81) {
						Static412.aClass268_2.method6327(local71, local65);
					}
				} catch (@Pc(130) Throwable local130) {
					return -1;
				}
				Static131.method2370(arg0, local71);
				return 100;
			} else {
				return Static610.aClass390_118.method8926(local33);
			}
		}
	}
}

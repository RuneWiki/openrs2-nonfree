import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static193 {

	@OriginalMember(owner = "client!jo", name = "s", descriptor = "Lclient!ns;")
	public static Class166 aClass166_291;

	@OriginalMember(owner = "client!jo", name = "k", descriptor = "Lclient!vr;")
	public static Class258 aClass258_48 = new Class258();

	@OriginalMember(owner = "client!jo", name = "q", descriptor = "Lclient!cm;")
	public static final Class36 aClass36_134 = new Class36(23, -1);

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(II)Z")
	public static boolean method5638(@OriginalArg(1) int arg0) {
		return arg0 != 1 && arg0 != 7;
	}

	@OriginalMember(owner = "client!jo", name = "f", descriptor = "(I)V")
	public static void method5639() {
		if (Static205.anInt3906 == 0) {
			return;
		}
		try {
			if (++Static17.anInt522 > 1500) {
				if (Static223.aClass5_3 != null) {
					Static223.aClass5_3.method119();
					Static223.aClass5_3 = null;
				}
				if (Static225.anInt4000 >= 1) {
					Static205.anInt3906 = 0;
					Static452.anInt7565 = -5;
					return;
				}
				Static225.anInt4000++;
				if (Static444.anInt7413 == Static224.anInt4140) {
					Static224.anInt4140 = Static179.anInt3323;
				} else {
					Static224.anInt4140 = Static444.anInt7413;
				}
				Static17.anInt522 = 0;
				Static205.anInt3906 = 1;
			}
			if (Static205.anInt3906 == 1) {
				Static105.aClass108_5 = Static89.aClass114_3.method2364(Static224.anInt4140, Static220.aString53);
				Static205.anInt3906 = 2;
			}
			@Pc(119) int local119;
			if (Static205.anInt3906 == 2) {
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
				local119 = Static223.aClass5_3.method125();
				Static194.method2825();
				if (local119 != 101) {
					Static205.anInt3906 = 0;
					Static452.anInt7565 = local119;
					Static223.aClass5_3.method119();
					Static223.aClass5_3 = null;
					return;
				}
				Static205.anInt3906 = 3;
			}
			if (Static205.anInt3906 == 3 && Static223.aClass5_3.method120() >= 2) {
				local119 = Static223.aClass5_3.method125() << 8 | Static223.aClass5_3.method125();
				Static136.method1968(local119);
				if (Static83.anInt1889 == -1) {
					Static452.anInt7565 = 6;
					Static205.anInt3906 = 0;
					Static223.aClass5_3.method119();
					Static223.aClass5_3 = null;
				} else {
					Static205.anInt3906 = 0;
					Static223.aClass5_3.method119();
					Static223.aClass5_3 = null;
					Static133.method1944();
				}
			}
		} catch (@Pc(188) IOException local188) {
			if (Static223.aClass5_3 != null) {
				Static223.aClass5_3.method119();
				Static223.aClass5_3 = null;
			}
			if (Static225.anInt4000 < 1) {
				Static17.anInt522 = 0;
				if (Static444.anInt7413 == Static224.anInt4140) {
					Static224.anInt4140 = Static179.anInt3323;
				} else {
					Static224.anInt4140 = Static444.anInt7413;
				}
				Static225.anInt4000++;
				Static205.anInt3906 = 1;
			} else {
				Static205.anInt3906 = 0;
				Static452.anInt7565 = -4;
			}
		}
	}
}

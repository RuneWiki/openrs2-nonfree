import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static64 {

	@OriginalMember(owner = "client!cc", name = "c", descriptor = "Lclient!rg;")
	public static Class310 aClass310_13;

	@OriginalMember(owner = "client!cc", name = "d", descriptor = "Lclient!ho;")
	public static final Class160 aClass160_28 = new Class160(97, 1);

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IBI)Z")
	public static boolean method1039(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Z)V")
	public static void method1040() {
		if (Static465.anInt7807 == 0) {
			return;
		}
		try {
			if (++Static649.anInt10662 > 2000) {
				Static277.aClass347_1.method8306();
				if (Static535.anInt9160 >= 2) {
					Static465.anInt7807 = 0;
					Static689.anInt11198 = -5;
					return;
				}
				Static575.aClass357_5.method8506();
				Static465.anInt7807 = 1;
				Static649.anInt10662 = 0;
				Static535.anInt9160++;
			}
			if (Static465.anInt7807 == 1) {
				Static277.aClass347_1.aClass230_9 = Static575.aClass357_5.method8511(Static344.aClass173_5);
				Static465.anInt7807 = 2;
			}
			if (Static465.anInt7807 == 2) {
				if (Static277.aClass347_1.aClass230_9.anInt6256 == 2) {
					throw new IOException();
				}
				if (Static277.aClass347_1.aClass230_9.anInt6256 != 1) {
					return;
				}
				Static277.aClass347_1.aClass278_2 = Static405.method6124((Socket) Static277.aClass347_1.aClass230_9.anObject12);
				Static277.aClass347_1.aClass230_9 = null;
				Static277.aClass347_1.method8303();
				Static465.anInt7807 = 4;
			}
			if (Static465.anInt7807 == 4 && Static277.aClass347_1.aClass278_2.method6653(1)) {
				Static277.aClass347_1.aClass278_2.method6650(1, Static277.aClass347_1.aClass14_Sub21_Sub2_1.aByteArray99, 0);
				@Pc(144) int local144 = Static277.aClass347_1.aClass14_Sub21_Sub2_1.aByteArray99[0] & 0xFF;
				Static689.anInt11198 = local144;
				Static465.anInt7807 = 0;
				Static277.aClass347_1.method8306();
			}
		} catch (@Pc(153) IOException local153) {
			Static277.aClass347_1.method8306();
			if (Static535.anInt9160 >= 2) {
				Static465.anInt7807 = 0;
				Static689.anInt11198 = -4;
			} else {
				Static575.aClass357_5.method8506();
				Static535.anInt9160++;
				Static465.anInt7807 = 1;
				Static649.anInt10662 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(BI)I")
	public static int method1041(@OriginalArg(1) int arg0) {
		@Pc(13) int local13 = arg0 >>> 1;
		@Pc(19) int local19 = local13 | local13 >>> 1;
		@Pc(25) int local25 = local19 | local19 >>> 2;
		@Pc(31) int local31 = local25 | local25 >>> 4;
		@Pc(37) int local37 = local31 | local31 >>> 8;
		@Pc(43) int local43 = local37 | local37 >>> 16;
		return arg0 & ~local43;
	}
}

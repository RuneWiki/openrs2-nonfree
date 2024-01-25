import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static141 {

	@OriginalMember(owner = "client!hd", name = "e", descriptor = "I")
	public static int anInt3017;

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "Lclient!wj;")
	public static final Class265 aClass265_55 = new Class265(48, -2);

	@OriginalMember(owner = "client!hd", name = "d", descriptor = "I")
	public static int anInt3016 = 0;

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IJ)V")
	public static void method2385(@OriginalArg(1) long arg0) {
		if (Static440.aClass106ArrayArrayArray3 != null) {
			if (Static159.anInt3195 == 1 || Static159.anInt3195 == 5) {
				Static19.method4249(arg0);
			} else if (Static159.anInt3195 == 4) {
				Static20.method452(arg0);
			}
		}
		Static139.method2377((long) Static131.anInt2821, Static33.aClass49_1);
		if (Static410.anInt6841 != -1) {
			Static131.method2234(Static410.anInt6841);
		}
		for (@Pc(42) int local42 = 0; local42 < Static104.anInt2441; local42++) {
			if (Static243.aBooleanArray19[local42]) {
				Static367.aBooleanArray23[local42] = true;
			}
			Static345.aBooleanArray21[local42] = Static243.aBooleanArray19[local42];
			Static243.aBooleanArray19[local42] = false;
		}
		Static245.anInt6498 = Static131.anInt2821;
		if (Static33.aClass49_1.method4465()) {
			Static103.aBoolean171 = true;
		}
		if (Static410.anInt6841 != -1) {
			Static104.anInt2441 = 0;
			Static363.method4954();
		}
		Static33.aClass49_1.e();
		Static333.method4655(Static33.aClass49_1);
		@Pc(91) int local91 = Static279.method4092();
		if (local91 == -1) {
			local91 = Static54.anInt1162;
		}
		if (local91 == -1) {
			local91 = Static368.anInt6315;
		}
		Static10.method226(local91);
		Static455.method4473(Static375.aClass3_Sub2_Sub1_Sub2_7.anInt6121, Static377.anInt6400, Static375.aClass3_Sub2_Sub1_Sub2_7.aByte89, Static375.aClass3_Sub2_Sub1_Sub2_7.anInt6119);
		Static377.anInt6400 = 0;
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(B)V")
	public static void method2387() {
		@Pc(8) Class2_Sub5_Sub13 local8 = Static208.method3306(0, 15);
		local8.method4545();
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(II)V")
	public static void method2388(@OriginalArg(1) int arg0) {
		@Pc(16) Class2_Sub5_Sub13 local16 = Static208.method3306(arg0, 3);
		local16.method4545();
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static151 {

	@OriginalMember(owner = "client!ff", name = "p", descriptor = "[Lclient!kf;")
	public static Class14_Sub1[] aClass14_Sub1Array1;

	@OriginalMember(owner = "client!ff", name = "i", descriptor = "[[I")
	public static final int[][] anIntArrayArray14 = new int[128][128];

	@OriginalMember(owner = "client!ff", name = "j", descriptor = "[F")
	public static final float[] aFloatArray4 = new float[4];

	@OriginalMember(owner = "client!ff", name = "n", descriptor = "Lclient!du;")
	public static final Class81 aClass81_24 = new Class81(8);

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(ILjava/lang/String;CLjava/lang/String;)Ljava/lang/String;")
	public static String method2203(@OriginalArg(1) String arg0, @OriginalArg(3) String arg1) {
		@Pc(8) int local8 = arg0.length();
		@Pc(19) int local19 = arg1.length();
		@Pc(21) int local21 = local8;
		@Pc(25) int local25 = local19 - 1;
		if (local25 != 0) {
			@Pc(32) int local32 = 0;
			while (true) {
				local32 = arg0.indexOf(13, local32);
				if (local32 < 0) {
					break;
				}
				local32++;
				local21 += local25;
			}
		}
		@Pc(51) StringBuffer local51 = new StringBuffer(local21);
		@Pc(53) int local53 = 0;
		while (true) {
			@Pc(58) int local58 = arg0.indexOf(13, local53);
			if (local58 < 0) {
				local51.append(arg0.substring(local53));
				return local51.toString();
			}
			local51.append(arg0.substring(local53, local58));
			local53 = local58 + 1;
			local51.append(arg1);
		}
	}

	@OriginalMember(owner = "client!ff", name = "c", descriptor = "(Z)V")
	public static void method2205() {
		Static113.aClass357Array1 = null;
		if (Static144.aBoolean196 && Static259.method1979() != 1) {
			Static222.method3433(0, Static469.anInt7883 == 3 || Static469.anInt7883 == 7, 0, Static173.method2662(), Static626.method8673());
		}
		@Pc(34) int local34 = 0;
		@Pc(40) int local40 = 0;
		if (Static144.aBoolean196) {
			local34 = Static577.method8147();
			local40 = Static601.method8395();
		}
		Static14.method400(local34, Static302.anInt4813, local40, local40, local34 + Static254.anInt4283, local34, -1, local40 + Static438.anInt7403);
		if (Static113.aClass357Array1 != null) {
			Static380.method8023(local40 + Static438.anInt7403, Static201.anInt3585, local40, Static403.anInt6955, true, Static113.aClass357Array1, -1412584499, local34, Static536.aClass357_10.anInt9857, Static254.anInt4283 + local34);
			Static113.aClass357Array1 = null;
		}
	}
}

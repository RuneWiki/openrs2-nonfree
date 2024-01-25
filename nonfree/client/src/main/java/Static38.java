import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static38 {

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "Lclient!jk;")
	public static final Class173 aClass173_8 = new Class173(8, -1);

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(II[B)[B")
	public static byte[] method486(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		@Pc(6) byte[] local6 = new byte[arg0];
		Static597.method3730(arg1, 0, local6, 0, arg0);
		return local6;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lclient!kv;ILclient!jn;Lclient!mt;Lclient!jn;Lclient!jn;)Z")
	public static boolean method487(@OriginalArg(0) Class80 arg0, @OriginalArg(2) Class176 arg1, @OriginalArg(3) Class4_Sub7_Sub3 arg2, @OriginalArg(4) Class176 arg3, @OriginalArg(5) Class176 arg4) {
		Static405.aClass4_Sub7_Sub3_4 = arg2;
		Static124.aClass80_4 = arg0;
		Static98.aClass176_33 = arg3;
		Static299.aClass176_76 = arg1;
		Static539.aClass176_129 = arg4;
		for (@Pc(17) int local17 = 0; local17 < 16; local17++) {
			Static342.anIntArray341[local17] = 255;
		}
		return true;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(ZLclient!n;I)V")
	public static void method489(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class225 arg1) {
		@Pc(15) int local15 = arg1.anInt6506 == 0 ? arg1.anInt6529 : arg1.anInt6506;
		@Pc(24) int local24 = arg1.anInt6489 == 0 ? arg1.anInt6521 : arg1.anInt6489;
		Static289.method5062(local15, arg1.anInt6555, arg0, local24, Static343.aClass225ArrayArray1[arg1.anInt6555 >> 16]);
		if (arg1.aClass225Array1 != null) {
			Static289.method5062(local15, arg1.anInt6555, arg0, local24, arg1.aClass225Array1);
		}
		@Pc(57) Class4_Sub37 local57 = (Class4_Sub37) Static189.aClass350_14.method8207((long) arg1.anInt6555);
		if (local57 != null) {
			Static100.method2182(local24, local15, local57.anInt8141, arg0);
		}
	}
}

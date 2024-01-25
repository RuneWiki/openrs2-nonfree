import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static233 {

	@OriginalMember(owner = "client!pc", name = "f", descriptor = "I")
	public static int anInt4700;

	@OriginalMember(owner = "client!pc", name = "p", descriptor = "Lclient!as;")
	public static Class16 aClass16_3;

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "Lclient!m;")
	public static final Class127 aClass127_25 = new Class127();

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(II)V")
	public static void method4011(@OriginalArg(1) int arg0) {
		@Pc(8) Class3_Sub7_Sub11 local8 = Static116.method2029(arg0, 10);
		local8.method2502();
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(ILclient!ps;)V")
	public static void method4012(@OriginalArg(1) Class5_Sub4_Sub4 arg0) {
		@Pc(5) boolean local5 = false;
		if (arg0.anInt4889 == Static51.anInt1101 || arg0.anInt4915 == -1 || arg0.anInt4918 != 0) {
			local5 = true;
		} else {
			@Pc(33) Class131 local33 = Static343.method5604(arg0.anInt4915);
			if (local33.aBoolean228 || arg0.anInt4903 + 1 > local33.anIntArray337[arg0.anInt4912]) {
				local5 = true;
			}
		}
		if (local5) {
			@Pc(57) int local57 = arg0.anInt4889 - arg0.anInt4936;
			@Pc(63) int local63 = Static51.anInt1101 - arg0.anInt4936;
			@Pc(75) int local75 = arg0.anInt4905 * 128 + arg0.method4208() * 64;
			@Pc(87) int local87 = arg0.anInt4943 * 128 + arg0.method4208() * 64;
			@Pc(99) int local99 = arg0.anInt4920 * 128 + arg0.method4208() * 64;
			@Pc(110) int local110 = arg0.anInt4924 * 128 + arg0.method4208() * 64;
			arg0.anInt5901 = ((local57 - local63) * local75 + local99 * local63) / local57;
			arg0.anInt5905 = (local63 * local110 + local87 * (local57 - local63)) / local57;
		}
		arg0.anInt4956 = 0;
		if (arg0.anInt4916 == 0) {
			arg0.method4210(8192);
		}
		if (arg0.anInt4916 == 1) {
			arg0.method4210(12288);
		}
		if (arg0.anInt4916 == 2) {
			arg0.method4210(0);
		}
		if (arg0.anInt4916 == 3) {
			arg0.method4210(4096);
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(ZZ)V")
	public static void method4014(@OriginalArg(0) boolean arg0) {
		if (arg0 && Static193.aClass3_Sub7_Sub13_4 != null) {
			Static306.anInt6045 = Static193.aClass3_Sub7_Sub13_4.anInt3143;
		} else {
			Static306.anInt6045 = -1;
		}
		Static134.anInt2769 = 0;
		Static293.aClass127_40 = null;
		Static18.aClass181_4 = null;
		Static193.aClass3_Sub7_Sub13_4 = null;
		Static193.method1907();
		Static193.aClass127_11.method3401();
		Static307.aClass201_16 = null;
		Static265.anInt5321 = -1;
		Static163.aClass201_8 = null;
		Static286.anInt5771 = -1;
		Static274.aClass201_15 = null;
		Static98.aClass201_1 = null;
		Static215.aClass201_11 = null;
		Static251.aClass201_14 = null;
		Static72.aClass57_6 = null;
		Static193.aClass146_2 = null;
		Static162.aClass201_3 = null;
		Static235.aClass201_12 = null;
		Static116.method2030();
		Static41.aClass137_1 = null;
		Static179.method2993(128, 64);
		Static335.method5501(64, 64);
		Static181.method799(64);
		Static122.method2154(64);
	}
}

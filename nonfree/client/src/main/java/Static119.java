import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static119 {

	@OriginalMember(owner = "client!eea", name = "s", descriptor = "I")
	public static int anInt1943;

	@OriginalMember(owner = "client!eea", name = "n", descriptor = "Lclient!at;")
	public static Class20 aClass20_7 = new Class20();

	@OriginalMember(owner = "client!eea", name = "r", descriptor = "I")
	public static int anInt1944 = 0;

	@OriginalMember(owner = "client!eea", name = "q", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray8 = new String[100];

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(Z)V")
	public static void method1758() {
		Static446.aString85 = "";
		Static564.anInt8912 = -1;
		Static446.aLong213 = 0L;
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(IZILclient!mj;I)V")
	public static void method1759(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class238 arg3) {
		@Pc(8) int local8 = arg3.anInt5985;
		@Pc(11) int local11 = arg3.anInt5973;
		if (arg3.aByte85 == 0) {
			arg3.anInt5985 = arg3.anInt5980;
		} else if (arg3.aByte85 == 1) {
			arg3.anInt5985 = arg2 - arg3.anInt5980;
		} else if (arg3.aByte85 == 2) {
			arg3.anInt5985 = arg3.anInt5980 * arg2 >> 14;
		}
		if (arg3.aByte83 == 0) {
			arg3.anInt5973 = arg3.anInt6031;
		} else if (arg3.aByte83 == 1) {
			arg3.anInt5973 = arg0 - arg3.anInt6031;
		} else if (arg3.aByte83 == 2) {
			arg3.anInt5973 = arg0 * arg3.anInt6031 >> 14;
		}
		if (arg3.aByte85 == 4) {
			arg3.anInt5985 = arg3.anInt5961 * arg3.anInt5973 / arg3.anInt5954;
		}
		if (arg3.aByte83 == 4) {
			arg3.anInt5973 = arg3.anInt5985 * arg3.anInt5954 / arg3.anInt5961;
		}
		if (Static628.aBoolean710 && (Static73.method1209(arg3).anInt2210 != 0 || arg3.anInt5976 == 0)) {
			if (arg3.anInt5973 < 5 && arg3.anInt5985 < 5) {
				arg3.anInt5973 = 5;
				arg3.anInt5985 = 5;
			} else {
				if (arg3.anInt5985 <= 0) {
					arg3.anInt5985 = 5;
				}
				if (arg3.anInt5973 <= 0) {
					arg3.anInt5973 = 5;
				}
			}
		}
		if (arg3.anInt5962 == Static138.anInt2744) {
			Static326.aClass238_7 = arg3;
		}
		if (arg1 && arg3.anObjectArray29 != null && (arg3.anInt5985 != local8 || arg3.anInt5973 != local11)) {
			@Pc(252) Class5_Sub24 local252 = new Class5_Sub24();
			local252.aClass238_6 = arg3;
			local252.anObjectArray2 = arg3.anObjectArray29;
			Static196.aClass20_11.method370(local252);
		}
	}
}

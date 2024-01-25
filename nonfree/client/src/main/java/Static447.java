import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static447 {

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "Lclient!pf;")
	public static final Class286 aClass286_8 = new Class286("", 12);

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(ILclient!sj;III)V")
	public static void method6533(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub2_Sub1_Sub2 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(16) Class49 local16 = arg1.method2064(-128);
		@Pc(19) Class53 local19 = arg1.aClass53_6;
		@Pc(29) int local29 = arg1.anInt2355 - arg1.aClass178_7.anInt4197 & 0x3FFF;
		if (arg3 == -1) {
			if (local29 == 0 && arg1.anInt2365 <= 25) {
				if (!arg1.aBoolean248 || !local16.method945(local19.method4088())) {
					local19.method4089(local16.method946());
					arg1.aBoolean248 = local19.method4094();
				}
			} else if (arg0 < 0 && local16.anInt1056 != -1) {
				local19.method4089(local16.anInt1056);
				arg1.aBoolean248 = false;
			} else if (arg0 > 0 && local16.anInt1066 != -1) {
				local19.method4089(local16.anInt1066);
				arg1.aBoolean248 = false;
			} else if (!arg1.aBoolean248 || !local16.method945(local19.method4088())) {
				local19.method4089(local16.method946());
				arg1.aBoolean248 = arg1.aClass53_6.method4094();
			}
		} else if (arg1.anInt2348 != -1 && (local29 >= 10240 || local29 <= 2048)) {
			@Pc(304) int local304 = Static640.anIntArray707[arg2] - arg1.aClass178_7.anInt4197 & 0x3FFF;
			if (arg3 == 2 && local16.anInt1071 != -1) {
				if (local304 > 2048 && local304 <= 6144 && local16.anInt1059 != -1) {
					local19.method4089(local16.anInt1059);
				} else if (local304 >= 10240 && local304 < 14336 && local16.anInt1100 != -1) {
					local19.method4089(local16.anInt1100);
				} else if (local304 <= 6144 || local304 >= 10240 || local16.anInt1057 == -1) {
					local19.method4089(local16.anInt1071);
				} else {
					local19.method4089(local16.anInt1057);
				}
			} else if (arg3 == 0 && local16.anInt1055 != -1) {
				if (local304 > 2048 && local304 <= 6144 && local16.anInt1062 != -1) {
					local19.method4089(local16.anInt1062);
				} else if (local304 >= 10240 && local304 < 14336 && local16.anInt1069 != -1) {
					local19.method4089(local16.anInt1069);
				} else if (local304 <= 6144 || local304 >= 10240 || local16.anInt1097 == -1) {
					local19.method4089(local16.anInt1055);
				} else {
					local19.method4089(local16.anInt1097);
				}
			} else if (local304 > 2048 && local304 <= 6144 && local16.anInt1094 != -1) {
				local19.method4089(local16.anInt1094);
			} else if (local304 >= 10240 && local304 < 14336 && local16.anInt1058 != -1) {
				local19.method4089(local16.anInt1058);
			} else if (local304 <= 6144 || local304 >= 10240 || local16.anInt1089 == -1) {
				local19.method4089(local16.anInt1078);
			} else {
				local19.method4089(local16.anInt1089);
			}
			arg1.aBoolean248 = false;
		} else if (local29 == 0 && arg1.anInt2365 <= 25) {
			if (arg3 == 2 && local16.anInt1071 != -1) {
				local19.method4089(local16.anInt1071);
			} else if (arg3 == 0 && local16.anInt1055 != -1) {
				local19.method4089(local16.anInt1055);
			} else {
				local19.method4089(local16.anInt1078);
			}
			arg1.aBoolean248 = false;
		} else {
			if (arg3 == 2 && local16.anInt1071 != -1) {
				if (arg0 < 0 && local16.anInt1063 != -1) {
					local19.method4089(local16.anInt1063);
				} else if (arg0 <= 0 || local16.anInt1077 == -1) {
					local19.method4089(local16.anInt1071);
				} else {
					local19.method4089(local16.anInt1077);
				}
			} else if (arg3 == 0 && local16.anInt1055 != -1) {
				if (arg0 < 0 && local16.anInt1064 != -1) {
					local19.method4089(local16.anInt1064);
				} else if (arg0 <= 0 || local16.anInt1082 == -1) {
					local19.method4089(local16.anInt1055);
				} else {
					local19.method4089(local16.anInt1082);
				}
			} else if (arg0 < 0 && local16.anInt1083 != -1) {
				local19.method4089(local16.anInt1083);
			} else if (arg0 <= 0 || local16.anInt1065 == -1) {
				local19.method4089(local16.anInt1078);
			} else {
				local19.method4089(local16.anInt1065);
			}
			arg1.aBoolean248 = false;
		}
	}
}

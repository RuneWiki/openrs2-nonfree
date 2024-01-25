import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static486 {

	@OriginalMember(owner = "client!rh", name = "j", descriptor = "Lclient!d;")
	public static Interface6 anInterface6_10;

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIZ)Z")
	public static boolean method6974(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "(I)V")
	public static void method6975() {
		try {
			@Pc(10) int local10;
			if (Static158.anInt3597 == 1) {
				local10 = Static489.aClass2_Sub2_Sub1_4.method179();
				if (local10 > 0 && Static489.aClass2_Sub2_Sub1_4.method169()) {
					local10 -= Static43.anInt969;
					if (local10 < 0) {
						local10 = 0;
					}
					Static489.aClass2_Sub2_Sub1_4.method178(local10);
					return;
				}
				Static489.aClass2_Sub2_Sub1_4.method180();
				Static489.aClass2_Sub2_Sub1_4.method162();
				Static8.aClass229_1 = null;
				if (Static192.aClass97_53 == null) {
					Static158.anInt3597 = 0;
				} else {
					Static158.anInt3597 = 2;
				}
				Static217.aClass2_Sub43_2 = null;
			}
			if (Static158.anInt3597 == 3) {
				local10 = Static489.aClass2_Sub2_Sub1_4.method179();
				if (Static119.anInt2867 > local10 && Static489.aClass2_Sub2_Sub1_4.method169()) {
					local10 += Static157.anInt3573;
					if (Static119.anInt2867 < local10) {
						local10 = Static119.anInt2867;
					}
					Static489.aClass2_Sub2_Sub1_4.method178(local10);
				} else {
					Static158.anInt3597 = 0;
					Static157.anInt3573 = 0;
				}
			}
		} catch (@Pc(89) Exception local89) {
			local89.printStackTrace();
			Static489.aClass2_Sub2_Sub1_4.method180();
			Static8.aClass229_1 = null;
			Static158.anInt3597 = 0;
			Static189.aClass2_Sub2_Sub1_1 = null;
			Static192.aClass97_53 = null;
			Static217.aClass2_Sub43_2 = null;
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(III)Z")
	public static boolean method6977(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lclient!kba;Lclient!kba;I)V")
	public static void method6978(@OriginalArg(0) Class11 arg0, @OriginalArg(1) Class11 arg1) {
		if (arg0.aClass11_67 != null) {
			arg0.method8372();
		}
		arg0.aClass11_68 = arg1;
		arg0.aClass11_67 = arg1.aClass11_67;
		arg0.aClass11_67.aClass11_68 = arg0;
		arg0.aClass11_68.aClass11_67 = arg0;
	}
}

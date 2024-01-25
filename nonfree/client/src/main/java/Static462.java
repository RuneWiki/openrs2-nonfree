import java.math.BigInteger;
import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static462 {

	@OriginalMember(owner = "client!pl", name = "h", descriptor = "I")
	public static int anInt7482;

	@OriginalMember(owner = "client!pl", name = "r", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger4 = new BigInteger("10001", 16);

	@OriginalMember(owner = "client!pl", name = "g", descriptor = "Ljava/util/Calendar;")
	public static final Calendar aCalendar4 = Calendar.getInstance();

	@OriginalMember(owner = "client!pl", name = "j", descriptor = "Ljava/util/Calendar;")
	public static final Calendar aCalendar5 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(ZBI)V")
	public static void method6506(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		Static492.method6899(-5, arg0, arg1, Static184.aClass131_13.method3168(Static375.anInt7800));
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(I[I)Ljava/lang/String;")
	public static String method6508(@OriginalArg(1) int[] arg0) {
		@Pc(9) StringBuffer local9 = new StringBuffer();
		@Pc(11) int local11 = Static242.anInt5017;
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			@Pc(22) Class145 local22 = Static234.aClass101_1.method2560(arg0[local13]);
			if (local22.anInt3696 != -1) {
				@Pc(37) Class155 local37 = (Class155) Static199.aClass168_33.method3860((long) local22.anInt3696);
				if (local37 == null) {
					@Pc(45) Class362 local45 = Static692.method8275(Static27.aClass126_18, local22.anInt3696, 0);
					if (local45 != null) {
						local37 = Static273.aClass100_6.method8640(local45, true);
						Static199.aClass168_33.method3853((long) local22.anInt3696, local37);
					}
				}
				if (local37 != null) {
					Static67.aClass155Array3[local11] = local37;
					local9.append(" <img=").append(local11).append(">");
					local11++;
				}
			}
		}
		return local9.toString();
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(BLclient!mj;)V")
	public static void method6509(@OriginalArg(1) Class238 arg0) {
		if (arg0.anInt5962 != Static321.anInt5474) {
			return;
		}
		if (Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.aString44 == null) {
			arg0.anInt6016 = 0;
			arg0.anInt5964 = 0;
			return;
		}
		arg0.anInt5946 = 150;
		arg0.anInt6025 = (int) (Math.sin((double) Static565.anInt8921 / 40.0D) * 256.0D) & 0x7FF;
		arg0.anInt5967 = 5;
		arg0.anInt5964 = Static649.anInt10621;
		arg0.anInt6016 = Static46.method848(Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.aString44);
		arg0.anInt6022 = Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.anInt6867;
		arg0.anInt5968 = Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.anInt6854;
		arg0.anInt6023 = 0;
		arg0.anInt5996 = Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.anInt6837;
		@Pc(75) Class264 local75 = arg0.anInt5996 == -1 ? null : Static315.aClass14_1.method227(arg0.anInt5996);
		if (local75 != null) {
			Static179.method3121(arg0.anInt5968, local75);
		}
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(I)V")
	public static void method6510() {
		Static479.aClass10_8 = null;
		Static83.aClass10_1 = null;
		Static483.anIntArray454 = null;
		Static503.anInt9738 = -1;
		Static181.anInt3401 = -1;
		Static682.anInterface24_1 = null;
		Static548.aClass100_13 = null;
		Static500.aClass10_9 = null;
		Static111.anInterface24Array1 = null;
		Static110.anInt9536 = -1;
		Static518.anInt8219 = -1;
		Static590.aClass321_1.method7352();
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(IIII)V")
	public static void method6511(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		Static172.aByteArrayArrayArray23 = new byte[4][arg0][arg1];
	}
}

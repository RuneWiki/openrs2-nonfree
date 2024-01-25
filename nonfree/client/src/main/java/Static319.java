import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static319 {

	@OriginalMember(owner = "client!u", name = "Y", descriptor = "Lclient!ae;")
	public static Class2_Sub2 aClass2_Sub2_2;

	@OriginalMember(owner = "client!u", name = "Z", descriptor = "Lclient!tc;")
	public static Class3 aClass3_4;

	@OriginalMember(owner = "client!u", name = "db", descriptor = "Z")
	public static boolean aBoolean562;

	@OriginalMember(owner = "client!u", name = "fb", descriptor = "Lclient!iq;")
	public static Class104 aClass104_165;

	@OriginalMember(owner = "client!u", name = "V", descriptor = "Lclient!tm;")
	public static final Class193 aClass193_9 = new Class193();

	@OriginalMember(owner = "client!u", name = "X", descriptor = "Z")
	public static volatile boolean aBoolean561 = true;

	@OriginalMember(owner = "client!u", name = "eb", descriptor = "Ljava/lang/String;")
	public static String aString66 = "";

	@OriginalMember(owner = "client!u", name = "j", descriptor = "(I)V")
	public static void method5303() {
		Static164.anIntArray290 = Static358.method5715(0.4F);
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(Lclient!lg;)V")
	public static void method5305(@OriginalArg(0) Class2_Sub10_Sub1 arg0) {
		if (Static88.anInt1647 >= 65535) {
			return;
		}
		Static120.aClass2_Sub10_Sub1Array2[Static88.anInt1647] = arg0;
		Static121.aBooleanArray10[Static88.anInt1647] = false;
		Static88.anInt1647++;
		@Pc(18) int local18 = arg0.anInt4052;
		if (arg0.aBoolean343) {
			local18 = 0;
		}
		@Pc(26) int local26 = arg0.anInt4052;
		if (arg0.aBoolean342) {
			local26 = Static32.anInt516 - 1;
		}
		for (@Pc(35) int local35 = local18; local35 <= local26; local35++) {
			@Pc(38) int local38 = 0;
			@Pc(48) int local48 = arg0.anInt4043 + Static31.anInt496 - arg0.anInt4042 >> Static325.anInt6336;
			if (local48 < 0) {
				local38 = -local48;
				local48 = 0;
			}
			@Pc(66) int local66 = arg0.anInt4043 + arg0.anInt4042 - Static31.anInt496 >> Static325.anInt6336;
			if (local66 >= Static63.anInt1129) {
				local66 = Static63.anInt1129 - 1;
			}
			for (@Pc(75) int local75 = local48; local75 <= local66; local75++) {
				@Pc(82) short local82 = arg0.aShortArray59[local38++];
				@Pc(96) int local96 = (arg0.anInt4039 + Static31.anInt496 - arg0.anInt4042 >> Static325.anInt6336) + (local82 >>> 8);
				@Pc(104) int local104 = local96 + (local82 & 0xFF) - 1;
				if (local96 < 0) {
					local96 = 0;
				}
				if (local104 >= Static344.anInt6692) {
					local104 = Static344.anInt6692 - 1;
				}
				for (@Pc(117) int local117 = local96; local117 <= local104; local117++) {
					@Pc(126) long local126 = Static360.aLongArrayArrayArray1[local35][local117][local75];
					if ((local126 & 0xFFFFL) == 0L) {
						Static360.aLongArrayArrayArray1[local35][local117][local75] = local126 | (long) Static88.anInt1647;
					} else if ((local126 & 0xFFFF0000L) == 0L) {
						Static360.aLongArrayArrayArray1[local35][local117][local75] = local126 | (long) Static88.anInt1647 << 16;
					} else if ((local126 & 0xFFFF00000000L) == 0L) {
						Static360.aLongArrayArrayArray1[local35][local117][local75] = local126 | (long) Static88.anInt1647 << 32;
					} else if ((local126 & 0xFFFF000000000000L) == 0L) {
						Static360.aLongArrayArrayArray1[local35][local117][local75] = local126 | (long) Static88.anInt1647 << 48;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(Ljava/lang/String;Lclient!ef;Z)I")
	public static int method5306(@OriginalArg(0) String arg0, @OriginalArg(1) Class2_Sub12 arg1) {
		@Pc(11) int local11 = arg1.anInt3606;
		@Pc(15) byte[] local15 = Static285.method4830(arg0);
		arg1.method3117(local15.length);
		arg1.anInt3606 += Static51.aClass218_1.method5684(local15, arg1.aByteArray30, local15.length, arg1.anInt3606, 0);
		return arg1.anInt3606 - local11;
	}
}

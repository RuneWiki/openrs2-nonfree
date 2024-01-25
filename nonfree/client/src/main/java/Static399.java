import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static399 {

	@OriginalMember(owner = "client!oda", name = "h", descriptor = "I")
	public static int anInt7127;

	@OriginalMember(owner = "client!oda", name = "k", descriptor = "[[Lclient!dm;")
	public static Class78[][] aClass78ArrayArray1;

	@OriginalMember(owner = "client!oda", name = "j", descriptor = "Z")
	public static boolean aBoolean530 = false;

	@OriginalMember(owner = "client!oda", name = "n", descriptor = "[F")
	public static final float[] aFloatArray60 = new float[4];

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(Ljava/lang/String;IZ)V")
	public static void method6038(@OriginalArg(0) String arg0, @OriginalArg(2) boolean arg1) {
		if (arg0 == null) {
			return;
		}
		if (Static449.anInt7920 >= 100) {
			Static74.method1384(Static628.aClass369_39.method8475(Static377.anInt6756));
			return;
		}
		@Pc(21) String local21 = Static70.method1355(arg0);
		if (local21 == null) {
			return;
		}
		@Pc(64) String local64;
		for (@Pc(26) int local26 = 0; local26 < Static449.anInt7920; local26++) {
			@Pc(33) String local33 = Static70.method1355(Static7.aStringArray3[local26]);
			if (local33 != null && local33.equals(local21)) {
				Static74.method1384(arg0 + Static628.aClass369_40.method8475(Static377.anInt6756));
				return;
			}
			if (Static525.aStringArray38[local26] != null) {
				local64 = Static70.method1355(Static525.aStringArray38[local26]);
				if (local64 != null && local64.equals(local21)) {
					Static74.method1384(arg0 + Static628.aClass369_40.method8475(Static377.anInt6756));
					return;
				}
			}
		}
		for (@Pc(95) int local95 = 0; local95 < Static446.anInt7901; local95++) {
			local64 = Static70.method1355(Static391.aStringArray25[local95]);
			if (local64 != null && local64.equals(local21)) {
				Static74.method1384(Static628.aClass369_45.method8475(Static377.anInt6756) + arg0 + Static628.aClass369_46.method8475(Static377.anInt6756));
				return;
			}
			if (Static488.aStringArray35[local95] != null) {
				@Pc(140) String local140 = Static70.method1355(Static488.aStringArray35[local95]);
				if (local140 != null && local140.equals(local21)) {
					Static74.method1384(Static628.aClass369_45.method8475(Static377.anInt6756) + arg0 + Static628.aClass369_46.method8475(Static377.anInt6756));
					return;
				}
			}
		}
		if (Static70.method1355(Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.aString4).equals(local21)) {
			Static74.method1384(Static628.aClass369_42.method8475(Static377.anInt6756));
			return;
		}
		@Pc(202) Class2_Sub50 local202 = Static595.method8194(Static610.aClass310_2, Static71.aClass269_17);
		local202.aClass2_Sub34_Sub2_2.method6894(Static163.method3038(arg0) + 1);
		local202.aClass2_Sub34_Sub2_2.method6918(arg0);
		local202.aClass2_Sub34_Sub2_2.method6894(arg1 ? 1 : 0);
		Static311.method4754(local202);
	}

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(Ljava/lang/String;II[B)I")
	public static int method6039(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(8) int local8 = arg0.length();
		for (@Pc(17) int local17 = 0; local17 < local8; local17 += 4) {
			@Pc(24) int local24 = Static102.method7315(arg0.charAt(local17));
			@Pc(45) int local45 = local8 <= local17 + 1 ? -1 : Static102.method7315(arg0.charAt(local17 + 1));
			@Pc(60) int local60 = local8 > local17 + 2 ? Static102.method7315(arg0.charAt(local17 + 2)) : -1;
			@Pc(75) int local75 = local8 <= local17 + 3 ? -1 : Static102.method7315(arg0.charAt(local17 + 3));
			arg2[arg1++] = (byte) (local24 << 2 | local45 >>> 4);
			if (local60 == -1) {
				break;
			}
			arg2[arg1++] = (byte) ((local45 & 0xF) << 4 | local60 >>> 2);
			if (local75 == -1) {
				break;
			}
			arg2[arg1++] = (byte) (local75 | (local60 & 0x3) << 6);
		}
		return arg1;
	}

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(IIZ)V")
	public static void method6040(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class2_Sub5_Sub10 local8 = Static594.method8175(arg1, 12);
		local8.method4393();
		local8.anInt5255 = arg0;
	}
}

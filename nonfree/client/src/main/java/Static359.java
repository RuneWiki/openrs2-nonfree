import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static359 {

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "J")
	public static long aLong179 = -1L;

	@OriginalMember(owner = "client!nk", name = "b", descriptor = "[I")
	public static final int[] anIntArray400 = new int[16];

	@OriginalMember(owner = "client!nk", name = "f", descriptor = "I")
	public static int anInt6489 = -1;

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(ZZ)V")
	public static void method5538(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			if (Static353.anInt6188 != -1) {
				Static153.method2893(Static353.anInt6188);
			}
			for (@Pc(14) Class3_Sub49 local14 = (Class3_Sub49) Static216.aClass354_18.method7694(); local14 != null; local14 = (Class3_Sub49) Static216.aClass354_18.method7692()) {
				if (!local14.method7828()) {
					local14 = (Class3_Sub49) Static216.aClass354_18.method7694();
					if (local14 == null) {
						break;
					}
				}
				Static250.method3868(local14, false, true);
			}
			Static353.anInt6188 = -1;
			Static216.aClass354_18 = new Class354(8);
			Static333.method4752();
			Static353.anInt6188 = Static121.anInt2791;
			Static101.method1867(false);
			Static238.method3668();
			Static312.method4561(Static353.anInt6188);
		}
		Static241.aBoolean317 = true;
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method5539(@OriginalArg(0) String arg0) {
		if (Static421.aStringArray28 == null) {
			Static75.method1576();
		}
		Static383.aCalendar2.setTime(new Date(Static158.method2936()));
		@Pc(20) int local20 = Static383.aCalendar2.get(11);
		@Pc(24) int local24 = Static383.aCalendar2.get(12);
		@Pc(28) int local28 = Static383.aCalendar2.get(13);
		@Pc(62) String local62 = Integer.toString(local20 / 10) + local20 % 10 + ":" + local24 / 10 + local24 % 10 + ":" + local28 / 10 + local28 % 10;
		@Pc(67) String[] local67 = Static572.method7699('\n', arg0);
		for (@Pc(69) int local69 = 0; local69 < local67.length; local69++) {
			for (@Pc(73) int local73 = Static59.anInt1292; local73 > 0; local73--) {
				Static421.aStringArray28[local73] = Static421.aStringArray28[local73 - 1];
			}
			Static421.aStringArray28[0] = local62 + ": " + local67[local69];
			if (Static421.aStringArray28.length - 1 > Static59.anInt1292) {
				Static59.anInt1292++;
				if (Static98.anInt1998 > 0) {
					Static98.anInt1998++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(II)Lclient!hb;")
	public static Class122 method5542(@OriginalArg(1) int arg0) {
		@Pc(13) Class122[] local13 = Static250.method3867();
		for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
			@Pc(21) Class122 local21 = local13[local15];
			if (arg0 == local21.anInt3616) {
				return local21;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(Lclient!np;B)Lclient!wfa;")
	public static Class37_Sub4 method5543(@OriginalArg(0) Class3_Sub11 arg0) {
		return new Class37_Sub4(arg0.method5231(), arg0.method5231(), arg0.method5231(), arg0.method5231(), arg0.method5230(), arg0.method5230(), arg0.method5175());
	}
}

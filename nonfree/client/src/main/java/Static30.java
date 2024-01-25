import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!b", name = "g", descriptor = "I")
	public static int anInt575 = -1;

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method694(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(27) String local27 = Static629.method8792(arg0);
		if (local27 == null) {
			return;
		}
		for (@Pc(32) int local32 = 0; local32 < Static458.anInt7581; local32++) {
			@Pc(38) String local38 = Static461.aStringArray20[local32];
			if (local38.startsWith("*")) {
				local38 = local38.substring(1);
			}
			local38 = Static629.method8792(local38);
			if (local38 != null && local38.equals(local27)) {
				Static458.anInt7581--;
				for (@Pc(62) int local62 = local32; local62 < Static458.anInt7581; local62++) {
					Static461.aStringArray20[local62] = Static461.aStringArray20[local62 + 1];
					Static105.aStringArray5[local62] = Static105.aStringArray5[local62 + 1];
					Static212.anIntArray839[local62] = Static212.anIntArray839[local62 + 1];
					Static101.aStringArray4[local62] = Static101.aStringArray4[local62 + 1];
					Static561.anIntArray780[local62] = Static561.anIntArray780[local62 + 1];
					Static577.aBooleanArray57[local62] = Static577.aBooleanArray57[local62 + 1];
				}
				Static68.anInt1315 = Static629.anInt10041;
				@Pc(127) Class3_Sub34 local127 = Static172.method3123(Static163.aClass375_1, Static671.aClass218_158);
				local127.aClass3_Sub25_Sub1_2.method8614(Static440.method6269(arg0));
				local127.aClass3_Sub25_Sub1_2.method8583(arg0);
				Static441.method6275(local127);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(ILclient!oba;)V")
	public static void method699(@OriginalArg(1) Class3_Sub11_Sub14 arg0) {
		if (arg0 == null) {
			return;
		}
		Static78.aClass338_99.method8171(arg0);
		Static450.anInt7444++;
		@Pc(35) Class3_Sub11_Sub8 local35;
		if (arg0.aBoolean476 || "".equals(arg0.aString67)) {
			local35 = new Class3_Sub11_Sub8(arg0.aString67);
			Static71.anInt1334++;
		} else {
			@Pc(29) long local29 = arg0.aLong212;
			for (local35 = (Class3_Sub11_Sub8) Static369.aClass83_24.method2368(local29); local35 != null && !local35.aString31.equals(arg0.aString67); local35 = (Class3_Sub11_Sub8) Static369.aClass83_24.method2373()) {
			}
			if (local35 == null) {
				local35 = (Class3_Sub11_Sub8) Static555.aClass165_63.method4389(local29);
				if (local35 != null && !local35.aString31.equals(arg0.aString67)) {
					local35 = null;
				}
				if (local35 == null) {
					local35 = new Class3_Sub11_Sub8(arg0.aString67);
				}
				Static369.aClass83_24.method2377(local29, local35);
				Static71.anInt1334++;
			}
		}
		if (local35.method3477(arg0)) {
			Static156.method2841(local35);
		}
	}
}

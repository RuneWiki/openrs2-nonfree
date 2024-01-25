import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static577 {

	@OriginalMember(owner = "client!wf", name = "B", descriptor = "Lclient!pu;")
	public static Class270 aClass270_121;

	@OriginalMember(owner = "client!wf", name = "y", descriptor = "Lclient!mf;")
	public static final Class222 aClass222_64 = new Class222(3000000, 200);

	@OriginalMember(owner = "client!wf", name = "z", descriptor = "I")
	public static int anInt9508 = -1;

	@OriginalMember(owner = "client!wf", name = "A", descriptor = "Z")
	public static boolean aBoolean744 = false;

	@OriginalMember(owner = "client!wf", name = "C", descriptor = "[I")
	public static final int[] anIntArray721 = new int[4096];

	@OriginalMember(owner = "client!wf", name = "D", descriptor = "Z")
	public static boolean aBoolean745 = false;

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(BLclient!vh;Lclient!r;I)V")
	public static void method7747(@OriginalArg(1) Class342 arg0, @OriginalArg(2) Class134 arg1, @OriginalArg(3) int arg2) {
		@Pc(21) int local21;
		if (Static344.anIntArray468 != null && arg2 <= arg0.aByte121) {
			for (local21 = 0; local21 < Static344.anIntArray468.length; local21++) {
				if (Static344.anIntArray468[local21] != -1000000 && (arg0.anIntArray704[0] <= Static344.anIntArray468[local21] || Static344.anIntArray468[local21] >= arg0.anIntArray704[1] || arg0.anIntArray704[2] <= Static344.anIntArray468[local21] || Static344.anIntArray468[local21] >= arg0.anIntArray704[3]) && (Static536.anIntArray681[local21] >= arg0.anIntArray706[0] || arg0.anIntArray706[1] <= Static536.anIntArray681[local21] || Static536.anIntArray681[local21] >= arg0.anIntArray706[2] || Static536.anIntArray681[local21] >= arg0.anIntArray706[3]) && (arg0.anIntArray706[0] >= Static1.anIntArray4[local21] || Static1.anIntArray4[local21] <= arg0.anIntArray706[1] || arg0.anIntArray706[2] >= Static1.anIntArray4[local21] || arg0.anIntArray706[3] >= Static1.anIntArray4[local21]) && (Static522.anIntArray670[local21] >= arg0.anIntArray705[0] || Static522.anIntArray670[local21] >= arg0.anIntArray705[1] || Static522.anIntArray670[local21] >= arg0.anIntArray705[2] || arg0.anIntArray705[3] <= Static522.anIntArray670[local21]) && (Static403.anIntArray541[local21] <= arg0.anIntArray705[0] || arg0.anIntArray705[1] >= Static403.anIntArray541[local21] || Static403.anIntArray541[local21] <= arg0.anIntArray705[2] || arg0.anIntArray705[3] >= Static403.anIntArray541[local21])) {
					return;
				}
			}
		}
		@Pc(284) int local284;
		@Pc(308) int local308;
		@Pc(325) boolean local325;
		@Pc(353) float local353;
		if (arg0.aByte122 == 1) {
			local21 = arg0.aShort127 + Static240.anInt4447 - Static258.anInt4643;
			if (local21 >= 0 && local21 <= Static240.anInt4447 + Static240.anInt4447) {
				local284 = arg0.aShort129 + Static240.anInt4447 - Static312.anInt5339;
				if (local284 < 0) {
					local284 = 0;
				} else if (local284 > Static240.anInt4447 + Static240.anInt4447) {
					return;
				}
				local308 = Static240.anInt4447 + arg0.aShort128 - Static312.anInt5339;
				if (Static240.anInt4447 + Static240.anInt4447 < local308) {
					local308 = Static240.anInt4447 + Static240.anInt4447;
				} else if (local308 < 0) {
					return;
				}
				local325 = false;
				while (local284 <= local308) {
					if (Static44.aBooleanArrayArray1[local21][local284++]) {
						local325 = true;
						break;
					}
				}
				if (local325) {
					local353 = Static75.anInt9088 - arg0.anIntArray706[0];
					if (local353 < 0.0F) {
						local353 *= -1.0F;
					}
					if (!(float) Static518.anInt8776 > local353 && (Static485.method6559(0, arg0) && (Static485.method6559(1, arg0) && (Static485.method6559(2, arg0) && Static485.method6559(3, arg0))))) {
						Static312.aClass342Array3[Static117.anInt2295++] = arg0;
					}
				}
			}
		} else if (arg0.aByte122 == 2) {
			local21 = Static240.anInt4447 + arg0.aShort129 - Static312.anInt5339;
			if (local21 >= 0 && local21 <= Static240.anInt4447 + Static240.anInt4447) {
				local284 = arg0.aShort127 + Static240.anInt4447 - Static258.anInt4643;
				if (local284 < 0) {
					local284 = 0;
				} else if (Static240.anInt4447 + Static240.anInt4447 < local284) {
					return;
				}
				local308 = arg0.aShort126 + Static240.anInt4447 - Static258.anInt4643;
				if (local308 > Static240.anInt4447 + Static240.anInt4447) {
					local308 = Static240.anInt4447 + Static240.anInt4447;
				} else if (local308 < 0) {
					return;
				}
				local325 = false;
				while (local308 >= local284) {
					if (Static44.aBooleanArrayArray1[local284++][local21]) {
						local325 = true;
						break;
					}
				}
				if (local325) {
					local353 = Static108.anInt2137 - arg0.anIntArray705[0];
					if (local353 < 0.0F) {
						local353 *= -1.0F;
					}
					if (!(local353 < (float) Static518.anInt8776) && (Static485.method6559(0, arg0) && (Static485.method6559(1, arg0) && (Static485.method6559(2, arg0) && Static485.method6559(3, arg0))))) {
						Static312.aClass342Array3[Static117.anInt2295++] = arg0;
					}
				}
			}
		} else if (arg0.aByte122 == 16 || arg0.aByte122 == 8) {
			local21 = arg0.aShort127 + Static240.anInt4447 - Static258.anInt4643;
			if (local21 >= 0 && local21 <= Static240.anInt4447 + Static240.anInt4447) {
				local284 = Static240.anInt4447 + arg0.aShort129 - Static312.anInt5339;
				if (local284 >= 0 && Static240.anInt4447 + Static240.anInt4447 >= local284 && Static44.aBooleanArrayArray1[local21][local284]) {
					@Pc(612) float local612 = (float) (Static75.anInt9088 - arg0.anIntArray706[0]);
					if (local612 < 0.0F) {
						local612 *= -1.0F;
					}
					@Pc(629) float local629 = (float) (Static108.anInt2137 - arg0.anIntArray705[0]);
					if (local629 < 0.0F) {
						local629 *= -1.0F;
					}
					if ((!(local612 < (float) Static518.anInt8776) || !(local629 < (float) Static518.anInt8776)) && (Static485.method6559(0, arg0) && (Static485.method6559(1, arg0) && (Static485.method6559(2, arg0) && Static485.method6559(3, arg0))))) {
						Static312.aClass342Array3[Static117.anInt2295++] = arg0;
					}
				}
			}
		} else if (arg0.aByte122 == 4) {
			@Pc(696) float local696 = (float) (arg0.anIntArray704[0] - Static276.anInt4813);
			if (!(local696 <= (float) Static399.anInt7026)) {
				local284 = Static240.anInt4447 + arg0.aShort129 - Static312.anInt5339;
				if (local284 < 0) {
					local284 = 0;
				} else if (local284 > Static240.anInt4447 + Static240.anInt4447) {
					return;
				}
				local308 = Static240.anInt4447 + arg0.aShort128 - Static312.anInt5339;
				if (local308 > Static240.anInt4447 + Static240.anInt4447) {
					local308 = Static240.anInt4447 + Static240.anInt4447;
				} else if (local308 < 0) {
					return;
				}
				@Pc(759) int local759 = Static240.anInt4447 + arg0.aShort127 - Static258.anInt4643;
				if (local759 < 0) {
					local759 = 0;
				} else if (local759 > Static240.anInt4447 + Static240.anInt4447) {
					return;
				}
				@Pc(784) int local784 = arg0.aShort126 + Static240.anInt4447 - Static258.anInt4643;
				if (Static240.anInt4447 + Static240.anInt4447 < local784) {
					local784 = Static240.anInt4447 + Static240.anInt4447;
				} else if (local784 < 0) {
					return;
				}
				@Pc(804) boolean local804 = false;
				label283: for (@Pc(806) int local806 = local759; local806 <= local784; local806++) {
					for (@Pc(810) int local810 = local284; local810 <= local308; local810++) {
						if (Static44.aBooleanArrayArray1[local806][local810]) {
							local804 = true;
							break label283;
						}
					}
				}
				if (local804 && (Static485.method6559(0, arg0) && (Static485.method6559(1, arg0) && (Static485.method6559(2, arg0) && Static485.method6559(3, arg0))))) {
					Static312.aClass342Array3[Static117.anInt2295++] = arg0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(JJ)J")
	public static long method7748(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 & arg1;
	}
}

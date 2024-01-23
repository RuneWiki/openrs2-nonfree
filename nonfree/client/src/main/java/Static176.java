import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static176 {

	@OriginalMember(owner = "client!p", name = "o", descriptor = "Lclient!wl;")
	public static Class151 aClass151_1;

	@OriginalMember(owner = "client!p", name = "p", descriptor = "I")
	public static int anInt4046 = 0;

	@OriginalMember(owner = "client!p", name = "q", descriptor = "I")
	public static int anInt4047 = 3353893;

	@OriginalMember(owner = "client!p", name = "b", descriptor = "(I)Ljava/lang/String;")
	public static String method3014() {
		@Pc(31) String local31;
		if (Static183.anInt5174 == 1 && Static230.anInt5417 < 2) {
			local31 = Static197.aString146 + Static36.aString31 + Static199.aString296 + " ->";
		} else if (Static88.aBoolean138 && Static230.anInt5417 < 2) {
			local31 = Static106.aString183 + Static36.aString31 + Static120.aString194 + " ->";
		} else if (Static202.aBoolean219 && Static124.aBooleanArray7[81] && Static230.anInt5417 > 2) {
			local31 = Static174.method2990(Static230.anInt5417 - 2);
		} else {
			local31 = Static174.method2990(Static230.anInt5417 - 1);
		}
		if (Static230.anInt5417 > 2) {
			local31 = local31 + "<col=ffffff> / " + (Static230.anInt5417 - 2) + Static238.aString367;
		}
		return local31;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(IZII)I")
	public static int method3016(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub23 local8 = (Class1_Sub23) Static249.aClass140_17.method4014((long) arg0);
		if (local8 == null) {
			return 0;
		}
		@Pc(18) int local18 = 0;
		for (@Pc(20) int local20 = 0; local20 < local8.anIntArray342.length; local20++) {
			if (local8.anIntArray342[local20] >= 0 && local8.anIntArray342[local20] < Static94.anInt4255) {
				@Pc(40) Class89 local40 = Static93.method2006(local8.anIntArray342[local20]);
				if (local40.aClass140_11 != null) {
					@Pc(53) Class1_Sub24 local53 = (Class1_Sub24) local40.aClass140_11.method4014((long) arg2);
					if (local53 != null) {
						if (arg1) {
							local18 += local8.anIntArray343[local20] * local53.anInt4545;
						} else {
							local18 += local53.anInt4545;
						}
					}
				}
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!p", name = "c", descriptor = "(III)Lclient!gg;")
	public static Class47 method3017(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub16 local7 = Static142.aClass1_Sub16ArrayArrayArray4[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(13) int local13 = 0; local13 < local7.anInt2929; local13++) {
			@Pc(19) Class47 local19 = local7.aClass47Array1[local13];
			if ((local19.aLong73 >> 29 & 0x3L) == 2L && local19.anInt2146 == arg1 && local19.anInt2148 == arg2) {
				Static155.method2760(local19);
				return local19;
			}
		}
		return null;
	}
}

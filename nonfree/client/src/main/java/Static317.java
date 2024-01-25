import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static317 {

	@OriginalMember(owner = "client!pg", name = "Q", descriptor = "Lclient!oi;")
	public static Class185 aClass185_84;

	@OriginalMember(owner = "client!pg", name = "I", descriptor = "Lclient!kn;")
	public static final Class142 aClass142_81 = new Class142("M", "M", "M", "M");

	@OriginalMember(owner = "client!pg", name = "J", descriptor = "I")
	public static int anInt5241 = 1;

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "(B)Lclient!fp;")
	public static Class1_Sub15 method4193() {
		if (Static430.aClass14_23 == null || Static21.aClass228_1 == null) {
			return null;
		}
		Static21.aClass228_1.method4803(Static430.aClass14_23);
		@Pc(18) Class1_Sub15 local18 = (Class1_Sub15) Static21.aClass228_1.method4804();
		if (local18 == null) {
			return null;
		} else {
			@Pc(33) Class128 local33 = Static430.aClass36_4.method659(local18.anInt1847);
			return local33 != null && local33.aBoolean336 && local33.method2737(Static430.anInterface12_2) ? local18 : Static169.method4133();
		}
	}

	@OriginalMember(owner = "client!pg", name = "c", descriptor = "(B)V")
	public static void method4196() {
		@Pc(7) Class235 local7 = null;
		try {
			@Pc(13) Class253 local13 = Static259.aClass177_2.method3832(true, "2");
			while (local13.anInt6669 == 0) {
				Static331.method4343(1L);
			}
			if (local13.anInt6669 == 1) {
				local7 = (Class235) local13.anObject9;
				@Pc(40) Class1_Sub19 local40 = new Class1_Sub19(Static12.anInt199 * 6 + 3);
				local40.method2934(1);
				local40.method2930(Static12.anInt199);
				for (@Pc(52) int local52 = 0; local52 < Static136.anIntArray184.length; local52++) {
					if (Static173.aBooleanArray67[local52]) {
						local40.method2930(local52);
						local40.method2912(Static136.anIntArray184[local52]);
					}
				}
				local7.method4943(0, local40.anInt3698, local40.aByteArray38);
			}
		} catch (@Pc(83) Exception local83) {
		}
		try {
			if (local7 != null) {
				local7.method4942();
			}
		} catch (@Pc(90) Exception local90) {
		}
		Static46.aLong180 = Static183.method2674();
		Static57.aBoolean116 = false;
	}

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "(II)Lclient!rv;")
	public static Class227 method4197(@OriginalArg(1) int arg0) {
		@Pc(8) Class227[] local8 = Static40.method541();
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			@Pc(22) Class227 local22 = local8[local10];
			if (local22.anInt5962 == arg0) {
				return local22;
			}
		}
		return null;
	}
}

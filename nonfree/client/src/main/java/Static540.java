import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static540 {

	@OriginalMember(owner = "client!sba", name = "h", descriptor = "J")
	public static long aLong256;

	@OriginalMember(owner = "client!sba", name = "j", descriptor = "I")
	public static int anInt8898;

	@OriginalMember(owner = "client!sba", name = "e", descriptor = "Lclient!tm;")
	public static final Class338 aClass338_202 = new Class338();

	@OriginalMember(owner = "client!sba", name = "f", descriptor = "Z")
	public static boolean aBoolean695 = false;

	@OriginalMember(owner = "client!sba", name = "l", descriptor = "D")
	public static double aDouble28 = -1.0D;

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "()V")
	public static void method7761() {
		for (@Pc(1) int local1 = Static617.anInt9893; local1 < Static183.anInt3720; local1++) {
			for (@Pc(4) int local4 = 0; local4 < Static146.anInt2951; local4++) {
				for (@Pc(7) int local7 = 0; local7 < Static602.anInt9668; local7++) {
					@Pc(16) Class164 local16 = Static15.aClass164ArrayArrayArray5[local1][local4][local7];
					if (local16 != null) {
						@Pc(21) Class28_Sub1_Sub4 local21 = local16.aClass28_Sub1_Sub4_2;
						@Pc(24) Class28_Sub1_Sub4 local24 = local16.aClass28_Sub1_Sub4_1;
						if (local21 != null && local21.method9297()) {
							Static583.method8199(local21, local1, local4, local7, 1, 1);
							if (local24 != null && local24.method9297()) {
								Static583.method8199(local24, local1, local4, local7, 1, 1);
								local24.method9290(Static671.aClass13_21, local21, false, 0, 0, 0);
								local24.method9285();
							}
							local21.method9285();
						}
						for (@Pc(68) Class125 local68 = local16.aClass125_2; local68 != null; local68 = local68.aClass125_1) {
							@Pc(72) Class28_Sub1_Sub1 local72 = local68.aClass28_Sub1_Sub1_1;
							if (local72 != null && local72.method9297()) {
								Static583.method8199(local72, local1, local4, local7, local72.aShort124 + 1 - local72.aShort125, local72.aShort122 - local72.aShort123 + 1);
								local72.method9285();
							}
						}
						@Pc(108) Class28_Sub1_Sub3 local108 = local16.aClass28_Sub1_Sub3_1;
						if (local108 != null && local108.method9297()) {
							Static676.method9367(local108, local1, local4, local7);
							local108.method9285();
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "([BZI)Ljava/lang/Object;")
	public static Object method7762(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static668.aBoolean812) {
			try {
				@Pc(20) Class159 local20 = (Class159) Class.forName("Class159_Sub1").getDeclaredConstructor().newInstance();
				local20.method4163(arg0);
				return local20;
			} catch (@Pc(27) Throwable local27) {
				Static668.aBoolean812 = true;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "(II)V")
	public static void method7764(@OriginalArg(1) int arg0) {
		@Pc(9) Class3_Sub11_Sub4 local9 = Static583.method8201(3, (long) arg0);
		local9.method2194();
	}

	@OriginalMember(owner = "client!sba", name = "c", descriptor = "(I)V")
	public static void method7765() {
		for (@Pc(7) int local7 = 0; local7 < 100; local7++) {
			Static200.aBooleanArray21[local7] = true;
		}
	}
}

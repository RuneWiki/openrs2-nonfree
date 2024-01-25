import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static355 {

	@OriginalMember(owner = "client!ot", name = "P", descriptor = "Z")
	private static boolean aBoolean135;

	@OriginalMember(owner = "client!ot", name = "Q", descriptor = "I")
	private static int anInt1802;

	@OriginalMember(owner = "client!ot", name = "R", descriptor = "Z")
	private static boolean aBoolean136;

	@OriginalMember(owner = "client!ot", name = "S", descriptor = "Z")
	private static boolean aBoolean137;

	@OriginalMember(owner = "client!ot", name = "T", descriptor = "I")
	private static int anInt1803;

	@OriginalMember(owner = "client!ot", name = "U", descriptor = "I")
	private static int anInt1804;

	@OriginalMember(owner = "client!ot", name = "V", descriptor = "Z")
	private static boolean aBoolean138;

	@OriginalMember(owner = "client!ot", name = "W", descriptor = "Z")
	private static boolean aBoolean139;

	@OriginalMember(owner = "client!ot", name = "f", descriptor = "I")
	public static int anInt1773 = -1;

	@OriginalMember(owner = "client!ot", name = "q", descriptor = "Lclient!lu;")
	public static final Class186 aClass186_22 = new Class186(76, 2);

	@OriginalMember(owner = "client!ot", name = "M", descriptor = "[[I")
	public static final int[][] anIntArrayArray24 = new int[128][128];

	@OriginalMember(owner = "client!ot", name = "N", descriptor = "Z")
	public static final boolean aBoolean133 = false;

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(Lclient!kda;BZLjava/lang/String;)Lclient!lk;")
	public static Class179 method1723(@OriginalArg(0) Class160 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) String arg2) {
		@Pc(16) int local16 = arg0.method4199(arg2);
		if (local16 == -1) {
			return new Class179(0);
		}
		@Pc(29) int[] local29 = arg0.method4226(local16);
		@Pc(35) Class179 local35 = new Class179(local29.length);
		@Pc(37) int local37 = 0;
		@Pc(39) int local39 = 0;
		while (true) {
			while (local35.anInt5505 > local37) {
				@Pc(52) Class1_Sub13 local52 = new Class1_Sub13(arg0.method4198(local29[local39++], local16));
				@Pc(56) int local56 = local52.method3037();
				@Pc(60) int local60 = local52.method3056();
				@Pc(64) int local64 = local52.method3043();
				if (!arg1 && local64 == 1) {
					local35.anInt5505--;
				} else {
					local35.anIntArray392[local37] = local56;
					local35.anIntArray393[local37] = local60;
					local37++;
				}
			}
			return local35;
		}
	}

	@OriginalMember(owner = "client!ot", name = "providesignlink", descriptor = "(Lclient!lp;)V")
	private static void method1727(@OriginalArg(0) Class182 arg0) {
		Static91.aClass182_2 = arg0;
		Static125.aClass182_5 = arg0;
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(Lclient!gw;I)V")
	public static void method1737(@OriginalArg(0) Class1_Sub13 arg0) {
		@Pc(6) byte[] local6 = new byte[24];
		if (Static132.aClass279_8 != null) {
			@Pc(26) int local26;
			try {
				Static132.aClass279_8.method6839(0L);
				Static132.aClass279_8.method6848(local6);
				for (local26 = 0; local26 < 24 && local6[local26] == 0; local26++) {
				}
				if (local26 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(49) Exception local49) {
				for (local26 = 0; local26 < 24; local26++) {
					local6[local26] = -1;
				}
			}
		}
		arg0.method3041(local6, 24);
	}
}

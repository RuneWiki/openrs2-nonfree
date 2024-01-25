import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static201 {

	@OriginalMember(owner = "client!mi", name = "Y", descriptor = "I")
	public static int anInt4407;

	@OriginalMember(owner = "client!mi", name = "eb", descriptor = "[[B")
	public static byte[][] aByteArrayArray11;

	@OriginalMember(owner = "client!mi", name = "W", descriptor = "Lclient!pf;")
	public static final Class157 aClass157_131 = new Class157(1, -1);

	@OriginalMember(owner = "client!mi", name = "ab", descriptor = "I")
	public static int anInt4409 = 0;

	@OriginalMember(owner = "client!mi", name = "cb", descriptor = "I")
	public static int anInt4410 = 0;

	@OriginalMember(owner = "client!mi", name = "j", descriptor = "(I)Z")
	public static boolean method3810() {
		if (Static334.aBoolean580) {
			try {
				if ((Boolean) Static381.method5669(Static62.aClass179_2.anApplet1, "showingVideoAd")) {
					return false;
				}
				return true;
			} catch (@Pc(23) Throwable local23) {
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!mi", name = "k", descriptor = "(I)V")
	public static void method3811() {
		if (Static233.anIntArray394 != null) {
			return;
		}
		Static233.anIntArray394 = new int[65536];
		@Pc(20) double local20 = Math.random() * 0.03D + 0.7D - 0.015D;
		@Pc(22) int local22 = 0;
		for (@Pc(31) int local31 = 0; local31 < 512; local31++) {
			@Pc(45) float local45 = ((float) (local31 >> 3) / 64.0F + 0.0078125F) * 360.0F;
			@Pc(54) float local54 = (float) (local31 & 0x7) / 8.0F + 0.0625F;
			for (@Pc(56) int local56 = 0; local56 < 128; local56++) {
				@Pc(63) float local63 = (float) local56 / 128.0F;
				@Pc(65) float local65 = 0.0F;
				@Pc(67) float local67 = 0.0F;
				@Pc(69) float local69 = 0.0F;
				@Pc(73) float local73 = local45 / 60.0F;
				@Pc(76) int local76 = (int) local73;
				@Pc(80) int local80 = local76 % 6;
				@Pc(85) float local85 = local73 - (float) local76;
				@Pc(92) float local92 = local63 * (1.0F - local54);
				@Pc(100) float local100 = local63 * (1.0F - local54 * local85);
				@Pc(111) float local111 = (1.0F - (1.0F - local85) * local54) * local63;
				if (local80 == 0) {
					local65 = local63;
					local69 = local92;
					local67 = local111;
				} else if (local80 == 1) {
					local67 = local63;
					local65 = local100;
					local69 = local92;
				} else if (local80 == 2) {
					local69 = local111;
					local65 = local92;
					local67 = local63;
				} else if (local80 == 3) {
					local65 = local92;
					local69 = local63;
					local67 = local100;
				} else if (local80 == 4) {
					local67 = local92;
					local69 = local63;
					local65 = local111;
				} else if (local80 == 5) {
					local67 = local92;
					local65 = local63;
					local69 = local100;
				}
				local65 = (float) Math.pow((double) local65, local20);
				local67 = (float) Math.pow((double) local67, local20);
				local69 = (float) Math.pow((double) local69, local20);
				@Pc(210) int local210 = (int) (local65 * 256.0F);
				@Pc(215) int local215 = (int) (local67 * 256.0F);
				@Pc(220) int local220 = (int) (local69 * 256.0F);
				@Pc(232) int local232 = local220 + (local215 << 8) + (local210 << 16) - 16777216;
				Static233.anIntArray394[local22++] = local232;
			}
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(ILclient!iq;BI)Lclient!os;")
	public static Class2_Sub9_Sub17 method3812(@OriginalArg(0) int arg0, @OriginalArg(1) Class104 arg1, @OriginalArg(3) int arg2) {
		@Pc(19) Class2_Sub12 local19 = new Class2_Sub12(arg1.method2756(arg2, arg0));
		@Pc(50) Class2_Sub9_Sub17 local50 = new Class2_Sub9_Sub17(arg0, local19.method3113(), local19.method3113(), local19.method3135(), local19.method3135(), local19.method3124() == 1, local19.method3124(), local19.method3124());
		@Pc(54) int local54 = local19.method3124();
		for (@Pc(56) int local56 = 0; local56 < local54; local56++) {
			local50.aClass180_35.method4909(new Class2_Sub15(local19.method3124(), local19.method3104(), local19.method3104(), local19.method3104(), local19.method3104(), local19.method3104(), local19.method3104(), local19.method3104(), local19.method3104()));
		}
		local50.method4365();
		return local50;
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(BII)V")
	public static void method3813(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class2_Sub9_Sub4 local8 = Static98.method1971(7, arg1);
		local8.method1801();
		local8.anInt1723 = arg0;
	}
}

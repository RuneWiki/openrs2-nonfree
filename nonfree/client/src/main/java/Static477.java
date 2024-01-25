import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static477 {

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "Lclient!l;")
	public static Class4_Sub1_Sub2_Sub1_Sub2 aClass4_Sub1_Sub2_Sub1_Sub2_2;

	@OriginalMember(owner = "client!qv", name = "g", descriptor = "[I")
	public static final int[] anIntArray525 = new int[8];

	@OriginalMember(owner = "client!qv", name = "j", descriptor = "[Z")
	public static final boolean[] aBooleanArray21 = new boolean[100];

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(IZLclient!la;Ljava/lang/String;)Lclient!iga;")
	public static Class156 method7145(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class196 arg1, @OriginalArg(3) String arg2) {
		@Pc(18) int local18 = arg1.method5104(arg2);
		if (local18 == -1) {
			return new Class156(0);
		}
		@Pc(32) int[] local32 = arg1.method5123(local18);
		@Pc(38) Class156 local38 = new Class156(local32.length);
		@Pc(40) int local40 = 0;
		@Pc(42) int local42 = 0;
		while (true) {
			while (local38.anInt4465 > local40) {
				@Pc(56) Class3_Sub3 local56 = new Class3_Sub3(arg1.method5102(local18, local32[local42++]));
				@Pc(60) int local60 = local56.method4207();
				@Pc(64) int local64 = local56.method4221();
				@Pc(68) int local68 = local56.method4225();
				if (!arg0 && local68 == 1) {
					local38.anInt4465--;
				} else {
					local38.anIntArray237[local40] = local60;
					local38.anIntArray236[local40] = local64;
					local40++;
				}
			}
			return local38;
		}
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(B)V")
	public static void method7146() {
		Static383.aClass5_12.xa(((float) Static262.aClass3_Sub27_12.aClass21_Sub23_1.method7600() * 0.1F + 0.7F) * Static386.aFloat161);
		Static383.aClass5_12.ZA(Static527.anInt8993, Static448.aFloat183, Static427.aFloat180, (float) (Static427.anInt7692 << 2), (float) (Static87.anInt2112 << 2), (float) (Static46.anInt1329 << 2));
		Static383.aClass5_12.method7498(Static594.aClass205_4);
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(BZLjava/lang/String;ILjava/lang/String;)V")
	public static void method7148(@OriginalArg(1) boolean arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3) {
		Static441.method6863(arg0, -1, arg3, arg1, arg2, true);
	}
}

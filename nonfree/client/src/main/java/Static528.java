import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static528 {

	@OriginalMember(owner = "client!taa", name = "j", descriptor = "[I")
	public static int[] anIntArray500;

	@OriginalMember(owner = "client!taa", name = "h", descriptor = "Lclient!qg;")
	public static final Class286 aClass286_10 = new Class286();

	@OriginalMember(owner = "client!taa", name = "i", descriptor = "Lclient!cb;")
	public static final Class46 aClass46_98 = new Class46(53, 2);

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(I)V")
	public static void method7829() {
		if (Static214.anIntArray205 != null && Static556.anIntArray515 != null) {
			return;
		}
		Static214.anIntArray205 = new int[256];
		Static556.anIntArray515 = new int[256];
		for (@Pc(21) int local21 = 0; local21 < 256; local21++) {
			@Pc(30) double local30 = (double) local21 / 255.0D * 6.283185307179586D;
			Static214.anIntArray205[local21] = (int) (Math.sin(local30) * 4096.0D);
			Static556.anIntArray515[local21] = (int) (Math.cos(local30) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(II)Lclient!aia;")
	public static Class15 method7830(@OriginalArg(0) int arg0) {
		@Pc(8) Class15[] local8 = Static360.method5378();
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			@Pc(16) Class15 local16 = local8[local10];
			if (local16.anInt252 == arg0) {
				return local16;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(ZLjava/lang/String;BILjava/lang/String;)V")
	public static void method7832(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3) {
		@Pc(6) Class5_Sub48 local6 = Static65.method1093();
		local6.aClass5_Sub22_Sub1_2.method5905(Static374.aClass293_9.anInt7773);
		local6.aClass5_Sub22_Sub1_2.method5918(0);
		@Pc(21) int local21 = local6.aClass5_Sub22_Sub1_2.anInt6629;
		local6.aClass5_Sub22_Sub1_2.method5918(635);
		@Pc(30) int[] local30 = Static263.method4273(local6);
		@Pc(39) int local39 = local6.aClass5_Sub22_Sub1_2.anInt6629;
		local6.aClass5_Sub22_Sub1_2.method5910(arg1);
		local6.aClass5_Sub22_Sub1_2.method5918(Static451.anInt7697);
		local6.aClass5_Sub22_Sub1_2.method5910(arg3);
		local6.aClass5_Sub22_Sub1_2.method5943(Static635.aLong275);
		local6.aClass5_Sub22_Sub1_2.method5905(Static266.anInt4796);
		local6.aClass5_Sub22_Sub1_2.method5905(Static156.aClass63_2.anInt1655);
		Static322.method4879(local6.aClass5_Sub22_Sub1_2);
		@Pc(80) String local80 = Static224.aString44;
		local6.aClass5_Sub22_Sub1_2.method5905(local80 == null ? 0 : 1);
		if (local80 != null) {
			local6.aClass5_Sub22_Sub1_2.method5910(local80);
		}
		local6.aClass5_Sub22_Sub1_2.method5905(arg2);
		local6.aClass5_Sub22_Sub1_2.method5905(arg0 ? 1 : 0);
		local6.aClass5_Sub22_Sub1_2.anInt6629 += 7;
		local6.aClass5_Sub22_Sub1_2.method5919(local6.aClass5_Sub22_Sub1_2.anInt6629, local39, local30);
		local6.aClass5_Sub22_Sub1_2.method5952(local6.aClass5_Sub22_Sub1_2.anInt6629 - local21);
		Static277.method4436(local6);
		Static199.anInt3910 = 1;
		Static275.anInt4921 = 0;
		Static581.anInt9774 = -3;
		Static36.anInt573 = 0;
		if (arg2 < 13) {
			Static639.aBoolean760 = true;
			Static506.method7587();
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static437 {

	@OriginalMember(owner = "client!vs", name = "e", descriptor = "Lclient!bu;")
	public static Class32 aClass32_87;

	@OriginalMember(owner = "client!vs", name = "h", descriptor = "Lclient!f;")
	public static Class8 aClass8_27;

	@OriginalMember(owner = "client!vs", name = "l", descriptor = "I")
	public static int anInt7370;

	@OriginalMember(owner = "client!vs", name = "p", descriptor = "I")
	public static int anInt7373;

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "I")
	public static int anInt7361 = -1;

	@OriginalMember(owner = "client!vs", name = "b", descriptor = "I")
	public static int anInt7362 = -1;

	@OriginalMember(owner = "client!vs", name = "m", descriptor = "Z")
	public static boolean aBoolean634 = true;

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(IIIII)V")
	public static void method5728(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class3_Sub4_Sub12 local8 = Static393.method5080(arg1, 4);
		local8.method3248();
		local8.anInt4060 = arg3;
		local8.anInt4063 = arg2;
		local8.anInt4062 = arg0;
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(ILclient!mq;I)Ljava/lang/String;")
	public static String method5729(@OriginalArg(0) int arg0, @OriginalArg(1) Class156 arg1) {
		if (!Static53.method1118(arg1).method5982(arg0) && arg1.anObjectArray31 == null) {
			return null;
		} else if (arg1.aStringArray34 == null || arg1.aStringArray34.length <= arg0 || arg1.aStringArray34[arg0] == null || arg1.aStringArray34[arg0].trim().length() == 0) {
			return Static63.aBoolean138 ? "Hidden-" + arg0 : null;
		} else {
			return arg1.aStringArray34[arg0];
		}
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(Z)V")
	public static void method5730() {
		@Pc(7) int local7 = Static160.anInt3271;
		@Pc(14) int[] local14 = Static162.anIntArray212;
		for (@Pc(16) int local16 = 0; local16 < local7; local16++) {
			@Pc(24) Class7_Sub2_Sub3_Sub2 local24 = Static361.aClass7_Sub2_Sub3_Sub2Array1[local14[local16]];
			if (local24 != null) {
				Static89.method1675(local24.method3499(), local24);
			}
		}
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(III)V")
	public static void method5732(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class3_Sub4_Sub12 local8 = Static393.method5080(arg0, 13);
		local8.method3248();
		local8.anInt4063 = arg1;
	}

	@OriginalMember(owner = "client!vs", name = "b", descriptor = "(I)V")
	public static void method5734() {
		if (Static97.anIntArray132 != null && Static346.anIntArray387 != null) {
			return;
		}
		Static97.anIntArray132 = new int[256];
		Static346.anIntArray387 = new int[256];
		for (@Pc(25) int local25 = 0; local25 < 256; local25++) {
			@Pc(34) double local34 = (double) local25 / 255.0D * 6.283185307179586D;
			Static97.anIntArray132[local25] = (int) (Math.sin(local34) * 4096.0D);
			Static346.anIntArray387[local25] = (int) (Math.cos(local34) * 4096.0D);
		}
	}
}

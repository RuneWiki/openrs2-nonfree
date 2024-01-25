import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static195 {

	@OriginalMember(owner = "client!hm", name = "C", descriptor = "S")
	public static short aShort112 = 32767;

	@OriginalMember(owner = "client!hm", name = "F", descriptor = "[I")
	public static final int[] anIntArray521 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(IZLclient!vo;ZIII)V")
	public static void method6870(@OriginalArg(2) Class348 arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2) {
		Static480.anInt10343 = 2;
		Static563.anInt10263 = 0;
		Static221.aClass348_16 = arg0;
		Static132.aClass4_Sub21_Sub4_1 = null;
		Static575.anInt10386 = arg2;
		Static491.anInt9287 = 1;
		Static139.aBoolean230 = false;
		Static419.anInt7992 = arg1;
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(ZII)Z")
	public static boolean method6871(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x34) != 0;
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method6874(@OriginalArg(1) String arg0) {
		@Pc(14) String local14 = Static184.method3033(Static587.method8191(arg0));
		if (local14 == null) {
			local14 = "";
		}
		return local14;
	}

	@OriginalMember(owner = "client!hm", name = "f", descriptor = "(I)V")
	public static void method6876() {
		Static256.aClass185Array1 = new Class185[50];
		Static399.anInt7806 = 0;
	}
}

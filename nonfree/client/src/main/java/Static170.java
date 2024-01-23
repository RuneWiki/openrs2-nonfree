import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static170 {

	@OriginalMember(owner = "client!rg", name = "T", descriptor = "I")
	public static int anInt3695 = 0;

	@OriginalMember(owner = "client!rg", name = "V", descriptor = "[Lclient!qe;")
	public static Class79[] aClass79Array1 = new Class79[50];

	@OriginalMember(owner = "client!rg", name = "Z", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1269 = Static200.method3116("Gegenstand f-Ur Mitglieder");

	@OriginalMember(owner = "client!rg", name = "ab", descriptor = "[S")
	public static short[] aShortArray49 = new short[256];

	@OriginalMember(owner = "client!rg", name = "bb", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1270 = Static200.method3116("Bitte warten Sie)3)3)3");

	@OriginalMember(owner = "client!rg", name = "cb", descriptor = "Z")
	public static boolean aBoolean204 = false;

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIB)Z")
	public static boolean method2783(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 11) {
			arg1 = 10;
		}
		@Pc(13) Class1_Sub1_Sub23 local13 = Static44.method760(arg0);
		if (arg1 >= 5 && arg1 <= 8) {
			arg1 = 4;
		}
		return local13.method2946(arg1);
	}
}

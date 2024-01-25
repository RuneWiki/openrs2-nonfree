import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static412 {

	@OriginalMember(owner = "client!qda", name = "t", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray45 = new String[] { "en", "de", "fr", "pt", "nl" };

	@OriginalMember(owner = "client!qda", name = "bb", descriptor = "Lclient!kfa;")
	public static final Class181 aClass181_86 = new Class181(70, -1);

	@OriginalMember(owner = "client!qda", name = "cb", descriptor = "I")
	public static int anInt7714 = -1;

	@OriginalMember(owner = "client!qda", name = "eb", descriptor = "[I")
	public static final int[] anIntArray553 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

	@OriginalMember(owner = "client!qda", name = "fb", descriptor = "F")
	public static float aFloat175 = 0.0F;

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(I)I")
	public static int method6427() {
		@Pc(14) int local14 = Static357.aClass174_32.method4525();
		if (Static381.aClass174Array1.length - 1 > local14) {
			Static357.aClass174_32 = Static381.aClass174Array1[local14 + 1];
		}
		return 100;
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(III)V")
	public static void method6434(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class6_Sub4_Sub6 local8 = Static68.method1408(12, arg1);
		local8.method3826();
		local8.anInt4403 = arg0;
	}
}

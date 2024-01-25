import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static54 {

	@OriginalMember(owner = "client!dd", name = "L", descriptor = "Lclient!rk;")
	public static Class180 aClass180_17;

	@OriginalMember(owner = "client!dd", name = "R", descriptor = "[I")
	public static int[] anIntArray214;

	@OriginalMember(owner = "client!dd", name = "E", descriptor = "Ljava/lang/String;")
	public static String aString104 = "Checking for updates - ";

	@OriginalMember(owner = "client!dd", name = "H", descriptor = "Lclient!ap;")
	public static final Class7_Sub3 aClass7_Sub3_2 = new Class7_Sub3(new byte[5000]);

	@OriginalMember(owner = "client!dd", name = "N", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray11 = null;

	@OriginalMember(owner = "client!dd", name = "Q", descriptor = "I")
	public static int anInt1421 = 0;

	@OriginalMember(owner = "client!dd", name = "S", descriptor = "[I")
	public static final int[] anIntArray215 = new int[14];

	@OriginalMember(owner = "client!dd", name = "T", descriptor = "Lclient!ik;")
	public static final Class103 aClass103_14 = new Class103(4);

	@OriginalMember(owner = "client!dd", name = "U", descriptor = "I")
	public static int anInt1422 = 0;

	@OriginalMember(owner = "client!dd", name = "V", descriptor = "I")
	public static int anInt1423 = 0;

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(BII)V")
	public static void method1139(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class10 local8 = new Class10(16);
		for (@Pc(21) Class7_Sub35 local21 = (Class7_Sub35) Static185.aClass10_33.method157(); local21 != null; local21 = (Class7_Sub35) Static185.aClass10_33.method155()) {
			local21.method5648();
			@Pc(31) int local31 = (int) (local21.aLong232 >> 28);
			@Pc(42) int local42 = (int) (local21.aLong232 >> 14 & 0x3FFFL) - arg1;
			@Pc(51) int local51 = (int) (local21.aLong232 & 0x3FFFL) - arg0;
			if (local51 >= 0 && local42 >= 0 && local51 < Static15.anInt287 && local42 < Static325.anInt6173) {
				local8.method161((long) (local42 << 14 | local31 << 28 | local51), local21);
			}
		}
		Static185.aClass10_33 = local8;
	}
}

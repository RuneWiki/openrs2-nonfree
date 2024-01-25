import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static164 {

	@OriginalMember(owner = "client!i", name = "k", descriptor = "[Lclient!na;")
	public static Class163[] aClass163Array1;

	@OriginalMember(owner = "client!i", name = "o", descriptor = "I")
	public static int anInt2704;

	@OriginalMember(owner = "client!i", name = "g", descriptor = "I")
	public static final int anInt2700 = 1407;

	@OriginalMember(owner = "client!i", name = "h", descriptor = "[S")
	public static final short[] aShortArray41 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!i", name = "j", descriptor = "Lclient!ri;")
	public static final Class214 aClass214_104 = new Class214(59, -1);

	@OriginalMember(owner = "client!i", name = "p", descriptor = "Lclient!ri;")
	public static final Class214 aClass214_105 = new Class214(21, 3);

	@OriginalMember(owner = "client!i", name = "q", descriptor = "Z")
	public static boolean aBoolean215 = false;

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Z)Z")
	public static boolean method2242() {
		return Static401.aBoolean287;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!dh;B)Lclient!ul;")
	public static Class63_Sub4 method2245(@OriginalArg(0) Class1_Sub11 arg0) {
		return new Class63_Sub4(arg0.method4482(), arg0.method4482(), arg0.method4482(), arg0.method4482(), arg0.method4482(), arg0.method4482(), arg0.method4482(), arg0.method4482(), arg0.method4493(), arg0.method4463());
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IIB)V")
	public static void method2246(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class1_Sub3_Sub13 local8 = Static397.method4998(13, arg1);
		local8.method3459();
		local8.anInt4301 = arg0;
	}
}

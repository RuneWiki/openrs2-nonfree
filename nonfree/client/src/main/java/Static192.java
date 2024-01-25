import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static192 {

	@OriginalMember(owner = "client!hw", name = "b", descriptor = "Lclient!gba;")
	public static final Class1_Sub13_Sub2 aClass1_Sub13_Sub2_1 = new Class1_Sub13_Sub2(5000);

	@OriginalMember(owner = "client!hw", name = "e", descriptor = "Z")
	public static boolean aBoolean246 = false;

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(B)V")
	public static void method3614() {
		@Pc(1) Class316 local1 = Static505.aClass316_61;
		synchronized (Static505.aClass316_61) {
			Static505.aClass316_61.method7794();
		}
		local1 = Static140.aClass316_16;
		synchronized (Static140.aClass316_16) {
			Static140.aClass316_16.method7794();
		}
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(IIZ)Z")
	public static boolean method3615(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x10) != 0;
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(II)V")
	public static void method3616(@OriginalArg(1) int arg0) {
		Static104.method2285();
		@Pc(11) int local11 = Static133.aClass173_1.method4409(arg0).anInt3124;
		if (local11 == 0) {
			return;
		}
		@Pc(19) int local19 = Static343.aClass286_1.anIntArray642[arg0];
		if (local11 == 6) {
			Static146.anInt3337 = local19;
		}
		if (local11 == 5) {
			Static235.anInt4604 = local19;
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static129 {

	@OriginalMember(owner = "client!ge", name = "g", descriptor = "I")
	public static int anInt2585;

	@OriginalMember(owner = "client!ge", name = "n", descriptor = "Lclient!br;")
	public static Class27 aClass27_3;

	@OriginalMember(owner = "client!ge", name = "e", descriptor = "Lclient!pg;")
	public static final Class186 aClass186_77 = new Class186(33, 15);

	@OriginalMember(owner = "client!ge", name = "f", descriptor = "I")
	public static int anInt2584 = -1;

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lclient!tl;I)V")
	public static void method1921(@OriginalArg(0) Class4_Sub30 arg0) {
		for (@Pc(3) int local3 = 0; local3 < Static218.anInt3837; local3++) {
			@Pc(14) int local14 = arg0.method4844();
			@Pc(18) int local18 = arg0.method4877();
			if (local18 == 65535) {
				local18 = -1;
			}
			if (Static230.aClass84_Sub1Array2[local14] != null) {
				Static230.aClass84_Sub1Array2[local14].anInt6828 = local18;
			}
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Ljava/lang/String;II)V")
	public static void method1922(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class4_Sub1_Sub8 local12 = Static416.method5456(arg1, 3);
		local12.method2762();
		local12.aString44 = arg0;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILclient!of;Z)V")
	public static void method1923(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub30_Sub1 arg1) {
		Static182.anInt3388 = 0;
		Static120.aBoolean190 = false;
		Static367.method5068(arg1);
		Static84.method1448(arg1);
		if (Static120.aBoolean190) {
			System.out.println("---endgpp---");
		}
		if (arg0 != arg1.anInt6244) {
			throw new RuntimeException("gpi1 pos:" + arg1.anInt6244 + " psize:" + arg0);
		}
	}

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "(II)V")
	public static void method1924() {
		Static231.anInt4228 = -1;
		Static324.aClass166_264 = null;
		Static164.aBoolean219 = false;
		Static449.anInt7510 = -1;
		Static325.anInt5778 = 0;
		Static142.anInt2689 = 1;
		Static386.anInt6719 = 2;
	}
}

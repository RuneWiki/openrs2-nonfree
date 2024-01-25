import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static358 {

	@OriginalMember(owner = "client!nm", name = "l", descriptor = "Lclient!qfa;")
	public static final Class272 aClass272_270 = new Class272(33, -2);

	@OriginalMember(owner = "client!nm", name = "m", descriptor = "Lclient!sb;")
	public static final Class298 aClass298_178 = new Class298(54, 7);

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(Lclient!us;B)V")
	public static void method7744(@OriginalArg(0) Class43_Sub3 arg0) {
		@Pc(12) byte[] local12;
		if (Static119.anObject13 == null) {
			@Pc(5) Class39_Sub2_Sub1 local5 = new Class39_Sub2_Sub1();
			local12 = local5.method4536();
			Static119.anObject13 = Static223.method3868(local12);
		}
		if (Static534.anObject56 == null) {
			@Pc(31) Class39_Sub1_Sub1 local31 = new Class39_Sub1_Sub1();
			local12 = local31.method1109();
			Static534.anObject56 = Static223.method3868(local12);
		}
		@Pc(46) Class367 local46 = arg0.aClass367_1;
		if (local46.method7808() && Static552.anObject57 == null) {
			local12 = Static341.method5185(new Class214_Sub1(419684), 4.0F, 16.0F, 0.6F, 4.0F, 0.5F);
			Static552.anObject57 = Static223.method3868(local12);
		}
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(IZ)V")
	public static void method7745(@OriginalArg(0) int arg0) {
		@Pc(14) Class3_Sub3_Sub7 local14 = Static363.method5457(arg0, 2);
		local14.method845();
	}

	@OriginalMember(owner = "client!nm", name = "e", descriptor = "(I)I")
	public static int method7749(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = -1;
		for (@Pc(3) int local3 = 0; local3 < Static77.anInt1994 - 1; local3++) {
			if (arg0 < Static228.anIntArray130[local3] + Static188.anIntArray309[local3]) {
				local1 = local3;
				break;
			}
		}
		if (local1 == -1) {
			local1 = Static77.anInt1994 - 1;
		}
		return local1;
	}
}

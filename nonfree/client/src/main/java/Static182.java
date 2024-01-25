import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static182 {

	@OriginalMember(owner = "client!lf", name = "g", descriptor = "I")
	public static int anInt3602;

	@OriginalMember(owner = "client!lf", name = "i", descriptor = "I")
	public static int anInt3603;

	@OriginalMember(owner = "client!lf", name = "j", descriptor = "Lclient!tq;")
	public static Class191 aClass191_114;

	@OriginalMember(owner = "client!lf", name = "e", descriptor = "Lclient!iq;")
	public static final Class93 aClass93_71 = new Class93("Members object", "Gegenstand für Mitglieder", "Objet d'abonnés", "Objeto para membros");

	@OriginalMember(owner = "client!lf", name = "h", descriptor = "Lclient!le;")
	public static final Class117 aClass117_1 = Static34.method802();

	@OriginalMember(owner = "client!lf", name = "k", descriptor = "I")
	public static int anInt3604 = 0;

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(ZILjava/lang/String;)V")
	public static void method3298(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		@Pc(8) Class2_Sub11_Sub19 local8 = Static306.method5411(2, arg0);
		local8.method5537();
		local8.aString59 = arg1;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(I)Z")
	public static boolean method3299() {
		@Pc(8) Class2_Sub13 local8 = (Class2_Sub13) Static91.aClass216_22.aClass2_251.aClass2_249;
		if (local8 == null || Static91.aClass216_22.aClass2_251 == local8) {
			return false;
		} else {
			if (local8.anInt1317 >= 2000) {
				local8.anInt1317 -= 2000;
			}
			return local8.anInt1317 == 1006;
		}
	}

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(I)V")
	public static void method3300() {
		@Pc(8) int[] local8 = new int[Static183.anInt3615];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < Static183.anInt3615; local12++) {
			@Pc(18) Class208 local18 = Static282.method5080(local12);
			if (local18.anInt6748 >= 0 || local18.anInt6789 >= 0) {
				local8[local10++] = local12;
			}
		}
		Static310.anIntArray460 = new int[local10];
		for (@Pc(38) int local38 = 0; local38 < local10; local38++) {
			Static310.anIntArray460[local38] = local8[local38];
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IZ)[B")
	public static synchronized byte[] method3301(@OriginalArg(0) int arg0) {
		@Pc(21) byte[] local21;
		if (arg0 == 100 && Static168.anInt3422 > 0) {
			local21 = Static2.aByteArrayArray1[--Static168.anInt3422];
			Static2.aByteArrayArray1[Static168.anInt3422] = null;
			return local21;
		} else if (arg0 == 5000 && Static162.anInt3271 > 0) {
			local21 = Static236.aByteArrayArray14[--Static162.anInt3271];
			Static236.aByteArrayArray14[Static162.anInt3271] = null;
			return local21;
		} else if (arg0 == 30000 && Static34.anInt601 > 0) {
			local21 = Static201.aByteArrayArray13[--Static34.anInt601];
			Static201.aByteArrayArray13[Static34.anInt601] = null;
			return local21;
		} else {
			return new byte[arg0];
		}
	}

	@OriginalMember(owner = "client!lf", name = "d", descriptor = "(I)V")
	public static void method3303() {
		Static209.aClass119_147.method3312();
	}
}

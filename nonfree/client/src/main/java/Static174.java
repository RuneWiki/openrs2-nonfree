import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static174 {

	@OriginalMember(owner = "client!vf", name = "r", descriptor = "[I")
	public static int[] anIntArray388;

	@OriginalMember(owner = "client!vf", name = "y", descriptor = "I")
	public static int anInt4037;

	@OriginalMember(owner = "client!vf", name = "p", descriptor = "Lclient!ai;")
	public static Class6 aClass6_1202 = Static38.method685("<br>(X");

	@OriginalMember(owner = "client!vf", name = "t", descriptor = "Lclient!ai;")
	public static Class6 aClass6_1203 = Static38.method685("Ein kostenloses Spielkonto erstellen)3");

	@OriginalMember(owner = "client!vf", name = "w", descriptor = "I")
	public static int anInt4035 = 0;

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(BLclient!c;Lclient!c;)V")
	public static void method2724(@OriginalArg(1) Class10 arg0, @OriginalArg(2) Class10 arg1) {
		Static74.aClass10_66 = arg0;
		Static49.aClass10_52 = arg1;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(B)V")
	public static void method2726() {
		for (@Pc(15) Class2_Sub16 local15 = (Class2_Sub16) Static148.aClass16_10.method478(); local15 != null; local15 = (Class2_Sub16) Static148.aClass16_10.method481()) {
			@Pc(20) int local20 = local15.anInt2551;
			if (Static36.method641(local20)) {
				@Pc(28) Class87[] local28 = Static180.aClass87ArrayArray1[local20];
				@Pc(30) boolean local30 = true;
				for (@Pc(32) int local32 = 0; local32 < local28.length; local32++) {
					if (local28[local32] != null) {
						local30 = local28[local32].aBoolean174;
						break;
					}
				}
				if (!local30) {
					@Pc(60) int local60 = (int) local15.aLong241;
					@Pc(64) Class87 local64 = Static57.method940(local60);
					if (local64 != null) {
						Static151.method2327(local64);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vf", name = "c", descriptor = "(I)V")
	public static void method2727() {
		aClass6_1202 = null;
		anIntArray388 = null;
		aClass6_1203 = null;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static422 {

	@OriginalMember(owner = "client!rp", name = "b", descriptor = "I")
	public static int anInt7835 = -1;

	@OriginalMember(owner = "client!rp", name = "d", descriptor = "Lclient!pn;")
	public static final Class224 aClass224_5 = new Class224();

	@OriginalMember(owner = "client!rp", name = "h", descriptor = "[I")
	public static final int[] anIntArray600 = new int[1];

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(Lclient!dda;Lclient!dda;ILclient!cc;Lclient!dda;)Z")
	public static boolean method6559(@OriginalArg(0) Class53 arg0, @OriginalArg(1) Class53 arg1, @OriginalArg(3) Class2_Sub12_Sub1 arg2, @OriginalArg(4) Class53 arg3) {
		Static220.aClass53_72 = arg3;
		Static519.aClass2_Sub12_Sub1_3 = arg2;
		Static75.aClass53_22 = arg0;
		Static205.aClass53_68 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(Lclient!hca;BBII)V")
	public static void method6561(@OriginalArg(0) Class1_Sub1_Sub2_Sub1 arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		@Pc(10) int local10 = arg0.anIntArray450[0];
		@Pc(15) int local15 = arg0.anIntArray449[0];
		if (local10 < 0 || Static363.anInt1158 <= local10 || local15 < 0 || local15 >= Static511.anInt8889 || (arg2 < 0 || arg2 >= Static363.anInt1158 || arg1 < 0 || arg1 >= Static511.anInt8889)) {
			return;
		}
		@Pc(77) int local77 = Static343.method5390(0, 0, Static172.anIntArray506, local10, arg0.method4394(), arg1, Static165.anIntArray349, -4, 0, local15, 0, arg2, Static207.aClass99Array1[arg0.aByte90], true);
		if (local77 >= 1 && local77 <= 3) {
			for (@Pc(91) int local91 = 0; local91 < local77 - 1; local91++) {
				arg0.method2951(Static172.anIntArray506[local91], (byte) 2, Static165.anIntArray349[local91]);
			}
		}
	}
}

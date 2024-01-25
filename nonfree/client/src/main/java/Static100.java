import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static100 {

	@OriginalMember(owner = "client!fb", name = "d", descriptor = "[Lclient!l;")
	public static Class17[] aClass17Array4;

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger2 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@OriginalMember(owner = "client!fb", name = "e", descriptor = "Lclient!qp;")
	public static final Class209 aClass209_55 = new Class209(" more options", " weitere Optionen", " autres options", " mais opções");

	@OriginalMember(owner = "client!fb", name = "f", descriptor = "Z")
	public static boolean aBoolean169 = false;

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IBIZIII)V")
	public static void method1881(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static385.anInt6452 = arg5;
		Static324.anInt5625 = arg3;
		Static262.anInt6676 = arg4;
		Static84.anInt2090 = arg0;
		Static233.anInt4506 = arg1;
		if (arg2 && Static324.anInt5625 >= 100) {
			Static23.anInt567 = Static262.anInt6676 * 128 + 64;
			Static364.anInt6270 = Static233.anInt4506 * 128 + 64;
			Static355.anInt6031 = Static85.method1695(Static383.anInt6436, Static23.anInt567, Static364.anInt6270) - Static385.anInt6452;
		}
		Static159.anInt3195 = 2;
	}

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "(B)V")
	public static void method1882() {
		Static85.anInt2110 = -1;
		Static393.anInt6568 = 0;
		Static220.anInt4265 = -1;
		Static66.anInt134 = -1;
	}
}

import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static552 {

	@OriginalMember(owner = "client!sn", name = "e", descriptor = "I")
	public static int anInt8938;

	@OriginalMember(owner = "client!sn", name = "g", descriptor = "[I")
	public static int[] anIntArray582;

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger6 = new BigInteger("10001", 16);

	@OriginalMember(owner = "client!sn", name = "f", descriptor = "I")
	public static int anInt8939 = -1;

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(Z)V")
	public static void method7576() {
		if (Static605.aClass16_14 != null) {
			Static605.aClass16_14.method8199();
			Static605.aClass16_14 = null;
			Static103.aClass69_1 = null;
		}
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(ZLclient!pt;)Lclient!pt;")
	public static Class3_Sub9_Sub5 method7577(@OriginalArg(1) Class3_Sub9_Sub5 arg0) {
		@Pc(19) Class3_Sub9_Sub5 local19 = arg0 == null ? new Class3_Sub9_Sub5() : new Class3_Sub9_Sub5(arg0);
		local19.method6720();
		return local19;
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(IIIII)Z")
	public static boolean method7579(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (!Static44.aBoolean107 || !Static262.aBoolean400) {
			return false;
		} else if (Static594.anInt9366 < 100) {
			return false;
		} else if (Static213.method3374(arg1, arg2, arg3)) {
			@Pc(31) int local31 = arg2 << Static436.anInt7634;
			@Pc(35) int local35 = arg3 << Static436.anInt7634;
			if (Static57.method6339(Static10.anInt118, arg0, Static10.anInt118, local35, local31, Static343.aClass104Array2[arg1].method8279(arg3, arg2))) {
				Static236.anInt4477++;
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
}

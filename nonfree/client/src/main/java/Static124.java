import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static124 {

	@OriginalMember(owner = "client!fa", name = "c", descriptor = "Lclient!qda;")
	public static final Class243 aClass243_13 = new Class243();

	@OriginalMember(owner = "client!fa", name = "d", descriptor = "[I")
	public static final int[] anIntArray751 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

	@OriginalMember(owner = "client!fa", name = "e", descriptor = "Lclient!qda;")
	public static final Class243 aClass243_14 = new Class243();

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lclient!kea;Lclient!kea;Lclient!oa;B)V")
	public static void method7287(@OriginalArg(0) Class161 arg0, @OriginalArg(1) Class161 arg1, @OriginalArg(2) Class5 arg2) {
		Static23.aClass53_15 = Static377.method5901(arg1, Static368.anInt6881);
		Static364.aClass59_3 = arg2.method7414(Static23.aClass53_15, Static551.method526(arg0, Static368.anInt6881));
		Static54.aClass53_7 = Static377.method5901(arg1, Static200.anInt9269);
		Static164.aClass59_1 = arg2.method7414(Static54.aClass53_7, Static551.method526(arg0, Static200.anInt9269));
		Static25.aClass53_6 = Static377.method5901(arg1, Static335.anInt3041);
		Static294.aClass59_2 = arg2.method7414(Static25.aClass53_6, Static551.method526(arg0, Static335.anInt3041));
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(Z)V")
	public static void method7288(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			Static279.aClass290ArrayArrayArray7 = Static23.aClass290ArrayArrayArray9;
			Static511.aClass52Array3 = Static238.aClass52Array2;
		} else {
			Static279.aClass290ArrayArrayArray7 = Static40.aClass290ArrayArrayArray4;
			Static511.aClass52Array3 = Static163.aClass52Array4;
		}
		Static399.anInt7385 = Static279.aClass290ArrayArrayArray7.length;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(ILjava/lang/Object;II)[B")
	public static byte[] method7290(@OriginalArg(1) Object arg0, @OriginalArg(3) int arg1) {
		if (arg0 == null) {
			return null;
		} else if (arg0 instanceof byte[]) {
			@Pc(13) byte[] local13 = (byte[]) arg0;
			return Static520.method7396(local13, arg1);
		} else if (arg0 instanceof Class21) {
			@Pc(25) Class21 local25 = (Class21) arg0;
			return local25.method6754(arg1);
		} else {
			throw new IllegalArgumentException();
		}
	}
}

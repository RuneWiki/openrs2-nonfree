import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static489 {

	@OriginalMember(owner = "client!sq", name = "I", descriptor = "[Lclient!dm;")
	public static Class71[] aClass71Array1;

	@OriginalMember(owner = "client!sq", name = "J", descriptor = "Lclient!jt;")
	public static Class163 aClass163_3;

	@OriginalMember(owner = "client!sq", name = "K", descriptor = "I")
	public static int anInt8245;

	@OriginalMember(owner = "client!sq", name = "B", descriptor = "I")
	public static int anInt8241 = 0;

	@OriginalMember(owner = "client!sq", name = "C", descriptor = "[I")
	public static final int[] anIntArray602 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!sq", name = "D", descriptor = "Ljava/util/Hashtable;")
	public static Hashtable aHashtable5 = new Hashtable();

	@OriginalMember(owner = "client!sq", name = "f", descriptor = "(I)V")
	public static void method6689() {
		if (!Static199.aBoolean458) {
			return;
		}
		@Pc(11) Class292 local11 = Static391.method5747(Static593.anInt9601, Static115.anInt2199);
		if (local11 != null && local11.anObjectArray13 != null) {
			@Pc(20) Class6_Sub43 local20 = new Class6_Sub43();
			local20.anObjectArray34 = local11.anObjectArray13;
			local20.aClass292_12 = local11;
			Static446.method6319(local20);
		}
		Static245.anInt4901 = -1;
		Static188.anInt3896 = -1;
		Static199.aBoolean458 = false;
		if (local11 != null) {
			Static464.method6502(local11);
		}
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(BILclient!pfa;I)Lclient!nj;")
	public static Class220 method6690(@OriginalArg(1) int arg0, @OriginalArg(2) Class251 arg1) {
		@Pc(11) byte[] local11 = arg1.method5772(0, arg0);
		return local11 == null ? null : new Class220(local11);
	}

	@OriginalMember(owner = "client!sq", name = "b", descriptor = "(III)V")
	public static void method6691(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class276 local7 = Static270.aClass276ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 != null && local7.aClass4_Sub3_2 != null) {
			local7.aClass4_Sub3_2 = null;
		}
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(Z)V")
	public static void method6692() {
		Static562.aClass128_42.method3274();
		Static304.aClass180_10.method4465();
		Static463.aClass180_11.method4465();
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(IIIZBII)V")
	public static void method6693(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		if (Static140.aClass6_Sub48_Sub1_1.anInt8997 != 0 && arg3 != 0 && Static559.anInt9221 < 50 && arg1 != -1) {
			Static546.aClass39Array1[Static559.anInt9221++] = new Class39((byte) 2, arg1, arg3, arg2, arg0, arg4);
		}
	}
}

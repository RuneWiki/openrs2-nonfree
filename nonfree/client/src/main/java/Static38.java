import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static38 {

	@OriginalMember(owner = "client!bs", name = "h", descriptor = "Lclient!bf;")
	public static final Class21 aClass21_6 = new Class21(11, 18);

	@OriginalMember(owner = "client!bs", name = "p", descriptor = "Lclient!gk;")
	public static final Class83 aClass83_19 = new Class83("Discard", "Ablegen", "Jeter", "Descartar");

	@OriginalMember(owner = "client!bs", name = "q", descriptor = "I")
	public static final int anInt671 = 1403;

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(IZIZB)V")
	public static void method669(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		Static407.method5249(0, arg2, arg3, Static392.aClass78_Sub1Array1.length - 1, arg1, arg0);
		Static7.aClass4_Sub42_3 = null;
		Static168.anInt3258 = 0;
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(II)V")
	public static void method670(@OriginalArg(0) int arg0) {
		@Pc(16) Class4_Sub1_Sub11 local16 = Static405.method5222(arg0, 1);
		local16.method2608();
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(ZB[BLclient!fd;IIII)Lclient!ps;")
	public static Class6_Sub1_Sub1 method671(@OriginalArg(2) byte[] arg0, @OriginalArg(3) Class19_Sub2 arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		if (arg1.aBoolean213 || Static424.method5413(arg2) && Static424.method5413(arg3)) {
			return new Class6_Sub1_Sub1(arg1, 3553, 6406, arg2, arg3, false, arg0, 6406);
		} else if (arg1.aBoolean207) {
			return new Class6_Sub1_Sub1(arg1, 34037, 6406, arg2, arg3, false, arg0, 6406);
		} else {
			return new Class6_Sub1_Sub1(arg1, 6406, arg2, arg3, Static370.method4949(arg2), Static370.method4949(arg3), arg0, 6406);
		}
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(IB)Lclient!fk;")
	public static Class3_Sub3 method672(@OriginalArg(0) int arg0) {
		@Pc(7) Class84[] local7 = Class147.aClass84Array1;
		synchronized (Class147.aClass84Array1) {
			@Pc(36) Class3_Sub3 local36;
			if (Class147.aClass84Array1.length <= arg0 || Class147.aClass84Array1[arg0].method2313()) {
				local36 = new Class3_Sub3();
				local36.aClass3_Sub5Array1 = new Class3_Sub5[arg0];
				for (@Pc(42) int local42 = 0; local42 < arg0; local42++) {
					local36.aClass3_Sub5Array1[local42] = new Class3_Sub5();
				}
			} else {
				local36 = (Class3_Sub3) Class147.aClass84Array1[arg0].method2308();
				local36.method5676();
				@Pc(75) int local75 = Static95.anIntArray154[arg0]--;
			}
			return local36;
		}
	}

	@OriginalMember(owner = "client!bs", name = "b", descriptor = "(I)V")
	public static void method673() {
		@Pc(9) int[] local9 = new int[Static444.aClass206_3.anInt5987];
		@Pc(11) int local11 = 0;
		for (@Pc(17) int local17 = 0; local17 < Static444.aClass206_3.anInt5987; local17++) {
			@Pc(24) Class211 local24 = Static444.aClass206_3.method4703(local17);
			if (local24.anInt6157 >= 0 || local24.anInt6156 >= 0) {
				local9[local11++] = local17;
			}
		}
		Static119.anIntArray170 = new int[local11];
		for (@Pc(48) int local48 = 0; local48 < local11; local48++) {
			Static119.anIntArray170[local48] = local9[local48];
		}
	}
}

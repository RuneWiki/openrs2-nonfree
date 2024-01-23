import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!ch", name = "c", descriptor = "I")
	public static int anInt4049;

	@OriginalMember(owner = "client!ch", name = "e", descriptor = "Lclient!qe;")
	private static Class78 aClass78_705 = Static199.method3560("skill)2");

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "Lclient!qe;")
	public static Class78 aClass78_704 = aClass78_705;

	@OriginalMember(owner = "client!ch", name = "d", descriptor = "I")
	public static int anInt4050 = 0;

	@OriginalMember(owner = "client!ch", name = "f", descriptor = "[B")
	public static byte[] aByteArray50 = new byte[520];

	@OriginalMember(owner = "client!ch", name = "o", descriptor = "Lclient!qe;")
	private static Class78 aClass78_707 = Static199.method3560("Starting 3d library");

	@OriginalMember(owner = "client!ch", name = "m", descriptor = "Lclient!qe;")
	public static Class78 aClass78_706 = aClass78_707;

	@OriginalMember(owner = "client!ch", name = "n", descriptor = "[Lclient!qe;")
	public static Class78[] aClass78Array30 = new Class78[500];

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(ILclient!oe;B)Lclient!uj;")
	public static Class79 method3204(@OriginalArg(0) int arg0, @OriginalArg(1) Class72 arg1) {
		return Static71.method1150(arg0, arg1) ? Static15.method241() : null;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "([Lclient!mj;II)V")
	public static void method3205(@OriginalArg(0) Class64[] arg0, @OriginalArg(1) int arg1) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(6) Class64 local6 = arg0[local1];
			if (local6 != null) {
				if (local6.anInt3051 == 0) {
					if (local6.aClass64Array2 != null) {
						method3205(local6.aClass64Array2, arg1);
					}
					@Pc(30) Class2_Sub11 local30 = (Class2_Sub11) Static12.aClass103_4.method3659((long) local6.anInt3044);
					if (local30 != null) {
						Static161.method2899(local30.anInt726, arg1);
					}
				}
				@Pc(46) Class2_Sub1 local46;
				if (arg1 == 0 && local6.anObjectArray27 != null) {
					local46 = new Class2_Sub1();
					local46.anObjectArray1 = local6.anObjectArray27;
					local46.aClass64_1 = local6;
					Static50.method649(local46);
				}
				if (arg1 == 1 && local6.anObjectArray11 != null) {
					if (local6.anInt2993 >= 0) {
						@Pc(70) Class64 local70 = Static204.method3618(local6.anInt3044);
						if (local70 == null || local70.aClass64Array2 == null || local70.aClass64Array2.length <= local6.anInt2993 || local70.aClass64Array2[local6.anInt2993] != local6) {
							continue;
						}
					}
					local46 = new Class2_Sub1();
					local46.anObjectArray1 = local6.anObjectArray11;
					local46.aClass64_1 = local6;
					Static50.method649(local46);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(II)Lclient!p;")
	public static Class2_Sub3_Sub23 method3209(@OriginalArg(1) int arg0) {
		@Pc(10) Class2_Sub3_Sub23 local10 = (Class2_Sub3_Sub23) Static39.aClass110_3.method3891((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(24) byte[] local24 = Static223.aClass72_283.method3197(Static21.method291(arg0), Static99.method1695(arg0));
		local10 = new Class2_Sub3_Sub23();
		local10.anInt3509 = arg0;
		if (local24 != null) {
			local10.method2729(new Class2_Sub23(local24));
		}
		local10.method2734();
		if (local10.anInt3495 != -1) {
			local10.method2732(method3209(local10.anInt3476), method3209(local10.anInt3495));
		}
		if (local10.anInt3510 != -1) {
			local10.method2740(method3209(local10.anInt3529), method3209(local10.anInt3510));
		}
		if (!Static98.aBoolean80 && local10.aBoolean154) {
			local10.anInt3486 = 0;
			local10.aClass78_640 = Static194.aClass78_759;
			local10.aBoolean153 = false;
			local10.aClass78Array25 = null;
			local10.aClass78Array24 = null;
		}
		Static39.aClass110_3.method3894(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(ZBLjava/lang/Object;)[B")
	public static byte[] method3210(@OriginalArg(0) boolean arg0, @OriginalArg(2) Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			@Pc(13) byte[] local13 = (byte[]) arg1;
			return arg0 ? Static158.method2849(local13) : local13;
		} else if (arg1 instanceof Class42) {
			@Pc(27) Class42 local27 = (Class42) arg1;
			return local27.method1280();
		} else {
			throw new IllegalArgumentException();
		}
	}
}

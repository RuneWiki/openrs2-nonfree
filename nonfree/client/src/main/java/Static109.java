import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static109 {

	@OriginalMember(owner = "client!il", name = "d", descriptor = "F")
	public static float aFloat25;

	@OriginalMember(owner = "client!il", name = "h", descriptor = "Lclient!mn;")
	public static Class115 aClass115_10;

	@OriginalMember(owner = "client!il", name = "c", descriptor = "I")
	public static int anInt2341 = 0;

	@OriginalMember(owner = "client!il", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString121 = "Walk here";

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(Lclient!jd;Lclient!jd;I)I")
	public static int method2015(@OriginalArg(0) Class84 arg0, @OriginalArg(1) Class84 arg1) {
		@Pc(10) int local10 = 0;
		if (arg0.method2138(Static92.anInt2040)) {
			local10++;
		}
		if (arg0.method2138(Static207.anInt4319)) {
			local10++;
		}
		if (arg0.method2138(Static120.anInt2577)) {
			local10++;
		}
		if (arg1.method2138(Static92.anInt2040)) {
			local10++;
		}
		if (arg1.method2138(Static207.anInt4319)) {
			local10++;
		}
		if (arg1.method2138(Static120.anInt2577)) {
			local10++;
		}
		return local10;
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method2016(@OriginalArg(1) int arg0) {
		if (arg0 < 100000) {
			return "<col=ffff00>" + arg0 + "</col>";
		} else if (arg0 >= 10000000) {
			return "<col=00ff80>" + arg0 / 1000000 + Static19.aString29 + "</col>";
		} else {
			return "<col=ffffff>" + arg0 / 1000 + Static273.aString268 + "</col>";
		}
	}

	@OriginalMember(owner = "client!il", name = "b", descriptor = "(II)V")
	public static void method2017(@OriginalArg(1) int arg0) {
		@Pc(13) Class2_Sub3_Sub16 local13 = Static119.method2204(arg0, 9);
		local13.method2719();
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(IIIJ)Z")
	public static boolean method2018(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3) {
		@Pc(7) Class2_Sub31 local7 = Static180.aClass2_Sub31ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return false;
		} else if (local7.aClass168_1 != null && local7.aClass168_1.aLong268 == arg3) {
			return true;
		} else if (local7.aClass50_1 != null && local7.aClass50_1.aLong65 == arg3) {
			return true;
		} else if (local7.aClass65_1 != null && local7.aClass65_1.aLong104 == arg3) {
			return true;
		} else {
			for (@Pc(46) int local46 = 0; local46 < local7.anInt5708; local46++) {
				if (local7.aClass34Array2[local46].aLong49 == arg3) {
					return true;
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(ILclient!vl;Lclient!wm;I)V")
	public static void method2019(@OriginalArg(1) Class177 arg0, @OriginalArg(2) Class2_Sub26 arg1, @OriginalArg(3) int arg2) {
		@Pc(13) Class2_Sub29 local13 = new Class2_Sub29();
		local13.anInt5546 = arg1.method4261();
		local13.anInt5551 = arg1.method4228();
		local13.anIntArray491 = new int[local13.anInt5546];
		local13.aClass28Array2 = new Class28[local13.anInt5546];
		local13.aClass28Array1 = new Class28[local13.anInt5546];
		local13.aByteArrayArrayArray13 = new byte[local13.anInt5546][][];
		local13.anIntArray489 = new int[local13.anInt5546];
		local13.anIntArray490 = new int[local13.anInt5546];
		for (@Pc(55) int local55 = 0; local55 < local13.anInt5546; local55++) {
			try {
				@Pc(63) int local63 = arg1.method4261();
				@Pc(78) String local78;
				@Pc(82) String local82;
				@Pc(84) int local84;
				if (local63 == 0 || local63 == 1 || local63 == 2) {
					local78 = arg1.method4265();
					local82 = arg1.method4265();
					local84 = 0;
					if (local63 == 1) {
						local84 = arg1.method4228();
					}
					local13.anIntArray490[local55] = local63;
					local13.anIntArray489[local55] = local84;
					local13.aClass28Array1[local55] = arg0.method4670(Static217.method3657(local78), local82);
				} else if (local63 == 3 || local63 == 4) {
					local78 = arg1.method4265();
					local82 = arg1.method4265();
					local84 = arg1.method4261();
					@Pc(141) String[] local141 = new String[local84];
					for (@Pc(143) int local143 = 0; local143 < local84; local143++) {
						local141[local143] = arg1.method4265();
					}
					@Pc(158) byte[][] local158 = new byte[local84][];
					@Pc(172) int local172;
					if (local63 == 3) {
						for (@Pc(165) int local165 = 0; local165 < local84; local165++) {
							local172 = arg1.method4228();
							local158[local165] = new byte[local172];
							arg1.method4226(local158[local165], local172);
						}
					}
					local13.anIntArray490[local55] = local63;
					@Pc(196) Class[] local196 = new Class[local84];
					for (local172 = 0; local172 < local84; local172++) {
						local196[local172] = Static217.method3657(local141[local172]);
					}
					local13.aClass28Array2[local55] = arg0.method4674(Static217.method3657(local78), local82, local196);
					local13.aByteArrayArrayArray13[local55] = local158;
				}
			} catch (@Pc(231) ClassNotFoundException local231) {
				local13.anIntArray491[local55] = -1;
			} catch (@Pc(238) SecurityException local238) {
				local13.anIntArray491[local55] = -2;
			} catch (@Pc(245) NullPointerException local245) {
				local13.anIntArray491[local55] = -3;
			} catch (@Pc(252) Exception local252) {
				local13.anIntArray491[local55] = -4;
			} catch (@Pc(259) Throwable local259) {
				local13.anIntArray491[local55] = -5;
			}
		}
		Static221.aClass1_18.method11(local13);
	}
}

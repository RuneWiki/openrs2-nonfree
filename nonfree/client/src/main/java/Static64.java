import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static64 {

	@OriginalMember(owner = "client!dn", name = "h", descriptor = "Lclient!iq;")
	public static Class104 aClass104_44;

	@OriginalMember(owner = "client!dn", name = "i", descriptor = "I")
	public static int anInt1136;

	@OriginalMember(owner = "client!dn", name = "c", descriptor = "Lclient!ik;")
	public static final Class102 aClass102_21 = new Class102("", 11);

	@OriginalMember(owner = "client!dn", name = "f", descriptor = "Lclient!pf;")
	public static final Class157 aClass157_39 = new Class157(73, 8);

	@OriginalMember(owner = "client!dn", name = "g", descriptor = "Lclient!ns;")
	public static final Class143 aClass143_3 = new Class143(13, 17);

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(I[BBI)Z")
	public static boolean method1321(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(11) boolean local11 = true;
		@Pc(16) Class2_Sub12 local16 = new Class2_Sub12(arg1);
		@Pc(18) int local18 = -1;
		label56: while (true) {
			@Pc(22) int local22 = local16.method3120();
			if (local22 == 0) {
				return local11;
			}
			local18 += local22;
			@Pc(33) int local33 = 0;
			@Pc(35) boolean local35 = false;
			while (true) {
				@Pc(41) int local41;
				while (!local35) {
					local41 = local16.method3153();
					if (local41 == 0) {
						continue label56;
					}
					local33 += local41 - 1;
					@Pc(68) int local68 = local33 & 0x3F;
					@Pc(74) int local74 = local33 >> 6 & 0x3F;
					@Pc(80) int local80 = local16.method3124() >> 2;
					@Pc(84) int local84 = arg0 + local74;
					@Pc(88) int local88 = local68 + arg2;
					if (local84 > 0 && local88 > 0 && local84 < Static66.anInt1177 - 1 && Static12.anInt213 - 1 > local88) {
						@Pc(109) Class74 local109 = Static228.method4210(local18);
						if (local80 != 22 || Static146.aBoolean287 || local109.anInt2086 != 0 || local109.anInt2064 == 1 || local109.aBoolean199) {
							if (!local109.method2013()) {
								Static230.anInt5822++;
								local11 = false;
							}
							local35 = true;
						}
					}
				}
				local41 = local16.method3153();
				if (local41 == 0) {
					break;
				}
				local16.method3124();
			}
		}
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(ZI)Lclient!nq;")
	public static Class142 method1322(@OriginalArg(1) int arg0) {
		@Pc(5) Class107 local5 = Static338.aClass107_55;
		@Pc(14) Class142 local14;
		synchronized (Static338.aClass107_55) {
			local14 = (Class142) Static338.aClass107_55.method3021((long) arg0);
		}
		if (local14 != null) {
			return local14;
		}
		@Pc(30) byte[] local30 = Static336.aClass104_180.method2756(32, arg0);
		local14 = new Class142();
		if (local30 != null) {
			local14.method4174(new Class2_Sub12(local30));
		}
		local14.method4171();
		@Pc(55) Class107 local55 = Static338.aClass107_55;
		synchronized (Static338.aClass107_55) {
			Static338.aClass107_55.method3018((long) arg0, local14);
			return local14;
		}
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "([Lclient!fh;BI)V")
	public static void method1324(@OriginalArg(0) Class68[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			@Pc(13) Class68 local13 = arg0[local7];
			if (local13 != null) {
				if (local13.anInt1871 == 0) {
					if (local13.aClass68Array1 != null) {
						method1324(local13.aClass68Array1, arg1);
					}
					@Pc(34) Class2_Sub40 local34 = (Class2_Sub40) Static303.aClass41_32.method902((long) local13.anInt1857);
					if (local34 != null) {
						Static271.method4703(arg1, local34.anInt6092);
					}
				}
				@Pc(53) Class2_Sub41 local53;
				if (arg1 == 0 && local13.anObjectArray8 != null) {
					local53 = new Class2_Sub41();
					local53.anObjectArray35 = local13.anObjectArray8;
					local53.aClass68_35 = local13;
					Static367.method5890(local53);
				}
				if (arg1 == 1 && local13.anObjectArray2 != null) {
					if (local13.anInt1851 >= 0) {
						@Pc(81) Class68 local81 = Static8.method144(local13.anInt1857);
						if (local81 == null || local81.aClass68Array1 == null || local13.anInt1851 >= local81.aClass68Array1.length || local13 != local81.aClass68Array1[local13.anInt1851]) {
							continue;
						}
					}
					local53 = new Class2_Sub41();
					local53.anObjectArray35 = local13.anObjectArray2;
					local53.aClass68_35 = local13;
					Static367.method5890(local53);
				}
			}
		}
	}
}

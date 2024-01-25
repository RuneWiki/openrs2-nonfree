import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static460 {

	@OriginalMember(owner = "client!ph", name = "j", descriptor = "Lclient!mw;")
	public static final Class240 aClass240_77 = new Class240(88, -1);

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(ILclient!ha;IBIII)Lclient!ka;")
	public static Class149 method6183(@OriginalArg(0) int arg0, @OriginalArg(1) Class95 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) long local11 = (long) arg0;
		@Pc(17) Class149 local17 = (Class149) Static375.aClass295_50.method6470(local11);
		if (local17 == null) {
			@Pc(27) Class134 local27 = Static74.method1278(arg0, Static420.aClass362_91);
			if (local27 == null) {
				return null;
			}
			if (local27.anInt3581 < 13) {
				local27.method3065();
			}
			local17 = arg1.method8021(local27, 2055, Static180.anInt3304, 64, 768);
			Static375.aClass295_50.method6469(local11, local17);
		}
		local17 = local17.method8858((byte) 2, 2055, true);
		if (arg3 != 0) {
			local17.a(arg3);
		}
		if (arg2 != 0) {
			local17.FA(arg2);
		}
		if (arg5 != 0) {
			local17.VA(arg5);
		}
		if (arg4 != 0) {
			local17.H(0, arg4, 0);
		}
		return local17;
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(I[B)Lclient!nba;")
	public static Class3_Sub5_Sub14 method6185(@OriginalArg(1) byte[] arg0) {
		@Pc(9) Class3_Sub5_Sub14 local9 = new Class3_Sub5_Sub14();
		@Pc(14) Class3_Sub4 local14 = new Class3_Sub4(arg0);
		local14.anInt9739 = local14.aByteArray90.length - 2;
		@Pc(25) int local25 = local14.method7951();
		@Pc(35) int local35 = local14.aByteArray90.length - local25 - 2 - 16;
		local14.anInt9739 = local35;
		@Pc(42) int local42 = local14.method7895();
		local9.anInt6494 = local14.method7951();
		local9.anInt6490 = local14.method7951();
		local9.anInt6493 = local14.method7951();
		local9.anInt6498 = local14.method7951();
		local9.anInt6496 = local14.method7951();
		local9.anInt6491 = local14.method7951();
		@Pc(76) int local76 = local14.method7954();
		@Pc(87) int local87;
		@Pc(93) int local93;
		if (local76 > 0) {
			local9.aClass333Array1 = new Class333[local76];
			for (local87 = 0; local87 < local76; local87++) {
				local93 = local14.method7951();
				@Pc(102) Class333 local102 = new Class333(Static585.method7772(local93));
				local9.aClass333Array1[local87] = local102;
				while (local93-- > 0) {
					@Pc(113) int local113 = local14.method7895();
					@Pc(117) int local117 = local14.method7895();
					local102.method7488((long) local113, new Class3_Sub24(local117));
				}
			}
		}
		local14.anInt9739 = 0;
		local9.aString82 = local14.method7917();
		local9.anIntArray344 = new int[local42];
		local87 = 0;
		while (local35 > local14.anInt9739) {
			local93 = local14.method7951();
			if (local93 == 3) {
				if (local9.aStringArray46 == null) {
					local9.aStringArray46 = new String[local42];
				}
				local9.aStringArray46[local87] = local14.method7922().intern();
			} else if (local93 == 54) {
				if (local9.aLongArray13 == null) {
					local9.aLongArray13 = new long[local42];
				}
				local9.aLongArray13[local87] = local14.method7946();
			} else {
				if (local9.anIntArray343 == null) {
					local9.anIntArray343 = new int[local42];
				}
				if (local93 >= 150 || local93 == 21 || local93 == 38 || local93 == 39) {
					local9.anIntArray343[local87] = local14.method7954();
				} else {
					local9.anIntArray343[local87] = local14.method7895();
				}
			}
			local9.anIntArray344[local87++] = local93;
		}
		return local9;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static545 {

	@OriginalMember(owner = "client!sl", name = "e", descriptor = "Lclient!uea;")
	public static Class344 aClass344_1;

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "S")
	public static short aShort100 = 1;

	@OriginalMember(owner = "client!sl", name = "b", descriptor = "(Z)V")
	public static void method7955() {
		if (!Static625.aBoolean761) {
			return;
		}
		while (true) {
			while (Static338.anInt6022 < Static92.aClass180_Sub1Array1.length) {
				@Pc(27) Class180_Sub1 local27 = Static92.aClass180_Sub1Array1[Static338.anInt6022];
				if (local27 != null && local27.anInt4555 == -1) {
					if (Static45.aClass5_Sub7_4 == null) {
						Static45.aClass5_Sub7_4 = Static303.aClass254_1.method5900(local27.aString66);
					}
					@Pc(56) int local56 = Static45.aClass5_Sub7_4.anInt969;
					if (local56 == -1) {
						return;
					}
					Static338.anInt6022++;
					local27.anInt4555 = local56;
					Static45.aClass5_Sub7_4 = null;
				} else {
					Static338.anInt6022++;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(IILclient!nw;IILclient!ic;ILclient!c;)V")
	public static void method7956(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class8_Sub1_Sub3_Sub2_Sub2 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class8_Sub1_Sub3_Sub2_Sub1 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class55 arg6) {
		@Pc(7) Class5_Sub22 local7 = new Class5_Sub22();
		local7.anInt3959 = arg3;
		local7.anInt3948 = arg0 << 9;
		local7.anInt3951 = arg5 << 9;
		if (arg6 != null) {
			local7.aClass55_1 = arg6;
			@Pc(176) int local176 = arg6.anInt958;
			@Pc(179) int local179 = arg6.anInt954;
			if (arg1 == 1 || arg1 == 3) {
				local179 = arg6.anInt958;
				local176 = arg6.anInt954;
			}
			local7.anInt3946 = arg6.anInt945 << 9;
			local7.anInt3950 = arg5 + local179 << 9;
			local7.anInt3954 = arg6.anInt940;
			local7.anInt3944 = arg6.anInt962 << 9;
			local7.anInt3955 = arg6.anInt925;
			local7.aBoolean309 = arg6.aBoolean90;
			local7.anInt3953 = arg6.anInt957;
			local7.aBoolean307 = arg6.aBoolean84;
			local7.anIntArray227 = arg6.anIntArray48;
			local7.anInt3947 = local176 + arg0 << 9;
			local7.anInt3952 = arg6.anInt956;
			local7.anInt3958 = arg6.anInt904;
			local7.anInt3945 = arg6.anInt909;
			if (arg6.anIntArray46 != null) {
				local7.aBoolean308 = true;
				local7.method3422();
			}
			if (local7.anIntArray227 != null) {
				local7.anInt3949 = local7.anInt3953 + (int) (Math.random() * (double) (local7.anInt3952 - local7.anInt3953));
			}
			Static343.aClass102_41.method1921(local7);
		} else if (arg2 != null) {
			local7.aClass8_Sub1_Sub3_Sub2_Sub2_1 = arg2;
			@Pc(99) Class227 local99 = arg2.aClass227_1;
			if (local99.anIntArray341 != null) {
				local7.aBoolean308 = true;
				local99 = local99.method5322(Static413.aClass118_1);
			}
			if (local99 != null) {
				local7.anInt3947 = local99.anInt6248 + arg0 << 9;
				local7.anInt3950 = arg5 + local99.anInt6248 << 9;
				local7.anInt3954 = Static242.method3548(arg2);
				local7.anInt3944 = local99.anInt6239 << 9;
				local7.anInt3946 = local99.anInt6255 << 9;
				local7.anInt3958 = local99.anInt6249;
				local7.anInt3945 = local99.anInt6247;
				local7.aBoolean307 = local99.aBoolean465;
				local7.anInt3955 = local99.anInt6235;
			}
			Static509.aClass102_60.method1921(local7);
		} else if (arg4 != null) {
			local7.aClass8_Sub1_Sub3_Sub2_Sub1_2 = arg4;
			local7.anInt3947 = arg4.method5993() + arg0 << 9;
			local7.anInt3950 = arg4.method5993() + arg5 << 9;
			local7.anInt3954 = Static592.method8586(arg4);
			local7.anInt3944 = 0;
			local7.anInt3946 = arg4.anInt4190 << 9;
			local7.anInt3955 = arg4.anInt4209;
			local7.aBoolean307 = arg4.aBoolean330;
			local7.anInt3958 = 256;
			local7.anInt3945 = 256;
			Static679.aClass291_46.method6984((long) arg4.anInt6994, local7);
			return;
		}
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(III)Lclient!iia;")
	public static Class174 method7957(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static260.aClass174ArrayArrayArray2[arg0][arg1][arg2] == null) {
			@Pc(33) boolean local33 = Static260.aClass174ArrayArrayArray2[0][arg1][arg2] != null && Static260.aClass174ArrayArrayArray2[0][arg1][arg2].aClass174_1 != null;
			if (local33 && arg0 >= Static490.anInt9715 - 1) {
				return null;
			}
			Static529.method7630(arg0, arg1, arg2);
		}
		return Static260.aClass174ArrayArrayArray2[arg0][arg1][arg2];
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static664 {

	@OriginalMember(owner = "client!ur", name = "l", descriptor = "I")
	public static int anInt10179;

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(IILclient!aba;)Z")
	public static boolean method8656(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub2_Sub1 arg1) {
		@Pc(8) int local8 = arg1.method216(2);
		@Pc(35) int local35;
		@Pc(40) int local40;
		@Pc(117) int local117;
		@Pc(121) int local121;
		@Pc(127) int local127;
		if (local8 == 0) {
			if (arg1.method216(1) != 0) {
				method8656(arg0, arg1);
			}
			local35 = arg1.method216(6);
			local40 = arg1.method216(6);
			@Pc(53) boolean local53 = arg1.method216(1) == 1;
			if (local53) {
				Static95.anIntArray119[Static393.anInt6120++] = arg0;
			}
			if (Static19.aClass9_Sub1_Sub1_Sub2_Sub1Array1[arg0] != null) {
				throw new RuntimeException("hr:lr");
			}
			@Pc(81) Class121 local81 = Static447.aClass121Array1[arg0];
			@Pc(89) Class9_Sub1_Sub1_Sub2_Sub1 local89 = Static19.aClass9_Sub1_Sub1_Sub2_Sub1Array1[arg0] = new Class9_Sub1_Sub1_Sub2_Sub1();
			local89.anInt8783 = arg0;
			if (Static718.aClass3_Sub2Array1[arg0] != null) {
				local89.method473(Static718.aClass3_Sub2Array1[arg0], 86);
			}
			local89.method7495(local81.anInt3164, true);
			local89.anInt8767 = local81.anInt3163;
			local117 = local81.anInt3166;
			local121 = local117 >> 28;
			local127 = local117 >> 14 & 0xFF;
			@Pc(131) int local131 = local117 & 0xFF;
			@Pc(139) int local139 = (local127 << 6) + (local35 - Static291.anInt4448);
			local89.aBoolean36 = local81.aBoolean200;
			local89.aBoolean37 = local81.aBoolean198;
			@Pc(156) int local156 = (local131 << 6) + local40 - Static189.anInt3243;
			local89.aByteArray86[0] = Static503.aByteArray80[arg0];
			local89.aByte139 = local89.aByte140 = (byte) local121;
			if (Static574.method7435(local139, local156)) {
				local89.aByte140++;
			}
			local89.method483(local139, local156);
			local89.aBoolean38 = false;
			Static447.aClass121Array1[arg0] = null;
			return true;
		} else if (local8 == 1) {
			local35 = arg1.method216(2);
			local40 = Static447.aClass121Array1[arg0].anInt3166;
			Static447.aClass121Array1[arg0].anInt3166 = (((local40 >> 28) + local35 & 0x3) << 28) + (local40 & 0xFFFFFFF);
			return false;
		} else {
			@Pc(250) int local250;
			@Pc(255) int local255;
			@Pc(263) int local263;
			if (local8 != 2) {
				local35 = arg1.method216(18);
				local40 = local35 >> 16;
				local250 = local35 >> 8 & 0xFF;
				local255 = local35 & 0xFF;
				local263 = Static447.aClass121Array1[arg0].anInt3166;
				local117 = local40 + (local263 >> 28) & 0x3;
				local121 = local250 + (local263 >> 14) & 0xFF;
				local127 = local263 + local255 & 0xFF;
				Static447.aClass121Array1[arg0].anInt3166 = local127 + (local117 << 28) + (local121 << 14);
				return false;
			}
			local35 = arg1.method216(5);
			local40 = local35 >> 3;
			local250 = local35 & 0x7;
			local255 = Static447.aClass121Array1[arg0].anInt3166;
			local263 = (local255 >> 28) + local40 & 0x3;
			local117 = local255 >> 14 & 0xFF;
			local121 = local255 & 0xFF;
			if (local250 == 0) {
				local121--;
				local117--;
			}
			if (local250 == 1) {
				local121--;
			}
			if (local250 == 2) {
				local121--;
				local117++;
			}
			if (local250 == 3) {
				local117--;
			}
			if (local250 == 4) {
				local117++;
			}
			if (local250 == 5) {
				local121++;
				local117--;
			}
			if (local250 == 6) {
				local121++;
			}
			if (local250 == 7) {
				local117++;
				local121++;
			}
			Static447.aClass121Array1[arg0].anInt3166 = local121 + (local263 << 28) + (local117 << 14);
			return false;
		}
	}

	@OriginalMember(owner = "client!ur", name = "e", descriptor = "(II)Z")
	public static boolean method8658(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 == 4 || arg1 == 8 || arg1 == 12 || arg1 == 10;
	}
}

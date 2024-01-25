import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static511 {

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "[[I")
	public static int[][] anIntArrayArray43;

	@OriginalMember(owner = "client!ra", name = "d", descriptor = "Z")
	public static boolean aBoolean648 = false;

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lclient!eea;II)Z")
	public static boolean method7381(@OriginalArg(0) Class6_Sub15_Sub1 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg0.method2468(2);
		@Pc(35) int local35;
		@Pc(40) int local40;
		@Pc(117) int local117;
		@Pc(121) int local121;
		@Pc(127) int local127;
		if (local8 == 0) {
			if (arg0.method2468(1) != 0) {
				method7381(arg0, arg1);
			}
			local35 = arg0.method2468(6);
			local40 = arg0.method2468(6);
			@Pc(53) boolean local53 = arg0.method2468(1) == 1;
			if (local53) {
				Static604.anIntArray620[Static27.anInt372++] = arg1;
			}
			if (Static171.aClass60_Sub1_Sub1_Sub3_Sub1Array1[arg1] != null) {
				throw new RuntimeException("hr:lr");
			}
			@Pc(81) Class353 local81 = Static395.aClass353Array1[arg1];
			@Pc(89) Class60_Sub1_Sub1_Sub3_Sub1 local89 = Static171.aClass60_Sub1_Sub1_Sub3_Sub1Array1[arg1] = new Class60_Sub1_Sub1_Sub3_Sub1();
			local89.anInt4845 = arg1;
			if (Static372.aClass6_Sub15Array4[arg1] != null) {
				local89.method2706(Static372.aClass6_Sub15Array4[arg1]);
			}
			local89.method4423(true, local81.anInt9540);
			local89.anInt4858 = local81.anInt9538;
			local117 = local81.anInt9537;
			local121 = local117 >> 28;
			local127 = local117 >> 14 & 0xFF;
			@Pc(131) int local131 = local117 & 0xFF;
			@Pc(141) int local141 = (local127 << 6) + local35 - Static50.anInt606;
			local89.aBoolean226 = local81.aBoolean710;
			@Pc(153) int local153 = local40 + (local131 << 6) - Static404.anInt7039;
			local89.aBoolean227 = local81.aBoolean711;
			local89.aByteArray36[0] = Static27.aByteArray4[arg1];
			local89.aByte135 = local89.aByte134 = (byte) local121;
			if (Static180.method3417(1, local141, local153)) {
				local89.aByte134++;
			}
			local89.method2707(local141, local153);
			local89.aBoolean228 = false;
			Static395.aClass353Array1[arg1] = null;
			return true;
		} else if (local8 == 1) {
			local35 = arg0.method2468(2);
			local40 = Static395.aClass353Array1[arg1].anInt9537;
			Static395.aClass353Array1[arg1].anInt9537 = (local40 & 0xFFFFFFF) + ((local35 + (local40 >> 28) & 0x3) << 28);
			return false;
		} else {
			@Pc(251) int local251;
			@Pc(256) int local256;
			@Pc(264) int local264;
			if (local8 != 2) {
				local35 = arg0.method2468(18);
				local40 = local35 >> 16;
				local251 = local35 >> 8 & 0xFF;
				local256 = local35 & 0xFF;
				local264 = Static395.aClass353Array1[arg1].anInt9537;
				local117 = local40 + (local264 >> 28) & 0x3;
				local121 = local251 + (local264 >> 14) & 0xFF;
				local127 = local264 + local256 & 0xFF;
				Static395.aClass353Array1[arg1].anInt9537 = (local117 << 28) - (-(local121 << 14) - local127);
				return false;
			}
			local35 = arg0.method2468(5);
			local40 = local35 >> 3;
			local251 = local35 & 0x7;
			local256 = Static395.aClass353Array1[arg1].anInt9537;
			local264 = local40 + (local256 >> 28) & 0x3;
			local117 = local256 >> 14 & 0xFF;
			local121 = local256 & 0xFF;
			if (local251 == 0) {
				local117--;
				local121--;
			}
			if (local251 == 1) {
				local121--;
			}
			if (local251 == 2) {
				local121--;
				local117++;
			}
			if (local251 == 3) {
				local117--;
			}
			if (local251 == 4) {
				local117++;
			}
			if (local251 == 5) {
				local121++;
				local117--;
			}
			if (local251 == 6) {
				local121++;
			}
			if (local251 == 7) {
				local121++;
				local117++;
			}
			Static395.aClass353Array1[arg1].anInt9537 = local121 + (local264 << 28) + (local117 << 14);
			return false;
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)V")
	public static void method7382() {
		@Pc(23) byte[] local23;
		if (Static411.anObject18 == null) {
			@Pc(16) Class8_Sub2_Sub2 local16 = new Class8_Sub2_Sub2();
			local23 = local16.method7607();
			Static411.anObject18 = Static263.method4529(local23);
		}
		if (Static180.anObject13 == null) {
			@Pc(34) Class8_Sub1_Sub1 local34 = new Class8_Sub1_Sub1();
			local23 = local34.method89();
			Static180.anObject13 = Static263.method4529(local23);
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(ZII)Lclient!rs;")
	public static Class60_Sub9 method7383(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class385[] local7 = Class140.aClass385Array1;
		synchronized (Class140.aClass385Array1) {
			@Pc(37) Class60_Sub9 local37;
			if (arg1 >= Class140.aClass385Array1.length || Class140.aClass385Array1[arg1].method8775()) {
				local37 = new Class60_Sub9();
				local37.aClass60_Sub10Array1 = new Class60_Sub10[arg1];
				for (@Pc(43) int local43 = 0; local43 < arg1; local43++) {
					local37.aClass60_Sub10Array1[local43] = new Class60_Sub10();
				}
			} else {
				local37 = (Class60_Sub9) Class140.aClass385Array1[arg1].method8777();
				local37.method8914();
				@Pc(82) int local82 = Static683.anIntArray697[arg1]--;
			}
			local37.aBoolean668 = arg0;
			return local37;
		}
	}
}

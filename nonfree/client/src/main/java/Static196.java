import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static196 {

	@OriginalMember(owner = "client!hg", name = "L", descriptor = "J")
	public static long aLong84 = 0L;

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(IILclient!lt;)Z")
	public static boolean method3725(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub26_Sub2 arg1) {
		@Pc(8) int local8 = arg1.method5008(2);
		@Pc(28) int local28;
		@Pc(33) int local33;
		@Pc(100) int local100;
		@Pc(104) int local104;
		@Pc(110) int local110;
		if (local8 == 0) {
			if (arg1.method5008(1) != 0) {
				method3725(arg0, arg1);
			}
			local28 = arg1.method5008(6);
			local33 = arg1.method5008(6);
			@Pc(43) boolean local43 = arg1.method5008(1) == 1;
			if (local43) {
				Static127.anIntArray215[Static534.anInt9243++] = arg0;
			}
			if (Static239.aClass11_Sub1_Sub1_Sub2Array1[arg0] != null) {
				throw new RuntimeException("hr:lr");
			}
			@Pc(66) Class153 local66 = Static510.aClass153Array6[arg0];
			@Pc(74) Class11_Sub1_Sub1_Sub2 local74 = Static239.aClass11_Sub1_Sub1_Sub2Array1[arg0] = new Class11_Sub1_Sub1_Sub2();
			local74.anInt7392 = arg0;
			if (Static125.aClass6_Sub26Array1[arg0] != null) {
				local74.method6224(Static125.aClass6_Sub26Array1[arg0]);
			}
			local74.method6204(true, local66.anInt4682);
			local74.anInt7407 = local66.anInt4679;
			local100 = local66.anInt4680;
			local104 = local100 >> 28;
			local110 = local100 >> 14 & 0xFF;
			@Pc(114) int local114 = local100 & 0xFF;
			local74.aBoolean548 = local66.aBoolean368;
			local74.aByteArray84[0] = Static425.aByteArray94[arg0];
			local74.aByte77 = (byte) local104;
			local74.method6232((local114 << 6) + local33 - Static247.anInt5049, (local110 << 6) - (-local28 + Static191.anInt4147));
			local74.aBoolean550 = false;
			Static510.aClass153Array6[arg0] = null;
			return true;
		} else if (local8 == 1) {
			local28 = arg1.method5008(2);
			local33 = Static510.aClass153Array6[arg0].anInt4680;
			Static510.aClass153Array6[arg0].anInt4680 = (local33 & 0xFFFFFFF) + (((local33 >> 28) + local28 & 0x3) << 28);
			return false;
		} else {
			@Pc(213) int local213;
			@Pc(218) int local218;
			@Pc(226) int local226;
			if (local8 != 2) {
				local28 = arg1.method5008(18);
				local33 = local28 >> 16;
				local213 = local28 >> 8 & 0xFF;
				local218 = local28 & 0xFF;
				local226 = Static510.aClass153Array6[arg0].anInt4680;
				local100 = local33 + (local226 >> 28) & 0x3;
				local104 = local213 + (local226 >> 14) & 0xFF;
				local110 = local218 + local226 & 0xFF;
				Static510.aClass153Array6[arg0].anInt4680 = (local100 << 28) - (-(local104 << 14) - local110);
				return false;
			}
			local28 = arg1.method5008(5);
			local33 = local28 >> 3;
			local213 = local28 & 0x7;
			local218 = Static510.aClass153Array6[arg0].anInt4680;
			local226 = local33 + (local218 >> 28) & 0x3;
			local100 = local218 >> 14 & 0xFF;
			local104 = local218 & 0xFF;
			if (local213 == 0) {
				local104--;
				local100--;
			}
			if (local213 == 1) {
				local104--;
			}
			if (local213 == 2) {
				local100++;
				local104--;
			}
			if (local213 == 3) {
				local100--;
			}
			if (local213 == 4) {
				local100++;
			}
			if (local213 == 5) {
				local100--;
				local104++;
			}
			if (local213 == 6) {
				local104++;
			}
			if (local213 == 7) {
				local104++;
				local100++;
			}
			Static510.aClass153Array6[arg0].anInt4680 = local104 + (local226 << 28) + (local100 << 14);
			return false;
		}
	}
}

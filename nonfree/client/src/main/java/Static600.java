import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static600 {

	@OriginalMember(owner = "client!vh", name = "C", descriptor = "[[Lclient!g;")
	public static Class121[][] aClass121ArrayArray1;

	@OriginalMember(owner = "client!vh", name = "R", descriptor = "[I")
	public static int[] anIntArray690;

	@OriginalMember(owner = "client!vh", name = "S", descriptor = "Lclient!ha;")
	public static Class87 aClass87_15;

	@OriginalMember(owner = "client!vh", name = "O", descriptor = "Lclient!hda;")
	public static final Class143 aClass143_9 = new Class143();

	@OriginalMember(owner = "client!vh", name = "T", descriptor = "Lclient!qaa;")
	public static final Class269 aClass269_92 = new Class269(22, 8);

	@OriginalMember(owner = "client!vh", name = "U", descriptor = "I")
	public static int anInt9884 = 0;

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(IILclient!rca;)Z")
	public static boolean method8237(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub34_Sub2 arg1) {
		@Pc(8) int local8 = arg1.method6925(2);
		@Pc(33) int local33;
		@Pc(38) int local38;
		@Pc(107) int local107;
		@Pc(111) int local111;
		@Pc(117) int local117;
		if (local8 == 0) {
			if (arg1.method6925(1) != 0) {
				method8237(arg0, arg1);
			}
			local33 = arg1.method6925(6);
			local38 = arg1.method6925(6);
			@Pc(48) boolean local48 = arg1.method6925(1) == 1;
			if (local48) {
				Static108.anIntArray194[Static387.anInt6972++] = arg0;
			}
			if (Static572.aClass11_Sub1_Sub1_Sub2_Sub1Array1[arg0] != null) {
				throw new RuntimeException("hr:lr");
			}
			@Pc(71) Class85 local71 = Static428.aClass85Array1[arg0];
			@Pc(79) Class11_Sub1_Sub1_Sub2_Sub1 local79 = Static572.aClass11_Sub1_Sub1_Sub2_Sub1Array1[arg0] = new Class11_Sub1_Sub1_Sub2_Sub1();
			local79.anInt3246 = arg0;
			if (Static624.aClass2_Sub34Array1[arg0] != null) {
				local79.method429(Static624.aClass2_Sub34Array1[arg0]);
			}
			local79.method2759(local71.anInt2176, true);
			local79.anInt3278 = local71.anInt2171;
			local107 = local71.anInt2173;
			local111 = local107 >> 28;
			local117 = local107 >> 14 & 0xFF;
			@Pc(121) int local121 = local107 & 0xFF;
			@Pc(131) int local131 = (local117 << 6) + local33 - Static451.anInt7933;
			@Pc(140) int local140 = local38 + (local121 << 6) - Static470.anInt8063;
			local79.aBoolean47 = local71.aBoolean181;
			local79.aByteArray31[0] = Static99.aByteArray24[arg0];
			local79.aByte124 = local79.aByte125 = (byte) local111;
			if (Static471.method6782(local140, local131)) {
				local79.aByte125++;
			}
			local79.method424(local140, local131);
			local79.aBoolean44 = false;
			Static428.aClass85Array1[arg0] = null;
			return true;
		} else if (local8 == 1) {
			local33 = arg1.method6925(2);
			local38 = Static428.aClass85Array1[arg0].anInt2173;
			Static428.aClass85Array1[arg0].anInt2173 = ((local33 + (local38 >> 28) & 0x3) << 28) + (local38 & 0xFFFFFFF);
			return false;
		} else {
			@Pc(237) int local237;
			@Pc(242) int local242;
			@Pc(250) int local250;
			if (local8 != 2) {
				local33 = arg1.method6925(18);
				local38 = local33 >> 16;
				local237 = local33 >> 8 & 0xFF;
				local242 = local33 & 0xFF;
				local250 = Static428.aClass85Array1[arg0].anInt2173;
				local107 = (local250 >> 28) + local38 & 0x3;
				local111 = local237 + (local250 >> 14) & 0xFF;
				local117 = local242 + local250 & 0xFF;
				Static428.aClass85Array1[arg0].anInt2173 = (local107 << 28) + (local111 << 14) + local117;
				return false;
			}
			local33 = arg1.method6925(5);
			local38 = local33 >> 3;
			local237 = local33 & 0x7;
			local242 = Static428.aClass85Array1[arg0].anInt2173;
			local250 = local38 + (local242 >> 28) & 0x3;
			local107 = local242 >> 14 & 0xFF;
			local111 = local242 & 0xFF;
			if (local237 == 0) {
				local107--;
				local111--;
			}
			if (local237 == 1) {
				local111--;
			}
			if (local237 == 2) {
				local111--;
				local107++;
			}
			if (local237 == 3) {
				local107--;
			}
			if (local237 == 4) {
				local107++;
			}
			if (local237 == 5) {
				local111++;
				local107--;
			}
			if (local237 == 6) {
				local111++;
			}
			if (local237 == 7) {
				local107++;
				local111++;
			}
			Static428.aClass85Array1[arg0].anInt2173 = (local250 << 28) - (-(local107 << 14) - local111);
			return false;
		}
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(IZB)Lclient!vw;")
	public static Class11_Sub10 method8238(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(12) Class143[] local12 = Class44.aClass143Array1;
		synchronized (Class44.aClass143Array1) {
			@Pc(32) Class11_Sub10 local32;
			if (Class44.aClass143Array1.length <= arg0 || Class44.aClass143Array1[arg0].method3531()) {
				local32 = new Class11_Sub10();
				local32.aClass11_Sub7Array1 = new Class11_Sub7[arg0];
				for (@Pc(38) int local38 = 0; local38 < arg0; local38++) {
					local32.aClass11_Sub7Array1[local38] = new Class11_Sub7();
				}
			} else {
				local32 = (Class11_Sub10) Class44.aClass143Array1[arg0].method3532();
				local32.method8372();
				@Pc(71) int local71 = Static308.anIntArray383[arg0]--;
			}
			local32.aBoolean737 = arg1;
			return local32;
		}
	}

	@OriginalMember(owner = "client!vh", name = "b", descriptor = "(IBI)Z")
	public static boolean method8240(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static167.method3081(arg1, arg0) || Static461.method6714(arg1, arg0);
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(I[Lclient!dm;I)V")
	public static void method8241(@OriginalArg(1) Class78[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(6) Class78 local6 = arg0[local1];
			if (local6 != null) {
				if (local6.anInt1955 == 0) {
					if (local6.aClass78Array9 != null) {
						method8241(local6.aClass78Array9, arg1);
					}
					@Pc(30) Class2_Sub37 local30 = (Class2_Sub37) Static206.aClass222_14.method5468((long) local6.anInt1968);
					if (local30 != null) {
						Static446.method6622(arg1, local30.anInt6848);
					}
				}
				@Pc(48) Class2_Sub42 local48;
				if (arg1 == 0 && local6.anObjectArray14 != null) {
					local48 = new Class2_Sub42();
					local48.anObjectArray33 = local6.anObjectArray14;
					local48.aClass78_9 = local6;
					Static639.method8539(local48);
				}
				if (arg1 == 1 && local6.anObjectArray8 != null) {
					if (local6.anInt1978 >= 0) {
						@Pc(73) Class78 local73 = Static180.method3291(local6.anInt1968);
						if (local73 == null || local73.aClass78Array9 == null || local73.aClass78Array9.length <= local6.anInt1978 || local6 != local73.aClass78Array9[local6.anInt1978]) {
							continue;
						}
					}
					local48 = new Class2_Sub42();
					local48.aClass78_9 = local6;
					local48.anObjectArray33 = local6.anObjectArray8;
					Static639.method8539(local48);
				}
			}
		}
	}
}

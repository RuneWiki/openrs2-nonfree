import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static162 {

	@OriginalMember(owner = "client!fm", name = "f", descriptor = "Lclient!qk;")
	public static final Class288 aClass288_104 = new Class288(71, 4);

	@OriginalMember(owner = "client!fm", name = "g", descriptor = "[I")
	public static final int[] anIntArray195 = new int[3];

	@OriginalMember(owner = "client!fm", name = "h", descriptor = "Lclient!eaa;")
	public static final Class80 aClass80_2 = new Class80("LIVE", 0);

	@OriginalMember(owner = "client!fm", name = "i", descriptor = "I")
	public static int anInt2911 = 104;

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(IIIII)V")
	public static void method2431(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(6) Class2_Sub33 local6 = (Class2_Sub33) Static371.aClass109_36.method2325(); local6 != null; local6 = (Class2_Sub33) Static371.aClass109_36.method2318()) {
			Static375.method5055(local6, arg1, arg3, arg0, arg2);
		}
		@Pc(179) boolean local179;
		for (@Pc(31) Class2_Sub33 local31 = (Class2_Sub33) Static164.aClass109_27.method2325(); local31 != null; local31 = (Class2_Sub33) Static164.aClass109_27.method2318()) {
			@Pc(35) byte local35 = 1;
			@Pc(40) Class334 local40 = local31.aClass13_Sub1_Sub1_Sub1_Sub1_1.method3964();
			if (local31.aClass13_Sub1_Sub1_Sub1_Sub1_1.anInt4553 == -1 || local31.aClass13_Sub1_Sub1_Sub1_Sub1_1.aBoolean319) {
				local35 = 0;
			} else if (local31.aClass13_Sub1_Sub1_Sub1_Sub1_1.anInt4553 == local40.anInt8919 || local31.aClass13_Sub1_Sub1_Sub1_Sub1_1.anInt4553 == local40.anInt8931 || local40.anInt8945 == local31.aClass13_Sub1_Sub1_Sub1_Sub1_1.anInt4553 || local40.anInt8921 == local31.aClass13_Sub1_Sub1_Sub1_Sub1_1.anInt4553) {
				local35 = 2;
			} else if (local31.aClass13_Sub1_Sub1_Sub1_Sub1_1.anInt4553 == local40.anInt8943 || local40.anInt8913 == local31.aClass13_Sub1_Sub1_Sub1_Sub1_1.anInt4553 || local40.anInt8930 == local31.aClass13_Sub1_Sub1_Sub1_Sub1_1.anInt4553 || local40.anInt8926 == local31.aClass13_Sub1_Sub1_Sub1_Sub1_1.anInt4553) {
				local35 = 3;
			}
			if (local35 != local31.anInt5986) {
				@Pc(128) int local128 = Static15.method228(local31.aClass13_Sub1_Sub1_Sub1_Sub1_1);
				@Pc(132) Class150 local132 = local31.aClass13_Sub1_Sub1_Sub1_Sub1_1.aClass150_1;
				if (local132.anIntArray262 != null) {
					local132 = local132.method3196(Static431.aClass205_1);
				}
				if (local132 == null || local128 == -1) {
					local31.aBoolean433 = false;
					local31.anInt5976 = -1;
					local31.anInt5986 = local35;
				} else if (local31.anInt5976 == local128 && local132.aBoolean274 == local31.aBoolean433) {
					local31.anInt5986 = local35;
					local31.anInt5984 = local132.anInt3805;
				} else {
					local179 = false;
					if (local31.aClass2_Sub13_Sub2_3 == null) {
						local179 = true;
					} else {
						local31.anInt5984 -= 512;
						if (local31.anInt5984 <= 0) {
							Static586.aClass2_Sub13_Sub4_2.method7226(local31.aClass2_Sub13_Sub2_3);
							local179 = true;
							local31.aClass2_Sub13_Sub2_3 = null;
						}
					}
					if (local179) {
						local31.anInt5976 = local128;
						local31.anInt5986 = local35;
						local31.anInt5984 = local132.anInt3805;
						local31.aClass2_Sub39_2 = null;
						local31.aBoolean433 = local132.aBoolean274;
						local31.aClass2_Sub1_Sub1_3 = null;
					}
				}
			}
			local31.anInt5974 = local31.aClass13_Sub1_Sub1_Sub1_Sub1_1.anInt10090;
			local31.anInt5987 = local31.aClass13_Sub1_Sub1_Sub1_Sub1_1.anInt10090 + (local31.aClass13_Sub1_Sub1_Sub1_Sub1_1.method3950() << 8);
			local31.anInt5988 = local31.aClass13_Sub1_Sub1_Sub1_Sub1_1.anInt10089;
			local31.anInt5985 = local31.aClass13_Sub1_Sub1_Sub1_Sub1_1.anInt10089 + (local31.aClass13_Sub1_Sub1_Sub1_Sub1_1.method3950() << 8);
			Static375.method5055(local31, arg1, arg3, arg0, arg2);
		}
		for (@Pc(292) Class2_Sub33 local292 = (Class2_Sub33) Static221.aClass118_18.method2596(); local292 != null; local292 = (Class2_Sub33) Static221.aClass118_18.method2597()) {
			@Pc(296) byte local296 = 1;
			@Pc(301) Class334 local301 = local292.aClass13_Sub1_Sub1_Sub1_Sub2_2.method3964();
			if (local292.aClass13_Sub1_Sub1_Sub1_Sub2_2.anInt4553 == -1 || local292.aClass13_Sub1_Sub1_Sub1_Sub2_2.aBoolean319) {
				local296 = 0;
			} else if (local292.aClass13_Sub1_Sub1_Sub1_Sub2_2.anInt4553 == local301.anInt8919 || local292.aClass13_Sub1_Sub1_Sub1_Sub2_2.anInt4553 == local301.anInt8931 || local301.anInt8945 == local292.aClass13_Sub1_Sub1_Sub1_Sub2_2.anInt4553 || local292.aClass13_Sub1_Sub1_Sub1_Sub2_2.anInt4553 == local301.anInt8921) {
				local296 = 2;
			} else if (local292.aClass13_Sub1_Sub1_Sub1_Sub2_2.anInt4553 == local301.anInt8943 || local301.anInt8913 == local292.aClass13_Sub1_Sub1_Sub1_Sub2_2.anInt4553 || local301.anInt8930 == local292.aClass13_Sub1_Sub1_Sub1_Sub2_2.anInt4553 || local301.anInt8926 == local292.aClass13_Sub1_Sub1_Sub1_Sub2_2.anInt4553) {
				local296 = 3;
			}
			if (local292.anInt5986 != local296) {
				@Pc(397) int local397 = Static210.method2941(local292.aClass13_Sub1_Sub1_Sub1_Sub2_2);
				if (local292.anInt5976 == local397 && local292.aClass13_Sub1_Sub1_Sub1_Sub2_2.aBoolean324 == local292.aBoolean433) {
					local292.anInt5984 = local292.aClass13_Sub1_Sub1_Sub1_Sub2_2.anInt4642;
					local292.anInt5986 = local296;
				} else {
					local179 = false;
					if (local292.aClass2_Sub13_Sub2_3 == null) {
						local179 = true;
					} else {
						local292.anInt5984 -= 512;
						if (local292.anInt5984 <= 0) {
							Static586.aClass2_Sub13_Sub4_2.method7226(local292.aClass2_Sub13_Sub2_3);
							local292.aClass2_Sub13_Sub2_3 = null;
							local179 = true;
						}
					}
					if (local179) {
						local292.aClass2_Sub39_2 = null;
						local292.anInt5984 = local292.aClass13_Sub1_Sub1_Sub1_Sub2_2.anInt4642;
						local292.anInt5986 = local296;
						local292.anInt5976 = local397;
						local292.aBoolean433 = local292.aClass13_Sub1_Sub1_Sub1_Sub2_2.aBoolean324;
						local292.aClass2_Sub1_Sub1_3 = null;
					}
				}
			}
			local292.anInt5974 = local292.aClass13_Sub1_Sub1_Sub1_Sub2_2.anInt10090;
			local292.anInt5987 = local292.aClass13_Sub1_Sub1_Sub1_Sub2_2.anInt10090 + (local292.aClass13_Sub1_Sub1_Sub1_Sub2_2.method3950() << 8);
			local292.anInt5988 = local292.aClass13_Sub1_Sub1_Sub1_Sub2_2.anInt10089;
			local292.anInt5985 = local292.aClass13_Sub1_Sub1_Sub1_Sub2_2.anInt10089 + (local292.aClass13_Sub1_Sub1_Sub1_Sub2_2.method3950() << 8);
			Static375.method5055(local292, arg1, arg3, arg0, arg2);
		}
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(ILclient!vj;)Lclient!rg;")
	public static Class69_Sub1 method2433(@OriginalArg(1) Class2_Sub22 arg0) {
		@Pc(7) Class69 local7 = Static24.method447(arg0);
		@Pc(11) int local11 = arg0.method8546();
		@Pc(15) int local15 = arg0.method8546();
		@Pc(19) int local19 = arg0.method8546();
		@Pc(23) int local23 = arg0.method8546();
		@Pc(27) int local27 = arg0.method8546();
		@Pc(39) int local39 = arg0.method8546();
		return new Class69_Sub1(local7.aClass361_10, local7.aClass306_13, local7.anInt9605, local7.anInt9611, local7.anInt9616, local7.anInt9604, local7.anInt9610, local7.anInt9613, local7.anInt9612, local11, local15, local19, local23, local27, local39);
	}
}

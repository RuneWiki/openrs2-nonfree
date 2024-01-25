import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static305 {

	@OriginalMember(owner = "client!kg", name = "t", descriptor = "I")
	public static int anInt5571;

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "Lclient!vl;")
	public static final Class376 aClass376_76 = new Class376(18, -1);

	@OriginalMember(owner = "client!kg", name = "x", descriptor = "Lclient!pja;")
	public static final Class279 aClass279_28 = new Class279(8);

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method4695(@OriginalArg(1) String arg0) {
		return Static105.method2041(arg0, 10);
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(Lclient!hk;IIZII)Lclient!vq;")
	public static Class39_Sub4_Sub1 method4696(@OriginalArg(0) Class16_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg0.aBoolean314 || Static9.method94(arg2) && Static9.method94(arg1)) {
			return new Class39_Sub4_Sub1(arg0, 3553, arg3, arg4, arg2, arg1, true);
		} else if (arg0.aBoolean318) {
			return new Class39_Sub4_Sub1(arg0, 34037, arg3, arg4, arg2, arg1, true);
		} else {
			return new Class39_Sub4_Sub1(arg0, arg3, arg4, arg2, arg1, Static527.method7377(arg2), Static527.method7377(arg1), true);
		}
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "([IZILclient!wda;)V")
	public static void method4698(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class23_Sub2_Sub1_Sub2_Sub2 arg2) {
		@Pc(6) boolean local6;
		@Pc(8) int local8;
		if (arg2.anIntArray651 != null) {
			local6 = true;
			for (local8 = 0; local8 < arg2.anIntArray651.length; local8++) {
				if (arg2.anIntArray651[local8] != arg0[local8]) {
					local6 = false;
					break;
				}
			}
			if (local6 && arg2.anInt10135 != -1) {
				@Pc(45) Class48 local45 = Static483.aClass373_2.method8323(arg2.anInt10135);
				@Pc(48) int local48 = local45.anInt1546;
				if (local48 == 1) {
					arg2.anInt10149 = 0;
					arg2.anInt10143 = 1;
					arg2.anInt10163 = 0;
					arg2.anInt10186 = arg1;
					arg2.anInt10140 = 0;
					if (!arg2.aBoolean747) {
						Static4.method49(arg2, local45, arg2.anInt10163);
					}
				}
				if (local48 == 2) {
					arg2.anInt10149 = 0;
				}
			}
		}
		local6 = true;
		for (local8 = 0; local8 < arg0.length; local8++) {
			if (arg0[local8] != -1) {
				local6 = false;
			}
			if (arg2.anIntArray651 == null || arg2.anIntArray651[local8] == -1 || Static483.aClass373_2.method8323(arg0[local8]).anInt1550 >= Static483.aClass373_2.method8323(arg2.anIntArray651[local8]).anInt1550) {
				arg2.anIntArray651 = arg0;
				arg2.anInt10189 = arg2.anInt10190;
				arg2.anInt10186 = arg1;
			}
		}
		if (local6) {
			arg2.anIntArray651 = arg0;
			arg2.anInt10186 = arg1;
			arg2.anInt10189 = arg2.anInt10190;
		}
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(B)V")
	public static void method4699() {
		if (Static111.anInt10350 == 0) {
			return;
		}
		try {
			if (++Static99.anInt2127 > 2000) {
				if (Static673.aClass160_3 != null) {
					Static673.aClass160_3.method3506();
					Static673.aClass160_3 = null;
				}
				if (Static30.anInt915 >= 2) {
					Static111.anInt10350 = 0;
					Static312.anInt5782 = -5;
					return;
				}
				Static368.aClass161_4.method3709();
				Static111.anInt10350 = 1;
				Static99.anInt2127 = 0;
				Static30.anInt915++;
			}
			if (Static111.anInt10350 == 1) {
				Static112.aClass129_4 = Static368.aClass161_4.method3706(Static499.aClass231_4);
				Static111.anInt10350 = 2;
			}
			if (Static111.anInt10350 == 2) {
				if (Static112.aClass129_4.anInt3299 == 2) {
					throw new IOException();
				}
				if (Static112.aClass129_4.anInt3299 != 1) {
					return;
				}
				Static673.aClass160_3 = Static437.method6389((Socket) Static112.aClass129_4.anObject7);
				Static112.aClass129_4 = null;
				Static73.method1618();
				Static111.anInt10350 = 4;
			}
			if (Static111.anInt10350 == 4 && Static673.aClass160_3.method3510(1)) {
				Static673.aClass160_3.method3511(1, Static67.aClass3_Sub17_Sub2_4.aByteArray59, 0);
				@Pc(118) int local118 = Static67.aClass3_Sub17_Sub2_4.aByteArray59[0] & 0xFF;
				Static111.anInt10350 = 0;
				Static312.anInt5782 = local118;
				Static673.aClass160_3.method3506();
				Static673.aClass160_3 = null;
			}
		} catch (@Pc(129) IOException local129) {
			if (Static673.aClass160_3 != null) {
				Static673.aClass160_3.method3506();
				Static673.aClass160_3 = null;
			}
			if (Static30.anInt915 >= 2) {
				Static312.anInt5782 = -4;
				Static111.anInt10350 = 0;
			} else {
				Static368.aClass161_4.method3709();
				Static111.anInt10350 = 1;
				Static99.anInt2127 = 0;
				Static30.anInt915++;
			}
		}
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(IB)Z")
	public static boolean method4700(@OriginalArg(0) int arg0) {
		return arg0 == 4 || arg0 == 8 || arg0 == 11;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(Lclient!hga;I)V")
	public static void method4702(@OriginalArg(0) Class23_Sub6 arg0) {
		arg0.aClass23_Sub2_10 = null;
		@Pc(12) int local12 = arg0.aClass23_Sub4Array1.length;
		for (@Pc(14) int local14 = 0; local14 < local12; local14++) {
			arg0.aClass23_Sub4Array1[local14].aBoolean206 = false;
		}
		@Pc(37) Class105[] local37 = Class328.aClass105Array1;
		synchronized (Class328.aClass105Array1) {
			if (local12 < Class328.aClass105Array1.length && Static176.anIntArray230[local12] < 200) {
				Class328.aClass105Array1[local12].method2447(arg0);
				@Pc(60) int local60 = Static176.anIntArray230[local12]++;
			}
		}
	}
}

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static289 {

	@OriginalMember(owner = "client!si", name = "c", descriptor = "[S")
	public static final short[] aShortArray90 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!si", name = "d", descriptor = "I")
	public static int anInt5643 = 0;

	@OriginalMember(owner = "client!si", name = "f", descriptor = "I")
	public static int anInt5645 = -1;

	@OriginalMember(owner = "client!si", name = "i", descriptor = "[[I")
	public static final int[][] anIntArrayArray157 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(Lclient!lf;Z)V")
	public static void method4869(@OriginalArg(0) Class4_Sub11 arg0) {
		@Pc(8) byte[] local8 = new byte[24];
		if (Static183.aClass205_1 != null) {
			@Pc(20) int local20;
			try {
				Static183.aClass205_1.method5309(0L);
				Static183.aClass205_1.method5315(local8);
				for (local20 = 0; local20 < 24 && local8[local20] == 0; local20++) {
				}
				if (local20 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(45) Exception local45) {
				for (local20 = 0; local20 < 24; local20++) {
					local8[local20] = -1;
				}
			}
		}
		arg0.method3424(24, local8);
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(I)V")
	public static void method4870() {
		@Pc(5) Class198 local5 = Static245.aClass198_178;
		synchronized (Static245.aClass198_178) {
			Static245.aClass198_178.method5213();
		}
	}

	@OriginalMember(owner = "client!si", name = "c", descriptor = "(I)V")
	public static void method4872() {
		Static40.aClass198_39.method5213();
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(JIIILjava/lang/String;IZZZILjava/lang/String;)V")
	public static void method4873(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) boolean arg8, @OriginalArg(10) String arg9) {
		@Pc(8) int[] local8 = new int[4];
		for (@Pc(10) int local10 = 0; local10 < 3; local10++) {
			local8[local10] = (int) (Math.random() * 9.9999999E7D);
		}
		@Pc(30) Class4_Sub11 local30 = new Class4_Sub11(128);
		local30.method3434(10);
		local30.method3402((arg8 ? 4 : 0) | (arg6 ? 2 : 0) | (arg7 ? 1 : 0));
		local30.method3435(arg0);
		local30.method3452(local8[0]);
		local30.method3410(arg9);
		local30.method3452(local8[1]);
		local30.method3402(Static182.anInt3853);
		local30.method3434(arg3);
		local30.method3434(arg5);
		local30.method3452(local8[2]);
		local30.method3402(arg1);
		local30.method3402(arg2);
		local30.method3452(local8[3]);
		local30.method3436(Static251.aBigInteger1, Static316.aBigInteger2);
		@Pc(116) Class4_Sub11 local116 = new Class4_Sub11(350);
		local116.method3410(arg4);
		@Pc(129) int local129 = 8 - Static294.method4905(arg4) % 8;
		for (@Pc(136) int local136 = 0; local136 < local129; local136++) {
			local116.method3434((int) (Math.random() * 255.0D));
		}
		local116.method3454(local8);
		Static15.aClass4_Sub11_Sub1_2.anInt3768 = 0;
		Static15.aClass4_Sub11_Sub1_2.method3434(22);
		Static15.aClass4_Sub11_Sub1_2.method3402(local30.anInt3768 + local116.anInt3768 + 2);
		Static15.aClass4_Sub11_Sub1_2.method3402(566);
		Static15.aClass4_Sub11_Sub1_2.method3424(local30.anInt3768, local30.aByteArray55);
		Static15.aClass4_Sub11_Sub1_2.method3424(local116.anInt3768, local116.aByteArray55);
		Static288.anInt5640 = -3;
		Static166.anInt3583 = 0;
		Static122.anInt2882 = 0;
		Static222.anInt4518 = 1;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(ZLjava/lang/String;Ljava/lang/Throwable;)V")
	public static void method4874(@OriginalArg(1) String arg0, @OriginalArg(2) Throwable arg1) {
		try {
			@Pc(7) String local7 = "";
			if (arg1 != null) {
				local7 = Static191.method3635(arg1);
			}
			if (arg0 != null) {
				if (arg1 != null) {
					local7 = local7 + " | ";
				}
				local7 = local7 + arg0;
			}
			Static184.method3526(local7);
			local7 = Static275.method4715(":", "%3a", local7);
			local7 = Static275.method4715("@", "%40", local7);
			local7 = Static275.method4715("&", "%26", local7);
			local7 = Static275.method4715("#", "%23", local7);
			if (Static230.aClass134_8.anApplet1 != null) {
				@Pc(104) Class185 local104 = Static230.aClass134_8.method3765(new URL(Static230.aClass134_8.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static347.anInt6580 + "&u=" + Static81.aLong63 + "&v1=" + Static200.aString38 + "&v2=" + Static200.aString39 + "&e=" + local7));
				while (local104.anInt5682 == 0) {
					Static249.method4396(1L);
				}
				if (local104.anInt5682 == 1) {
					@Pc(123) DataInputStream local123 = (DataInputStream) local104.anObject4;
					local123.read();
					local123.close();
				}
			}
		} catch (@Pc(130) Exception local130) {
		}
	}
}

import java.io.IOException;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static82 {

	@OriginalMember(owner = "client!eg", name = "K", descriptor = "[C")
	public static final char[] aCharArray4 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!eg", name = "O", descriptor = "[J")
	public static final long[] aLongArray2 = new long[100];

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIIIIZI)V")
	public static void method1361(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(8) Class62 local8 = Static80.method1338(arg3, arg4);
		if (local8 == null) {
			return;
		}
		if (local8.anObjectArray24 != null) {
			@Pc(18) Class3_Sub23 local18 = new Class3_Sub23();
			local18.anObjectArray31 = local8.anObjectArray24;
			local18.aClass62_11 = local8;
			Static124.method2006(local18);
		}
		Static103.anInt2047 = arg1;
		Static109.anInt2149 = local8.anInt1549;
		Static122.anInt2309 = arg2;
		Static13.anInt5215 = arg5;
		Static127.anInt2413 = arg4;
		Static242.anInt4268 = arg3;
		Static158.anInt2845 = arg0;
		Static68.aBoolean81 = true;
		Static158.method2441(local8);
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(IB)[B")
	public static byte[] method1362(@OriginalArg(0) int arg0) {
		@Pc(17) Class3_Sub7_Sub1 local17 = (Class3_Sub7_Sub1) Static28.aClass21_2.method261((long) arg0);
		if (local17 == null) {
			@Pc(22) byte[] local22 = new byte[512];
			@Pc(28) Random local28 = new Random((long) arg0);
			for (@Pc(30) int local30 = 0; local30 < 255; local30++) {
				local22[local30] = (byte) local30;
			}
			for (@Pc(45) int local45 = 0; local45 < 255; local45++) {
				@Pc(51) int local51 = 255 - local45;
				@Pc(56) int local56 = Static213.method3319(local28, local51);
				@Pc(60) byte local60 = local22[local56];
				local22[local56] = local22[local51];
				local22[local51] = local22[511 - local45] = local60;
			}
			local17 = new Class3_Sub7_Sub1(local22);
			Static28.aClass21_2.method259((long) arg0, local17);
		}
		return local17.aByteArray24;
	}

	@OriginalMember(owner = "client!eg", name = "b", descriptor = "(Z)V")
	public static void method1363() {
		Static247.aClass58_1 = new Class58(8);
		Static258.anInt4640 = 0;
		for (@Pc(17) Class12_Sub4 local17 = (Class12_Sub4) Static156.aClass22_5.method291(); local17 != null; local17 = (Class12_Sub4) Static156.aClass22_5.method292()) {
			local17.method1802();
		}
	}

	@OriginalMember(owner = "client!eg", name = "c", descriptor = "(I)V")
	public static void method1364() {
		@Pc(7) Class106 local7 = null;
		try {
			@Pc(16) Class133 local16 = Static61.aClass156_1.method3645();
			while (local16.anInt3257 == 0) {
				Static37.method613(1L);
			}
			if (local16.anInt3257 == 1) {
				local7 = (Class106) local16.anObject3;
				@Pc(42) byte[] local42 = new byte[(int) local7.method2292()];
				@Pc(57) int local57;
				for (@Pc(44) int local44 = 0; local44 < local42.length; local44 += local57) {
					local57 = local7.method2288(local42.length - local44, local44, local42);
					if (local57 == -1) {
						throw new IOException("EOF");
					}
				}
				Static66.method1124(new Class3_Sub5(local42));
			}
		} catch (@Pc(81) Exception local81) {
		}
		try {
			if (local7 != null) {
				local7.method2290();
			}
		} catch (@Pc(88) Exception local88) {
		}
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(B[B)Z")
	public static boolean method1366(@OriginalArg(1) byte[] arg0) {
		@Pc(8) Class3_Sub5 local8 = new Class3_Sub5(arg0);
		@Pc(12) int local12 = local8.method2739();
		if (local12 != 1) {
			return false;
		}
		@Pc(28) boolean local28 = local8.method2739() == 1;
		if (local28) {
			Static107.method4303(local8);
		}
		Static240.method4951(local8);
		return true;
	}
}

import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static74 {

	@OriginalMember(owner = "client!ek", name = "w", descriptor = "Z")
	public static boolean aBoolean141 = false;

	@OriginalMember(owner = "client!ek", name = "F", descriptor = "I")
	public static int anInt1848 = 0;

	@OriginalMember(owner = "client!ek", name = "G", descriptor = "Ljava/lang/String;")
	public static String aString136 = "";

	@OriginalMember(owner = "client!ek", name = "L", descriptor = "[Lclient!ap;")
	public static final Class7_Sub3[] aClass7_Sub3Array1 = new Class7_Sub3[2048];

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIIIBI)V")
	public static void method1481(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(16) int local16 = (arg2 - 32) * arg2 / arg3;
		if (local16 < 8) {
			local16 = 8;
		}
		@Pc(33) int local33 = arg1 * (arg2 - local16 - 32) / (arg3 - arg2);
		Static264.aClass52Array14[0].method4123(arg4, arg0);
		Static264.aClass52Array14[1].method4123(arg4, arg2 + arg0 - 16);
		Static128.aClass89_3.method5477(arg0 + 16, arg4, arg2 - 32, 16, Static336.anInt4177);
		Static128.aClass89_3.method5477(local33 + arg0 + 16, arg4, local16, 16, Static329.anInt6213);
		Static128.aClass89_3.method5415(Static309.anInt5901, arg4, local16, arg0 + local33 + 16);
		Static128.aClass89_3.method5415(Static309.anInt5901, arg4 + 1, local16, arg0 + local33 + 16);
		Static128.aClass89_3.method5448(arg4, 16, arg0 + local33 + 16, Static309.anInt5901);
		Static128.aClass89_3.method5448(arg4, 16, local33 + arg0 + 17, Static309.anInt5901);
		Static128.aClass89_3.method5415(Static10.anInt185, arg4 + 15, local16, local33 + arg0 + 16);
		Static128.aClass89_3.method5415(Static10.anInt185, arg4 + 14, local16 - 1, local33 + arg0 + 17);
		Static128.aClass89_3.method5448(arg4, 16, local16 + arg0 + local33 + 15, Static10.anInt185);
		Static128.aClass89_3.method5448(arg4 + 1, 15, local16 + arg0 + local33 + 14, Static10.anInt185);
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "([BIII)Ljava/lang/String;")
	public static String method1483(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(11) char[] local11 = new char[arg1];
		@Pc(13) int local13 = 0;
		for (@Pc(15) int local15 = 0; local15 < arg1; local15++) {
			@Pc(24) int local24 = arg0[arg2 + local15] & 0xFF;
			if (local24 != 0) {
				if (local24 >= 128 && local24 < 160) {
					@Pc(43) char local43 = Static36.aCharArray1[local24 - 128];
					if (local43 == '\u0000') {
						local43 = '?';
					}
					local24 = local43;
				}
				local11[local13++] = (char) local24;
			}
		}
		return new String(local11, 0, local13);
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(III)V")
	public static void method1484(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static212.anIntArray579[arg0] = arg1;
		@Pc(18) Class7_Sub12 local18 = (Class7_Sub12) Static118.aClass10_52.method163((long) arg0);
		if (local18 == null) {
			local18 = new Class7_Sub12(Static335.method5308() + 500L);
			Static118.aClass10_52.method161((long) arg0, local18);
		} else {
			local18.aLong93 = Static335.method5308() + 500L;
		}
	}

	@OriginalMember(owner = "client!ek", name = "e", descriptor = "(I)V")
	public static void method1487() {
		Static89.anImage1 = null;
		Static6.aFont1 = null;
	}

	@OriginalMember(owner = "client!ek", name = "f", descriptor = "(I)V")
	public static void method1488() {
		Static34.aClass89_1.method5456(((float) Static289.anInt2339 * 0.1F + 0.7F) * 1.1523438F);
		Static34.aClass89_1.method5462(Static221.anInt4406, 0.69921875F, 1.2F, -50.0F, -60.0F, -50.0F);
		Static34.aClass89_1.method5479(Static48.anInt5547, -1);
		Static34.aClass89_1.method5396(Static178.aClass17_4);
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
	public static String method1489(@OriginalArg(0) String arg0) {
		@Pc(14) String local14 = Static110.method2130(Static199.method3568(arg0));
		if (local14 == null) {
			local14 = "";
		}
		return local14;
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(Lclient!rk;ILclient!pg;)V")
	public static void method1490(@OriginalArg(0) Class180 arg0, @OriginalArg(2) Interface6 arg1) {
		Static12.anInterface6_1 = arg1;
		Static122.aClass180_32 = arg0;
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(BI)[B")
	public static byte[] method1491(@OriginalArg(1) int arg0) {
		@Pc(10) Class7_Sub1_Sub19 local10 = (Class7_Sub1_Sub19) Static271.aClass154_7.method4079((long) arg0);
		if (local10 == null) {
			@Pc(24) byte[] local24 = new byte[512];
			@Pc(30) Random local30 = new Random((long) arg0);
			for (@Pc(32) int local32 = 0; local32 < 255; local32++) {
				local24[local32] = (byte) local32;
			}
			for (@Pc(46) int local46 = 0; local46 < 255; local46++) {
				@Pc(52) int local52 = 255 - local46;
				@Pc(57) int local57 = Static350.method5618(local52, local30);
				@Pc(61) byte local61 = local24[local57];
				local24[local57] = local24[local52];
				local24[local52] = local24[511 - local46] = local61;
			}
			local10 = new Class7_Sub1_Sub19(local24);
			Static271.aClass154_7.method4078(local10, (long) arg0);
		}
		return local10.aByteArray91;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static46 {

	@OriginalMember(owner = "client!dg", name = "e", descriptor = "Lclient!th;")
	public static Class168 aClass168_36;

	@OriginalMember(owner = "client!dg", name = "g", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray1;

	@OriginalMember(owner = "client!dg", name = "l", descriptor = "I")
	public static int anInt1110;

	@OriginalMember(owner = "client!dg", name = "f", descriptor = "Lclient!jl;")
	public static Class89 aClass89_7 = new Class89(4);

	@OriginalMember(owner = "client!dg", name = "h", descriptor = "Lclient!jl;")
	public static Class89 aClass89_8 = new Class89(500);

	@OriginalMember(owner = "client!dg", name = "i", descriptor = "I")
	public static int anInt1108 = -1;

	@OriginalMember(owner = "client!dg", name = "j", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray10 = null;

	@OriginalMember(owner = "client!dg", name = "k", descriptor = "I")
	public static int anInt1109 = 0;

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IZ)V")
	public static void method920(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			Static62.method1110();
		} else if (arg0 == 2) {
			Static232.method3680();
		} else if (arg0 == 3) {
			Static89.method4589();
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(Z)Lclient!im;")
	public static Class80_Sub1 method922() {
		Static130.anInt2862 = 0;
		return Static158.method1924();
	}

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "(I)I")
	public static int method923() {
		if ((double) Static268.aFloat35 == 3.0D) {
			return 37;
		} else if ((double) Static268.aFloat35 == 4.0D) {
			return 50;
		} else if ((double) Static268.aFloat35 == 6.0D) {
			return 75;
		} else if ((double) Static268.aFloat35 == 8.0D) {
			return 100;
		} else {
			return 200;
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(II)[B")
	public static synchronized byte[] method924(@OriginalArg(1) int arg0) {
		@Pc(24) byte[] local24;
		if (arg0 == 100 && Static165.anInt3672 > 0) {
			local24 = Static205.aByteArrayArray15[--Static165.anInt3672];
			Static205.aByteArrayArray15[Static165.anInt3672] = null;
			return local24;
		} else if (arg0 == 5000 && Static178.anInt3937 > 0) {
			local24 = Static184.aByteArrayArray14[--Static178.anInt3937];
			Static184.aByteArrayArray14[Static178.anInt3937] = null;
			return local24;
		} else if (arg0 == 30000 && Static120.anInt6250 > 0) {
			local24 = Static48.aByteArrayArray8[--Static120.anInt6250];
			Static48.aByteArrayArray8[Static120.anInt6250] = null;
			return local24;
		} else {
			return new byte[arg0];
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(III)Lclient!aj;")
	public static Class7 method925(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 < 0 || arg1 >= Static90.anInt2091 || arg2 < 0 || arg2 >= Static77.anInt1766) {
			return null;
		}
		@Pc(19) Class1_Sub2 local19 = Static7.aClass1_Sub2ArrayArrayArray1[arg0][arg1][arg2];
		if (local19 == null) {
			return null;
		}
		@Pc(25) Class7 local25 = null;
		@Pc(27) int local27 = -1;
		@Pc(29) int local29 = -1;
		for (@Pc(31) int local31 = 0; local31 < local19.anInt45; local31++) {
			@Pc(40) Class7 local40 = local19.aClass7Array1[local31];
			if ((local40.aLong7 >> 29 & 0x3L) <= 1L && local40.anInt214 == arg1 && local40.anInt220 == arg2 && (local40.anInt218 > local27 || local40.anInt212 > local29)) {
				local25 = local40;
				local27 = local40.anInt218;
				local29 = local40.anInt212;
			}
		}
		return local25;
	}
}

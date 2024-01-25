import jaggl.OpenGL;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static29 {

	@OriginalMember(owner = "client!bba", name = "A", descriptor = "Lclient!kda;")
	public static final Class185 aClass185_1 = new Class185();

	@OriginalMember(owner = "client!bba", name = "F", descriptor = "I")
	public static int anInt423 = 0;

	@OriginalMember(owner = "client!bba", name = "G", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray4 = new String[100];

	@OriginalMember(owner = "client!bba", name = "H", descriptor = "Lclient!dg;")
	public static final Class70 aClass70_7 = new Class70(81, 2);

	@OriginalMember(owner = "client!bba", name = "I", descriptor = "I")
	public static int anInt424 = 2;

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(III)Lclient!fea;")
	public static Class8_Sub3_Sub2 method345(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class39 local7 = Static292.aClass39ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass8_Sub3_Sub2_2;
	}

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(ZII)Z")
	public static boolean method347(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "([BZB)V")
	public static void method349(@OriginalArg(0) byte[] arg0, @OriginalArg(1) boolean arg1) {
		if (Static260.aClass1_Sub35_4 == null) {
			Static260.aClass1_Sub35_4 = new Class1_Sub35(20000);
		}
		Static260.aClass1_Sub35_4.method5781(arg0.length, arg0);
		if (!arg1) {
			return;
		}
		Static457.method6300(Static260.aClass1_Sub35_4.aByteArray85);
		Static436.aClass317_Sub1Array2 = new Class317_Sub1[Static173.anInt3032];
		@Pc(39) int local39 = 0;
		for (@Pc(41) int local41 = Static594.anInt9650; local41 <= Static214.anInt4119; local41++) {
			@Pc(47) Class317_Sub1 local47 = Static166.method2391(local41);
			if (local47 != null) {
				Static436.aClass317_Sub1Array2[local39++] = local47;
			}
		}
		Static315.aBoolean433 = false;
		Static448.aLong238 = Static413.method5668();
		Static260.aClass1_Sub35_4 = null;
	}

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(ILclient!fa;Ljava/awt/Canvas;ILclient!pu;)Lclient!r;")
	public static Class134 method350(@OriginalArg(1) Interface7 arg0, @OriginalArg(2) Canvas arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class270 arg3) {
		if (!Static537.method7347()) {
			throw new RuntimeException("");
		} else if (Static342.method4694("jaggl")) {
			@Pc(24) OpenGL local24 = new OpenGL();
			@Pc(34) long local34 = local24.init(arg1, 8, 8, 8, 24, 0, arg2);
			if (local34 == 0L) {
				throw new RuntimeException("");
			}
			@Pc(53) Class134_Sub1_Sub1 local53 = new Class134_Sub1_Sub1(local24, arg1, local34, arg0, arg3, arg2);
			local53.method6741();
			return local53;
		} else {
			throw new RuntimeException("");
		}
	}
}

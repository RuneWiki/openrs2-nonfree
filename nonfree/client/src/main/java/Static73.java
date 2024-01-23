import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static73 {

	@OriginalMember(owner = "client!f", name = "J", descriptor = "Lclient!rg;")
	public static Class151 aClass151_1;

	@OriginalMember(owner = "client!f", name = "vb", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame1;

	@OriginalMember(owner = "client!f", name = "Jb", descriptor = "[[S")
	public static short[][] aShortArrayArray5;

	@OriginalMember(owner = "client!f", name = "Mb", descriptor = "I")
	public static int anInt1379;

	@OriginalMember(owner = "client!f", name = "Z", descriptor = "[I")
	public static int[] anIntArray134 = new int[100];

	@OriginalMember(owner = "client!f", name = "zb", descriptor = "[I")
	public static int[] anIntArray136 = new int[1000];

	@OriginalMember(owner = "client!f", name = "Cb", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray13 = new String[500];

	@OriginalMember(owner = "client!f", name = "Fb", descriptor = "Z")
	public static boolean aBoolean123 = false;

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IB)I")
	public static int method1109(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!f", name = "b", descriptor = "(I)V")
	public static void method1116() {
		Static138.anInt2664++;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(I[I[Ljava/lang/Object;II)V")
	public static void method1117(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Object[] arg2, @OriginalArg(4) int arg3) {
		if (arg3 <= arg0) {
			return;
		}
		@Pc(23) int local23 = (arg0 + arg3) / 2;
		@Pc(27) int local27 = arg1[local23];
		arg1[local23] = arg1[arg3];
		arg1[arg3] = local27;
		@Pc(41) Object local41 = arg2[local23];
		arg2[local23] = arg2[arg3];
		arg2[arg3] = local41;
		@Pc(53) int local53 = arg0;
		for (@Pc(55) int local55 = arg0; local55 < arg3; local55++) {
			if ((local55 & 0x1) + local27 > arg1[local55]) {
				@Pc(76) int local76 = arg1[local55];
				arg1[local55] = arg1[local53];
				arg1[local53] = local76;
				@Pc(90) Object local90 = arg2[local55];
				arg2[local55] = arg2[local53];
				arg2[local53++] = local90;
			}
		}
		arg1[arg3] = arg1[local53];
		arg1[local53] = local27;
		arg2[arg3] = arg2[local53];
		arg2[local53] = local41;
		method1117(arg0, arg1, arg2, local53 - 1);
		method1117(local53 + 1, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!f", name = "e", descriptor = "(I)V")
	public static void method1126() {
		Static11.anInt5178 = 0;
		Static192.anInt3770 = 0;
		Static178.method2938();
		Static153.method2574();
		Static20.method319();
		Static70.method1061();
		@Pc(27) int local27;
		for (local27 = 0; local27 < Static192.anInt3770; local27++) {
			@Pc(34) int local34 = Static103.anIntArray192[local27];
			if (Static52.aClass10_Sub5_Sub1Array1[local34].anInt5095 != Static124.anInt2371) {
				if (Static52.aClass10_Sub5_Sub1Array1[local34].anInt3587 > 0) {
					Static50.method787(local34, Static52.aClass10_Sub5_Sub1Array1[local34]);
				}
				Static52.aClass10_Sub5_Sub1Array1[local34] = null;
			}
		}
		if (Static249.aClass3_Sub26_Sub1_3.anInt4615 != Static287.anInt5742) {
			throw new RuntimeException("gpp1 pos:" + Static249.aClass3_Sub26_Sub1_3.anInt4615 + " psize:" + Static287.anInt5742);
		}
		for (local27 = 0; local27 < Static152.anInt2869; local27++) {
			if (Static52.aClass10_Sub5_Sub1Array1[Static102.anIntArray188[local27]] == null) {
				throw new RuntimeException("gpp2 pos:" + local27 + " size:" + Static152.anInt2869);
			}
		}
	}
}

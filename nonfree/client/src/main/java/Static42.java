import java.awt.Frame;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static42 {

	@OriginalMember(owner = "client!db", name = "hb", descriptor = "Lclient!hc;")
	public static Class51 aClass51_15;

	@OriginalMember(owner = "client!db", name = "kb", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame1;

	@OriginalMember(owner = "client!db", name = "mb", descriptor = "Lclient!hc;")
	public static Class51 aClass51_16;

	@OriginalMember(owner = "client!db", name = "ob", descriptor = "Lclient!se;")
	public static Class122 aClass122_3;

	@OriginalMember(owner = "client!db", name = "pb", descriptor = "I")
	public static int anInt1193;

	@OriginalMember(owner = "client!db", name = "fb", descriptor = "I")
	public static int anInt1188 = 500;

	@OriginalMember(owner = "client!db", name = "jb", descriptor = "[Lclient!s;")
	public static Class115_Sub1[] aClass115_Sub1Array1 = new Class115_Sub1[0];

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(ILclient!d;)V")
	public static void method788(@OriginalArg(1) Class28 arg0) {
		Static148.anInt398 = 3;
		@Pc(9) Class129 local9 = null;
		Static262.method4182(true);
		Static153.anInt3692 = 2;
		Static174.aBoolean197 = true;
		Static249.aBoolean270 = true;
		Static26.anInt701 = 0;
		Static47.anInt1385 = 127;
		Static44.anInt1342 = 0;
		Static106.anInt2847 = 255;
		Static63.aBoolean96 = true;
		Static3.aBoolean3 = true;
		Static237.anInt5140 = 127;
		Static19.aBoolean37 = true;
		Static182.anInt4168 = 0;
		Static210.aBoolean226 = true;
		Static66.anInt1836 = 0;
		Static183.aBoolean263 = true;
		Static69.aBoolean106 = true;
		Static140.aBoolean181 = true;
		Static109.aBoolean156 = true;
		Static132.aBoolean175 = true;
		if (Static169.anInt3959 < 96) {
			Static163.method2836(0);
		} else {
			Static163.method2836(2);
		}
		Static188.aBoolean205 = true;
		Static216.anInt4750 = 0;
		Static138.aBoolean180 = false;
		Static87.aBoolean135 = false;
		Static25.aBoolean44 = false;
		Static57.anInt1587 = 0;
		Static164.anInt3852 = 0;
		try {
			@Pc(83) Class145 local83 = arg0.method716("runescape");
			while (local83.anInt5354 == 0) {
				Static30.method587(1L);
			}
			if (local83.anInt5354 == 1) {
				local9 = (Class129) local83.anObject7;
				@Pc(108) int local108 = 0;
				@Pc(114) byte[] local114 = new byte[(int) local9.method3876()];
				while (local108 < local114.length) {
					@Pc(126) int local126 = local9.method3873(local114.length - local108, local108, local114);
					if (local126 == -1) {
						throw new IOException("EOF");
					}
					local108 += local126;
				}
				Static20.method400(new Class1_Sub13(local114));
			}
		} catch (@Pc(151) Exception local151) {
		}
		try {
			if (local9 != null) {
				local9.method3875();
			}
		} catch (@Pc(158) Exception local158) {
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "([Ljava/lang/String;B[S)V")
	public static void method789(@OriginalArg(0) String[] arg0, @OriginalArg(2) short[] arg1) {
		Static74.method1458(arg0, arg0.length - 1, 0, arg1);
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(JB)Ljava/lang/String;")
	public static String method790(@OriginalArg(0) long arg0) {
		return Static251.method4070(arg0);
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "()V")
	public static void method791() {
		for (@Pc(1) int local1 = 0; local1 < Static11.anInt496; local1++) {
			@Pc(6) Class47 local6 = Static145.aClass47Array2[local1];
			Static155.method2760(local6);
			Static145.aClass47Array2[local1] = null;
		}
		Static11.anInt496 = 0;
	}
}

import java.awt.Component;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static259 {

	@OriginalMember(owner = "client!tl", name = "J", descriptor = "I")
	public static int anInt5231;

	@OriginalMember(owner = "client!tl", name = "Q", descriptor = "I")
	public static int anInt5236;

	@OriginalMember(owner = "client!tl", name = "S", descriptor = "Lclient!eg;")
	public static Interface3 anInterface3_1;

	@OriginalMember(owner = "client!tl", name = "L", descriptor = "Z")
	public static boolean aBoolean402 = false;

	@OriginalMember(owner = "client!tl", name = "M", descriptor = "I")
	public static int anInt5233 = 255;

	@OriginalMember(owner = "client!tl", name = "P", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray29 = new String[100];

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(Ljava/awt/Component;III)Lclient!si;")
	public static Class23 method4017(@OriginalArg(0) Component arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(6) Class local6 = Class.forName("Class23_Sub1");
			@Pc(10) Class23 local10 = (Class23) local6.getDeclaredConstructor().newInstance();
			local10.method1010(arg0, arg1, arg2);
			return local10;
		} catch (@Pc(27) Throwable local27) {
			@Pc(31) Class23_Sub2 local31 = new Class23_Sub2();
			local31.method1010(arg0, arg1, arg2);
			return local31;
		}
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(ILclient!ak;II)[Lclient!bf;")
	public static Class1_Sub2_Sub2[] method4019(@OriginalArg(0) int arg0, @OriginalArg(1) Class7 arg1) {
		return Static139.method2193(arg1, arg0, 0) ? Static139.method2196() : null;
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(Lclient!jh;I)V")
	public static void method4020(@OriginalArg(0) Class84 arg0) {
		Static176.anInt3254 = 3;
		@Pc(9) Class115 local9 = null;
		Static175.method2663(true);
		Static160.aBoolean223 = true;
		Static29.anInt623 = 0;
		Static287.aBoolean429 = true;
		Static267.anInt5346 = 127;
		Static44.anInt997 = 0;
		Static57.aBoolean97 = true;
		Static16.aBoolean33 = true;
		Static282.aBoolean446 = true;
		Static160.aBoolean222 = true;
		Static51.aBoolean91 = true;
		Static224.anInt4699 = 0;
		anInt5233 = 255;
		Static73.anInt1433 = 127;
		Static235.anInt4896 = 2;
		Static286.anInt5079 = 0;
		Static294.aBoolean445 = true;
		Static294.aBoolean443 = true;
		Static97.aBoolean136 = true;
		Static99.aBoolean138 = true;
		if (Static47.anInt5868 < 96) {
			Static200.method3047(0);
		} else {
			Static200.method3047(2);
		}
		Static207.anInt4118 = 0;
		Static290.aBoolean436 = false;
		Static203.aBoolean299 = false;
		Static41.aBoolean82 = false;
		Static8.anInt239 = 0;
		Static273.aBoolean417 = true;
		Static152.anInt2837 = 0;
		try {
			@Pc(78) Class118 local78 = arg0.method1954("runescape");
			while (local78.anInt3187 == 0) {
				Static275.method4233(1L);
			}
			if (local78.anInt3187 == 1) {
				local9 = (Class115) local78.anObject3;
				@Pc(106) byte[] local106 = new byte[(int) local9.method2604()];
				@Pc(125) int local125;
				for (@Pc(108) int local108 = 0; local108 < local106.length; local108 += local125) {
					local125 = local9.method2607(local108, local106, local106.length - local108);
					if (local125 == -1) {
						throw new IOException("EOF");
					}
				}
				Static40.method748(new Class1_Sub18(local106));
			}
		} catch (@Pc(148) Exception local148) {
		}
		try {
			if (local9 != null) {
				local9.method2608();
			}
		} catch (@Pc(156) Exception local156) {
		}
	}
}

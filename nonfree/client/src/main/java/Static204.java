import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static204 {

	@OriginalMember(owner = "client!pb", name = "A", descriptor = "[I")
	public static int[] anIntArray336;

	@OriginalMember(owner = "client!pb", name = "C", descriptor = "F")
	public static float aFloat117;

	@OriginalMember(owner = "client!pb", name = "L", descriptor = "I")
	public static int anInt4047 = 0;

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(ZLclient!we;)V")
	public static void method3268(@OriginalArg(1) Class184 arg0) {
		@Pc(8) Class68 local8 = null;
		try {
			@Pc(17) Class119 local17 = arg0.method4605("runescape");
			while (local17.anInt3695 == 0) {
				Static193.method3169(1L);
			}
			if (local17.anInt3695 == 1) {
				local8 = (Class68) local17.anObject4;
				@Pc(39) Class4_Sub24 local39 = Static301.method4633();
				local8.method1819(local39.anInt3822, 0, local39.aByteArray47);
			}
		} catch (@Pc(49) Exception local49) {
		}
		try {
			if (local8 != null) {
				local8.method1824();
			}
		} catch (@Pc(57) Exception local57) {
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;Z)V")
	public static void method3269(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		try {
			@Pc(11) String local11 = "";
			if (arg0 != null) {
				local11 = Static160.method2581(arg0);
			}
			if (arg1 != null) {
				if (arg0 != null) {
					local11 = local11 + " | ";
				}
				local11 = local11 + arg1;
			}
			Static73.method1233(local11);
			local11 = Static123.method2040(local11, ":", "%3a");
			local11 = Static123.method2040(local11, "@", "%40");
			local11 = Static123.method2040(local11, "&", "%26");
			local11 = Static123.method2040(local11, "#", "%23");
			if (Static3.aClass184_1.anApplet1 == null) {
				return;
			}
			@Pc(107) Class119 local107 = Static3.aClass184_1.method4609(new URL(Static3.aClass184_1.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static226.anInt4572 + "&u=" + Static115.aLong88 + "&v1=" + Static300.aString197 + "&v2=" + Static300.aString193 + "&e=" + local11));
			while (local107.anInt3695 == 0) {
				Static193.method3169(1L);
			}
			if (local107.anInt3695 == 1) {
				@Pc(124) DataInputStream local124 = (DataInputStream) local107.anObject4;
				local124.read();
				local124.close();
			}
		} catch (@Pc(131) Exception local131) {
		}
	}
}

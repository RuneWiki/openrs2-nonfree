import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static139 {

	@OriginalMember(owner = "client!lk", name = "t", descriptor = "[J")
	public static long[] aLongArray38 = new long[200];

	@OriginalMember(owner = "client!lk", name = "A", descriptor = "I")
	public static int anInt5524 = 0;

	@OriginalMember(owner = "client!lk", name = "f", descriptor = "(I)V")
	public static void method4195() {
		@Pc(7) int local7 = Static58.anInt1620;
		@Pc(13) int local13 = Static123.anInt1284;
		@Pc(20) int local20 = Static101.anInt2760 - local7 - Static200.anInt4411;
		@Pc(28) int local28 = Static39.anInt1098 - Static251.anInt5352 - local13;
		if (local7 <= 0 && local20 <= 0 && local13 <= 0 && local28 <= 0) {
			return;
		}
		try {
			@Pc(40) Container local40;
			if (Static88.aFrame2 != null) {
				local40 = Static88.aFrame2;
			} else if (Static42.aFrame1 == null) {
				local40 = Static38.aClass28_1.anApplet1;
			} else {
				local40 = Static42.aFrame1;
			}
			@Pc(53) int local53 = 0;
			@Pc(55) int local55 = 0;
			if (local40 == Static42.aFrame1) {
				@Pc(61) Insets local61 = Static42.aFrame1.getInsets();
				local55 = local61.top;
				local53 = local61.left;
			}
			@Pc(70) Graphics local70 = local40.getGraphics();
			local70.setColor(Color.black);
			if (local7 > 0) {
				local70.fillRect(local53, local55, local7, Static39.anInt1098);
			}
			if (local13 > 0) {
				local70.fillRect(local53, local55, Static101.anInt2760, local13);
			}
			if (local20 > 0) {
				local70.fillRect(local53 + Static101.anInt2760 - local20, local55, local20, Static39.anInt1098);
			}
			if (local28 > 0) {
				local70.fillRect(local53, Static39.anInt1098 + local55 - local28, Static101.anInt2760, local28);
				return;
			}
		} catch (@Pc(124) Exception local124) {
			return;
		}
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(BI)C")
	public static char method4196(@OriginalArg(0) byte arg0) {
		@Pc(3) int local3 = arg0 & 0xFF;
		if (local3 == 0) {
			throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(local3, 16) + " provided");
		}
		if (local3 >= 128 && local3 < 160) {
			@Pc(43) char local43 = Static95.aCharArray1[local3 - 128];
			if (local43 == '\u0000') {
				local43 = '?';
			}
			local3 = local43;
		}
		return (char) local3;
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lclient!hc;Lclient!hc;III)Lclient!gf;")
	public static Class1_Sub2_Sub7 method4197(@OriginalArg(0) Class51 arg0, @OriginalArg(1) Class51 arg1, @OriginalArg(2) int arg2) {
		return Static96.method2050(arg1, 0, arg2) ? Static98.method2082(arg0.method1874(arg2, 0)) : null;
	}

	@OriginalMember(owner = "client!lk", name = "g", descriptor = "(I)Lclient!cj;")
	public static Class19 method4199() {
		try {
			return (Class19) Class.forName("Class19_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}

	@OriginalMember(owner = "client!lk", name = "c", descriptor = "(B)V")
	public static void method4200() {
		Static63.aClass79_8.method2489();
	}
}

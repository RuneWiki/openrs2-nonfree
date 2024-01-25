import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static60 {

	@OriginalMember(owner = "client!cs", name = "cb", descriptor = "I")
	public static int anInt1089;

	@OriginalMember(owner = "client!cs", name = "hb", descriptor = "Lclient!ga;")
	public static Interface5 anInterface5_1;

	@OriginalMember(owner = "client!cs", name = "K", descriptor = "Lclient!dq;")
	public static final Class56 aClass56_48 = new Class56(84, -1);

	@OriginalMember(owner = "client!cs", name = "Y", descriptor = "Lclient!ud;")
	public static final Class245 aClass245_4 = new Class245(15, 0, 1, 0);

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(Ljava/awt/Canvas;B)Lclient!ng;")
	public static Class4_Sub13 method846(@OriginalArg(0) Canvas arg0) {
		try {
			@Pc(6) Class local6 = Class.forName("Class4_Sub13_Sub2");
			@Pc(15) Class4_Sub13 local15 = (Class4_Sub13) local6.getDeclaredConstructor().newInstance();
			local15.method3733(arg0);
			return local15;
		} catch (@Pc(22) Throwable local22) {
			@Pc(26) Class4_Sub13_Sub1 local26 = new Class4_Sub13_Sub1();
			local26.method3733(arg0);
			return local26;
		}
	}

	@OriginalMember(owner = "client!cs", name = "b", descriptor = "(BII)Z")
	public static boolean method847(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!Static339.aBoolean390) {
			return false;
		}
		@Pc(21) int local21 = arg0 >> 16;
		@Pc(25) int local25 = arg0 & 0xFFFF;
		if (Static412.aClass110ArrayArray2[local21] == null || Static412.aClass110ArrayArray2[local21][local25] == null) {
			return false;
		}
		@Pc(43) Class110 local43 = Static412.aClass110ArrayArray2[local21][local25];
		@Pc(55) Class4_Sub30 local55;
		if (arg1 == -1 && local43.anInt2627 == 0) {
			for (local55 = (Class4_Sub30) Static41.aClass244_2.method5263(); local55 != null; local55 = (Class4_Sub30) Static41.aClass244_2.method5271()) {
				if (local55.anInt4615 == 58 || local55.anInt4615 == 1012 || local55.anInt4615 == 12 || local55.anInt4615 == 47 || local55.anInt4615 == 4) {
					for (@Pc(90) Class110 local90 = Static235.method3185(local55.anInt4617); local90 != null; local90 = Static9.method3940(local90)) {
						if (local43.anInt2675 == local90.anInt2675) {
							return true;
						}
					}
				}
			}
		} else {
			for (local55 = (Class4_Sub30) Static41.aClass244_2.method5263(); local55 != null; local55 = (Class4_Sub30) Static41.aClass244_2.method5271()) {
				if (arg1 == local55.anInt4614 && local55.anInt4617 == local43.anInt2675 && (local55.anInt4615 == 58 || local55.anInt4615 == 1012 || local55.anInt4615 == 12 || local55.anInt4615 == 47 || local55.anInt4615 == 4)) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(III)I")
	public static int method850(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg1 >>> 24;
		@Pc(17) int local17 = 255 - local12;
		@Pc(35) int local35 = (local12 * (arg1 & 0xFF00FF) & 0xFF00FF00 | (arg1 & 0xFF00) * local12 & 0xFF0000) >>> 8;
		return local35 + (((arg0 & 0xFF00) * local17 & 0xFF0000 | (arg0 & 0xFF00FF) * local17 & 0xFF00FF00) >>> 8);
	}
}

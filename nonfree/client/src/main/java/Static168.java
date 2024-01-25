import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static168 {

	@OriginalMember(owner = "client!ks", name = "e", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame2;

	@OriginalMember(owner = "client!ks", name = "h", descriptor = "Lclient!kh;")
	public static Class54 aClass54_9;

	@OriginalMember(owner = "client!ks", name = "d", descriptor = "Lclient!fi;")
	public static final Class66 aClass66_60 = new Class66(8);

	@OriginalMember(owner = "client!ks", name = "f", descriptor = "Z")
	public static boolean aBoolean244 = false;

	@OriginalMember(owner = "client!ks", name = "g", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray22 = new String[] { "en", "de", "fr", "pt", "nl" };

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(B)V")
	public static void method3161() {
		Static354.aClass66_109.method1933();
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(I)V")
	public static void method3162() {
		@Pc(1) Class66 local1 = Static289.aClass66_97;
		synchronized (Static289.aClass66_97) {
			Static289.aClass66_97.method1933();
		}
		@Pc(26) Class66 local26 = Static244.aClass66_84;
		synchronized (Static244.aClass66_84) {
			Static244.aClass66_84.method1933();
		}
		local26 = Static37.aClass66_9;
		synchronized (Static37.aClass66_9) {
			Static37.aClass66_9.method1933();
		}
		local26 = Static203.aClass66_69;
		synchronized (Static203.aClass66_69) {
			Static203.aClass66_69.method1933();
		}
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(III)V")
	public static void method3163(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static2.anIntArray2[arg0] = arg1;
		@Pc(22) Class5_Sub35 local22 = (Class5_Sub35) Static352.aClass42_61.method1052((long) arg0);
		if (local22 == null) {
			local22 = new Class5_Sub35(4611686018427387905L);
			Static352.aClass42_61.method1050((long) arg0, local22);
		} else if (local22.aLong175 != 4611686018427387905L) {
			local22.aLong175 = Static284.method4783() + 500L | 0x4000000000000000L;
		}
	}

	@OriginalMember(owner = "client!ks", name = "b", descriptor = "(III)V")
	public static void method3164(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(20) boolean local20 = Static138.aClass51ArrayArrayArray1[0][arg1][arg2] != null && Static138.aClass51ArrayArrayArray1[0][arg1][arg2].aClass51_1 != null;
		for (@Pc(22) int local22 = arg0; local22 >= 0; local22--) {
			if (Static138.aClass51ArrayArrayArray1[local22][arg1][arg2] == null) {
				@Pc(46) Class51 local46 = Static138.aClass51ArrayArrayArray1[local22][arg1][arg2] = new Class51(local22, arg1, arg2);
				if (local20) {
					local46.aByte9++;
				}
			}
		}
	}
}

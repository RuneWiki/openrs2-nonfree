import java.awt.Font;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static170 {

	@OriginalMember(owner = "client!na", name = "a", descriptor = "Lclient!in;")
	public static Class71 aClass71_15;

	@OriginalMember(owner = "client!na", name = "d", descriptor = "Lclient!km;")
	public static Class91 aClass91_137;

	@OriginalMember(owner = "client!na", name = "h", descriptor = "I")
	public static int anInt3634;

	@OriginalMember(owner = "client!na", name = "k", descriptor = "Ljava/awt/Font;")
	public static Font aFont1;

	@OriginalMember(owner = "client!na", name = "l", descriptor = "Lclient!km;")
	public static Class91 aClass91_138;

	@OriginalMember(owner = "client!na", name = "s", descriptor = "[[B")
	public static byte[][] aByteArrayArray9;

	@OriginalMember(owner = "client!na", name = "t", descriptor = "I")
	public static int anInt3640;

	@OriginalMember(owner = "client!na", name = "c", descriptor = "I")
	public static int anInt3632 = 0;

	@OriginalMember(owner = "client!na", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString212 = "glow3:";

	@OriginalMember(owner = "client!na", name = "g", descriptor = "Lclient!hi;")
	public static Class61 aClass61_19 = new Class61();

	@OriginalMember(owner = "client!na", name = "o", descriptor = "I")
	public static int anInt3639 = -1;

	@OriginalMember(owner = "client!na", name = "p", descriptor = "Ljava/lang/String;")
	public static String aString213 = null;

	@OriginalMember(owner = "client!na", name = "q", descriptor = "J")
	public static long aLong134 = 0L;

	@OriginalMember(owner = "client!na", name = "r", descriptor = "Lclient!lb;")
	public static Class93 aClass93_2 = new Class93();

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(I)V")
	public static void method2922() {
		Static71.aClass135_4.method3324();
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIII)V")
	public static void method2923(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static297.anInt5619 <= arg3 && Static49.anInt1129 >= arg3) {
			@Pc(16) int local16 = Static23.method431(arg0, Static68.anInt1451, Static224.anInt4436);
			@Pc(22) int local22 = Static23.method431(arg1, Static68.anInt1451, Static224.anInt4436);
			Static211.method3349(local16, arg2, arg3, local22);
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(BZ)C")
	public static char method2924(@OriginalArg(0) byte arg0) {
		@Pc(12) int local12 = arg0 & 0xFF;
		if (local12 == 0) {
			throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(local12, 16) + " provided");
		}
		if (local12 >= 128 && local12 < 160) {
			@Pc(45) char local45 = Static78.aCharArray2[local12 - 128];
			if (local45 == '\u0000') {
				local45 = '?';
			}
			local12 = local45;
		}
		return (char) local12;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(BLclient!wa;)[Lclient!kj;")
	public static Class90[] method2925(@OriginalArg(1) Class175 arg0) {
		if (!arg0.method4332()) {
			return new Class90[0];
		}
		@Pc(16) Class116 local16 = arg0.method4334();
		while (local16.anInt3812 == 0) {
			Static48.method934(10L);
		}
		if (local16.anInt3812 == 2) {
			return new Class90[0];
		}
		@Pc(41) int[] local41 = (int[]) local16.anObject5;
		@Pc(47) Class90[] local47 = new Class90[local41.length >> 2];
		for (@Pc(55) int local55 = 0; local55 < local47.length; local55++) {
			@Pc(67) Class90 local67 = new Class90();
			local47[local55] = local67;
			local67.anInt3054 = local41[local55 << 2];
			local67.anInt3047 = local41[(local55 << 2) + 1];
			local67.anInt3056 = local41[(local55 << 2) + 2];
			local67.anInt3045 = local41[(local55 << 2) + 3];
		}
		return local47;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(III)V")
	public static void method2927(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static13.anIntArray31[arg1] = arg0;
		@Pc(18) Class1_Sub18 local18 = (Class1_Sub18) Static118.aClass70_8.method2075((long) arg1);
		if (local18 == null) {
			local18 = new Class1_Sub18(4611686018427387905L);
			Static118.aClass70_8.method2084((long) arg1, local18);
		} else if (local18.aLong103 != 4611686018427387905L) {
			local18.aLong103 = Static294.method4413() + 500L | 0x4000000000000000L;
		}
	}
}

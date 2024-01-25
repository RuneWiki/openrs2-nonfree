import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static128 {

	@OriginalMember(owner = "client!eq", name = "C", descriptor = "Lclient!je;")
	public static final Class171 aClass171_2 = new Class171();

	@OriginalMember(owner = "client!eq", name = "G", descriptor = "Lclient!rga;")
	public static final Class286 aClass286_43 = new Class286(30, 3);

	@OriginalMember(owner = "client!eq", name = "K", descriptor = "[I")
	public static final int[] anIntArray159 = new int[6];

	@OriginalMember(owner = "client!eq", name = "M", descriptor = "[Z")
	public static final boolean[] aBooleanArray12 = new boolean[100];

	@OriginalMember(owner = "client!eq", name = "N", descriptor = "[I")
	public static final int[] anIntArray160 = new int[3];

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(III)Z")
	public static boolean method2156(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (Static421.method6463(arg1, arg0) | (arg0 & 0x2000) != 0 | Static360.method5407(arg1, arg0)) & Static512.method7100(arg1, arg0);
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(BB)C")
	public static char method2158(@OriginalArg(1) byte arg0) {
		@Pc(12) int local12 = arg0 & 0xFF;
		if (local12 == 0) {
			throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(local12, 16) + " provided");
		}
		if (local12 >= 128 && local12 < 160) {
			@Pc(41) char local41 = Static510.aCharArray12[local12 - 128];
			if (local41 == '\u0000') {
				local41 = '?';
			}
			local12 = local41;
		}
		return (char) local12;
	}

	@OriginalMember(owner = "client!eq", name = "b", descriptor = "(I)V")
	public static void method2159() {
		Static167.aBoolean291 = false;
		Static50.method898(Static23.anInt642, Static202.anInt3966, Static306.anInt5446, Static344.anInt6231);
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(ILjava/lang/String;I[B)I")
	public static int method2160(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(10) int local10 = arg0.length();
		for (@Pc(17) int local17 = 0; local17 < local10; local17 += 4) {
			@Pc(25) int local25 = Static240.method1410(arg0.charAt(local17));
			@Pc(40) int local40 = local17 + 1 >= local10 ? -1 : Static240.method1410(arg0.charAt(local17 + 1));
			@Pc(55) int local55 = local10 > local17 + 2 ? Static240.method1410(arg0.charAt(local17 + 2)) : -1;
			@Pc(74) int local74 = local17 + 3 < local10 ? Static240.method1410(arg0.charAt(local17 + 3)) : -1;
			arg2[arg1++] = (byte) (local40 >>> 4 | local25 << 2);
			if (local55 == -1) {
				break;
			}
			arg2[arg1++] = (byte) ((local40 & 0xF) << 4 | local55 >>> 2);
			if (local74 == -1) {
				break;
			}
			arg2[arg1++] = (byte) ((local55 & 0x3) << 6 | local74);
		}
		return arg1;
	}
}

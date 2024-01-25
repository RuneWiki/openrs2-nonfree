import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static296 {

	@OriginalMember(owner = "client!so", name = "L", descriptor = "[[B")
	public static final byte[][] aByteArrayArray17 = new byte[1000][];

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/Class;")
	public static Class method5172(@OriginalArg(1) String arg0) throws ClassNotFoundException {
		if (arg0.equals("B")) {
			return Byte.TYPE;
		} else if (arg0.equals("I")) {
			return Integer.TYPE;
		} else if (arg0.equals("S")) {
			return Short.TYPE;
		} else if (arg0.equals("J")) {
			return Long.TYPE;
		} else if (arg0.equals("Z")) {
			return Boolean.TYPE;
		} else if (arg0.equals("F")) {
			return Float.TYPE;
		} else if (arg0.equals("D")) {
			return Double.TYPE;
		} else if (arg0.equals("C")) {
			return Character.TYPE;
		} else {
			return Class.forName(arg0);
		}
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(BLclient!ct;)V")
	public static void method5174(@OriginalArg(1) Class30 arg0) {
		Static208.aClass30_60 = arg0;
	}

	@OriginalMember(owner = "client!so", name = "b", descriptor = "(IB)Lclient!di;")
	public static Class1_Sub4_Sub6 method5175(@OriginalArg(0) int arg0) {
		@Pc(15) Class1_Sub4_Sub6 local15 = (Class1_Sub4_Sub6) Static1.aClass44_1.method1612((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(25) byte[] local25 = Static152.aClass30_44.method1161(arg0, 11);
		local15 = new Class1_Sub4_Sub6();
		if (local25 != null) {
			local15.method1383(new Class1_Sub7(local25));
		}
		Static1.aClass44_1.method1616((long) arg0, local15);
		return local15;
	}

	@OriginalMember(owner = "client!so", name = "h", descriptor = "(I)V")
	public static void method5176() {
		@Pc(7) int local7 = Static99.anInt2276;
		@Pc(9) int[] local9 = Static238.anIntArray382;
		for (@Pc(19) int local19 = 0; local19 < local7; local19++) {
			@Pc(27) Class11_Sub2_Sub6_Sub1 local27 = Static275.aClass11_Sub2_Sub6_Sub1Array1[local9[local19]];
			if (local27 != null && local27.anInt6753 > 0) {
				local27.anInt6753--;
				if (local27.anInt6753 == 0) {
					local27.aString64 = null;
				}
			}
		}
		for (@Pc(50) int local50 = 0; local50 < Static277.anInt5394; local50++) {
			@Pc(56) int local56 = Static81.anIntArray143[local50];
			@Pc(60) Class11_Sub2_Sub6_Sub2 local60 = Static231.aClass11_Sub2_Sub6_Sub2Array1[local56];
			if (local60 != null && local60.anInt6753 > 0) {
				local60.anInt6753--;
				if (local60.anInt6753 == 0) {
					local60.aString64 = null;
				}
			}
		}
	}
}

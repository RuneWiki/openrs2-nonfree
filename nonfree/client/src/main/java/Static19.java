import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static19 {

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "I")
	public static int anInt484;

	@OriginalMember(owner = "client!bb", name = "i", descriptor = "Lclient!ct;")
	public static Class30 aClass30_2;

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "Lclient!bt;")
	public static final Class21 aClass21_18 = new Class21(100);

	@OriginalMember(owner = "client!bb", name = "h", descriptor = "[B")
	public static final byte[] aByteArray10 = new byte[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

	@OriginalMember(owner = "client!bb", name = "o", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray2 = new String[8];

	@OriginalMember(owner = "client!bb", name = "p", descriptor = "J")
	public static long aLong19 = -1L;

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V")
	public static void method530(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(5) String arg4) {
		Static134.method2729(arg4, null, arg3, arg2, arg0, arg1, -1);
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(II)Lclient!hg;")
	public static Class1_Sub4_Sub12 method531(@OriginalArg(0) int arg0) {
		@Pc(17) Class1_Sub4_Sub12 local17 = (Class1_Sub4_Sub12) Static219.aClass44_6.method1612((long) arg0);
		if (local17 != null) {
			return local17;
		}
		@Pc(27) byte[] local27 = Static368.aClass30_112.method1161(0, arg0);
		if (local27 == null || local27.length <= 1) {
			return null;
		} else {
			local17 = Static136.method4752(local27);
			Static219.aClass44_6.method1616((long) arg0, local17);
			return local17;
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(BB)C")
	public static char method532(@OriginalArg(1) byte arg0) {
		@Pc(12) int local12 = arg0 & 0xFF;
		if (local12 == 0) {
			throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(local12, 16) + " provided");
		}
		if (local12 >= 128 && local12 < 160) {
			@Pc(43) char local43 = Static246.aCharArray46[local12 - 128];
			if (local43 == '\u0000') {
				local43 = '?';
			}
			local12 = local43;
		}
		return (char) local12;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)V")
	public static void method533() {
		if (Static5.aBoolean11) {
			return;
		}
		if (Static41.aBoolean62) {
			Static357.aFloat76 = (int) Static357.aFloat76 - 65 & 0xFFFFFF80;
		} else {
			Static294.aFloat58 += (-24.0F - Static294.aFloat58) / 2.0F;
		}
		Static5.aBoolean11 = true;
		Static195.aBoolean294 = true;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(IZ)I")
	public static int method534(@OriginalArg(0) int arg0) {
		return arg0 & 0x7F;
	}
}

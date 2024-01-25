import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static304 {

	@OriginalMember(owner = "client!kh", name = "O", descriptor = "I")
	public static int anInt4739 = -1;

	@OriginalMember(owner = "client!kh", name = "R", descriptor = "Lclient!kq;")
	public static final Class208 aClass208_1 = new Class208(14, 0);

	@OriginalMember(owner = "client!kh", name = "T", descriptor = "Lclient!kq;")
	public static final Class208 aClass208_2 = new Class208(15, 4);

	@OriginalMember(owner = "client!kh", name = "V", descriptor = "Lclient!kq;")
	public static final Class208 aClass208_3 = new Class208(16, -2);

	@OriginalMember(owner = "client!kh", name = "X", descriptor = "Lclient!kq;")
	public static final Class208 aClass208_4 = new Class208(17, 0);

	@OriginalMember(owner = "client!kh", name = "Y", descriptor = "Lclient!kq;")
	public static final Class208 aClass208_5 = new Class208(18, -2);

	@OriginalMember(owner = "client!kh", name = "Z", descriptor = "Lclient!kq;")
	public static final Class208 aClass208_6 = new Class208(19, -2);

	@OriginalMember(owner = "client!kh", name = "ab", descriptor = "Lclient!kq;")
	public static final Class208 aClass208_7 = new Class208(22, -2);

	@OriginalMember(owner = "client!kh", name = "bb", descriptor = "Lclient!kq;")
	public static final Class208 aClass208_8 = new Class208(23, 4);

	@OriginalMember(owner = "client!kh", name = "cb", descriptor = "Lclient!kq;")
	public static final Class208 aClass208_9 = new Class208(24, -1);

	@OriginalMember(owner = "client!kh", name = "db", descriptor = "Lclient!kq;")
	public static final Class208 aClass208_10 = new Class208(26, 0);

	@OriginalMember(owner = "client!kh", name = "eb", descriptor = "Lclient!kq;")
	public static final Class208 aClass208_11 = new Class208(27, 0);

	@OriginalMember(owner = "client!kh", name = "fb", descriptor = "Lclient!kq;")
	public static final Class208 aClass208_12 = new Class208(28, -2);

	@OriginalMember(owner = "client!kh", name = "g", descriptor = "(I)I")
	public static int method4150() {
		return Static634.anInt10113 == 1 ? Static435.anInt7679 : 0;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(Ljava/lang/String;Z)I")
	public static int method4151(@OriginalArg(0) String arg0) {
		if (!Static223.aClass202_3.aBoolean384) {
			return -1;
		} else if (Static621.aHashtable35.containsKey(arg0)) {
			return 100;
		} else {
			@Pc(20) String local20 = Static578.method7880(arg0);
			if (local20 == null) {
				return -1;
			}
			@Pc(33) String local33 = Static661.aString113 + local20;
			if (!Static372.aClass50_106.method920(local33, "")) {
				return -1;
			} else if (Static372.aClass50_106.method922(local33)) {
				@Pc(57) byte[] local57 = Static372.aClass50_106.method892(local33, "");
				@Pc(68) File local68;
				try {
					local68 = Static519.method7339(local20);
				} catch (@Pc(70) RuntimeException local70) {
					return -1;
				}
				if (local57 == null || local68 == null) {
					return -1;
				}
				@Pc(78) boolean local78 = true;
				@Pc(82) byte[] local82 = Static598.method8100(local68);
				if (local82 != null && local57.length == local82.length) {
					for (@Pc(95) int local95 = 0; local95 < local82.length; local95++) {
						if (local57[local95] != local82[local95]) {
							local78 = false;
							break;
						}
					}
				} else {
					local78 = false;
				}
				try {
					if (!local78) {
						Static223.aClass202_3.method4732(local57, local68);
					}
				} catch (@Pc(131) Throwable local131) {
					return -1;
				}
				Static616.method8268(local68, arg0);
				return 100;
			} else {
				return Static372.aClass50_106.method914(local33);
			}
		}
	}

	@OriginalMember(owner = "client!kh", name = "f", descriptor = "(B)V")
	public static void method4152() {
		Static629.anInt10056 = (int) ((double) Static124.anInt2150 * 34.46D);
		Static269.anInt4246 = 200;
		Static629.anInt10056 <<= 0x2;
		if (Static563.aClass143_13.method6240()) {
			Static629.anInt10056 += 512;
		}
		Static374.method6478(false);
	}

	@OriginalMember(owner = "client!kh", name = "d", descriptor = "(III)Z")
	public static boolean method4153(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static234.method3349(arg0, arg1) & Static359.method4146(arg1, arg0);
	}
}

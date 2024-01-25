import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static66 {

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "I")
	public static int anInt1148;

	@OriginalMember(owner = "client!dd", name = "i", descriptor = "Lclient!ic;")
	public static Class113 aClass113_23;

	@OriginalMember(owner = "client!dd", name = "l", descriptor = "[Lclient!f;")
	public static Class49[] aClass49Array31;

	@OriginalMember(owner = "client!dd", name = "f", descriptor = "Ljava/util/zip/CRC32;")
	public static final CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!dd", name = "k", descriptor = "I")
	public static int anInt1155 = 0;

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)Lclient!ua;")
	public static Class11 method996() {
		try {
			return new Class11_Sub2();
		} catch (@Pc(8) Throwable local8) {
			try {
				return (Class11) Class.forName("Class11_Sub3").getDeclaredConstructor().newInstance();
			} catch (@Pc(14) Throwable local14) {
				return new Class11_Sub1();
			}
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIIII)Z")
	public static boolean method997(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if ((Static357.aByteArrayArrayArray11[0][arg3][arg0] & 0x2) != 0) {
			return true;
		} else if ((Static357.aByteArrayArrayArray11[arg2][arg3][arg0] & 0x10) == 0) {
			return arg1 == Static379.method4847(arg0, arg2, arg3);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IZ)I")
	public static int method998(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			local5 += 16;
			arg0 >>>= 0x10;
		}
		if (arg0 >= 256) {
			local5 += 8;
			arg0 >>>= 0x8;
		}
		if (arg0 >= 16) {
			local5 += 4;
			arg0 >>>= 0x4;
		}
		if (arg0 >= 4) {
			arg0 >>>= 0x2;
			local5 += 2;
		}
		if (arg0 >= 1) {
			arg0 >>>= 0x1;
			local5++;
		}
		return arg0 + local5;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(II)V")
	public static void method999(@OriginalArg(1) int arg0) {
		@Pc(8) Class1_Sub3_Sub13 local8 = Static397.method4998(8, arg0);
		local8.method3458();
	}
}

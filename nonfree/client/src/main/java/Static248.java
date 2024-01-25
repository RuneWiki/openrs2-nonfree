import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static248 {

	@OriginalMember(owner = "client!ida", name = "b", descriptor = "Lclient!sb;")
	public static final Class322 aClass322_77 = new Class322(62, 4);

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(IIII)I")
	public static int method4318(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static555.aClass96Array3 == null) {
			return 0;
		}
		@Pc(12) int local12 = arg2 >> 9;
		@Pc(16) int local16 = arg0 >> 9;
		if (local12 < 0 || local16 < 0 || Static29.anInt380 - 1 < local12 || Static327.anInt5650 - 1 < local16) {
			return 0;
		}
		@Pc(51) int local51 = arg1;
		if (arg1 < 3 && (Static272.aByteArrayArrayArray2[1][local12][local16] & 0x2) != 0) {
			local51 = arg1 + 1;
		}
		return Static555.aClass96Array3[local51].method8077(arg2, arg0);
	}

	@OriginalMember(owner = "client!ida", name = "b", descriptor = "(I)V")
	public static void method4319() {
		for (@Pc(15) Class6_Sub35 local15 = (Class6_Sub35) Static549.aClass340_69.method8124(); local15 != null; local15 = (Class6_Sub35) Static549.aClass340_69.method8134()) {
			if (local15.aBoolean457) {
				local15.method5556();
			}
		}
		for (@Pc(39) Class6_Sub35 local39 = (Class6_Sub35) Static81.aClass340_3.method8124(); local39 != null; local39 = (Class6_Sub35) Static81.aClass340_3.method8134()) {
			if (local39.aBoolean457) {
				local39.method5556();
			}
		}
	}

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(Z)Lclient!sh;")
	public static Class114 method4320() {
		try {
			return (Class114) Class.forName("fja").getDeclaredConstructor().newInstance();
		} catch (@Pc(18) Throwable local18) {
			return new Class114_Sub2();
		}
	}

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(Ljava/lang/String;I)J")
	public static long method4321(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) long local10 = 0L;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			local10 = (long) arg0.charAt(local12) + (local10 << 5) - local10;
		}
		return 2 == 2 ? local10 : 56L;
	}
}

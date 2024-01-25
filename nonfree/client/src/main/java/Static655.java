import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static655 {

	@OriginalMember(owner = "client!wca", name = "n", descriptor = "[J")
	public static long[] aLongArray20;

	@OriginalMember(owner = "client!wca", name = "t", descriptor = "[Lclient!s;")
	public static Class42[] aClass42Array5;

	@OriginalMember(owner = "client!wca", name = "w", descriptor = "I")
	public static int anInt10336 = 0;

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(IIIIZ[Lclient!kq;)V")
	public static void method8734(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class199[] arg4) {
		for (@Pc(7) int local7 = 0; local7 < arg4.length; local7++) {
			@Pc(13) Class199 local13 = arg4[local7];
			if (local13 != null && arg2 == local13.anInt4982) {
				Static622.method8368(arg0, local13, arg1, arg3);
				Static449.method6177(arg0, local13, arg1);
				if (local13.anInt5023 - local13.anInt5035 < local13.anInt5031) {
					local13.anInt5031 = local13.anInt5023 - local13.anInt5035;
				}
				if (local13.anInt5031 < 0) {
					local13.anInt5031 = 0;
				}
				if (local13.anInt4977 > local13.anInt4981 - local13.anInt4994) {
					local13.anInt4977 = local13.anInt4981 - local13.anInt4994;
				}
				if (local13.anInt4977 < 0) {
					local13.anInt4977 = 0;
				}
				if (local13.anInt4966 == 0) {
					Static284.method4095(arg3, local13);
				}
			}
		}
	}

	@OriginalMember(owner = "client!wca", name = "b", descriptor = "(II)Lclient!pn;")
	public static Class288 method8735(@OriginalArg(0) int arg0) {
		@Pc(8) Class288[] local8 = Static233.method3357();
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			@Pc(16) Class288 local16 = local8[local10];
			if (arg0 == local16.anInt7444) {
				return local16;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(B)V")
	public static void method8736() {
		if (!Static567.aBoolean692) {
			Static566.aFloat202 += (12.0F - Static566.aFloat202) / 2.0F;
			Static123.aBoolean157 = true;
			Static567.aBoolean692 = true;
		}
	}
}

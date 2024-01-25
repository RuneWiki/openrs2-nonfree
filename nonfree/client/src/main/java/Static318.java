import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static318 {

	@OriginalMember(owner = "client!ud", name = "z", descriptor = "Lclient!kn;")
	public static final Class116 aClass116_45 = new Class116();

	@OriginalMember(owner = "client!ud", name = "A", descriptor = "[I")
	public static final int[] anIntArray482 = new int[50];

	@OriginalMember(owner = "client!ud", name = "C", descriptor = "[Lclient!vd;")
	public static final Class208[] aClass208Array1 = new Class208[16];

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(III)V")
	public static void method5242(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static166.method3253(arg1)) {
			Static89.method2168(arg0, Static271.aClass21ArrayArray1[arg1]);
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)V")
	public static void method5243() {
		if (Static146.aClass166_2 == null) {
			return;
		}
		while (true) {
			while (Static340.anInt6521 < Static77.aClass10_Sub1Array1.length) {
				@Pc(26) Class10_Sub1 local26 = Static77.aClass10_Sub1Array1[Static340.anInt6521];
				if (local26 != null && local26.anInt272 == -1) {
					if (Static223.aClass4_Sub35_1 == null) {
						Static223.aClass4_Sub35_1 = Static146.aClass166_2.method4495(local26.aString2);
					}
					@Pc(50) int local50 = Static223.aClass4_Sub35_1.anInt5053;
					if (local50 == -1) {
						return;
					}
					Static223.aClass4_Sub35_1 = null;
					Static340.anInt6521++;
					local26.anInt272 = local50;
				} else {
					Static340.anInt6521++;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(II)Lclient!ca;")
	public static Class24 method5245(@OriginalArg(0) int arg0) {
		@Pc(10) Class24 local10 = (Class24) Static104.aClass198_85.method5210((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static157.aClass193_58.method5047(33, arg0);
		local10 = new Class24();
		if (local25 != null) {
			local10.method565(arg0, new Class4_Sub11(local25));
		}
		Static104.aClass198_85.method5201(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "(II)Lclient!ri;")
	public static Class4_Sub4_Sub16 method5246(@OriginalArg(1) int arg0) {
		@Pc(10) Class4_Sub4_Sub16 local10 = (Class4_Sub4_Sub16) Static119.aClass124_3.method3525((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(32) byte[] local32;
		if (arg0 >= 32768) {
			local32 = Static325.aClass193_101.method5047(1, arg0 & 0x7FFF);
		} else {
			local32 = Static75.aClass193_22.method5047(1, arg0);
		}
		local10 = new Class4_Sub4_Sub16();
		if (local32 != null) {
			local10.method4690(new Class4_Sub11(local32));
		}
		if (arg0 >= 32768) {
			local10.method4691();
		}
		Static119.aClass124_3.method3528(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIB)I")
	public static int method5247(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = arg1 >>> 24;
		@Pc(25) int local25 = (local7 * (arg1 & 0xFF00) & 0xFF0000 | (arg1 & 0xFF00FF) * local7 & 0xFF00FF00) >>> 8;
		@Pc(30) int local30 = 255 - local7;
		return ((local30 * (arg0 & 0xFF00) & 0xFF0000 | local30 * (arg0 & 0xFF00FF) & 0xFF00FF00) >>> 8) + local25;
	}
}

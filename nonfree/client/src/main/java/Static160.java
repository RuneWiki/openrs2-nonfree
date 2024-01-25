import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static160 {

	@OriginalMember(owner = "client!kf", name = "m", descriptor = "[Lclient!kh;")
	public static Class54[] aClass54Array16;

	@OriginalMember(owner = "client!kf", name = "K", descriptor = "I")
	public static int anInt3243;

	@OriginalMember(owner = "client!kf", name = "g", descriptor = "I")
	public static int anInt3228 = 0;

	@OriginalMember(owner = "client!kf", name = "w", descriptor = "[S")
	public static final short[] aShortArray36 = new short[] { 3, 40, 17, 36, 9, 45, 25, 38 };

	@OriginalMember(owner = "client!kf", name = "J", descriptor = "I")
	public static int anInt3242 = 2;

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(B)Lclient!oj;")
	public static Class63_Sub4 method2980() {
		@Pc(13) Class63_Sub4 local13 = (Class63_Sub4) Static326.aClass24_5.method621();
		if (local13 == null) {
			return new Class63_Sub4();
		} else {
			Static175.anInt3557--;
			return local13;
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(BII)V")
	public static void method2981(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class42 local10 = new Class42(16);
		for (@Pc(22) Class5_Sub16 local22 = (Class5_Sub16) Static3.aClass42_56.method1060(); local22 != null; local22 = (Class5_Sub16) Static3.aClass42_56.method1055()) {
			local22.method5803();
			@Pc(33) int local33 = (int) (local22.aLong218 >> 28);
			@Pc(44) int local44 = (int) (local22.aLong218 >> 14 & 0x3FFFL) - arg0;
			@Pc(53) int local53 = (int) (local22.aLong218 & 0x3FFFL) - arg1;
			if (local53 >= 0 && local44 >= 0 && Static266.anInt5101 > local53 && Static339.anInt6352 > local44) {
				local10.method1050((long) (local53 | local33 << 28 | local44 << 14), local22);
			}
		}
		Static3.aClass42_56 = local10;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(ZIZII)V")
	public static void method2983(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static134.anInt2746 == 0) {
			Static287.method4912(false);
		} else {
			Static24.anInt2023 = Static134.anInt2746;
			Static43.method967(0);
		}
		Static259.anInt3208 = arg3;
		Static225.aBoolean328 = arg1;
		Static147.anInt2999 = arg0;
		Static186.method5347(arg2);
	}
}

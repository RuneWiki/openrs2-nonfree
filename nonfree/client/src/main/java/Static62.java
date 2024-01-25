import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static62 {

	@OriginalMember(owner = "client!cea", name = "b", descriptor = "Lclient!rm;")
	public static Class318 aClass318_1;

	@OriginalMember(owner = "client!cea", name = "h", descriptor = "Lclient!iha;")
	public static final Class168 aClass168_11 = new Class168(260);

	@OriginalMember(owner = "client!cea", name = "c", descriptor = "J")
	public static volatile long aLong43 = 0L;

	@OriginalMember(owner = "client!cea", name = "e", descriptor = "I")
	public static int anInt1051 = -2;

	@OriginalMember(owner = "client!cea", name = "g", descriptor = "I")
	public static int anInt1053 = 0;

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(Lclient!rga;I)Z")
	public static boolean method1062(@OriginalArg(0) Class315 arg0) {
		return arg0 == null ? false : Static414.method6095(arg0.anInt8206, arg0.anInt8218 - arg0.anInt8216, arg0.anInt8204, arg0.anInt8213 - arg0.anInt8206, arg0.anInt8216, arg0.anInt8210 - arg0.anInt8204);
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(IIIII)Z")
	public static boolean method1063(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if ((Static172.aByteArrayArrayArray23[0][arg3][arg2] & 0x2) != 0) {
			return true;
		} else if ((Static172.aByteArrayArrayArray23[arg0][arg3][arg2] & 0x10) == 0) {
			return arg1 == Static30.method504(arg0, arg2, arg3);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(I)V")
	public static void method1064() {
		@Pc(17) Class5_Sub50 local17;
		for (local17 = (Class5_Sub50) Static631.aClass20_71.method378(); local17 != null; local17 = (Class5_Sub50) Static631.aClass20_71.method366()) {
			if (local17.aBoolean575) {
				local17.method9222();
			} else {
				local17.aBoolean576 = true;
				if (local17.anInt8721 >= 0 && local17.anInt8723 >= 0 && Static271.anInt4910 > local17.anInt8721 && Static613.anInt9909 > local17.anInt8723) {
					Static132.method1957(local17);
				}
			}
		}
		for (local17 = (Class5_Sub50) Static227.aClass20_61.method378(); local17 != null; local17 = (Class5_Sub50) Static227.aClass20_61.method366()) {
			if (local17.aBoolean575) {
				local17.method9222();
			} else {
				local17.aBoolean576 = true;
			}
		}
	}
}

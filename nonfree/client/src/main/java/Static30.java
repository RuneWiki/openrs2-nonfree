import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!ca", name = "S", descriptor = "I")
	public static int anInt497;

	@OriginalMember(owner = "client!ca", name = "Z", descriptor = "Lclient!tj;")
	public static Class103 aClass103_1;

	@OriginalMember(owner = "client!ca", name = "bb", descriptor = "I")
	public static int anInt504;

	@OriginalMember(owner = "client!ca", name = "V", descriptor = "[I")
	public static int[] anIntArray46 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

	@OriginalMember(owner = "client!ca", name = "f", descriptor = "(B)Lclient!fg;")
	public static Class4_Sub3_Sub7 method492() {
		if (Static121.aClass178_12 == null) {
			return null;
		} else {
			Static33.aClass132_1.method3269(Static121.aClass178_12);
			@Pc(24) Class4_Sub3_Sub7 local24 = (Class4_Sub3_Sub7) Static33.aClass132_1.method3268();
			@Pc(29) Class83 local29 = Static142.method2192(local24.anInt1760);
			return local29 != null && local29.aBoolean157 && local29.method1811() ? local24 : Static172.method2726();
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(IB)Lclient!vd;")
	public static Class181 method494(@OriginalArg(0) int arg0) {
		@Pc(10) Class181 local10 = (Class181) Static268.aClass26_54.method518((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(28) byte[] local28 = Static155.aClass58_54.method1372(31, arg0);
		local10 = new Class181();
		if (local28 != null) {
			local10.method4475(new Class4_Sub10(local28), arg0);
		}
		Static268.aClass26_54.method510(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lclient!fh;III)[Lclient!ma;")
	public static Class56[] method495(@OriginalArg(0) Class58 arg0, @OriginalArg(1) int arg1) {
		return Static12.method197(arg0, arg1, 0) ? Static154.method2463() : null;
	}

	@OriginalMember(owner = "client!ca", name = "d", descriptor = "(II)I")
	public static int method496(@OriginalArg(1) int arg0) {
		@Pc(14) int local14 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
		@Pc(25) int local25 = (local14 & 0x33333333) + (local14 >>> 2 & 0xB3333333);
		@Pc(37) int local37 = (local25 >>> 4) + local25 & 0xF0F0F0F;
		@Pc(43) int local43 = local37 + (local37 >>> 8);
		@Pc(49) int local49 = local43 + (local43 >>> 16);
		return local49 & 0xFF;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static28 {

	@OriginalMember(owner = "client!bm", name = "w", descriptor = "Lclient!e;")
	public static Class38 aClass38_1;

	@OriginalMember(owner = "client!bm", name = "x", descriptor = "Lclient!si;")
	public static Class157 aClass157_3;

	@OriginalMember(owner = "client!bm", name = "f", descriptor = "Lclient!jo;")
	public static Class96 aClass96_2 = new Class96();

	@OriginalMember(owner = "client!bm", name = "h", descriptor = "S")
	public static short aShort7 = 1;

	@OriginalMember(owner = "client!bm", name = "v", descriptor = "Z")
	public static boolean aBoolean56 = false;

	@OriginalMember(owner = "client!bm", name = "y", descriptor = "I")
	public static int anInt552 = 0;

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(ILclient!fh;)Lclient!mk;")
	public static Class94_Sub4 method509(@OriginalArg(1) Class1_Sub13 arg0) {
		return new Class94_Sub4(arg0.method1843(), arg0.method1843(), arg0.method1843(), arg0.method1843(), arg0.method1878(), arg0.method1878(), arg0.method1853());
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIIB)Lclient!lk;")
	public static Class1_Sub5_Sub13 method511(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) int local9 = arg2 << 8 | arg1;
		@Pc(27) Class1_Sub5_Sub13 local27 = (Class1_Sub5_Sub13) Static16.aClass112_1.method2951((long) local9 << 16);
		if (local27 != null) {
			return local27;
		}
		@Pc(41) byte[] local41 = Static21.aClass119_6.method3244(Static21.aClass119_6.method3223(local9));
		if (local41 == null) {
			local9 = arg1 | arg0 + 65536 << 8;
			local27 = (Class1_Sub5_Sub13) Static16.aClass112_1.method2951((long) local9 << 16);
			if (local27 != null) {
				return local27;
			}
			local41 = Static21.aClass119_6.method3244(Static21.aClass119_6.method3223(local9));
			if (local41 == null) {
				local9 = arg1 | 0xFFFF00;
				local27 = (Class1_Sub5_Sub13) Static16.aClass112_1.method2951((long) local9 << 16);
				if (local27 != null) {
					return local27;
				}
				local41 = Static21.aClass119_6.method3244(Static21.aClass119_6.method3223(local9));
				if (local41 == null) {
					return null;
				} else if (local41.length > 1) {
					local27 = Static166.method2826(local41);
					local27.anInt3158 = arg1;
					Static16.aClass112_1.method2950((long) local9 << 16, local27);
					return local27;
				} else {
					return null;
				}
			} else if (local41.length <= 1) {
				return null;
			} else {
				local27 = Static166.method2826(local41);
				local27.anInt3158 = arg1;
				Static16.aClass112_1.method2950((long) local9 << 16, local27);
				return local27;
			}
		} else if (local41.length <= 1) {
			return null;
		} else {
			local27 = Static166.method2826(local41);
			local27.anInt3158 = arg1;
			Static16.aClass112_1.method2950((long) local9 << 16, local27);
			return local27;
		}
	}

	@OriginalMember(owner = "client!bm", name = "c", descriptor = "(I)V")
	public static void method513() {
		@Pc(4) int local4 = Static122.method2212();
		if (local4 == 0) {
			Static35.aByteArrayArrayArray2 = null;
			Static96.method1885(0);
		} else if (local4 == 1) {
			Static48.method900((byte) 0);
			Static96.method1885(512);
			if (Static17.aByteArrayArrayArray1 != null) {
				Static56.method1011();
			}
		} else {
			Static48.method900((byte) (Static121.anInt2463 - 4 & 0xFF));
			Static96.method1885(2);
		}
		Static259.anInt4815 = Static132.anInt2608;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(II)I")
	public static int method515(@OriginalArg(1) int arg0) {
		return arg0 >> 11 & 0x7F;
	}
}

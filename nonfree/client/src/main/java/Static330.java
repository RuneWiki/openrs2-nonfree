import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static330 {

	@OriginalMember(owner = "client!qu", name = "e", descriptor = "I")
	public static int anInt5886;

	@OriginalMember(owner = "client!qu", name = "c", descriptor = "[J")
	public static final long[] aLongArray5 = new long[100];

	@OriginalMember(owner = "client!qu", name = "g", descriptor = "I")
	public static final int anInt5888 = 12;

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(Lclient!cr;III)V")
	public static void method4704(@OriginalArg(0) Class41 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == null) {
			return;
		}
		if (arg0.anObjectArray13 != null) {
			@Pc(13) Class2_Sub14 local13 = new Class2_Sub14();
			local13.anObjectArray32 = arg0.anObjectArray13;
			local13.aClass41_5 = arg0;
			Static290.method4227(local13);
		}
		Static21.anInt432 = arg2;
		Static445.anInt7767 = arg0.anInt1660;
		Static248.anInt4731 = arg1;
		Static428.aBoolean637 = true;
		Static255.anInt4805 = arg0.anInt1613;
		Static245.anInt4645 = arg0.anInt1671;
		Static443.anInt7737 = arg0.anInt1683;
		Static217.anInt490 = arg0.anInt1634;
		Static168.method2616(arg0);
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(II)I")
	public static int method4705(@OriginalArg(1) int arg0) {
		return arg0 & 0x7F;
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(IIIII)Z")
	public static boolean method4706(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if ((Static367.aByteArrayArrayArray16[0][arg2][arg1] & 0x2) != 0) {
			return true;
		} else if ((Static367.aByteArrayArrayArray16[arg0][arg2][arg1] & 0x10) == 0) {
			return Static417.method5651(arg0, arg2, arg1) == arg3;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(IIZ)Z")
	public static boolean method4707(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x40000) != 0 | Static418.method5663(arg1, arg0) || Static7.method161(arg0, arg1);
	}
}

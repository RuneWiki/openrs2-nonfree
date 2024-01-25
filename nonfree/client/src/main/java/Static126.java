import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static126 {

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "Lclient!l;")
	public static Class57 aClass57_14;

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "I")
	public static int anInt4403;

	@OriginalMember(owner = "client!ib", name = "d", descriptor = "[C")
	public static final char[] aCharArray6 = new char[128];

	@OriginalMember(owner = "client!ib", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString162 = "shake:";

	@OriginalMember(owner = "client!ib", name = "i", descriptor = "Z")
	public static boolean aBoolean251 = false;

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(III)V")
	public static void method3739(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class184 local14 = Static58.aClass184ArrayArray1[arg0][arg1];
		if (local14 != null) {
			Static227.anInt4641 = local14.anInt5813;
			Static76.anInt1514 = local14.anInt5812;
			Static237.anInt4747 = local14.anInt5807;
		}
		Static277.method4640();
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)I")
	public static int method3740() {
		return Static247.anInt4917;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lclient!qc;BII)V")
	public static void method3741(@OriginalArg(0) Class5_Sub4_Sub4_Sub2 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0.anInt4915 == arg1 && arg1 != -1) {
			@Pc(21) Class131 local21 = Static343.method5604(arg1);
			@Pc(24) int local24 = local21.anInt3986;
			if (local24 == 1) {
				arg0.anInt4903 = 0;
				arg0.anInt4918 = arg2;
				arg0.anInt4937 = 0;
				arg0.anInt4912 = 0;
				arg0.anInt4927 = 1;
				Static161.method2570(arg0.anInt4912, false, arg0.anInt5905, local21, arg0.anInt5901);
			}
			if (local24 == 2) {
				arg0.anInt4937 = 0;
				return;
			}
		} else if (arg1 == -1 || arg0.anInt4915 == -1 || Static343.method5604(arg1).anInt3993 >= Static343.method5604(arg0.anInt4915).anInt3993) {
			arg0.anInt4912 = 0;
			arg0.anInt4918 = arg2;
			arg0.anInt4927 = 1;
			arg0.anInt4903 = 0;
			arg0.anInt4954 = arg0.anInt4958;
			arg0.anInt4937 = 0;
			arg0.anInt4915 = arg1;
			if (arg0.anInt4915 == -1) {
				return;
			}
			Static161.method2570(arg0.anInt4912, false, arg0.anInt5905, Static343.method5604(arg0.anInt4915), arg0.anInt5901);
		}
	}
}

import java.awt.Point;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static108 {

	@OriginalMember(owner = "client!di", name = "r", descriptor = "[J")
	public static long[] aLongArray2;

	@OriginalMember(owner = "client!di", name = "m", descriptor = "Lclient!jb;")
	public static final Class171 aClass171_21 = new Class171(58, 0);

	@OriginalMember(owner = "client!di", name = "o", descriptor = "I")
	public static int anInt2035 = 0;

	@OriginalMember(owner = "client!di", name = "q", descriptor = "Lclient!jb;")
	public static final Class171 aClass171_22 = new Class171(46, 6);

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(I)Lclient!mr;")
	public static Class236_Sub1 method1703() {
		Static155.anInt2867 = 0;
		return Static381.method5370();
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(IB)V")
	public static void method1705(@OriginalArg(0) int arg0) {
		if (Static336.aClass3_Sub41_18.aClass14_Sub3_1.method1528() == 0) {
			arg0 = -1;
		}
		if (Static152.anInt10400 == arg0) {
			return;
		}
		if (arg0 != -1) {
			@Pc(26) Class56 local26 = Static598.aClass175_2.method4026(arg0);
			@Pc(30) Class370 local30 = local26.method1314();
			if (local30 == null) {
				arg0 = -1;
			} else {
				Static566.aClass92_6.method1874(new Point(local26.anInt1502, local26.anInt1505), Static330.aCanvas5, local30.method8600(), local30.method8593(), local30.method8601());
				Static152.anInt10400 = arg0;
			}
		}
		if (arg0 == -1 && Static152.anInt10400 != -1) {
			Static566.aClass92_6.method1874(new Point(), Static330.aCanvas5, (int[]) null, -1, -1);
			Static152.anInt10400 = -1;
		}
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(BII)I")
	public static int method1706(@OriginalArg(2) int arg0) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			return 96;
		} else {
			@Pc(38) int local38 = (arg0 & 0x7F) * 96 >> 7;
			if (local38 < 2) {
				local38 = 2;
			} else if (local38 > 126) {
				local38 = 126;
			}
			return (arg0 & 0xFF80) + local38;
		}
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "()V")
	public static void method1707() {
		Static305.aClass255_2 = Static305.aClass255_3;
	}
}

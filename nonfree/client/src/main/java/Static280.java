import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static280 {

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "Lclient!wc;")
	public static Class1_Sub3_Sub24 aClass1_Sub3_Sub24_8;

	@OriginalMember(owner = "client!uf", name = "l", descriptor = "I")
	public static int anInt5623;

	@OriginalMember(owner = "client!uf", name = "p", descriptor = "Lclient!ea;")
	public static Class41 aClass41_3;

	@OriginalMember(owner = "client!uf", name = "q", descriptor = "Lclient!th;")
	public static Class168 aClass168_191;

	@OriginalMember(owner = "client!uf", name = "s", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame2;

	@OriginalMember(owner = "client!uf", name = "c", descriptor = "Lclient!tf;")
	public static Class167 aClass167_2 = new Class167();

	@OriginalMember(owner = "client!uf", name = "d", descriptor = "Z")
	public static boolean aBoolean353 = true;

	@OriginalMember(owner = "client!uf", name = "k", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray43 = new String[200];

	@OriginalMember(owner = "client!uf", name = "m", descriptor = "I")
	public static int anInt5624 = 0;

	@OriginalMember(owner = "client!uf", name = "n", descriptor = "I")
	public static int anInt5625 = 0;

	@OriginalMember(owner = "client!uf", name = "r", descriptor = "J")
	public static volatile long aLong217 = 0L;

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(IZ)I")
	public static int method4266(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
		@Pc(20) int local20 = (local9 & 0x33333333) + ((local9 & 0xCCCCCCCD) >>> 2);
		@Pc(35) int local35 = (local20 >>> 4) + local20 & 0xF0F0F0F;
		@Pc(45) int local45 = local35 + (local35 >>> 8);
		@Pc(51) int local51 = local45 + (local45 >>> 16);
		return local51 & 0xFF;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(B)V")
	public static void method4267() {
		for (@Pc(11) int local11 = 0; local11 < Static71.anInt1652; local11++) {
			@Pc(18) Class103 local18 = Static119.method1932(local11);
			if (local18 != null && local18.anInt3541 == 0) {
				Static90.anIntArray207[local11] = 0;
				Static296.anIntArray530[local11] = 0;
			}
		}
		Static37.aClass186_4 = new Class186(16);
	}

	@OriginalMember(owner = "client!uf", name = "c", descriptor = "(B)V")
	public static void method4269() {
		for (@Pc(10) Class1_Sub4 local10 = (Class1_Sub4) Static122.aClass26_26.method666(); local10 != null; local10 = (Class1_Sub4) Static122.aClass26_26.method672()) {
			if (local10.anInt909 > 0) {
				local10.anInt909--;
			}
			if (local10.anInt909 != 0) {
				if (local10.anInt901 > 0) {
					local10.anInt901--;
				}
				if (local10.anInt901 == 0 && local10.anInt903 >= 1 && local10.anInt917 >= 1 && local10.anInt903 <= 102 && local10.anInt917 <= 102 && (local10.anInt904 < 0 || Static271.method4106(local10.anInt904, local10.anInt905))) {
					Static121.method1966(local10.anInt916, local10.anInt903, local10.anInt907, local10.anInt904, local10.anInt908, local10.anInt905, local10.anInt917);
					local10.anInt901 = -1;
					if (local10.anInt900 == local10.anInt904 && local10.anInt900 == -1) {
						local10.method4767();
					} else if (local10.anInt904 == local10.anInt900 && local10.anInt911 == local10.anInt916 && local10.anInt905 == local10.anInt915) {
						local10.method4767();
					}
				}
			} else if (local10.anInt900 < 0 || Static271.method4106(local10.anInt900, local10.anInt915)) {
				Static121.method1966(local10.anInt911, local10.anInt903, local10.anInt907, local10.anInt900, local10.anInt908, local10.anInt915, local10.anInt917);
				local10.method4767();
			}
		}
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(ILclient!qm;)V")
	public static void method4270(@OriginalArg(1) Class1_Sub14 arg0) {
		for (@Pc(8) int local8 = 0; local8 < Static250.anInt5103; local8++) {
			@Pc(15) int local15 = arg0.method2187();
			@Pc(19) int local19 = arg0.method2244();
			if (local19 == 65535) {
				local19 = -1;
			}
			if (Static259.aClass80_Sub1Array1[local15] != null) {
				Static259.aClass80_Sub1Array1[local15].anInt2571 = local19;
			}
		}
	}
}

import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static5 {

	@OriginalMember(owner = "client!b", name = "B", descriptor = "Lclient!sc;")
	public static Class5_Sub2_Sub6_Sub4 aClass5_Sub2_Sub6_Sub4_1;

	@OriginalMember(owner = "client!b", name = "b", descriptor = "Lclient!mb;")
	public static Class45 aClass45_41 = Static63.method1251("Ausw-=hlen");

	@OriginalMember(owner = "client!b", name = "g", descriptor = "Lclient!mb;")
	public static Class45 aClass45_42 = Static63.method1251("logo");

	@OriginalMember(owner = "client!b", name = "h", descriptor = "I")
	public static int anInt110 = 0;

	@OriginalMember(owner = "client!b", name = "p", descriptor = "I")
	public static int anInt114 = 0;

	@OriginalMember(owner = "client!b", name = "t", descriptor = "[I")
	public static int[] anIntArray15 = new int[128];

	@OriginalMember(owner = "client!b", name = "w", descriptor = "Lclient!mb;")
	public static Class45 aClass45_43 = Static63.method1251("Ignorieren");

	@OriginalMember(owner = "client!b", name = "x", descriptor = "Lclient!mb;")
	public static Class45 aClass45_44 = Static63.method1251("auf einer freien Welt zu spielen)3");

	@OriginalMember(owner = "client!b", name = "y", descriptor = "Z")
	public static boolean aBoolean6 = false;

	@OriginalMember(owner = "client!b", name = "F", descriptor = "Ljava/util/zip/CRC32;")
	public static CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!b", name = "I", descriptor = "Lclient!mb;")
	public static Class45 aClass45_45 = Static63.method1251("bevor Sie die (WRegelversto-8 melden(W Option benutzen");

	@OriginalMember(owner = "client!b", name = "J", descriptor = "Lclient!mb;")
	public static Class45 aClass45_46 = Static63.method1251("Schlie-8en");

	@OriginalMember(owner = "client!b", name = "c", descriptor = "(B)V")
	public static void method76() {
		for (@Pc(10) Class5_Sub2_Sub4_Sub4 local10 = (Class5_Sub2_Sub4_Sub4) Static96.aClass10_11.method230(); local10 != null; local10 = (Class5_Sub2_Sub4_Sub4) Static96.aClass10_11.method233()) {
			if (local10.anInt1764 != Static8.anInt262 || Static3.anInt94 > local10.anInt1776) {
				local10.method2144();
			} else if (Static3.anInt94 >= local10.anInt1777) {
				if (local10.anInt1757 > 0) {
					@Pc(42) Class5_Sub2_Sub4_Sub3_Sub2 local42 = Static54.aClass5_Sub2_Sub4_Sub3_Sub2Array1[local10.anInt1757 - 1];
					if (local42 != null && local42.anInt2428 >= 0 && local42.anInt2428 < 13312 && local42.anInt2417 >= 0 && local42.anInt2417 < 13312) {
						local10.method1215(Static3.anInt94, local42.anInt2428, Static32.method676(local42.anInt2428, local42.anInt2417, local10.anInt1764) - local10.anInt1753, local42.anInt2417);
					}
				}
				if (local10.anInt1757 < 0) {
					@Pc(91) int local91 = -local10.anInt1757 - 1;
					@Pc(100) Class5_Sub2_Sub4_Sub3_Sub1 local100;
					if (Static73.anInt2175 == local91) {
						local100 = Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1;
					} else {
						local100 = Static34.aClass5_Sub2_Sub4_Sub3_Sub1Array1[local91];
					}
					if (local100 != null && local100.anInt2428 >= 0 && local100.anInt2428 < 13312 && local100.anInt2417 >= 0 && local100.anInt2417 < 13312) {
						local10.method1215(Static3.anInt94, local100.anInt2428, Static32.method676(local100.anInt2428, local100.anInt2417, local10.anInt1764) - local10.anInt1753, local100.anInt2417);
					}
				}
				local10.method1214(Static90.anInt2533);
				Static110.aClass34_1.method923(Static8.anInt262, (int) local10.aDouble6, (int) local10.aDouble5, (int) local10.aDouble8, 60, local10, local10.anInt1765, -1, false);
			}
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(II)Z")
	public static boolean method77(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return false;
		}
		@Pc(19) int local19 = Static2.anIntArray5[arg0];
		if (local19 >= 2000) {
			local19 -= 2000;
		}
		return local19 == 13;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(ILclient!wc;)V")
	public static void method78(@OriginalArg(1) Class5_Sub2_Sub4_Sub3 arg0) {
		@Pc(17) int local17 = arg0.anInt2441 - Static3.anInt94;
		@Pc(27) int local27 = arg0.anInt2429 * 128 + arg0.anInt2440 * 64;
		@Pc(38) int local38 = arg0.anInt2427 * 128 + arg0.anInt2440 * 64;
		if (arg0.anInt2383 == 0) {
			arg0.anInt2393 = 1024;
		}
		arg0.anInt2417 += (local27 - arg0.anInt2417) / local17;
		if (arg0.anInt2383 == 1) {
			arg0.anInt2393 = 1536;
		}
		arg0.anInt2428 += (local38 - arg0.anInt2428) / local17;
		arg0.anInt2443 = 0;
		if (arg0.anInt2383 == 2) {
			arg0.anInt2393 = 0;
		}
		if (arg0.anInt2383 == 3) {
			arg0.anInt2393 = 512;
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IZ)V")
	public static void method79(@OriginalArg(0) int arg0) {
		Static99.method1824(arg0);
		Static33.method686(arg0);
	}

	@OriginalMember(owner = "client!b", name = "d", descriptor = "(B)V")
	public static void method81() {
		aClass45_43 = null;
		aClass45_44 = null;
		aClass45_45 = null;
		aClass45_46 = null;
		aCRC32_1 = null;
		aClass45_41 = null;
		aClass5_Sub2_Sub6_Sub4_1 = null;
		aClass45_42 = null;
		anIntArray15 = null;
	}
}

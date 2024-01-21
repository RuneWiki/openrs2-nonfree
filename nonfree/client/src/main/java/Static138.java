import java.awt.Frame;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static138 {

	@OriginalMember(owner = "client!r", name = "gb", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame1;

	@OriginalMember(owner = "client!r", name = "pb", descriptor = "I")
	public static int anInt3159;

	@OriginalMember(owner = "client!r", name = "hb", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1853 = Static107.method1838("Der Anmelde)2Server ist offline)3");

	@OriginalMember(owner = "client!r", name = "jb", descriptor = "Ljava/math/BigInteger;")
	public static BigInteger aBigInteger2 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@OriginalMember(owner = "client!r", name = "xb", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1860 = Static107.method1838("");

	@OriginalMember(owner = "client!r", name = "ob", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1854 = aClass28_1860;

	@OriginalMember(owner = "client!r", name = "rb", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1855 = aClass28_1860;

	@OriginalMember(owner = "client!r", name = "sb", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1856 = aClass28_1860;

	@OriginalMember(owner = "client!r", name = "ub", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1857 = aClass28_1860;

	@OriginalMember(owner = "client!r", name = "vb", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1858 = Static107.method1838("(Y<)4col>");

	@OriginalMember(owner = "client!r", name = "wb", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1859 = aClass28_1860;

	@OriginalMember(owner = "client!r", name = "zb", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1861 = aClass28_1860;

	@OriginalMember(owner = "client!r", name = "c", descriptor = "(II)I")
	public static int method2169(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "([BIZLclient!hf;)V")
	public static void method2170(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class32 arg2) {
		@Pc(7) Class2_Sub7 local7 = new Class2_Sub7();
		local7.aByteArray12 = arg0;
		local7.anInt972 = 0;
		local7.aClass32_2 = arg2;
		local7.aLong145 = arg1;
		@Pc(30) Class65 local30 = Static67.aClass65_4;
		synchronized (Static67.aClass65_4) {
			Static67.aClass65_4.method2116(local7);
		}
		Static72.method1304();
	}

	@OriginalMember(owner = "client!r", name = "d", descriptor = "(B)V")
	public static void method2171() {
		aClass28_1861 = null;
		aBigInteger2 = null;
		aClass28_1854 = null;
		aClass28_1855 = null;
		aClass28_1860 = null;
		aFrame1 = null;
		aClass28_1856 = null;
		aClass28_1859 = null;
		aClass28_1853 = null;
		aClass28_1857 = null;
		aClass28_1858 = null;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IZI)I")
	public static int method2172(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = 1;
		while (arg0 > 1) {
			if ((arg0 & 0x1) != 0) {
				local12 *= arg1;
			}
			arg0 >>= 0x1;
			arg1 *= arg1;
		}
		if (arg0 == 1) {
			return arg1 * local12;
		} else {
			return local12;
		}
	}
}

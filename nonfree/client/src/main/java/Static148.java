import java.awt.Container;
import java.awt.Insets;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static148 {

	@OriginalMember(owner = "client!nk", name = "e", descriptor = "Ljava/math/BigInteger;")
	public static BigInteger aBigInteger3 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@OriginalMember(owner = "client!nk", name = "l", descriptor = "[S")
	public static short[] aShortArray43 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!nk", name = "m", descriptor = "Lclient!sc;")
	public static Class107 aClass107_860 = Static231.method3737(" weitere Optionen");

	@OriginalMember(owner = "client!nk", name = "p", descriptor = "Lclient!sc;")
	public static Class107 aClass107_861 = Static231.method3737("Musik)2Engine vorbereitet)3");

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(II)V")
	public static void method2424() {
		@Pc(12) Container local12;
		if (Static34.aFrame1 != null) {
			local12 = Static34.aFrame1;
		} else if (Static125.aFrame2 == null) {
			local12 = Static117.aClass34_2.anApplet1;
		} else {
			local12 = Static125.aFrame2;
		}
		Static154.anInt3388 = local12.getSize().width;
		Static209.anInt4462 = local12.getSize().height;
		@Pc(34) Insets local34;
		if (Static125.aFrame2 == local12) {
			local34 = Static125.aFrame2.getInsets();
			Static209.anInt4462 -= local34.bottom + local34.top;
			Static154.anInt3388 -= local34.left + local34.right;
		}
		Static158.anInt3484 = 765;
		Static180.anInt4990 = 503;
		Static18.anInt379 = (Static154.anInt3388 - 765) / 2;
		Static196.anInt4302 = Static42.anInt947;
		Static203.aCanvas3.setSize(Static158.anInt3484, Static180.anInt4990);
		if (Static125.aFrame2 == local12) {
			local34 = Static125.aFrame2.getInsets();
			Static203.aCanvas3.setLocation(Static18.anInt379 + local34.left, Static196.anInt4302 + local34.top);
		} else {
			Static203.aCanvas3.setLocation(Static18.anInt379, Static196.anInt4302);
		}
		if (Static77.anInt1732 != -1) {
			Static154.method2516(true);
		}
		Static130.method2171();
		if (Static53.aString7.startsWith("mac")) {
			Static105.aLong92 = (long) 0 + Static209.method3309();
		}
		Static204.aLong99 = Static209.method3309() + (long) 0;
		if (Static167.aClass82_3 != null && (Static178.anInt3884 == 30 || Static178.anInt3884 == 25)) {
			Static98.method1669();
		}
	}

	@OriginalMember(owner = "client!nk", name = "b", descriptor = "(II)Lclient!bb;")
	public static Class10 method2426(@OriginalArg(1) int arg0) {
		@Pc(10) Class10 local10 = (Class10) Static81.aClass61_27.method1693((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static23.aClass28_11.method819(arg0, 1);
		local10 = new Class10();
		if (local20 != null) {
			local10.method331(new Class1_Sub26(local20), arg0);
		}
		Static81.aClass61_27.method1694((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(ZJ)V")
	public static void method2431(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static175.method2779(arg0 - 1L);
			Static175.method2779(1L);
		} else {
			Static175.method2779(arg0);
		}
	}
}

import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static359 {

	@OriginalMember(owner = "client!mc", name = "d", descriptor = "I")
	public static int anInt6411;

	@OriginalMember(owner = "client!mc", name = "m", descriptor = "[Lclient!nf;")
	public static Class102[] aClass102Array17;

	@OriginalMember(owner = "client!mc", name = "n", descriptor = "Ljava/lang/Thread;")
	public static Thread aThread3;

	@OriginalMember(owner = "client!mc", name = "f", descriptor = "Lclient!fja;")
	public static final Class126 aClass126_121 = new Class126(99, 2);

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "(I)I")
	public static int method5380() {
		return Static418.anInt7055 == 1 ? Static486.anInt8256 : 0;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Ljava/lang/String;B)J")
	public static long method5381(@OriginalArg(0) String arg0) {
		@Pc(7) long local7 = 0L;
		@Pc(10) int local10 = arg0.length();
		for (@Pc(17) int local17 = 0; local17 < local10; local17++) {
			local7 *= 37L;
			@Pc(27) char local27 = arg0.charAt(local17);
			if (local27 >= 'A' && local27 <= 'Z') {
				local7 += (long) (local27 + 1 - 65);
			} else if (local27 >= 'a' && local27 <= 'z') {
				local7 += (long) (local27 + 1 - 97);
			} else if (local27 >= '0' && local27 <= '9') {
				local7 += (long) (local27 + 27 - 48);
			}
			if (local7 >= 177917621779460413L) {
				break;
			}
		}
		while (local7 % 37L == 0L && local7 != 0L) {
			local7 /= 37L;
		}
		return local7;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Ljava/awt/Canvas;I)V")
	public static void method5385(@OriginalArg(0) Canvas arg0) {
		@Pc(6) Dimension local6 = arg0.getSize();
		Static113.method2117(local6.width, local6.height);
		if (Static418.anInt7055 == 1) {
			Static535.aClass16_10.method8118(arg0, Static137.anInt2535, Static554.anInt8569);
		} else {
			Static535.aClass16_10.method8118(arg0, Static224.anInt4089, Static278.anInt5212);
		}
	}
}

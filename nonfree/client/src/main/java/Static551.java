import java.awt.Font;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static551 {

	@OriginalMember(owner = "client!vd", name = "q", descriptor = "Lclient!xa;")
	public static Class13 aClass13_36;

	@OriginalMember(owner = "client!vd", name = "s", descriptor = "Ljava/awt/Font;")
	public static Font aFont2;

	@OriginalMember(owner = "client!vd", name = "n", descriptor = "Lclient!cu;")
	public static final Class61 aClass61_128 = new Class61(65, 3);

	@OriginalMember(owner = "client!vd", name = "r", descriptor = "I")
	public static int anInt9250 = 0;

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(ILclient!rba;)V")
	public static void method7603(@OriginalArg(1) Class4_Sub41 arg0) {
		Static508.aClass124_59.method3275(arg0);
		arg0.anInt7684 = arg0.aClass4_Sub9_Sub1_3.anInt7219;
		arg0.aClass4_Sub9_Sub1_3.anInt7219 = 0;
		Static465.anInt7842 += arg0.anInt7684;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lclient!vj;II)V")
	public static void method7606(@OriginalArg(0) Class10_Sub1_Sub2 arg0, @OriginalArg(1) int arg1) {
		if (arg0.anIntArray651 == null) {
			return;
		}
		@Pc(14) int local14 = arg0.anIntArray651[arg1 + 1];
		if (arg0.anInt8483 == local14) {
			return;
		}
		arg0.anInt8536 = arg0.anInt8537;
		arg0.anInt8483 = local14;
		arg0.anInt8506 = 1;
		arg0.anInt8521 = 0;
		arg0.anInt8468 = 0;
		arg0.anInt8527 = 0;
		if (arg0.anInt8483 != -1) {
			Static240.method4084(arg0.aByte101, arg0.anInt8934, arg0.anInt8929, arg0.anInt8521, Static168.aClass327_2.method7326(arg0.anInt8483), arg0 == Static129.aClass10_Sub1_Sub2_Sub2_1);
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(Z)V")
	public static void method7609() {
		Static302.aClass122_2.method3205();
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(Ljava/lang/String;B)J")
	public static long method7610(@OriginalArg(0) String arg0) {
		@Pc(7) long local7 = 0L;
		@Pc(15) int local15 = arg0.length();
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			local7 *= 37L;
			@Pc(27) char local27 = arg0.charAt(local17);
			if (local27 >= 'A' && local27 <= 'Z') {
				local7 += local27 + 1 - 65;
			} else if (local27 >= 'a' && local27 <= 'z') {
				local7 += local27 + 1 - 97;
			} else if (local27 >= '0' && local27 <= '9') {
				local7 += local27 - 21;
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
}

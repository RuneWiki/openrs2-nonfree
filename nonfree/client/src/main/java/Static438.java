import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static438 {

	@OriginalMember(owner = "client!sb", name = "hc", descriptor = "Lclient!vj;")
	public static final Class305 aClass305_390 = new Class305(75, 5);

	@OriginalMember(owner = "client!sb", name = "oc", descriptor = "I")
	public static int anInt7678 = -1;

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lclient!av;I)V")
	public static void method6792(@OriginalArg(0) Class20_Sub1_Sub1_Sub1 arg0) {
		@Pc(11) Class1_Sub37 local11 = (Class1_Sub37) Static61.aClass230_11.method6144((long) arg0.anInt8969);
		if (local11 == null) {
			Static509.method7776(arg0.anIntArray780[0], null, arg0, null, arg0.anIntArray781[0], 0, arg0.aByte108);
		} else {
			local11.method5395();
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method6793(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(25) String local25 = Static442.method6847(arg0);
		if (local25 == null) {
			return;
		}
		for (@Pc(30) int local30 = 0; local30 < Static508.anInt8897; local30++) {
			@Pc(36) String local36 = Static537.aStringArray44[local30];
			if (local36.startsWith("*")) {
				local36 = local36.substring(1);
			}
			local36 = Static442.method6847(local36);
			if (local36 != null && local36.equals(local25)) {
				Static508.anInt8897--;
				for (@Pc(60) int local60 = local30; local60 < Static508.anInt8897; local60++) {
					Static537.aStringArray44[local60] = Static537.aStringArray44[local60 + 1];
					Static322.aStringArray29[local60] = Static322.aStringArray29[local60 + 1];
					Static515.aStringArray38[local60] = Static515.aStringArray38[local60 + 1];
					Static233.aStringArray24[local60] = Static233.aStringArray24[local60 + 1];
					Static214.aBooleanArray13[local60] = Static214.aBooleanArray13[local60 + 1];
				}
				Static82.anInt1887 = Static209.anInt4108;
				Static216.method3997(Static148.aClass252_48);
				Static259.aClass1_Sub17_Sub2_1.method4451(Static115.method2266(arg0));
				Static259.aClass1_Sub17_Sub2_1.method4464(arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IZLjava/util/Random;)I")
	public static int method6797(@OriginalArg(0) int arg0, @OriginalArg(2) Random arg1) {
		if (arg0 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static329.method5606(arg0)) {
			return (int) (((long) arg1.nextInt() & 0xFFFFFFFFL) * (long) arg0 >> 32);
		} else {
			@Pc(37) int local37 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg0);
			@Pc(45) int local45;
			do {
				local45 = arg1.nextInt();
			} while (local45 >= local37);
			return Static327.method5594(arg0, local45);
		}
	}
}

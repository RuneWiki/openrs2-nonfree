import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static304 {

	@OriginalMember(owner = "client!lda", name = "l", descriptor = "I")
	public static int anInt6063;

	@OriginalMember(owner = "client!lda", name = "c", descriptor = "Z")
	public static boolean aBoolean433 = false;

	@OriginalMember(owner = "client!lda", name = "k", descriptor = "Lclient!pia;")
	public static final Class257 aClass257_58 = new Class257(4, 7);

	@OriginalMember(owner = "client!lda", name = "m", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray18 = new String[100];

	@OriginalMember(owner = "client!lda", name = "b", descriptor = "(B)V")
	public static void method4966() {
		for (@Pc(8) Class8_Sub52 local8 = (Class8_Sub52) Static16.aClass253_3.method6593(); local8 != null; local8 = (Class8_Sub52) Static16.aClass253_3.method6595()) {
			if (local8.aClass2_Sub1_1.method4222()) {
				Static373.method7299(local8.anInt10660);
			} else {
				local8.aClass2_Sub1_1.method4237();
				try {
					local8.aClass2_Sub1_1.method4223();
				} catch (@Pc(35) Exception local35) {
					Static596.method8231("TV: " + local8.anInt10660, local35);
					Static373.method7299(local8.anInt10660);
				}
				if (!local8.aBoolean755 && !local8.aBoolean758) {
					@Pc(63) Class8_Sub19_Sub1 local63 = local8.aClass2_Sub1_1.method4225();
					if (local63 != null) {
						@Pc(69) Class8_Sub16_Sub2 local69 = local63.method2845();
						if (local69 != null) {
							local69.method3690(local8.anInt10658);
							Static15.aClass8_Sub16_Sub5_1.method7442(local69);
							local8.aBoolean755 = true;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(IIZ)B")
	public static byte method4967(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 9) {
			return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(III)Z")
	public static boolean method4968(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x10) != 0;
	}

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(IZIZLjava/lang/String;)V")
	public static void method4969(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) String arg3) {
		Static281.method4758(arg0, null, arg2, false, arg3, arg1);
	}
}

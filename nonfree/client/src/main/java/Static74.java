import java.awt.Font;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static74 {

	@OriginalMember(owner = "client!ej", name = "i", descriptor = "I")
	public static int anInt144;

	@OriginalMember(owner = "client!ej", name = "l", descriptor = "Ljava/awt/Font;")
	public static Font aFont2;

	@OriginalMember(owner = "client!ej", name = "h", descriptor = "Lclient!fi;")
	public static final Class2_Sub10_Sub1 aClass2_Sub10_Sub1_2 = new Class2_Sub10_Sub1(5000);

	@OriginalMember(owner = "client!ej", name = "k", descriptor = "Lclient!on;")
	public static Class146 aClass146_2 = null;

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lclient!dg;B)V")
	public static void method204(@OriginalArg(0) Class2_Sub10 arg0) {
		@Pc(16) byte[] local16 = new byte[24];
		if (Static241.aClass174_5 != null) {
			@Pc(28) int local28;
			try {
				Static241.aClass174_5.method5036(0L);
				Static241.aClass174_5.method5039(local16);
				for (local28 = 0; local28 < 24 && local16[local28] == 0; local28++) {
				}
				if (local28 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(51) Exception local51) {
				for (local28 = 0; local28 < 24; local28++) {
					local16[local28] = -1;
				}
			}
		}
		arg0.method4418(local16, 24);
	}
}

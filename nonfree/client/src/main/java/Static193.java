import java.awt.Canvas;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static193 {

	@OriginalMember(owner = "client!sh", name = "wb", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas4;

	@OriginalMember(owner = "client!sh", name = "U", descriptor = "I")
	public static int anInt3035 = 0;

	@OriginalMember(owner = "client!sh", name = "xb", descriptor = "I")
	public static int anInt3061 = 0;

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(BLclient!pg;)V")
	public static void method2473(@OriginalArg(1) Class1_Sub17 arg0) {
		@Pc(8) byte[] local8 = new byte[24];
		if (Static93.aClass53_2 != null) {
			@Pc(24) int local24;
			try {
				Static93.aClass53_2.method1441(0L);
				Static93.aClass53_2.method1442(local8);
				for (local24 = 0; local24 < 24 && local8[local24] == 0; local24++) {
				}
				if (local24 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(47) Exception local47) {
				for (local24 = 0; local24 < 24; local24++) {
					local8[local24] = -1;
				}
			}
		}
		arg0.method2158(local8, 24);
	}
}

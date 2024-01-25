import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static420 {

	@OriginalMember(owner = "client!paa", name = "b", descriptor = "[I")
	public static int[] anIntArray514;

	@OriginalMember(owner = "client!paa", name = "c", descriptor = "I")
	public static int anInt7644 = 0;

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(II)I")
	public static int method6395(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			local5 += 16;
			arg0 >>>= 0x10;
		}
		if (arg0 >= 256) {
			arg0 >>>= 0x8;
			local5 += 8;
		}
		if (arg0 >= 16) {
			local5 += 4;
			arg0 >>>= 0x4;
		}
		if (arg0 >= 4) {
			arg0 >>>= 0x2;
			local5 += 2;
		}
		if (arg0 >= 1) {
			local5++;
			arg0 >>>= 0x1;
		}
		return arg0 + local5;
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;B)V")
	public static void method6396(@OriginalArg(0) String arg0, @OriginalArg(1) Throwable arg1) {
		try {
			@Pc(5) String local5 = "";
			if (arg1 != null) {
				local5 = Static512.method7216(arg1);
			}
			if (arg0 != null) {
				if (arg1 != null) {
					local5 = local5 + " | ";
				}
				local5 = local5 + arg0;
			}
			Static374.method5648(local5);
			local5 = Static334.method5172(":", local5, "%3a");
			local5 = Static334.method5172("@", local5, "%40");
			local5 = Static334.method5172("&", local5, "%26");
			local5 = Static334.method5172("#", local5, "%23");
			if (Static193.anApplet1 != null) {
				@Pc(99) Class26 local99 = Static22.aClass359_8.method8274(new URL(Static193.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static80.anInt1718 + "&u=" + Static318.aLong172 + "&v1=" + Static604.aString95 + "&v2=" + Static604.aString96 + "&e=" + local5));
				while (local99.anInt762 == 0) {
					Static57.method1062(1L);
				}
				if (local99.anInt762 == 1) {
					@Pc(114) DataInputStream local114 = (DataInputStream) local99.anObject3;
					local114.read();
					local114.close();
				}
			}
		} catch (@Pc(121) Exception local121) {
		}
	}
}

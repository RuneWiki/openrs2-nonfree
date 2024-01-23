import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static44 {

	@OriginalMember(owner = "client!de", name = "l", descriptor = "Lclient!kb;")
	public static Class83 aClass83_29;

	@OriginalMember(owner = "client!de", name = "b", descriptor = "[I")
	public static int[] anIntArray119 = new int[100];

	@OriginalMember(owner = "client!de", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString44 = "Please wait...";

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Lclient!gn;B)V")
	public static void method951(@OriginalArg(0) Class66 arg0) {
		Static20.anInt5576 = 3;
		Static15.method319(true);
		Static45.aBoolean75 = true;
		Static275.anInt5914 = 0;
		Static171.anInt3870 = 0;
		Static135.aBoolean154 = true;
		Static210.anInt4682 = 127;
		Static265.anInt5769 = 2;
		Static10.aBoolean12 = true;
		Static135.aBoolean157 = true;
		Static263.aBoolean302 = true;
		Static53.aBoolean84 = true;
		Static119.aBoolean141 = true;
		Static180.anInt4075 = 0;
		Static11.anInt2931 = 127;
		Static153.aBoolean183 = true;
		Static70.aBoolean96 = true;
		Static50.aBoolean80 = true;
		Static64.aBoolean92 = true;
		Static239.anInt5264 = 255;
		@Pc(53) Class97 local53 = null;
		Static8.anInt4429 = 0;
		if (Static98.anInt2197 < 96) {
			Static155.method2876(0);
		} else {
			Static155.method2876(2);
		}
		Static205.aBoolean243 = false;
		Static265.anInt5770 = 0;
		Static204.anInt4555 = 0;
		Static111.aBoolean136 = true;
		Static272.anInt5852 = 0;
		Static157.aBoolean187 = false;
		Static28.aBoolean42 = false;
		try {
			@Pc(85) Class43 local85 = arg0.method1606("runescape");
			while (local85.anInt1456 == 0) {
				Static230.method4022(1L);
			}
			if (local85.anInt1456 == 1) {
				local53 = (Class97) local85.anObject3;
				@Pc(112) byte[] local112 = new byte[(int) local53.method2932()];
				@Pc(133) int local133;
				for (@Pc(114) int local114 = 0; local114 < local112.length; local114 += local133) {
					local133 = local53.method2929(local114, local112.length - local114, local112);
					if (local133 == -1) {
						throw new IOException("EOF");
					}
				}
				Static79.method1423(new Class1_Sub16(local112));
			}
		} catch (@Pc(156) Exception local156) {
		}
		try {
			if (local53 != null) {
				local53.method2931();
			}
		} catch (@Pc(164) Exception local164) {
		}
	}
}

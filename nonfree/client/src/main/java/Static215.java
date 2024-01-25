import java.io.IOException;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static215 {

	@OriginalMember(owner = "client!kv", name = "i", descriptor = "B")
	public static byte aByte71;

	@OriginalMember(owner = "client!kv", name = "d", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray26 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

	@OriginalMember(owner = "client!kv", name = "g", descriptor = "I")
	public static int anInt3998 = 0;

	@OriginalMember(owner = "client!kv", name = "h", descriptor = "Lclient!hn;")
	public static final Class107 aClass107_121 = new Class107(91, 6);

	@OriginalMember(owner = "client!kv", name = "j", descriptor = "Lclient!ie;")
	public static final Class112 aClass112_3 = new Class112("RC", 1);

	@OriginalMember(owner = "client!kv", name = "k", descriptor = "Lclient!hn;")
	public static final Class107 aClass107_122 = new Class107(64, 1);

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(B)V")
	public static void method3371() {
		@Pc(5) Class222 local5 = null;
		try {
			@Pc(15) Class9 local15 = Static77.aClass180_1.method4083("3", false);
			while (local15.anInt368 == 0) {
				Static224.method3441(1L);
			}
			if (local15.anInt368 == 2) {
				throw new RuntimeException("Error opening file");
			}
			local5 = (Class222) local15.anObject2;
			@Pc(43) byte[] local43 = new byte[(int) local5.method4984()];
			if (local43.length == 0) {
				Static329.aString54 = "";
				Static372.aString64 = "";
			} else {
				@Pc(65) int local65;
				for (@Pc(53) int local53 = 0; local53 < local43.length; local53 += local65) {
					local65 = local5.method4983(local53, local43, local43.length - local53);
					if (local65 == -1) {
						throw new IOException("EOF");
					}
				}
				@Pc(91) Class1_Sub5 local91 = new Class1_Sub5(local43);
				@Pc(95) int local95 = local91.method5366();
				if (local95 > 50) {
					throw new RuntimeException("Bad length");
				}
				local91.anInt6475 = local95 + 1;
				if (!local91.method5402()) {
					throw new RuntimeException("Invalid CRC");
				}
				local91.anInt6475 = 1;
				@Pc(126) int local126 = local91.method5366();
				if (local126 != 0) {
					throw new RuntimeException("Invalid version " + local126);
				}
				Static372.aString64 = local91.method5410();
				Static329.aString54 = local91.method5410();
			}
		} catch (@Pc(152) Exception local152) {
			Static329.aString54 = "";
			Static372.aString64 = "";
		}
		try {
			if (local5 != null) {
				local5.method4988();
			}
		} catch (@Pc(163) Exception local163) {
		}
	}

	@OriginalMember(owner = "client!kv", name = "b", descriptor = "(I)V")
	public static void method3373() {
		Static92.aClass1_Sub5_Sub1_1.method5417(Static219.aClass246_121.method5483());
		Static92.aClass1_Sub5_Sub1_1.method5417(Static171.aClass246_99.method5483());
		Static92.aClass1_Sub5_Sub1_1.method5417(Static94.aClass246_56.method5483());
		Static92.aClass1_Sub5_Sub1_1.method5417(Static320.aClass246_197.method5483());
		Static92.aClass1_Sub5_Sub1_1.method5417(Static30.aClass246_24.method5483());
		Static92.aClass1_Sub5_Sub1_1.method5417(Static334.aClass246_179.method5483());
		Static92.aClass1_Sub5_Sub1_1.method5417(Static312.aClass246_168.method5483());
		Static92.aClass1_Sub5_Sub1_1.method5417(Static144.aClass246_86.method5483());
		Static92.aClass1_Sub5_Sub1_1.method5417(Static345.aClass246_187.method5483());
		Static92.aClass1_Sub5_Sub1_1.method5417(Static51.aClass246_225.method5483());
		Static92.aClass1_Sub5_Sub1_1.method5417(Static69.aClass246_43.method5483());
		Static92.aClass1_Sub5_Sub1_1.method5417(Static243.aClass246_136.method5483());
		Static92.aClass1_Sub5_Sub1_1.method5417(Static105.aClass246_64.method5483());
		Static92.aClass1_Sub5_Sub1_1.method5417(Static319.aClass246_127.method5483());
		Static92.aClass1_Sub5_Sub1_1.method5417(Static261.aClass246_145.method5483());
		Static92.aClass1_Sub5_Sub1_1.method5417(Static209.aClass246_117.method5483());
		Static92.aClass1_Sub5_Sub1_1.method5417(Static95.aClass246_59.method5483());
		Static92.aClass1_Sub5_Sub1_1.method5417(Static444.aClass246_219.method5483());
		Static92.aClass1_Sub5_Sub1_1.method5417(Static154.aClass246_206.method5483());
		Static92.aClass1_Sub5_Sub1_1.method5417(Static113.aClass246_73.method5483());
		Static92.aClass1_Sub5_Sub1_1.method5417(Static166.aClass246_94.method5483());
		Static92.aClass1_Sub5_Sub1_1.method5417(Static408.aClass246_209.method5483());
		Static92.aClass1_Sub5_Sub1_1.method5417(Static187.aClass246_111.method5483());
		Static92.aClass1_Sub5_Sub1_1.method5417(Static86.aClass246_54.method5483());
		Static92.aClass1_Sub5_Sub1_1.method5417(Static74.aClass246_48.method5483());
		Static92.aClass1_Sub5_Sub1_1.method5417(Static351.aClass246_188.method5483());
		Static92.aClass1_Sub5_Sub1_1.method5417(Static304.aClass246_164.method5483());
		Static92.aClass1_Sub5_Sub1_1.method5417(Static276.aClass246_155.method5483());
		Static92.aClass1_Sub5_Sub1_1.method5417(Static135.aClass246_85.method5483());
		Static92.aClass1_Sub5_Sub1_1.method5417(Static213.aClass246_120.method5483());
	}
}

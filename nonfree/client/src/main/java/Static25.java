import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static25 {

	@OriginalMember(owner = "client!ar", name = "d", descriptor = "Lclient!bl;")
	public static Class39 aClass39_4;

	@OriginalMember(owner = "client!ar", name = "e", descriptor = "I")
	public static int anInt8653;

	@OriginalMember(owner = "client!ar", name = "l", descriptor = "I")
	public static final int anInt8656 = 50;

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "[I")
	public static final int[] anIntArray639 = new int[anInt8656];

	@OriginalMember(owner = "client!ar", name = "b", descriptor = "[I")
	public static final int[] anIntArray640 = new int[anInt8656];

	@OriginalMember(owner = "client!ar", name = "f", descriptor = "[I")
	public static final int[] anIntArray641 = new int[anInt8656];

	@OriginalMember(owner = "client!ar", name = "g", descriptor = "[I")
	public static final int[] anIntArray642 = new int[anInt8656];

	@OriginalMember(owner = "client!ar", name = "i", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray47 = new String[anInt8656];

	@OriginalMember(owner = "client!ar", name = "k", descriptor = "[I")
	public static final int[] anIntArray643 = new int[anInt8656];

	@OriginalMember(owner = "client!ar", name = "m", descriptor = "[I")
	public static final int[] anIntArray644 = new int[anInt8656];

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(ILjava/lang/Throwable;Ljava/lang/String;)V")
	public static void method7457(@OriginalArg(1) Throwable arg0, @OriginalArg(2) String arg1) {
		try {
			@Pc(5) String local5 = "";
			if (arg0 != null) {
				local5 = Static495.method8505(arg0);
			}
			if (arg1 != null) {
				if (arg0 != null) {
					local5 = local5 + " | ";
				}
				local5 = local5 + arg1;
			}
			Static553.method7816(local5);
			local5 = Static516.method7304("%3a", local5, ":");
			local5 = Static516.method7304("%40", local5, "@");
			local5 = Static516.method7304("%26", local5, "&");
			local5 = Static516.method7304("%23", local5, "#");
			if (Static231.anApplet2 != null) {
				@Pc(102) Class319 local102 = Static575.aClass286_4.method6582(new URL(Static231.anApplet2.getCodeBase(), "clienterror.ws?c=" + Static375.anInt6456 + "&u=" + (Static191.aString34 == null ? String.valueOf(Static407.aLong181) : Static191.aString34) + "&v1=" + Static465.aString69 + "&v2=" + Static465.aString66 + "&e=" + local5));
				while (local102.anInt8562 == 0) {
					Static440.method6322(1L);
				}
				if (local102.anInt8562 == 1) {
					@Pc(119) DataInputStream local119 = (DataInputStream) local102.anObject19;
					local119.read();
					local119.close();
				}
			}
		} catch (@Pc(126) Exception local126) {
		}
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(I[BBI)Ljava/lang/String;")
	public static String method7463(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(8) char[] local8 = new char[arg0];
		@Pc(18) int local18 = 0;
		@Pc(20) int local20 = arg2;
		@Pc(24) int local24 = arg0 + arg2;
		while (local20 < local24) {
			@Pc(33) int local33 = arg1[local20++] & 0xFF;
			@Pc(69) int local69;
			if (local33 >= 128) {
				if (local33 < 192) {
					local69 = 65533;
				} else if (local33 < 224) {
					if (local24 > local20 && (arg1[local20] & 0xC0) == 128) {
						local69 = arg1[local20++] & 0x3F | (local33 & 0x1F) << 6;
						if (local69 < 128) {
							local69 = 65533;
						}
					} else {
						local69 = 65533;
					}
				} else if (local33 < 240) {
					if (local24 > local20 + 1 && (arg1[local20] & 0xC0) == 128 && (arg1[local20 + 1] & 0xC0) == 128) {
						local69 = (arg1[local20++] & 0x3F) << 6 | (local33 & 0xF) << 12 | arg1[local20++] & 0x3F;
						if (local69 < 2048) {
							local69 = 65533;
						}
					} else {
						local69 = 65533;
					}
				} else if (local33 >= 248) {
					local69 = 65533;
				} else if (local24 > local20 + 2 && (arg1[local20] & 0xC0) == 128 && (arg1[local20 + 1] & 0xC0) == 128 && (arg1[local20 + 2] & 0xC0) == 128) {
					local69 = (arg1[local20++] & 0x3F) << 12 | (local33 & 0x7) << 18 | (arg1[local20++] & 0x3F) << 6 | arg1[local20++] & 0x3F;
					if (local69 >= 65536 && local69 <= 1114111) {
						local69 = 65533;
					} else {
						local69 = 65533;
					}
				} else {
					local69 = 65533;
				}
			} else if (local33 == 0) {
				local69 = 65533;
			} else {
				local69 = local33;
			}
			local8[local18++] = (char) local69;
		}
		return new String(local8, 0, local18);
	}
}

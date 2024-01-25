import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static161 {

	@OriginalMember(owner = "client!js", name = "i", descriptor = "I")
	public static int anInt3258;

	@OriginalMember(owner = "client!js", name = "k", descriptor = "[I")
	public static final int[] anIntArray276 = new int[500];

	@OriginalMember(owner = "client!js", name = "r", descriptor = "I")
	public static int anInt3262 = 1;

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(II)V")
	public static void method3038(@OriginalArg(0) int arg0) {
		Static264.anInt5417 = arg0;
		@Pc(11) Class119 local11 = Static287.aClass119_173;
		synchronized (Static287.aClass119_173) {
			Static287.aClass119_173.method3304();
		}
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(Lclient!on;BII)V")
	public static void method3039(@OriginalArg(0) Class146 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		Static343.aClass146_17 = arg0;
		Static188.anInt4005 = arg1;
		Static20.anInt438 = arg2;
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(III[B)Ljava/lang/String;")
	public static String method3040(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(16) char[] local16 = new char[arg0];
		@Pc(18) int local18 = 0;
		for (@Pc(20) int local20 = 0; local20 < arg0; local20++) {
			@Pc(31) int local31 = arg2[arg1 + local20] & 0xFF;
			if (local31 != 0) {
				if (local31 >= 128 && local31 < 160) {
					@Pc(48) char local48 = Static47.aCharArray3[local31 - 128];
					if (local48 == '\u0000') {
						local48 = '?';
					}
					local31 = local48;
				}
				local16[local18++] = (char) local31;
			}
		}
		return new String(local16, 0, local18);
	}
}

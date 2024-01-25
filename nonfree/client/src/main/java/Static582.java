import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static582 {

	@OriginalMember(owner = "client!un", name = "m", descriptor = "[I")
	public static int[] anIntArray753;

	@OriginalMember(owner = "client!un", name = "g", descriptor = "Lclient!hda;")
	public static final Class136 aClass136_181 = new Class136(16, 2);

	@OriginalMember(owner = "client!un", name = "q", descriptor = "Lclient!kaa;")
	public static final Class181 aClass181_89 = new Class181(59, 3);

	@OriginalMember(owner = "client!un", name = "s", descriptor = "Lclient!hda;")
	public static final Class136 aClass136_182 = new Class136(6, 2);

	@OriginalMember(owner = "client!un", name = "t", descriptor = "Lclient!qda;")
	public static final Class281 aClass281_20 = new Class281(1);

	@OriginalMember(owner = "client!un", name = "u", descriptor = "I")
	public static int anInt9526 = -50;

	@OriginalMember(owner = "client!un", name = "a", descriptor = "([BLjava/lang/String;II)I")
	public static int method8171(@OriginalArg(0) byte[] arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(15) int local15 = arg1.length();
		for (@Pc(17) int local17 = 0; local17 < local15; local17 += 4) {
			@Pc(25) int local25 = Static240.method3661(arg1.charAt(local17));
			@Pc(44) int local44 = local17 + 1 < local15 ? Static240.method3661(arg1.charAt(local17 + 1)) : -1;
			@Pc(59) int local59 = local17 + 2 >= local15 ? -1 : Static240.method3661(arg1.charAt(local17 + 2));
			@Pc(76) int local76 = local15 > local17 + 3 ? Static240.method3661(arg1.charAt(local17 + 3)) : -1;
			arg0[arg2++] = (byte) (local44 >>> 4 | local25 << 2);
			if (local59 == -1) {
				break;
			}
			arg0[arg2++] = (byte) ((local44 & 0xF) << 4 | local59 >>> 2);
			if (local76 == -1) {
				break;
			}
			arg0[arg2++] = (byte) ((local59 & 0x3) << 6 | local76);
		}
		return arg2;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(ILclient!ee;I)V")
	public static void method8175(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub12 arg1) {
		if (Static423.aClass64_4 == null) {
			return;
		}
		try {
			Static423.aClass64_4.method1309(0L);
			Static423.aClass64_4.method1310(24, arg1.aByteArray104, arg0);
		} catch (@Pc(14) Exception local14) {
		}
	}

	@OriginalMember(owner = "client!un", name = "c", descriptor = "(I)V")
	public static void method8176() {
		Static204.anInt3598 = 0;
		Static77.anInt1289 = 0;
		Static287.anInt4692 = 0;
		Static394.anInt6872 = 0;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(IIIIILjava/lang/String;II)V")
	public static void method8177(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) String arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(14) Class14_Sub3 local14 = new Class14_Sub3();
		local14.anInt485 = arg3;
		local14.anInt488 = arg6;
		local14.anInt487 = arg0;
		local14.aString7 = arg4;
		local14.anInt480 = arg2;
		local14.anInt482 = arg1 + Static235.anInt3998;
		local14.anInt484 = arg5;
		Static41.aClass363_1.method8480(local14);
	}
}

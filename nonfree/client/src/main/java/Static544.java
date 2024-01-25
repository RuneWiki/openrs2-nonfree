import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static544 {

	@OriginalMember(owner = "client!ut", name = "Jb", descriptor = "I")
	public static int anInt9957;

	@OriginalMember(owner = "client!ut", name = "Db", descriptor = "Ljava/lang/String;")
	public static String aString215 = "";

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "([Lclient!f;B)V")
	public static void method7626(@OriginalArg(0) Class88[] arg0) {
		Static111.anInt2565 = arg0.length;
		Static393.aClass88Array9 = new Class88[Static111.anInt2565 + 10];
		Static44.anIntArray33 = new int[Static111.anInt2565 + 10];
		Static599.method3061(arg0, 0, Static393.aClass88Array9, 0, Static111.anInt2565);
		for (@Pc(39) int local39 = 0; local39 < Static111.anInt2565; local39++) {
			Static44.anIntArray33[local39] = Static393.aClass88Array9[local39].ca();
		}
		for (@Pc(58) int local58 = Static111.anInt2565; local58 < Static393.aClass88Array9.length; local58++) {
			Static44.anIntArray33[local58] = 12;
		}
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(III[BII[BII)V")
	public static void method7635(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) byte[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(10) int local10 = -(arg1 >> 2);
		@Pc(15) int local15 = -(arg1 & 0x3);
		for (@Pc(18) int local18 = -arg7; local18 < 0; local18++) {
			@Pc(26) int local26;
			for (@Pc(22) int local22 = local10; local22 < 0; local22++) {
				local26 = arg6++;
				arg5[local26] = (byte) (arg5[local26] - arg2[arg3++]);
				@Pc(39) int local39 = arg6++;
				arg5[local39] = (byte) (arg5[local39] - arg2[arg3++]);
				@Pc(52) int local52 = arg6++;
				arg5[local52] = (byte) (arg5[local52] - arg2[arg3++]);
				@Pc(65) int local65 = arg6++;
				arg5[local65] = (byte) (arg5[local65] - arg2[arg3++]);
			}
			for (@Pc(81) int local81 = local15; local81 < 0; local81++) {
				local26 = arg6++;
				arg5[local26] = (byte) (arg5[local26] - arg2[arg3++]);
			}
			arg6 += arg4;
			arg3 += arg0;
		}
	}
}

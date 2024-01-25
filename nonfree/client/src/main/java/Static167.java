import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static167 {

	@OriginalMember(owner = "client!gca", name = "E", descriptor = "Lclient!tf;")
	public static Class322 aClass322_68;

	@OriginalMember(owner = "client!gca", name = "z", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray15 = new String[200];

	@OriginalMember(owner = "client!gca", name = "C", descriptor = "Z")
	public static final boolean aBoolean262 = false;

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(ILclient!ce;)V")
	public static void method3010(@OriginalArg(1) Class3_Sub11_Sub1 arg0) {
		for (@Pc(13) int local13 = 0; local13 < Static485.anInt7939; local13++) {
			@Pc(19) int local19 = Static29.anIntArray560[local13];
			@Pc(23) Class41_Sub2_Sub1_Sub4_Sub2 local23 = Static220.aClass41_Sub2_Sub1_Sub4_Sub2Array1[local19];
			@Pc(27) int local27 = arg0.method5175();
			if ((local27 & 0x80) != 0) {
				local27 += arg0.method5175() << 8;
			}
			if ((local27 & 0x800) != 0) {
				local27 += arg0.method5175() << 16;
			}
			Static548.method7290(local23, arg0, local19, local27);
		}
	}
}

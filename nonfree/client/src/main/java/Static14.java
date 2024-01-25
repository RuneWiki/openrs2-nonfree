import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static14 {

	@OriginalMember(owner = "client!ai", name = "m", descriptor = "I")
	public static int anInt274;

	@OriginalMember(owner = "client!ai", name = "k", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray1 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "([SII)[S")
	public static short[] method365(@OriginalArg(0) short[] arg0, @OriginalArg(2) int arg1) {
		@Pc(11) short[] local11 = new short[arg1];
		Static650.method2271(arg0, 0, local11, 0, arg1);
		return local11;
	}

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "(I)V")
	public static void method366() {
		if (!Static405.aBoolean494) {
			Static583.aBoolean679 = true;
			Static383.aFloat185 += (-24.0F - Static383.aFloat185) / 2.0F;
			Static405.aBoolean494 = true;
		}
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(ZLclient!ei;)V")
	public static void method367(@OriginalArg(1) Class2_Sub17_Sub1 arg0) {
		for (@Pc(5) int local5 = 0; local5 < Static136.anInt2909; local5++) {
			@Pc(10) int local10 = Static494.anIntArray565[local5];
			@Pc(14) Class16_Sub1_Sub1_Sub3_Sub2 local14 = Static91.aClass16_Sub1_Sub1_Sub3_Sub2Array1[local10];
			@Pc(18) int local18 = arg0.method2859();
			if ((local18 & 0x10) != 0) {
				local18 += arg0.method2859() << 8;
			}
			if ((local18 & 0x400) != 0) {
				local18 += arg0.method2859() << 16;
			}
			Static451.method6420(arg0, local14, local18, local10);
		}
	}
}

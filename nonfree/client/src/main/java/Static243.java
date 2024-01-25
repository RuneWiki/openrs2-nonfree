import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static243 {

	@OriginalMember(owner = "client!m", name = "w", descriptor = "[I")
	public static int[] anIntArray443;

	@OriginalMember(owner = "client!m", name = "C", descriptor = "Lclient!o;")
	public static Class80 aClass80_10;

	@OriginalMember(owner = "client!m", name = "I", descriptor = "I")
	public static int anInt4413;

	@OriginalMember(owner = "client!m", name = "z", descriptor = "Lclient!s;")
	public static final Class217 aClass217_99 = new Class217(74, 2);

	@OriginalMember(owner = "client!m", name = "D", descriptor = "[I")
	public static final int[] anIntArray444 = new int[] { -1, -1, 1, 1 };

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(Ljava/lang/String;IIIIIII)V")
	public static void method3553(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(12) Class40_Sub4 local12 = new Class40_Sub4();
		local12.anInt4015 = arg4;
		local12.anInt4021 = arg6;
		local12.anInt4017 = arg1;
		local12.aString32 = arg0;
		local12.anInt4022 = arg3;
		local12.anInt4023 = arg5;
		local12.anInt4016 = Static400.anInt6752 + arg2;
		Static124.aClass240_1.method5225(local12);
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(ILclient!lt;IZII)Ljava/awt/Frame;")
	public static Frame method3555(@OriginalArg(0) int arg0, @OriginalArg(1) Class159 arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		if (!arg1.method3510()) {
			return null;
		}
		@Pc(17) Class256[] local17 = Static115.method2030(arg1);
		if (local17 == null) {
			return null;
		}
		@Pc(23) boolean local23 = false;
		for (@Pc(25) int local25 = 0; local25 < local17.length; local25++) {
			if (arg2 == local17[local25].anInt7177 && local17[local25].anInt7176 == arg0 && (!local23 || local17[local25].anInt7175 > arg3)) {
				local23 = true;
				arg3 = local17[local25].anInt7175;
			}
		}
		if (!local23) {
			return null;
		}
		@Pc(96) Class270 local96 = arg1.method3511(arg0, arg3, arg2);
		while (local96.anInt7548 == 0) {
			Static328.method5696(10L);
		}
		@Pc(111) Frame local111 = (Frame) local96.anObject9;
		if (local111 == null) {
			return null;
		} else if (local96.anInt7548 == 2) {
			Static429.method5679(arg1, local111);
			return null;
		} else {
			return local111;
		}
	}
}

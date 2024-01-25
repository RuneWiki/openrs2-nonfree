import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static170 {

	@OriginalMember(owner = "client!fu", name = "E", descriptor = "Lclient!fa;")
	public static final Class89 aClass89_13 = new Class89(8, 0, 4, 1);

	@OriginalMember(owner = "client!fu", name = "b", descriptor = "(III)V")
	public static void method3131(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class274 local14 = Static476.aClass274ArrayArray4[arg0][arg1];
		if (local14 != null) {
			Static324.anInt6183 = local14.anInt8206;
			Static574.anInt9637 = local14.anInt8205;
			Static439.anInt6758 = local14.anInt8203;
		}
		Static309.method5212();
	}
}

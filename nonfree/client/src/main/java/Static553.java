import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static553 {

	@OriginalMember(owner = "client!vaa", name = "L", descriptor = "I")
	public static int anInt9056;

	@OriginalMember(owner = "client!vaa", name = "rb", descriptor = "[[F")
	public static final float[][] aFloatArrayArray15 = new float[][] { { -0.333333F, -0.333333F, -0.333333F }, { 0.333333F, -0.333333F, -0.333333F }, { -0.333333F, 0.333333F, -0.333333F }, { 0.333333F, 0.333333F, -0.333333F }, { -0.333333F, -0.333333F, 0.333333F }, { 0.333333F, -0.333333F, 0.333333F }, { -0.333333F, 0.333333F, 0.333333F }, { 0.333333F, 0.333333F, 0.333333F } };

	@OriginalMember(owner = "client!vaa", name = "xb", descriptor = "I")
	public static int anInt9074 = 0;

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(III)V")
	public static void method7568(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class2_Sub3_Sub13 local8 = Static382.method5650(1, arg0);
		local8.method6098();
		local8.anInt7258 = arg1;
	}
}

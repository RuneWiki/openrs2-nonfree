import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static112 {

	@OriginalMember(owner = "client!dw", name = "e", descriptor = "Ljava/lang/Object;")
	public static Object anObject11;

	@OriginalMember(owner = "client!dw", name = "b", descriptor = "[[F")
	public static final float[][] aFloatArrayArray1 = new float[][] { { -0.333333F, -0.333333F, -0.333333F }, { 0.333333F, -0.333333F, -0.333333F }, { -0.333333F, 0.333333F, -0.333333F }, { 0.333333F, 0.333333F, -0.333333F }, { -0.333333F, -0.333333F, 0.333333F }, { 0.333333F, -0.333333F, 0.333333F }, { -0.333333F, 0.333333F, 0.333333F }, { 0.333333F, 0.333333F, 0.333333F } };

	@OriginalMember(owner = "client!dw", name = "g", descriptor = "I")
	public static int anInt3033 = -1;

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(BII)Z")
	public static boolean method2834(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x70000) != 0 | Static124.method9247(arg1, arg0) || Static611.method9090(arg0, arg1);
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(BLclient!cea;)Lclient!wg;")
	public static Class362_Sub1 method2835(@OriginalArg(1) Class2_Sub11 arg0) {
		@Pc(14) Class362 local14 = Static625.method9092(arg0);
		@Pc(18) int local18 = arg0.method8365();
		return new Class362_Sub1(local14.anInt10885, local14.aClass309_13, local14.aClass86_13, local14.anInt10880, local14.anInt10881, local18);
	}
}

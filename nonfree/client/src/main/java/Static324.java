import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static324 {

	@OriginalMember(owner = "client!ln", name = "g", descriptor = "[I")
	public static int[] anIntArray381;

	@OriginalMember(owner = "client!ln", name = "j", descriptor = "Lclient!mq;")
	public static final Class218 aClass218_78 = new Class218(43, 1);

	@OriginalMember(owner = "client!ln", name = "l", descriptor = "I")
	public static int anInt6510 = 0;

	@OriginalMember(owner = "client!ln", name = "o", descriptor = "I")
	public static int anInt6511 = 0;

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(I)[Lclient!kfa;")
	public static Class178[] method5445() {
		return new Class178[] { Static618.aClass178_13, Static566.aClass178_11, Static268.aClass178_7 };
	}

	@OriginalMember(owner = "client!ln", name = "b", descriptor = "(III)Lclient!td;")
	public static Class2_Sub3_Sub2 method5448(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class106 local7 = Static170.aClass106ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass2_Sub3_Sub2_1;
	}
}

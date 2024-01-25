import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static210 {

	@OriginalMember(owner = "client!hq", name = "u", descriptor = "[Lclient!f;")
	public static Class38[] aClass38Array12;

	@OriginalMember(owner = "client!hq", name = "x", descriptor = "I")
	public static int anInt3051;

	@OriginalMember(owner = "client!hq", name = "F", descriptor = "[[B")
	public static byte[][] aByteArrayArray9;

	@OriginalMember(owner = "client!hq", name = "n", descriptor = "Lclient!vg;")
	public static final Class349 aClass349_55 = new Class349(112, 4);

	@OriginalMember(owner = "client!hq", name = "z", descriptor = "Z")
	public static final boolean aBoolean221 = true;

	@OriginalMember(owner = "client!hq", name = "A", descriptor = "I")
	public static int anInt3053 = 0;

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(III)Lclient!kn;")
	public static Class12_Sub2_Sub3 method2581(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class228 local7 = Static469.aClass228ArrayArrayArray6[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class12_Sub2_Sub3 local14 = local7.aClass12_Sub2_Sub3_1;
			local7.aClass12_Sub2_Sub3_1 = null;
			Static324.method4715(local14);
			return local14;
		}
	}
}

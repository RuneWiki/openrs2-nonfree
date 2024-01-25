import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static430 {

	@OriginalMember(owner = "client!ok", name = "q", descriptor = "[Lclient!ru;")
	public static Class217_Sub1[] aClass217_Sub1Array2;

	@OriginalMember(owner = "client!ok", name = "b", descriptor = "I")
	public static int anInt7691 = 0;

	@OriginalMember(owner = "client!ok", name = "d", descriptor = "Lclient!at;")
	public static final Class23 aClass23_3 = new Class23(true);

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(III)Lclient!fha;")
	public static Class12_Sub2_Sub4 method6312(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class58 local7 = Static486.aClass58ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null || local7.aClass12_Sub2_Sub4_1 == null ? null : local7.aClass12_Sub2_Sub4_1;
	}
}

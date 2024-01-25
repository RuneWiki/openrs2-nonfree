import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static148 {

	@OriginalMember(owner = "client!fea", name = "N", descriptor = "Z")
	public static boolean aBoolean298;

	@OriginalMember(owner = "client!fea", name = "G", descriptor = "Lclient!rr;")
	public static final Class300 aClass300_3 = new Class300();

	@OriginalMember(owner = "client!fea", name = "c", descriptor = "(III)Lclient!rc;")
	public static Class11_Sub1_Sub3 method2840(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class217 local7 = Static440.aClass217ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass11_Sub1_Sub3_1;
	}
}

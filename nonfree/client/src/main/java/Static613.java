import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static613 {

	@OriginalMember(owner = "client!vu", name = "r", descriptor = "Lclient!dv;")
	public static Interface8 anInterface8_1;

	@OriginalMember(owner = "client!vu", name = "t", descriptor = "I")
	public static int anInt9932;

	@OriginalMember(owner = "client!vu", name = "m", descriptor = "Lclient!qp;")
	public static final Class280 aClass280_47 = new Class280(16);

	@OriginalMember(owner = "client!vu", name = "n", descriptor = "Lclient!fba;")
	public static final Class102 aClass102_63 = new Class102(260);

	@OriginalMember(owner = "client!vu", name = "s", descriptor = "Z")
	public static boolean aBoolean716 = false;

	@OriginalMember(owner = "client!vu", name = "b", descriptor = "(III)Lclient!nf;")
	public static Class4_Sub1_Sub3 method8502(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class77 local7 = Static330.aClass77ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass4_Sub1_Sub3_1;
	}
}

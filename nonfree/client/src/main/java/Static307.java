import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static307 {

	@OriginalMember(owner = "client!lq", name = "C", descriptor = "Lclient!jn;")
	public static Class176 aClass176_80;

	@OriginalMember(owner = "client!lq", name = "H", descriptor = "Lclient!qc;")
	public static Class269 aClass269_3;

	@OriginalMember(owner = "client!lq", name = "I", descriptor = "I")
	public static int anInt6165;

	@OriginalMember(owner = "client!lq", name = "L", descriptor = "I")
	public static int anInt6167;

	@OriginalMember(owner = "client!lq", name = "u", descriptor = "Lclient!fw;")
	public static final Class110 aClass110_6 = new Class110();

	@OriginalMember(owner = "client!lq", name = "G", descriptor = "I")
	public static int anInt6164 = 0;

	@OriginalMember(owner = "client!lq", name = "J", descriptor = "I")
	public static int anInt6166 = 0;

	@OriginalMember(owner = "client!lq", name = "Q", descriptor = "Lclient!waa;")
	public static final Class350 aClass350_24 = new Class350(512);

	@OriginalMember(owner = "client!lq", name = "R", descriptor = "I")
	public static int anInt6169 = -1;

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(BLclient!kga;)V")
	public static void method5246(@OriginalArg(1) Class44_Sub3 arg0) {
		@Pc(17) byte[] local17;
		if (Static190.anObject10 == null) {
			@Pc(10) Class30_Sub1_Sub1 local10 = new Class30_Sub1_Sub1();
			local17 = local10.method663();
			Static190.anObject10 = Static305.method5221(local17);
		}
		if (Static181.anObject9 == null) {
			@Pc(32) Class30_Sub2_Sub2 local32 = new Class30_Sub2_Sub2();
			local17 = local32.method8000();
			Static181.anObject9 = Static305.method5221(local17);
		}
		@Pc(47) Class251 local47 = arg0.aClass251_1;
		if (local47.method6100() && Static286.anObject15 == null) {
			local17 = Static284.method4883(0.5F, 4.0F, 16.0F, 4.0F, 0.6F, new Class100_Sub1(419684));
			Static286.anObject15 = Static305.method5221(local17);
		}
	}
}

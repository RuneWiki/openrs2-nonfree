import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static16 {

	@OriginalMember(owner = "client!bc", name = "K", descriptor = "I")
	public static int anInt403;

	@OriginalMember(owner = "client!bc", name = "v", descriptor = "Ljava/lang/String;")
	public static String aString23 = null;

	@OriginalMember(owner = "client!bc", name = "z", descriptor = "I")
	public static int anInt394 = 0;

	@OriginalMember(owner = "client!bc", name = "F", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray1 = new String[100];

	@OriginalMember(owner = "client!bc", name = "H", descriptor = "Ljava/lang/String;")
	public static String aString24 = "";

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lclient!jd;Lclient!jd;Z)V")
	public static void method350(@OriginalArg(0) Class84 arg0, @OriginalArg(1) Class84 arg1) {
		Static65.aClass84_30 = arg0;
		Static291.aClass84_129 = arg1;
		Static65.aClass84_30.method2116(34);
		@Pc(19) int local19 = (int) (Math.random() * 21.0D) - 10;
		@Pc(26) int local26 = (int) (Math.random() * 21.0D) - 10;
		@Pc(33) int local33 = (int) (Math.random() * 21.0D) - 10;
		@Pc(40) int local40 = (int) (Math.random() * 41.0D) - 20;
		Static241.anInt4879 = local40 + local26;
		Static99.anInt2194 = local40 + local33;
		Static18.anInt458 = local19 + local40;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(II)V")
	public static void method351(@OriginalArg(1) int arg0) {
		if (Static186.anInt3937 == arg0) {
			@Pc(15) Interface2 local15 = Static44.anInterface2Array1[arg0];
			local15.method4852(Static260.anInt5421);
		}
	}

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "()V")
	public static void method352() {
		@Pc(1) GL local1 = Static60.aGL1;
		local1.glDisableClientState(32886);
		Static60.method1164(false);
		local1.glDisable(2929);
		local1.glPushAttrib(128);
		local1.glFogf(2915, 3072.0F);
		Static60.method1158();
		for (@Pc(19) int local19 = 0; local19 < Static103.aClass2_Sub12ArrayArray2[0].length; local19++) {
			@Pc(31) Class2_Sub12 local31 = Static103.aClass2_Sub12ArrayArray2[0][local19];
			if (local31.anInt1662 >= 0 && Static133.method2323(Static93.anInterface5_1.method3516(local31.anInt1662))) {
				local1.glColor4fv(Static199.method3367(local31.anInt1667), 0);
				@Pc(58) float local58 = 201.5F - (local31.aBoolean136 ? 1.0F : 0.5F);
				local31.method1399(Static180.aClass2_Sub31ArrayArrayArray2, local58, true);
			}
		}
		local1.glEnableClientState(32886);
		Static60.method1170();
		local1.glEnable(2929);
		local1.glPopAttrib();
		Static60.method1145();
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static292 {

	@OriginalMember(owner = "client!lda", name = "k", descriptor = "Lclient!ga;")
	public static Class111 aClass111_68;

	@OriginalMember(owner = "client!lda", name = "n", descriptor = "Lclient!bda;")
	public static Class27 aClass27_4;

	@OriginalMember(owner = "client!lda", name = "h", descriptor = "Lclient!wo;")
	public static final Class361 aClass361_59 = new Class361();

	@OriginalMember(owner = "client!lda", name = "l", descriptor = "Z")
	public static final boolean aBoolean405 = false;

	@OriginalMember(owner = "client!lda", name = "m", descriptor = "Ljava/lang/String;")
	public static String aString59 = null;

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(BILclient!rca;I)V")
	public static void method4581(@OriginalArg(1) int arg0, @OriginalArg(2) Class278 arg1, @OriginalArg(3) int arg2) {
		Static176.aClass278ArrayArray1[arg0][arg2] = arg1;
	}

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(III)V")
	public static void method4582(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class293 local7 = Static118.aClass293ArrayArrayArray14[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		Static158.method2429(local7.aClass20_Sub2_Sub2_2);
		Static158.method2429(local7.aClass20_Sub2_Sub2_1);
		if (local7.aClass20_Sub2_Sub2_2 != null) {
			local7.aClass20_Sub2_Sub2_2 = null;
		}
		if (local7.aClass20_Sub2_Sub2_1 != null) {
			local7.aClass20_Sub2_Sub2_1 = null;
		}
	}

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(Z)Lclient!lv;")
	public static Class1_Sub27 method4584() {
		if (Static313.aClass361_41 == null || Static81.aClass187_1 == null) {
			return null;
		}
		Static81.aClass187_1.method4202(Static313.aClass361_41);
		@Pc(18) Class1_Sub27 local18 = (Class1_Sub27) Static81.aClass187_1.method4201();
		if (local18 == null) {
			return null;
		} else {
			@Pc(33) Class196 local33 = Static313.aClass46_2.method1408(local18.anInt5625);
			return local33 != null && local33.aBoolean395 && local33.method4334(Static313.anInterface15_2) ? local18 : Static160.method7320();
		}
	}
}

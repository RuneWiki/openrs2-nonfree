import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static569 {

	@OriginalMember(owner = "client!uia", name = "m", descriptor = "F")
	public static float aFloat184;

	@OriginalMember(owner = "client!uia", name = "f", descriptor = "[I")
	public static final int[] anIntArray527 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@OriginalMember(owner = "client!uia", name = "a", descriptor = "(Lclient!lh;ZLclient!lh;)V")
	public static void method8252(@OriginalArg(0) Class5_Sub5 arg0, @OriginalArg(2) Class5_Sub5 arg1) {
		if (arg1.aClass5_Sub5_67 != null) {
			arg1.method8952();
		}
		arg1.aClass5_Sub5_67 = arg0.aClass5_Sub5_67;
		arg1.aClass5_Sub5_66 = arg0;
		arg1.aClass5_Sub5_67.aClass5_Sub5_66 = arg1;
		arg1.aClass5_Sub5_66.aClass5_Sub5_67 = arg1;
	}

	@OriginalMember(owner = "client!uia", name = "d", descriptor = "(I)V")
	public static void method8254() {
		@Pc(16) byte[] local16;
		if (Static139.anObject3 == null) {
			@Pc(9) Class7_Sub1_Sub2 local9 = new Class7_Sub1_Sub2();
			local16 = local9.method2185();
			Static139.anObject3 = Static179.method2720(local16);
		}
		if (Static289.anObject13 == null) {
			@Pc(27) Class7_Sub2_Sub2 local27 = new Class7_Sub2_Sub2();
			local16 = local27.method5808();
			Static289.anObject13 = Static179.method2720(local16);
		}
	}
}

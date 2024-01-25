import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static541 {

	@OriginalMember(owner = "client!sf", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString111;

	@OriginalMember(owner = "client!sf", name = "g", descriptor = "I")
	public static int anInt9466;

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "I")
	public static int anInt9462 = -1;

	@OriginalMember(owner = "client!sf", name = "k", descriptor = "I")
	public static int anInt9470 = 0;

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(Ljava/awt/Canvas;IILclient!d;B)Lclient!ha;")
	public static Class101 method8306(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Interface3 arg3) {
		return new oa(arg0, arg3, arg2, arg1);
	}

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "(I)V")
	public static void method8307() {
		for (@Pc(3) int local3 = 0; local3 < Static532.anInt9330; local3++) {
			@Pc(9) int local9 = Static84.anIntArray73[local3];
			@Pc(16) Class2_Sub6 local16 = (Class2_Sub6) Static630.aClass335_29.method8357((long) local9);
			if (local16 != null) {
				@Pc(21) Class15_Sub3_Sub3_Sub1_Sub2 local21 = local16.aClass15_Sub3_Sub3_Sub1_Sub2_1;
				Static216.method4032(local21, local21.aClass312_1.anInt9095);
			}
		}
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lclient!jda;ILclient!jda;)V")
	public static void method8308(@OriginalArg(0) Class15 arg0, @OriginalArg(2) Class15 arg1) {
		if (arg0.aClass15_67 != null) {
			arg0.method9741();
		}
		arg0.aClass15_68 = arg1;
		arg0.aClass15_67 = arg1.aClass15_67;
		arg0.aClass15_67.aClass15_68 = arg0;
		arg0.aClass15_68.aClass15_67 = arg0;
	}
}

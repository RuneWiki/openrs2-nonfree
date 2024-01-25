import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static658 {

	@OriginalMember(owner = "client!vs", name = "e", descriptor = "Lclient!mv;")
	public static final Class241 aClass241_121 = new Class241(53, 3);

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(IIII)I")
	public static int method8769(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = arg2 & 0x3;
		if (local7 == 0) {
			return arg1;
		} else if (local7 == 1) {
			return 7 - arg0;
		} else if (local7 == 2) {
			return 7 - arg1;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(I[BLclient!dga;I)Lclient!nh;")
	public static Class250 method8771(@OriginalArg(1) byte[] arg0, @OriginalArg(2) Class75_Sub1_Sub1 arg1) {
		if (arg0 == null) {
			return null;
		}
		@Pc(10) int local10 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(34336, local10);
		OpenGL.glProgramRawARB(34336, 34933, arg0);
		OpenGL.glGetIntegerv(34379, Static37.anIntArray35, 0);
		if (Static37.anIntArray35[0] == -1) {
			OpenGL.glBindProgramARB(34336, 0);
			return new Class250(arg1, 34336, local10);
		} else {
			OpenGL.glBindProgramARB(34336, 0);
			return null;
		}
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(ZB)V")
	public static void method8776(@OriginalArg(0) boolean arg0) {
		for (@Pc(18) Class6_Sub35 local18 = (Class6_Sub35) Static549.aClass340_69.method8124(); local18 != null; local18 = (Class6_Sub35) Static549.aClass340_69.method8134()) {
			if (local18.aClass6_Sub17_Sub2_2 != null) {
				Static544.aClass6_Sub17_Sub3_2.method4663(local18.aClass6_Sub17_Sub2_2);
				local18.aClass6_Sub17_Sub2_2 = null;
			}
			if (local18.aClass6_Sub17_Sub2_3 != null) {
				Static544.aClass6_Sub17_Sub3_2.method4663(local18.aClass6_Sub17_Sub2_3);
				local18.aClass6_Sub17_Sub2_3 = null;
			}
			local18.method9051();
		}
		if (!arg0) {
			return;
		}
		for (@Pc(67) Class6_Sub35 local67 = (Class6_Sub35) Static81.aClass340_3.method8124(); local67 != null; local67 = (Class6_Sub35) Static81.aClass340_3.method8134()) {
			if (local67.aClass6_Sub17_Sub2_2 != null) {
				Static544.aClass6_Sub17_Sub3_2.method4663(local67.aClass6_Sub17_Sub2_2);
				local67.aClass6_Sub17_Sub2_2 = null;
			}
			local67.method9051();
		}
		for (@Pc(98) Class6_Sub35 local98 = (Class6_Sub35) Static635.aClass74_71.method1404(); local98 != null; local98 = (Class6_Sub35) Static635.aClass74_71.method1405()) {
			if (local98.aClass6_Sub17_Sub2_2 != null) {
				Static544.aClass6_Sub17_Sub3_2.method4663(local98.aClass6_Sub17_Sub2_2);
				local98.aClass6_Sub17_Sub2_2 = null;
			}
			local98.method9051();
		}
	}
}

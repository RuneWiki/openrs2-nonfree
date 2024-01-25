import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static375 {

	@OriginalMember(owner = "client!mia", name = "u", descriptor = "[Lclient!pu;")
	public static Class50[] aClass50Array10;

	@OriginalMember(owner = "client!mia", name = "s", descriptor = "Z")
	public static boolean aBoolean591 = true;

	@OriginalMember(owner = "client!mia", name = "x", descriptor = "Z")
	public static boolean aBoolean592 = false;

	@OriginalMember(owner = "client!mia", name = "y", descriptor = "I")
	public static int anInt6743 = 0;

	@OriginalMember(owner = "client!mia", name = "A", descriptor = "[F")
	public static final float[] aFloatArray64 = new float[4];

	@OriginalMember(owner = "client!mia", name = "a", descriptor = "(Lclient!k;I)Z")
	public static boolean method5606(@OriginalArg(0) Class187 arg0) {
		return arg0 == Static584.aClass187_14 || Static104.aClass187_1 == arg0 || Static221.aClass187_15 == arg0 || Static674.aClass187_16 == arg0 || Static198.aClass187_11 == arg0;
	}

	@OriginalMember(owner = "client!mia", name = "a", descriptor = "(BZI)Lclient!pi;")
	public static Class28_Sub7 method5607(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class156[] local7 = Class358.aClass156Array1;
		synchronized (Class358.aClass156Array1) {
			@Pc(26) Class28_Sub7 local26;
			if (arg1 >= Class358.aClass156Array1.length || Class358.aClass156Array1[arg1].method3780()) {
				local26 = new Class28_Sub7();
				local26.aClass28_Sub9Array1 = new Class28_Sub9[arg1];
				for (@Pc(48) int local48 = 0; local48 < arg1; local48++) {
					local26.aClass28_Sub9Array1[local48] = new Class28_Sub9();
				}
			} else {
				local26 = (Class28_Sub7) Class358.aClass156Array1[arg1].method3779();
				local26.method9022();
				@Pc(33) int local33 = Static43.anIntArray34[arg1]--;
			}
			local26.aBoolean655 = arg0;
			return local26;
		}
	}

	@OriginalMember(owner = "client!mia", name = "a", descriptor = "(ILclient!wm;)V")
	public static void method5608(@OriginalArg(1) Class390 arg0) {
		Static553.aClass390_109 = arg0;
	}

	@OriginalMember(owner = "client!mia", name = "a", descriptor = "(IIII[B[BIII)V")
	public static void method5609(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) byte[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(10) int local10 = -(arg6 >> 2);
		@Pc(15) int local15 = -(arg6 & 0x3);
		for (@Pc(18) int local18 = -arg0; local18 < 0; local18++) {
			@Pc(26) int local26;
			for (@Pc(22) int local22 = local10; local22 < 0; local22++) {
				local26 = arg1++;
				arg4[local26] = (byte) (arg4[local26] - arg3[arg7++]);
				@Pc(39) int local39 = arg1++;
				arg4[local39] = (byte) (arg4[local39] - arg3[arg7++]);
				@Pc(52) int local52 = arg1++;
				arg4[local52] = (byte) (arg4[local52] - arg3[arg7++]);
				@Pc(65) int local65 = arg1++;
				arg4[local65] = (byte) (arg4[local65] - arg3[arg7++]);
			}
			for (@Pc(84) int local84 = local15; local84 < 0; local84++) {
				local26 = arg1++;
				arg4[local26] = (byte) (arg4[local26] - arg3[arg7++]);
			}
			arg1 += arg5;
			arg7 += arg2;
		}
	}
}

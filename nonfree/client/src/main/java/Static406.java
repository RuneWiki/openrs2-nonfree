import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static406 {

	@OriginalMember(owner = "client!ns", name = "d", descriptor = "I")
	public static int anInt7203;

	@OriginalMember(owner = "client!ns", name = "g", descriptor = "I")
	public static int anInt7204;

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "Lclient!rn;")
	public static final Class305 aClass305_61 = new Class305(18, -1);

	@OriginalMember(owner = "client!ns", name = "e", descriptor = "Lclient!uw;")
	public static final Class359 aClass359_146 = new Class359(27, -1);

	@OriginalMember(owner = "client!ns", name = "f", descriptor = "[F")
	public static final float[] aFloatArray67 = new float[16];

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(IIIIILclient!ha;III)V")
	public static void method5969(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class65 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(11) Interface1 local11 = (Interface1) Static506.method7239(arg6, arg2, arg7);
		@Pc(20) Class164 local20;
		@Pc(26) int local26;
		@Pc(30) int local30;
		@Pc(45) int local45;
		if (local11 != null) {
			local20 = Static568.aClass315_5.method7511(local11.method8986());
			local26 = local11.method8987() & 0x3;
			local30 = local11.method8984();
			if (local20.anInt4659 == -1) {
				local45 = arg1;
				if (local20.anInt4647 > 0) {
					local45 = arg0;
				}
				if (local30 == 0 || local30 == 2) {
					if (local26 == 0) {
						arg4.method6879(arg5, local45, 4, arg3);
					} else if (local26 == 1) {
						arg4.method6948(4, arg3, local45, arg5);
					} else if (local26 == 2) {
						arg4.method6879(arg5, local45, 4, arg3 + 3);
					} else if (local26 == 3) {
						arg4.method6948(4, arg3, local45, arg5 + 3);
					}
				}
				if (local30 == 3) {
					if (local26 == 0) {
						arg4.method6900(arg3, arg5, 1, local45, 1);
					} else if (local26 == 1) {
						arg4.method6900(arg3 + 3, arg5, 1, local45, 1);
					} else if (local26 == 2) {
						arg4.method6900(arg3 + 3, arg5 + 3, 1, local45, 1);
					} else if (local26 == 3) {
						arg4.method6900(arg3, arg5 + 3, 1, local45, 1);
					}
				}
				if (local30 == 2) {
					if (local26 == 0) {
						arg4.method6948(4, arg3, local45, arg5);
					} else if (local26 == 1) {
						arg4.method6879(arg5, local45, 4, arg3 + 3);
					} else if (local26 == 2) {
						arg4.method6948(4, arg3, local45, arg5 + 3);
					} else if (local26 == 3) {
						arg4.method6879(arg5, local45, 4, arg3);
					}
				}
			} else {
				Static290.method4673(local26, arg3, arg5, local20, arg4);
			}
		}
		local11 = (Interface1) Static241.method3771(arg6, arg2, arg7, aia.class);
		if (local11 != null) {
			local20 = Static568.aClass315_5.method7511(local11.method8986());
			local26 = local11.method8987() & 0x3;
			local30 = local11.method8984();
			if (local20.anInt4659 != -1) {
				Static290.method4673(local26, arg3, arg5, local20, arg4);
			} else if (local30 == 9) {
				local45 = -1118482;
				if (local20.anInt4647 > 0) {
					local45 = -1179648;
				}
				if (local26 == 0 || local26 == 2) {
					arg4.method6880(local45, arg5, arg3, arg3 + 3, arg5 + 3);
				} else {
					arg4.method6880(local45, arg5 + 3, arg3, arg3 + 3, arg5);
				}
			}
		}
		local11 = (Interface1) Static570.method7867(arg6, arg2, arg7);
		if (local11 == null) {
			return;
		}
		local20 = Static568.aClass315_5.method7511(local11.method8986());
		local26 = local11.method8987() & 0x3;
		if (local20.anInt4659 != -1) {
			Static290.method4673(local26, arg3, arg5, local20, arg4);
			return;
		}
	}

	@OriginalMember(owner = "client!ns", name = "b", descriptor = "(I)V")
	public static void method5970() {
		Static141.method2486();
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static453 {

	@OriginalMember(owner = "client!qea", name = "b", descriptor = "Z")
	public static boolean aBoolean599 = false;

	@OriginalMember(owner = "client!qea", name = "d", descriptor = "[I")
	public static final int[] anIntArray551 = new int[14];

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "(III)I")
	public static int method7108(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		arg1 = (arg0 & 0x7F) * arg1 >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return arg1 + (arg0 & 0xFF80);
	}

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "(Z[BB)V")
	public static void method7109(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[] arg1) {
		if (Static451.aClass2_Sub11_5 == null) {
			Static451.aClass2_Sub11_5 = new Class2_Sub11(20000);
		}
		Static451.aClass2_Sub11_5.method8376(arg1.length, 0, arg1);
		if (!arg0) {
			return;
		}
		Static425.method6831(Static451.aClass2_Sub11_5.aByteArray128);
		Static281.aClass206_Sub1Array1 = new Class206_Sub1[Static513.anInt9421];
		@Pc(31) int local31 = 0;
		for (@Pc(33) int local33 = Static154.anInt7074; local33 <= Static167.anInt4124; local33++) {
			@Pc(39) Class206_Sub1 local39 = Static290.method5252(local33);
			if (local39 != null) {
				Static281.aClass206_Sub1Array1[local31++] = local39;
			}
		}
		Static378.aBoolean237 = false;
		Static529.aLong237 = Static277.method5091();
		Static451.aClass2_Sub11_5 = null;
	}

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "(ILclient!mk;)V")
	public static void method7111(@OriginalArg(1) Class2_Sub37 arg0) {
		if (Static395.aClass100ArrayArrayArray3 == null) {
			return;
		}
		@Pc(16) Interface21 local16 = null;
		if (arg0.anInt6993 == 0) {
			local16 = (Interface21) Static563.method8458(arg0.anInt6988, arg0.anInt6994, arg0.anInt6987);
		}
		if (arg0.anInt6993 == 1) {
			local16 = (Interface21) Static629.method9130(arg0.anInt6988, arg0.anInt6994, arg0.anInt6987);
		}
		if (arg0.anInt6993 == 2) {
			local16 = (Interface21) Static440.method6961(arg0.anInt6988, arg0.anInt6994, arg0.anInt6987, se.class);
		}
		if (arg0.anInt6993 == 3) {
			local16 = (Interface21) Static336.method5820(arg0.anInt6988, arg0.anInt6994, arg0.anInt6987);
		}
		if (local16 == null) {
			arg0.anInt6983 = 0;
			arg0.anInt6991 = -1;
			arg0.anInt6992 = 0;
		} else {
			arg0.anInt6991 = local16.method8625();
			arg0.anInt6992 = local16.method8622();
			arg0.anInt6983 = local16.method8624();
		}
	}

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "(IIIIII)V")
	public static void method7112(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(6) int local6 = arg0 + 1;
		Static280.method5108(arg2, Static208.anIntArrayArray20[arg0], arg3, arg1);
		@Pc(19) int local19 = arg4 - 1;
		Static280.method5108(arg2, Static208.anIntArrayArray20[arg4], arg3, arg1);
		for (@Pc(33) int local33 = local6; local33 <= local19; local33++) {
			@Pc(39) int[] local39 = Static208.anIntArrayArray20[local33];
			local39[arg3] = local39[arg2] = arg1;
		}
	}
}

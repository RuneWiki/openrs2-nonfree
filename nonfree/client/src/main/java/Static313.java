import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static313 {

	@OriginalMember(owner = "client!pt", name = "w", descriptor = "[B")
	public static byte[] aByteArray65;

	@OriginalMember(owner = "client!pt", name = "f", descriptor = "[I")
	public static final int[] anIntArray483 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!pt", name = "m", descriptor = "[I")
	public static final int[] anIntArray484 = new int[5];

	@OriginalMember(owner = "client!pt", name = "s", descriptor = "Z")
	public static boolean aBoolean374 = false;

	@OriginalMember(owner = "client!pt", name = "v", descriptor = "Lclient!ui;")
	public static final Class242 aClass242_71 = new Class242("Started 3d Library", "3D-Softwarebibliothek gestartet.", "Librairie 3D démarrée", "Biblioteca 3D iniciada");

	@OriginalMember(owner = "client!pt", name = "x", descriptor = "Lclient!wi;")
	public static final Class263 aClass263_45 = new Class263(15, 0, 1, 0);

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(IIIB[BI)V")
	public static void method4318(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) byte[] arg2, @OriginalArg(5) int arg3) {
		if (arg1 >= arg3) {
			return;
		}
		arg0 += arg1;
		@Pc(24) int local24 = arg3 - arg1 >> 2;
		while (true) {
			local24--;
			if (local24 < 0) {
				local24 = arg3 - arg1 & 0x3;
				while (true) {
					local24--;
					if (local24 < 0) {
						return;
					}
					arg2[arg0++] = 1;
				}
			}
			@Pc(29) int local29 = arg0 + 1;
			arg2[arg0] = 1;
			@Pc(34) int local34 = local29 + 1;
			arg2[local29] = 1;
			@Pc(39) int local39 = local34 + 1;
			arg2[local34] = 1;
			arg0 = local39 + 1;
			arg2[local39] = 1;
		}
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;BI)V")
	public static void method4325(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) String arg4, @OriginalArg(5) String arg5, @OriginalArg(7) int arg6) {
		for (@Pc(3) int local3 = 99; local3 > 0; local3--) {
			Static166.anIntArray261[local3] = Static166.anIntArray261[local3 - 1];
			Static124.anIntArray168[local3] = Static124.anIntArray168[local3 - 1];
			Static333.aStringArray37[local3] = Static333.aStringArray37[local3 - 1];
			Static17.aStringArray2[local3] = Static17.aStringArray2[local3 - 1];
			Static259.aStringArray30[local3] = Static259.aStringArray30[local3 - 1];
			Static256.aStringArray32[local3] = Static256.aStringArray32[local3 - 1];
			Static310.anIntArray476[local3] = Static310.anIntArray476[local3 - 1];
		}
		Static166.anIntArray261[0] = arg6;
		Static124.anIntArray168[0] = arg2;
		Static333.aStringArray37[0] = arg4;
		Static17.aStringArray2[0] = arg3;
		Static259.aStringArray30[0] = arg0;
		Static310.anIntArray476[0] = arg1;
		Static256.aStringArray32[0] = arg5;
		Static207.anInt3915 = Static190.anInt3670;
		Static26.anInt671++;
	}
}

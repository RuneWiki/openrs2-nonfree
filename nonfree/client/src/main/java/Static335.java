import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static335 {

	@OriginalMember(owner = "client!r", name = "v", descriptor = "I")
	public static int anInt924;

	@OriginalMember(owner = "client!r", name = "N", descriptor = "[I")
	public static int[] anIntArray72;

	@OriginalMember(owner = "client!r", name = "O", descriptor = "Lclient!qu;")
	public static Class2_Sub3_Sub4 aClass2_Sub3_Sub4_2;

	@OriginalMember(owner = "client!r", name = "P", descriptor = "I")
	public static int anInt941;

	@OriginalMember(owner = "client!r", name = "R", descriptor = "I")
	private static int anInt943;

	@OriginalMember(owner = "client!r", name = "S", descriptor = "I")
	private static int anInt944;

	@OriginalMember(owner = "client!r", name = "T", descriptor = "Z")
	private static boolean aBoolean51;

	@OriginalMember(owner = "client!r", name = "U", descriptor = "Z")
	private static boolean aBoolean52;

	@OriginalMember(owner = "client!r", name = "n", descriptor = "Lclient!di;")
	public static final Class54 aClass54_20 = new Class54(27, 15);

	@OriginalMember(owner = "client!r", name = "providesignlink", descriptor = "(Lclient!dr;)V")
	private static void method757(@OriginalArg(0) Class59 arg0) {
		Static43.aClass59_5 = arg0;
		Static325.aClass59_7 = arg0;
	}

	@OriginalMember(owner = "client!r", name = "c", descriptor = "(I)[Lclient!jt;")
	public static Class137[] method759() {
		if (Static388.aClass137Array1 == null) {
			@Pc(13) Class137[] local13 = Static429.method5148(Static43.aClass59_5);
			@Pc(17) Class137[] local17 = new Class137[local13.length];
			@Pc(19) int local19 = 0;
			@Pc(68) int local68;
			@Pc(74) Class137 local74;
			label63: for (@Pc(21) int local21 = 0; local21 < local13.length; local21++) {
				@Pc(27) Class137 local27 = local13[local21];
				if ((local27.anInt3707 <= 0 || local27.anInt3707 >= 24) && local27.anInt3706 >= 800 && local27.anInt3709 >= 600 && (Static7.anInt219 >= 96 || Static399.anInt6653 != 0 || local27.anInt3706 <= 1024 && local27.anInt3709 <= 768)) {
					for (local68 = 0; local68 < local19; local68++) {
						local74 = local17[local68];
						if (local74.anInt3706 == local27.anInt3706 && local74.anInt3709 == local27.anInt3709) {
							if (local27.anInt3707 > local74.anInt3707) {
								local17[local68] = local27;
							}
							continue label63;
						}
					}
					local17[local19] = local27;
					local19++;
				}
			}
			Static388.aClass137Array1 = new Class137[local19];
			Static457.method684(local17, 0, Static388.aClass137Array1, 0, local19);
			@Pc(130) int[] local130 = new int[Static388.aClass137Array1.length];
			for (local68 = 0; local68 < Static388.aClass137Array1.length; local68++) {
				local74 = Static388.aClass137Array1[local68];
				local130[local68] = local74.anInt3706 * local74.anInt3709;
			}
			Static280.method4099(local130, Static388.aClass137Array1);
		}
		return Static388.aClass137Array1;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "([BI[BIIIIBI)V")
	public static void method760(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		@Pc(15) int local15 = -(arg7 >> 2);
		@Pc(20) int local20 = -(arg7 & 0x3);
		for (@Pc(23) int local23 = -arg5; local23 < 0; local23++) {
			@Pc(31) int local31;
			for (@Pc(27) int local27 = local15; local27 < 0; local27++) {
				local31 = arg4++;
				arg2[local31] += arg0[arg6++];
				@Pc(43) int local43 = arg4++;
				arg2[local43] += arg0[arg6++];
				@Pc(55) int local55 = arg4++;
				arg2[local55] += arg0[arg6++];
				@Pc(67) int local67 = arg4++;
				arg2[local67] += arg0[arg6++];
			}
			for (@Pc(82) int local82 = local20; local82 < 0; local82++) {
				local31 = arg4++;
				arg2[local31] += arg0[arg6++];
			}
			arg4 += arg1;
			arg6 += arg3;
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "([BI)Z")
	public static boolean method763(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class2_Sub23 local8 = new Class2_Sub23(arg0);
		@Pc(12) int local12 = local8.method5495();
		if (local12 != 1) {
			return false;
		}
		@Pc(30) boolean local30 = local8.method5495() == 1;
		if (local30) {
			Static412.method5431(local8);
		}
		Static97.method1842(local8);
		return true;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(B[Ljava/lang/String;)[Ljava/lang/String;")
	public static String[] method767(@OriginalArg(1) String[] arg0) {
		@Pc(16) String[] local16 = new String[5];
		for (@Pc(18) int local18 = 0; local18 < 5; local18++) {
			local16[local18] = local18 + ": ";
			if (arg0 != null && arg0[local18] != null) {
				local16[local18] = local16[local18] + arg0[local18];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IBI)Z")
	public static boolean method771(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x34) != 0;
	}
}

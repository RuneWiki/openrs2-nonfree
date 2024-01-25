import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static197 {

	@OriginalMember(owner = "client!md", name = "n", descriptor = "I")
	public static int anInt3863;

	@OriginalMember(owner = "client!md", name = "v", descriptor = "Lclient!tq;")
	public static Class191 aClass191_127;

	@OriginalMember(owner = "client!md", name = "z", descriptor = "Lclient!tq;")
	public static Class191 aClass191_128;

	@OriginalMember(owner = "client!md", name = "r", descriptor = "J")
	public static volatile long aLong111 = 0L;

	@OriginalMember(owner = "client!md", name = "u", descriptor = "I")
	public static int anInt3869 = 0;

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(B)V")
	public static void method3544() {
		@Pc(1) Class119 local1 = Static119.aClass119_76;
		synchronized (Static119.aClass119_76) {
			Static119.aClass119_76.method3304();
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IIIIIILclient!ae;II)V")
	public static void method3545(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class4 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(11) Interface9 local11 = (Interface9) Static230.method4018(arg2, arg4, arg6);
		@Pc(19) Class96 local19;
		@Pc(27) int local27;
		@Pc(31) int local31;
		@Pc(46) int local46;
		if (local11 != null) {
			local19 = Static234.method4051(local11.method5583());
			local27 = local11.method5580() & 0x3;
			local31 = local11.method5581();
			if (local19.anInt3159 == -1) {
				local46 = arg3;
				if (local19.anInt3115 > 0) {
					local46 = arg0;
				}
				if (local31 == 0 || local31 == 2) {
					if (local27 == 0) {
						arg5.method4220(arg7, arg1, 4, local46);
					} else if (local27 == 1) {
						arg5.method4260(4, arg1, arg7, local46);
					} else if (local27 == 2) {
						arg5.method4220(arg7, arg1 + 3, 4, local46);
					} else if (local27 == 3) {
						arg5.method4260(4, arg1, arg7 + 3, local46);
					}
				}
				if (local31 == 3) {
					if (local27 == 0) {
						arg5.method4261(arg7, arg1, 1, 1, local46);
					} else if (local27 == 1) {
						arg5.method4261(arg7, arg1 + 3, 1, 1, local46);
					} else if (local27 == 2) {
						arg5.method4261(arg7 + 3, arg1 - -3, 1, 1, local46);
					} else if (local27 == 3) {
						arg5.method4261(arg7 + 3, arg1, 1, 1, local46);
					}
				}
				if (local31 == 2) {
					if (local27 == 0) {
						arg5.method4260(4, arg1, arg7, local46);
					} else if (local27 == 1) {
						arg5.method4220(arg7, arg1 + 3, 4, local46);
					} else if (local27 == 2) {
						arg5.method4260(4, arg1, arg7 + 3, local46);
					} else if (local27 == 3) {
						arg5.method4220(arg7, arg1, 4, local46);
					}
				}
			} else {
				Static198.method3551(arg1, arg7, arg5, local27, local19);
			}
		}
		local11 = (Interface9) Static280.method5066(arg2, arg4, arg6, vl.class);
		if (local11 != null) {
			local19 = Static234.method4051(local11.method5583());
			local27 = local11.method5580() & 0x3;
			local31 = local11.method5581();
			if (local19.anInt3159 != -1) {
				Static198.method3551(arg1, arg7, arg5, local27, local19);
			} else if (local31 == 9) {
				local46 = -1118482;
				if (local19.anInt3115 > 0) {
					local46 = -1179648;
				}
				if (local27 == 0 || local27 == 2) {
					arg5.method4230(arg1 + 3, arg7, arg7 + 3, arg1, local46);
				} else {
					arg5.method4230(arg1 + 3, arg7 - -3, arg7, arg1, local46);
				}
			}
		}
		local11 = (Interface9) Static104.method4927(arg2, arg4, arg6);
		if (local11 == null) {
			return;
		}
		local19 = Static234.method4051(local11.method5583());
		local27 = local11.method5580() & 0x3;
		if (local19.anInt3159 != -1) {
			Static198.method3551(arg1, arg7, arg5, local27, local19);
			return;
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IIIZII)V")
	public static void method3546(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = arg0 - arg4;
		@Pc(15) int local15 = arg2 - arg3;
		if (local10 == 0) {
			if (local15 != 0) {
				Static100.method2242(arg3, arg4, arg2, arg1);
			}
		} else if (local15 == 0) {
			Static70.method1581(arg0, arg4, arg1, arg3);
		} else {
			@Pc(51) int local51 = (local15 << 12) / local10;
			@Pc(59) int local59 = arg3 - (arg4 * local51 >> 12);
			@Pc(73) int local73;
			@Pc(71) int local71;
			if (arg4 < Static124.anInt4221) {
				local71 = (local51 * Static124.anInt4221 >> 12) + local59;
				local73 = Static124.anInt4221;
			} else if (Static96.anInt2180 >= arg4) {
				local71 = arg3;
				local73 = arg4;
			} else {
				local71 = local59 + (Static96.anInt2180 * local51 >> 12);
				local73 = Static96.anInt2180;
			}
			@Pc(109) int local109;
			@Pc(117) int local117;
			if (Static124.anInt4221 > arg0) {
				local109 = Static124.anInt4221;
				local117 = local59 + (Static124.anInt4221 * local51 >> 12);
			} else if (Static96.anInt2180 < arg0) {
				local109 = Static96.anInt2180;
				local117 = local59 + (local51 * Static96.anInt2180 >> 12);
			} else {
				local109 = arg0;
				local117 = arg2;
			}
			if (local71 < Static228.anInt920) {
				local71 = Static228.anInt920;
				local73 = (Static228.anInt920 - local59 << 12) / local51;
			} else if (Static307.anInt6214 < local71) {
				local73 = (Static307.anInt6214 - local59 << 12) / local51;
				local71 = Static307.anInt6214;
			}
			if (local117 < Static228.anInt920) {
				local109 = (Static228.anInt920 - local59 << 12) / local51;
				local117 = Static228.anInt920;
			} else if (local117 > Static307.anInt6214) {
				local117 = Static307.anInt6214;
				local109 = (Static307.anInt6214 - local59 << 12) / local51;
			}
			Static68.method1535(arg1, local109, local117, local71, local73);
		}
	}
}

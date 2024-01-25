import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static48 {

	@OriginalMember(owner = "client!cf", name = "E", descriptor = "Lclient!bg;")
	public static final Class22 aClass22_53 = new Class22(30, 3);

	@OriginalMember(owner = "client!cf", name = "I", descriptor = "Lclient!lt;")
	public static final Class142 aClass142_1 = new Class142(128);

	@OriginalMember(owner = "client!cf", name = "f", descriptor = "(I)V")
	public static void method789() {
		Static172.aClass68_18.method1777();
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(II[Lclient!uu;)V")
	public static void method790(@OriginalArg(0) int arg0, @OriginalArg(2) Class247[] arg1) {
		for (@Pc(8) int local8 = 0; local8 < arg1.length; local8++) {
			@Pc(14) Class247 local14 = arg1[local8];
			if (local14 != null) {
				if (local14.anInt6840 == 0) {
					if (local14.aClass247Array2 != null) {
						method790(arg0, local14.aClass247Array2);
					}
					@Pc(38) Class4_Sub43 local38 = (Class4_Sub43) Static325.aClass102_29.method2700((long) local14.anInt6809);
					if (local38 != null) {
						Static310.method4165(local38.anInt6979, arg0);
					}
				}
				@Pc(54) Class4_Sub34 local54;
				if (arg0 == 0 && local14.anObjectArray29 != null) {
					local54 = new Class4_Sub34();
					local54.anObjectArray4 = local14.anObjectArray29;
					local54.aClass247_15 = local14;
					Static271.method3894(local54);
				}
				if (arg0 == 1 && local14.anObjectArray10 != null) {
					if (local14.anInt6865 >= 0) {
						@Pc(79) Class247 local79 = Static392.method5121(local14.anInt6809);
						if (local79 == null || local79.aClass247Array2 == null || local14.anInt6865 >= local79.aClass247Array2.length || local79.aClass247Array2[local14.anInt6865] != local14) {
							continue;
						}
					}
					local54 = new Class4_Sub34();
					local54.aClass247_15 = local14;
					local54.anObjectArray4 = local14.anObjectArray10;
					Static271.method3894(local54);
				}
			}
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(III)I")
	public static int method791(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return arg1 + (arg0 & 0xFF80);
	}
}

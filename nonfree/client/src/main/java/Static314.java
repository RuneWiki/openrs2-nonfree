import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static314 {

	@OriginalMember(owner = "client!kha", name = "L", descriptor = "Lclient!jb;")
	public static Class174 aClass174_1;

	@OriginalMember(owner = "client!kha", name = "Q", descriptor = "I")
	public static int anInt5970;

	@OriginalMember(owner = "client!kha", name = "H", descriptor = "I")
	public static int anInt5964 = -1;

	@OriginalMember(owner = "client!kha", name = "O", descriptor = "Lclient!rn;")
	public static final Class305 aClass305_48 = new Class305(81, -1);

	@OriginalMember(owner = "client!kha", name = "P", descriptor = "Lclient!bt;")
	public static final Class48 aClass48_11 = new Class48(0, -1);

	@OriginalMember(owner = "client!kha", name = "e", descriptor = "(Z)V")
	public static void method4949() {
		Static541.aClass168_1 = new Class168(8);
		Static575.anInt9387 = 0;
		for (@Pc(15) Class28_Sub5 local15 = (Class28_Sub5) Static288.aClass156_3.method3776(); local15 != null; local15 = (Class28_Sub5) Static288.aClass156_3.method3783()) {
			local15.method5853();
		}
	}

	@OriginalMember(owner = "client!kha", name = "f", descriptor = "(I)V")
	public static void method4950() {
		if (Static273.anInt5015 == 5) {
			Static273.anInt5015 = 6;
		}
	}

	@OriginalMember(owner = "client!kha", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method4952(@OriginalArg(0) String arg0) {
		return arg0.length() + 1;
	}

	@OriginalMember(owner = "client!kha", name = "a", descriptor = "(IIBII)I")
	public static int method4953(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = arg1 & 0xF;
		@Pc(14) int local14 = local7 < 8 ? arg3 : arg2;
		@Pc(36) int local36 = local7 < 4 ? arg2 : local7 == 12 || local7 == 14 ? arg3 : arg0;
		return ((local7 & 0x1) == 0 ? local14 : -local14) + ((local7 & 0x2) == 0 ? local36 : -local36);
	}
}

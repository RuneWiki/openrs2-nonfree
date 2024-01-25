import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static157 {

	@OriginalMember(owner = "client!hn", name = "c", descriptor = "Lclient!l;")
	public static Interface7 anInterface7_4;

	@OriginalMember(owner = "client!hn", name = "f", descriptor = "Lclient!ph;")
	public static Class187 aClass187_63;

	@OriginalMember(owner = "client!hn", name = "g", descriptor = "I")
	public static int anInt3176;

	@OriginalMember(owner = "client!hn", name = "j", descriptor = "I")
	public static int anInt3177;

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "Lclient!os;")
	public static final Class182 aClass182_113 = new Class182("Connected to update server", "Verbindung zum Update-Server hergestellt.", "Connecté au serveur de mise à jour", "Conectado ao servidor de atualização");

	@OriginalMember(owner = "client!hn", name = "h", descriptor = "[I")
	public static final int[] anIntArray301 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!hn", name = "i", descriptor = "Lclient!bj;")
	public static final Class27 aClass27_60 = new Class27(61, -1);

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(IZII)Z")
	public static boolean method2654(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(5) boolean local5 = true;
		@Pc(11) Interface10 local11 = (Interface10) Static96.method1755(arg0, arg2, arg1);
		if (local11 != null) {
			local5 = Static403.method5319(local11) & true;
		}
		local11 = (Interface10) Static106.method1867(arg0, arg2, arg1, rj.class);
		if (local11 != null) {
			local5 &= Static403.method5319(local11);
		}
		local11 = (Interface10) Static447.method5138(arg0, arg2, arg1);
		if (local11 != null) {
			local5 &= Static403.method5319(local11);
		}
		return local5;
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(III)Z")
	public static boolean method2656(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!Static35.aBoolean37) {
			return false;
		}
		@Pc(13) int local13 = arg0 >> 16;
		@Pc(17) int local17 = arg0 & 0xFFFF;
		if (Static166.aClass89ArrayArray2[local13] == null || Static166.aClass89ArrayArray2[local13][local17] == null) {
			return false;
		}
		@Pc(35) Class89 local35 = Static166.aClass89ArrayArray2[local13][local17];
		@Pc(54) Class10_Sub45 local54;
		if (arg1 == -1 && local35.anInt2727 == 0) {
			for (local54 = (Class10_Sub45) Static70.aClass163_13.method3620(); local54 != null; local54 = (Class10_Sub45) Static70.aClass163_13.method3621()) {
				if (local54.anInt7505 == 3 || local54.anInt7505 == 1001 || local54.anInt7505 == 30 || local54.anInt7505 == 45 || local54.anInt7505 == 19) {
					for (@Pc(144) Class89 local144 = Static40.method557(local54.anInt7508); local144 != null; local144 = Static159.method2690(local144)) {
						if (local35.anInt2677 == local144.anInt2677) {
							return true;
						}
					}
				}
			}
		} else {
			for (local54 = (Class10_Sub45) Static70.aClass163_13.method3620(); local54 != null; local54 = (Class10_Sub45) Static70.aClass163_13.method3621()) {
				if (arg1 == local54.anInt7507 && local35.anInt2677 == local54.anInt7508 && (local54.anInt7505 == 3 || local54.anInt7505 == 1001 || local54.anInt7505 == 30 || local54.anInt7505 == 45 || local54.anInt7505 == 19)) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(IILclient!gh;I)V")
	public static void method2657(@OriginalArg(0) int arg0, @OriginalArg(2) Class89 arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class49 local8 = arg1.method2292(Static412.aClass50_8);
		if (local8 == null) {
			return;
		}
		Static412.aClass50_8.ba(arg0, arg2, arg1.anInt2703 + arg0, arg1.anInt2682 + arg2);
		if (Static166.anInt3290 < 3) {
			Static357.aClass80_19.method5555((float) arg0 + (float) arg1.anInt2703 / 2.0F, (float) arg1.anInt2682 / 2.0F + (float) arg2, ((int) -Static149.aFloat53 & 0x3FFF) << 2, local8, arg0, arg2);
		} else {
			Static412.aClass50_8.ra(-16777216, local8, arg0, arg2);
		}
	}
}

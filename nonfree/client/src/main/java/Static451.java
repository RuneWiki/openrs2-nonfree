import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static451 {

	@OriginalMember(owner = "client!qca", name = "e", descriptor = "I")
	public static int anInt7925;

	@OriginalMember(owner = "client!qca", name = "l", descriptor = "I")
	public static int anInt7931;

	@OriginalMember(owner = "client!qca", name = "n", descriptor = "I")
	public static int anInt7933;

	@OriginalMember(owner = "client!qca", name = "h", descriptor = "I")
	public static int anInt7928 = -2;

	@OriginalMember(owner = "client!qca", name = "i", descriptor = "Lclient!qe;")
	public static final Class274 aClass274_128 = new Class274(41, 7);

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(BLjava/lang/String;)Z")
	public static boolean method6637(@OriginalArg(1) String arg0) {
		return Static352.aHashtable5.containsKey(arg0);
	}

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method6638(@OriginalArg(1) String arg0) {
		@Pc(14) String local14 = null;
		@Pc(18) int local18 = arg0.indexOf("--> ");
		if (local18 >= 0) {
			local14 = arg0.substring(0, local18 + 4);
			arg0 = arg0.substring(local18 + 4);
		}
		if (arg0.startsWith("directlogin ")) {
			@Pc(43) int local43 = arg0.indexOf(" ", "directlogin ".length());
			if (local43 >= 0) {
				@Pc(48) int local48 = arg0.length();
				arg0 = arg0.substring(0, local43) + " ";
				for (@Pc(64) int local64 = local43 + 1; local64 < local48; local64++) {
					arg0 = arg0 + "*";
				}
			}
		}
		return local14 == null ? arg0 : local14 + arg0;
	}

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(III)Z")
	public static boolean method6640(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x84080) != 0;
	}

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(I)V")
	public static void method6641() {
		for (@Pc(8) Class2_Sub5_Sub1 local8 = (Class2_Sub5_Sub1) Static147.aClass238_25.method5833(); local8 != null; local8 = (Class2_Sub5_Sub1) Static147.aClass238_25.method5838()) {
			@Pc(19) Class11_Sub1_Sub1_Sub4 local19 = local8.aClass11_Sub1_Sub1_Sub4_1;
			if (local19.aBoolean327) {
				local8.method8599();
				local19.method3218();
			} else if (local19.anInt3864 <= Static325.anInt5888) {
				local19.method3216(Static362.anInt6541);
				if (local19.aBoolean327) {
					local8.method8599();
				} else {
					Static381.method5741(local19, true);
				}
			}
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static515 {

	@OriginalMember(owner = "client!qba", name = "e", descriptor = "I")
	public static int anInt8130;

	@OriginalMember(owner = "client!qba", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString100;

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "I")
	public static int anInt8128 = 0;

	@OriginalMember(owner = "client!qba", name = "b", descriptor = "(I)[Lclient!ula;")
	public static Class379[] method6957() {
		return new Class379[] { Static286.aClass379_8, Static585.aClass379_11, Static253.aClass379_7, Static585.aClass379_10, Static301.aClass379_9, Static213.aClass379_5, Static512.aClass379_12 };
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(ILclient!kt;)V")
	public static void method6958(@OriginalArg(1) Class9_Sub1_Sub1_Sub2 arg0) {
		@Pc(8) Class45 local8 = arg0.aClass45_9;
		if (local8.method6572() && local8.method6593(1) && local8.method6584()) {
			if (arg0.aBoolean593) {
				local8.method6576(arg0.method7489().method5088());
				arg0.aBoolean593 = local8.method6572();
			}
			local8.method6591();
		}
		@Pc(68) Class45 local68;
		for (@Pc(50) int local50 = 0; local50 < arg0.aClass407Array3.length; local50++) {
			if (arg0.aClass407Array3[local50].anInt11162 != -1) {
				local68 = arg0.aClass407Array3[local50].aClass45_11;
				if (local68.method6589()) {
					@Pc(81) Class139 local81 = Static381.aClass106_2.method2618(arg0.aClass407Array3[local50].anInt11162);
					@Pc(85) Class149 local85 = local68.method6579();
					if (local81.aBoolean218) {
						if (local85.anInt3742 == 3) {
							if (arg0.anInt8816 > 0 && Static716.anInt11157 >= arg0.anInt8811 && Static716.anInt11157 > arg0.anInt8812) {
								local68.method6576(-1);
								arg0.aClass407Array3[local50].anInt11162 = -1;
								continue;
							}
						} else if (local85.anInt3742 == 1 && arg0.anInt8816 > 0 && Static716.anInt11157 >= arg0.anInt8811 && arg0.anInt8812 < Static716.anInt11157) {
							continue;
						}
					}
				}
				if (local68.method6593(1) && local68.method6584()) {
					local68.method6576(-1);
					arg0.aClass407Array3[local50].anInt11162 = -1;
				}
			}
		}
		local68 = arg0.aClass45_10;
		if (local68.method6572()) {
			label83: {
				@Pc(210) Class149 local210 = local68.method6579();
				if (local210.anInt3742 == 3) {
					if (arg0.anInt8816 > 0 && Static716.anInt11157 >= arg0.anInt8811 && Static716.anInt11157 > arg0.anInt8812) {
						arg0.anIntArray641 = null;
						local68.method6576(-1);
						break label83;
					}
				} else if (local210.anInt3742 == 1) {
					if (arg0.anInt8816 > 0 && Static716.anInt11157 >= arg0.anInt8811 && Static716.anInt11157 > arg0.anInt8812) {
						local68.method6594(1);
						break label83;
					}
					local68.method6594(0);
				}
				if (local68.method6593(1) && local68.method6584()) {
					arg0.anIntArray641 = null;
					local68.method6576(-1);
				}
			}
		}
		for (@Pc(324) int local324 = 0; local324 < arg0.aClass45_Sub2_Sub1Array3.length; local324++) {
			@Pc(331) Class45_Sub2_Sub1 local331 = arg0.aClass45_Sub2_Sub1Array3[local324];
			if (local331 != null) {
				if (local331.anInt7643 > 0) {
					local331.anInt7643--;
				} else if (local331.method6593(1) && local331.method6584()) {
					arg0.aClass45_Sub2_Sub1Array3[local324] = null;
				}
			}
		}
	}
}

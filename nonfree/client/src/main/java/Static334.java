import java.awt.Container;
import java.awt.Insets;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static334 {

	@OriginalMember(owner = "client!ls", name = "b", descriptor = "I")
	public static int anInt6266 = 0;

	@OriginalMember(owner = "client!ls", name = "g", descriptor = "Z")
	public static boolean aBoolean462 = true;

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(IJ)V")
	public static void method5409(@OriginalArg(1) long arg0) {
		Static116.aCalendar1.setTime(new Date(arg0));
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(Lclient!r;III[Z)V")
	public static void method5410(@OriginalArg(0) Class3_Sub7_Sub17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		if (Static637.aClass91Array4 == Static485.aClass91Array1) {
			return;
		}
		@Pc(10) int local10 = Static518.aClass91Array2[arg1].method7725(arg2, arg3);
		for (@Pc(12) int local12 = 0; local12 <= arg1; local12++) {
			if (arg4 == null || arg4[local12]) {
				@Pc(23) Class91 local23 = Static518.aClass91Array2[local12];
				if (local23 != null) {
					local23.wa(arg0, arg2, local10 - local23.method7725(arg2, arg3), arg3, 0, false);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ls", name = "b", descriptor = "(Lclient!r;III[Z)Z")
	public static boolean method5411(@OriginalArg(0) Class3_Sub7_Sub17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		@Pc(1) boolean local1 = false;
		if (Static637.aClass91Array4 != Static485.aClass91Array1) {
			@Pc(12) int local12 = Static518.aClass91Array2[arg1].method7725(arg2, arg3);
			for (@Pc(14) int local14 = 0; local14 <= arg1; local14++) {
				@Pc(19) Class91 local19 = Static518.aClass91Array2[local14];
				if (local19 != null) {
					@Pc(29) int local29 = local12 - local19.method7725(arg2, arg3);
					if (arg4 != null) {
						arg4[local14] = local19.method7716(arg0, arg2, local29, arg3);
						if (!arg4[local14]) {
							continue;
						}
					}
					local19.CA(arg0, arg2, local29, arg3, 0, false);
					local1 = true;
				}
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!ls", name = "c", descriptor = "(I)V")
	public static void method5415() {
		@Pc(7) client local7 = Static554.aClient1;
		synchronized (Static554.aClient1) {
			if (Static355.aFrame7 == null) {
				@Pc(23) Container local23;
				if (Static190.aFrame1 != null) {
					local23 = Static190.aFrame1;
				} else if (Static303.anApplet3 == null) {
					local23 = Static467.anApplet_Sub1_1;
				} else {
					local23 = Static303.anApplet3;
				}
				Static136.anInt2830 = local23.getSize().width;
				Static155.anInt3159 = local23.getSize().height;
				@Pc(47) Insets local47;
				if (Static190.aFrame1 == local23) {
					local47 = Static190.aFrame1.getInsets();
					Static155.anInt3159 -= local47.top + local47.bottom;
					Static136.anInt2830 -= local47.right + local47.left;
				}
				if (Static339.method917() == 1) {
					Static303.anInt8406 = 0;
					Static330.anInt6254 = Static623.anInt9971;
					Static294.anInt5875 = (Static136.anInt2830 - Static623.anInt9971) / 2;
					Static190.anInt3576 = Static269.anInt5258;
				} else {
					Static571.method8271();
				}
				if (Static38.aClass220_2 != Static508.aClass220_11) {
					@Pc(99) boolean local99;
					if (Static330.anInt6254 < 1024 && Static190.anInt3576 < 768) {
						local99 = true;
					} else {
						local99 = false;
					}
				}
				Static617.aCanvas13.setSize(Static330.anInt6254, Static190.anInt3576);
				if (Static266.aClass82_8 != null) {
					if (Static80.aBoolean118) {
						Static326.method5367(Static617.aCanvas13);
					} else {
						Static266.aClass82_8.method6149(Static617.aCanvas13, Static330.anInt6254, Static190.anInt3576);
					}
				}
				if (Static190.aFrame1 == local23) {
					local47 = Static190.aFrame1.getInsets();
					Static617.aCanvas13.setLocation(Static294.anInt5875 + local47.left, Static303.anInt8406 + local47.top);
				} else {
					Static617.aCanvas13.setLocation(Static294.anInt5875, Static303.anInt8406);
				}
				if (Static528.anInt8950 != -1) {
					Static228.method3952(true);
				}
				Static616.method8421();
			}
		}
	}
}

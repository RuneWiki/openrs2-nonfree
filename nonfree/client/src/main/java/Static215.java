import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static215 {

	@OriginalMember(owner = "client!mn", name = "s", descriptor = "Lclient!pn;")
	public static final Class183 aClass183_64 = new Class183(12, 7);

	@OriginalMember(owner = "client!mn", name = "z", descriptor = "Ljava/lang/String;")
	public static String aString36 = "";

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(Lclient!oj;Lclient!ab;B)V")
	public static void method3851(@OriginalArg(0) Class48 arg0, @OriginalArg(1) Class3 arg1) {
		@Pc(31) boolean local31 = Static57.aClass196_1.method4821(arg1.anInt92, arg1.anInt56, arg1.anInt71, arg1.aBoolean6 ? Static182.aClass1_Sub2_Sub1_Sub1_1.aClass158_1 : null, arg1.anInt110, arg0, arg1.anInt113 | 0xFF000000) == null;
		if (local31) {
			Static90.aClass238_6.method5796(new Class2_Sub2(arg1.anInt56, arg1.anInt92, arg1.anInt110, arg1.anInt113 | 0xFF000000, arg1.anInt71, arg1.aBoolean6));
		}
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(ILclient!g;II)Lclient!kp;")
	public static Class130 method3852(@OriginalArg(1) Class83 arg0, @OriginalArg(3) int arg1) {
		@Pc(14) byte[] local14 = arg0.method1968(0, arg1);
		return local14 == null ? null : new Class130(local14);
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(I)V")
	public static void method3853() {
		if (Static388.anInt7080 == -1) {
			return;
		}
		@Pc(12) int local12 = Static136.aClass91_2.method5223();
		@Pc(16) int local16 = Static136.aClass91_2.method5224();
		if (Static248.aClass2_Sub17_1 != null) {
			local12 = Static248.aClass2_Sub17_1.method2189();
			local16 = Static248.aClass2_Sub17_1.method2186();
		}
		Static188.method3474(0, local12, 0, Static336.anInt6217, 0, Static7.anInt157, Static388.anInt7080, 0, local16);
		if (Static85.aClass3_8 != null) {
			Static118.method4790(local12, local16);
		}
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(III)Z")
	public static boolean method3854(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class47 local8 = Static230.aClass96_4.method2303(arg1);
		if (arg0 == 11) {
			arg0 = 10;
		}
		if (arg0 >= 5 && arg0 <= 8) {
			arg0 = 4;
		}
		return local8.method900(arg0);
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(JI)V")
	public static void method3855(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static301.method4919(arg0 - 1L);
			Static301.method4919(1L);
		} else {
			Static301.method4919(arg0);
		}
	}

	@OriginalMember(owner = "client!mn", name = "b", descriptor = "(I)V")
	public static void method3857() {
		if (Static33.aFrame2 != null) {
			return;
		}
		@Pc(8) int local8 = Static324.anInt5937;
		@Pc(10) int local10 = Static275.anInt6176;
		@Pc(18) int local18 = Static316.anInt5775 - Static7.anInt157 - local8;
		@Pc(30) int local30 = Static72.anInt1616 - local10 - Static336.anInt6217;
		if (local8 <= 0 && local18 <= 0 && local10 <= 0 && local30 <= 0) {
			return;
		}
		try {
			@Pc(45) Container local45;
			if (Static115.aFrame3 == null) {
				local45 = Static154.aClass123_2.anApplet1;
			} else {
				local45 = Static115.aFrame3;
			}
			@Pc(52) int local52 = 0;
			@Pc(54) int local54 = 0;
			if (local45 == Static115.aFrame3) {
				@Pc(60) Insets local60 = Static115.aFrame3.getInsets();
				local52 = local60.left;
				local54 = local60.top;
			}
			@Pc(69) Graphics local69 = local45.getGraphics();
			local69.setColor(Color.black);
			if (local8 > 0) {
				local69.fillRect(local52, local54, local8, Static72.anInt1616);
			}
			if (local10 > 0) {
				local69.fillRect(local52, local54, Static316.anInt5775, local10);
			}
			if (local18 > 0) {
				local69.fillRect(local52 + Static316.anInt5775 - local18, local54, local18, Static72.anInt1616);
			}
			if (local30 > 0) {
				local69.fillRect(local52, local54 + Static72.anInt1616 - local30, Static316.anInt5775, local30);
				return;
			}
		} catch (@Pc(120) Exception local120) {
			return;
		}
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(IIIZ)Z")
	public static boolean method3858(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) Interface8 local9 = (Interface8) Static94.method1598(arg1, arg0, arg2);
		@Pc(11) boolean local11 = true;
		if (local9 != null) {
			local11 = Static307.method5021(local9) & true;
		}
		local9 = (Interface8) Static278.method4615(arg1, arg0, arg2, td.class);
		if (local9 != null) {
			local11 &= Static307.method5021(local9);
		}
		local9 = (Interface8) Static266.method4518(arg1, arg0, arg2);
		if (local9 != null) {
			local11 &= Static307.method5021(local9);
		}
		return local11;
	}
}

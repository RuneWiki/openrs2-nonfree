import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static57 {

	@OriginalMember(owner = "client!cn", name = "f", descriptor = "Lclient!ln;")
	public static Class157 aClass157_1;

	@OriginalMember(owner = "client!cn", name = "b", descriptor = "Lclient!jc;")
	public static final Class126 aClass126_3 = new Class126(3, 3);

	@OriginalMember(owner = "client!cn", name = "d", descriptor = "I")
	public static int anInt1519 = -1;

	@OriginalMember(owner = "client!cn", name = "i", descriptor = "Z")
	public static final boolean aBoolean97 = false;

	@OriginalMember(owner = "client!cn", name = "k", descriptor = "I")
	public static int anInt1523 = 0;

	@OriginalMember(owner = "client!cn", name = "o", descriptor = "Z")
	public static boolean aBoolean98 = false;

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(IB)Z")
	public static boolean method1071(@OriginalArg(0) int arg0) {
		if (arg0 == 49 || arg0 == 19 || arg0 == 15 || arg0 == 30 || arg0 == 11) {
			return true;
		} else {
			return arg0 == 4 || arg0 == 1007;
		}
	}

	@OriginalMember(owner = "client!cn", name = "b", descriptor = "(I)V")
	public static void method1073() {
		if (Static93.aFrame2 != null) {
			return;
		}
		@Pc(8) int local8 = Static8.anInt96;
		@Pc(10) int local10 = Static299.anInt1304;
		@Pc(18) int local18 = Static134.anInt2979 - local8 - Static152.anInt3234;
		@Pc(26) int local26 = Static270.anInt5255 - local10 - Static342.anInt6292;
		if (local8 <= 0 && local18 <= 0 && local10 <= 0 && local26 <= 0) {
			return;
		}
		try {
			@Pc(45) Container local45;
			if (Static416.aFrame3 == null) {
				local45 = Static150.aClass183_3.anApplet1;
			} else {
				local45 = Static416.aFrame3;
			}
			@Pc(51) int local51 = 0;
			@Pc(53) int local53 = 0;
			if (local45 == Static416.aFrame3) {
				@Pc(59) Insets local59 = Static416.aFrame3.getInsets();
				local53 = local59.top;
				local51 = local59.left;
			}
			@Pc(68) Graphics local68 = local45.getGraphics();
			local68.setColor(Color.black);
			if (local8 > 0) {
				local68.fillRect(local51, local53, local8, Static270.anInt5255);
			}
			if (local10 > 0) {
				local68.fillRect(local51, local53, Static134.anInt2979, local10);
			}
			if (local18 > 0) {
				local68.fillRect(local51 + Static134.anInt2979 - local18, local53, local18, Static270.anInt5255);
			}
			if (local26 > 0) {
				local68.fillRect(local51, Static270.anInt5255 + local53 - local26, Static134.anInt2979, local26);
				return;
			}
		} catch (@Pc(122) Exception local122) {
			return;
		}
	}

	@OriginalMember(owner = "client!cn", name = "b", descriptor = "(II)I")
	public static int method1076(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}
}

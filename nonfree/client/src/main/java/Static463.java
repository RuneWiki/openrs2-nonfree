import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static463 {

	@OriginalMember(owner = "client!wv", name = "l", descriptor = "I")
	public static int anInt7429;

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "S")
	public static short aShort117 = 205;

	@OriginalMember(owner = "client!wv", name = "e", descriptor = "Lclient!am;")
	public static final Class14 aClass14_53 = new Class14();

	@OriginalMember(owner = "client!wv", name = "f", descriptor = "Z")
	public static boolean aBoolean651 = false;

	@OriginalMember(owner = "client!wv", name = "g", descriptor = "[[S")
	public static final short[][] aShortArrayArray10 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(B)V")
	public static void method5975() {
		if (Static33.aFrame1 != null) {
			return;
		}
		@Pc(8) int local8 = Static232.anInt4198;
		@Pc(18) int local18 = Static351.anInt5682;
		@Pc(25) int local25 = Static342.anInt5549 - Static192.anInt3532 - local8;
		@Pc(33) int local33 = Static455.anInt7239 - Static40.anInt597 - local18;
		if (local8 <= 0 && local25 <= 0 && local18 <= 0 && local33 <= 0) {
			return;
		}
		try {
			@Pc(51) Container local51;
			if (Static138.aFrame2 == null) {
				local51 = Static259.aClass177_2.anApplet1;
			} else {
				local51 = Static138.aFrame2;
			}
			@Pc(58) int local58 = 0;
			@Pc(60) int local60 = 0;
			if (Static138.aFrame2 == local51) {
				@Pc(66) Insets local66 = Static138.aFrame2.getInsets();
				local60 = local66.top;
				local58 = local66.left;
			}
			@Pc(75) Graphics local75 = local51.getGraphics();
			local75.setColor(Color.black);
			if (local8 > 0) {
				local75.fillRect(local58, local60, local8, Static455.anInt7239);
			}
			if (local18 > 0) {
				local75.fillRect(local58, local60, Static342.anInt5549, local18);
			}
			if (local25 > 0) {
				local75.fillRect(Static342.anInt5549 + local58 - local25, local60, local25, Static455.anInt7239);
			}
			if (local33 > 0) {
				local75.fillRect(local58, local60 + Static455.anInt7239 - local33, Static342.anInt5549, local33);
				return;
			}
		} catch (@Pc(128) Exception local128) {
			return;
		}
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(IIBII)I")
	public static int method5976(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) int local12 = arg3 & 0xF;
		@Pc(19) int local19 = local12 >= 8 ? arg2 : arg1;
		@Pc(36) int local36 = local12 >= 4 ? (local12 == 12 || local12 == 14 ? arg1 : arg0) : arg2;
		return ((local12 & 0x1) == 0 ? local19 : -local19) + ((local12 & 0x2) == 0 ? local36 : -local36);
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(II)Z")
	public static boolean method5977(@OriginalArg(0) int arg0) {
		if (arg0 == 30 || arg0 == 16 || arg0 == 48 || arg0 == 3 || arg0 == 22) {
			return true;
		} else {
			return arg0 == 46 || arg0 == 1009;
		}
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(IIZLclient!fp;Lclient!vl;ILclient!za;Lclient!jd;)V")
	public static void method5979(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class1_Sub15 arg2, @OriginalArg(4) Class263 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class117 arg5, @OriginalArg(7) Class128 arg6) {
		@Pc(15) int local15 = arg2.anInt1848 - arg0 / 2 - 5;
		@Pc(19) int local19 = arg1 + 2;
		if (arg6.anInt3495 != 0) {
			arg5.method5664(arg0 + 10, local19, arg6.anInt3495, arg4 * arg3.method5487() + arg1 + 1 - local19, local15);
		}
		if (arg6.anInt3490 != 0) {
			arg5.method5666(local19, arg0 + 10, -local19 + 1 + (arg1 - -(arg3.method5487() * arg4)), arg6.anInt3490, local15);
		}
		@Pc(74) int local74 = arg6.anInt3492;
		if (arg2.aBoolean195 && arg6.anInt3497 != -1) {
			local74 = arg6.anInt3497;
		}
		for (@Pc(87) int local87 = 0; local87 < arg4; local87++) {
			@Pc(98) String local98 = Static359.aStringArray38[local87];
			if (local87 < arg4 - 1) {
				local98 = local98.substring(0, local98.length() - 4);
			}
			arg3.method5482(arg5, local98, arg2.anInt1848, arg1, local74);
			arg1 += arg3.method5487();
		}
	}
}

import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static573 {

	@OriginalMember(owner = "client!wba", name = "c", descriptor = "Lclient!iv;")
	public static final Class158 aClass158_20 = new Class158();

	@OriginalMember(owner = "client!wba", name = "f", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray6 = new Rectangle[100];

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(BLclient!hw;IZI)V")
	public static void method8077(@OriginalArg(1) Class21_Sub1_Sub1_Sub1_Sub2 arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2) {
		@Pc(10) int local10 = arg0.anIntArray206[0];
		@Pc(20) int local20 = arg0.anIntArray207[0];
		if (local10 < 0 || Static338.anInt6508 <= local10 || local20 < 0 || local20 >= Static390.anInt7654 || (arg2 < 0 || Static338.anInt6508 <= arg2 || arg1 < 0 || arg1 >= Static390.anInt7654)) {
			return;
		}
		@Pc(78) int local78 = Static235.method3837(Static526.aClass232Array1[arg0.aByte127], 0, true, -4, local20, 0, Static245.anIntArray276, arg1, arg2, 0, arg0.method3339(), 0, local10, Static302.anIntArray333);
		if (local78 >= 1 && local78 <= 3) {
			for (@Pc(88) int local88 = 0; local88 < local78 - 1; local88++) {
				arg0.method3355(Static245.anIntArray276[local88], (byte) 2, Static302.anIntArray333[local88]);
			}
		}
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(Lclient!wl;B)V")
	public static void method8078(@OriginalArg(0) Class4_Sub51 arg0) {
		if (Static571.aClass182ArrayArrayArray3 == null) {
			return;
		}
		@Pc(8) Interface21 local8 = null;
		if (arg0.anInt10469 == 0) {
			local8 = (Interface21) Static497.method7181(arg0.anInt10464, arg0.anInt10463, arg0.anInt10474);
		}
		if (arg0.anInt10469 == 1) {
			local8 = (Interface21) Static228.method3717(arg0.anInt10464, arg0.anInt10463, arg0.anInt10474);
		}
		if (arg0.anInt10469 == 2) {
			local8 = (Interface21) Static36.method1049(arg0.anInt10464, arg0.anInt10463, arg0.anInt10474, sw.class);
		}
		if (arg0.anInt10469 == 3) {
			local8 = (Interface21) Static570.method8016(arg0.anInt10464, arg0.anInt10463, arg0.anInt10474);
		}
		if (local8 == null) {
			arg0.anInt10467 = 0;
			arg0.anInt10462 = 0;
			arg0.anInt10468 = -1;
		} else {
			arg0.anInt10468 = local8.method7281();
			arg0.anInt10467 = local8.method7280();
			arg0.anInt10462 = local8.method7283();
		}
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(IIC)I")
	public static int method8079(@OriginalArg(1) int arg0, @OriginalArg(2) char arg1) {
		@Pc(7) int local7 = arg1 << 4;
		if (Character.isUpperCase(arg1) || Character.isTitleCase(arg1)) {
			@Pc(16) char local16 = Character.toLowerCase(arg1);
			local7 = (local16 << 4) + 1;
		}
		return local7;
	}

	@OriginalMember(owner = "client!wba", name = "b", descriptor = "(B)V")
	public static void method8080() {
		@Pc(7) Class354 local7 = null;
		try {
			local7 = Static594.method8281("2");
			@Pc(21) Class4_Sub13 local21 = new Class4_Sub13(Static565.anInt5162 * 6 + 3);
			local21.method7052(1);
			local21.method7038(Static565.anInt5162);
			for (@Pc(31) int local31 = 0; local31 < Static65.anIntArray67.length; local31++) {
				if (Static188.aBooleanArray11[local31]) {
					local21.method7038(local31);
					local21.method7032(Static65.anIntArray67[local31]);
				}
			}
			local7.method8086(local21.aByteArray88, local21.anInt9170, 0);
		} catch (@Pc(66) Exception local66) {
		}
		try {
			if (local7 != null) {
				local7.method8089();
			}
		} catch (@Pc(78) Exception local78) {
		}
		Static386.aLong199 = Static112.method2047();
		Static1.aBoolean353 = false;
	}
}

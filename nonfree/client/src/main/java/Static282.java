import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static282 {

	@OriginalMember(owner = "client!sc", name = "m", descriptor = "[Lclient!fo;")
	public static Class22_Sub2[] aClass22_Sub2Array3;

	@OriginalMember(owner = "client!sc", name = "p", descriptor = "I")
	public static int anInt5545;

	@OriginalMember(owner = "client!sc", name = "q", descriptor = "Lclient!rk;")
	public static Class180 aClass180_75;

	@OriginalMember(owner = "client!sc", name = "n", descriptor = "I")
	public static int anInt5543 = 0;

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(III[II)V")
	public static void method4681(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3) {
		arg1--;
		@Pc(10) int local10 = arg3 - 1;
		@Pc(14) int local14 = local10 - 7;
		while (local14 > arg1) {
			@Pc(17) int local17 = arg1 + 1;
			arg2[local17] = arg0;
			@Pc(22) int local22 = local17 + 1;
			arg2[local22] = arg0;
			@Pc(27) int local27 = local22 + 1;
			arg2[local27] = arg0;
			@Pc(32) int local32 = local27 + 1;
			arg2[local32] = arg0;
			@Pc(37) int local37 = local32 + 1;
			arg2[local37] = arg0;
			@Pc(42) int local42 = local37 + 1;
			arg2[local42] = arg0;
			@Pc(47) int local47 = local42 + 1;
			arg2[local47] = arg0;
			arg1 = local47 + 1;
			arg2[arg1] = arg0;
		}
		while (arg1 < local10) {
			arg1++;
			arg2[arg1] = arg0;
		}
	}

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "(I)V")
	public static void method4683() {
		if (Static342.aFrame2 != null) {
			return;
		}
		@Pc(8) int local8 = Static107.anInt1503;
		@Pc(15) int local15 = Static314.anInt6029;
		@Pc(23) int local23 = Static200.anInt3944 - Static128.anInt2823 - local8;
		@Pc(30) int local30 = Static276.anInt5460 - local15 - Static214.anInt4266;
		if (local8 <= 0 && local23 <= 0 && local15 <= 0 && local30 <= 0) {
			return;
		}
		try {
			@Pc(45) Container local45;
			if (Static212.aFrame1 == null) {
				local45 = Static116.aClass21_4.anApplet1;
			} else {
				local45 = Static212.aFrame1;
			}
			@Pc(51) int local51 = 0;
			@Pc(53) int local53 = 0;
			if (local45 == Static212.aFrame1) {
				@Pc(59) Insets local59 = Static212.aFrame1.getInsets();
				local51 = local59.left;
				local53 = local59.top;
			}
			@Pc(68) Graphics local68 = local45.getGraphics();
			local68.setColor(Color.black);
			if (local8 > 0) {
				local68.fillRect(local51, local53, local8, Static276.anInt5460);
			}
			if (local15 > 0) {
				local68.fillRect(local51, local53, Static200.anInt3944, local15);
			}
			if (local23 > 0) {
				local68.fillRect(local51 + Static200.anInt3944 - local23, local53, local23, Static276.anInt5460);
			}
			if (local30 > 0) {
				local68.fillRect(local51, Static276.anInt5460 + local53 - local30, Static200.anInt3944, local30);
				return;
			}
		} catch (@Pc(119) Exception local119) {
			return;
		}
	}
}

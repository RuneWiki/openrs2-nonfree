import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!ck", name = "F", descriptor = "[I")
	public static final int[] anIntArray631 = new int[100];

	@OriginalMember(owner = "client!ck", name = "I", descriptor = "Lclient!tr;")
	public static final Class237 aClass237_19 = new Class237(12, 3);

	@OriginalMember(owner = "client!ck", name = "J", descriptor = "[B")
	public static final byte[] aByteArray94 = new byte[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

	@OriginalMember(owner = "client!ck", name = "K", descriptor = "Lclient!oe;")
	public static final Class181 aClass181_63 = new Class181();

	@OriginalMember(owner = "client!ck", name = "e", descriptor = "(I)V")
	public static void method5709() {
		if (Static373.aFrame5 != null) {
			return;
		}
		@Pc(8) int local8 = Static202.anInt3872;
		@Pc(10) int local10 = Static308.anInt5300;
		@Pc(18) int local18 = Static299.anInt700 - Static95.anInt1971 - local8;
		@Pc(24) int local24 = Static107.anInt2270 - Static34.anInt715 - local10;
		if (local8 <= 0 && local18 <= 0 && local10 <= 0 && local24 <= 0) {
			return;
		}
		try {
			@Pc(46) Container local46;
			if (Static285.aFrame4 == null) {
				local46 = Static77.aClass180_1.anApplet1;
			} else {
				local46 = Static285.aFrame4;
			}
			@Pc(51) int local51 = 0;
			@Pc(53) int local53 = 0;
			if (Static285.aFrame4 == local46) {
				@Pc(59) Insets local59 = Static285.aFrame4.getInsets();
				local51 = local59.left;
				local53 = local59.top;
			}
			@Pc(68) Graphics local68 = local46.getGraphics();
			local68.setColor(Color.black);
			if (local8 > 0) {
				local68.fillRect(local51, local53, local8, Static107.anInt2270);
			}
			if (local10 > 0) {
				local68.fillRect(local51, local53, Static299.anInt700, local10);
			}
			if (local18 > 0) {
				local68.fillRect(Static299.anInt700 + local51 - local18, local53, local18, Static107.anInt2270);
			}
			if (local24 > 0) {
				local68.fillRect(local51, local53 + Static107.anInt2270 - local24, Static299.anInt700, local24);
			}
		} catch (@Pc(122) Exception local122) {
		}
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(III)Z")
	public static boolean method5710(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if ((arg1 & 0x10000) != 0 | Static428.method5677(arg1, arg0) || Static172.method2764(arg0, arg1)) {
			return true;
		} else {
			return (arg0 & 0x37) == 0 && Static408.method5470(arg1, arg0);
		}
	}
}

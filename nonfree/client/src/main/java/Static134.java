import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static134 {

	@OriginalMember(owner = "client!gm", name = "c", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray27 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!gm", name = "ob", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger2 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@OriginalMember(owner = "client!gm", name = "d", descriptor = "(B)V")
	public static void method2068() {
		if (Static438.aFrame2 != null) {
			return;
		}
		@Pc(8) int local8 = Static163.anInt6305;
		@Pc(10) int local10 = Static64.anInt1683;
		@Pc(26) int local26 = Static301.anInt2468 - local8 - Static333.anInt5712;
		@Pc(34) int local34 = Static348.anInt5912 - local10 - Static123.anInt2625;
		if (local8 <= 0 && local26 <= 0 && local10 <= 0 && local34 <= 0) {
			return;
		}
		try {
			@Pc(53) Container local53;
			if (Static10.aFrame1 == null) {
				local53 = Static66.aClass143_2.anApplet1;
			} else {
				local53 = Static10.aFrame1;
			}
			@Pc(58) int local58 = 0;
			@Pc(60) int local60 = 0;
			if (local53 == Static10.aFrame1) {
				@Pc(66) Insets local66 = Static10.aFrame1.getInsets();
				local60 = local66.top;
				local58 = local66.left;
			}
			@Pc(75) Graphics local75 = local53.getGraphics();
			local75.setColor(Color.black);
			if (local8 > 0) {
				local75.fillRect(local58, local60, local8, Static348.anInt5912);
			}
			if (local10 > 0) {
				local75.fillRect(local58, local60, Static301.anInt2468, local10);
			}
			if (local26 > 0) {
				local75.fillRect(Static301.anInt2468 + local58 - local26, local60, local26, Static348.anInt5912);
			}
			if (local34 > 0) {
				local75.fillRect(local58, local60 + Static348.anInt5912 - local34, Static301.anInt2468, local34);
				return;
			}
		} catch (@Pc(127) Exception local127) {
			return;
		}
	}
}

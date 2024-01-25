import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static5 {

	@OriginalMember(owner = "client!ad", name = "h", descriptor = "Lclient!dn;")
	public static Class56 aClass56_3;

	@OriginalMember(owner = "client!ad", name = "s", descriptor = "Lclient!bv;")
	public static Class29 aClass29_1;

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "I")
	public static int anInt99 = 0;

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "I")
	public static int anInt100 = 0;

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)V")
	public static void method103() {
		if (Static342.aFrame2 != null) {
			return;
		}
		@Pc(8) int local8 = Static405.anInt7048;
		@Pc(10) int local10 = Static370.anInt6575;
		@Pc(18) int local18 = Static196.anInt3872 - local8 - Static385.anInt6686;
		@Pc(24) int local24 = Static251.anInt4721 - Static120.anInt2616 - local10;
		if (local8 <= 0 && local18 <= 0 && local10 <= 0 && local24 <= 0) {
			return;
		}
		try {
			@Pc(43) Container local43;
			if (Static225.aFrame1 == null) {
				local43 = Static295.aClass103_5.anApplet1;
			} else {
				local43 = Static225.aFrame1;
			}
			@Pc(48) int local48 = 0;
			@Pc(50) int local50 = 0;
			if (Static225.aFrame1 == local43) {
				@Pc(56) Insets local56 = Static225.aFrame1.getInsets();
				local50 = local56.top;
				local48 = local56.left;
			}
			@Pc(65) Graphics local65 = local43.getGraphics();
			local65.setColor(Color.black);
			if (local8 > 0) {
				local65.fillRect(local48, local50, local8, Static251.anInt4721);
			}
			if (local10 > 0) {
				local65.fillRect(local48, local50, Static196.anInt3872, local10);
			}
			if (local18 > 0) {
				local65.fillRect(local48 + Static196.anInt3872 - local18, local50, local18, Static251.anInt4721);
			}
			if (local24 > 0) {
				local65.fillRect(local48, Static251.anInt4721 + local50 - local24, Static196.anInt3872, local24);
			}
		} catch (@Pc(114) Exception local114) {
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lclient!qt;B)V")
	public static void method107(@OriginalArg(0) Class1_Sub3_Sub3_Sub2 arg0) {
		for (@Pc(14) Class3_Sub36 local14 = (Class3_Sub36) Static437.aClass229_47.method5328(); local14 != null; local14 = (Class3_Sub36) Static437.aClass229_47.method5325()) {
			if (local14.aClass1_Sub3_Sub3_Sub2_1 == arg0) {
				if (local14.aClass3_Sub5_Sub3_3 != null) {
					Static251.aClass3_Sub5_Sub4_1.method5196(local14.aClass3_Sub5_Sub3_3);
					local14.aClass3_Sub5_Sub3_3 = null;
				}
				local14.method5987();
				return;
			}
		}
	}
}

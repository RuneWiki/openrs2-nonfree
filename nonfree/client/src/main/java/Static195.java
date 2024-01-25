import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static195 {

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "(BLclient!iaa;)V")
	public static void method3707(@OriginalArg(1) Class6_Sub26 arg0) {
		if (arg0.aByteArray65.length - arg0.anInt5769 < 1) {
			return;
		}
		@Pc(20) int local20 = arg0.method4966();
		if (local20 < 0 || local20 > 1 || arg0.aByteArray65.length - arg0.anInt5769 < 2) {
			return;
		}
		@Pc(42) int local42 = arg0.method4999();
		if (arg0.aByteArray65.length - arg0.anInt5769 < local42 * 6) {
			return;
		}
		for (@Pc(64) int local64 = 0; local64 < local42; local64++) {
			@Pc(70) int local70 = arg0.method4999();
			@Pc(74) int local74 = arg0.method5000();
			if (Static67.anIntArray106.length > local70 && Static30.aBooleanArray4[local70] && (Static65.aClass302_1.method7382(local70).aChar5 != '1' || local74 >= -1 && local74 <= 1)) {
				Static67.anIntArray106[local70] = local74;
			}
		}
	}

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "(Z)V")
	public static void method3709() {
		if (Static345.aFrame2 != null) {
			return;
		}
		@Pc(10) int local10 = Static341.anInt6334;
		@Pc(12) int local12 = Static423.anInt7841;
		@Pc(20) int local20 = Static171.anInt3912 - local10 - Static228.anInt4744;
		@Pc(32) int local32 = Static345.anInt6685 - Static180.anInt4051 - local12;
		if (local10 <= 0 && local20 <= 0 && local12 <= 0 && local32 <= 0) {
			return;
		}
		try {
			@Pc(44) Container local44;
			if (Static138.aFrame1 != null) {
				local44 = Static138.aFrame1;
			} else if (Static87.anApplet1 == null) {
				local44 = Static3.anApplet_Sub1_2;
			} else {
				local44 = Static87.anApplet1;
			}
			@Pc(56) int local56 = 0;
			@Pc(58) int local58 = 0;
			if (local44 == Static138.aFrame1) {
				@Pc(64) Insets local64 = Static138.aFrame1.getInsets();
				local58 = local64.top;
				local56 = local64.left;
			}
			@Pc(73) Graphics local73 = local44.getGraphics();
			local73.setColor(Color.black);
			if (local10 > 0) {
				local73.fillRect(local56, local58, local10, Static345.anInt6685);
			}
			if (local12 > 0) {
				local73.fillRect(local56, local58, Static171.anInt3912, local12);
			}
			if (local20 > 0) {
				local73.fillRect(Static171.anInt3912 + local56 - local20, local58, local20, Static345.anInt6685);
			}
			if (local32 > 0) {
				local73.fillRect(local56, local58 + Static345.anInt6685 - local32, Static171.anInt3912, local32);
				return;
			}
		} catch (@Pc(124) Exception local124) {
			return;
		}
	}
}

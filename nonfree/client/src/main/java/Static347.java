import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static347 {

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(I)V", line = 4)
	public static void method6261() {
		if (Static338.aFrame2 != null) {
			return;
		}
		@Pc(8) int local8 = Class63.anInt1840;
		@Pc(15) int local15 = Class53.anInt1644;
		@Pc(22) int local22 = Static133.anInt2660 - local8 - Static231.anInt4656;
		@Pc(29) int local29 = Static166.anInt2316 - local15 - Static161.anInt3295;
		if (local8 <= 0 && local22 <= 0 && local15 <= 0 && local29 <= 0) {
			return;
		}
		try {
			@Pc(50) Container local50;
			if (Static207.aFrame1 == null) {
				local50 = Static305.aClass152_5.anApplet1;
			} else {
				local50 = Static207.aFrame1;
			}
			@Pc(57) int local57 = 0;
			@Pc(59) int local59 = 0;
			if (local50 == Static207.aFrame1) {
				@Pc(65) Insets local65 = Static207.aFrame1.getInsets();
				local59 = local65.top;
				local57 = local65.left;
			}
			@Pc(74) Graphics local74 = local50.getGraphics();
			local74.setColor(Color.black);
			if (local8 > 0) {
				local74.fillRect(local57, local59, local8, Static166.anInt2316);
			}
			if (local15 > 0) {
				local74.fillRect(local57, local59, Static133.anInt2660, local15);
			}
			if (local22 > 0) {
				local74.fillRect(local57 + Static133.anInt2660 - local22, local59, local22, Static166.anInt2316);
			}
			if (local29 > 0) {
				local74.fillRect(local57, local59 + Static166.anInt2316 - local29, Static133.anInt2660, local29);
				return;
			}
		} catch (@Pc(129) Exception local129) {
			return;
		}
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(BII)V", line = 89)
	public static void method6263(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class4 local10 = new Class4(16);
		for (@Pc(15) Class2_Sub32 local15 = (Class2_Sub32) Class87.aClass4_49.method80(); local15 != null; local15 = (Class2_Sub32) Class87.aClass4_49.method79()) {
			local15.method6469();
			@Pc(26) int local26 = (int) (local15.aLong232 >> 28);
			@Pc(36) int local36 = (int) (local15.aLong232 >> 14 & 0x3FFFL) - arg0;
			@Pc(45) int local45 = (int) (local15.aLong232 & 0x3FFFL) - arg1;
			if (local45 >= 0 && local36 >= 0 && local45 < Class241.anInt7020 && local36 < OutputStream_Sub1.anInt4442) {
				local10.method87(local15, (long) (local26 << 28 | local36 << 14 | local45));
			}
		}
		Class87.aClass4_49 = local10;
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(BLclient!bt;)Lclient!rm;", line = 196)
	public static Class173_Sub3 method6267(@OriginalArg(1) Class2_Sub4 arg0) {
		return new Class173_Sub3(arg0.method4824(), arg0.method4824(), arg0.method4824(), arg0.method4824(), arg0.method4834(), arg0.method4834(), arg0.method4816());
	}
}

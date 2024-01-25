import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static153 {

	@OriginalMember(owner = "client!gd", name = "h", descriptor = "Lclient!kda;")
	public static Class160 aClass160_33;

	@OriginalMember(owner = "client!gd", name = "j", descriptor = "Lclient!iaa;")
	public static Class130 aClass130_5;

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(III)Z")
	public static boolean method3113(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static436.method6378(arg0, arg1)) {
			return Static544.method7953(arg0, arg1) | (arg1 & 0x9000) != 0 | Static441.method6404(arg1, arg0) ? true : ((arg1 & 0x2000) != 0 | Static327.method5345(arg1, arg0) | Static209.method3801(arg0, arg1)) & (arg0 & 0x37) == 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lclient!vp;BLclient!vp;)V")
	public static void method3115(@OriginalArg(0) Class309 arg0, @OriginalArg(2) Class309 arg1) {
		Static444.method6416(Static184.aClass186_58);
		Static192.aClass1_Sub13_Sub2_1.method3069(arg0.anInt8750);
		Static192.aClass1_Sub13_Sub2_1.method3019(arg1.anInt8726);
		Static192.aClass1_Sub13_Sub2_1.method3019(arg1.anInt8735);
		Static192.aClass1_Sub13_Sub2_1.method3023(arg0.anInt8735);
		Static192.aClass1_Sub13_Sub2_1.method3028(arg0.anInt8726);
		Static192.aClass1_Sub13_Sub2_1.method3070(arg1.anInt8750);
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IB)Lclient!vda;")
	public static Class302 method3116(@OriginalArg(0) int arg0) {
		@Pc(10) Class302 local10 = (Class302) Static58.aClass316_10.method7799((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static409.aClass160_83.method4198(arg0, 1);
		local10 = new Class302();
		local10.anInt8607 = arg0;
		if (local20 != null) {
			local10.method7303(new Class1_Sub13(local20));
		}
		local10.method7299();
		if (local10.anInt8611 == 2 && Static310.aClass174_22.method4422((long) arg0) == null) {
			Static310.aClass174_22.method4420(new Class1_Sub33(Static81.anInt2142), (long) arg0);
			Static491.aClass302Array1[Static81.anInt2142++] = local10;
		}
		Static58.aClass316_10.method7792((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!gd", name = "d", descriptor = "(I)V")
	public static void method3117() {
		if (Static478.aFrame1 != null) {
			return;
		}
		@Pc(13) int local13 = Static145.anInt3327;
		@Pc(15) int local15 = Static12.anInt658;
		@Pc(23) int local23 = Static60.anInt1681 - local13 - Static290.anInt6867;
		@Pc(31) int local31 = Static547.anInt9471 - local15 - Static90.anInt2326;
		if (local13 <= 0 && local23 <= 0 && local15 <= 0 && local31 <= 0) {
			return;
		}
		try {
			@Pc(52) Container local52;
			if (Static543.aFrame2 == null) {
				local52 = Static91.aClass182_2.anApplet1;
			} else {
				local52 = Static543.aFrame2;
			}
			@Pc(58) int local58 = 0;
			@Pc(60) int local60 = 0;
			if (local52 == Static543.aFrame2) {
				@Pc(66) Insets local66 = Static543.aFrame2.getInsets();
				local58 = local66.left;
				local60 = local66.top;
			}
			@Pc(75) Graphics local75 = local52.getGraphics();
			local75.setColor(Color.black);
			if (local13 > 0) {
				local75.fillRect(local58, local60, local13, Static547.anInt9471);
			}
			if (local15 > 0) {
				local75.fillRect(local58, local60, Static60.anInt1681, local15);
			}
			if (local23 > 0) {
				local75.fillRect(local58 + Static60.anInt1681 - local23, local60, local23, Static547.anInt9471);
			}
			if (local31 > 0) {
				local75.fillRect(local58, local60 + Static547.anInt9471 - local31, Static60.anInt1681, local31);
				return;
			}
		} catch (@Pc(123) Exception local123) {
			return;
		}
	}
}

import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static554 {

	@OriginalMember(owner = "client!tl", name = "h", descriptor = "Lclient!mda;")
	public static Class49 aClass49_4;

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(Lclient!rl;I[II)V")
	public static void method7824(@OriginalArg(0) Class16_Sub1_Sub1_Sub3_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		@Pc(8) boolean local8;
		@Pc(10) int local10;
		if (arg0.anIntArray586 != null) {
			local8 = true;
			for (local10 = 0; local10 < arg0.anIntArray586.length; local10++) {
				if (arg0.anIntArray586[local10] != arg2[local10]) {
					local8 = false;
					break;
				}
			}
			if (local8 && arg0.anInt8049 != -1) {
				@Pc(45) Class228 local45 = Static479.aClass308_2.method7075(arg0.anInt8049);
				@Pc(48) int local48 = local45.anInt6220;
				if (local48 == 1) {
					arg0.anInt8083 = 0;
					arg0.anInt8087 = 0;
					arg0.anInt8121 = 1;
					arg0.anInt8060 = 0;
					arg0.lb = arg1;
					if (!arg0.aBoolean587) {
						Static145.method2602(arg0.anInt8083, arg0, local45);
					}
				}
				if (local48 == 2) {
					arg0.anInt8060 = 0;
				}
			}
		}
		local8 = true;
		for (local10 = 0; local10 < arg2.length; local10++) {
			if (arg2[local10] != -1) {
				local8 = false;
			}
			if (arg0.anIntArray586 == null || arg0.anIntArray586[local10] == -1 || Static479.aClass308_2.method7075(arg2[local10]).anInt6227 >= Static479.aClass308_2.method7075(arg0.anIntArray586[local10]).anInt6227) {
				arg0.lb = arg1;
				arg0.anIntArray586 = arg2;
				break;
			}
		}
		if (local8) {
			arg0.lb = arg1;
			arg0.anIntArray586 = arg2;
		}
	}

	@OriginalMember(owner = "client!tl", name = "b", descriptor = "(I)V")
	public static void method7825() {
		Static247.anIntArray291 = null;
		Static275.anIntArray306 = null;
		Static282.anIntArray521 = null;
		Static257.anIntArray296 = null;
		Static395.anIntArray448 = null;
		Static169.aBoolean264 = false;
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(BLjava/awt/Frame;Lclient!qg;)V")
	public static void method7826(@OriginalArg(1) Frame arg0, @OriginalArg(2) Class286 arg1) {
		while (true) {
			@Pc(10) Class319 local10 = arg1.method6571(arg0);
			while (local10.anInt8562 == 0) {
				Static440.method6322(10L);
			}
			if (local10.anInt8562 == 1) {
				arg0.setVisible(false);
				arg0.dispose();
				return;
			}
			Static440.method6322(100L);
		}
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(IIBI)V")
	public static void method7827(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = Static305.aClass2_Sub49_15.aClass33_Sub9_3.method3103() * arg0 >> 8;
		if (local8 == 0 || arg1 == -1) {
			return;
		}
		if (!Static609.aBoolean725 && Static57.anInt1427 != -1 && Static260.method4309() && !Static393.method5803()) {
			Static262.aClass2_Sub11_Sub1_3 = Static609.method8540();
			@Pc(40) Class2_Sub11_Sub1 local40 = Static202.method3470(Static262.aClass2_Sub11_Sub1_3);
			Static116.method2087(local40);
		}
		Static555.method7833(Static355.aClass238_164, local8, arg1);
		Static137.method2510(-1, 255);
		Static609.aBoolean725 = true;
	}
}

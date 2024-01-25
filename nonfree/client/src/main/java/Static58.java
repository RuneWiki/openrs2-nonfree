import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static58 {

	@OriginalMember(owner = "client!ct", name = "R", descriptor = "Lclient!ci;")
	public static Class38 aClass38_13;

	@OriginalMember(owner = "client!ct", name = "L", descriptor = "I")
	public static int anInt1387 = 0;

	@OriginalMember(owner = "client!ct", name = "c", descriptor = "(I)V")
	public static void method1268() {
		Static38.anInt906 = -1;
		Static431.anInt7385 = 0;
		Static184.anInt3729 = -1;
	}

	@OriginalMember(owner = "client!ct", name = "e", descriptor = "(I)V")
	public static void method1269() {
		Static115.aClass173_1.method4898();
		Static329.aClass95_1.method5172();
		Static179.aClient1.method1117();
		Static409.aCanvas7.setBackground(Color.black);
		Static441.anInt7552 = -1;
		Static115.aClass173_1 = Static247.method4074(Static409.aCanvas7);
		Static329.aClass95_1 = Static386.method6041(Static409.aCanvas7);
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(IB)I")
	public static int method1271(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			local5 += 16;
			arg0 >>>= 0x10;
		}
		if (arg0 >= 256) {
			arg0 >>>= 0x8;
			local5 += 8;
		}
		if (arg0 >= 16) {
			local5 += 4;
			arg0 >>>= 0x4;
		}
		if (arg0 >= 4) {
			arg0 >>>= 0x2;
			local5 += 2;
		}
		if (arg0 >= 1) {
			arg0 >>>= 0x1;
			local5++;
		}
		return arg0 + local5;
	}

	@OriginalMember(owner = "client!ct", name = "f", descriptor = "(I)V")
	public static void method1272() {
		if (Static275.anIntArray396 != null && Static131.anIntArray179 != null) {
			return;
		}
		Static131.anIntArray179 = new int[256];
		Static275.anIntArray396 = new int[256];
		for (@Pc(22) int local22 = 0; local22 < 256; local22++) {
			@Pc(31) double local31 = (double) local22 / 255.0D * 6.283185307179586D;
			Static275.anIntArray396[local22] = (int) (Math.sin(local31) * 4096.0D);
			Static131.anIntArray179[local22] = (int) (Math.cos(local31) * 4096.0D);
		}
	}
}

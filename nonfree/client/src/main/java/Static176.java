import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static176 {

	@OriginalMember(owner = "client!ij", name = "L", descriptor = "I")
	public static int anInt3165 = -1;

	@OriginalMember(owner = "client!ij", name = "R", descriptor = "Lclient!tn;")
	public static final Class242 aClass242_47 = new Class242(2, 6);

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIILclient!dj;Lclient!dj;)V")
	public static void method2561(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class11_Sub3 arg3, @OriginalArg(4) Class11_Sub3 arg4) {
		@Pc(4) Class216 local4 = Static161.method2122(arg0, arg1, arg2);
		if (local4 != null) {
			local4.aClass11_Sub3_3 = arg3;
			local4.aClass11_Sub3_2 = arg4;
		}
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(III[Ljava/lang/String;)Ljava/lang/String;")
	public static String method2563(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String[] arg2) {
		if (arg1 == 0) {
			return "";
		} else if (arg1 == 1) {
			@Pc(21) String local21 = arg2[arg0];
			return local21 == null ? "null" : local21.toString();
		} else {
			@Pc(32) int local32 = arg0 + arg1;
			@Pc(34) int local34 = 0;
			for (@Pc(36) int local36 = arg0; local36 < local32; local36++) {
				@Pc(42) String local42 = arg2[local36];
				if (local42 == null) {
					local34 += 4;
				} else {
					local34 += local42.length();
				}
			}
			@Pc(61) StringBuffer local61 = new StringBuffer(local34);
			for (@Pc(63) int local63 = arg0; local63 < local32; local63++) {
				@Pc(69) String local69 = arg2[local63];
				if (local69 == null) {
					local61.append("null");
				} else {
					local61.append(local69);
				}
			}
			return local61.toString();
		}
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(ILclient!oq;)V")
	public static void method2564(@OriginalArg(1) Class189 arg0) {
		Static304.aClass189_2 = arg0;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(IZ)V")
	public static void method2565() {
		Static178.method2589(Static147.aClass242_42);
		for (@Pc(24) Class1_Sub37 local24 = (Class1_Sub37) Static462.aClass208_42.method4414(); local24 != null; local24 = (Class1_Sub37) Static462.aClass208_42.method4410()) {
			if (!local24.method5956()) {
				local24 = (Class1_Sub37) Static462.aClass208_42.method4414();
				if (local24 == null) {
					break;
				}
			}
			if (local24.anInt5479 == 0) {
				Static393.method5106(local24, true, true);
			}
		}
		if (Static414.aClass107_15 != null) {
			Static260.method3633(Static414.aClass107_15);
			Static414.aClass107_15 = null;
		}
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(IILclient!jp;)V")
	public static void method2566(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub19_Sub2 arg1) {
		Static333.aBoolean494 = false;
		Static398.anInt6391 = 0;
		Static62.method851(arg1);
		Static90.method1064(arg1);
		if (Static333.aBoolean494) {
			System.out.println("---endgpp---");
		}
		if (arg0 != arg1.anInt3698) {
			throw new RuntimeException("gpi1 pos:" + arg1.anInt3698 + " psize:" + arg0);
		}
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(ZB)V")
	public static void method2567(@OriginalArg(0) boolean arg0) {
		Static459.method5910();
		if (!Static242.method3484(Static135.anInt2114)) {
			return;
		}
		Static133.anInt2068++;
		if (Static133.anInt2068 < 50 && !arg0) {
			return;
		}
		Static133.anInt2068 = 0;
		if (!Static106.aBoolean649 && Static337.aClass110_2 != null) {
			Static178.method2589(Static407.aClass242_110);
			try {
				Static337.aClass110_2.method3778(Static426.aClass1_Sub19_Sub2_2.aByteArray38, Static426.aClass1_Sub19_Sub2_2.anInt3698);
				Static426.aClass1_Sub19_Sub2_2.anInt3698 = 0;
			} catch (@Pc(54) IOException local54) {
				Static106.aBoolean649 = true;
			}
		}
		Static459.method5910();
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static454 {

	@OriginalMember(owner = "client!wk", name = "p", descriptor = "I")
	public static int anInt7225;

	@OriginalMember(owner = "client!wk", name = "e", descriptor = "Lclient!tn;")
	public static final Class242 aClass242_121 = new Class242(46, 11);

	@OriginalMember(owner = "client!wk", name = "n", descriptor = "Lclient!am;")
	public static final Class14 aClass14_52 = new Class14();

	@OriginalMember(owner = "client!wk", name = "o", descriptor = "[I")
	public static final int[] anIntArray538 = new int[4096];

	@OriginalMember(owner = "client!wk", name = "q", descriptor = "Lclient!eh;")
	public static final Class67 aClass67_274 = new Class67(40, -1);

	@OriginalMember(owner = "client!wk", name = "r", descriptor = "I")
	public static int anInt7226 = -1;

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(ZLclient!wm;)Lclient!sh;")
	public static Class46_Sub3 method5846(@OriginalArg(1) Class1_Sub19 arg0) {
		return new Class46_Sub3(arg0.method2929(), arg0.method2929(), arg0.method2929(), arg0.method2929(), arg0.method2881(), arg0.method2881(), arg0.method2915());
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!bp;")
	public static RuntimeException_Sub1 method5848(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(12) RuntimeException_Sub1 local12;
		if (arg0 instanceof RuntimeException_Sub1) {
			local12 = (RuntimeException_Sub1) arg0;
			local12.aString6 = local12.aString6 + ' ' + arg1;
		} else {
			local12 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local12;
	}

	@OriginalMember(owner = "client!wk", name = "b", descriptor = "(I)V")
	public static void method5849() {
		if (Static336.aFloat72 < 1024.0F) {
			Static336.aFloat72 = 1024.0F;
		}
		if (Static336.aFloat72 > 3072.0F) {
			Static336.aFloat72 = 3072.0F;
		}
		while (Static99.aFloat9 >= 16384.0F) {
			Static99.aFloat9 -= 16384.0F;
		}
		while (Static99.aFloat9 < 0.0F) {
			Static99.aFloat9 += 16384.0F;
		}
		@Pc(45) int local45 = Static23.anInt350 >> 7;
		@Pc(49) int local49 = Static446.anInt7039 >> 7;
		@Pc(55) int local55 = Static135.method1732(Static23.anInt350, Static446.anInt7039, Static390.anInt6272);
		@Pc(57) int local57 = 0;
		@Pc(83) int local83;
		if (local45 > 3 && local49 > 3 && Static147.anInt2300 - 4 > local45 && Static293.anInt4886 - 4 > local49) {
			for (local83 = local45 - 4; local83 <= local45 + 4; local83++) {
				for (@Pc(89) int local89 = local49 - 4; local89 <= local49 + 4; local89++) {
					@Pc(93) int local93 = Static390.anInt6272;
					if (local93 < 3 && Static141.method4892(local89, local83)) {
						local93++;
					}
					@Pc(104) int local104 = 0;
					if (Static306.aClass104_Sub1_1.aByteArrayArrayArray14 != null && Static306.aClass104_Sub1_1.aByteArrayArrayArray14[local93] != null) {
						local104 = (Static306.aClass104_Sub1_1.aByteArrayArrayArray14[local93][local83][local89] & 0xFF) * 8;
					}
					@Pc(137) int local137 = local55 + local104 - Static452.aClass139Array3[local93].ua(local83, local89);
					if (local57 < local137) {
						local57 = local137;
					}
				}
			}
		}
		local83 = (local57 >> 0) * 1536;
		if (local83 > 786432) {
			local83 = 786432;
		}
		if (local83 < 262144) {
			local83 = 262144;
		}
		if (local83 > Static77.anInt1084) {
			Static77.anInt1084 += (local83 - Static77.anInt1084) / 24;
		} else if (Static77.anInt1084 > local83) {
			Static77.anInt1084 += (local83 - Static77.anInt1084) / 80;
		}
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(B)V")
	public static void method5850() {
		Static424.aClass117_11.Q(Static106.anInt7395, Static126.aClass19_Sub1_1.aBoolean383 ? Static138.anInt2145 + 256 << 0 : -1, 256);
	}
}

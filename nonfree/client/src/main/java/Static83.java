import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static83 {

	@OriginalMember(owner = "client!g", name = "J", descriptor = "Lclient!fl;")
	public static Class51 aClass51_4;

	@OriginalMember(owner = "client!g", name = "X", descriptor = "[Lclient!hb;")
	public static Class4_Sub16[] aClass4_Sub16Array3;

	@OriginalMember(owner = "client!g", name = "Ib", descriptor = "Ljava/lang/String;")
	public static String aString131 = "Created gameworld";

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
	public static String method3365(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		@Pc(8) int local8 = arg0.length();
		@Pc(11) int local11 = arg1.length();
		@Pc(14) int local14 = arg2.length();
		if (local11 == 0) {
			throw new IllegalArgumentException("Key cannot have zero length");
		}
		@Pc(26) int local26 = local8;
		@Pc(31) int local31 = local14 - local11;
		if (local31 != 0) {
			@Pc(37) int local37 = 0;
			while (true) {
				local37 = arg0.indexOf(arg1, local37);
				if (local37 < 0) {
					break;
				}
				local26 += local31;
				local37 += local11;
			}
		}
		@Pc(56) int local56 = 0;
		@Pc(61) StringBuffer local61 = new StringBuffer(local26);
		while (true) {
			@Pc(72) int local72 = arg0.indexOf(arg1, local56);
			if (local72 < 0) {
				local61.append(arg0.substring(local56));
				return local61.toString();
			}
			local61.append(arg0.substring(local56, local72));
			local61.append(arg2);
			local56 = local72 + local11;
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IZ)V")
	public static void method3368() {
		Static82.aClass33_11.method838(5);
		Static85.aClass33_12.method838(5);
		Static90.aClass33_13.method838(5);
	}

	@OriginalMember(owner = "client!g", name = "b", descriptor = "(I)V")
	public static void method3372() {
		aClass51_4 = null;
		aClass4_Sub16Array3 = null;
		aString131 = null;
	}

	@OriginalMember(owner = "client!g", name = "b", descriptor = "(Z)V")
	public static void method3376() {
		if (Static251.aFloat47 < Static96.aFloat15) {
			Static251.aFloat47 = (float) ((double) Static251.aFloat47 + (double) Static251.aFloat47 / 30.0D);
			if (Static96.aFloat15 < Static251.aFloat47) {
				Static251.aFloat47 = Static96.aFloat15;
			}
			Static249.method3769();
		} else if (Static251.aFloat47 > Static96.aFloat15) {
			Static251.aFloat47 = (float) ((double) Static251.aFloat47 - (double) Static251.aFloat47 / 30.0D);
			if (Static251.aFloat47 < Static96.aFloat15) {
				Static251.aFloat47 = Static96.aFloat15;
			}
			Static249.method3769();
		}
		if (Static92.anInt1911 == -1 || Static299.anInt5561 == -1) {
			return;
		}
		@Pc(59) int local59 = Static92.anInt1911 - Static295.anInt5481;
		if (local59 < 2 || local59 > 2) {
			local59 >>= 0x4;
		}
		@Pc(73) int local73 = Static299.anInt5561 - Static96.anInt2064;
		if (local73 < 2 || local73 > 2) {
			local73 >>= 0x4;
		}
		Static295.anInt5481 += local59;
		if (local59 == 0 && local73 == 0) {
			Static92.anInt1911 = -1;
			Static299.anInt5561 = -1;
		}
		Static96.anInt2064 += local73;
		Static249.method3769();
	}
}

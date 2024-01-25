import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static162 {

	@OriginalMember(owner = "client!gda", name = "l", descriptor = "I")
	public static int anInt3366;

	@OriginalMember(owner = "client!gda", name = "b", descriptor = "Lclient!gca;")
	public static final Class119 aClass119_1 = new Class119();

	@OriginalMember(owner = "client!gda", name = "i", descriptor = "Lclient!eda;")
	public static final Class90 aClass90_58 = new Class90(49, -2);

	@OriginalMember(owner = "client!gda", name = "o", descriptor = "I")
	public static int anInt3368 = 0;

	@OriginalMember(owner = "client!gda", name = "p", descriptor = "Lclient!gn;")
	public static Class128 aClass128_1 = null;

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method2677(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(20) String local20 = Static377.method5881(arg0);
		if (local20 == null) {
			return;
		}
		for (@Pc(25) int local25 = 0; local25 < Static577.anInt10405; local25++) {
			@Pc(31) String local31 = Static154.aStringArray13[local25];
			if (local31.startsWith("*")) {
				local31 = local31.substring(1);
			}
			local31 = Static377.method5881(local31);
			if (local31 != null && local31.equals(local20)) {
				Static577.anInt10405--;
				for (@Pc(55) int local55 = local25; local55 < Static577.anInt10405; local55++) {
					Static154.aStringArray13[local55] = Static154.aStringArray13[local55 + 1];
					Static377.aStringArray29[local55] = Static377.aStringArray29[local55 + 1];
					Static320.aStringArray23[local55] = Static320.aStringArray23[local55 + 1];
					Static147.aStringArray11[local55] = Static147.aStringArray11[local55 + 1];
					Static483.aBooleanArray23[local55] = Static483.aBooleanArray23[local55 + 1];
				}
				Static136.anInt3035 = Static422.anInt8117;
				@Pc(112) Class4_Sub39 local112 = Static32.method999(Static402.aClass356_1, Static127.aClass344_16);
				local112.aClass4_Sub13_Sub2_1.method7052(Static393.method6014(arg0));
				local112.aClass4_Sub13_Sub2_1.method7002(arg0);
				Static50.method1166(local112);
				break;
			}
		}
	}

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(IZLclient!is;)V")
	public static void method2682(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class155 arg1) {
		@Pc(20) int local20 = arg1.anInt4778 == 0 ? arg1.anInt4806 : arg1.anInt4778;
		@Pc(29) int local29 = arg1.anInt4801 == 0 ? arg1.anInt4831 : arg1.anInt4801;
		Static199.method3261(arg1.anInt4793, local29, local20, arg0, Static535.aClass155ArrayArray2[arg1.anInt4793 >> 16]);
		if (arg1.aClass155Array2 != null) {
			Static199.method3261(arg1.anInt4793, local29, local20, arg0, arg1.aClass155Array2);
		}
		@Pc(62) Class4_Sub45 local62 = (Class4_Sub45) Static569.aClass221_27.method5075((long) arg1.anInt4793);
		if (local62 != null) {
			Static578.method8121(local29, local20, local62.anInt9096, arg0);
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static147 {

	@OriginalMember(owner = "client!ja", name = "G", descriptor = "Lclient!ae;")
	public static Class4 aClass4_2;

	@OriginalMember(owner = "client!ja", name = "q", descriptor = "J")
	public static long aLong9 = -1L;

	@OriginalMember(owner = "client!ja", name = "y", descriptor = "[I")
	public static final int[] anIntArray22 = new int[2500];

	@OriginalMember(owner = "client!ja", name = "z", descriptor = "Z")
	public static boolean aBoolean25 = false;

	@OriginalMember(owner = "client!ja", name = "F", descriptor = "Lclient!wq;")
	public static Class216 aClass216_8 = new Class216();

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(ZLjava/lang/String;)V")
	public static void method413(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(25) String local25 = Static335.method5804(arg0);
		if (local25 == null) {
			return;
		}
		for (@Pc(30) int local30 = 0; local30 < Static355.anInt6969; local30++) {
			@Pc(36) String local36 = Static283.aStringArray51[local30];
			if (local36.startsWith("*")) {
				local36 = local36.substring(1);
			}
			local36 = Static335.method5804(local36);
			if (local36 != null && local36.equals(local25)) {
				Static355.anInt6969--;
				for (@Pc(60) int local60 = local30; local60 < Static355.anInt6969; local60++) {
					Static283.aStringArray51[local60] = Static283.aStringArray51[local60 + 1];
					Static34.aStringArray2[local60] = Static34.aStringArray2[local60 + 1];
					Static266.aStringArray48[local60] = Static266.aStringArray48[local60 + 1];
					Static336.aStringArray62[local60] = Static336.aStringArray62[local60 + 1];
					Static327.aBooleanArray31[local60] = Static327.aBooleanArray31[local60 + 1];
				}
				Static266.anInt5439 = Static157.anInt3179;
				Static74.aClass2_Sub10_Sub1_2.method2049(209);
				Static74.aClass2_Sub10_Sub1_2.method4430(Static124.method3876(arg0));
				Static74.aClass2_Sub10_Sub1_2.method4443(arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lclient!tq;I)V")
	public static void method414(@OriginalArg(0) Class191 arg0) {
		Static55.aClass191_158 = arg0;
		Static328.anInt6643 = Static55.aClass191_158.method5443(19);
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(Z)V")
	public static void method415() {
		Static214.aClass4_9.method4206(Static284.anInt5760, Static209.aBoolean435 ? Static261.anInt5107 + 256 : -1);
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method416(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(17) int local17 = 0; local17 < local8; local17++) {
			@Pc(23) char local23 = arg0.charAt(local17);
			if (local23 == '<' || local23 == '>') {
				local10 += 3;
			}
		}
		@Pc(43) StringBuffer local43 = new StringBuffer(local10 + local8);
		for (@Pc(45) int local45 = 0; local45 < local8; local45++) {
			@Pc(51) char local51 = arg0.charAt(local45);
			if (local51 == '<') {
				local43.append("<lt>");
			} else if (local51 == '>') {
				local43.append("<gt>");
			} else {
				local43.append(local51);
			}
		}
		return local43.toString();
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lclient!qf;Lclient!qf;I)V")
	public static void method418(@OriginalArg(0) Class2 arg0, @OriginalArg(1) Class2 arg1) {
		if (arg0.aClass2_249 != null) {
			arg0.method5945();
		}
		arg0.aClass2_250 = arg1;
		arg0.aClass2_249 = arg1.aClass2_249;
		arg0.aClass2_249.aClass2_250 = arg0;
		arg0.aClass2_250.aClass2_249 = arg0;
	}
}

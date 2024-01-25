import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static194 {

	@OriginalMember(owner = "client!jk", name = "K", descriptor = "I")
	public static int anInt4067;

	@OriginalMember(owner = "client!jk", name = "L", descriptor = "Lclient!za;")
	public static Class106 aClass106_7;

	@OriginalMember(owner = "client!jk", name = "M", descriptor = "I")
	public static int anInt4068;

	@OriginalMember(owner = "client!jk", name = "n", descriptor = "Lclient!lo;")
	public static final Class158 aClass158_106 = new Class158("Allocating memory", "Speicher wird zugewiesen.", "Mémoire en cours d'attribution", "Alocando memória");

	@OriginalMember(owner = "client!jk", name = "G", descriptor = "Ljava/lang/String;")
	public static String aString35 = "";

	@OriginalMember(owner = "client!jk", name = "H", descriptor = "[Z")
	public static final boolean[] aBooleanArray16 = new boolean[5];

	@OriginalMember(owner = "client!jk", name = "J", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger2 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(III)I")
	public static int method3144(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg1 == 1 || arg1 == 3 ? Static189.anIntArray387[arg0 & 0x3] : Static390.anIntArray676[arg0 & 0x3];
	}

	@OriginalMember(owner = "client!jk", name = "g", descriptor = "(I)V")
	public static void method3147() {
		for (@Pc(4) Class1_Sub35 local4 = (Class1_Sub35) Static401.aClass203_47.method4548(); local4 != null; local4 = (Class1_Sub35) Static401.aClass203_47.method4545()) {
			if (Static333.method4690(local4.anInt5839)) {
				Static12.method137(local4);
			}
		}
		if (Static126.anInt2794 == 1) {
			Static340.method4795();
			return;
		}
		Static152.method2399(Static32.anInt891, Static232.anInt4578, Static316.anInt5908, Static293.anInt4679);
		@Pc(43) int local43 = Static394.aClass209_10.method4694(Static192.aClass158_104.method3594(Static365.anInt6682));
		for (@Pc(48) Class1_Sub35 local48 = (Class1_Sub35) Static401.aClass203_47.method4548(); local48 != null; local48 = (Class1_Sub35) Static401.aClass203_47.method4545()) {
			@Pc(53) int local53 = Static113.method1826(local48);
			if (local53 > local43) {
				local43 = local53;
			}
		}
		Static232.anInt4578 = local43 + 8;
		Static316.anInt5908 = (Static333.aBoolean386 ? 26 : 22) + Static126.anInt2794 * 16;
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(IIIIIIB)V")
	public static void method3149(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(5) int arg3) {
		for (@Pc(17) Class41_Sub4 local17 = (Class41_Sub4) Static367.aClass117_8.method2967(); local17 != null; local17 = (Class41_Sub4) Static367.aClass117_8.method2970()) {
			if (local17.anInt3097 <= Static187.anInt3975) {
				local17.method5447();
			} else {
				Static70.method1336(arg2 >> 1, local17.anInt3094, (local17.anInt3096 << 7) + 64, arg0 >> 1, local17.anInt3098 * 2, (local17.anInt3095 << 7) + 64);
				Static13.aClass20_2.method5334(arg3 + Static156.anIntArray346[0], Static156.anIntArray346[1] + arg1, local17.anInt3099 | 0xFF000000, local17.aString27, 0);
			}
		}
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(IILjava/lang/String;)V")
	public static void method3152(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		Static32.method677(Static29.aClass177_11);
		Static433.aClass1_Sub3_Sub1_11.method1208(Static146.method2347(arg1) + 1);
		Static433.aClass1_Sub3_Sub1_11.method1164(arg0);
		Static433.aClass1_Sub3_Sub1_11.method1190(arg1);
	}

	@OriginalMember(owner = "client!jk", name = "d", descriptor = "(II)Lclient!vp;")
	public static Class261 method3153(@OriginalArg(1) int arg0) {
		@Pc(10) Class261 local10 = (Class261) Static5.aClass91_3.method1988((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static306.aClass211_72.method4758(arg0, 0);
		local10 = new Class261();
		if (local25 != null) {
			local10.method5790(new Class1_Sub3(local25), arg0);
		}
		Static5.aClass91_3.method1990(local10, (long) arg0);
		return local10;
	}
}

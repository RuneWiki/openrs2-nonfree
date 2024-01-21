import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static21 {

	@OriginalMember(owner = "client!cc", name = "f", descriptor = "I")
	public static int anInt512;

	@OriginalMember(owner = "client!cc", name = "g", descriptor = "I")
	public static int anInt513;

	@OriginalMember(owner = "client!cc", name = "j", descriptor = "[Lclient!sa;")
	public static Class3_Sub1_Sub4_Sub4[] aClass3_Sub1_Sub4_Sub4Array4;

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger1 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@OriginalMember(owner = "client!cc", name = "i", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_160 = Static120.method1824("und loggen sich dann erneut ein)3");

	@OriginalMember(owner = "client!cc", name = "l", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_161 = Static120.method1824("title_mute");

	@OriginalMember(owner = "client!cc", name = "m", descriptor = "[[I")
	public static final int[][] anIntArrayArray5 = new int[][] { { 1, 1 }, { -1, 1 }, { 1, -1 }, { -1, -1 } };

	@OriginalMember(owner = "client!cc", name = "n", descriptor = "I")
	public static int anInt516 = 0;

	@OriginalMember(owner = "client!cc", name = "o", descriptor = "Z")
	public static boolean aBoolean29 = false;

	@OriginalMember(owner = "client!cc", name = "p", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_162 = Static120.method1824("Okay");

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!mb;I)Lclient!hc;")
	public static Class31_Sub2 method342(@OriginalArg(0) Class3_Sub17 arg0) {
		return new Class31_Sub2(arg0.method2138(), arg0.method2138(), arg0.method2138(), arg0.method2138(), arg0.method2138(), arg0.method2138(), arg0.method2138(), arg0.method2138(), arg0.method2136(), arg0.method2107());
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(III)V")
	public static void method343(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class3_Sub15 local7 = Static185.aClass3_Sub15ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 != null) {
			local7.aClass71_1 = null;
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(B)V")
	public static void method344() {
		Static63.aClass3_Sub17_Sub1_2.method2150();
		@Pc(7) int local7 = Static63.aClass3_Sub17_Sub1_2.method2152(1);
		if (local7 == 0) {
			return;
		}
		@Pc(27) int local27 = Static63.aClass3_Sub17_Sub1_2.method2152(2);
		if (local27 == 0) {
			Static3.anIntArray24[Static33.anInt779++] = 2047;
			return;
		}
		@Pc(46) int local46;
		@Pc(56) int local56;
		if (local27 == 1) {
			local46 = Static63.aClass3_Sub17_Sub1_2.method2152(3);
			Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.method3067(local46, false);
			local56 = Static63.aClass3_Sub17_Sub1_2.method2152(1);
			if (local56 == 1) {
				Static3.anIntArray24[Static33.anInt779++] = 2047;
			}
			return;
		}
		@Pc(98) int local98;
		if (local27 == 2) {
			local46 = Static63.aClass3_Sub17_Sub1_2.method2152(3);
			Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.method3067(local46, true);
			local56 = Static63.aClass3_Sub17_Sub1_2.method2152(3);
			Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.method3067(local56, true);
			local98 = Static63.aClass3_Sub17_Sub1_2.method2152(1);
			if (local98 == 1) {
				Static3.anIntArray24[Static33.anInt779++] = 2047;
			}
		} else if (local27 == 3) {
			Static153.anInt673 = Static63.aClass3_Sub17_Sub1_2.method2152(2);
			local46 = Static63.aClass3_Sub17_Sub1_2.method2152(7);
			local56 = Static63.aClass3_Sub17_Sub1_2.method2152(1);
			local98 = Static63.aClass3_Sub17_Sub1_2.method2152(1);
			if (local98 == 1) {
				Static3.anIntArray24[Static33.anInt779++] = 2047;
			}
			@Pc(149) int local149 = Static63.aClass3_Sub17_Sub1_2.method2152(7);
			Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.method3061(local56 == 1, local46, local149);
		}
	}
}

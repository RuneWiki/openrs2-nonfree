import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static125 {

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(I)I")
	public static int method2476() {
		if (Static383.anInt7183 == 0) {
			Static420.aClass255_2.method6589(new Class75("jaclib"));
			if (Static420.aClass255_2.method6590().method6808() != 100) {
				return 1;
			}
			if (!((Class75) Static420.aClass255_2.method6590()).method2143()) {
				Static116.aClient1.method1808();
			}
			Static383.anInt7183 = 1;
		}
		@Pc(233) int local233;
		@Pc(256) int local256;
		@Pc(270) int local270;
		@Pc(276) int local276;
		if (Static383.anInt7183 == 1) {
			Static91.aClass255Array1 = Static420.method6588();
			Static420.aClass255_1.method6589(new Class56(Static25.aClass196_85));
			Static420.aClass255_3.method6589(new Class75("jaggl"));
			Static420.aClass255_4.method6589(new Class75("jagdx"));
			Static420.aClass255_5.method6589(new Class75("jagmisc"));
			Static420.aClass255_6.method6589(new Class75("sw3d"));
			Static420.aClass255_7.method6589(new Class75("hw3d"));
			Static420.aClass255_8.method6589(new Class75("jagtheora"));
			Static420.aClass255_9.method6589(new Class56(Static56.aClass196_17));
			Static420.aClass255_10.method6589(new Class56(Static584.aClass196_122));
			Static420.aClass255_11.method6589(new Class56(Static351.aClass196_69));
			Static420.aClass255_12.method6589(new Class56(Static557.aClass196_113));
			Static420.aClass255_13.method6589(new Class56(Static383.aClass196_76));
			Static420.aClass255_14.method6589(new Class56(Static368.aClass196_74));
			Static420.aClass255_15.method6589(new Class56(Static311.aClass196_77));
			Static420.aClass255_16.method6589(new Class56(Static11.aClass196_129));
			Static420.aClass255_17.method6589(new Class56(Static35.aClass196_12));
			Static420.aClass255_18.method6589(new Class56(Static384.aClass196_78));
			Static420.aClass255_19.method6589(new Class56(Static501.aClass196_103));
			Static420.aClass255_20.method6589(new Class56(Static72.aClass196_19));
			Static420.aClass255_21.method6589(new Class56(Static455.aClass196_97));
			Static420.aClass255_22.method6589(new Class56(Static351.aClass196_68));
			Static420.aClass255_23.method6589(new Class30(Static182.aClass196_38, "huffman"));
			Static420.aClass255_24.method6589(new Class56(Static226.aClass196_25));
			Static420.aClass255_25.method6589(new Class56(Static522.aClass196_109));
			Static420.aClass255_26.method6589(new Class56(Static429.aClass196_84));
			Static420.aClass255_27.method6589(new Class262(Static508.aClass196_106, "details"));
			for (local233 = 0; local233 < Static91.aClass255Array1.length; local233++) {
				if (Static91.aClass255Array1[local233].method6590() == null) {
					throw new RuntimeException();
				}
			}
			local256 = 0;
			@Pc(258) Class255[] local258 = Static91.aClass255Array1;
			for (@Pc(260) int local260 = 0; local260 < local258.length; local260++) {
				@Pc(266) Class255 local266 = local258[local260];
				local270 = local266.method6585();
				local276 = local266.method6590().method6808();
				local256 += local276 * local270 / 100;
			}
			Static383.anInt7183 = 2;
			Static558.anInt9323 = local256;
		}
		if (Static91.aClass255Array1 == null) {
			return 100;
		}
		local233 = 0;
		local256 = 0;
		@Pc(303) boolean local303 = true;
		@Pc(305) Class255[] local305 = Static91.aClass255Array1;
		for (@Pc(307) int local307 = 0; local307 < local305.length; local307++) {
			@Pc(313) Class255 local313 = local305[local307];
			local276 = local313.method6585();
			@Pc(323) int local323 = local313.method6590().method6808();
			if (local323 < 100) {
				local303 = false;
			}
			local256 += local323 * local276 / 100;
			local233 += local276;
		}
		if (local303) {
			if (!((Class75) Static420.aClass255_5.method6590()).method2143()) {
				Static116.aClient1.method1816();
			}
			if (!((Class75) Static420.aClass255_8.method6590()).method2143()) {
				Static36.aBoolean80 = Static116.aClient1.method1813();
			}
			Static91.aClass255Array1 = null;
		}
		local233 -= Static558.anInt9323;
		local256 -= Static558.anInt9323;
		local270 = local233 <= 0 ? 100 : local256 * 100 / local233;
		if (!local303 && local270 > 99) {
			local270 = 99;
		}
		return local270;
	}

	@OriginalMember(owner = "client!ega", name = "b", descriptor = "(I)Z")
	public static boolean method2477() {
		if (Static515.aBoolean636) {
			try {
				Static646.method3052(Static504.anApplet2, "showVideoAd");
				return true;
			} catch (@Pc(18) Throwable local18) {
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "([BZI)Ljava/lang/Object;")
	public static Object method2479(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static259.aBoolean316) {
			try {
				@Pc(18) Class57 local18 = (Class57) Class.forName("Class57_Sub1").getDeclaredConstructor().newInstance();
				local18.method1855(arg0);
				return local18;
			} catch (@Pc(25) Throwable local25) {
				Static259.aBoolean316 = true;
			}
		}
		return arg0;
	}
}

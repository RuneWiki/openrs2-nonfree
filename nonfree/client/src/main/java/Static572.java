import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static572 {

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "Lclient!ra;")
	public static final Class276 aClass276_149 = new Class276(1, 3);

	@OriginalMember(owner = "client!wb", name = "o", descriptor = "I")
	public static int anInt10083 = -1;

	@OriginalMember(owner = "client!wb", name = "p", descriptor = "[B")
	public static final byte[] aByteArray111 = new byte[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(I)I")
	public static int method8176() {
		if (Static133.anInt3192 == 0) {
			Static316.aClass208_2.method5505(new Class321("jaclib"));
			if (Static316.aClass208_2.method5509().method8138() != 100) {
				return 1;
			}
			if (!((Class321) Static316.aClass208_2.method5509()).method7716()) {
				Static173.aClient1.method1680();
			}
			Static133.anInt3192 = 1;
		}
		@Pc(233) int local233;
		@Pc(258) int local258;
		@Pc(274) int local274;
		@Pc(280) int local280;
		if (Static133.anInt3192 == 1) {
			Static275.aClass208Array1 = Static316.method5503();
			Static316.aClass208_1.method5505(new Class291(Static134.aClass254_105));
			Static316.aClass208_3.method5505(new Class321("jaggl"));
			Static316.aClass208_4.method5505(new Class321("jagdx"));
			Static316.aClass208_5.method5505(new Class321("jagmisc"));
			Static316.aClass208_6.method5505(new Class321("sw3d"));
			Static316.aClass208_7.method5505(new Class321("hw3d"));
			Static316.aClass208_8.method5505(new Class291(Static44.aClass254_17));
			Static316.aClass208_9.method5505(new Class291(Static144.aClass254_45));
			Static316.aClass208_10.method5505(new Class291(Static389.aClass254_103));
			Static316.aClass208_11.method5505(new Class291(Static22.aClass254_10));
			Static316.aClass208_12.method5505(new Class291(Static434.aClass254_111));
			Static316.aClass208_13.method5505(new Class291(Static145.aClass254_49));
			Static316.aClass208_14.method5505(new Class291(Static497.aClass254_125));
			Static316.aClass208_15.method5505(new Class291(Static437.aClass254_115));
			Static316.aClass208_16.method5505(new Class291(Static188.aClass254_61));
			Static316.aClass208_17.method5505(new Class291(Static205.aClass254_68));
			Static316.aClass208_18.method5505(new Class291(Static483.aClass254_122));
			Static316.aClass208_19.method5505(new Class291(Static280.aClass254_131));
			Static316.aClass208_20.method5505(new Class291(Static563.aClass254_134));
			Static316.aClass208_21.method5505(new Class291(Static467.aClass254_120));
			Static316.aClass208_22.method5505(new Class202(Static188.aClass254_60, "huffman"));
			Static316.aClass208_23.method5505(new Class291(Static257.aClass254_74));
			Static316.aClass208_24.method5505(new Class291(Static96.aClass254_29));
			Static316.aClass208_25.method5505(new Class291(Static289.aClass254_92));
			Static316.aClass208_26.method5505(new Class345(Static392.aClass254_104, "details"));
			for (local233 = 0; local233 < Static275.aClass208Array1.length; local233++) {
				if (Static275.aClass208Array1[local233].method5509() == null) {
					throw new RuntimeException();
				}
			}
			local258 = 0;
			@Pc(260) Class208[] local260 = Static275.aClass208Array1;
			for (@Pc(262) int local262 = 0; local262 < local260.length; local262++) {
				@Pc(268) Class208 local268 = local260[local262];
				local274 = local268.method5507();
				local280 = local268.method5509().method8138();
				local258 += local274 * local280 / 100;
			}
			Static146.anInt9947 = local258;
			Static133.anInt3192 = 2;
		}
		if (Static275.aClass208Array1 == null) {
			return 100;
		}
		local233 = 0;
		local258 = 0;
		@Pc(311) boolean local311 = true;
		@Pc(313) Class208[] local313 = Static275.aClass208Array1;
		for (@Pc(315) int local315 = 0; local315 < local313.length; local315++) {
			@Pc(321) Class208 local321 = local313[local315];
			local280 = local321.method5507();
			@Pc(333) int local333 = local321.method5509().method8138();
			local258 += local280 * local333 / 100;
			if (local333 < 100) {
				local311 = false;
			}
			local233 += local280;
		}
		if (local311) {
			if (!((Class321) Static316.aClass208_5.method5509()).method7716()) {
				Static173.aClient1.method1677();
			}
			Static275.aClass208Array1 = null;
		}
		local233 -= Static146.anInt9947;
		local258 -= Static146.anInt9947;
		local274 = local233 > 0 ? local258 * 100 / local233 : 100;
		if (!local311 && local274 > 99) {
			local274 = 99;
		}
		return local274;
	}

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "(I)V")
	public static void method8181() {
		if (Static313.aClass163_1 != null) {
			Static313.aClass163_1.method3936();
		}
		while (true) {
			try {
				Static433.aThread3.join();
				return;
			} catch (@Pc(16) InterruptedException local16) {
			}
		}
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(B)Lclient!hea;")
	public static Class137 method8182() {
		return Static518.method7688();
	}
}

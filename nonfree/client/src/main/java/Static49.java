import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!he", name = "g", descriptor = "[I")
	public static int[] anIntArray152;

	@OriginalMember(owner = "client!he", name = "o", descriptor = "I")
	public static int anInt1468;

	@OriginalMember(owner = "client!he", name = "a", descriptor = "Lclient!id;")
	public static Class34 aClass34_712 = Static9.method266("(U");

	@OriginalMember(owner = "client!he", name = "b", descriptor = "Lclient!id;")
	public static Class34 aClass34_713 = Static9.method266("Schrifts-=tze geladen)3");

	@OriginalMember(owner = "client!he", name = "f", descriptor = "Lclient!id;")
	public static Class34 aClass34_714 = Static9.method266("Verbindung abgebrochen)3");

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(I)V")
	public static void method909() {
		anIntArray152 = null;
		aClass34_714 = null;
		aClass34_712 = null;
		aClass34_713 = null;
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(I)[Lclient!e;")
	public static Class1_Sub1_Sub2_Sub2[] method910() {
		@Pc(8) Class1_Sub1_Sub2_Sub2[] local8 = new Class1_Sub1_Sub2_Sub2[Static32.anInt1454];
		for (@Pc(15) int local15 = 0; local15 < Static32.anInt1454; local15++) {
			@Pc(25) Class1_Sub1_Sub2_Sub2 local25 = local8[local15] = new Class1_Sub1_Sub2_Sub2();
			local25.anInt879 = Static123.anInt2913;
			local25.anInt882 = Static78.anInt2092;
			local25.anInt878 = Static78.anIntArray244[local15];
			local25.anInt881 = Static87.anIntArray297[local15];
			local25.anInt883 = Static91.anIntArray298[local15];
			local25.anInt880 = Static116.anIntArray351[local15];
			local25.anIntArray87 = Static32.anIntArray150;
			local25.aByteArray12 = Static77.aByteArrayArray7[local15];
		}
		Static5.method212();
		return local8;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(II)Lclient!id;")
	public static Class34 method911(@OriginalArg(1) int arg0) {
		return Static91.method1554(new Class34[] { Static85.method1456(arg0 >> 24 & 0xFF), Static114.aClass34_1382, Static85.method1456(arg0 >> 16 & 0xFF), Static114.aClass34_1382, Static85.method1456(arg0 >> 8 & 0xFF), Static114.aClass34_1382, Static85.method1456(arg0 & 0xFF) });
	}
}

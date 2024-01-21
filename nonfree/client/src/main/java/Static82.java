import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static82 {

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "Lclient!wa;")
	public static Class2_Sub22 aClass2_Sub22_16;

	@OriginalMember(owner = "client!oc", name = "c", descriptor = "Lclient!pe;")
	public static Class65 aClass65_1178 = Static119.method1462("Update)2Liste geladen)3");

	@OriginalMember(owner = "client!oc", name = "e", descriptor = "Lclient!pe;")
	public static Class65 aClass65_1179 = Static119.method1462("welle2:");

	@OriginalMember(owner = "client!oc", name = "f", descriptor = "Lclient!pe;")
	public static Class65 aClass65_1180 = Static119.method1462("leuchten3:");

	@OriginalMember(owner = "client!oc", name = "g", descriptor = "Lclient!pe;")
	private static Class65 aClass65_1181 = Static119.method1462("Create a free account");

	@OriginalMember(owner = "client!oc", name = "h", descriptor = "Lclient!jb;")
	public static Class40 aClass40_22 = new Class40(512);

	@OriginalMember(owner = "client!oc", name = "i", descriptor = "Lclient!pe;")
	public static Class65 aClass65_1182 = aClass65_1181;

	@OriginalMember(owner = "client!oc", name = "k", descriptor = "Lclient!pe;")
	public static Class65 aClass65_1183 = Static119.method1462("Fallen lassen");

	@OriginalMember(owner = "client!oc", name = "m", descriptor = "Lclient!wa;")
	public static Class2_Sub22 aClass2_Sub22_17 = null;

	@OriginalMember(owner = "client!oc", name = "n", descriptor = "Ljava/util/zip/CRC32;")
	public static CRC32 aCRC32_3 = new CRC32();

	@OriginalMember(owner = "client!oc", name = "o", descriptor = "I")
	public static int anInt2718 = 0;

	@OriginalMember(owner = "client!oc", name = "p", descriptor = "Lclient!pe;")
	public static Class65 aClass65_1184 = Static119.method1462("Verbindung konnte nicht hergestellt werden)3");

	@OriginalMember(owner = "client!oc", name = "q", descriptor = "I")
	public static int anInt2719 = 0;

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IZI)Lclient!pe;")
	public static Class65 method1932(@OriginalArg(2) int arg0) {
		return Static67.method1212(arg0, true);
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IILclient!be;)Lclient!pe;")
	public static Class65 method1933(@OriginalArg(2) Class2_Sub4 arg0) {
		try {
			@Pc(7) Class65 local7 = new Class65();
			local7.anInt2005 = arg0.method938();
			if (local7.anInt2005 > 32767) {
				local7.anInt2005 = 32767;
			}
			local7.aByteArray27 = new byte[local7.anInt2005];
			arg0.anInt1298 += Static76.aClass14_1.method276(local7.aByteArray27, local7.anInt2005, arg0.aByteArray20, 0, arg0.anInt1298);
			return local7;
		} catch (@Pc(48) Exception local48) {
			return Static72.aClass65_711;
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(ILclient!na;B)Lclient!sb;")
	public static Class2_Sub15 method1934(@OriginalArg(0) int arg0, @OriginalArg(1) Class56 arg1) {
		@Pc(8) byte[] local8 = arg1.method1675(arg0);
		return local8 == null ? null : new Class2_Sub15(local8);
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(ILclient!pe;BLclient!pe;Lclient!pe;)V")
	public static void method1936(@OriginalArg(0) int arg0, @OriginalArg(1) Class65 arg1, @OriginalArg(3) Class65 arg2, @OriginalArg(4) Class65 arg3) {
		for (@Pc(1) int local1 = 99; local1 > 0; local1--) {
			Static132.anIntArray414[local1] = Static132.anIntArray414[local1 - 1];
			Static97.aClass65Array53[local1] = Static97.aClass65Array53[local1 - 1];
			Static101.aClass65Array57[local1] = Static101.aClass65Array57[local1 - 1];
			Static123.aClass65Array71[local1] = Static123.aClass65Array71[local1 - 1];
		}
		Static97.aClass65Array53[0] = arg3;
		Static132.anIntArray414[0] = arg0;
		Static101.aClass65Array57[0] = arg2;
		Static60.anInt467++;
		Static123.aClass65Array71[0] = arg1;
		Static5.anInt166 = Static8.anInt228;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Z)V")
	public static void method1937() {
		aClass65_1179 = null;
		aClass65_1180 = null;
		aClass65_1181 = null;
		aClass2_Sub22_17 = null;
		aClass40_22 = null;
		aCRC32_3 = null;
		aClass65_1178 = null;
		aClass65_1182 = null;
		aClass2_Sub22_16 = null;
		aClass65_1184 = null;
		aClass65_1183 = null;
	}
}

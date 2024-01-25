import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static390 {

	@OriginalMember(owner = "client!ob", name = "I", descriptor = "Lclient!it;")
	public static Class28 aClass28_11;

	@OriginalMember(owner = "client!ob", name = "y", descriptor = "Lclient!uga;")
	public static final Class5_Sub52 aClass5_Sub52_1 = new Class5_Sub52(0, 0);

	@OriginalMember(owner = "client!ob", name = "E", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray3 = new Color[] { new Color(9179409), new Color(16777215), new Color(16726277), new Color(16726277) };

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(ILclient!cca;)V")
	public static void method5789(@OriginalArg(1) Class4_Sub2_Sub1_Sub1_Sub2 arg0) {
		for (@Pc(14) Class5_Sub20 local14 = (Class5_Sub20) Static497.aClass330_55.method7908(); local14 != null; local14 = (Class5_Sub20) Static497.aClass330_55.method7914()) {
			if (arg0 == local14.aClass4_Sub2_Sub1_Sub1_Sub2_2) {
				if (local14.aClass5_Sub1_Sub4_2 != null) {
					Static26.aClass5_Sub1_Sub2_1.method5052(local14.aClass5_Sub1_Sub4_2);
					local14.aClass5_Sub1_Sub4_2 = null;
				}
				local14.method9047();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIZ)Z")
	public static boolean method5791(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x34) != 0;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(BI)Z")
	public static boolean method5792(@OriginalArg(1) int arg0) {
		if (arg0 == 58 || arg0 == 30 || arg0 == 23 || arg0 == 15 || arg0 == 2) {
			return true;
		} else {
			return arg0 == 45 || arg0 == 1004;
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Ljava/lang/String;I)[B")
	public static byte[] method5793(@OriginalArg(0) String arg0) {
		@Pc(16) int local16 = arg0.length();
		@Pc(19) byte[] local19 = new byte[local16];
		for (@Pc(21) int local21 = 0; local21 < local16; local21++) {
			@Pc(27) char local27 = arg0.charAt(local21);
			if (local27 > '\u0000' && local27 < '\u0080' || !(local27 < ' ' || local27 > 'ÿ')) {
				local19[local21] = (byte) local27;
			} else if (local27 == '€') {
				local19[local21] = -128;
			} else if (local27 == '‚') {
				local19[local21] = -126;
			} else if (local27 == 'ƒ') {
				local19[local21] = -125;
			} else if (local27 == '„') {
				local19[local21] = -124;
			} else if (local27 == '…') {
				local19[local21] = -123;
			} else if (local27 == '†') {
				local19[local21] = -122;
			} else if (local27 == '‡') {
				local19[local21] = -121;
			} else if (local27 == 'ˆ') {
				local19[local21] = -120;
			} else if (local27 == '‰') {
				local19[local21] = -119;
			} else if (local27 == 'Š') {
				local19[local21] = -118;
			} else if (local27 == '‹') {
				local19[local21] = -117;
			} else if (local27 == 'Œ') {
				local19[local21] = -116;
			} else if (local27 == 'Ž') {
				local19[local21] = -114;
			} else if (local27 == '‘') {
				local19[local21] = -111;
			} else if (local27 == '’') {
				local19[local21] = -110;
			} else if (local27 == '“') {
				local19[local21] = -109;
			} else if (local27 == '”') {
				local19[local21] = -108;
			} else if (local27 == '•') {
				local19[local21] = -107;
			} else if (local27 == '–') {
				local19[local21] = -106;
			} else if (local27 == '—') {
				local19[local21] = -105;
			} else if (local27 == '˜') {
				local19[local21] = -104;
			} else if (local27 == '™') {
				local19[local21] = -103;
			} else if (local27 == 'š') {
				local19[local21] = -102;
			} else if (local27 == '›') {
				local19[local21] = -101;
			} else if (local27 == 'œ') {
				local19[local21] = -100;
			} else if (local27 == 'ž') {
				local19[local21] = -98;
			} else if (local27 == 'Ÿ') {
				local19[local21] = -97;
			} else {
				local19[local21] = 63;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!ob", name = "f", descriptor = "(I)V")
	public static void method5794() {
		for (@Pc(6) Class5_Sub5_Sub4 local6 = (Class5_Sub5_Sub4) Static601.aClass368_13.method8702(); local6 != null; local6 = (Class5_Sub5_Sub4) Static601.aClass368_13.method8710()) {
			if (local6.anInt2287 > 1) {
				local6.anInt2287 = 0;
				Static171.aClass87_94.method1792(((Class5_Sub5_Sub15) local6.aClass368_2.aClass5_Sub5_64.aClass5_Sub5_66).aLong173, local6);
				local6.aClass368_2.method8703();
			}
		}
		Static140.anInt2437 = 0;
		Static491.anInt8293 = 0;
		Static84.aClass330_6.method7910();
		Static594.aClass273_45.method6586();
		Static601.aClass368_13.method8703();
		Static142.aBoolean190 = false;
	}
}

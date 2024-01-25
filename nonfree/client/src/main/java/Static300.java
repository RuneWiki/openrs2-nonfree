import java.awt.Container;
import java.awt.Insets;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static300 {

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "I")
	public static int anInt5017;

	@OriginalMember(owner = "client!pa", name = "c", descriptor = "I")
	public static int anInt5018 = 0;

	@OriginalMember(owner = "client!pa", name = "j", descriptor = "Ljava/lang/Boolean;")
	public static Boolean aBoolean402 = Boolean.FALSE;

	@OriginalMember(owner = "client!pa", name = "k", descriptor = "I")
	public static int anInt5023 = 0;

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(Z)V")
	public static void method3931() {
		if (Static230.anInt6340 != 0) {
			Static174.anInt2850 -= Static230.anInt6340 * 5;
			if (Static248.anInt4059 <= Static174.anInt2850) {
				Static174.anInt2850 = Static248.anInt4059 - 1;
			}
			if (Static174.anInt2850 < 0) {
				Static174.anInt2850 = 0;
			}
			Static230.anInt6340 = 0;
		}
		if (Static132.anInt2264 < 102) {
			Static132.anInt2264 += 6;
		}
		for (@Pc(35) int local35 = 0; local35 < Static36.anInt708; local35++) {
			@Pc(47) int local47 = Static266.aClass143Array3[local35].method2870();
			@Pc(53) char local53 = Static266.aClass143Array3[local35].method2873();
			if (local47 == 84) {
				Static243.method4677();
			} else if (Static321.aClass31_4.method3798(82) && local47 == 66) {
				if (Static276.aClipboard1 != null) {
					@Pc(68) String local68 = "";
					for (@Pc(73) int local73 = Static270.aStringArray36.length - 1; local73 >= 0; local73--) {
						if (Static270.aStringArray36[local73] != null && Static270.aStringArray36[local73].length() > 0) {
							local68 = local68 + Static270.aStringArray36[local73] + '\n';
						}
					}
					Static276.aClipboard1.setContents(new StringSelection(local68), null);
				}
			} else if (Static321.aClass31_4.method3798(82) && local47 == 67) {
				if (Static276.aClipboard1 != null) {
					@Pc(329) Transferable local329 = Static276.aClipboard1.getContents(null);
					if (local329 != null) {
						try {
							@Pc(336) String local336 = (String) local329.getTransferData(DataFlavor.stringFlavor);
							if (local336 != null) {
								@Pc(343) String[] local343 = Static150.method2106(local336, '\n');
								if (local343.length <= 1) {
									Static411.aString55 = Static411.aString55 + local336;
								} else {
									for (@Pc(360) int local360 = 0; local360 < local343.length; local360++) {
										Static411.aString55 = local343[local360];
										Static243.method4677();
									}
								}
							}
						} catch (@Pc(379) Exception local379) {
						}
					}
				}
			} else if (local47 == 85 && Static9.anInt192 > 0) {
				Static411.aString55 = Static411.aString55.substring(0, Static9.anInt192 - 1) + Static411.aString55.substring(Static9.anInt192);
				Static9.anInt192--;
			} else if (local47 == 101 && Static9.anInt192 < Static411.aString55.length()) {
				Static411.aString55 = Static411.aString55.substring(0, Static9.anInt192) + Static411.aString55.substring(Static9.anInt192 + 1);
			} else if (local47 == 96 && Static9.anInt192 > 0) {
				Static9.anInt192--;
			} else if (local47 == 97 && Static9.anInt192 < Static411.aString55.length()) {
				Static9.anInt192++;
			} else if (local47 == 102) {
				Static9.anInt192 = 0;
			} else if (local47 == 103) {
				Static9.anInt192 = Static411.aString55.length();
			} else if (local47 == 104 && Static270.aStringArray36.length > Static128.anInt2234) {
				Static128.anInt2234++;
				Static419.method5233();
				Static9.anInt192 = Static411.aString55.length();
			} else if (local47 == 105 && Static128.anInt2234 > 0) {
				Static128.anInt2234--;
				Static419.method5233();
				Static9.anInt192 = Static411.aString55.length();
			} else if (Static63.method972(local53) || local53 == ':' || local53 == ',' || local53 == ' ' || local53 == '_' || local53 == '-' || local53 == '+' || local53 == '[' || local53 == ']') {
				Static411.aString55 = Static411.aString55.substring(0, Static9.anInt192) + Static266.aClass143Array3[local35].method2873() + Static411.aString55.substring(Static9.anInt192);
				Static9.anInt192++;
			}
		}
		Static36.anInt708 = 0;
		Static183.method4174();
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(II)V")
	public static void method3934(@OriginalArg(0) int arg0) {
		Static176.anInt2869 = arg0;
		Static409.anInt6639 = 3;
		Static92.anInt1629 = 100;
		Static157.anInt2629 = -1;
	}

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "(I)V")
	public static void method3936() {
		if (Static70.aFrame1 != null) {
			return;
		}
		@Pc(12) Container local12;
		if (Static158.aFrame2 == null) {
			local12 = Static41.aClass124_2.anApplet1;
		} else {
			local12 = Static158.aFrame2;
		}
		Static320.anInt5295 = local12.getSize().width;
		Static347.anInt5659 = local12.getSize().height;
		if (Static158.aFrame2 == local12) {
			@Pc(31) Insets local31 = Static158.aFrame2.getInsets();
			Static347.anInt5659 -= local31.top + local31.bottom;
			Static320.anInt5295 -= local31.left + local31.right;
		}
		if (Static330.method4209() == 1) {
			Static92.anInt1618 = Static96.anInt1679;
			Static126.anInt2202 = Static110.anInt1939;
			Static434.anInt4327 = (Static320.anInt5295 - Static110.anInt1939) / 2;
			Static239.anInt3852 = 0;
		} else if (Static144.anInt2437 < 96 && Static410.anInt6680 == 0) {
			@Pc(73) int local73 = Static320.anInt5295 <= 1024 ? Static320.anInt5295 : 1024;
			@Pc(80) int local80 = Static347.anInt5659 > 768 ? 768 : Static347.anInt5659;
			Static434.anInt4327 = (Static320.anInt5295 - local73) / 2;
			Static126.anInt2202 = local73;
			Static92.anInt1618 = local80;
			Static239.anInt3852 = 0;
		} else {
			Static92.anInt1618 = Static347.anInt5659;
			Static239.anInt3852 = 0;
			Static126.anInt2202 = Static320.anInt5295;
			Static434.anInt4327 = 0;
		}
		if (Static209.aClass166_6 != Static136.aClass166_3) {
			@Pc(119) boolean local119;
			if (Static126.anInt2202 < 1024 && Static92.anInt1618 < 768) {
				local119 = true;
			} else {
				local119 = false;
			}
		}
		Static226.aCanvas9.setSize(Static126.anInt2202, Static92.anInt1618);
		if (Static213.aClass128_22 != null) {
			Static213.aClass128_22.method3549(Static226.aCanvas9);
		}
		if (Static158.aFrame2 == local12) {
			@Pc(151) Insets local151 = Static158.aFrame2.getInsets();
			Static226.aCanvas9.setLocation(local151.left + Static434.anInt4327, Static239.anInt3852 + local151.top);
		} else {
			Static226.aCanvas9.setLocation(Static434.anInt4327, Static239.anInt3852);
		}
		if (Static169.anInt2522 != -1) {
			Static28.method503(true);
		}
		Static356.method4573();
	}
}

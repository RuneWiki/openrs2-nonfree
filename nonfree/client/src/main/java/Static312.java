import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static312 {

	@OriginalMember(owner = "client!na", name = "t", descriptor = "Lclient!uv;")
	public static final Class296 aClass296_249 = new Class296(25, 6);

	@OriginalMember(owner = "client!na", name = "B", descriptor = "Lclient!lg;")
	public static final Class181 aClass181_4 = new Class181();

	@OriginalMember(owner = "client!na", name = "C", descriptor = "[I")
	public static final int[] anIntArray576 = new int[] { 104, 120, 136, 168 };

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(I)V")
	public static void method4875() {
		Static473.method6593(Static86.aClass156_4);
		Static412.anInt6618++;
		if (Static261.aBoolean148 && Static206.aBoolean286) {
			@Pc(26) int local26 = Static498.aClass5_1.method7052();
			@Pc(33) int local33 = Static498.aClass5_1.method7042();
			local33 -= Static127.anInt4394;
			local26 -= Static321.anInt5867;
			if (local26 < Static45.anInt917) {
				local26 = Static45.anInt917;
			}
			if (local26 + Static86.aClass156_4.anInt4732 > Static197.aClass156_16.anInt4732 + Static45.anInt917) {
				local26 = Static45.anInt917 + Static197.aClass156_16.anInt4732 - Static86.aClass156_4.anInt4732;
			}
			if (local33 < Static293.anInt5490) {
				local33 = Static293.anInt5490;
			}
			if (Static197.aClass156_16.anInt4673 + Static293.anInt5490 < local33 + Static86.aClass156_4.anInt4673) {
				local33 = Static293.anInt5490 + Static197.aClass156_16.anInt4673 - Static86.aClass156_4.anInt4673;
			}
			@Pc(102) int local102 = Static197.aClass156_16.anInt4711 + local26 - Static45.anInt917;
			@Pc(111) int local111 = local33 + Static197.aClass156_16.anInt4707 - Static293.anInt5490;
			@Pc(128) Class1_Sub30 local128;
			if (Static498.aClass5_1.method7049()) {
				if (Static412.anInt6618 > Static86.aClass156_4.anInt4675) {
					@Pc(206) int local206 = local26 - Static457.anInt7786;
					@Pc(211) int local211 = local33 - Static193.anInt7225;
					if (Static86.aClass156_4.anInt4683 < local206 || local206 < -Static86.aClass156_4.anInt4683 || local211 > Static86.aClass156_4.anInt4683 || -Static86.aClass156_4.anInt4683 > local211) {
						Static341.aBoolean437 = true;
					}
				}
				if (Static86.aClass156_4.anObjectArray12 != null && Static341.aBoolean437) {
					local128 = new Class1_Sub30();
					local128.anInt5303 = local102;
					local128.anInt5301 = local111;
					local128.anObjectArray36 = Static86.aClass156_4.anObjectArray12;
					local128.aClass156_11 = Static86.aClass156_4;
					Static180.method2683(local128);
				}
			} else {
				if (Static341.aBoolean437) {
					Static387.method5882();
					if (Static86.aClass156_4.anObjectArray21 != null) {
						local128 = new Class1_Sub30();
						local128.anObjectArray36 = Static86.aClass156_4.anObjectArray21;
						local128.aClass156_11 = Static86.aClass156_4;
						local128.anInt5303 = local102;
						local128.aClass156_12 = Static59.aClass156_2;
						local128.anInt5301 = local111;
						Static180.method2683(local128);
					}
					if (Static59.aClass156_2 != null && Static67.method1226(Static86.aClass156_4) != null) {
						Static209.method3564(Static86.aClass156_4, Static59.aClass156_2);
					}
				} else if ((Static329.anInt5978 == 1 || Static177.method2907()) && Static16.anInt415 > 2) {
					Static197.method7009(Static321.anInt5867 + Static457.anInt7786, Static127.anInt4394 - -Static193.anInt7225);
				} else if (Static376.method5761()) {
					Static197.method7009(Static457.anInt7786 + Static321.anInt5867, Static193.anInt7225 + Static127.anInt4394);
				}
				Static86.aClass156_4 = null;
			}
		} else if (Static412.anInt6618 > 1) {
			Static86.aClass156_4 = null;
		}
	}
}

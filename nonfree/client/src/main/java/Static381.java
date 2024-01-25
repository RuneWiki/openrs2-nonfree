import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static381 {

	@OriginalMember(owner = "client!pr", name = "S", descriptor = "Lclient!vj;")
	public static Class305 aClass305_360;

	@OriginalMember(owner = "client!pr", name = "Q", descriptor = "Lclient!vj;")
	public static final Class305 aClass305_359 = new Class305(88, 8);

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(IIZIII)V")
	public static void method6107(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static189.aFrame1 != null && (arg0 != 3 || Static286.aClass1_Sub15_Sub1_1.anInt7035 != arg1 || arg4 != Static286.aClass1_Sub15_Sub1_1.anInt7038)) {
			Static435.method6744(Static473.aClass229_14, Static189.aFrame1);
			Static189.aFrame1 = null;
		}
		if (arg0 == 3 && Static189.aFrame1 == null) {
			Static189.aFrame1 = Static101.method2060(arg4, Static473.aClass229_14, arg1, 0);
			if (Static189.aFrame1 != null) {
				Static286.aClass1_Sub15_Sub1_1.anInt7038 = arg4;
				Static286.aClass1_Sub15_Sub1_1.anInt7035 = arg1;
				Static286.aClass1_Sub15_Sub1_1.method6376(Static473.aClass229_14);
			}
		}
		if (arg0 == 3 && Static189.aFrame1 == null) {
			method6107(Static286.aClass1_Sub15_Sub1_1.anInt7031, -1, true, arg3, -1);
			return;
		}
		@Pc(74) Container local74;
		@Pc(87) Insets local87;
		if (Static189.aFrame1 != null) {
			local74 = Static189.aFrame1;
			Static204.anInt4066 = arg1;
			Static199.anInt1460 = arg4;
		} else if (Static306.aFrame2 == null) {
			local74 = Static473.aClass229_14.anApplet1;
			Static204.anInt4066 = local74.getSize().width;
			Static199.anInt1460 = local74.getSize().height;
		} else {
			local87 = Static306.aFrame2.getInsets();
			Static204.anInt4066 = Static306.aFrame2.getSize().width - local87.left - local87.right;
			@Pc(104) int local104 = -local87.top;
			Static199.anInt1460 = Static306.aFrame2.getSize().height + local104 - local87.bottom;
			local74 = Static306.aFrame2;
		}
		@Pc(138) int local138;
		if (arg0 == 1) {
			Static466.anInt8038 = 0;
			Static508.anInt8910 = Static60.anInt1482;
			Static70.anInt1753 = Static469.anInt8092;
			Static410.anInt7609 = (Static204.anInt4066 - Static469.anInt8092) / 2;
		} else if (Static520.anInt9181 < 96 && Static449.anInt7876 == 0) {
			local138 = Static204.anInt4066 > 1024 ? 1024 : Static204.anInt4066;
			Static410.anInt7609 = (Static204.anInt4066 - local138) / 2;
			@Pc(154) int local154 = Static199.anInt1460 <= 768 ? Static199.anInt1460 : 768;
			Static70.anInt1753 = local138;
			Static466.anInt8038 = 0;
			Static508.anInt8910 = local154;
		} else {
			Static466.anInt8038 = 0;
			Static508.anInt8910 = Static199.anInt1460;
			Static410.anInt7609 = 0;
			Static70.anInt1753 = Static204.anInt4066;
		}
		if (Static334.aClass139_4 != Static190.aClass139_1) {
			@Pc(199) boolean local199;
			if (Static70.anInt1753 < 1024 && Static508.anInt8910 < 768) {
				local199 = true;
			} else {
				local199 = false;
			}
		}
		if (arg2) {
			Static212.method3937();
		} else {
			Static312.aCanvas12.setSize(Static70.anInt1753, Static508.anInt8910);
			Static455.aClass4_11.method7158(Static312.aCanvas12);
			if (Static306.aFrame2 == local74) {
				local87 = Static306.aFrame2.getInsets();
				Static312.aCanvas12.setLocation(Static410.anInt7609 + local87.left, local87.top - -Static466.anInt8038);
			} else {
				Static312.aCanvas12.setLocation(Static410.anInt7609, Static466.anInt8038);
			}
		}
		if (arg0 < 2) {
			Static186.aBoolean315 = false;
		} else {
			Static186.aBoolean315 = true;
		}
		if (Static328.anInt6167 != -1) {
			Static220.method4021(true);
		}
		if (Static200.aClass134_2 != null && Static215.method3993(Static186.anInt3863)) {
			Static504.method7719();
		}
		for (local138 = 0; local138 < 100; local138++) {
			Static258.aBooleanArray17[local138] = true;
		}
		Static221.aBoolean338 = true;
	}
}

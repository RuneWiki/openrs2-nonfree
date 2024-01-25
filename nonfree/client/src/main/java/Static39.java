import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static39 {

	@OriginalMember(owner = "client!bk", name = "c", descriptor = "I")
	public static int anInt1109;

	@OriginalMember(owner = "client!bk", name = "k", descriptor = "I")
	public static int anInt1114;

	@OriginalMember(owner = "client!bk", name = "l", descriptor = "F")
	public static float aFloat28;

	@OriginalMember(owner = "client!bk", name = "m", descriptor = "I")
	public static int anInt1115;

	@OriginalMember(owner = "client!bk", name = "f", descriptor = "Lclient!cea;")
	public static final Class45 aClass45_21 = new Class45("wave2:", "welle2:", "ondulation2:", "onda2:");

	@OriginalMember(owner = "client!bk", name = "g", descriptor = "Lclient!vj;")
	public static final Class305 aClass305_37 = new Class305(38, 8);

	@OriginalMember(owner = "client!bk", name = "i", descriptor = "Lclient!cea;")
	public static final Class45 aClass45_22 = new Class45("Loading textures - ", "Lade Texturen - ", "Chargement des textures - ", "Carregando texturas - ");

	@OriginalMember(owner = "client!bk", name = "j", descriptor = "I")
	public static int anInt1113 = -1;

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(I)V")
	public static void method1120() {
		if (Static189.aFrame1 != null) {
			return;
		}
		@Pc(12) Container local12;
		if (Static306.aFrame2 == null) {
			local12 = Static473.aClass229_14.anApplet1;
		} else {
			local12 = Static306.aFrame2;
		}
		Static204.anInt4066 = local12.getSize().width;
		Static199.anInt1460 = local12.getSize().height;
		@Pc(31) Insets local31;
		if (Static306.aFrame2 == local12) {
			local31 = Static306.aFrame2.getInsets();
			Static199.anInt1460 -= local31.bottom + local31.top;
			Static204.anInt4066 -= local31.right + local31.left;
		}
		if (Static226.method4065() == 1) {
			Static410.anInt7609 = (Static204.anInt4066 - Static469.anInt8092) / 2;
			Static70.anInt1753 = Static469.anInt8092;
			Static466.anInt8038 = 0;
			Static508.anInt8910 = Static60.anInt1482;
		} else if (Static520.anInt9181 < 96 && Static449.anInt7876 == 0) {
			@Pc(68) int local68 = Static204.anInt4066 > 1024 ? 1024 : Static204.anInt4066;
			Static410.anInt7609 = (Static204.anInt4066 - local68) / 2;
			Static70.anInt1753 = local68;
			@Pc(84) int local84 = Static199.anInt1460 > 768 ? 768 : Static199.anInt1460;
			Static466.anInt8038 = 0;
			Static508.anInt8910 = local84;
		} else {
			Static410.anInt7609 = 0;
			Static466.anInt8038 = 0;
			Static508.anInt8910 = Static199.anInt1460;
			Static70.anInt1753 = Static204.anInt4066;
		}
		if (Static190.aClass139_1 != Static334.aClass139_4) {
			@Pc(124) boolean local124;
			if (Static70.anInt1753 < 1024 && Static508.anInt8910 < 768) {
				local124 = true;
			} else {
				local124 = false;
			}
		}
		Static312.aCanvas12.setSize(Static70.anInt1753, Static508.anInt8910);
		if (Static455.aClass4_11 != null) {
			Static455.aClass4_11.method7158(Static312.aCanvas12);
		}
		if (local12 == Static306.aFrame2) {
			local31 = Static306.aFrame2.getInsets();
			Static312.aCanvas12.setLocation(local31.left + Static410.anInt7609, local31.top - -Static466.anInt8038);
		} else {
			Static312.aCanvas12.setLocation(Static410.anInt7609, Static466.anInt8038);
		}
		if (Static328.anInt6167 != -1) {
			Static220.method4021(true);
		}
		Static311.method5393();
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(II)Lclient!il;")
	public static Class139 method1122(@OriginalArg(0) int arg0) {
		@Pc(13) Class139[] local13 = Static22.method608();
		for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
			@Pc(21) Class139 local21 = local13[local15];
			if (local21.anInt4067 == arg0) {
				return local21;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(BLclient!os;I)V")
	public static void method1123(@OriginalArg(1) Class1_Sub17 arg0, @OriginalArg(2) int arg1) {
		if (Static528.aClass265_6 == null) {
			return;
		}
		try {
			Static528.aClass265_6.method6862(0L);
			Static528.aClass265_6.method6867(arg0.aByteArray58, 24, arg1);
		} catch (@Pc(14) Exception local14) {
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(III)V")
	public static void method1124(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class64 local7 = Static263.aClass64ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		if (local7.aClass20_Sub4_2 != null) {
			local7.aClass20_Sub4_2 = null;
		}
		if (local7.aClass20_Sub4_1 != null) {
			local7.aClass20_Sub4_1 = null;
		}
	}
}

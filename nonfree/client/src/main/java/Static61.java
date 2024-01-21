import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static61 {

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "Lclient!w;")
	public static Class96 aClass96_16;

	@OriginalMember(owner = "client!gb", name = "h", descriptor = "Lclient!g;")
	public static Class34 aClass34_1;

	@OriginalMember(owner = "client!gb", name = "c", descriptor = "I")
	public static int anInt1464 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!gb", name = "e", descriptor = "I")
	public static int anInt1466 = 0;

	@OriginalMember(owner = "client!gb", name = "j", descriptor = "Lclient!vd;")
	private static final Class92 aClass92_599 = Static187.method3089("Players");

	@OriginalMember(owner = "client!gb", name = "f", descriptor = "Lclient!vd;")
	public static Class92 aClass92_597 = aClass92_599;

	@OriginalMember(owner = "client!gb", name = "i", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_598 = Static187.method3089("RuneScape wurde aktualisiert(Q");

	@OriginalMember(owner = "client!gb", name = "k", descriptor = "I")
	public static int anInt1468 = 0;

	@OriginalMember(owner = "client!gb", name = "n", descriptor = "Lclient!vd;")
	private static final Class92 aClass92_601 = Static187.method3089("Your profile will be transferred in:");

	@OriginalMember(owner = "client!gb", name = "l", descriptor = "Lclient!vd;")
	public static Class92 aClass92_600 = aClass92_601;

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(II)I")
	public static int method996(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(B)V")
	public static void method997() {
		for (@Pc(10) Class1_Sub3_Sub18 local10 = (Class1_Sub3_Sub18) Static69.aClass20_5.method467(); local10 != null; local10 = (Class1_Sub3_Sub18) Static69.aClass20_5.method468()) {
			@Pc(15) Class8_Sub2 local15 = local10.aClass8_Sub2_1;
			if (local15.anInt813 != Static192.anInt4180 || Static155.anInt2981 > local15.anInt830) {
				local10.method3414();
			} else if (local15.anInt816 <= Static155.anInt2981) {
				if (local15.anInt833 > 0) {
					@Pc(50) Class8_Sub3_Sub2 local50 = Static177.aClass8_Sub3_Sub2Array1[local15.anInt833 - 1];
					if (local50 != null && local50.anInt3600 >= 0 && local50.anInt3600 < 13312 && local50.anInt3606 >= 0 && local50.anInt3606 < 13312) {
						local15.method613(Static155.anInt2981, local50.anInt3600, local50.anInt3606, Static64.method1027(local50.anInt3606, local50.anInt3600, local15.anInt813) - local15.anInt820);
					}
				}
				if (local15.anInt833 < 0) {
					@Pc(104) int local104 = -local15.anInt833 - 1;
					@Pc(115) Class8_Sub3_Sub1 local115;
					if (Static32.anInt769 == local104) {
						local115 = Static15.aClass8_Sub3_Sub1_1;
					} else {
						local115 = Static47.aClass8_Sub3_Sub1Array1[local104];
					}
					if (local115 != null && local115.anInt3600 >= 0 && local115.anInt3600 < 13312 && local115.anInt3606 >= 0 && local115.anInt3606 < 13312) {
						local15.method613(Static155.anInt2981, local115.anInt3600, local115.anInt3606, Static64.method1027(local115.anInt3606, local115.anInt3600, local15.anInt813) - local15.anInt820);
					}
				}
				local15.method619(Static110.anInt2383);
				Static5.method99(Static192.anInt4180, (int) local15.aDouble8, (int) local15.aDouble3, (int) local15.aDouble4, 60, local15, local15.anInt822, -1L, false);
			}
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Ljava/lang/Throwable;ILjava/lang/String;)V")
	public static void method998(@OriginalArg(0) Throwable arg0, @OriginalArg(2) String arg1) {
		try {
			@Pc(12) String local12 = "";
			if (arg0 != null) {
				local12 = Static45.method815(arg0);
			}
			if (arg1 != null) {
				if (arg0 != null) {
					local12 = local12 + " | ";
				}
				local12 = local12 + arg1;
			}
			System.out.println("Error: " + local12);
			local12 = local12.replace(':', '.');
			local12 = local12.replace('@', '_');
			local12 = local12.replace('&', '_');
			local12 = local12.replace('#', '_');
			if (Static20.aClass24_1.anApplet1 != null) {
				@Pc(106) Class65 local106 = Static20.aClass24_1.method556(new URL(Static20.aClass24_1.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static138.anInt2801 + "&u=" + Static59.aLong64 + "&v1=" + Static30.aString3 + "&v2=" + Static30.aString1 + "&e=" + local12));
				while (local106.anInt2681 == 0) {
					Static199.method3292(1L);
				}
				if (local106.anInt2681 == 1) {
					@Pc(125) DataInputStream local125 = (DataInputStream) local106.anObject3;
					local125.read();
					local125.close();
				}
			}
		} catch (@Pc(132) Exception local132) {
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Z)Lclient!bg;")
	public static Class1_Sub3_Sub1_Sub1 method999() {
		@Pc(9) Class1_Sub3_Sub1_Sub1 local9 = new Class1_Sub3_Sub1_Sub1();
		local9.anInt454 = Static193.anIntArray276[0];
		local9.anInt451 = Static92.anInt1967;
		@Pc(21) byte[] local21 = Static143.aByteArrayArray6[0];
		local9.anInt449 = Static197.anInt4330;
		local9.anInt450 = Static76.anIntArray133[0];
		local9.anInt452 = Static164.anIntArray302[0];
		@Pc(45) int local45 = local9.anInt450 * local9.anInt452;
		local9.anInt453 = Static154.anIntArray285[0];
		local9.anIntArray44 = new int[local45];
		for (@Pc(56) int local56 = 0; local56 < local45; local56++) {
			local9.anIntArray44[local56] = Static209.anIntArray365[local21[local56] & 0xFF];
		}
		Static145.method2153();
		return local9;
	}
}

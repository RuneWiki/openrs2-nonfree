import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static142 {

	@OriginalMember(owner = "client!gr", name = "X", descriptor = "Lclient!pu;")
	public static final Class198 aClass198_40 = new Class198("Opened title screen", "Titelbild geöffnet.", "Écran-titre ouvert", "Tela título aberta");

	@OriginalMember(owner = "client!gr", name = "Y", descriptor = "[B")
	public static final byte[] aByteArray31 = new byte[2048];

	@OriginalMember(owner = "client!gr", name = "Z", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray16 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

	@OriginalMember(owner = "client!gr", name = "bb", descriptor = "Lclient!jp;")
	public static final Class129 aClass129_63 = new Class129(78, 8);

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(Ljava/awt/Canvas;I)Lclient!gq;")
	public static Class5_Sub17 method2031(@OriginalArg(0) Canvas arg0) {
		try {
			@Pc(11) Class local11 = Class.forName("Class5_Sub17_Sub2");
			@Pc(15) Class5_Sub17 local15 = (Class5_Sub17) local11.getDeclaredConstructor().newInstance();
			local15.method4121(arg0);
			return local15;
		} catch (@Pc(22) Throwable local22) {
			@Pc(26) Class5_Sub17_Sub1 local26 = new Class5_Sub17_Sub1();
			local26.method4121(arg0);
			return local26;
		}
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(I[B)Lclient!tr;")
	public static Class5_Sub2_Sub17 method2032(@OriginalArg(1) byte[] arg0) {
		@Pc(9) Class5_Sub2_Sub17 local9 = new Class5_Sub2_Sub17();
		@Pc(14) Class5_Sub15 local14 = new Class5_Sub15(arg0);
		local14.anInt7013 = local14.aByteArray93.length - 2;
		@Pc(27) int local27 = local14.method5598();
		@Pc(38) int local38 = local14.aByteArray93.length - local27 - 12 - 2;
		local14.anInt7013 = local38;
		@Pc(45) int local45 = local14.method5603();
		local9.anInt6495 = local14.method5598();
		local9.anInt6490 = local14.method5598();
		local9.anInt6494 = local14.method5598();
		local9.anInt6492 = local14.method5598();
		@Pc(69) int local69 = local14.method5539();
		@Pc(77) int local77;
		@Pc(85) int local85;
		if (local69 > 0) {
			local9.aClass252Array1 = new Class252[local69];
			for (local77 = 0; local77 < local69; local77++) {
				local85 = local14.method5598();
				@Pc(92) Class252 local92 = new Class252(Static331.method4084(local85));
				local9.aClass252Array1[local77] = local92;
				while (local85-- > 0) {
					@Pc(103) int local103 = local14.method5603();
					@Pc(107) int local107 = local14.method5603();
					local92.method5658(new Class5_Sub34(local107), (long) local103);
				}
			}
		}
		local14.anInt7013 = 0;
		local9.aString68 = local14.method5565();
		local9.anIntArray461 = new int[local45];
		local9.anIntArray460 = new int[local45];
		local9.aStringArray43 = new String[local45];
		local77 = 0;
		while (local38 > local14.anInt7013) {
			local85 = local14.method5598();
			if (local85 == 3) {
				local9.aStringArray43[local77] = local14.method5549().intern();
			} else if (local85 >= 100 || local85 == 21 || local85 == 38 || local85 == 39) {
				local9.anIntArray460[local77] = local14.method5539();
			} else {
				local9.anIntArray460[local77] = local14.method5603();
			}
			local9.anIntArray461[local77++] = local85;
		}
		return local9;
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(IBLclient!pq;I)V")
	public static void method2033(@OriginalArg(0) int arg0, @OriginalArg(2) Class196 arg1, @OriginalArg(3) int arg2) {
		Static277.aClass196ArrayArray1[arg2][arg0] = arg1;
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(Lclient!wl;I)V")
	public static void method2034(@OriginalArg(0) Class2_Sub1_Sub3 arg0) {
		if (arg0 instanceof Class2_Sub1_Sub3_Sub1) {
			@Pc(30) Class2_Sub1_Sub3_Sub1 local30 = (Class2_Sub1_Sub3_Sub1) arg0;
			if (local30.aClass131_1 == null) {
				return;
			}
			Static23.method402(local30, local30.aByte105 != Static220.aClass2_Sub1_Sub3_Sub2_1.aByte105);
		} else if (arg0 instanceof Class2_Sub1_Sub3_Sub2) {
			@Pc(15) Class2_Sub1_Sub3_Sub2 local15 = (Class2_Sub1_Sub3_Sub2) arg0;
			Static113.method1562(local15, Static220.aClass2_Sub1_Sub3_Sub2_1.aByte105 != local15.aByte105);
			return;
		}
	}

	@OriginalMember(owner = "client!gr", name = "b", descriptor = "(II)I")
	public static int method2036(@OriginalArg(1) int arg0) {
		return arg0 >> 11 & 0x7F;
	}
}

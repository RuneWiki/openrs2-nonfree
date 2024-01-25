import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static602 {

	@OriginalMember(owner = "client!via", name = "r", descriptor = "[Lclient!pg;")
	public static Class4_Sub2_Sub2_Sub1[] aClass4_Sub2_Sub2_Sub1Array2;

	@OriginalMember(owner = "client!via", name = "A", descriptor = "D")
	public static double aDouble33;

	@OriginalMember(owner = "client!via", name = "u", descriptor = "Lclient!uia;")
	public static final Class340 aClass340_6 = new Class340();

	@OriginalMember(owner = "client!via", name = "w", descriptor = "I")
	public static int anInt9811 = 0;

	@OriginalMember(owner = "client!via", name = "z", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray37 = new String[8];

	@OriginalMember(owner = "client!via", name = "a", descriptor = "(Lclient!sm;III)Lclient!jj;")
	public static Class3_Sub4_Sub14 method8406(@OriginalArg(0) Class311 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = arg2 << 10 | arg0.anInt8989;
		@Pc(19) Class3_Sub4_Sub14 local19 = (Class3_Sub4_Sub14) Static436.aClass357_3.method8390((long) local10 << 16);
		if (local19 != null) {
			return local19;
		}
		@Pc(31) byte[] local31 = Static522.aClass196_109.method5113(Static522.aClass196_109.method5124(local10));
		if (local31 == null) {
			local10 = arg0.anInt8989 | arg1 + 65536 << 10;
			local19 = (Class3_Sub4_Sub14) Static436.aClass357_3.method8390((long) local10 << 16);
			if (local19 != null) {
				return local19;
			}
			local31 = Static522.aClass196_109.method5113(Static522.aClass196_109.method5124(local10));
			if (local31 == null) {
				local10 = arg0.anInt8989 | 0x3FFFC00;
				local19 = (Class3_Sub4_Sub14) Static436.aClass357_3.method8390((long) local10 << 16);
				if (local19 != null) {
					return local19;
				}
				local31 = Static522.aClass196_109.method5113(Static522.aClass196_109.method5124(local10));
				if (local31 == null) {
					return null;
				} else if (local31.length <= 1) {
					return null;
				} else {
					try {
						local19 = Static564.method8102(local31);
					} catch (@Pc(191) Exception local191) {
						throw new RuntimeException(local191.getMessage() + " S: " + local10);
					}
					local19.aClass311_6 = arg0;
					Static436.aClass357_3.method8392((long) local10 << 16, local19);
					return local19;
				}
			} else if (local31.length <= 1) {
				return null;
			} else {
				try {
					local19 = Static564.method8102(local31);
				} catch (@Pc(121) Exception local121) {
					throw new RuntimeException(local121.getMessage() + " S: " + local10);
				}
				local19.aClass311_6 = arg0;
				Static436.aClass357_3.method8392((long) local10 << 16, local19);
				return local19;
			}
		} else if (local31.length <= 1) {
			return null;
		} else {
			try {
				local19 = Static564.method8102(local31);
			} catch (@Pc(47) Exception local47) {
				throw new RuntimeException(local47.getMessage() + " S: " + local10);
			}
			local19.aClass311_6 = arg0;
			Static436.aClass357_3.method8392((long) local10 << 16, local19);
			return local19;
		}
	}

	@OriginalMember(owner = "client!via", name = "a", descriptor = "(III)I")
	public static int method8408(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static130.anInt2693 == -1) {
			return 1;
		}
		if (arg1 != Static262.aClass3_Sub27_12.aClass21_Sub1_1.method1025()) {
			Static585.method8269(Static59.aClass43_13.method1598(Static325.anInt6083), true, arg1);
			if (arg1 != Static262.aClass3_Sub27_12.aClass21_Sub1_1.method1025()) {
				return -1;
			}
		}
		try {
			@Pc(47) Dimension local47 = Static364.aCanvas13.getSize();
			Static301.method4799(Static256.aClass282_7, Static323.aClass5_9, Static187.aClass62_4, true, Static59.aClass43_13.method1598(Static325.anInt6083));
			@Pc(63) Class118 local63 = Static330.method5390(Static68.aClass196_18, Static130.anInt2693);
			@Pc(66) long local66 = Static374.method6036();
			Static323.aClass5_9.la();
			Static250.aClass39_4.method7240(0, Static161.anInt3180, 0);
			Static323.aClass5_9.method7504(Static250.aClass39_4);
			Static323.aClass5_9.DA(local47.width / 2, local47.height / 2, 512, 512);
			Static323.aClass5_9.xa(1.0F);
			Static323.aClass5_9.ZA(16777215, 0.5F, 0.5F, 20.0F, -50.0F, 30.0F);
			@Pc(107) Class17 local107 = Static323.aClass5_9.method7490(local63, 2048, 64, 64, 768);
			@Pc(109) int local109 = 0;
			label41: for (@Pc(111) int local111 = 0; local111 < 500; local111++) {
				Static323.aClass5_9.GA(0);
				Static323.aClass5_9.ya();
				for (@Pc(120) int local120 = 15; local120 >= 0; local120--) {
					for (@Pc(124) int local124 = 0; local124 <= local120; local124++) {
						Static1.aClass39_12.method7240((int) ((-((float) local120 / 2.0F) + (float) local124) * (float) Static384.anInt7200), 0, Static384.anInt7200 * (local120 + 1));
						local109++;
						local107.method5411(Static1.aClass39_12, null, 0);
						if (Static374.method6036() - local66 >= (long) arg0) {
							break label41;
						}
					}
				}
			}
			Static323.aClass5_9.method7560();
			@Pc(189) long local189 = (long) (local109 * 1000) / (Static374.method6036() - local66);
			Static323.aClass5_9.GA(0);
			Static323.aClass5_9.ya();
			return (int) local189;
		} catch (@Pc(198) Throwable local198) {
			local198.printStackTrace();
			return -1;
		}
	}
}

import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static450 {

	@OriginalMember(owner = "client!pia", name = "E", descriptor = "I")
	public static int anInt7698;

	@OriginalMember(owner = "client!pia", name = "x", descriptor = "Lclient!uw;")
	public static final Class359 aClass359_164 = new Class359(124, 1);

	@OriginalMember(owner = "client!pia", name = "a", descriptor = "(IIIIIB)V")
	public static void method6498(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 == arg3) {
			Static472.method6780(arg4, arg0, arg1, arg3);
		} else if (arg0 - arg3 >= Static106.anInt2266 && arg0 + arg3 <= Static669.anInt10712 && Static639.anInt10384 <= arg1 - arg2 && arg2 + arg1 <= Static496.anInt8305) {
			Static377.method5633(arg1, arg0, arg3, arg2, arg4);
		} else {
			Static126.method2278(arg2, arg3, arg0, arg1, arg4);
		}
	}

	@OriginalMember(owner = "client!pia", name = "a", descriptor = "(ZI)V")
	public static void method6499(@OriginalArg(1) int arg0) {
		if (arg0 < 0 || arg0 > 2) {
			arg0 = 0;
		}
		Static537.anInt3990 = arg0;
		Static529.aClass28_Sub5Array5 = new Class28_Sub5[Static637.anIntArray563[Static537.anInt3990] + 1];
		Static678.anInt10875 = 0;
		Static75.anInt1090 = 0;
	}

	@OriginalMember(owner = "client!pia", name = "e", descriptor = "(B)Lclient!sf;")
	public static Class5_Sub50 method6500() {
		@Pc(10) Class373 local10 = null;
		@Pc(16) Class5_Sub50 local16 = new Class5_Sub50(Static218.aClass98_2, 0);
		try {
			@Pc(22) Class331 local22 = Static570.aClass268_5.method6326("");
			while (local22.anInt9108 == 0) {
				Static579.method8004(1L);
			}
			if (local22.anInt9108 == 1) {
				local10 = (Class373) local22.anObject20;
				@Pc(48) byte[] local48 = new byte[(int) local10.method8635()];
				@Pc(62) int local62;
				for (@Pc(50) int local50 = 0; local50 < local48.length; local50 += local62) {
					local62 = local10.method8637(local48.length - local50, local48, local50);
					if (local62 == -1) {
						throw new IOException("EOF");
					}
				}
				local16 = new Class5_Sub50(new Class5_Sub41(local48), Static218.aClass98_2, 0);
			}
		} catch (@Pc(94) Exception local94) {
		}
		try {
			if (local10 != null) {
				local10.method8641();
			}
		} catch (@Pc(101) Exception local101) {
		}
		return local16;
	}

	@OriginalMember(owner = "client!pia", name = "a", descriptor = "(IZIII)V")
	public static void method6502(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static639.anInt10384 <= arg2 && Static496.anInt8305 >= arg2) {
			@Pc(19) int local19 = Static596.method2932(Static106.anInt2266, Static669.anInt10712, arg3);
			@Pc(25) int local25 = Static596.method2932(Static106.anInt2266, Static669.anInt10712, arg1);
			Static246.method3847(arg2, local19, arg0, local25);
		}
	}
}

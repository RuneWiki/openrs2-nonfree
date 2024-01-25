import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!ak", name = "d", descriptor = "[Lclient!ci;")
	public static Class50[] aClass50Array1;

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "I")
	public static int anInt562 = -1;

	@OriginalMember(owner = "client!ak", name = "b", descriptor = "Lclient!tt;")
	public static final Class319 aClass319_7 = new Class319(31, -1);

	@OriginalMember(owner = "client!ak", name = "e", descriptor = "I")
	public static int anInt564 = 0;

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(ILjava/io/File;)[B")
	public static byte[] method505(@OriginalArg(1) File arg0) {
		return Static261.method4081(arg0, (int) arg0.length());
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(IILclient!mk;III)V")
	public static void method506(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub30 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg1.anInt5877 == -1 && arg1.anIntArray377 == null) {
			return;
		}
		@Pc(15) int local15 = 0;
		if (arg0 > arg1.anInt5884) {
			local15 = arg0 - arg1.anInt5884;
		} else if (arg1.anInt5891 > arg0) {
			local15 = arg1.anInt5891 - arg0;
		}
		@Pc(53) int local53 = Static479.aClass1_Sub7_Sub1_1.anInt3107 * arg1.anInt5889 >> 8;
		if (arg4 > arg1.anInt5875) {
			local15 += arg4 - arg1.anInt5875;
		} else if (arg4 < arg1.anInt5885) {
			local15 += arg1.anInt5885 - arg4;
		}
		if (arg1.anInt5882 == 0 || arg1.anInt5882 < local15 - 256 || Static479.aClass1_Sub7_Sub1_1.anInt3107 == 0 || arg1.anInt5880 != arg2) {
			if (arg1.aClass1_Sub8_Sub1_4 != null) {
				Static298.aClass1_Sub8_Sub4_2.method6033(arg1.aClass1_Sub8_Sub1_4);
				arg1.aClass1_Sub8_Sub1_4 = null;
				arg1.aClass1_Sub38_3 = null;
				arg1.aClass1_Sub40_Sub1_4 = null;
			}
			if (arg1.aClass1_Sub8_Sub1_3 != null) {
				Static298.aClass1_Sub8_Sub4_2.method6033(arg1.aClass1_Sub8_Sub1_3);
				arg1.aClass1_Sub40_Sub1_3 = null;
				arg1.aClass1_Sub38_2 = null;
				arg1.aClass1_Sub8_Sub1_3 = null;
			}
			return;
		}
		local15 -= 256;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(155) int local155 = local53 * (arg1.anInt5882 - local15) / arg1.anInt5882;
		@Pc(237) Class1_Sub8_Sub1 local237;
		if (arg1.aClass1_Sub8_Sub1_4 != null) {
			arg1.aClass1_Sub8_Sub1_4.method963(local155);
		} else if (arg1.anInt5877 >= 0) {
			if (arg1.aBoolean423) {
				if (arg1.aClass1_Sub38_3 == null) {
					arg1.aClass1_Sub38_3 = Static405.method5716(Static144.aClass111_33, arg1.anInt5877);
				}
				if (arg1.aClass1_Sub38_3 != null) {
					if (arg1.aClass1_Sub40_Sub1_4 == null) {
						arg1.aClass1_Sub40_Sub1_4 = arg1.aClass1_Sub38_3.method5719(new int[] { 22050 });
					}
					if (arg1.aClass1_Sub40_Sub1_4 != null) {
						local237 = Static597.method951(arg1.aClass1_Sub40_Sub1_4, local155);
						local237.method956(-1);
						Static298.aClass1_Sub8_Sub4_2.method6029(local237);
						arg1.aClass1_Sub8_Sub1_4 = local237;
					}
				}
			} else {
				@Pc(179) Class176 local179 = Static601.method4024(Static546.aClass111_117, arg1.anInt5877, 0);
				if (local179 != null) {
					@Pc(186) Class1_Sub40_Sub1 local186 = local179.method4025().method6314(Static154.aClass229_1);
					@Pc(191) Class1_Sub8_Sub1 local191 = Static597.method951(local186, local155);
					local191.method956(-1);
					Static298.aClass1_Sub8_Sub4_2.method6029(local191);
					arg1.aClass1_Sub8_Sub1_4 = local191;
				}
			}
		}
		if (arg1.aClass1_Sub8_Sub1_3 != null) {
			arg1.aClass1_Sub8_Sub1_3.method963(local155);
			if (!arg1.aClass1_Sub8_Sub1_3.method7877()) {
				arg1.aClass1_Sub40_Sub1_3 = null;
				arg1.aClass1_Sub38_2 = null;
				arg1.aClass1_Sub8_Sub1_3 = null;
			}
		} else if (arg1.anIntArray377 != null && (arg1.anInt5888 -= arg3) <= 0) {
			@Pc(293) int local293;
			if (arg1.aBoolean422) {
				if (arg1.aClass1_Sub38_2 == null) {
					local293 = (int) ((double) arg1.anIntArray377.length * Math.random());
					arg1.aClass1_Sub38_2 = Static405.method5716(Static144.aClass111_33, arg1.anIntArray377[local293]);
				}
				if (arg1.aClass1_Sub38_2 != null) {
					if (arg1.aClass1_Sub40_Sub1_3 == null) {
						arg1.aClass1_Sub40_Sub1_3 = arg1.aClass1_Sub38_2.method5719(new int[] { 22050 });
					}
					if (arg1.aClass1_Sub40_Sub1_3 != null) {
						local237 = Static597.method951(arg1.aClass1_Sub40_Sub1_3, local155);
						local237.method956(0);
						Static298.aClass1_Sub8_Sub4_2.method6029(local237);
						arg1.anInt5888 = (int) (Math.random() * (double) (arg1.anInt5890 - arg1.anInt5887)) + arg1.anInt5887;
						arg1.aClass1_Sub8_Sub1_3 = local237;
						return;
					}
				}
				return;
			}
			local293 = (int) (Math.random() * (double) arg1.anIntArray377.length);
			@Pc(368) Class176 local368 = Static601.method4024(Static546.aClass111_117, arg1.anIntArray377[local293], 0);
			if (local368 != null) {
				@Pc(375) Class1_Sub40_Sub1 local375 = local368.method4025().method6314(Static154.aClass229_1);
				@Pc(380) Class1_Sub8_Sub1 local380 = Static597.method951(local375, local155);
				local380.method956(0);
				Static298.aClass1_Sub8_Sub4_2.method6029(local380);
				arg1.aClass1_Sub8_Sub1_3 = local380;
				arg1.anInt5888 = arg1.anInt5887 + (int) (Math.random() * (double) (arg1.anInt5890 - arg1.anInt5887));
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(III)Lclient!lt;")
	public static Class20_Sub2_Sub3 method507(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class293 local7 = Static118.aClass293ArrayArrayArray14[arg0][arg1][arg2];
		return local7 == null || local7.aClass20_Sub2_Sub3_1 == null ? null : local7.aClass20_Sub2_Sub3_1;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(Lclient!io;I)Lclient!ob;")
	public static Class175_Sub3 method510(@OriginalArg(0) Class1_Sub20 arg0) {
		@Pc(12) Class175 local12 = Static594.method7908(arg0);
		@Pc(16) int local16 = arg0.method4371();
		@Pc(20) int local20 = arg0.method4371();
		return new Class175_Sub3(local12.aClass314_13, local12.aClass103_20, local12.anInt9466, local12.anInt9470, local12.anInt9468, local12.anInt9476, local12.anInt9477, local12.anInt9463, local12.anInt9474, local16, local20);
	}
}

import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static410 {

	@OriginalMember(owner = "client!um", name = "c", descriptor = "I")
	public static int anInt6626;

	@OriginalMember(owner = "client!um", name = "f", descriptor = "[Lclient!l;")
	public static Class143[] aClass143Array13;

	@OriginalMember(owner = "client!um", name = "g", descriptor = "I")
	public static int anInt6627;

	@OriginalMember(owner = "client!um", name = "h", descriptor = "F")
	public static float aFloat96;

	@OriginalMember(owner = "client!um", name = "d", descriptor = "Lclient!hn;")
	public static final Class107 aClass107_200 = new Class107(85, 16);

	@OriginalMember(owner = "client!um", name = "e", descriptor = "J")
	public static long aLong201 = 0L;

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(BLclient!od;Ljava/awt/Frame;)V")
	public static void method5508(@OriginalArg(1) Class180 arg0, @OriginalArg(2) Frame arg1) {
		while (true) {
			@Pc(13) Class9 local13 = arg0.method4093(arg1);
			while (local13.anInt368 == 0) {
				Static224.method3441(10L);
			}
			if (local13.anInt368 == 1) {
				arg1.setVisible(false);
				arg1.dispose();
				return;
			}
			Static224.method3441(100L);
		}
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(IZIII)V")
	public static void method5509(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!arg1 && Static307.anInt5295 == arg0 && Static303.anInt5255 == arg2 && (Static357.anInt5881 == Static170.anInt3116 || Static38.aClass135_Sub1_1.method4244(Static143.anInt2766))) {
			return;
		}
		Static303.anInt5255 = arg2;
		Static307.anInt5295 = arg0;
		Static170.anInt3116 = Static357.anInt5881;
		if (Static38.aClass135_Sub1_1.method4244(Static143.anInt2766)) {
			Static170.anInt3116 = 0;
		}
		Static193.method2987(arg3);
		Static18.method3000(true, Static343.aClass7_150.method331(Static341.anInt5770), Static312.aClass71_7);
		@Pc(56) int local56 = Static165.anInt3049;
		@Pc(58) int local58 = Static345.anInt5799;
		Static165.anInt3049 = (Static307.anInt5295 - (Static195.anInt3537 >> 4)) * 8;
		Static345.anInt5799 = (Static303.anInt5255 - (Static118.anInt2419 >> 4)) * 8;
		Static62.aClass1_Sub2_Sub11_3 = Static168.method420(Static307.anInt5295 * 8, Static303.anInt5255 * 8);
		Static236.aClass45_3 = null;
		@Pc(91) int local91 = Static165.anInt3049 - local56;
		@Pc(95) int local95 = Static345.anInt5799 - local58;
		@Pc(102) int local102;
		@Pc(112) int local112;
		if (arg3 == 10) {
			for (local102 = 0; local102 < 32768; local102++) {
				@Pc(108) Class31_Sub2_Sub1_Sub2 local108 = Static98.aClass31_Sub2_Sub1_Sub2Array1[local102];
				if (local108 != null) {
					for (local112 = 0; local112 < 10; local112++) {
						local108.anIntArray658[local112] -= local91;
						local108.anIntArray657[local112] -= local95;
					}
					local108.anInt7298 -= local95 * 128;
					local108.anInt7300 -= local91 * 128;
				}
			}
		} else {
			Static5.anInt163 = 0;
			local102 = Static195.anInt3537 * 128 - 128;
			@Pc(170) int local170 = Static118.anInt2419 * 128 - 128;
			for (local112 = 0; local112 < 32768; local112++) {
				@Pc(178) Class31_Sub2_Sub1_Sub2 local178 = Static98.aClass31_Sub2_Sub1_Sub2Array1[local112];
				if (local178 != null) {
					local178.anInt7298 -= local95 * 128;
					local178.anInt7300 -= local91 * 128;
					if (local178.anInt7300 >= 0 && local178.anInt7300 <= local102 && local178.anInt7298 >= 0 && local178.anInt7298 <= local170) {
						@Pc(235) boolean local235 = true;
						for (@Pc(237) int local237 = 0; local237 < 10; local237++) {
							local178.anIntArray658[local237] -= local91;
							local178.anIntArray657[local237] -= local95;
							if (local178.anIntArray658[local237] < 0 || local178.anIntArray658[local237] >= Static195.anInt3537 || local178.anIntArray657[local237] < 0 || Static118.anInt2419 <= local178.anIntArray657[local237]) {
								local235 = false;
							}
						}
						if (local235) {
							Static331.anIntArray648[Static5.anInt163++] = local112;
						} else {
							Static98.aClass31_Sub2_Sub1_Sub2Array1[local112].method5997(null);
							Static98.aClass31_Sub2_Sub1_Sub2Array1[local112] = null;
						}
					} else {
						Static98.aClass31_Sub2_Sub1_Sub2Array1[local112].method5997(null);
						Static98.aClass31_Sub2_Sub1_Sub2Array1[local112] = null;
					}
				}
			}
		}
		for (local102 = 0; local102 < 2048; local102++) {
			@Pc(319) Class31_Sub2_Sub1_Sub1 local319 = Static458.aClass31_Sub2_Sub1_Sub1Array1[local102];
			if (local319 != null) {
				for (local112 = 0; local112 < 10; local112++) {
					local319.anIntArray658[local112] -= local91;
					local319.anIntArray657[local112] -= local95;
				}
				local319.anInt7298 -= local95 * 128;
				local319.anInt7300 -= local91 * 128;
			}
		}
		@Pc(369) Class83[] local369 = Static353.aClass83Array2;
		for (local112 = 0; local112 < local369.length; local112++) {
			@Pc(377) Class83 local377 = local369[local112];
			if (local377 != null) {
				local377.anInt2457 -= local91 * 128;
				local377.anInt2463 -= local95 * 128;
			}
		}
		Static112.method2068(local95, local91);
		for (@Pc(409) Class1_Sub42 local409 = (Class1_Sub42) Static16.aClass181_4.method4112(); local409 != null; local409 = (Class1_Sub42) Static16.aClass181_4.method4104()) {
			local409.anInt6560 -= local91;
			local409.anInt6557 -= local95;
			if (Static23.anInt5194 != 3 && (local409.anInt6560 < 0 || local409.anInt6557 < 0 || Static195.anInt3537 <= local409.anInt6560 || Static118.anInt2419 <= local409.anInt6557)) {
				local409.method6020();
			}
		}
		if (Static414.anInt6715 != 0) {
			Static207.anInt3927 -= local95;
			Static414.anInt6715 -= local91;
		}
		Static59.method1259();
		if (arg3 != 10) {
			Static258.anInt3113 -= local91;
			Static92.anInt1946 -= local95 * 128;
			Static139.anInt2727 -= local91 * 128;
			Static145.anInt2798 -= local95;
			Static372.anInt6092 -= local91;
			Static374.anInt6117 -= local95;
			if (Math.abs(local91) > Static195.anInt3537 || Math.abs(local95) > Static118.anInt2419) {
				Static355.method4889();
			}
		} else if (Static345.anInt5797 == 4) {
			Static2.anInt63 -= local95 * 128;
			Static3.anInt108 -= local91 * 128;
			Static299.anInt698 -= local95 * 128;
			Static190.anInt3416 -= local91 * 128;
		} else {
			Static345.anInt5797 = 1;
		}
		Static422.method5612();
		Static185.method2913();
		Static64.aClass181_13.method4101();
		Static261.aClass181_48.method4101();
		Static54.aClass141_3.method3358();
		Static10.method332();
	}
}

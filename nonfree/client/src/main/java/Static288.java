import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static288 {

	@OriginalMember(owner = "client!kh", name = "c", descriptor = "Lclient!cr;")
	public static Class56 aClass56_3;

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "Z")
	public static boolean aBoolean384 = false;

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lclient!sca;IZI)V")
	public static void method5010(@OriginalArg(0) Class302 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (Static478.aClass302_56 != null || Static71.aBoolean94 || (arg0 == null || Static245.method5547(arg0) == null)) {
			return;
		}
		Static478.aClass302_56 = arg0;
		Static228.aClass302_30 = Static245.method5547(arg0);
		Static393.anInt7353 = arg1;
		Static243.aBoolean342 = false;
		Static511.anInt8900 = 0;
		Static262.anInt5205 = arg2;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(ILclient!ge;IIII)Ljava/awt/Frame;")
	public static Frame method5011(@OriginalArg(1) Class112 arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		if (!arg0.method3222()) {
			return null;
		}
		@Pc(22) Class125[] local22 = Static510.method7558(arg0);
		if (local22 == null) {
			return null;
		}
		@Pc(28) boolean local28 = false;
		for (@Pc(30) int local30 = 0; local30 < local22.length; local30++) {
			if (local22[local30].anInt4044 == arg2 && local22[local30].anInt4045 == arg3 && (!local28 || arg1 < local22[local30].anInt4047)) {
				arg1 = local22[local30].anInt4047;
				local28 = true;
			}
		}
		if (!local28) {
			return null;
		}
		@Pc(96) Class328 local96 = arg0.method3230(arg3, arg2, arg1);
		while (local96.anInt9389 == 0) {
			Static179.method3254(10L);
		}
		@Pc(115) Frame local115 = (Frame) local96.anObject21;
		if (local115 == null) {
			return null;
		} else if (local96.anInt9389 == 2) {
			Static543.method7947(local115, arg0);
			return null;
		} else {
			return local115;
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(ILclient!cq;)[I")
	public static int[] method5012(@OriginalArg(1) Class6_Sub9 arg0) {
		@Pc(10) Class6_Sub40 local10 = new Class6_Sub40(518);
		@Pc(13) int[] local13 = new int[4];
		for (@Pc(15) int local15 = 0; local15 < 4; local15++) {
			local13[local15] = (int) (Math.random() * 9.9999999E7D);
		}
		local10.method8589(10);
		local10.method8554(local13[0]);
		local10.method8554(local13[1]);
		local10.method8554(local13[2]);
		local10.method8554(local13[3]);
		for (@Pc(58) int local58 = 0; local58 < 10; local58++) {
			local10.method8554((int) (Math.random() * 9.9999999E7D));
		}
		local10.method8561((int) ((double) 99999999 * Math.random()));
		local10.method8566(Static191.aBigInteger2, Static479.aBigInteger6);
		arg0.aClass6_Sub40_Sub2_1.method8562(0, local10.aByteArray113, local10.anInt10169);
		return local13;
	}
}

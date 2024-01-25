import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static57 {

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(IILclient!on;ILclient!hb;IIII)V")
	public static void method1343(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class146 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class77 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(11) int local11 = arg7 * arg7 + arg5 * arg5;
		if (arg1 < local11) {
			return;
		}
		@Pc(25) int local25 = Math.min(arg2.anInt4468 / 2, arg2.anInt4414 / 2);
		if (local25 * local25 >= local11) {
			Static29.method766(arg7, Static87.aClass31Array4[arg6], arg2, arg0, arg4, arg5, arg3);
			return;
		}
		local25 -= 10;
		@Pc(48) int local48;
		if (Static182.anInt3602 == 4) {
			local48 = (int) Static92.aFloat28 & 0x3FFF;
		} else {
			local48 = Static256.anInt5068 + (int) Static92.aFloat28 & 0x3FFF;
		}
		@Pc(59) int local59 = Class24.anIntArray35[local48];
		@Pc(63) int local63 = Class24.anIntArray36[local48];
		if (Static182.anInt3602 != 4) {
			local59 = local59 * 256 / (Static331.anInt3201 + 256);
			local63 = local63 * 256 / (Static331.anInt3201 + 256);
		}
		@Pc(95) int local95 = local59 * arg7 + local63 * arg5 >> 15;
		@Pc(106) int local106 = local63 * arg7 - local59 * arg5 >> 15;
		@Pc(112) double local112 = Math.atan2((double) local95, (double) local106);
		@Pc(119) int local119 = (int) (Math.sin(local112) * (double) local25);
		@Pc(126) int local126 = (int) (Math.cos(local112) * (double) local25);
		Static262.aClass31Array16[arg6].method4384((float) local119 + (float) arg2.anInt4468 / 2.0F + (float) arg0, (float) -local126 + (float) arg2.anInt4414 / 2.0F + (float) arg3, 4096, (int) (-local112 / 6.283185307179586D * 65535.0D));
	}

	@OriginalMember(owner = "client!di", name = "c", descriptor = "(B)Lclient!gk;")
	public static Class55_Sub2 method1344() {
		@Pc(8) Class55_Sub2 local8 = (Class55_Sub2) Static278.aClass67_8.method2101();
		if (local8 == null) {
			return new Class55_Sub2();
		} else {
			Static52.anInt1117--;
			return local8;
		}
	}

	@OriginalMember(owner = "client!di", name = "e", descriptor = "(I)V")
	public static void method1345() {
		for (@Pc(8) Class55_Sub7 local8 = (Class55_Sub7) Static28.aClass67_3.method2098(); local8 != null; local8 = (Class55_Sub7) Static28.aClass67_3.method2104()) {
			local8.method4029();
		}
	}
}

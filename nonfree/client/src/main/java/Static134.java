import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static134 {

	@OriginalMember(owner = "client!et", name = "l", descriptor = "I")
	public static int anInt3047;

	@OriginalMember(owner = "client!et", name = "n", descriptor = "I")
	public static int anInt3048;

	@OriginalMember(owner = "client!et", name = "g", descriptor = "Lclient!qe;")
	public static final Class274 aClass274_34 = new Class274(113, 6);

	@OriginalMember(owner = "client!et", name = "j", descriptor = "[I")
	public static final int[] anIntArray221 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@OriginalMember(owner = "client!et", name = "m", descriptor = "[I")
	public static final int[] anIntArray222 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(BII)I")
	public static int method2599(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8;
		if (arg0 < arg1) {
			local8 = arg0;
			arg0 = arg1;
			arg1 = local8;
		}
		while (arg1 != 0) {
			local8 = arg0 % arg1;
			arg0 = arg1;
			arg1 = local8;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(I)I")
	public static int method2601() {
		@Pc(5) Class87 local5 = Static600.aClass87_15;
		@Pc(7) boolean local7 = false;
		if (Static404.aClass2_Sub13_2.aClass33_Sub24_1.method7329() != 0) {
			@Pc(19) Canvas local19 = new Canvas();
			local19.setSize(100, 100);
			local5 = Static73.method1381(local19, null, 0, null, 0);
			local7 = true;
		}
		@Pc(38) long local38 = Static438.method6517();
		for (@Pc(40) int local40 = 0; local40 < 10000; local40++) {
			local5.method7894();
		}
		@Pc(69) int local69 = (int) (Static438.method6517() - local38);
		local5.method7898(100, 100, -16777216, 0, 0);
		if (local7) {
			local5.method7959();
		}
		return local69;
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(B)Z")
	public static boolean method2603() {
		return Static472.method6791("jaclib") ? Static472.method6791("hw3d") : false;
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(IILclient!ud;Lclient!vk;)V")
	public static void method2606(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub34 arg1, @OriginalArg(3) Class359 arg2) {
		@Pc(9) Class2_Sub46 local9 = new Class2_Sub46();
		local9.anInt8646 = arg1.method6904();
		local9.anInt8643 = arg1.method6865();
		local9.aClass26Array1 = new Class26[local9.anInt8646];
		local9.aByteArrayArrayArray12 = new byte[local9.anInt8646][][];
		local9.anIntArray597 = new int[local9.anInt8646];
		local9.aClass26Array2 = new Class26[local9.anInt8646];
		local9.anIntArray598 = new int[local9.anInt8646];
		local9.anIntArray599 = new int[local9.anInt8646];
		for (@Pc(57) int local57 = 0; local57 < local9.anInt8646; local57++) {
			try {
				@Pc(63) int local63 = arg1.method6904();
				@Pc(87) String local87;
				@Pc(91) String local91;
				@Pc(95) int local95;
				if (local63 == 0 || local63 == 1 || local63 == 2) {
					local87 = arg1.method6903();
					local91 = arg1.method6903();
					local95 = 0;
					if (local63 == 1) {
						local95 = arg1.method6865();
					}
					local9.anIntArray597[local57] = local63;
					local9.anIntArray599[local57] = local95;
					local9.aClass26Array1[local57] = arg2.method8277(local91, Static44.method863(local87));
				} else if (local63 == 3 || local63 == 4) {
					local87 = arg1.method6903();
					local91 = arg1.method6903();
					local95 = arg1.method6904();
					@Pc(98) String[] local98 = new String[local95];
					for (@Pc(100) int local100 = 0; local100 < local95; local100++) {
						local98[local100] = arg1.method6903();
					}
					@Pc(115) byte[][] local115 = new byte[local95][];
					@Pc(126) int local126;
					if (local63 == 3) {
						for (@Pc(120) int local120 = 0; local120 < local95; local120++) {
							local126 = arg1.method6865();
							local115[local120] = new byte[local126];
							arg1.method6891(local115[local120], local126, 0);
						}
					}
					local9.anIntArray597[local57] = local63;
					@Pc(155) Class[] local155 = new Class[local95];
					for (local126 = 0; local126 < local95; local126++) {
						local155[local126] = Static44.method863(local98[local126]);
					}
					local9.aClass26Array2[local57] = arg2.method8267(Static44.method863(local87), local91, local155);
					local9.aByteArrayArrayArray12[local57] = local115;
				}
			} catch (@Pc(230) ClassNotFoundException local230) {
				local9.anIntArray598[local57] = -1;
			} catch (@Pc(237) SecurityException local237) {
				local9.anIntArray598[local57] = -2;
			} catch (@Pc(244) NullPointerException local244) {
				local9.anIntArray598[local57] = -3;
			} catch (@Pc(251) Exception local251) {
				local9.anIntArray598[local57] = -4;
			} catch (@Pc(258) Throwable local258) {
				local9.anIntArray598[local57] = -5;
			}
		}
		Static632.aClass238_64.method5837(local9);
	}
}

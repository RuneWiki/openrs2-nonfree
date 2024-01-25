import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static393 {

	@OriginalMember(owner = "client!tu", name = "e", descriptor = "Lclient!ll;")
	public static Class152 aClass152_9;

	@OriginalMember(owner = "client!tu", name = "k", descriptor = "[I")
	public static int[] anIntArray495;

	@OriginalMember(owner = "client!tu", name = "q", descriptor = "I")
	public static int anInt5631;

	@OriginalMember(owner = "client!tu", name = "f", descriptor = "I")
	public static int anInt5623 = 0;

	@OriginalMember(owner = "client!tu", name = "h", descriptor = "Z")
	public static boolean aBoolean382 = false;

	@OriginalMember(owner = "client!tu", name = "l", descriptor = "[I")
	public static final int[] anIntArray496 = new int[25];

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(IB)I")
	public static int method4739(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(Lclient!lt;I)V")
	public static void method4740(@OriginalArg(0) Class158 arg0) {
		Static81.aClass158_21 = arg0;
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(Lclient!hf;ILclient!ha;I)V")
	public static void method4742(@OriginalArg(0) Class103 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class6_Sub15 arg2) {
		@Pc(9) Class6_Sub32 local9 = new Class6_Sub32();
		local9.anInt5923 = arg2.method3111();
		local9.anInt5922 = arg2.method3109();
		local9.aClass249Array2 = new Class249[local9.anInt5923];
		local9.anIntArray522 = new int[local9.anInt5923];
		local9.anIntArray521 = new int[local9.anInt5923];
		local9.aClass249Array1 = new Class249[local9.anInt5923];
		local9.anIntArray520 = new int[local9.anInt5923];
		local9.aByteArrayArrayArray17 = new byte[local9.anInt5923][][];
		for (@Pc(51) int local51 = 0; local51 < local9.anInt5923; local51++) {
			try {
				@Pc(57) int local57 = arg2.method3111();
				@Pc(76) String local76;
				@Pc(80) String local80;
				@Pc(82) int local82;
				if (local57 == 0 || local57 == 1 || local57 == 2) {
					local76 = arg2.method3093();
					local80 = arg2.method3093();
					local82 = 0;
					if (local57 == 1) {
						local82 = arg2.method3109();
					}
					local9.anIntArray521[local51] = local57;
					local9.anIntArray520[local51] = local82;
					local9.aClass249Array2[local51] = arg0.method2365(Static180.method2809(local76), local80);
				} else if (local57 == 3 || local57 == 4) {
					local76 = arg2.method3093();
					local80 = arg2.method3093();
					local82 = arg2.method3111();
					@Pc(137) String[] local137 = new String[local82];
					for (@Pc(139) int local139 = 0; local139 < local82; local139++) {
						local137[local139] = arg2.method3093();
					}
					@Pc(158) byte[][] local158 = new byte[local82][];
					@Pc(171) int local171;
					if (local57 == 3) {
						for (@Pc(165) int local165 = 0; local165 < local82; local165++) {
							local171 = arg2.method3109();
							local158[local165] = new byte[local171];
							arg2.method3127(local158[local165], local171);
						}
					}
					local9.anIntArray521[local51] = local57;
					@Pc(200) Class[] local200 = new Class[local82];
					for (local171 = 0; local171 < local82; local171++) {
						local200[local171] = Static180.method2809(local137[local171]);
					}
					local9.aClass249Array1[local51] = arg0.method2368(Static180.method2809(local76), local200, local80);
					local9.aByteArrayArrayArray17[local51] = local158;
				}
			} catch (@Pc(241) ClassNotFoundException local241) {
				local9.anIntArray522[local51] = -1;
			} catch (@Pc(248) SecurityException local248) {
				local9.anIntArray522[local51] = -2;
			} catch (@Pc(255) NullPointerException local255) {
				local9.anIntArray522[local51] = -3;
			} catch (@Pc(262) Exception local262) {
				local9.anIntArray522[local51] = -4;
			} catch (@Pc(269) Throwable local269) {
				local9.anIntArray522[local51] = -5;
			}
		}
		Static44.aClass88_10.method1878(local9);
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(III)Z")
	public static boolean method4744(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x8000) != 0;
	}
}

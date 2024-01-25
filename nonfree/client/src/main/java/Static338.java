import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static338 {

	@OriginalMember(owner = "client!vo", name = "D", descriptor = "[I")
	public static final int[] anIntArray536 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

	@OriginalMember(owner = "client!vo", name = "H", descriptor = "[I")
	public static final int[] anIntArray537 = new int[500];

	@OriginalMember(owner = "client!vo", name = "I", descriptor = "I")
	public static int anInt6503 = 0;

	@OriginalMember(owner = "client!vo", name = "J", descriptor = "I")
	public static int anInt6504 = 0;

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(ILclient!ij;)V")
	public static void method5538(@OriginalArg(0) int arg0, @OriginalArg(1) Class77 arg1) {
		Static108.aClass77Array2[arg0] = arg1;
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(ZIII)Lclient!ks;")
	public static Class11_Sub4_Sub9 method5540(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) int local9 = arg2 | arg0 << 8;
		@Pc(18) Class11_Sub4_Sub9 local18 = (Class11_Sub4_Sub9) Static260.aClass142_11.method3874((long) local9 << 16);
		if (local18 != null) {
			return local18;
		}
		@Pc(30) byte[] local30 = Static52.aClass144_79.method3908(Static52.aClass144_79.method3907(local9));
		if (local30 == null) {
			local9 = arg2 | arg1 + 65536 << 8;
			local18 = (Class11_Sub4_Sub9) Static260.aClass142_11.method3874((long) local9 << 16);
			if (local18 != null) {
				return local18;
			}
			local30 = Static52.aClass144_79.method3908(Static52.aClass144_79.method3907(local9));
			if (local30 == null) {
				local9 = arg2 | 0xFFFF00;
				local18 = (Class11_Sub4_Sub9) Static260.aClass142_11.method3874((long) local9 << 16);
				if (local18 != null) {
					return local18;
				}
				local30 = Static52.aClass144_79.method3908(Static52.aClass144_79.method3907(local9));
				if (local30 == null) {
					return null;
				} else if (local30.length <= 1) {
					return null;
				} else {
					local18 = Static39.method581(local30);
					local18.anInt3357 = arg2;
					Static260.aClass142_11.method3870(local18, (long) local9 << 16);
					return local18;
				}
			} else if (local30.length <= 1) {
				return null;
			} else {
				local18 = Static39.method581(local30);
				local18.anInt3357 = arg2;
				Static260.aClass142_11.method3870(local18, (long) local9 << 16);
				return local18;
			}
		} else if (local30.length <= 1) {
			return null;
		} else {
			local18 = Static39.method581(local30);
			local18.anInt3357 = arg2;
			Static260.aClass142_11.method3870(local18, (long) local9 << 16);
			return local18;
		}
	}

	@OriginalMember(owner = "client!vo", name = "e", descriptor = "(B)V")
	public static void method5541() {
		if (Static167.anInt3322 != 3) {
			Static155.anInt2961 = -1;
		}
	}
}

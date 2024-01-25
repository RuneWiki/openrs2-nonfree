import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static249 {

	@OriginalMember(owner = "client!ida", name = "c", descriptor = "I")
	public static int anInt4559 = 0;

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(IZ[B)Ljava/lang/Object;")
	public static Object method3855(@OriginalArg(2) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static77.aBoolean82) {
			try {
				@Pc(25) Class17 local25 = (Class17) Class.forName("Class17_Sub1").getDeclaredConstructor().newInstance();
				local25.method7118(arg0);
				return local25;
			} catch (@Pc(32) Throwable local32) {
				Static77.aBoolean82 = true;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(ILclient!fi;)[I")
	public static int[] method3856(@OriginalArg(1) Class5_Sub21 arg0) {
		@Pc(8) Class5_Sub41 local8 = new Class5_Sub41(518);
		@Pc(11) int[] local11 = new int[4];
		for (@Pc(18) int local18 = 0; local18 < 4; local18++) {
			local11[local18] = (int) (Math.random() * 9.9999999E7D);
		}
		local8.method7798(10);
		local8.method7803(local11[0]);
		local8.method7803(local11[1]);
		local8.method7803(local11[2]);
		local8.method7803(local11[3]);
		for (@Pc(60) int local60 = 0; local60 < 10; local60++) {
			local8.method7803((int) (Math.random() * 9.9999999E7D));
		}
		local8.method7848((int) (Math.random() * 9.9999999E7D));
		local8.method7853(Static326.aBigInteger2, Static327.aBigInteger3);
		arg0.aClass5_Sub41_Sub2_1.method7837(0, local8.anInt9230, local8.aByteArray93);
		return local11;
	}
}

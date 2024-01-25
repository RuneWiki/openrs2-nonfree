import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!dk", name = "g", descriptor = "Lclient!ni;")
	public static Class223 aClass223_38;

	@OriginalMember(owner = "client!dk", name = "r", descriptor = "Lclient!rh;")
	public static Class291 aClass291_1;

	@OriginalMember(owner = "client!dk", name = "f", descriptor = "[I")
	public static final int[] anIntArray98 = new int[25];

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(Z)I")
	public static int method2434() {
		@Pc(12) Class94 local12 = Static378.aClass94_34;
		synchronized (Static378.aClass94_34) {
			return Static378.aClass94_34.method2955();
		}
	}

	@OriginalMember(owner = "client!dk", name = "b", descriptor = "(Z)V")
	public static void method2435() {
		Static588.aClass94_65.method2964();
		Static92.aClass94_12.method2964();
		Static635.aClass94_68.method2964();
		Static528.aClass94_57.method2964();
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(Lclient!fl;B)[Lclient!qca;")
	public static Class273[] method2436(@OriginalArg(0) Class104 arg0) {
		if (!arg0.method3129()) {
			return new Class273[0];
		}
		@Pc(16) Class159 local16 = arg0.method3133();
		while (local16.anInt5910 == 0) {
			Static344.method5698(10L);
		}
		if (local16.anInt5910 == 2) {
			return new Class273[0];
		}
		@Pc(37) int[] local37 = (int[]) local16.anObject13;
		@Pc(43) Class273[] local43 = new Class273[local37.length >> 2];
		for (@Pc(45) int local45 = 0; local45 < local43.length; local45++) {
			@Pc(56) Class273 local56 = new Class273();
			local43[local45] = local56;
			local56.anInt8190 = local37[local45 << 2];
			local56.anInt8193 = local37[(local45 << 2) + 1];
			local56.anInt8192 = local37[(local45 << 2) + 2];
			local56.anInt8194 = local37[(local45 << 2) + 3];
		}
		return local43;
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(IZLclient!ni;Ljava/lang/String;)Lclient!wf;")
	public static Class374 method2437(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class223 arg1, @OriginalArg(3) String arg2) {
		@Pc(10) int local10 = arg1.method5959(arg2);
		if (local10 == -1) {
			return new Class374(0);
		}
		@Pc(24) int[] local24 = arg1.method5952(local10);
		@Pc(30) Class374 local30 = new Class374(local24.length);
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		while (true) {
			while (local30.anInt10540 > local32) {
				@Pc(53) Class6_Sub8 local53 = new Class6_Sub8(arg1.method5954(local24[local34++], local10));
				@Pc(57) int local57 = local53.method8236();
				@Pc(61) int local61 = local53.method8220();
				@Pc(65) int local65 = local53.method8246();
				if (!arg0 && local65 == 1) {
					local30.anInt10540--;
				} else {
					local30.anIntArray559[local32] = local57;
					local30.anIntArray561[local32] = local61;
					local32++;
				}
			}
			return local30;
		}
	}
}

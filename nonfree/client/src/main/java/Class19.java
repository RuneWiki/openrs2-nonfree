import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ed")
public final class Class19 {

	@OriginalMember(owner = "client!ed", name = "l", descriptor = "[I")
	public static int[] anIntArray74 = new int[99];

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "[I")
	private final int[] anIntArray73;

	@OriginalMember(owner = "client!ed", name = "n", descriptor = "[I")
	private final int[] anIntArray75;

	@OriginalMember(owner = "client!ed", name = "f", descriptor = "Lclient!fe;")
	private final Class1_Sub4 aClass1_Sub4_2;

	@OriginalMember(owner = "client!ed", name = "c", descriptor = "Lclient!fe;")
	private final Class1_Sub4 aClass1_Sub4_1;

	@OriginalMember(owner = "client!ed", name = "s", descriptor = "[Lclient!fe;")
	private final Class1_Sub4[] aClass1_Sub4Array6;

	static {
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < 99; local10++) {
			@Pc(15) int local15 = local10 + 1;
			@Pc(28) int local28 = (int) ((double) local15 + Math.pow(2.0D, (double) local15 / 7.0D) * 300.0D);
			local8 += local28;
			anIntArray74[local10] = local8 / 4;
		}
	}

	@OriginalMember(owner = "client!ed", name = "<init>", descriptor = "()V")
	public Class19() {
		this.anIntArray73 = new int[0];
		this.anIntArray75 = new int[0];
		this.aClass1_Sub4_2 = new Class1_Sub4_Sub14();
		this.aClass1_Sub4_1 = new Class1_Sub4_Sub14();
		this.aClass1_Sub4Array6 = new Class1_Sub4[] { this.aClass1_Sub4_2, this.aClass1_Sub4_1 };
	}

	@OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(Lclient!hc;)V")
	public Class19(@OriginalArg(0) Class1_Sub6 arg0) {
		@Pc(7) int local7 = arg0.method544();
		@Pc(12) Class14 local12 = new Class14(64);
		@Pc(17) Class14 local17 = new Class14(64);
		@Pc(22) Class14 local22 = new Class14(64);
		this.aClass1_Sub4Array6 = new Class1_Sub4[local7];
		@Pc(29) int[][] local29 = new int[local7][];
		@Pc(45) int local45;
		@Pc(97) int local97;
		@Pc(104) int local104;
		for (@Pc(31) int local31 = 0; local31 < local7; local31++) {
			@Pc(37) Class1_Sub4 local37 = Static15.method270(arg0);
			@Pc(41) int local41 = local37.method3212();
			local45 = local37.method3213();
			if (local41 >= 0 && local41 >= 0 && local17.method569((long) local41) == null) {
				local17.method570(new Class1_Sub11(local41), (long) local41);
			}
			if (local45 >= 0 && local45 >= 0 && local22.method569((long) local45) == null) {
				local22.method570(new Class1_Sub11(local45), (long) local45);
			}
			local97 = local37.aClass1_Sub4Array39.length;
			local29[local31] = new int[local97];
			for (local104 = 0; local104 < local97; local104++) {
				local29[local31][local104] = arg0.method544();
			}
			local12.method570(local37, (long) local37.anInt4761);
			this.aClass1_Sub4Array6[local31] = local37;
		}
		for (@Pc(136) int local136 = 0; local136 < local7; local136++) {
			@Pc(143) Class1_Sub4 local143 = this.aClass1_Sub4Array6[local136];
			local45 = local143.aClass1_Sub4Array39.length;
			for (local97 = 0; local97 < local45; local97++) {
				@Pc(162) Class1_Sub4 local162 = (Class1_Sub4) local12.method569((long) local29[local136][local97]);
				local143.aClass1_Sub4Array39[local97] = local162;
			}
			local29[local136] = null;
		}
		this.aClass1_Sub4_2 = (Class1_Sub4) local12.method569((long) arg0.method544());
		this.aClass1_Sub4_1 = (Class1_Sub4) local12.method569((long) arg0.method544());
		this.anIntArray73 = new int[local17.method566()];
		this.anIntArray75 = new int[local22.method566()];
		@Pc(224) Class1[] local224 = new Class1[local17.method566()];
		@Pc(229) Class1[] local229 = new Class1[local22.method566()];
		local17.method565(local224);
		local22.method565(local229);
		for (local97 = 0; local97 < local224.length; local97++) {
			this.anIntArray73[local97] = ((Class1_Sub11) local224[local97]).anInt1570;
		}
		for (local104 = 0; local104 < local229.length; local104++) {
			this.anIntArray75[local104] = ((Class1_Sub11) local229[local104]).anInt1570;
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IFIZLclient!dd;ZLclient!ue;)[I")
	public int[] method763(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class16 arg4, @OriginalArg(6) Interface3 arg5) {
		Static133.aClass16_26 = arg4;
		@Pc(8) int[] local8 = new int[arg2 * arg0];
		Static108.anInterface3_2 = arg5;
		Static75.method1597(arg0, arg2);
		for (@Pc(20) int local20 = 0; local20 < this.aClass1_Sub4Array6.length; local20++) {
			this.aClass1_Sub4Array6[local20].method3206(arg0, arg2);
		}
		@Pc(43) int local43 = 0;
		@Pc(53) int local53;
		@Pc(47) int local47;
		@Pc(49) byte local49;
		if (arg3) {
			local47 = -1;
			local49 = -1;
			local53 = arg2 - 1;
		} else {
			local49 = 1;
			local53 = 0;
			local47 = arg2;
		}
		for (@Pc(63) int local63 = 0; local63 < arg0; local63++) {
			@Pc(77) int[] local77;
			@Pc(79) int[] local79;
			@Pc(81) int[] local81;
			if (this.aClass1_Sub4_2.aBoolean210) {
				@Pc(75) int[] local75 = this.aClass1_Sub4_2.method3216(local63);
				local77 = local75;
				local79 = local75;
				local81 = local75;
			} else {
				@Pc(89) int[][] local89 = this.aClass1_Sub4_2.method3214(local63);
				local79 = local89[1];
				local81 = local89[2];
				local77 = local89[0];
			}
			for (@Pc(103) int local103 = local53; local103 != local47; local103 += local49) {
				@Pc(111) int local111 = local77[local103] >> 4;
				@Pc(117) int local117 = local81[local103] >> 4;
				if (local117 > 255) {
					local117 = 255;
				}
				@Pc(130) int local130 = local79[local103] >> 4;
				if (local130 > 255) {
					local130 = 255;
				}
				if (local111 > 255) {
					local111 = 255;
				}
				if (local130 < 0) {
					local130 = 0;
				}
				if (local111 < 0) {
					local111 = 0;
				}
				if (local117 < 0) {
					local117 = 0;
				}
				local8[local43++] = Static79.method1764((local130 << 8) + ((local111 << 16) + local117), arg1);
			}
		}
		for (@Pc(195) int local195 = 0; local195 < this.aClass1_Sub4Array6.length; local195++) {
			this.aClass1_Sub4Array6[local195].method3210();
		}
		return local8;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lclient!ue;Lclient!dd;B)Z")
	public boolean method766(@OriginalArg(0) Interface3 arg0, @OriginalArg(1) Class16 arg1) {
		for (@Pc(17) int local17 = 0; local17 < this.anIntArray73.length; local17++) {
			if (!arg1.method2235(this.anIntArray73[local17])) {
				return false;
			}
		}
		for (@Pc(37) int local37 = 0; local37 < this.anIntArray75.length; local37++) {
			if (!arg0.method3053(this.anIntArray75[local37])) {
				return false;
			}
		}
		return true;
	}
}

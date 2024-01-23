import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ah")
public final class Class6 {

	@OriginalMember(owner = "client!ah", name = "l", descriptor = "[I")
	private int[] anIntArray35;

	@OriginalMember(owner = "client!ah", name = "j", descriptor = "[I")
	private int[] anIntArray34;

	@OriginalMember(owner = "client!ah", name = "d", descriptor = "Lclient!bc;")
	private Class2_Sub2 aClass2_Sub2_1;

	@OriginalMember(owner = "client!ah", name = "i", descriptor = "Lclient!bc;")
	private Class2_Sub2 aClass2_Sub2_2;

	@OriginalMember(owner = "client!ah", name = "k", descriptor = "[Lclient!bc;")
	private Class2_Sub2[] aClass2_Sub2Array5;

	@OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(Lclient!nh;)V")
	public Class6(@OriginalArg(0) Class2_Sub23 arg0) {
		@Pc(5) int local5 = 0;
		@Pc(9) int local9 = arg0.method2122();
		this.aClass2_Sub2Array5 = new Class2_Sub2[local9];
		@Pc(15) int local15 = 0;
		@Pc(18) int[][] local18 = new int[local9][];
		@Pc(50) int local50;
		for (@Pc(20) int local20 = 0; local20 < local9; local20++) {
			@Pc(26) Class2_Sub2 local26 = Static20.method290(arg0);
			if (local26.method3962() >= 0) {
				local5++;
			}
			if (local26.method3965() >= 0) {
				local15++;
			}
			@Pc(43) int local43 = local26.aClass2_Sub2Array42.length;
			local18[local20] = new int[local43];
			for (local50 = 0; local50 < local43; local50++) {
				local18[local20][local50] = arg0.method2122();
			}
			this.aClass2_Sub2Array5[local20] = local26;
		}
		this.anIntArray34 = new int[local5];
		local5 = 0;
		this.anIntArray35 = new int[local15];
		local15 = 0;
		for (@Pc(95) int local95 = 0; local95 < local9; local95++) {
			@Pc(102) Class2_Sub2 local102 = this.aClass2_Sub2Array5[local95];
			local50 = local102.aClass2_Sub2Array42.length;
			for (@Pc(108) int local108 = 0; local108 < local50; local108++) {
				local102.aClass2_Sub2Array42[local108] = this.aClass2_Sub2Array5[local18[local95][local108]];
			}
			@Pc(130) int local130 = local102.method3962();
			@Pc(134) int local134 = local102.method3965();
			if (local130 > 0) {
				this.anIntArray34[local5++] = local130;
			}
			if (local134 > 0) {
				this.anIntArray35[local15++] = local134;
			}
			local18[local95] = null;
		}
		this.aClass2_Sub2_1 = this.aClass2_Sub2Array5[arg0.method2122()];
		this.aClass2_Sub2_2 = this.aClass2_Sub2Array5[arg0.method2122()];
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lclient!vf;ILclient!oe;)Z")
	public boolean method188(@OriginalArg(0) Interface4 arg0, @OriginalArg(2) Class72 arg1) {
		for (@Pc(12) int local12 = 0; local12 < this.anIntArray34.length; local12++) {
			if (!arg1.method3175(this.anIntArray34[local12])) {
				return false;
			}
		}
		for (@Pc(34) int local34 = 0; local34 < this.anIntArray35.length; local34++) {
			if (!arg0.method761(this.anIntArray35[local34])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(ZLclient!oe;ILclient!vf;BIDZ)[I")
	public int[] method192(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class72 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Interface4 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) double arg5, @OriginalArg(7) boolean arg6) {
		Static30.method405(arg5);
		Static209.anInterface4_3 = arg3;
		@Pc(23) int[] local23 = new int[arg2 * arg4];
		Static227.aClass72_289 = arg1;
		Static62.method1005(arg2, arg4);
		for (@Pc(31) int local31 = 0; local31 < this.aClass2_Sub2Array5.length; local31++) {
			this.aClass2_Sub2Array5[local31].method3954(arg2, arg4);
		}
		@Pc(59) int local59;
		@Pc(61) int local61;
		@Pc(55) byte local55;
		if (arg6) {
			local55 = -1;
			local59 = arg2 - 1;
			local61 = -1;
		} else {
			local61 = arg2;
			local59 = 0;
			local55 = 1;
		}
		@Pc(71) int local71 = 0;
		for (@Pc(73) int local73 = 0; local73 < arg4; local73++) {
			if (arg0) {
				local71 = local73;
			}
			@Pc(97) int[] local97;
			@Pc(101) int[] local101;
			@Pc(93) int[] local93;
			if (this.aClass2_Sub2_1.aBoolean212) {
				@Pc(109) int[] local109 = this.aClass2_Sub2_1.method3961(local73);
				local101 = local109;
				local97 = local109;
				local93 = local109;
			} else {
				@Pc(89) int[][] local89 = this.aClass2_Sub2_1.method3960(local73);
				local93 = local89[2];
				local97 = local89[0];
				local101 = local89[1];
			}
			for (@Pc(117) int local117 = local59; local117 != local61; local117 += local55) {
				@Pc(125) int local125 = local101[local117] >> 4;
				@Pc(131) int local131 = local97[local117] >> 4;
				if (local131 > 255) {
					local131 = 255;
				}
				if (local131 < 0) {
					local131 = 0;
				}
				local131 = Static121.anIntArray797[local131];
				if (local125 > 255) {
					local125 = 255;
				}
				if (local125 < 0) {
					local125 = 0;
				}
				local125 = Static121.anIntArray797[local125];
				@Pc(171) int local171 = local93[local117] >> 4;
				if (local171 > 255) {
					local171 = 255;
				}
				if (local171 < 0) {
					local171 = 0;
				}
				local171 = Static121.anIntArray797[local171];
				local23[local71++] = local171 + (local131 << 16) + (local125 << 8);
				if (arg0) {
					local71 += arg2 - 1;
				}
			}
		}
		for (@Pc(221) int local221 = 0; local221 < this.aClass2_Sub2Array5.length; local221++) {
			this.aClass2_Sub2Array5[local221].method3964();
		}
		return local23;
	}
}

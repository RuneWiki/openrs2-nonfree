import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eg")
public final class Class28 {

	@OriginalMember(owner = "client!eg", name = "i", descriptor = "[I")
	private final int[] anIntArray99;

	@OriginalMember(owner = "client!eg", name = "k", descriptor = "[I")
	private final int[] anIntArray100;

	@OriginalMember(owner = "client!eg", name = "c", descriptor = "Lclient!he;")
	private final Class1_Sub1 aClass1_Sub1_2;

	@OriginalMember(owner = "client!eg", name = "b", descriptor = "Lclient!he;")
	private final Class1_Sub1 aClass1_Sub1_1;

	@OriginalMember(owner = "client!eg", name = "n", descriptor = "[Lclient!he;")
	private final Class1_Sub1[] aClass1_Sub1Array12;

	@OriginalMember(owner = "client!eg", name = "<init>", descriptor = "()V")
	public Class28() {
		this.anIntArray99 = new int[0];
		this.anIntArray100 = new int[0];
		this.aClass1_Sub1_2 = new Class1_Sub1_Sub30();
		this.aClass1_Sub1_2.anInt4683 = 1;
		this.aClass1_Sub1_1 = new Class1_Sub1_Sub30();
		this.aClass1_Sub1_1.anInt4683 = 1;
		this.aClass1_Sub1Array12 = new Class1_Sub1[] { this.aClass1_Sub1_2, this.aClass1_Sub1_1 };
	}

	@OriginalMember(owner = "client!eg", name = "<init>", descriptor = "(Lclient!fj;)V")
	public Class28(@OriginalArg(0) Class1_Sub7 arg0) {
		@Pc(7) int local7 = arg0.method2771();
		this.aClass1_Sub1Array12 = new Class1_Sub1[local7];
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		@Pc(18) int[][] local18 = new int[local7][];
		@Pc(50) int local50;
		for (@Pc(20) int local20 = 0; local20 < local7; local20++) {
			@Pc(26) Class1_Sub1 local26 = Static40.method739(arg0);
			if (local26.method3572() >= 0) {
				local15++;
			}
			if (local26.method3575() >= 0) {
				local13++;
			}
			@Pc(43) int local43 = local26.aClass1_Sub1Array42.length;
			local18[local20] = new int[local43];
			for (local50 = 0; local50 < local43; local50++) {
				local18[local20][local50] = arg0.method2771();
			}
			this.aClass1_Sub1Array12[local20] = local26;
		}
		this.anIntArray99 = new int[local13];
		this.anIntArray100 = new int[local15];
		local15 = 0;
		local13 = 0;
		for (@Pc(87) int local87 = 0; local87 < local7; local87++) {
			@Pc(94) Class1_Sub1 local94 = this.aClass1_Sub1Array12[local87];
			local50 = local94.aClass1_Sub1Array42.length;
			for (@Pc(100) int local100 = 0; local100 < local50; local100++) {
				local94.aClass1_Sub1Array42[local100] = this.aClass1_Sub1Array12[local18[local87][local100]];
			}
			@Pc(126) int local126 = local94.method3572();
			@Pc(130) int local130 = local94.method3575();
			if (local126 > 0) {
				this.anIntArray100[local15++] = local126;
			}
			if (local130 > 0) {
				this.anIntArray99[local13++] = local130;
			}
			local18[local87] = null;
		}
		this.aClass1_Sub1_2 = this.aClass1_Sub1Array12[arg0.method2771()];
		this.aClass1_Sub1_1 = this.aClass1_Sub1Array12[arg0.method2771()];
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(ZLclient!ef;ZLclient!ve;IBID)[I")
	public int[] method855(@OriginalArg(0) boolean arg0, @OriginalArg(1) Interface2 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class69 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) double arg6) {
		Static29.method574(arg6);
		Static110.aClass69_24 = arg3;
		@Pc(17) int[] local17 = new int[arg4 * arg5];
		Static29.anInterface2_1 = arg1;
		Static205.method3459(arg4, arg5);
		for (@Pc(31) int local31 = 0; local31 < this.aClass1_Sub1Array12.length; local31++) {
			this.aClass1_Sub1Array12[local31].method3578(arg5, arg4);
		}
		@Pc(61) int local61;
		@Pc(57) int local57;
		@Pc(55) byte local55;
		if (arg0) {
			local55 = -1;
			local57 = -1;
			local61 = arg4 - 1;
		} else {
			local55 = 1;
			local61 = 0;
			local57 = arg4;
		}
		@Pc(71) int local71 = 0;
		for (@Pc(73) int local73 = 0; local73 < arg5; local73++) {
			if (arg2) {
				local71 = local73;
			}
			@Pc(95) int[] local95;
			@Pc(91) int[] local91;
			@Pc(93) int[] local93;
			if (this.aClass1_Sub1_2.aBoolean231) {
				@Pc(89) int[] local89 = this.aClass1_Sub1_2.method3571(local73);
				local91 = local89;
				local93 = local89;
				local95 = local89;
			} else {
				@Pc(103) int[][] local103 = this.aClass1_Sub1_2.method3576(local73);
				local93 = local103[2];
				local95 = local103[0];
				local91 = local103[1];
			}
			for (@Pc(117) int local117 = local61; local117 != local57; local117 += local55) {
				@Pc(125) int local125 = local95[local117] >> 4;
				if (local125 > 255) {
					local125 = 255;
				}
				if (local125 < 0) {
					local125 = 0;
				}
				@Pc(142) int local142 = local91[local117] >> 4;
				if (local142 > 255) {
					local142 = 255;
				}
				@Pc(155) int local155 = local93[local117] >> 4;
				local125 = Static104.anIntArray192[local125];
				if (local155 > 255) {
					local155 = 255;
				}
				if (local155 < 0) {
					local155 = 0;
				}
				if (local142 < 0) {
					local142 = 0;
				}
				local142 = Static104.anIntArray192[local142];
				local155 = Static104.anIntArray192[local155];
				local17[local71++] = local155 + (local142 << 8) + (local125 << 16);
				if (arg2) {
					local71 += arg4 - 1;
				}
			}
		}
		for (@Pc(227) int local227 = 0; local227 < this.aClass1_Sub1Array12.length; local227++) {
			this.aClass1_Sub1Array12[local227].method3574();
		}
		return local17;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lclient!ef;BLclient!ve;)Z")
	public boolean method858(@OriginalArg(0) Interface2 arg0, @OriginalArg(2) Class69 arg1) {
		for (@Pc(7) int local7 = 0; local7 < this.anIntArray100.length; local7++) {
			if (!arg1.method2209(this.anIntArray100[local7])) {
				return false;
			}
		}
		for (@Pc(32) int local32 = 0; local32 < this.anIntArray99.length; local32++) {
			if (!arg0.method1323(this.anIntArray99[local32])) {
				return false;
			}
		}
		return true;
	}
}

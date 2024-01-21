import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oh")
public final class Class73 {

	@OriginalMember(owner = "client!oh", name = "n", descriptor = "[I")
	private final int[] anIntArray292;

	@OriginalMember(owner = "client!oh", name = "m", descriptor = "[I")
	private final int[] anIntArray291;

	@OriginalMember(owner = "client!oh", name = "f", descriptor = "Lclient!je;")
	private final Class2_Sub1 aClass2_Sub1_1;

	@OriginalMember(owner = "client!oh", name = "j", descriptor = "Lclient!je;")
	private final Class2_Sub1 aClass2_Sub1_2;

	@OriginalMember(owner = "client!oh", name = "e", descriptor = "[Lclient!je;")
	private final Class2_Sub1[] aClass2_Sub1Array22;

	@OriginalMember(owner = "client!oh", name = "<init>", descriptor = "()V")
	public Class73() {
		this.anIntArray292 = new int[0];
		this.anIntArray291 = new int[0];
		this.aClass2_Sub1_1 = new Class2_Sub1_Sub5();
		this.aClass2_Sub1_1.anInt4288 = 1;
		this.aClass2_Sub1_2 = new Class2_Sub1_Sub5();
		this.aClass2_Sub1_2.anInt4288 = 1;
		this.aClass2_Sub1Array22 = new Class2_Sub1[] { this.aClass2_Sub1_1, this.aClass2_Sub1_2 };
	}

	@OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(Lclient!ra;)V")
	public Class73(@OriginalArg(0) Class2_Sub3 arg0) {
		@Pc(5) int local5 = 0;
		@Pc(9) int local9 = arg0.method260();
		@Pc(11) int local11 = 0;
		this.aClass2_Sub1Array22 = new Class2_Sub1[local9];
		@Pc(18) int[][] local18 = new int[local9][];
		@Pc(50) int local50;
		for (@Pc(20) int local20 = 0; local20 < local9; local20++) {
			@Pc(26) Class2_Sub1 local26 = Static36.method733(arg0);
			if (local26.method3261() >= 0) {
				local11++;
			}
			if (local26.method3266() >= 0) {
				local5++;
			}
			@Pc(43) int local43 = local26.aClass2_Sub1Array42.length;
			local18[local20] = new int[local43];
			for (local50 = 0; local50 < local43; local50++) {
				local18[local20][local50] = arg0.method260();
			}
			this.aClass2_Sub1Array22[local20] = local26;
		}
		this.anIntArray292 = new int[local11];
		this.anIntArray291 = new int[local5];
		local11 = 0;
		local5 = 0;
		for (@Pc(95) int local95 = 0; local95 < local9; local95++) {
			@Pc(102) Class2_Sub1 local102 = this.aClass2_Sub1Array22[local95];
			local50 = local102.aClass2_Sub1Array42.length;
			for (@Pc(108) int local108 = 0; local108 < local50; local108++) {
				local102.aClass2_Sub1Array42[local108] = this.aClass2_Sub1Array22[local18[local95][local108]];
			}
			@Pc(130) int local130 = local102.method3261();
			@Pc(134) int local134 = local102.method3266();
			if (local130 > 0) {
				this.anIntArray292[local11++] = local130;
			}
			if (local134 > 0) {
				this.anIntArray291[local5++] = local134;
			}
			local18[local95] = null;
		}
		this.aClass2_Sub1_1 = this.aClass2_Sub1Array22[arg0.method260()];
		this.aClass2_Sub1_2 = this.aClass2_Sub1Array22[arg0.method260()];
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(ZLclient!eh;DZLclient!wh;III)[I")
	public int[] method2251(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class28 arg1, @OriginalArg(2) double arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Interface3 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		Static56.method1062(arg2);
		Static67.anInterface3_2 = arg4;
		Static138.aClass28_140 = arg1;
		Static84.method1496(arg6, arg5);
		for (@Pc(18) int local18 = 0; local18 < this.aClass2_Sub1Array22.length; local18++) {
			this.aClass2_Sub1Array22[local18].method3263(arg6, arg5);
		}
		@Pc(42) int local42;
		@Pc(46) int local46;
		@Pc(44) byte local44;
		if (arg0) {
			local46 = -1;
			local42 = arg5 - 1;
			local44 = -1;
		} else {
			local42 = 0;
			local44 = 1;
			local46 = arg5;
		}
		@Pc(61) int[] local61 = new int[arg5 * arg6];
		@Pc(63) int local63 = 0;
		for (@Pc(65) int local65 = 0; local65 < arg6; local65++) {
			if (arg3) {
				local63 = local65;
			}
			@Pc(85) int[] local85;
			@Pc(93) int[] local93;
			@Pc(89) int[] local89;
			if (this.aClass2_Sub1_1.aBoolean196) {
				@Pc(101) int[] local101 = this.aClass2_Sub1_1.method3256(local65);
				local89 = local101;
				local93 = local101;
				local85 = local101;
			} else {
				@Pc(81) int[][] local81 = this.aClass2_Sub1_1.method3262(local65);
				local85 = local81[0];
				local89 = local81[2];
				local93 = local81[1];
			}
			for (@Pc(109) int local109 = local42; local109 != local46; local109 += local44) {
				@Pc(117) int local117 = local85[local109] >> 4;
				if (local117 > 255) {
					local117 = 255;
				}
				if (local117 < 0) {
					local117 = 0;
				}
				@Pc(134) int local134 = local93[local109] >> 4;
				@Pc(140) int local140 = local89[local109] >> 4;
				if (local134 > 255) {
					local134 = 255;
				}
				local117 = Static189.anIntArray370[local117];
				if (local134 < 0) {
					local134 = 0;
				}
				local134 = Static189.anIntArray370[local134];
				if (local140 > 255) {
					local140 = 255;
				}
				if (local140 < 0) {
					local140 = 0;
				}
				local140 = Static189.anIntArray370[local140];
				local61[local63++] = local140 + (local117 << 16) + (local134 << 8);
				if (arg3) {
					local63 += arg5 - 1;
				}
			}
		}
		for (@Pc(218) int local218 = 0; local218 < this.aClass2_Sub1Array22.length; local218++) {
			this.aClass2_Sub1Array22[local218].method3257();
		}
		return local61;
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lclient!eh;ILclient!wh;)Z")
	public boolean method2252(@OriginalArg(0) Class28 arg0, @OriginalArg(2) Interface3 arg1) {
		for (@Pc(12) int local12 = 0; local12 < this.anIntArray292.length; local12++) {
			if (!arg0.method861(this.anIntArray292[local12])) {
				return false;
			}
		}
		for (@Pc(32) int local32 = 0; local32 < this.anIntArray291.length; local32++) {
			if (!arg1.method1289(this.anIntArray291[local32])) {
				return false;
			}
		}
		return true;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dg")
public final class Class17 {

	@OriginalMember(owner = "client!dg", name = "f", descriptor = "[I")
	private final int[] anIntArray103;

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "[I")
	private final int[] anIntArray102;

	@OriginalMember(owner = "client!dg", name = "h", descriptor = "Lclient!a;")
	private final Class1_Sub1 aClass1_Sub1_2;

	@OriginalMember(owner = "client!dg", name = "d", descriptor = "Lclient!a;")
	private final Class1_Sub1 aClass1_Sub1_1;

	@OriginalMember(owner = "client!dg", name = "m", descriptor = "[Lclient!a;")
	private final Class1_Sub1[] aClass1_Sub1Array7;

	@OriginalMember(owner = "client!dg", name = "<init>", descriptor = "()V")
	public Class17() {
		this.anIntArray103 = new int[0];
		this.anIntArray102 = new int[0];
		this.aClass1_Sub1_2 = new Class1_Sub1_Sub22();
		this.aClass1_Sub1_2.anInt4454 = 1;
		this.aClass1_Sub1_1 = new Class1_Sub1_Sub22();
		this.aClass1_Sub1_1.anInt4454 = 1;
		this.aClass1_Sub1Array7 = new Class1_Sub1[] { this.aClass1_Sub1_2, this.aClass1_Sub1_1 };
	}

	@OriginalMember(owner = "client!dg", name = "<init>", descriptor = "(Lclient!wa;)V")
	public Class17(@OriginalArg(0) Class1_Sub14 arg0) {
		@Pc(7) int local7 = arg0.method1738();
		@Pc(9) int local9 = 0;
		this.aClass1_Sub1Array7 = new Class1_Sub1[local7];
		@Pc(15) int local15 = 0;
		@Pc(18) int[][] local18 = new int[local7][];
		@Pc(50) int local50;
		for (@Pc(20) int local20 = 0; local20 < local7; local20++) {
			@Pc(26) Class1_Sub1 local26 = Static78.method1379(arg0);
			if (local26.method3309() >= 0) {
				local15++;
			}
			if (local26.method3311() >= 0) {
				local9++;
			}
			@Pc(43) int local43 = local26.aClass1_Sub1Array42.length;
			local18[local20] = new int[local43];
			for (local50 = 0; local50 < local43; local50++) {
				local18[local20][local50] = arg0.method1738();
			}
			this.aClass1_Sub1Array7[local20] = local26;
		}
		this.anIntArray103 = new int[local15];
		local15 = 0;
		this.anIntArray102 = new int[local9];
		local9 = 0;
		for (@Pc(91) int local91 = 0; local91 < local7; local91++) {
			@Pc(98) Class1_Sub1 local98 = this.aClass1_Sub1Array7[local91];
			local50 = local98.aClass1_Sub1Array42.length;
			for (@Pc(104) int local104 = 0; local104 < local50; local104++) {
				local98.aClass1_Sub1Array42[local104] = this.aClass1_Sub1Array7[local18[local91][local104]];
			}
			@Pc(126) int local126 = local98.method3309();
			@Pc(130) int local130 = local98.method3311();
			if (local126 > 0) {
				this.anIntArray103[local15++] = local126;
			}
			if (local130 > 0) {
				this.anIntArray102[local9++] = local130;
			}
			local18[local91] = null;
		}
		this.aClass1_Sub1_2 = this.aClass1_Sub1Array7[arg0.method1738()];
		this.aClass1_Sub1_1 = this.aClass1_Sub1Array7[arg0.method1738()];
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(BLclient!j;Lclient!sd;)Z")
	public boolean method681(@OriginalArg(1) Interface2 arg0, @OriginalArg(2) Class60 arg1) {
		for (@Pc(7) int local7 = 0; local7 < this.anIntArray103.length; local7++) {
			if (!arg1.method2343(this.anIntArray103[local7])) {
				return false;
			}
		}
		for (@Pc(35) int local35 = 0; local35 < this.anIntArray102.length; local35++) {
			if (!arg0.method1095(this.anIntArray102[local35])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IZLclient!sd;Lclient!j;ZIDI)[I")
	public int[] method682(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class60 arg2, @OriginalArg(3) Interface2 arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) double arg6) {
		@Pc(6) int[] local6 = new int[arg0 * arg5];
		Static95.method1803(arg6);
		Static138.anInterface2_2 = arg3;
		Static174.aClass60_33 = arg2;
		Static208.method2987(arg0, arg5);
		for (@Pc(32) int local32 = 0; local32 < this.aClass1_Sub1Array7.length; local32++) {
			this.aClass1_Sub1Array7[local32].method3308(arg5, arg0);
		}
		@Pc(58) int local58;
		@Pc(56) int local56;
		@Pc(60) byte local60;
		if (arg4) {
			local58 = arg0 - 1;
			local56 = -1;
			local60 = -1;
		} else {
			local56 = arg0;
			local58 = 0;
			local60 = 1;
		}
		@Pc(72) int local72 = 0;
		for (@Pc(74) int local74 = 0; local74 < arg5; local74++) {
			if (arg1) {
				local72 = local74;
			}
			@Pc(92) int[] local92;
			@Pc(96) int[] local96;
			@Pc(94) int[] local94;
			if (this.aClass1_Sub1_2.aBoolean185) {
				@Pc(90) int[] local90 = this.aClass1_Sub1_2.method3310(local74);
				local92 = local90;
				local94 = local90;
				local96 = local90;
			} else {
				@Pc(104) int[][] local104 = this.aClass1_Sub1_2.method3313(local74);
				local96 = local104[1];
				local92 = local104[0];
				local94 = local104[2];
			}
			for (@Pc(118) int local118 = local58; local118 != local56; local118 += local60) {
				@Pc(126) int local126 = local92[local118] >> 4;
				@Pc(132) int local132 = local96[local118] >> 4;
				@Pc(138) int local138 = local94[local118] >> 4;
				if (local132 > 255) {
					local132 = 255;
				}
				if (local138 > 255) {
					local138 = 255;
				}
				if (local132 < 0) {
					local132 = 0;
				}
				if (local138 < 0) {
					local138 = 0;
				}
				if (local126 > 255) {
					local126 = 255;
				}
				local138 = Static11.anIntArray31[local138];
				if (local126 < 0) {
					local126 = 0;
				}
				local132 = Static11.anIntArray31[local132];
				local126 = Static11.anIntArray31[local126];
				local6[local72++] = local138 + (local126 << 16) + (local132 << 8);
				if (arg1) {
					local72 += arg0 - 1;
				}
			}
		}
		for (@Pc(225) int local225 = 0; local225 < this.aClass1_Sub1Array7.length; local225++) {
			this.aClass1_Sub1Array7[local225].method3306();
		}
		return local6;
	}
}

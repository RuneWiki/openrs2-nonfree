import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!l")
public final class Class55 {

	@OriginalMember(owner = "client!l", name = "a", descriptor = "[I")
	private final int[] anIntArray223;

	@OriginalMember(owner = "client!l", name = "h", descriptor = "[I")
	private final int[] anIntArray224;

	@OriginalMember(owner = "client!l", name = "m", descriptor = "Lclient!di;")
	private final Class2_Sub4 aClass2_Sub4_2;

	@OriginalMember(owner = "client!l", name = "i", descriptor = "Lclient!di;")
	private final Class2_Sub4 aClass2_Sub4_1;

	@OriginalMember(owner = "client!l", name = "k", descriptor = "[Lclient!di;")
	private final Class2_Sub4[] aClass2_Sub4Array19;

	@OriginalMember(owner = "client!l", name = "<init>", descriptor = "()V")
	public Class55() {
		this.anIntArray223 = new int[0];
		this.anIntArray224 = new int[0];
		this.aClass2_Sub4_2 = new Class2_Sub4_Sub21();
		this.aClass2_Sub4_2.anInt4442 = 1;
		this.aClass2_Sub4_1 = new Class2_Sub4_Sub21();
		this.aClass2_Sub4_1.anInt4442 = 1;
		this.aClass2_Sub4Array19 = new Class2_Sub4[] { this.aClass2_Sub4_2, this.aClass2_Sub4_1 };
	}

	@OriginalMember(owner = "client!l", name = "<init>", descriptor = "(Lclient!kd;)V")
	public Class55(@OriginalArg(0) Class2_Sub11 arg0) {
		@Pc(7) int local7 = arg0.method1534();
		this.aClass2_Sub4Array19 = new Class2_Sub4[local7];
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		@Pc(18) int[][] local18 = new int[local7][];
		@Pc(47) int local47;
		for (@Pc(20) int local20 = 0; local20 < local7; local20++) {
			@Pc(26) Class2_Sub4 local26 = Static31.method539(arg0);
			if (local26.method3128() >= 0) {
				local13++;
			}
			if (local26.method3125() >= 0) {
				local15++;
			}
			@Pc(40) int local40 = local26.aClass2_Sub4Array42.length;
			local18[local20] = new int[local40];
			for (local47 = 0; local47 < local40; local47++) {
				local18[local20][local47] = arg0.method1534();
			}
			this.aClass2_Sub4Array19[local20] = local26;
		}
		this.anIntArray223 = new int[local13];
		this.anIntArray224 = new int[local15];
		local15 = 0;
		local13 = 0;
		for (@Pc(92) int local92 = 0; local92 < local7; local92++) {
			@Pc(99) Class2_Sub4 local99 = this.aClass2_Sub4Array19[local92];
			local47 = local99.aClass2_Sub4Array42.length;
			for (@Pc(105) int local105 = 0; local105 < local47; local105++) {
				local99.aClass2_Sub4Array42[local105] = this.aClass2_Sub4Array19[local18[local92][local105]];
			}
			@Pc(131) int local131 = local99.method3128();
			@Pc(135) int local135 = local99.method3125();
			if (local131 > 0) {
				this.anIntArray223[local13++] = local131;
			}
			if (local135 > 0) {
				this.anIntArray224[local15++] = local135;
			}
			local18[local92] = null;
		}
		this.aClass2_Sub4_2 = this.aClass2_Sub4Array19[arg0.method1534()];
		this.aClass2_Sub4_1 = this.aClass2_Sub4Array19[arg0.method1534()];
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IDIZLclient!hb;Lclient!pb;BZ)[I")
	public int[] method1689(@OriginalArg(0) int arg0, @OriginalArg(1) double arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Interface3 arg4, @OriginalArg(5) Class71 arg5, @OriginalArg(7) boolean arg6) {
		@Pc(6) int[] local6 = new int[arg2 * arg0];
		Static134.method2038(arg1);
		Static26.aClass71_35 = arg5;
		Static88.anInterface3_2 = arg4;
		Static10.method175(arg0, arg2);
		for (@Pc(31) int local31 = 0; local31 < this.aClass2_Sub4Array19.length; local31++) {
			this.aClass2_Sub4Array19[local31].method3132(arg2, arg0);
		}
		@Pc(53) int local53;
		@Pc(57) int local57;
		@Pc(55) byte local55;
		if (arg6) {
			local53 = arg0 - 1;
			local55 = -1;
			local57 = -1;
		} else {
			local53 = 0;
			local55 = 1;
			local57 = arg0;
		}
		@Pc(67) int local67 = 0;
		for (@Pc(69) int local69 = 0; local69 < arg2; local69++) {
			if (arg3) {
				local67 = local69;
			}
			@Pc(89) int[] local89;
			@Pc(91) int[] local91;
			@Pc(87) int[] local87;
			if (this.aClass2_Sub4_2.aBoolean190) {
				@Pc(85) int[] local85 = this.aClass2_Sub4_2.method3127(local69);
				local87 = local85;
				local89 = local85;
				local91 = local85;
			} else {
				@Pc(101) int[][] local101 = this.aClass2_Sub4_2.method3122(local69);
				local91 = local101[1];
				local87 = local101[2];
				local89 = local101[0];
			}
			for (@Pc(115) int local115 = local53; local115 != local57; local115 += local55) {
				@Pc(123) int local123 = local89[local115] >> 4;
				@Pc(129) int local129 = local91[local115] >> 4;
				if (local129 > 255) {
					local129 = 255;
				}
				@Pc(142) int local142 = local87[local115] >> 4;
				if (local123 > 255) {
					local123 = 255;
				}
				if (local142 > 255) {
					local142 = 255;
				}
				if (local129 < 0) {
					local129 = 0;
				}
				local129 = Static30.anIntArray62[local129];
				if (local123 < 0) {
					local123 = 0;
				}
				local123 = Static30.anIntArray62[local123];
				if (local142 < 0) {
					local142 = 0;
				}
				local142 = Static30.anIntArray62[local142];
				local6[local67++] = (local129 << 8) + ((local123 << 16) + local142);
				if (arg3) {
					local67 += arg0 - 1;
				}
			}
		}
		for (@Pc(218) int local218 = 0; local218 < this.aClass2_Sub4Array19.length; local218++) {
			this.aClass2_Sub4Array19[local218].method3123();
		}
		return local6;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!hb;BLclient!pb;)Z")
	public boolean method1690(@OriginalArg(0) Interface3 arg0, @OriginalArg(2) Class71 arg1) {
		for (@Pc(7) int local7 = 0; local7 < this.anIntArray223.length; local7++) {
			if (!arg1.method2119(this.anIntArray223[local7])) {
				return false;
			}
		}
		for (@Pc(36) int local36 = 0; local36 < this.anIntArray224.length; local36++) {
			if (!arg0.method2297(this.anIntArray224[local36])) {
				return false;
			}
		}
		return true;
	}
}

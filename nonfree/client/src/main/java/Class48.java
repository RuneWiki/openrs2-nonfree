import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!l")
public final class Class48 {

	@OriginalMember(owner = "client!l", name = "b", descriptor = "[I")
	private final int[] anIntArray328;

	@OriginalMember(owner = "client!l", name = "a", descriptor = "[I")
	private final int[] anIntArray327;

	@OriginalMember(owner = "client!l", name = "g", descriptor = "Lclient!af;")
	private final Class2_Sub2 aClass2_Sub2_1;

	@OriginalMember(owner = "client!l", name = "h", descriptor = "Lclient!af;")
	private final Class2_Sub2 aClass2_Sub2_2;

	@OriginalMember(owner = "client!l", name = "j", descriptor = "[Lclient!af;")
	private final Class2_Sub2[] aClass2_Sub2Array23;

	@OriginalMember(owner = "client!l", name = "<init>", descriptor = "()V")
	public Class48() {
		this.anIntArray328 = new int[0];
		this.anIntArray327 = new int[0];
		this.aClass2_Sub2_1 = new Class2_Sub2_Sub26();
		this.aClass2_Sub2_1.anInt4649 = 1;
		this.aClass2_Sub2_2 = new Class2_Sub2_Sub26();
		this.aClass2_Sub2_2.anInt4649 = 1;
		this.aClass2_Sub2Array23 = new Class2_Sub2[] { this.aClass2_Sub2_1, this.aClass2_Sub2_2 };
	}

	@OriginalMember(owner = "client!l", name = "<init>", descriptor = "(Lclient!og;)V")
	public Class48(@OriginalArg(0) Class2_Sub3 arg0) {
		@Pc(7) int local7 = arg0.method218();
		this.aClass2_Sub2Array23 = new Class2_Sub2[local7];
		@Pc(13) int local13 = 0;
		@Pc(16) int[][] local16 = new int[local7][];
		@Pc(18) int local18 = 0;
		@Pc(50) int local50;
		for (@Pc(20) int local20 = 0; local20 < local7; local20++) {
			@Pc(26) Class2_Sub2 local26 = Static166.method3108(arg0);
			if (local26.method3560() >= 0) {
				local13++;
			}
			if (local26.method3559() >= 0) {
				local18++;
			}
			@Pc(43) int local43 = local26.aClass2_Sub2Array42.length;
			local16[local20] = new int[local43];
			for (local50 = 0; local50 < local43; local50++) {
				local16[local20][local50] = arg0.method218();
			}
			this.aClass2_Sub2Array23[local20] = local26;
		}
		this.anIntArray327 = new int[local18];
		local18 = 0;
		this.anIntArray328 = new int[local13];
		local13 = 0;
		for (@Pc(95) int local95 = 0; local95 < local7; local95++) {
			@Pc(102) Class2_Sub2 local102 = this.aClass2_Sub2Array23[local95];
			local50 = local102.aClass2_Sub2Array42.length;
			for (@Pc(108) int local108 = 0; local108 < local50; local108++) {
				local102.aClass2_Sub2Array42[local108] = this.aClass2_Sub2Array23[local16[local95][local108]];
			}
			@Pc(134) int local134 = local102.method3560();
			@Pc(138) int local138 = local102.method3559();
			if (local134 > 0) {
				this.anIntArray328[local13++] = local134;
			}
			if (local138 > 0) {
				this.anIntArray327[local18++] = local138;
			}
			local16[local95] = null;
		}
		this.aClass2_Sub2_1 = this.aClass2_Sub2Array23[arg0.method218()];
		this.aClass2_Sub2_2 = this.aClass2_Sub2Array23[arg0.method218()];
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!pe;Lclient!of;B)Z")
	public boolean method2271(@OriginalArg(0) Class13 arg0, @OriginalArg(1) Interface1 arg1) {
		for (@Pc(7) int local7 = 0; local7 < this.anIntArray328.length; local7++) {
			if (!arg0.method535(this.anIntArray328[local7])) {
				return false;
			}
		}
		for (@Pc(42) int local42 = 0; local42 < this.anIntArray327.length; local42++) {
			if (!arg1.method2886(this.anIntArray327[local42])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(BLclient!pe;IDZLclient!of;I)[I")
	public int[] method2273(@OriginalArg(1) Class13 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) double arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Interface1 arg4, @OriginalArg(6) int arg5) {
		@Pc(6) int[] local6 = new int[arg1 * arg5];
		Static56.method1335(arg2);
		Static98.aClass13_20 = arg0;
		Static42.anInterface1_1 = arg4;
		Static46.method1061(arg5, arg1);
		for (@Pc(29) int local29 = 0; local29 < this.aClass2_Sub2Array23.length; local29++) {
			this.aClass2_Sub2Array23[local29].method3566(arg1, arg5);
		}
		@Pc(51) int local51;
		@Pc(49) int local49;
		@Pc(53) byte local53;
		if (arg3) {
			local51 = arg5 - 1;
			local49 = -1;
			local53 = -1;
		} else {
			local49 = arg5;
			local51 = 0;
			local53 = 1;
		}
		@Pc(65) int local65 = 0;
		for (@Pc(67) int local67 = 0; local67 < arg1; local67++) {
			@Pc(91) int[] local91;
			@Pc(87) int[] local87;
			@Pc(83) int[] local83;
			if (this.aClass2_Sub2_1.aBoolean183) {
				@Pc(99) int[] local99 = this.aClass2_Sub2_1.method3562(local67);
				local87 = local99;
				local83 = local99;
				local91 = local99;
			} else {
				@Pc(79) int[][] local79 = this.aClass2_Sub2_1.method3568(local67);
				local83 = local79[2];
				local87 = local79[1];
				local91 = local79[0];
			}
			for (@Pc(107) int local107 = local51; local107 != local49; local107 += local53) {
				@Pc(115) int local115 = local91[local107] >> 4;
				@Pc(121) int local121 = local87[local107] >> 4;
				if (local115 > 255) {
					local115 = 255;
				}
				if (local115 < 0) {
					local115 = 0;
				}
				if (local121 > 255) {
					local121 = 255;
				}
				if (local121 < 0) {
					local121 = 0;
				}
				local115 = Static174.anIntArray463[local115];
				local121 = Static174.anIntArray463[local121];
				@Pc(158) int local158 = local83[local107] >> 4;
				if (local158 > 255) {
					local158 = 255;
				}
				if (local158 < 0) {
					local158 = 0;
				}
				local158 = Static174.anIntArray463[local158];
				local6[local65++] = local158 + (local115 << 16) + (local121 << 8);
			}
		}
		for (@Pc(204) int local204 = 0; local204 < this.aClass2_Sub2Array23.length; local204++) {
			this.aClass2_Sub2Array23[local204].method3567();
		}
		return local6;
	}
}

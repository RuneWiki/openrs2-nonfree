import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nh")
public final class Class2_Sub1_Sub24 extends Class2_Sub1 {

	@OriginalMember(owner = "client!nh", name = "db", descriptor = "I")
	private int anInt2704;

	@OriginalMember(owner = "client!nh", name = "jb", descriptor = "I")
	private int anInt2708;

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(BLclient!oa;I)V")
	@Override
	public void method2987(@OriginalArg(1) Class2_Sub18 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2704 = arg0.method2387();
		} else if (arg1 == 1) {
			this.anInt2708 = arg0.method2387();
		} else if (arg1 == 2) {
			super.aBoolean183 = arg0.method2387() == 1;
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method2986(@OriginalArg(0) int arg0) {
		@Pc(12) int[] local12 = super.aClass3_39.method62(arg0);
		if (super.aClass3_39.aBoolean5) {
			@Pc(24) int local24 = this.anInt2704 + this.anInt2704 + 1;
			@Pc(32) int local32 = this.anInt2708 + this.anInt2708 + 1;
			@Pc(35) int[][] local35 = new int[local32][];
			@Pc(57) int local57;
			for (@Pc(40) int local40 = arg0 - this.anInt2708; local40 <= this.anInt2708 + arg0; local40++) {
				@Pc(52) int[] local52 = this.method2980(0, Static78.anInt2044 & local40);
				@Pc(55) int[] local55 = new int[Static129.anInt3118];
				local57 = 0;
				for (@Pc(61) int local61 = -this.anInt2704; local61 <= this.anInt2704; local61++) {
					local57 += local52[local61 & Static8.anInt230];
				}
				@Pc(82) int local82 = 0;
				while (Static129.anInt3118 > local82) {
					local55[local82] = local57 / local24;
					local57 -= local52[local82 - this.anInt2704 & Static8.anInt230];
					local82++;
					local57 += local52[local82 + this.anInt2704 & Static8.anInt230];
				}
				local35[this.anInt2708 + local40 - arg0] = local55;
			}
			for (@Pc(144) int local144 = 0; local144 < Static129.anInt3118; local144++) {
				@Pc(148) int local148 = 0;
				for (local57 = 0; local57 < local32; local57++) {
					local148 += local35[local57][local144];
				}
				local12[local144] = local148 / local32;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method2982(@OriginalArg(1) int arg0) {
		@Pc(18) int[][] local18 = super.aClass11_39.method511(arg0);
		if (super.aClass11_39.aBoolean37) {
			@Pc(31) int local31 = this.anInt2708 + this.anInt2708 + 1;
			@Pc(39) int local39 = this.anInt2704 + this.anInt2704 + 1;
			@Pc(42) int[][][] local42 = new int[local31][][];
			@Pc(67) int local67;
			@Pc(65) int local65;
			for (@Pc(47) int local47 = arg0 - this.anInt2708; local47 <= this.anInt2708 + arg0; local47++) {
				@Pc(57) int[][] local57 = this.method2991(local47 & Static78.anInt2044, 0);
				@Pc(61) int[][] local61 = new int[3][Static129.anInt3118];
				@Pc(63) int local63 = 0;
				local65 = 0;
				local67 = 0;
				@Pc(71) int[] local71 = local57[0];
				@Pc(75) int[] local75 = local57[1];
				@Pc(79) int[] local79 = local57[2];
				for (@Pc(83) int local83 = -this.anInt2704; local83 <= this.anInt2704; local83++) {
					@Pc(89) int local89 = Static8.anInt230 & local83;
					local63 += local71[local89];
					local67 += local75[local89];
					local65 += local79[local89];
				}
				@Pc(120) int[] local120 = local61[1];
				@Pc(124) int[] local124 = local61[0];
				@Pc(128) int[] local128 = local61[2];
				@Pc(130) int local130 = 0;
				while (local130 < Static129.anInt3118) {
					local124[local130] = local63 / local39;
					local120[local130] = local67 / local39;
					local128[local130] = local65 / local39;
					@Pc(158) int local158 = local130 - this.anInt2704 & Static8.anInt230;
					local65 -= local79[local158];
					local63 -= local71[local158];
					local67 -= local75[local158];
					local130++;
					@Pc(184) int local184 = local130 + this.anInt2704 & Static8.anInt230;
					local63 += local71[local184];
					local65 += local79[local184];
					local67 += local75[local184];
				}
				local42[this.anInt2708 + local47 - arg0] = local61;
			}
			@Pc(234) int[] local234 = local18[1];
			@Pc(238) int[] local238 = local18[0];
			@Pc(242) int[] local242 = local18[2];
			for (local67 = 0; local67 < Static129.anInt3118; local67++) {
				local65 = 0;
				@Pc(250) int local250 = 0;
				@Pc(252) int local252 = 0;
				for (@Pc(254) int local254 = 0; local254 < local31; local254++) {
					@Pc(260) int[][] local260 = local42[local254];
					local252 += local260[2][local67];
					local65 += local260[0][local67];
					local250 += local260[1][local67];
				}
				local238[local67] = local65 / local31;
				local234[local67] = local250 / local31;
				local242[local67] = local252 / local31;
			}
		}
		return local18;
	}
}

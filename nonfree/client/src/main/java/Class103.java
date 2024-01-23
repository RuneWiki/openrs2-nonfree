import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ui")
public final class Class103 {

	@OriginalMember(owner = "client!ui", name = "p", descriptor = "[I")
	private int[] anIntArray565;

	@OriginalMember(owner = "client!ui", name = "g", descriptor = "[I")
	private int[] anIntArray564;

	@OriginalMember(owner = "client!ui", name = "s", descriptor = "Lclient!pc;")
	private Class1_Sub2 aClass1_Sub2_2;

	@OriginalMember(owner = "client!ui", name = "n", descriptor = "Lclient!pc;")
	private Class1_Sub2 aClass1_Sub2_1;

	@OriginalMember(owner = "client!ui", name = "k", descriptor = "[Lclient!pc;")
	private Class1_Sub2[] aClass1_Sub2Array38;

	@OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(Lclient!nc;)V")
	public Class103(@OriginalArg(0) Class1_Sub9 arg0) {
		@Pc(7) int local7 = arg0.method895();
		this.aClass1_Sub2Array38 = new Class1_Sub2[local7];
		@Pc(14) int[][] local14 = new int[local7][];
		@Pc(16) int local16 = 0;
		@Pc(18) int local18 = 0;
		@Pc(50) int local50;
		for (@Pc(20) int local20 = 0; local20 < local7; local20++) {
			@Pc(26) Class1_Sub2 local26 = Static30.method550(arg0);
			if (local26.method3510() >= 0) {
				local18++;
			}
			if (local26.method3504() >= 0) {
				local16++;
			}
			@Pc(43) int local43 = local26.aClass1_Sub2Array42.length;
			local14[local20] = new int[local43];
			for (local50 = 0; local50 < local43; local50++) {
				local14[local20][local50] = arg0.method895();
			}
			this.aClass1_Sub2Array38[local20] = local26;
		}
		this.anIntArray565 = new int[local18];
		this.anIntArray564 = new int[local16];
		local18 = 0;
		local16 = 0;
		for (@Pc(87) int local87 = 0; local87 < local7; local87++) {
			@Pc(94) Class1_Sub2 local94 = this.aClass1_Sub2Array38[local87];
			local50 = local94.aClass1_Sub2Array42.length;
			for (@Pc(100) int local100 = 0; local100 < local50; local100++) {
				local94.aClass1_Sub2Array42[local100] = this.aClass1_Sub2Array38[local14[local87][local100]];
			}
			@Pc(126) int local126 = local94.method3510();
			@Pc(130) int local130 = local94.method3504();
			if (local126 > 0) {
				this.anIntArray565[local18++] = local126;
			}
			if (local130 > 0) {
				this.anIntArray564[local16++] = local130;
			}
			local14[local87] = null;
		}
		this.aClass1_Sub2_2 = this.aClass1_Sub2Array38[arg0.method895()];
		this.aClass1_Sub2_1 = this.aClass1_Sub2Array38[arg0.method895()];
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(ZLclient!ic;IIDIZLclient!ai;)[I")
	public int[] method3163(@OriginalArg(0) boolean arg0, @OriginalArg(1) Interface1 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) double arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) Class7 arg6) {
		Static131.method2196(arg3);
		@Pc(13) int[] local13 = new int[arg4 * arg2];
		Static125.aClass7_23 = arg6;
		Static104.anInterface1_2 = arg1;
		Static23.method1993(arg2, arg4);
		for (@Pc(23) int local23 = 0; local23 < this.aClass1_Sub2Array38.length; local23++) {
			this.aClass1_Sub2Array38[local23].method3508(arg2, arg4);
		}
		@Pc(49) int local49;
		@Pc(43) int local43;
		@Pc(45) byte local45;
		if (arg5) {
			local43 = -1;
			local45 = -1;
			local49 = arg2 - 1;
		} else {
			local45 = 1;
			local49 = 0;
			local43 = arg2;
		}
		@Pc(59) int local59 = 0;
		for (@Pc(61) int local61 = 0; local61 < arg4; local61++) {
			@Pc(77) int[] local77;
			@Pc(81) int[] local81;
			@Pc(85) int[] local85;
			if (this.aClass1_Sub2_2.aBoolean265) {
				@Pc(93) int[] local93 = this.aClass1_Sub2_2.method3505(local61);
				local77 = local93;
				local81 = local93;
				local85 = local93;
			} else {
				@Pc(73) int[][] local73 = this.aClass1_Sub2_2.method3512(local61);
				local77 = local73[0];
				local81 = local73[1];
				local85 = local73[2];
			}
			if (arg0) {
				local59 = local61;
			}
			for (@Pc(105) int local105 = local49; local105 != local43; local105 += local45) {
				@Pc(113) int local113 = local77[local105] >> 4;
				@Pc(119) int local119 = local81[local105] >> 4;
				if (local113 > 255) {
					local113 = 255;
				}
				if (local113 < 0) {
					local113 = 0;
				}
				@Pc(136) int local136 = local85[local105] >> 4;
				if (local136 > 255) {
					local136 = 255;
				}
				if (local136 < 0) {
					local136 = 0;
				}
				if (local119 > 255) {
					local119 = 255;
				}
				local113 = Static111.anIntArray320[local113];
				if (local119 < 0) {
					local119 = 0;
				}
				local119 = Static111.anIntArray320[local119];
				local136 = Static111.anIntArray320[local136];
				local13[local59++] = (local113 << 16) + (local119 << 8) + local136;
				if (arg0) {
					local59 += arg2 - 1;
				}
			}
		}
		for (@Pc(211) int local211 = 0; local211 < this.aClass1_Sub2Array38.length; local211++) {
			this.aClass1_Sub2Array38[local211].method3509();
		}
		return local13;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lclient!ic;ILclient!ai;)Z")
	public boolean method3165(@OriginalArg(0) Interface1 arg0, @OriginalArg(2) Class7 arg1) {
		for (@Pc(7) int local7 = 0; local7 < this.anIntArray565.length; local7++) {
			if (!arg1.method3239(this.anIntArray565[local7])) {
				return false;
			}
		}
		for (@Pc(31) int local31 = 0; local31 < this.anIntArray564.length; local31++) {
			if (!arg0.method1249(this.anIntArray564[local31])) {
				return false;
			}
		}
		return true;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!t")
public final class Class109 {

	@OriginalMember(owner = "client!t", name = "o", descriptor = "[I")
	private int[] anIntArray452;

	@OriginalMember(owner = "client!t", name = "d", descriptor = "[I")
	private int[] anIntArray450;

	@OriginalMember(owner = "client!t", name = "k", descriptor = "Lclient!j;")
	private Class1_Sub3 aClass1_Sub3_2;

	@OriginalMember(owner = "client!t", name = "e", descriptor = "Lclient!j;")
	private Class1_Sub3 aClass1_Sub3_1;

	@OriginalMember(owner = "client!t", name = "n", descriptor = "[Lclient!j;")
	private Class1_Sub3[] aClass1_Sub3Array39;

	@OriginalMember(owner = "client!t", name = "<init>", descriptor = "(Lclient!pg;)V")
	public Class109(@OriginalArg(0) Class1_Sub17 arg0) {
		@Pc(7) int local7 = arg0.method2142();
		this.aClass1_Sub3Array39 = new Class1_Sub3[local7];
		@Pc(13) int local13 = 0;
		@Pc(16) int[][] local16 = new int[local7][];
		@Pc(18) int local18 = 0;
		@Pc(50) int local50;
		for (@Pc(20) int local20 = 0; local20 < local7; local20++) {
			@Pc(26) Class1_Sub3 local26 = Static181.method2965(arg0);
			if (local26.method3464() >= 0) {
				local13++;
			}
			if (local26.method3471() >= 0) {
				local18++;
			}
			@Pc(43) int local43 = local26.aClass1_Sub3Array42.length;
			local16[local20] = new int[local43];
			for (local50 = 0; local50 < local43; local50++) {
				local16[local20][local50] = arg0.method2142();
			}
			this.aClass1_Sub3Array39[local20] = local26;
		}
		this.anIntArray450 = new int[local18];
		this.anIntArray452 = new int[local13];
		local18 = 0;
		local13 = 0;
		for (@Pc(91) int local91 = 0; local91 < local7; local91++) {
			@Pc(98) Class1_Sub3 local98 = this.aClass1_Sub3Array39[local91];
			local50 = local98.aClass1_Sub3Array42.length;
			for (@Pc(104) int local104 = 0; local104 < local50; local104++) {
				local98.aClass1_Sub3Array42[local104] = this.aClass1_Sub3Array39[local16[local91][local104]];
			}
			@Pc(126) int local126 = local98.method3464();
			@Pc(130) int local130 = local98.method3471();
			if (local126 > 0) {
				this.anIntArray452[local13++] = local126;
			}
			if (local130 > 0) {
				this.anIntArray450[local18++] = local130;
			}
			local16[local91] = null;
		}
		this.aClass1_Sub3_2 = this.aClass1_Sub3Array39[arg0.method2142()];
		this.aClass1_Sub3_1 = this.aClass1_Sub3Array39[arg0.method2142()];
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(ZLclient!pa;ZLclient!mf;DIII)[I")
	public int[] method3170(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class86 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Interface4 arg3, @OriginalArg(4) double arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		@Pc(6) int[] local6 = new int[arg6 * arg5];
		Static40.method643(arg4);
		Static19.aClass86_6 = arg1;
		Static230.anInterface4_2 = arg3;
		Static26.method384(arg5, arg6);
		for (@Pc(23) int local23 = 0; local23 < this.aClass1_Sub3Array39.length; local23++) {
			this.aClass1_Sub3Array39[local23].method3472(arg5, arg6);
		}
		@Pc(50) int local50;
		@Pc(48) int local48;
		@Pc(52) byte local52;
		if (arg2) {
			local50 = arg6 - 1;
			local52 = -1;
			local48 = -1;
		} else {
			local48 = arg6;
			local50 = 0;
			local52 = 1;
		}
		@Pc(64) int local64 = 0;
		for (@Pc(66) int local66 = 0; local66 < arg5; local66++) {
			if (arg0) {
				local64 = local66;
			}
			@Pc(86) int[] local86;
			@Pc(84) int[] local84;
			@Pc(88) int[] local88;
			if (this.aClass1_Sub3_2.aBoolean213) {
				@Pc(82) int[] local82 = this.aClass1_Sub3_2.method3475(local66);
				local84 = local82;
				local86 = local82;
				local88 = local82;
			} else {
				@Pc(96) int[][] local96 = this.aClass1_Sub3_2.method3467(local66);
				local86 = local96[0];
				local84 = local96[1];
				local88 = local96[2];
			}
			for (@Pc(110) int local110 = local50; local110 != local48; local110 += local52) {
				@Pc(118) int local118 = local86[local110] >> 4;
				if (local118 > 255) {
					local118 = 255;
				}
				@Pc(131) int local131 = local84[local110] >> 4;
				if (local131 > 255) {
					local131 = 255;
				}
				if (local118 < 0) {
					local118 = 0;
				}
				local118 = Static95.anIntArray175[local118];
				if (local131 < 0) {
					local131 = 0;
				}
				local131 = Static95.anIntArray175[local131];
				@Pc(164) int local164 = local88[local110] >> 4;
				if (local164 > 255) {
					local164 = 255;
				}
				if (local164 < 0) {
					local164 = 0;
				}
				local164 = Static95.anIntArray175[local164];
				local6[local64++] = (local131 << 8) + ((local118 << 16) + local164);
				if (arg0) {
					local64 += arg6 - 1;
				}
			}
		}
		for (@Pc(221) int local221 = 0; local221 < this.aClass1_Sub3Array39.length; local221++) {
			this.aClass1_Sub3Array39[local221].method3470();
		}
		return local6;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(Lclient!mf;Lclient!pa;I)Z")
	public boolean method3172(@OriginalArg(0) Interface4 arg0, @OriginalArg(1) Class86 arg1) {
		for (@Pc(7) int local7 = 0; local7 < this.anIntArray452.length; local7++) {
			if (!arg1.method3322(this.anIntArray452[local7])) {
				return false;
			}
		}
		for (@Pc(36) int local36 = 0; local36 < this.anIntArray450.length; local36++) {
			if (!arg0.method2510(this.anIntArray450[local36])) {
				return false;
			}
		}
		return true;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!b")
public final class Class7 {

	@OriginalMember(owner = "client!b", name = "f", descriptor = "[I")
	private int[] anIntArray20;

	@OriginalMember(owner = "client!b", name = "q", descriptor = "[I")
	private int[] anIntArray21;

	@OriginalMember(owner = "client!b", name = "l", descriptor = "Lclient!c;")
	private Class2_Sub1 aClass2_Sub1_2;

	@OriginalMember(owner = "client!b", name = "c", descriptor = "Lclient!c;")
	private Class2_Sub1 aClass2_Sub1_1;

	@OriginalMember(owner = "client!b", name = "a", descriptor = "[Lclient!c;")
	private Class2_Sub1[] aClass2_Sub1Array4;

	@OriginalMember(owner = "client!b", name = "<init>", descriptor = "(Lclient!ea;)V")
	public Class7(@OriginalArg(0) Class2_Sub3 arg0) {
		@Pc(7) int local7 = arg0.method209();
		this.aClass2_Sub1Array4 = new Class2_Sub1[local7];
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		@Pc(18) int[][] local18 = new int[local7][];
		@Pc(50) int local50;
		for (@Pc(20) int local20 = 0; local20 < local7; local20++) {
			@Pc(26) Class2_Sub1 local26 = Static82.method1492(arg0);
			if (local26.method3208() >= 0) {
				local15++;
			}
			if (local26.method3214() >= 0) {
				local13++;
			}
			@Pc(43) int local43 = local26.aClass2_Sub1Array42.length;
			local18[local20] = new int[local43];
			for (local50 = 0; local50 < local43; local50++) {
				local18[local20][local50] = arg0.method209();
			}
			this.aClass2_Sub1Array4[local20] = local26;
		}
		this.anIntArray20 = new int[local15];
		this.anIntArray21 = new int[local13];
		local15 = 0;
		local13 = 0;
		for (@Pc(91) int local91 = 0; local91 < local7; local91++) {
			@Pc(98) Class2_Sub1 local98 = this.aClass2_Sub1Array4[local91];
			local50 = local98.aClass2_Sub1Array42.length;
			for (@Pc(104) int local104 = 0; local104 < local50; local104++) {
				local98.aClass2_Sub1Array42[local104] = this.aClass2_Sub1Array4[local18[local91][local104]];
			}
			@Pc(130) int local130 = local98.method3208();
			@Pc(134) int local134 = local98.method3214();
			if (local130 > 0) {
				this.anIntArray20[local15++] = local130;
			}
			if (local134 > 0) {
				this.anIntArray21[local13++] = local134;
			}
			local18[local91] = null;
		}
		this.aClass2_Sub1_2 = this.aClass2_Sub1Array4[arg0.method209()];
		this.aClass2_Sub1_1 = this.aClass2_Sub1Array4[arg0.method209()];
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(DIZLclient!nb;Lclient!fe;IIZ)[I")
	public int[] method284(@OriginalArg(0) double arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class15 arg3, @OriginalArg(4) Interface1 arg4, @OriginalArg(5) int arg5, @OriginalArg(7) boolean arg6) {
		Static40.method856(arg0);
		Static216.anInterface1_2 = arg4;
		Static36.aClass15_9 = arg3;
		Static104.method1778(arg1, arg5);
		for (@Pc(18) int local18 = 0; local18 < this.aClass2_Sub1Array4.length; local18++) {
			this.aClass2_Sub1Array4[local18].method3213(arg1, arg5);
		}
		@Pc(39) int[] local39 = new int[arg5 * arg1];
		@Pc(52) int local52;
		@Pc(48) int local48;
		@Pc(54) byte local54;
		if (arg6) {
			local48 = -1;
			local52 = arg1 - 1;
			local54 = -1;
		} else {
			local52 = 0;
			local48 = arg1;
			local54 = 1;
		}
		@Pc(64) int local64 = 0;
		for (@Pc(66) int local66 = 0; local66 < arg5; local66++) {
			if (arg2) {
				local64 = local66;
			}
			@Pc(90) int[] local90;
			@Pc(86) int[] local86;
			@Pc(94) int[] local94;
			if (this.aClass2_Sub1_2.aBoolean286) {
				@Pc(102) int[] local102 = this.aClass2_Sub1_2.method3201(local66);
				local90 = local102;
				local86 = local102;
				local94 = local102;
			} else {
				@Pc(82) int[][] local82 = this.aClass2_Sub1_2.method3211(local66);
				local86 = local82[1];
				local90 = local82[0];
				local94 = local82[2];
			}
			for (@Pc(110) int local110 = local52; local110 != local48; local110 += local54) {
				@Pc(118) int local118 = local90[local110] >> 4;
				if (local118 > 255) {
					local118 = 255;
				}
				if (local118 < 0) {
					local118 = 0;
				}
				local118 = Static156.anIntArray392[local118];
				@Pc(142) int local142 = local86[local110] >> 4;
				if (local142 > 255) {
					local142 = 255;
				}
				@Pc(153) int local153 = local94[local110] >> 4;
				if (local142 < 0) {
					local142 = 0;
				}
				if (local153 > 255) {
					local153 = 255;
				}
				local142 = Static156.anIntArray392[local142];
				if (local153 < 0) {
					local153 = 0;
				}
				local153 = Static156.anIntArray392[local153];
				local39[local64++] = local153 + (local142 << 8) + (local118 << 16);
				if (arg2) {
					local64 += arg1 - 1;
				}
			}
		}
		for (@Pc(208) int local208 = 0; local208 < this.aClass2_Sub1Array4.length; local208++) {
			this.aClass2_Sub1Array4[local208].method3212();
		}
		return local39;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(Lclient!fe;Lclient!nb;I)Z")
	public boolean method287(@OriginalArg(0) Interface1 arg0, @OriginalArg(1) Class15 arg1) {
		for (@Pc(13) int local13 = 0; local13 < this.anIntArray20.length; local13++) {
			if (!arg1.method401(this.anIntArray20[local13])) {
				return false;
			}
		}
		for (@Pc(33) int local33 = 0; local33 < this.anIntArray21.length; local33++) {
			if (!arg0.method1136(this.anIntArray21[local33])) {
				return false;
			}
		}
		return true;
	}
}

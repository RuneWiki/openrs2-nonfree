import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tt")
public final class Class25_Sub3 extends Class25 {

	@OriginalMember(owner = "client!tt", name = "e", descriptor = "Z")
	private boolean aBoolean596 = false;

	@OriginalMember(owner = "client!tt", name = "k", descriptor = "I")
	private int anInt8302 = 0;

	@OriginalMember(owner = "client!tt", name = "f", descriptor = "I")
	private int anInt8299 = 0;

	@OriginalMember(owner = "client!tt", name = "l", descriptor = "I")
	private int anInt8303 = 0;

	@OriginalMember(owner = "client!tt", name = "r", descriptor = "I")
	private int anInt8309 = 0;

	@OriginalMember(owner = "client!tt", name = "A", descriptor = "I")
	private final int anInt8316;

	@OriginalMember(owner = "client!tt", name = "n", descriptor = "I")
	private final int anInt8305;

	@OriginalMember(owner = "client!tt", name = "t", descriptor = "Lclient!nd;")
	private final Class62_Sub1 aClass62_Sub1_19;

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "Lclient!dea;")
	private final Interface3 anInterface3_4;

	@OriginalMember(owner = "client!tt", name = "D", descriptor = "Z")
	private final boolean aBoolean600;

	@OriginalMember(owner = "client!tt", name = "y", descriptor = "Z")
	private final boolean aBoolean599;

	@OriginalMember(owner = "client!tt", name = "i", descriptor = "Z")
	private final boolean aBoolean598;

	@OriginalMember(owner = "client!tt", name = "g", descriptor = "Z")
	private final boolean aBoolean597;

	@OriginalMember(owner = "client!tt", name = "<init>", descriptor = "(Lclient!nd;IIZ)V")
	public Class25_Sub3(@OriginalArg(0) Class62_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.anInt8316 = arg2;
		this.anInt8305 = arg1;
		this.aClass62_Sub1_19 = arg0;
		this.anInterface3_4 = arg0.method4742(arg1, arg2, Static523.aClass306_15, arg3 ? Static189.aClass174_6 : Static296.aClass174_9);
		this.aBoolean600 = arg1 != this.anInterface3_4.method7451();
		this.aBoolean599 = arg2 != this.anInterface3_4.method7450();
		this.aBoolean598 = !this.aBoolean600 && this.anInterface3_4.method7455();
		this.aBoolean597 = !this.aBoolean599 && this.anInterface3_4.method7455();
	}

	@OriginalMember(owner = "client!tt", name = "<init>", descriptor = "(Lclient!nd;II[III)V")
	public Class25_Sub3(@OriginalArg(0) Class62_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass62_Sub1_19 = arg0;
		this.anInt8305 = arg1;
		this.anInt8316 = arg2;
		this.anInterface3_4 = arg0.method4743(arg4, arg2, arg5, arg3, arg1, false);
		this.aBoolean600 = arg1 != this.anInterface3_4.method7451();
		this.aBoolean599 = this.anInterface3_4.method7450() != arg2;
		this.aBoolean598 = !this.aBoolean600 && this.anInterface3_4.method7455();
		this.aBoolean597 = !this.aBoolean599 && this.anInterface3_4.method7455();
	}

	@OriginalMember(owner = "client!tt", name = "DA", descriptor = "(IIIII)V")
	@Override
	public void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(8) Class78_Sub1 local8 = this.aClass62_Sub1_19.method4744();
		@Pc(13) Class78_Sub1 local13 = this.aClass62_Sub1_19.method4705();
		@Pc(18) int local18 = arg1 + this.anInt8302;
		@Pc(23) int local23 = arg0 + this.anInt8299;
		this.anInterface3_4.method7438(Static269.aClass86_10);
		this.aClass62_Sub1_19.method4745();
		this.aClass62_Sub1_19.method4676(this.anInterface3_4);
		this.aClass62_Sub1_19.method4754(arg4);
		this.aClass62_Sub1_19.method4714(arg2);
		this.aClass62_Sub1_19.method4715(Static429.aClass63_6, 1);
		this.aClass62_Sub1_19.method4661(Static429.aClass63_6, 1);
		this.aClass62_Sub1_19.method4671(arg3);
		local8.method2189((float) this.anInt8305, (float) this.anInt8316, 0.0F);
		local8.TA(local23, local18, 0);
		local13.method2189(this.anInterface3_4.method7449((float) this.anInt8305), this.anInterface3_4.method7456((float) this.anInt8316), 1.0F);
		this.aClass62_Sub1_19.method4741(Static272.aClass273_4);
		this.aClass62_Sub1_19.method4679();
		this.aClass62_Sub1_19.method4740();
		this.aClass62_Sub1_19.method4757();
		this.aClass62_Sub1_19.method4715(Static233.aClass63_5, 1);
		this.aClass62_Sub1_19.method4661(Static233.aClass63_5, 1);
	}

	@OriginalMember(owner = "client!tt", name = "c", descriptor = "()I")
	@Override
	public int c() {
		return this.anInt8305;
	}

	@OriginalMember(owner = "client!tt", name = "P", descriptor = "(IIIIII)V")
	@Override
	public void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(13) int[] local13 = this.aClass62_Sub1_19.v(arg4, arg5, arg2, arg3);
		if (local13 != null) {
			for (@Pc(17) int local17 = 0; local17 < local13.length; local17++) {
				local13[local17] |= 0xFF000000;
			}
			this.method6700(arg0, arg1, arg2, arg3, local13, arg2);
		}
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(FFFFFFLclient!pa;II)V")
	@Override
	protected void method6963(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class87 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(8) Class78_Sub1 local8 = this.aClass62_Sub1_19.method4744();
		@Pc(13) Class78_Sub1 local13 = this.aClass62_Sub1_19.method4705();
		@Pc(16) Class87_Sub2 local16 = (Class87_Sub2) arg6;
		@Pc(19) Interface3 local19 = local16.anInterface3_2;
		this.anInterface3_4.method7438(Static354.aClass86_9);
		this.aClass62_Sub1_19.method4745();
		this.aClass62_Sub1_19.method4676(this.anInterface3_4);
		this.aClass62_Sub1_19.method4754(1);
		this.aClass62_Sub1_19.method4714(1);
		if (this.aBoolean596) {
			@Pc(55) float local55 = (float) this.anInt8305 / (float) this.EA();
			@Pc(63) float local63 = (float) this.anInt8316 / (float) this.ma();
			local8.method2185(0.0F, (arg4 - arg0) * local63, 1.0F, local55 * (arg3 - arg1), 0.0F, local55 * (arg2 - arg0), local63 * (arg5 - arg1), 0.0F, 0.0F);
			local8.method2192(((float) this.anInt8299 + arg0) * local55, local63 * (arg1 + (float) this.anInt8302), 0.0F);
		} else {
			local8.method2185(0.0F, arg4 - arg0, 1.0F, arg3 - arg1, 0.0F, arg2 - arg0, -arg1 + arg5, 0.0F, 0.0F);
			local8.method2192(arg0, arg1, 0.0F);
		}
		local13.method2189(this.anInterface3_4.method7449((float) this.anInt8305), this.anInterface3_4.method7456((float) this.anInt8316), 1.0F);
		this.aClass62_Sub1_19.method4741(Static272.aClass273_4);
		this.aClass62_Sub1_19.method4785(1);
		this.aClass62_Sub1_19.method4676(local19);
		this.aClass62_Sub1_19.method4685(Static148.aClass98_1, Static165.aClass98_2);
		this.aClass62_Sub1_19.method4715(Static233.aClass63_5, 0);
		@Pc(189) Class78_Sub1 local189 = this.aClass62_Sub1_19.method4705();
		local189.EA(local8);
		local189.TA(-arg7, -arg8, 0);
		local189.method2188(local19.method7449(1.0F), local19.method7456(1.0F), 1.0F);
		this.aClass62_Sub1_19.method4741(Static272.aClass273_4);
		this.aClass62_Sub1_19.method4679();
		this.aClass62_Sub1_19.method4740();
		this.aClass62_Sub1_19.method4757();
		this.aClass62_Sub1_19.method4715(Static24.aClass63_4, 0);
		this.aClass62_Sub1_19.method4685(Static165.aClass98_2, Static165.aClass98_2);
		this.aClass62_Sub1_19.method4676(null);
		this.aClass62_Sub1_19.method4785(0);
		this.aClass62_Sub1_19.method4757();
	}

	@OriginalMember(owner = "client!tt", name = "BA", descriptor = "(III)V")
	@Override
	public void BA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!tt", name = "i", descriptor = "(IIIIIII)V")
	@Override
	public void i(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(10) Class78_Sub1 local10 = this.aClass62_Sub1_19.method4744();
		@Pc(15) Class78_Sub1 local15 = this.aClass62_Sub1_19.method4705();
		this.anInterface3_4.method7438(Static269.aClass86_10);
		this.aClass62_Sub1_19.method4745();
		this.aClass62_Sub1_19.method4676(this.anInterface3_4);
		this.aClass62_Sub1_19.method4754(arg6);
		this.aClass62_Sub1_19.method4714(arg4);
		this.aClass62_Sub1_19.method4715(Static429.aClass63_6, 1);
		this.aClass62_Sub1_19.method4661(Static429.aClass63_6, 1);
		this.aClass62_Sub1_19.method4671(arg5);
		@Pc(73) boolean local73 = this.aBoolean597 && this.anInt8302 == 0 && this.anInt8309 == 0;
		@Pc(89) boolean local89 = this.aBoolean598 && this.anInt8299 == 0 && this.anInt8303 == 0;
		if (local73 & local89) {
			local15.method2189(this.anInterface3_4.method7449((float) arg2), this.anInterface3_4.method7456((float) arg3), 1.0F);
			local10.method2189((float) arg2, (float) arg3, 0.0F);
			local10.TA(arg0, arg1, 0);
			this.aClass62_Sub1_19.method4741(Static272.aClass273_4);
			this.aClass62_Sub1_19.method4679();
			this.aClass62_Sub1_19.method4740();
		} else {
			@Pc(143) int local143;
			@Pc(146) int local146;
			@Pc(173) int local173;
			@Pc(178) int local178;
			@Pc(221) int local221;
			if (local89) {
				local143 = arg1 + arg3;
				local146 = this.ma();
				local15.method2189(this.anInterface3_4.method7449((float) arg2), this.anInterface3_4.method7456((float) this.anInt8316), 1.0F);
				this.aClass62_Sub1_19.method4741(Static272.aClass273_4);
				local173 = this.anInt8302 + arg1;
				for (local178 = this.anInt8316 + local173; local178 <= local143; local178 += local146) {
					local10.method2189((float) arg2, (float) this.anInt8316, 0.0F);
					local10.TA(arg0, local173, 0);
					this.aClass62_Sub1_19.method4679();
					local173 += local146;
					this.aClass62_Sub1_19.method4740();
				}
				if (local143 > local173) {
					local221 = local143 - local173;
					local15.method2189(this.anInterface3_4.method7449((float) arg2), this.anInterface3_4.method7456((float) local221), 1.0F);
					this.aClass62_Sub1_19.method4741(Static272.aClass273_4);
					local10.method2189((float) arg2, (float) local221, 0.0F);
					local10.TA(arg0, local173, 0);
					this.aClass62_Sub1_19.method4679();
					this.aClass62_Sub1_19.method4740();
				}
			} else if (local73) {
				local143 = arg2 + arg0;
				local146 = this.EA();
				local15.method2189(this.anInterface3_4.method7449((float) this.anInt8305), this.anInterface3_4.method7456((float) arg3), 1.0F);
				this.aClass62_Sub1_19.method4741(Static272.aClass273_4);
				local173 = this.anInt8299 + arg0;
				for (local178 = this.anInt8305 + local173; local178 <= local143; local178 += local146) {
					local10.method2189((float) this.anInt8305, (float) arg3, 0.0F);
					local10.TA(local173, arg1, 0);
					this.aClass62_Sub1_19.method4679();
					this.aClass62_Sub1_19.method4740();
					local173 += local146;
				}
				if (local143 > local173) {
					local221 = local143 - local173;
					local15.method2189(this.anInterface3_4.method7449((float) local221), this.anInterface3_4.method7456((float) arg3), 1.0F);
					this.aClass62_Sub1_19.method4741(Static272.aClass273_4);
					local10.method2189((float) local221, (float) arg3, 0.0F);
					local10.TA(local173, arg1, 0);
					this.aClass62_Sub1_19.method4679();
					this.aClass62_Sub1_19.method4740();
				}
			} else {
				local143 = arg1 + arg3;
				local146 = arg2 + arg0;
				local173 = this.EA();
				local178 = this.ma();
				local221 = arg1 + this.anInt8302;
				@Pc(323) int local323;
				@Pc(328) int local328;
				@Pc(375) int local375;
				for (@Pc(292) int local292 = local221 + this.anInt8316; local292 <= local143; local292 += local178) {
					local15.method2189(this.anInterface3_4.method7449((float) this.anInt8305), this.anInterface3_4.method7456((float) this.anInt8316), 1.0F);
					this.aClass62_Sub1_19.method4741(Static272.aClass273_4);
					local323 = arg0 + this.anInt8299;
					for (local328 = this.anInt8305 + local323; local328 <= local146; local328 += local173) {
						local10.method2189((float) this.anInt8305, (float) this.anInt8316, 0.0F);
						local10.TA(local323, local221, 0);
						this.aClass62_Sub1_19.method4679();
						local323 += local173;
						this.aClass62_Sub1_19.method4740();
					}
					if (local323 < local146) {
						local375 = local146 - local323;
						local15.method2189(this.anInterface3_4.method7449((float) local375), this.anInterface3_4.method7456((float) this.anInt8316), 1.0F);
						this.aClass62_Sub1_19.method4741(Static272.aClass273_4);
						local10.method2189((float) local375, (float) this.anInt8316, 0.0F);
						local10.TA(local323, local221, 0);
						this.aClass62_Sub1_19.method4679();
						this.aClass62_Sub1_19.method4740();
					}
					local221 += local178;
				}
				if (local221 < local143) {
					local323 = local143 - local221;
					local15.method2189(this.anInterface3_4.method7449((float) this.anInt8305), this.anInterface3_4.method7456((float) local323), 1.0F);
					this.aClass62_Sub1_19.method4741(Static272.aClass273_4);
					local328 = arg0 + this.anInt8299;
					local375 = this.anInt8305 + local328;
					while (local146 >= local375) {
						local10.method2189((float) this.anInt8305, (float) local323, 0.0F);
						local10.TA(local328, local221, 0);
						this.aClass62_Sub1_19.method4679();
						local328 += local173;
						local375 += local173;
						this.aClass62_Sub1_19.method4740();
					}
					if (local328 < local146) {
						@Pc(525) int local525 = local146 - local328;
						local15.method2189(this.anInterface3_4.method7449((float) local525), this.anInterface3_4.method7456((float) local323), 1.0F);
						this.aClass62_Sub1_19.method4741(Static272.aClass273_4);
						local10.method2189((float) local525, (float) local323, 0.0F);
						local10.TA(local328, local221, 0);
						this.aClass62_Sub1_19.method4679();
						this.aClass62_Sub1_19.method4740();
					}
				}
			}
		}
		this.aClass62_Sub1_19.method4757();
		this.aClass62_Sub1_19.method4715(Static233.aClass63_5, 1);
		this.aClass62_Sub1_19.method4661(Static233.aClass63_5, 1);
	}

	@OriginalMember(owner = "client!tt", name = "ma", descriptor = "()I")
	@Override
	public int ma() {
		return this.anInt8309 + this.anInt8316 + this.anInt8302;
	}

	@OriginalMember(owner = "client!tt", name = "EA", descriptor = "()I")
	@Override
	public int EA() {
		return this.anInt8305 + this.anInt8299 + this.anInt8303;
	}

	@OriginalMember(owner = "client!tt", name = "CA", descriptor = "(FFFFFFIII)V")
	@Override
	protected void CA(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(8) Class78_Sub1 local8 = this.aClass62_Sub1_19.method4744();
		@Pc(13) Class78_Sub1 local13 = this.aClass62_Sub1_19.method4705();
		this.anInterface3_4.method7438(this.aBoolean600 || this.aBoolean599 ? Static269.aClass86_10 : Static354.aClass86_9);
		this.aClass62_Sub1_19.method4745();
		this.aClass62_Sub1_19.method4676(this.anInterface3_4);
		this.aClass62_Sub1_19.method4754(arg8);
		this.aClass62_Sub1_19.method4714(arg6);
		this.aClass62_Sub1_19.method4715(Static429.aClass63_6, 1);
		this.aClass62_Sub1_19.method4661(Static429.aClass63_6, 1);
		this.aClass62_Sub1_19.method4671(arg7);
		if (this.aBoolean596) {
			@Pc(70) float local70 = (float) this.EA();
			@Pc(74) float local74 = (float) this.ma();
			@Pc(80) float local80 = (arg2 - arg0) / local70;
			@Pc(87) float local87 = (arg3 - arg1) / local70;
			@Pc(94) float local94 = (arg4 - arg0) / local74;
			@Pc(100) float local100 = (arg5 - arg1) / local74;
			@Pc(106) float local106 = (float) this.anInt8302 * local94;
			@Pc(112) float local112 = (float) this.anInt8302 * local100;
			@Pc(118) float local118 = (float) this.anInt8299 * local80;
			@Pc(124) float local124 = local87 * (float) this.anInt8299;
			@Pc(131) float local131 = -local80 * (float) this.anInt8303;
			@Pc(138) float local138 = -local87 * (float) this.anInt8303;
			@Pc(145) float local145 = -local94 * (float) this.anInt8309;
			@Pc(152) float local152 = -local100 * (float) this.anInt8309;
			arg2 = local106 + arg2 + local131;
			arg1 = local124 + arg1 + local112;
			arg4 = local145 + arg4 + local118;
			arg0 = local106 + arg0 + local118;
			arg3 = arg3 + local138 + local112;
			arg5 = local124 + arg5 + local152;
		}
		local8.method2185(0.0F, arg4 - arg0, 1.0F, arg3 - arg1, 0.0F, arg2 - arg0, arg5 - arg1, 0.0F, 0.0F);
		local8.method2192(arg0, arg1, 0.0F);
		local13.method2189(this.anInterface3_4.method7449((float) this.anInt8305), this.anInterface3_4.method7456((float) this.anInt8316), 1.0F);
		this.aClass62_Sub1_19.method4741(Static272.aClass273_4);
		this.aClass62_Sub1_19.method4679();
		this.aClass62_Sub1_19.method4740();
		this.aClass62_Sub1_19.method4757();
		this.aClass62_Sub1_19.method4715(Static233.aClass63_5, 1);
		this.aClass62_Sub1_19.method4661(Static233.aClass63_5, 1);
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(IILclient!pa;II)V")
	@Override
	public void method6965(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class87 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) Class87_Sub2 local6 = (Class87_Sub2) arg2;
		@Pc(9) Interface3 local9 = local6.anInterface3_2;
		@Pc(14) int local14 = arg1 + this.anInt8302;
		@Pc(19) int local19 = arg0 + this.anInt8299;
		this.anInterface3_4.method7438(Static269.aClass86_10);
		this.aClass62_Sub1_19.method4745();
		this.aClass62_Sub1_19.method4676(this.anInterface3_4);
		this.aClass62_Sub1_19.method4754(1);
		this.aClass62_Sub1_19.method4714(1);
		@Pc(49) Class78_Sub1 local49 = this.aClass62_Sub1_19.method4744();
		local49.method2189((float) this.anInt8305, (float) this.anInt8316, 0.0F);
		local49.TA(local19, local14, 0);
		this.aClass62_Sub1_19.method4679();
		@Pc(73) Class78_Sub1 local73 = this.aClass62_Sub1_19.method4705();
		local73.method2189(this.anInterface3_4.method7449((float) this.anInt8305), this.anInterface3_4.method7456((float) this.anInt8316), 1.0F);
		this.aClass62_Sub1_19.method4741(Static272.aClass273_4);
		this.aClass62_Sub1_19.method4785(1);
		this.aClass62_Sub1_19.method4676(local9);
		this.aClass62_Sub1_19.method4685(Static148.aClass98_1, Static165.aClass98_2);
		this.aClass62_Sub1_19.method4715(Static233.aClass63_5, 0);
		@Pc(123) Class78_Sub1 local123 = this.aClass62_Sub1_19.method4705();
		local123.method2189(local9.method7449((float) this.anInt8305), local9.method7456((float) this.anInt8316), 1.0F);
		local123.method2192(local9.method7449((float) (local19 - arg3)), local9.method7456((float) (local14 - arg4)), 0.0F);
		this.aClass62_Sub1_19.method4741(Static272.aClass273_4);
		this.aClass62_Sub1_19.method4740();
		this.aClass62_Sub1_19.method4757();
		this.aClass62_Sub1_19.method4715(Static24.aClass63_4, 0);
		this.aClass62_Sub1_19.method4685(Static165.aClass98_2, Static165.aClass98_2);
		this.aClass62_Sub1_19.method4676(null);
		this.aClass62_Sub1_19.method4785(0);
		this.aClass62_Sub1_19.method4757();
	}

	@OriginalMember(owner = "client!tt", name = "KA", descriptor = "(IIII)V")
	@Override
	public void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt8303 = arg2;
		this.anInt8302 = arg1;
		this.anInt8309 = arg3;
		this.anInt8299 = arg0;
		this.aBoolean596 = this.anInt8299 != 0 || this.anInt8302 != 0 || this.anInt8303 != 0 || this.anInt8309 != 0;
	}

	@OriginalMember(owner = "client!tt", name = "la", descriptor = "()I")
	@Override
	public int la() {
		return this.anInt8316;
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(IIII[III)V")
	private void method6700(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(6) int arg5) {
		this.anInterface3_4.method7452(arg1, arg3, arg2, arg4, arg0, arg5);
	}

	@OriginalMember(owner = "client!tt", name = "ra", descriptor = "(IIIIIII)V")
	@Override
	public void ra(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(8) Class78_Sub1 local8 = this.aClass62_Sub1_19.method4744();
		@Pc(13) Class78_Sub1 local13 = this.aClass62_Sub1_19.method4705();
		this.anInterface3_4.method7438(this.aBoolean600 || this.aBoolean599 ? Static269.aClass86_10 : Static354.aClass86_9);
		this.aClass62_Sub1_19.method4745();
		this.aClass62_Sub1_19.method4676(this.anInterface3_4);
		this.aClass62_Sub1_19.method4754(arg6);
		this.aClass62_Sub1_19.method4714(arg4);
		this.aClass62_Sub1_19.method4715(Static429.aClass63_6, 1);
		this.aClass62_Sub1_19.method4661(Static429.aClass63_6, 1);
		this.aClass62_Sub1_19.method4671(arg5);
		local13.method2189(this.anInterface3_4.method7449((float) this.anInt8305), this.anInterface3_4.method7456((float) this.anInt8316), 1.0F);
		if (this.aBoolean596) {
			arg2 = this.anInt8305 * arg2 / this.EA();
			arg3 = arg3 * this.anInt8316 / this.ma();
			arg0 += this.anInt8299 * arg2 / this.anInt8305;
			arg1 += this.anInt8302 * arg3 / this.anInt8316;
		}
		local8.method2189((float) arg2, (float) arg3, 0.0F);
		local8.TA(arg0, arg1, 0);
		this.aClass62_Sub1_19.method4741(Static272.aClass273_4);
		this.aClass62_Sub1_19.method4679();
		this.aClass62_Sub1_19.method4740();
		this.aClass62_Sub1_19.method4757();
		this.aClass62_Sub1_19.method4715(Static233.aClass63_5, 1);
		this.aClass62_Sub1_19.method4661(Static233.aClass63_5, 1);
	}
}

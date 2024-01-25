import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fl")
public final class Class63 {

	@OriginalMember(owner = "client!fl", name = "e", descriptor = "I")
	private int anInt2093;

	@OriginalMember(owner = "client!fl", name = "f", descriptor = "I")
	private int anInt2094;

	@OriginalMember(owner = "client!fl", name = "g", descriptor = "I")
	public int anInt2095;

	@OriginalMember(owner = "client!fl", name = "h", descriptor = "Lclient!gl;")
	private Class2 aClass2_9;

	@OriginalMember(owner = "client!fl", name = "i", descriptor = "I")
	private int anInt2096;

	@OriginalMember(owner = "client!fl", name = "k", descriptor = "I")
	private int anInt2098;

	@OriginalMember(owner = "client!fl", name = "p", descriptor = "I")
	private final int anInt2102;

	@OriginalMember(owner = "client!fl", name = "q", descriptor = "I")
	private final int anInt2103;

	@OriginalMember(owner = "client!fl", name = "o", descriptor = "I")
	private final int anInt2101;

	@OriginalMember(owner = "client!fl", name = "d", descriptor = "Z")
	private final boolean aBoolean147;

	@OriginalMember(owner = "client!fl", name = "n", descriptor = "I")
	private final int anInt2100;

	@OriginalMember(owner = "client!fl", name = "j", descriptor = "I")
	private final int anInt2097;

	@OriginalMember(owner = "client!fl", name = "b", descriptor = "I")
	private final int anInt2092;

	@OriginalMember(owner = "client!fl", name = "l", descriptor = "I")
	private final int anInt2099;

	@OriginalMember(owner = "client!fl", name = "<init>", descriptor = "(IIIIIIIZ)V")
	public Class63(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt2102 = arg2;
		this.anInt2103 = arg3;
		this.anInt2101 = arg4;
		this.aBoolean147 = arg7;
		this.anInt2100 = arg1;
		this.anInt2097 = arg6;
		this.anInt2092 = arg5;
		this.anInt2099 = arg0;
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "()V")
	public void method2098() {
		this.aClass2_9 = null;
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(Lclient!e;Lclient!fl;)Z")
	private boolean method2099(@OriginalArg(0) Class46 arg0, @OriginalArg(1) Class63 arg1) {
		if (this.aClass2_9 == null) {
			if (this.anInt2099 == 0) {
				if (Static143.anInterface2_1.method117(this.anInt2100)) {
					@Pc(23) int[] local23 = Static143.anInterface2_1.method115(this.anInt2100, this.anInt2093, 0.7F, this.anInt2093);
					this.aClass2_9 = arg0.method5167(local23, this.anInt2093, this.anInt2093, this.anInt2093);
				}
			} else if (this.anInt2099 == 2) {
				this.method2105(arg0, arg1);
			} else if (this.anInt2099 == 1) {
				this.method2104(arg0, arg1);
			}
		}
		return this.aClass2_9 != null;
	}

	@OriginalMember(owner = "client!fl", name = "b", descriptor = "(Lclient!e;Lclient!fl;)Z")
	public boolean method2101(@OriginalArg(0) Class46 arg0, @OriginalArg(1) Class63 arg1) {
		return this.aClass2_9 != null || this.method2099(arg0, arg1);
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(Lclient!e;IIIIII)V")
	public void method2103(@OriginalArg(0) Class46 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass2_9 == null) {
			return;
		}
		@Pc(10) int local10 = this.anInt2098 - arg5 & 0x3FFF;
		@Pc(17) int local17 = this.anInt2096 - arg6 & 0x3FFF;
		if (local17 > 8192) {
			local17 -= 16384;
		}
		if (local10 > 8192) {
			local10 -= 16384;
		}
		@Pc(38) int local38 = local10 * arg4 / 4096 + (arg4 - this.anInt2094) / 2;
		@Pc(51) int local51 = local17 * arg4 / -4096 + (arg3 - this.anInt2094) / 2;
		if (local38 < arg4 && local38 + this.anInt2094 > 0 && local51 < arg3 && local51 + this.anInt2094 > 0) {
			this.aClass2_9.method2632(local51 + arg1, local38 + arg2, this.anInt2094, this.anInt2094);
		}
	}

	@OriginalMember(owner = "client!fl", name = "c", descriptor = "(Lclient!e;Lclient!fl;)V")
	private void method2104(@OriginalArg(0) Class46 arg0, @OriginalArg(1) Class63 arg1) {
		Static87.method2107(arg0);
		Static87.method2108(arg0);
		arg0.method5133(Static87.anIntArray192);
		arg0.method5172(0, 0, this.anInt2093, this.anInt2093);
		arg0.method5153();
		arg0.method5110(0, 0, this.anInt2093, this.anInt2093, this.anInt2097 | 0xFF000000, 0);
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean147) {
				local31 = -arg1.anInt2102;
				local33 = -arg1.anInt2103;
				local35 = -arg1.anInt2101;
			} else {
				local31 = arg1.anInt2102 - this.anInt2102;
				local33 = arg1.anInt2103 - this.anInt2103;
				local35 = arg1.anInt2101 - this.anInt2101;
			}
		}
		@Pc(79) int local79;
		@Pc(84) int local84;
		@Pc(94) int local94;
		if (this.anInt2098 != 0) {
			local79 = Class14_Sub3_Sub34.anIntArray547[this.anInt2098];
			local84 = Class14_Sub3_Sub34.anIntArray546[this.anInt2098];
			local94 = local33 * local84 - local35 * local79 >> 15;
			local35 = local33 * local79 + local35 * local84 >> 15;
			local33 = local94;
		}
		if (this.anInt2096 != 0) {
			local79 = Class14_Sub3_Sub34.anIntArray547[this.anInt2096];
			local84 = Class14_Sub3_Sub34.anIntArray546[this.anInt2096];
			local94 = local35 * local79 + local31 * local84 >> 15;
			local35 = local35 * local84 - local31 * local79 >> 15;
			local31 = local94;
		}
		@Pc(147) Class45 local147 = Static87.aClass45_4.method1793((byte) 0, 25600, true);
		if (arg0.method5168()) {
			local147.method1824((short) 0, (short) this.anInt2100);
		} else {
			local147.method1821((short) 127, Static143.anInterface2_1.method116(this.anInt2100).aShort64);
			local147.method1824((short) 0, (short) -1);
		}
		arg0.method5121(1.0F);
		arg0.method5180(16777215, 1.0F, 1.0F, (float) local31, (float) local33, (float) local35);
		local84 = this.anInt2093 * 1024 / (local147.method1792() - local147.method1777());
		if (this.anInt2097 != 0) {
			local84 = local84 * 13 / 16;
		}
		arg0.method5178(this.anInt2093 / 2, this.anInt2093 / 2, local84, local84);
		arg0.method5144(arg0.method5185());
		@Pc(223) Class51 local223 = arg0.method5185();
		local223.method3548(0, 0, arg0.method5114() - local147.method1798());
		local147.method1799(local223, null, 1024);
		@Pc(245) int local245 = this.anInt2093 * 13 / 16;
		@Pc(252) int local252 = (this.anInt2093 - local245) / 2;
		Static87.aClass2_8.method2637(local252, local252, local245, local245, 1, this.anInt2097 | 0xFF000000, 1);
		this.aClass2_9 = arg0.method5182(0, 0, this.anInt2093, this.anInt2093, true);
		arg0.method5153();
		arg0.method5110(0, 0, this.anInt2093, this.anInt2093, 0, 0);
		Static87.aClass2_10.method2637(0, 0, this.anInt2093, this.anInt2093, 0, 0, 0);
		this.aClass2_9.method2633(0);
		arg0.method5172(Static87.anIntArray192[0], Static87.anIntArray192[1], Static87.anIntArray192[2], Static87.anIntArray192[3]);
	}

	@OriginalMember(owner = "client!fl", name = "d", descriptor = "(Lclient!e;Lclient!fl;)V")
	private void method2105(@OriginalArg(0) Class46 arg0, @OriginalArg(1) Class63 arg1) {
		@Pc(6) Class71 local6 = Static222.method3992(this.anInt2100, Static44.aClass143_31);
		if (local6 == null) {
			return;
		}
		arg0.method5133(Static87.anIntArray192);
		arg0.method5172(0, 0, this.anInt2093, this.anInt2093);
		arg0.method5110(0, 0, this.anInt2093, this.anInt2093, 0, 0);
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean147) {
				local32 = -arg1.anInt2102;
				local34 = -arg1.anInt2103;
				local36 = -arg1.anInt2101;
			} else {
				local32 = this.anInt2102 - arg1.anInt2102;
				local34 = this.anInt2103 - arg1.anInt2103;
				local36 = this.anInt2101 - arg1.anInt2101;
			}
		}
		@Pc(81) int local81;
		@Pc(85) int local85;
		@Pc(89) int local89;
		@Pc(99) int local99;
		if (this.anInt2098 != 0) {
			local81 = -this.anInt2098 & 0x3FFF;
			local85 = Class14_Sub3_Sub34.anIntArray547[local81];
			local89 = Class14_Sub3_Sub34.anIntArray546[local81];
			local99 = local34 * local89 - local36 * local85 >> 15;
			local36 = local34 * local85 + local36 * local89 >> 15;
			local34 = local99;
		}
		if (this.anInt2096 != 0) {
			local81 = -this.anInt2096 & 0x3FFF;
			local85 = Class14_Sub3_Sub34.anIntArray547[local81];
			local89 = Class14_Sub3_Sub34.anIntArray546[local81];
			local99 = local36 * local85 + local32 * local89 >> 15;
			local36 = local36 * local89 - local32 * local85 >> 15;
			local32 = local99;
		}
		arg0.method5121(1.0F);
		arg0.method5180(16777215, 1.0F, 1.0F, (float) local32, (float) local34, (float) local36);
		@Pc(172) Class45 local172 = arg0.method5148(local6, 1024, 0, 64, 768);
		local85 = local172.method1792() - local172.method1777();
		local89 = local172.method1815() - local172.method1781();
		local99 = local172.method1777() + local85 / 2;
		@Pc(198) int local198 = local172.method1781() + local89 / 2;
		@Pc(205) int local205 = local85 > local89 ? local85 : local89;
		arg0.method5178(local99, local198, local205, local205);
		arg0.method5144(arg0.method5185());
		@Pc(218) Class51 local218 = arg0.method5145();
		local218.method3548(0, 0, arg0.method5114() - local172.method1798());
		local172.method1799(local218, null, arg0.method5114());
		this.aClass2_9 = arg0.method5182(0, 0, this.anInt2093, this.anInt2093, true);
		this.aClass2_9.method2633(3);
		arg0.method5172(Static87.anIntArray192[0], Static87.anIntArray192[1], Static87.anIntArray192[2], Static87.anIntArray192[3]);
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIII)Z")
	public boolean method2106(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		@Pc(17) int local17;
		if (this.aBoolean147) {
			this.anInt2095 = 1073741823;
			local7 = this.anInt2102;
			local12 = this.anInt2103;
			local17 = this.anInt2101;
		} else {
			local7 = this.anInt2102 - arg0;
			local12 = this.anInt2103 - arg1;
			local17 = this.anInt2101 - arg2;
			this.anInt2095 = (int) Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17));
			if (this.anInt2095 == 0) {
				this.anInt2095 = 1;
			}
			local7 = (local7 << 8) / this.anInt2095;
			local12 = (local12 << 8) / this.anInt2095;
			local17 = (local17 << 8) / this.anInt2095;
		}
		@Pc(90) int local90 = (int) (Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17)) * 256.0D);
		if (local90 > 128) {
			local7 = (local7 << 16) / local90;
			local12 = (local12 << 16) / local90;
			local17 = (local17 << 16) / local90;
			this.anInt2094 = this.anInt2092 * arg3 / (this.aBoolean147 ? 1024 : this.anInt2095);
		} else {
			this.anInt2094 = 0;
		}
		if (this.anInt2094 < 8) {
			this.aClass2_9 = null;
			return false;
		}
		@Pc(143) int local143 = Static224.method4011(this.anInt2094);
		if (local143 > arg3) {
			local143 = Static159.method3097(arg3);
		}
		if (local143 > 512) {
			local143 = 512;
		}
		if (local143 != this.anInt2093) {
			this.anInt2093 = local143;
		}
		this.anInt2098 = (int) (Math.asin((double) ((float) local12 / 256.0F)) * 5215.189175235227D) & 0x3FFF;
		this.anInt2096 = (int) (Math.atan2((double) local7, (double) -local17) * 5215.189175235227D) & 0x3FFF;
		this.aClass2_9 = null;
		return true;
	}
}

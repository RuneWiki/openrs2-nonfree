import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gw")
public final class Class128 {

	@OriginalMember(owner = "client!gw", name = "c", descriptor = "I")
	public int anInt3215;

	@OriginalMember(owner = "client!gw", name = "d", descriptor = "I")
	public int anInt3216;

	@OriginalMember(owner = "client!gw", name = "f", descriptor = "I")
	public int anInt3217;

	@OriginalMember(owner = "client!gw", name = "k", descriptor = "I")
	public int anInt3218;

	@OriginalMember(owner = "client!gw", name = "b", descriptor = "Z")
	public boolean aBoolean249 = false;

	@OriginalMember(owner = "client!gw", name = "h", descriptor = "Z")
	public boolean aBoolean251 = false;

	@OriginalMember(owner = "client!gw", name = "g", descriptor = "Z")
	public boolean aBoolean250 = false;

	@OriginalMember(owner = "client!gw", name = "j", descriptor = "Z")
	private boolean aBoolean252 = false;

	@OriginalMember(owner = "client!gw", name = "q", descriptor = "Z")
	public boolean aBoolean254 = true;

	@OriginalMember(owner = "client!gw", name = "o", descriptor = "[I")
	public final int[] anIntArray190 = new int[4096];

	@OriginalMember(owner = "client!gw", name = "m", descriptor = "I")
	public int anInt3219 = 0;

	@OriginalMember(owner = "client!gw", name = "n", descriptor = "Z")
	private boolean aBoolean253 = false;

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "Z")
	private boolean aBoolean248 = false;

	@OriginalMember(owner = "client!gw", name = "e", descriptor = "Lclient!rfa;")
	private final Class12_Sub3 aClass12_Sub3_7;

	@OriginalMember(owner = "client!gw", name = "l", descriptor = "Lclient!mm;")
	private final Class216 aClass216_1;

	@OriginalMember(owner = "client!gw", name = "p", descriptor = "I")
	private final int anInt3220;

	@OriginalMember(owner = "client!gw", name = "r", descriptor = "[I")
	private final int[] anIntArray191;

	@OriginalMember(owner = "client!gw", name = "i", descriptor = "[I")
	private final int[] anIntArray189;

	@OriginalMember(owner = "client!gw", name = "<init>", descriptor = "(Lclient!rfa;Lclient!mm;)V")
	public Class128(@OriginalArg(0) Class12_Sub3 arg0, @OriginalArg(1) Class216 arg1) {
		this.aClass12_Sub3_7 = arg0;
		this.aClass216_1 = arg1;
		this.anInt3220 = this.aClass12_Sub3_7.anInt7796;
		this.anIntArray191 = this.aClass12_Sub3_7.anIntArray519;
		this.anIntArray189 = this.aClass12_Sub3_7.anIntArray518;
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "([I[IIIIIIIIIIIIIFFFFFF)V")
	private void method2719(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int arg8, @OriginalArg(11) int arg9, @OriginalArg(12) int arg10, @OriginalArg(13) int arg11, @OriginalArg(14) float arg12, @OriginalArg(15) float arg13, @OriginalArg(16) float arg14, @OriginalArg(17) float arg15, @OriginalArg(18) float arg16, @OriginalArg(19) float arg17) {
		if (this.aBoolean250) {
			if (arg4 > this.anInt3217) {
				arg4 = this.anInt3217;
			}
			if (arg3 < 0) {
				arg3 = 0;
			}
		}
		if (arg3 >= arg4) {
			return;
		}
		arg2 += arg3;
		arg7 += arg8 * arg3;
		arg10 += arg11 * arg3;
		arg5 += arg6 * arg3;
		@Pc(43) int local43 = arg4 - arg3;
		@Pc(47) int local47 = arg8 << 3;
		@Pc(51) int local51 = arg7 >> 16;
		@Pc(55) int local55 = 255 - local51;
		@Pc(73) int local73 = ((arg9 & 0xFF00FF) * local51 & 0xFF00FF00 | (arg9 & 0xFF00) * local51 & 0xFF0000) >>> 8;
		@Pc(198) int local198;
		@Pc(186) int local186;
		@Pc(119) int local119;
		@Pc(126) int local126;
		@Pc(154) int local154;
		@Pc(161) int local161;
		@Pc(81) int local81;
		@Pc(219) int local219;
		@Pc(172) int local172;
		@Pc(273) int local273;
		@Pc(272) int local272;
		@Pc(194) int local194;
		@Pc(90) float local90;
		@Pc(99) float local99;
		@Pc(108) float local108;
		if (!this.aBoolean253) {
			local81 = arg3 - this.anInt3215;
			local90 = arg12 + arg15 / 8.0F * (float) local81;
			local99 = arg13 + arg16 / 8.0F * (float) local81;
			local108 = arg14 + arg17 / 8.0F * (float) local81;
			if (local108 == 0.0F) {
				local119 = 0;
				local126 = 0;
			} else {
				local119 = (int) (local90 * 16384.0F / local108);
				local126 = (int) (local99 * 16384.0F / local108);
			}
			arg12 = local90 + arg15;
			arg13 = local99 + arg16;
			arg14 = local108 + arg17;
			if (arg14 == 0.0F) {
				local154 = 0;
				local161 = 0;
			} else {
				local154 = (int) (arg12 * 16384.0F / arg14);
				local161 = (int) (arg13 * 16384.0F / arg14);
			}
			local172 = (local119 << 18) + local126;
			local186 = (local154 - local119 >> 3 << 18) + (local161 - local126 >> 3);
			local43 >>= 0x3;
			local194 = arg11 << 3;
			local198 = arg10 >> 8;
			if (this.aBoolean248) {
				if (local43 > 0) {
					do {
						if (arg5 < this.anIntArray189[arg2]) {
							local219 = arg1[(local172 & 0x3F80) + (local172 >>> 25)];
							@Pc(1868) int local1868 = ((local219 & 0xFF00FF) * local198 & 0xFF00FF00) + ((local219 & 0xFF00) * local198 & 0xFF0000) >> 8;
							arg0[arg2] = (((local1868 & 0xFF00FF) * local55 & 0xFF00FF00 | (local1868 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
							this.anIntArray189[arg2] = arg5;
						}
						local172 += local186;
						local273 = arg2 + 1;
						local272 = arg5 + arg6;
						if (local272 < this.anIntArray189[local273]) {
							local219 = arg1[(local172 & 0x3F80) + (local172 >>> 25)];
							local219 = ((local219 & 0xFF00FF) * local198 & 0xFF00FF00) + ((local219 & 0xFF00) * local198 & 0xFF0000) >> 8;
							arg0[local273] = (((local219 & 0xFF00FF) * local55 & 0xFF00FF00 | (local219 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
							this.anIntArray189[local273] = local272;
						}
						local172 += local186;
						local273++;
						local272 += arg6;
						if (local272 < this.anIntArray189[local273]) {
							local219 = arg1[(local172 & 0x3F80) + (local172 >>> 25)];
							local219 = ((local219 & 0xFF00FF) * local198 & 0xFF00FF00) + ((local219 & 0xFF00) * local198 & 0xFF0000) >> 8;
							arg0[local273] = (((local219 & 0xFF00FF) * local55 & 0xFF00FF00 | (local219 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
							this.anIntArray189[local273] = local272;
						}
						local172 += local186;
						local273++;
						local272 += arg6;
						if (local272 < this.anIntArray189[local273]) {
							local219 = arg1[(local172 & 0x3F80) + (local172 >>> 25)];
							local219 = ((local219 & 0xFF00FF) * local198 & 0xFF00FF00) + ((local219 & 0xFF00) * local198 & 0xFF0000) >> 8;
							arg0[local273] = (((local219 & 0xFF00FF) * local55 & 0xFF00FF00 | (local219 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
							this.anIntArray189[local273] = local272;
						}
						local172 += local186;
						local273++;
						local272 += arg6;
						if (local272 < this.anIntArray189[local273]) {
							local219 = arg1[(local172 & 0x3F80) + (local172 >>> 25)];
							local219 = ((local219 & 0xFF00FF) * local198 & 0xFF00FF00) + ((local219 & 0xFF00) * local198 & 0xFF0000) >> 8;
							arg0[local273] = (((local219 & 0xFF00FF) * local55 & 0xFF00FF00 | (local219 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
							this.anIntArray189[local273] = local272;
						}
						local172 += local186;
						local273++;
						local272 += arg6;
						if (local272 < this.anIntArray189[local273]) {
							local219 = arg1[(local172 & 0x3F80) + (local172 >>> 25)];
							local219 = ((local219 & 0xFF00FF) * local198 & 0xFF00FF00) + ((local219 & 0xFF00) * local198 & 0xFF0000) >> 8;
							arg0[local273] = (((local219 & 0xFF00FF) * local55 & 0xFF00FF00 | (local219 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
							this.anIntArray189[local273] = local272;
						}
						local172 += local186;
						local273++;
						local272 += arg6;
						if (local272 < this.anIntArray189[local273]) {
							local219 = arg1[(local172 & 0x3F80) + (local172 >>> 25)];
							local219 = ((local219 & 0xFF00FF) * local198 & 0xFF00FF00) + ((local219 & 0xFF00) * local198 & 0xFF0000) >> 8;
							arg0[local273] = (((local219 & 0xFF00FF) * local55 & 0xFF00FF00 | (local219 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
							this.anIntArray189[local273] = local272;
						}
						local172 += local186;
						local273++;
						local272 += arg6;
						if (local272 < this.anIntArray189[local273]) {
							local219 = arg1[(local172 & 0x3F80) + (local172 >>> 25)];
							local219 = ((local219 & 0xFF00FF) * local198 & 0xFF00FF00) + ((local219 & 0xFF00) * local198 & 0xFF0000) >> 8;
							arg0[local273] = (((local219 & 0xFF00FF) * local55 & 0xFF00FF00 | (local219 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
							this.anIntArray189[local273] = local272;
						}
						arg2 = local273 + 1;
						arg5 = local272 + arg6;
						local119 = local154;
						local126 = local161;
						arg12 += arg15;
						arg13 += arg16;
						arg14 += arg17;
						if (arg14 == 0.0F) {
							local154 = 0;
							local161 = 0;
						} else {
							local154 = (int) (arg12 * 16384.0F / arg14);
							local161 = (int) (arg13 * 16384.0F / arg14);
						}
						local172 = (local119 << 18) + local126;
						local186 = (local154 - local119 >> 3 << 18) + (local161 - local126 >> 3);
						arg10 += local194;
						local198 = arg10 >> 8;
						arg7 += local47;
						local51 = arg7 >> 16;
						local55 = 255 - local51;
						local73 = ((arg9 & 0xFF00FF) * local51 & 0xFF00FF00 | (arg9 & 0xFF00) * local51 & 0xFF0000) >>> 8;
						local43--;
					} while (local43 > 0);
				}
				local43 = arg4 - arg3 & 0x7;
				if (local43 > 0) {
					do {
						if (arg5 < this.anIntArray189[arg2]) {
							local219 = arg1[(local172 & 0x3F80) + (local172 >>> 25)];
							local219 = ((local219 & 0xFF00FF) * local198 & 0xFF00FF00) + ((local219 & 0xFF00) * local198 & 0xFF0000) >> 8;
							arg0[arg2] = (((local219 & 0xFF00FF) * local55 & 0xFF00FF00 | (local219 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
							this.anIntArray189[arg2] = arg5;
						}
						local172 += local186;
						arg2++;
						arg5 += arg6;
						local43--;
					} while (local43 > 0);
					return;
				}
			} else {
				if (local43 > 0) {
					do {
						@Pc(2595) int local2595;
						if (arg5 < this.anIntArray189[arg2] && (local2595 = arg1[(local172 & 0x3F80) + (local172 >>> 25)]) != 0) {
							local219 = ((local2595 & 0xFF00FF) * local198 & 0xFF00FF00) + ((local2595 & 0xFF00) * local198 & 0xFF0000) >> 8;
							arg0[arg2] = (((local219 & 0xFF00FF) * local55 & 0xFF00FF00 | (local219 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
							this.anIntArray189[arg2] = arg5;
						}
						local273 = arg2 + 1;
						local172 += local186;
						local272 = arg5 + arg6;
						@Pc(2667) int local2667;
						if (local272 < this.anIntArray189[local273] && (local2667 = arg1[(local172 & 0x3F80) + (local172 >>> 25)]) != 0) {
							local219 = ((local2667 & 0xFF00FF) * local198 & 0xFF00FF00) + ((local2667 & 0xFF00) * local198 & 0xFF0000) >> 8;
							arg0[local273] = (((local219 & 0xFF00FF) * local55 & 0xFF00FF00 | (local219 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
							this.anIntArray189[local273] = local272;
						}
						local273++;
						local172 += local186;
						local272 += arg6;
						@Pc(2739) int local2739;
						if (local272 < this.anIntArray189[local273] && (local2739 = arg1[(local172 & 0x3F80) + (local172 >>> 25)]) != 0) {
							local219 = ((local2739 & 0xFF00FF) * local198 & 0xFF00FF00) + ((local2739 & 0xFF00) * local198 & 0xFF0000) >> 8;
							arg0[local273] = (((local219 & 0xFF00FF) * local55 & 0xFF00FF00 | (local219 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
							this.anIntArray189[local273] = local272;
						}
						local273++;
						local172 += local186;
						local272 += arg6;
						@Pc(2811) int local2811;
						if (local272 < this.anIntArray189[local273] && (local2811 = arg1[(local172 & 0x3F80) + (local172 >>> 25)]) != 0) {
							local219 = ((local2811 & 0xFF00FF) * local198 & 0xFF00FF00) + ((local2811 & 0xFF00) * local198 & 0xFF0000) >> 8;
							arg0[local273] = (((local219 & 0xFF00FF) * local55 & 0xFF00FF00 | (local219 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
							this.anIntArray189[local273] = local272;
						}
						local273++;
						local172 += local186;
						local272 += arg6;
						@Pc(2883) int local2883;
						if (local272 < this.anIntArray189[local273] && (local2883 = arg1[(local172 & 0x3F80) + (local172 >>> 25)]) != 0) {
							local219 = ((local2883 & 0xFF00FF) * local198 & 0xFF00FF00) + ((local2883 & 0xFF00) * local198 & 0xFF0000) >> 8;
							arg0[local273] = (((local219 & 0xFF00FF) * local55 & 0xFF00FF00 | (local219 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
							this.anIntArray189[local273] = local272;
						}
						local273++;
						local172 += local186;
						local272 += arg6;
						@Pc(2955) int local2955;
						if (local272 < this.anIntArray189[local273] && (local2955 = arg1[(local172 & 0x3F80) + (local172 >>> 25)]) != 0) {
							local219 = ((local2955 & 0xFF00FF) * local198 & 0xFF00FF00) + ((local2955 & 0xFF00) * local198 & 0xFF0000) >> 8;
							arg0[local273] = (((local219 & 0xFF00FF) * local55 & 0xFF00FF00 | (local219 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
							this.anIntArray189[local273] = local272;
						}
						local273++;
						local172 += local186;
						local272 += arg6;
						@Pc(3027) int local3027;
						if (local272 < this.anIntArray189[local273] && (local3027 = arg1[(local172 & 0x3F80) + (local172 >>> 25)]) != 0) {
							local219 = ((local3027 & 0xFF00FF) * local198 & 0xFF00FF00) + ((local3027 & 0xFF00) * local198 & 0xFF0000) >> 8;
							arg0[local273] = (((local219 & 0xFF00FF) * local55 & 0xFF00FF00 | (local219 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
							this.anIntArray189[local273] = local272;
						}
						local273++;
						local172 += local186;
						local272 += arg6;
						@Pc(3099) int local3099;
						if (local272 < this.anIntArray189[local273] && (local3099 = arg1[(local172 & 0x3F80) + (local172 >>> 25)]) != 0) {
							local219 = ((local3099 & 0xFF00FF) * local198 & 0xFF00FF00) + ((local3099 & 0xFF00) * local198 & 0xFF0000) >> 8;
							arg0[local273] = (((local219 & 0xFF00FF) * local55 & 0xFF00FF00 | (local219 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
							this.anIntArray189[local273] = local272;
						}
						arg2 = local273 + 1;
						arg5 = local272 + arg6;
						local119 = local154;
						local126 = local161;
						arg12 += arg15;
						arg13 += arg16;
						arg14 += arg17;
						if (arg14 == 0.0F) {
							local154 = 0;
							local161 = 0;
						} else {
							local154 = (int) (arg12 / arg14 * 16384.0F);
							local161 = (int) (arg13 / arg14 * 16384.0F);
						}
						local172 = (local119 << 18) + local126;
						local186 = (local154 - local119 >> 3 << 18) + (local161 - local126 >> 3);
						arg10 += local194;
						local198 = arg10 >> 8;
						arg7 += local47;
						local51 = arg7 >> 16;
						local55 = 255 - local51;
						local73 = ((arg9 & 0xFF00FF) * local51 & 0xFF00FF00 | (arg9 & 0xFF00) * local51 & 0xFF0000) >>> 8;
						local43--;
					} while (local43 > 0);
				}
				local43 = arg4 - arg3 & 0x7;
				if (local43 > 0) {
					do {
						@Pc(3279) int local3279;
						if (arg5 < this.anIntArray189[arg2] && (local3279 = arg1[(local172 & 0x3F80) + (local172 >>> 25)]) != 0) {
							local219 = ((local3279 & 0xFF00FF) * local198 & 0xFF00FF00) + ((local3279 & 0xFF00) * local198 & 0xFF0000) >> 8;
							arg0[arg2] = (((local219 & 0xFF00FF) * local55 & 0xFF00FF00 | (local219 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
							this.anIntArray189[arg2] = arg5;
						}
						arg2++;
						local172 += local186;
						arg5 += arg6;
						local43--;
					} while (local43 > 0);
				}
			}
			return;
		}
		local81 = arg3 - this.anInt3215;
		local90 = arg12 + arg15 / 8.0F * (float) local81;
		local99 = arg13 + arg16 / 8.0F * (float) local81;
		local108 = arg14 + arg17 / 8.0F * (float) local81;
		if (local108 == 0.0F) {
			local119 = 0;
			local126 = 0;
		} else {
			local119 = (int) (local90 * 4096.0F / local108);
			local126 = (int) (local99 * 4096.0F / local108);
		}
		arg12 = local90 + arg15;
		arg13 = local99 + arg16;
		arg14 = local108 + arg17;
		if (arg14 == 0.0F) {
			local154 = 0;
			local161 = 0;
		} else {
			local154 = (int) (arg12 * 4096.0F / arg14);
			local161 = (int) (arg13 * 4096.0F / arg14);
		}
		local172 = (local119 << 20) + local126;
		local186 = (local154 - local119 >> 3 << 20) + (local161 - local126 >> 3);
		local43 >>= 0x3;
		local194 = arg11 << 3;
		local198 = arg10 >> 8;
		if (this.aBoolean248) {
			if (local43 > 0) {
				do {
					if (arg5 < this.anIntArray189[arg2]) {
						local219 = arg1[(local172 & 0xFC0) + (local172 >>> 26)];
						local219 = ((local219 & 0xFF00FF) * local198 & 0xFF00FF00) + ((local219 & 0xFF00) * local198 & 0xFF0000) >> 8;
						arg0[arg2] = (((local219 & 0xFF00FF) * local55 & 0xFF00FF00 | (local219 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
						this.anIntArray189[arg2] = arg5;
					}
					local172 += local186;
					local272 = arg5 + arg6;
					local273 = arg2 + 1;
					if (local272 < this.anIntArray189[local273]) {
						local219 = arg1[(local172 & 0xFC0) + (local172 >>> 26)];
						local219 = ((local219 & 0xFF00FF) * local198 & 0xFF00FF00) + ((local219 & 0xFF00) * local198 & 0xFF0000) >> 8;
						arg0[local273] = (((local219 & 0xFF00FF) * local55 & 0xFF00FF00 | (local219 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
						this.anIntArray189[local273] = local272;
					}
					local172 += local186;
					local272 += arg6;
					local273++;
					if (local272 < this.anIntArray189[local273]) {
						local219 = arg1[(local172 & 0xFC0) + (local172 >>> 26)];
						local219 = ((local219 & 0xFF00FF) * local198 & 0xFF00FF00) + ((local219 & 0xFF00) * local198 & 0xFF0000) >> 8;
						arg0[local273] = (((local219 & 0xFF00FF) * local55 & 0xFF00FF00 | (local219 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
						this.anIntArray189[local273] = local272;
					}
					local172 += local186;
					local272 += arg6;
					local273++;
					if (local272 < this.anIntArray189[local273]) {
						local219 = arg1[(local172 & 0xFC0) + (local172 >>> 26)];
						local219 = ((local219 & 0xFF00FF) * local198 & 0xFF00FF00) + ((local219 & 0xFF00) * local198 & 0xFF0000) >> 8;
						arg0[local273] = (((local219 & 0xFF00FF) * local55 & 0xFF00FF00 | (local219 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
						this.anIntArray189[local273] = local272;
					}
					local172 += local186;
					local272 += arg6;
					local273++;
					if (local272 < this.anIntArray189[local273]) {
						local219 = arg1[(local172 & 0xFC0) + (local172 >>> 26)];
						local219 = ((local219 & 0xFF00FF) * local198 & 0xFF00FF00) + ((local219 & 0xFF00) * local198 & 0xFF0000) >> 8;
						arg0[local273] = (((local219 & 0xFF00FF) * local55 & 0xFF00FF00 | (local219 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
						this.anIntArray189[local273] = local272;
					}
					local172 += local186;
					local272 += arg6;
					local273++;
					if (local272 < this.anIntArray189[local273]) {
						local219 = arg1[(local172 & 0xFC0) + (local172 >>> 26)];
						local219 = ((local219 & 0xFF00FF) * local198 & 0xFF00FF00) + ((local219 & 0xFF00) * local198 & 0xFF0000) >> 8;
						arg0[local273] = (((local219 & 0xFF00FF) * local55 & 0xFF00FF00 | (local219 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
						this.anIntArray189[local273] = local272;
					}
					local172 += local186;
					local272 += arg6;
					local273++;
					if (local272 < this.anIntArray189[local273]) {
						local219 = arg1[(local172 & 0xFC0) + (local172 >>> 26)];
						local219 = ((local219 & 0xFF00FF) * local198 & 0xFF00FF00) + ((local219 & 0xFF00) * local198 & 0xFF0000) >> 8;
						arg0[local273] = (((local219 & 0xFF00FF) * local55 & 0xFF00FF00 | (local219 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
						this.anIntArray189[local273] = local272;
					}
					local172 += local186;
					local272 += arg6;
					local273++;
					if (local272 < this.anIntArray189[local273]) {
						local219 = arg1[(local172 & 0xFC0) + (local172 >>> 26)];
						local219 = ((local219 & 0xFF00FF) * local198 & 0xFF00FF00) + ((local219 & 0xFF00) * local198 & 0xFF0000) >> 8;
						arg0[local273] = (((local219 & 0xFF00FF) * local55 & 0xFF00FF00 | (local219 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
						this.anIntArray189[local273] = local272;
					}
					arg5 = local272 + arg6;
					arg2 = local273 + 1;
					local119 = local154;
					local126 = local161;
					arg12 += arg15;
					arg13 += arg16;
					arg14 += arg17;
					if (arg14 == 0.0F) {
						local154 = 0;
						local161 = 0;
					} else {
						local154 = (int) (arg12 * 4096.0F / arg14);
						local161 = (int) (arg13 * 4096.0F / arg14);
					}
					local172 = (local119 << 20) + local126;
					local186 = (local154 - local119 >> 3 << 20) + (local161 - local126 >> 3);
					arg10 += local194;
					local198 = arg10 >> 8;
					arg7 += local47;
					local51 = arg7 >> 16;
					local55 = 255 - local51;
					local73 = ((arg9 & 0xFF00FF) * local51 & 0xFF00FF00 | (arg9 & 0xFF00) * local51 & 0xFF0000) >>> 8;
					local43--;
				} while (local43 > 0);
			}
			local43 = arg4 - arg3 & 0x7;
			if (local43 > 0) {
				do {
					if (arg5 < this.anIntArray189[arg2]) {
						local219 = arg1[(local172 & 0xFC0) + (local172 >>> 26)];
						local219 = ((local219 & 0xFF00FF) * local198 & 0xFF00FF00) + ((local219 & 0xFF00) * local198 & 0xFF0000) >> 8;
						arg0[arg2] = (((local219 & 0xFF00FF) * local55 & 0xFF00FF00 | (local219 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
						this.anIntArray189[arg2] = arg5;
					}
					local172 += local186;
					arg5 += arg6;
					arg2++;
					local43--;
				} while (local43 > 0);
				return;
			}
		} else {
			if (local43 > 0) {
				do {
					@Pc(964) int local964;
					if (arg5 < this.anIntArray189[arg2] && (local964 = arg1[(local172 & 0xFC0) + (local172 >>> 26)]) != 0) {
						local219 = ((local964 & 0xFF00FF) * local198 & 0xFF00FF00) + ((local964 & 0xFF00) * local198 & 0xFF0000) >> 8;
						arg0[arg2] = (((local219 & 0xFF00FF) * local55 & 0xFF00FF00 | (local219 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
						this.anIntArray189[arg2] = arg5;
					}
					local273 = arg2 + 1;
					local172 += local186;
					local272 = arg5 + arg6;
					@Pc(1036) int local1036;
					if (local272 < this.anIntArray189[local273] && (local1036 = arg1[(local172 & 0xFC0) + (local172 >>> 26)]) != 0) {
						local219 = ((local1036 & 0xFF00FF) * local198 & 0xFF00FF00) + ((local1036 & 0xFF00) * local198 & 0xFF0000) >> 8;
						arg0[local273] = (((local219 & 0xFF00FF) * local55 & 0xFF00FF00 | (local219 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
						this.anIntArray189[local273] = local272;
					}
					local273++;
					local172 += local186;
					local272 += arg6;
					@Pc(1108) int local1108;
					if (local272 < this.anIntArray189[local273] && (local1108 = arg1[(local172 & 0xFC0) + (local172 >>> 26)]) != 0) {
						local219 = ((local1108 & 0xFF00FF) * local198 & 0xFF00FF00) + ((local1108 & 0xFF00) * local198 & 0xFF0000) >> 8;
						arg0[local273] = (((local219 & 0xFF00FF) * local55 & 0xFF00FF00 | (local219 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
						this.anIntArray189[local273] = local272;
					}
					local273++;
					local172 += local186;
					local272 += arg6;
					@Pc(1180) int local1180;
					if (local272 < this.anIntArray189[local273] && (local1180 = arg1[(local172 & 0xFC0) + (local172 >>> 26)]) != 0) {
						local219 = ((local1180 & 0xFF00FF) * local198 & 0xFF00FF00) + ((local1180 & 0xFF00) * local198 & 0xFF0000) >> 8;
						arg0[local273] = (((local219 & 0xFF00FF) * local55 & 0xFF00FF00 | (local219 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
						this.anIntArray189[local273] = local272;
					}
					local273++;
					local172 += local186;
					local272 += arg6;
					@Pc(1252) int local1252;
					if (local272 < this.anIntArray189[local273] && (local1252 = arg1[(local172 & 0xFC0) + (local172 >>> 26)]) != 0) {
						local219 = ((local1252 & 0xFF00FF) * local198 & 0xFF00FF00) + ((local1252 & 0xFF00) * local198 & 0xFF0000) >> 8;
						arg0[local273] = (((local219 & 0xFF00FF) * local55 & 0xFF00FF00 | (local219 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
						this.anIntArray189[local273] = local272;
					}
					local273++;
					local172 += local186;
					local272 += arg6;
					@Pc(1324) int local1324;
					if (local272 < this.anIntArray189[local273] && (local1324 = arg1[(local172 & 0xFC0) + (local172 >>> 26)]) != 0) {
						local219 = ((local1324 & 0xFF00FF) * local198 & 0xFF00FF00) + ((local1324 & 0xFF00) * local198 & 0xFF0000) >> 8;
						arg0[local273] = (((local219 & 0xFF00FF) * local55 & 0xFF00FF00 | (local219 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
						this.anIntArray189[local273] = local272;
					}
					local273++;
					local172 += local186;
					local272 += arg6;
					@Pc(1396) int local1396;
					if (local272 < this.anIntArray189[local273] && (local1396 = arg1[(local172 & 0xFC0) + (local172 >>> 26)]) != 0) {
						local219 = ((local1396 & 0xFF00FF) * local198 & 0xFF00FF00) + ((local1396 & 0xFF00) * local198 & 0xFF0000) >> 8;
						arg0[local273] = (((local219 & 0xFF00FF) * local55 & 0xFF00FF00 | (local219 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
						this.anIntArray189[local273] = local272;
					}
					local273++;
					local172 += local186;
					local272 += arg6;
					@Pc(1468) int local1468;
					if (local272 < this.anIntArray189[local273] && (local1468 = arg1[(local172 & 0xFC0) + (local172 >>> 26)]) != 0) {
						local219 = ((local1468 & 0xFF00FF) * local198 & 0xFF00FF00) + ((local1468 & 0xFF00) * local198 & 0xFF0000) >> 8;
						arg0[local273] = (((local219 & 0xFF00FF) * local55 & 0xFF00FF00 | (local219 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
						this.anIntArray189[local273] = local272;
					}
					arg2 = local273 + 1;
					arg5 = local272 + arg6;
					local119 = local154;
					local126 = local161;
					arg12 += arg15;
					arg13 += arg16;
					arg14 += arg17;
					if (arg14 == 0.0F) {
						local154 = 0;
						local161 = 0;
					} else {
						local154 = (int) (arg12 * 4096.0F / arg14);
						local161 = (int) (arg13 * 4096.0F / arg14);
					}
					local172 = (local119 << 20) + local126;
					local186 = (local154 - local119 >> 3 << 20) + (local161 - local126 >> 3);
					arg10 += local194;
					local198 = arg10 >> 8;
					arg7 += local47;
					local51 = arg7 >> 16;
					local55 = 255 - local51;
					local73 = ((arg9 & 0xFF00FF) * local51 & 0xFF00FF00 | (arg9 & 0xFF00) * local51 & 0xFF0000) >>> 8;
					local43--;
				} while (local43 > 0);
			}
			local43 = arg4 - arg3 & 0x7;
			if (local43 <= 0) {
				return;
			}
			do {
				@Pc(1648) int local1648;
				if (arg5 < this.anIntArray189[arg2] && (local1648 = arg1[(local172 & 0xFC0) + (local172 >>> 26)]) != 0) {
					local219 = ((local1648 & 0xFF00FF) * local198 & 0xFF00FF00) + ((local1648 & 0xFF00) * local198 & 0xFF0000) >> 8;
					arg0[arg2] = (((local219 & 0xFF00FF) * local55 & 0xFF00FF00 | (local219 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
					this.anIntArray189[arg2] = arg5;
				}
				arg2++;
				local172 += local186;
				arg5 += arg6;
				local43--;
			} while (local43 > 0);
		}
		return;
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(Z)V")
	public void method2720(@OriginalArg(0) boolean arg0) {
		this.aBoolean252 = arg0;
	}

	@OriginalMember(owner = "client!gw", name = "b", descriptor = "([I[IIIIIIIIIIIIIFFFFFF)V")
	private void method2721(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int arg8, @OriginalArg(11) int arg9, @OriginalArg(12) int arg10, @OriginalArg(13) int arg11, @OriginalArg(14) float arg12, @OriginalArg(15) float arg13, @OriginalArg(16) float arg14, @OriginalArg(17) float arg15, @OriginalArg(18) float arg16, @OriginalArg(19) float arg17) {
		if (this.aBoolean250) {
			if (arg4 > this.anInt3217) {
				arg4 = this.anInt3217;
			}
			if (arg3 < 0) {
				arg3 = 0;
			}
		}
		if (arg3 >= arg4) {
			return;
		}
		arg2 += arg3;
		arg7 += arg8 * arg3;
		arg10 += arg11 * arg3;
		arg5 += arg6 * arg3;
		@Pc(43) int local43 = arg4 - arg3;
		@Pc(47) int local47 = arg8 << 3;
		@Pc(51) int local51 = arg7 >> 16;
		@Pc(55) int local55 = 255 - local51;
		@Pc(73) int local73 = ((arg9 & 0xFF00FF) * local51 & 0xFF00FF00 | (arg9 & 0xFF00) * local51 & 0xFF0000) >>> 8;
		@Pc(76) int local76 = this.anInt3219;
		@Pc(81) int local81 = 256 - this.anInt3219;
		@Pc(206) int local206;
		@Pc(194) int local194;
		@Pc(127) int local127;
		@Pc(134) int local134;
		@Pc(162) int local162;
		@Pc(169) int local169;
		@Pc(221) int local221;
		@Pc(89) int local89;
		@Pc(231) int local231;
		@Pc(180) int local180;
		@Pc(311) int local311;
		@Pc(315) int local315;
		@Pc(202) int local202;
		@Pc(98) float local98;
		@Pc(107) float local107;
		@Pc(116) float local116;
		if (!this.aBoolean253) {
			local89 = arg3 - this.anInt3215;
			local98 = arg12 + arg15 / 8.0F * (float) local89;
			local107 = arg13 + arg16 / 8.0F * (float) local89;
			local116 = arg14 + arg17 / 8.0F * (float) local89;
			if (local116 == 0.0F) {
				local127 = 0;
				local134 = 0;
			} else {
				local127 = (int) (local98 * 16384.0F / local116);
				local134 = (int) (local107 * 16384.0F / local116);
			}
			arg12 = local98 + arg15;
			arg13 = local107 + arg16;
			arg14 = local116 + arg17;
			if (arg14 == 0.0F) {
				local162 = 0;
				local169 = 0;
			} else {
				local162 = (int) (arg12 * 16384.0F / arg14);
				local169 = (int) (arg13 * 16384.0F / arg14);
			}
			local180 = (local127 << 18) + local134;
			local194 = (local162 - local127 >> 3 << 18) + (local169 - local134 >> 3);
			local43 >>= 0x3;
			local202 = arg11 << 3;
			local206 = arg10 >> 8;
			if (this.aBoolean248) {
				if (local43 > 0) {
					do {
						if (arg5 < this.anIntArray189[arg2]) {
							local231 = arg1[(local180 & 0x3F80) + (local180 >>> 25)];
							local221 = arg0[arg2];
							@Pc(2492) int local2492 = ((local231 & 0xFF00FF) * local206 & 0xFF00FF00) + ((local231 & 0xFF00) * local206 & 0xFF0000) >> 8;
							@Pc(2522) int local2522 = ((local221 & 0xFF00FF) * local76 + (local2492 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local221 & 0xFF00) * local76 + (local2492 & 0xFF00) * local81 & 0xFF0000) >> 8;
							arg0[arg2] = (((local2522 & 0xFF00FF) * local55 & 0xFF00FF00 | (local2522 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
							this.anIntArray189[arg2] = arg5;
						}
						local180 += local194;
						local311 = arg2 + 1;
						local315 = arg5 + arg6;
						if (local315 < this.anIntArray189[local311]) {
							local231 = arg1[(local180 & 0x3F80) + (local180 >>> 25)];
							local221 = arg0[local311];
							local231 = ((local231 & 0xFF00FF) * local206 & 0xFF00FF00) + ((local231 & 0xFF00) * local206 & 0xFF0000) >> 8;
							local231 = ((local221 & 0xFF00FF) * local76 + (local231 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local221 & 0xFF00) * local76 + (local231 & 0xFF00) * local81 & 0xFF0000) >> 8;
							arg0[local311] = (((local231 & 0xFF00FF) * local55 & 0xFF00FF00 | (local231 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
							this.anIntArray189[local311] = local315;
						}
						local180 += local194;
						local311++;
						local315 += arg6;
						if (local315 < this.anIntArray189[local311]) {
							local231 = arg1[(local180 & 0x3F80) + (local180 >>> 25)];
							local221 = arg0[local311];
							local231 = ((local231 & 0xFF00FF) * local206 & 0xFF00FF00) + ((local231 & 0xFF00) * local206 & 0xFF0000) >> 8;
							local231 = ((local221 & 0xFF00FF) * local76 + (local231 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local221 & 0xFF00) * local76 + (local231 & 0xFF00) * local81 & 0xFF0000) >> 8;
							arg0[local311] = (((local231 & 0xFF00FF) * local55 & 0xFF00FF00 | (local231 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
							this.anIntArray189[local311] = local315;
						}
						local180 += local194;
						local311++;
						local315 += arg6;
						if (local315 < this.anIntArray189[local311]) {
							local231 = arg1[(local180 & 0x3F80) + (local180 >>> 25)];
							local221 = arg0[local311];
							local231 = ((local231 & 0xFF00FF) * local206 & 0xFF00FF00) + ((local231 & 0xFF00) * local206 & 0xFF0000) >> 8;
							local231 = ((local221 & 0xFF00FF) * local76 + (local231 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local221 & 0xFF00) * local76 + (local231 & 0xFF00) * local81 & 0xFF0000) >> 8;
							arg0[local311] = (((local231 & 0xFF00FF) * local55 & 0xFF00FF00 | (local231 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
							this.anIntArray189[local311] = local315;
						}
						local180 += local194;
						local311++;
						local315 += arg6;
						if (local315 < this.anIntArray189[local311]) {
							local231 = arg1[(local180 & 0x3F80) + (local180 >>> 25)];
							local221 = arg0[local311];
							local231 = ((local231 & 0xFF00FF) * local206 & 0xFF00FF00) + ((local231 & 0xFF00) * local206 & 0xFF0000) >> 8;
							local231 = ((local221 & 0xFF00FF) * local76 + (local231 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local221 & 0xFF00) * local76 + (local231 & 0xFF00) * local81 & 0xFF0000) >> 8;
							arg0[local311] = (((local231 & 0xFF00FF) * local55 & 0xFF00FF00 | (local231 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
							this.anIntArray189[local311] = local315;
						}
						local180 += local194;
						local311++;
						local315 += arg6;
						if (local315 < this.anIntArray189[local311]) {
							local231 = arg1[(local180 & 0x3F80) + (local180 >>> 25)];
							local221 = arg0[local311];
							local231 = ((local231 & 0xFF00FF) * local206 & 0xFF00FF00) + ((local231 & 0xFF00) * local206 & 0xFF0000) >> 8;
							local231 = ((local221 & 0xFF00FF) * local76 + (local231 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local221 & 0xFF00) * local76 + (local231 & 0xFF00) * local81 & 0xFF0000) >> 8;
							arg0[local311] = (((local231 & 0xFF00FF) * local55 & 0xFF00FF00 | (local231 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
							this.anIntArray189[local311] = local315;
						}
						local180 += local194;
						local311++;
						local315 += arg6;
						if (local315 < this.anIntArray189[local311]) {
							local231 = arg1[(local180 & 0x3F80) + (local180 >>> 25)];
							local221 = arg0[local311];
							local231 = ((local231 & 0xFF00FF) * local206 & 0xFF00FF00) + ((local231 & 0xFF00) * local206 & 0xFF0000) >> 8;
							local231 = ((local221 & 0xFF00FF) * local76 + (local231 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local221 & 0xFF00) * local76 + (local231 & 0xFF00) * local81 & 0xFF0000) >> 8;
							arg0[local311] = (((local231 & 0xFF00FF) * local55 & 0xFF00FF00 | (local231 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
							this.anIntArray189[local311] = local315;
						}
						local180 += local194;
						local311++;
						local315 += arg6;
						if (local315 < this.anIntArray189[local311]) {
							local231 = arg1[(local180 & 0x3F80) + (local180 >>> 25)];
							local221 = arg0[local311];
							local231 = ((local231 & 0xFF00FF) * local206 & 0xFF00FF00) + ((local231 & 0xFF00) * local206 & 0xFF0000) >> 8;
							local231 = ((local221 & 0xFF00FF) * local76 + (local231 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local221 & 0xFF00) * local76 + (local231 & 0xFF00) * local81 & 0xFF0000) >> 8;
							arg0[local311] = (((local231 & 0xFF00FF) * local55 & 0xFF00FF00 | (local231 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
							this.anIntArray189[local311] = local315;
						}
						arg2 = local311 + 1;
						arg5 = local315 + arg6;
						local127 = local162;
						local134 = local169;
						arg12 += arg15;
						arg13 += arg16;
						arg14 += arg17;
						if (arg14 == 0.0F) {
							local162 = 0;
							local169 = 0;
						} else {
							local162 = (int) (arg12 * 16384.0F / arg14);
							local169 = (int) (arg13 * 16384.0F / arg14);
						}
						local180 = (local127 << 18) + local134;
						local194 = (local162 - local127 >> 3 << 18) + (local169 - local134 >> 3);
						arg10 += local202;
						local206 = arg10 >> 8;
						arg7 += local47;
						local51 = arg7 >> 16;
						local55 = 255 - local51;
						local73 = ((arg9 & 0xFF00FF) * local51 & 0xFF00FF00 | (arg9 & 0xFF00) * local51 & 0xFF0000) >>> 8;
						local43--;
					} while (local43 > 0);
				}
				local43 = arg4 - arg3 & 0x7;
				if (local43 > 0) {
					do {
						if (arg5 < this.anIntArray189[arg2]) {
							local231 = arg1[(local180 & 0x3F80) + (local180 >>> 25)];
							local221 = arg0[arg2];
							local231 = ((local231 & 0xFF00FF) * local206 & 0xFF00FF00) + ((local231 & 0xFF00) * local206 & 0xFF0000) >> 8;
							local231 = ((local221 & 0xFF00FF) * local76 + (local231 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local221 & 0xFF00) * local76 + (local231 & 0xFF00) * local81 & 0xFF0000) >> 8;
							arg0[arg2] = (((local231 & 0xFF00FF) * local55 & 0xFF00FF00 | (local231 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
							this.anIntArray189[arg2] = arg5;
						}
						local180 += local194;
						arg2++;
						arg5 += arg6;
						local43--;
					} while (local43 > 0);
					return;
				}
			} else {
				if (local43 > 0) {
					do {
						@Pc(3521) int local3521;
						if (arg5 < this.anIntArray189[arg2] && (local3521 = arg1[(local180 & 0x3F80) + (local180 >>> 25)]) != 0) {
							local221 = arg0[arg2];
							local231 = ((local3521 & 0xFF00FF) * local206 & 0xFF00FF00) + ((local3521 & 0xFF00) * local206 & 0xFF0000) >> 8;
							local231 = ((local221 & 0xFF00FF) * local76 + (local231 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local221 & 0xFF00) * local76 + (local231 & 0xFF00) * local81 & 0xFF0000) >> 8;
							arg0[arg2] = (((local231 & 0xFF00FF) * local55 & 0xFF00FF00 | (local231 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
							this.anIntArray189[arg2] = arg5;
						}
						local311 = arg2 + 1;
						local180 += local194;
						local315 = arg5 + arg6;
						@Pc(3627) int local3627;
						if (local315 < this.anIntArray189[local311] && (local3627 = arg1[(local180 & 0x3F80) + (local180 >>> 25)]) != 0) {
							local221 = arg0[local311];
							local231 = ((local3627 & 0xFF00FF) * local206 & 0xFF00FF00) + ((local3627 & 0xFF00) * local206 & 0xFF0000) >> 8;
							local231 = ((local221 & 0xFF00FF) * local76 + (local231 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local221 & 0xFF00) * local76 + (local231 & 0xFF00) * local81 & 0xFF0000) >> 8;
							arg0[local311] = (((local231 & 0xFF00FF) * local55 & 0xFF00FF00 | (local231 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
							this.anIntArray189[local311] = local315;
						}
						local311++;
						local180 += local194;
						local315 += arg6;
						@Pc(3733) int local3733;
						if (local315 < this.anIntArray189[local311] && (local3733 = arg1[(local180 & 0x3F80) + (local180 >>> 25)]) != 0) {
							local221 = arg0[local311];
							local231 = ((local3733 & 0xFF00FF) * local206 & 0xFF00FF00) + ((local3733 & 0xFF00) * local206 & 0xFF0000) >> 8;
							local231 = ((local221 & 0xFF00FF) * local76 + (local231 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local221 & 0xFF00) * local76 + (local231 & 0xFF00) * local81 & 0xFF0000) >> 8;
							arg0[local311] = (((local231 & 0xFF00FF) * local55 & 0xFF00FF00 | (local231 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
							this.anIntArray189[local311] = local315;
						}
						local311++;
						local180 += local194;
						local315 += arg6;
						@Pc(3839) int local3839;
						if (local315 < this.anIntArray189[local311] && (local3839 = arg1[(local180 & 0x3F80) + (local180 >>> 25)]) != 0) {
							local221 = arg0[local311];
							local231 = ((local3839 & 0xFF00FF) * local206 & 0xFF00FF00) + ((local3839 & 0xFF00) * local206 & 0xFF0000) >> 8;
							local231 = ((local221 & 0xFF00FF) * local76 + (local231 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local221 & 0xFF00) * local76 + (local231 & 0xFF00) * local81 & 0xFF0000) >> 8;
							arg0[local311] = (((local231 & 0xFF00FF) * local55 & 0xFF00FF00 | (local231 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
							this.anIntArray189[local311] = local315;
						}
						local311++;
						local180 += local194;
						local315 += arg6;
						@Pc(3945) int local3945;
						if (local315 < this.anIntArray189[local311] && (local3945 = arg1[(local180 & 0x3F80) + (local180 >>> 25)]) != 0) {
							local221 = arg0[local311];
							local231 = ((local3945 & 0xFF00FF) * local206 & 0xFF00FF00) + ((local3945 & 0xFF00) * local206 & 0xFF0000) >> 8;
							local231 = ((local221 & 0xFF00FF) * local76 + (local231 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local221 & 0xFF00) * local76 + (local231 & 0xFF00) * local81 & 0xFF0000) >> 8;
							arg0[local311] = (((local231 & 0xFF00FF) * local55 & 0xFF00FF00 | (local231 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
							this.anIntArray189[local311] = local315;
						}
						local311++;
						local180 += local194;
						local315 += arg6;
						@Pc(4051) int local4051;
						if (local315 < this.anIntArray189[local311] && (local4051 = arg1[(local180 & 0x3F80) + (local180 >>> 25)]) != 0) {
							local221 = arg0[local311];
							local231 = ((local4051 & 0xFF00FF) * local206 & 0xFF00FF00) + ((local4051 & 0xFF00) * local206 & 0xFF0000) >> 8;
							local231 = ((local221 & 0xFF00FF) * local76 + (local231 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local221 & 0xFF00) * local76 + (local231 & 0xFF00) * local81 & 0xFF0000) >> 8;
							arg0[local311] = (((local231 & 0xFF00FF) * local55 & 0xFF00FF00 | (local231 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
							this.anIntArray189[local311] = local315;
						}
						local311++;
						local180 += local194;
						local315 += arg6;
						@Pc(4157) int local4157;
						if (local315 < this.anIntArray189[local311] && (local4157 = arg1[(local180 & 0x3F80) + (local180 >>> 25)]) != 0) {
							local221 = arg0[local311];
							local231 = ((local4157 & 0xFF00FF) * local206 & 0xFF00FF00) + ((local4157 & 0xFF00) * local206 & 0xFF0000) >> 8;
							local231 = ((local221 & 0xFF00FF) * local76 + (local231 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local221 & 0xFF00) * local76 + (local231 & 0xFF00) * local81 & 0xFF0000) >> 8;
							arg0[local311] = (((local231 & 0xFF00FF) * local55 & 0xFF00FF00 | (local231 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
							this.anIntArray189[local311] = local315;
						}
						local311++;
						local180 += local194;
						local315 += arg6;
						@Pc(4263) int local4263;
						if (local315 < this.anIntArray189[local311] && (local4263 = arg1[(local180 & 0x3F80) + (local180 >>> 25)]) != 0) {
							local221 = arg0[local311];
							local231 = ((local4263 & 0xFF00FF) * local206 & 0xFF00FF00) + ((local4263 & 0xFF00) * local206 & 0xFF0000) >> 8;
							local231 = ((local221 & 0xFF00FF) * local76 + (local231 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local221 & 0xFF00) * local76 + (local231 & 0xFF00) * local81 & 0xFF0000) >> 8;
							arg0[local311] = (((local231 & 0xFF00FF) * local55 & 0xFF00FF00 | (local231 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
							this.anIntArray189[local311] = local315;
						}
						arg2 = local311 + 1;
						arg5 = local315 + arg6;
						local127 = local162;
						local134 = local169;
						arg12 += arg15;
						arg13 += arg16;
						arg14 += arg17;
						if (arg14 == 0.0F) {
							local162 = 0;
							local169 = 0;
						} else {
							local162 = (int) (arg12 * 16384.0F / arg14);
							local169 = (int) (arg13 * 16384.0F / arg14);
						}
						local180 = (local127 << 18) + local134;
						local194 = (local162 - local127 >> 3 << 18) + (local169 - local134 >> 3);
						arg10 += local202;
						local206 = arg10 >> 8;
						arg7 += local47;
						local51 = arg7 >> 16;
						local55 = 255 - local51;
						local73 = ((arg9 & 0xFF00FF) * local51 & 0xFF00FF00 | (arg9 & 0xFF00) * local51 & 0xFF0000) >>> 8;
						local43--;
					} while (local43 > 0);
				}
				local43 = arg4 - arg3 & 0x7;
				if (local43 > 0) {
					do {
						@Pc(4477) int local4477;
						if (arg5 < this.anIntArray189[arg2] && (local4477 = arg1[(local180 & 0x3F80) + (local180 >>> 25)]) != 0) {
							local221 = arg0[arg2];
							local231 = ((local4477 & 0xFF00FF) * local206 & 0xFF00FF00) + ((local4477 & 0xFF00) * local206 & 0xFF0000) >> 8;
							local231 = ((local221 & 0xFF00FF) * local76 + (local231 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local221 & 0xFF00) * local76 + (local231 & 0xFF00) * local81 & 0xFF0000) >> 8;
							arg0[arg2] = (((local231 & 0xFF00FF) * local55 & 0xFF00FF00 | (local231 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
							this.anIntArray189[arg2] = arg5;
						}
						arg2++;
						local180 += local194;
						arg5 += arg6;
						local43--;
					} while (local43 > 0);
				}
			}
			return;
		}
		local89 = arg3 - this.anInt3215;
		local98 = arg12 + arg15 / 8.0F * (float) local89;
		local107 = arg13 + arg16 / 8.0F * (float) local89;
		local116 = arg14 + arg17 / 8.0F * (float) local89;
		if (local116 == 0.0F) {
			local127 = 0;
			local134 = 0;
		} else {
			local127 = (int) (local98 * 4096.0F / local116);
			local134 = (int) (local107 * 4096.0F / local116);
		}
		arg12 = local98 + arg15;
		arg13 = local107 + arg16;
		arg14 = local116 + arg17;
		if (arg14 == 0.0F) {
			local162 = 0;
			local169 = 0;
		} else {
			local162 = (int) (arg12 * 4096.0F / arg14);
			local169 = (int) (arg13 * 4096.0F / arg14);
		}
		local180 = (local127 << 20) + local134;
		local194 = (local162 - local127 >> 3 << 20) + (local169 - local134 >> 3);
		local43 >>= 0x3;
		local202 = arg11 << 3;
		local206 = arg10 >> 8;
		if (this.aBoolean248) {
			if (local43 > 0) {
				do {
					if (arg5 < this.anIntArray189[arg2]) {
						local221 = arg0[arg2];
						local231 = arg1[(local180 & 0xFC0) + (local180 >>> 26)];
						local231 = ((local231 & 0xFF00FF) * local206 & 0xFF00FF00) + ((local231 & 0xFF00) * local206 & 0xFF0000) >> 8;
						local231 = ((local221 & 0xFF00FF) * local76 + (local231 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local221 & 0xFF00) * local76 + (local231 & 0xFF00) * local81 & 0xFF0000) >> 8;
						arg0[arg2] = (((local231 & 0xFF00FF) * local55 & 0xFF00FF00 | (local231 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
						this.anIntArray189[arg2] = arg5;
					}
					local180 += local194;
					local311 = arg2 + 1;
					local315 = arg5 + arg6;
					if (local315 < this.anIntArray189[local311]) {
						local221 = arg0[local311];
						local231 = arg1[(local180 & 0xFC0) + (local180 >>> 26)];
						local231 = ((local231 & 0xFF00FF) * local206 & 0xFF00FF00) + ((local231 & 0xFF00) * local206 & 0xFF0000) >> 8;
						local231 = ((local221 & 0xFF00FF) * local76 + (local231 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local221 & 0xFF00) * local76 + (local231 & 0xFF00) * local81 & 0xFF0000) >> 8;
						arg0[local311] = (((local231 & 0xFF00FF) * local55 & 0xFF00FF00 | (local231 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
						this.anIntArray189[local311] = local315;
					}
					local180 += local194;
					local311++;
					local315 += arg6;
					if (local315 < this.anIntArray189[local311]) {
						local221 = arg0[local311];
						local231 = arg1[(local180 & 0xFC0) + (local180 >>> 26)];
						local231 = ((local231 & 0xFF00FF) * local206 & 0xFF00FF00) + ((local231 & 0xFF00) * local206 & 0xFF0000) >> 8;
						local231 = ((local221 & 0xFF00FF) * local76 + (local231 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local221 & 0xFF00) * local76 + (local231 & 0xFF00) * local81 & 0xFF0000) >> 8;
						arg0[local311] = (((local231 & 0xFF00FF) * local55 & 0xFF00FF00 | (local231 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
						this.anIntArray189[local311] = local315;
					}
					local180 += local194;
					local311++;
					local315 += arg6;
					if (local315 < this.anIntArray189[local311]) {
						local221 = arg0[local311];
						local231 = arg1[(local180 & 0xFC0) + (local180 >>> 26)];
						local231 = ((local231 & 0xFF00FF) * local206 & 0xFF00FF00) + ((local231 & 0xFF00) * local206 & 0xFF0000) >> 8;
						local231 = ((local221 & 0xFF00FF) * local76 + (local231 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local221 & 0xFF00) * local76 + (local231 & 0xFF00) * local81 & 0xFF0000) >> 8;
						arg0[local311] = (((local231 & 0xFF00FF) * local55 & 0xFF00FF00 | (local231 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
						this.anIntArray189[local311] = local315;
					}
					local180 += local194;
					local311++;
					local315 += arg6;
					if (local315 < this.anIntArray189[local311]) {
						local221 = arg0[local311];
						local231 = arg1[(local180 & 0xFC0) + (local180 >>> 26)];
						local231 = ((local231 & 0xFF00FF) * local206 & 0xFF00FF00) + ((local231 & 0xFF00) * local206 & 0xFF0000) >> 8;
						local231 = ((local221 & 0xFF00FF) * local76 + (local231 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local221 & 0xFF00) * local76 + (local231 & 0xFF00) * local81 & 0xFF0000) >> 8;
						arg0[local311] = (((local231 & 0xFF00FF) * local55 & 0xFF00FF00 | (local231 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
						this.anIntArray189[local311] = local315;
					}
					local180 += local194;
					local311++;
					local315 += arg6;
					if (local315 < this.anIntArray189[local311]) {
						local221 = arg0[local311];
						local231 = arg1[(local180 & 0xFC0) + (local180 >>> 26)];
						local231 = ((local231 & 0xFF00FF) * local206 & 0xFF00FF00) + ((local231 & 0xFF00) * local206 & 0xFF0000) >> 8;
						local231 = ((local221 & 0xFF00FF) * local76 + (local231 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local221 & 0xFF00) * local76 + (local231 & 0xFF00) * local81 & 0xFF0000) >> 8;
						arg0[local311] = (((local231 & 0xFF00FF) * local55 & 0xFF00FF00 | (local231 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
						this.anIntArray189[local311] = local315;
					}
					local180 += local194;
					local311++;
					local315 += arg6;
					if (local315 < this.anIntArray189[local311]) {
						local221 = arg0[local311];
						local231 = arg1[(local180 & 0xFC0) + (local180 >>> 26)];
						local231 = ((local231 & 0xFF00FF) * local206 & 0xFF00FF00) + ((local231 & 0xFF00) * local206 & 0xFF0000) >> 8;
						local231 = ((local221 & 0xFF00FF) * local76 + (local231 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local221 & 0xFF00) * local76 + (local231 & 0xFF00) * local81 & 0xFF0000) >> 8;
						arg0[local311] = (((local231 & 0xFF00FF) * local55 & 0xFF00FF00 | (local231 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
						this.anIntArray189[local311] = local315;
					}
					local180 += local194;
					local311++;
					local315 += arg6;
					if (local315 < this.anIntArray189[local311]) {
						local221 = arg0[local311];
						local231 = arg1[(local180 & 0xFC0) + (local180 >>> 26)];
						local231 = ((local231 & 0xFF00FF) * local206 & 0xFF00FF00) + ((local231 & 0xFF00) * local206 & 0xFF0000) >> 8;
						local231 = ((local221 & 0xFF00FF) * local76 + (local231 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local221 & 0xFF00) * local76 + (local231 & 0xFF00) * local81 & 0xFF0000) >> 8;
						arg0[local311] = (((local231 & 0xFF00FF) * local55 & 0xFF00FF00 | (local231 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
						this.anIntArray189[local311] = local315;
					}
					arg2 = local311 + 1;
					arg5 = local315 + arg6;
					local127 = local162;
					local134 = local169;
					arg12 += arg15;
					arg13 += arg16;
					arg14 += arg17;
					if (arg14 == 0.0F) {
						local162 = 0;
						local169 = 0;
					} else {
						local162 = (int) (arg12 * 4096.0F / arg14);
						local169 = (int) (arg13 * 4096.0F / arg14);
					}
					local180 = (local127 << 20) + local134;
					local194 = (local162 - local127 >> 3 << 20) + (local169 - local134 >> 3);
					arg10 += local202;
					local206 = arg10 >> 8;
					arg7 += local47;
					local51 = arg7 >> 16;
					local55 = 255 - local51;
					local73 = ((arg9 & 0xFF00FF) * local51 & 0xFF00FF00 | (arg9 & 0xFF00) * local51 & 0xFF0000) >>> 8;
					local43--;
				} while (local43 > 0);
			}
			local43 = arg4 - arg3 & 0x7;
			if (local43 > 0) {
				do {
					if (arg5 < this.anIntArray189[arg2]) {
						local221 = arg0[arg2];
						local231 = arg1[(local180 & 0xFC0) + (local180 >>> 26)];
						local231 = ((local231 & 0xFF00FF) * local206 & 0xFF00FF00) + ((local231 & 0xFF00) * local206 & 0xFF0000) >> 8;
						local231 = ((local221 & 0xFF00FF) * local76 + (local231 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local221 & 0xFF00) * local76 + (local231 & 0xFF00) * local81 & 0xFF0000) >> 8;
						arg0[arg2] = (((local231 & 0xFF00FF) * local55 & 0xFF00FF00 | (local231 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
						this.anIntArray189[arg2] = arg5;
					}
					local180 += local194;
					arg2++;
					arg5 += arg6;
					local43--;
				} while (local43 > 0);
				return;
			}
		} else {
			if (local43 > 0) {
				do {
					@Pc(1278) int local1278;
					if (arg5 < this.anIntArray189[arg2] && (local1278 = arg1[(local180 & 0xFC0) + (local180 >>> 26)]) != 0) {
						local221 = arg0[arg2];
						local231 = ((local1278 & 0xFF00FF) * local206 & 0xFF00FF00) + ((local1278 & 0xFF00) * local206 & 0xFF0000) >> 8;
						local231 = ((local221 & 0xFF00FF) * local76 + (local231 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local221 & 0xFF00) * local76 + (local231 & 0xFF00) * local81 & 0xFF0000) >> 8;
						arg0[arg2] = (((local231 & 0xFF00FF) * local55 & 0xFF00FF00 | (local231 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
						this.anIntArray189[arg2] = arg5;
					}
					local311 = arg2 + 1;
					local180 += local194;
					local315 = arg5 + arg6;
					@Pc(1384) int local1384;
					if (local315 < this.anIntArray189[local311] && (local1384 = arg1[(local180 & 0xFC0) + (local180 >>> 26)]) != 0) {
						local221 = arg0[local311];
						local231 = ((local1384 & 0xFF00FF) * local206 & 0xFF00FF00) + ((local1384 & 0xFF00) * local206 & 0xFF0000) >> 8;
						local231 = ((local221 & 0xFF00FF) * local76 + (local231 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local221 & 0xFF00) * local76 + (local231 & 0xFF00) * local81 & 0xFF0000) >> 8;
						arg0[local311] = (((local231 & 0xFF00FF) * local55 & 0xFF00FF00 | (local231 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
						this.anIntArray189[local311] = local315;
					}
					local311++;
					local180 += local194;
					local315 += arg6;
					@Pc(1490) int local1490;
					if (local315 < this.anIntArray189[local311] && (local1490 = arg1[(local180 & 0xFC0) + (local180 >>> 26)]) != 0) {
						local221 = arg0[local311];
						local231 = ((local1490 & 0xFF00FF) * local206 & 0xFF00FF00) + ((local1490 & 0xFF00) * local206 & 0xFF0000) >> 8;
						local231 = ((local221 & 0xFF00FF) * local76 + (local231 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local221 & 0xFF00) * local76 + (local231 & 0xFF00) * local81 & 0xFF0000) >> 8;
						arg0[local311] = (((local231 & 0xFF00FF) * local55 & 0xFF00FF00 | (local231 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
						this.anIntArray189[local311] = local315;
					}
					local311++;
					local180 += local194;
					local315 += arg6;
					@Pc(1596) int local1596;
					if (local315 < this.anIntArray189[local311] && (local1596 = arg1[(local180 & 0xFC0) + (local180 >>> 26)]) != 0) {
						local221 = arg0[local311];
						local231 = ((local1596 & 0xFF00FF) * local206 & 0xFF00FF00) + ((local1596 & 0xFF00) * local206 & 0xFF0000) >> 8;
						local231 = ((local221 & 0xFF00FF) * local76 + (local231 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local221 & 0xFF00) * local76 + (local231 & 0xFF00) * local81 & 0xFF0000) >> 8;
						arg0[local311] = (((local231 & 0xFF00FF) * local55 & 0xFF00FF00 | (local231 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
						this.anIntArray189[local311] = local315;
					}
					local311++;
					local180 += local194;
					local315 += arg6;
					@Pc(1702) int local1702;
					if (local315 < this.anIntArray189[local311] && (local1702 = arg1[(local180 & 0xFC0) + (local180 >>> 26)]) != 0) {
						local221 = arg0[local311];
						local231 = ((local1702 & 0xFF00FF) * local206 & 0xFF00FF00) + ((local1702 & 0xFF00) * local206 & 0xFF0000) >> 8;
						local231 = ((local221 & 0xFF00FF) * local76 + (local231 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local221 & 0xFF00) * local76 + (local231 & 0xFF00) * local81 & 0xFF0000) >> 8;
						arg0[local311] = (((local231 & 0xFF00FF) * local55 & 0xFF00FF00 | (local231 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
						this.anIntArray189[local311] = local315;
					}
					local311++;
					local180 += local194;
					local315 += arg6;
					@Pc(1808) int local1808;
					if (local315 < this.anIntArray189[local311] && (local1808 = arg1[(local180 & 0xFC0) + (local180 >>> 26)]) != 0) {
						local221 = arg0[local311];
						local231 = ((local1808 & 0xFF00FF) * local206 & 0xFF00FF00) + ((local1808 & 0xFF00) * local206 & 0xFF0000) >> 8;
						local231 = ((local221 & 0xFF00FF) * local76 + (local231 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local221 & 0xFF00) * local76 + (local231 & 0xFF00) * local81 & 0xFF0000) >> 8;
						arg0[local311] = (((local231 & 0xFF00FF) * local55 & 0xFF00FF00 | (local231 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
						this.anIntArray189[local311] = local315;
					}
					local311++;
					local180 += local194;
					local315 += arg6;
					@Pc(1914) int local1914;
					if (local315 < this.anIntArray189[local311] && (local1914 = arg1[(local180 & 0xFC0) + (local180 >>> 26)]) != 0) {
						local221 = arg0[local311];
						local231 = ((local1914 & 0xFF00FF) * local206 & 0xFF00FF00) + ((local1914 & 0xFF00) * local206 & 0xFF0000) >> 8;
						local231 = ((local221 & 0xFF00FF) * local76 + (local231 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local221 & 0xFF00) * local76 + (local231 & 0xFF00) * local81 & 0xFF0000) >> 8;
						arg0[local311] = (((local231 & 0xFF00FF) * local55 & 0xFF00FF00 | (local231 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
						this.anIntArray189[local311] = local315;
					}
					local311++;
					local180 += local194;
					local315 += arg6;
					@Pc(2020) int local2020;
					if (local315 < this.anIntArray189[local311] && (local2020 = arg1[(local180 & 0xFC0) + (local180 >>> 26)]) != 0) {
						local221 = arg0[local311];
						local231 = ((local2020 & 0xFF00FF) * local206 & 0xFF00FF00) + ((local2020 & 0xFF00) * local206 & 0xFF0000) >> 8;
						local231 = ((local221 & 0xFF00FF) * local76 + (local231 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local221 & 0xFF00) * local76 + (local231 & 0xFF00) * local81 & 0xFF0000) >> 8;
						arg0[local311] = (((local231 & 0xFF00FF) * local55 & 0xFF00FF00 | (local231 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
						this.anIntArray189[local311] = local315;
					}
					arg2 = local311 + 1;
					arg5 = local315 + arg6;
					local127 = local162;
					local134 = local169;
					arg12 += arg15;
					arg13 += arg16;
					arg14 += arg17;
					if (arg14 == 0.0F) {
						local162 = 0;
						local169 = 0;
					} else {
						local162 = (int) (arg12 * 4096.0F / arg14);
						local169 = (int) (arg13 * 4096.0F / arg14);
					}
					local180 = (local127 << 20) + local134;
					local194 = (local162 - local127 >> 3 << 20) + (local169 - local134 >> 3);
					arg10 += local202;
					local206 = arg10 >> 8;
					arg7 += local47;
					local51 = arg7 >> 16;
					local55 = 255 - local51;
					local73 = ((arg9 & 0xFF00FF) * local51 & 0xFF00FF00 | (arg9 & 0xFF00) * local51 & 0xFF0000) >>> 8;
					local43--;
				} while (local43 > 0);
			}
			local43 = arg4 - arg3 & 0x7;
			if (local43 <= 0) {
				return;
			}
			do {
				@Pc(2234) int local2234;
				if (arg5 < this.anIntArray189[arg2] && (local2234 = arg1[(local180 & 0xFC0) + (local180 >>> 26)]) != 0) {
					local221 = arg0[arg2];
					local231 = ((local2234 & 0xFF00FF) * local206 & 0xFF00FF00) + ((local2234 & 0xFF00) * local206 & 0xFF0000) >> 8;
					local231 = ((local221 & 0xFF00FF) * local76 + (local231 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local221 & 0xFF00) * local76 + (local231 & 0xFF00) * local81 & 0xFF0000) >> 8;
					arg0[arg2] = (((local231 & 0xFF00FF) * local55 & 0xFF00FF00 | (local231 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
					this.anIntArray189[arg2] = arg5;
				}
				arg2++;
				local180 += local194;
				arg5 += arg6;
				local43--;
			} while (local43 > 0);
		}
		return;
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "([I[IIIIIIII)V")
	private void method2722(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (this.aBoolean250) {
			if (arg5 > this.anInt3217) {
				arg5 = this.anInt3217;
			}
			if (arg4 < 0) {
				arg4 = 0;
			}
		}
		if (arg4 >= arg5) {
			return;
		}
		arg2 += arg4 - 1;
		@Pc(29) int local29 = arg5 - arg4 >> 2;
		arg6 += arg7 * arg4;
		@Pc(265) int local265;
		@Pc(270) int local270;
		@Pc(301) int local301;
		@Pc(46) int local46;
		@Pc(290) int local290;
		@Pc(61) int local61;
		if (this.aClass216_1.aBoolean425) {
			if (this.anInt3219 == 0) {
				while (true) {
					local29--;
					if (local29 < 0) {
						local29 = arg5 - arg4 & 0x3;
						while (true) {
							local29--;
							if (local29 < 0) {
								return;
							}
							arg2++;
							if (arg6 < arg1[arg2]) {
								arg0[arg2] = arg3;
								arg1[arg2] = arg6;
							}
							arg6 += arg7;
						}
					}
					local46 = arg2 + 1;
					if (arg6 < arg1[local46]) {
						arg0[local46] = arg3;
						arg1[local46] = arg6;
					}
					local61 = arg6 + arg7;
					local46++;
					if (local61 < arg1[local46]) {
						arg0[local46] = arg3;
						arg1[local46] = local61;
					}
					local61 += arg7;
					local46++;
					if (local61 < arg1[local46]) {
						arg0[local46] = arg3;
						arg1[local46] = local61;
					}
					local61 += arg7;
					arg2 = local46 + 1;
					if (local61 < arg1[arg2]) {
						arg0[arg2] = arg3;
						arg1[arg2] = local61;
					}
					arg6 = local61 + arg7;
				}
			} else if (this.anInt3219 != 254) {
				local265 = this.anInt3219;
				local270 = 256 - this.anInt3219;
				local290 = ((arg3 & 0xFF00FF) * local270 >> 8 & 0xFF00FF) + ((arg3 & 0xFF00) * local270 >> 8 & 0xFF00);
				while (true) {
					local29--;
					if (local29 < 0) {
						local29 = arg5 - arg4 & 0x3;
						while (true) {
							local29--;
							if (local29 < 0) {
								return;
							}
							arg2++;
							if (arg6 < arg1[arg2]) {
								local301 = arg0[arg2];
								arg0[arg2] = local290 + ((local301 & 0xFF00FF) * local265 >> 8 & 0xFF00FF) + ((local301 & 0xFF00) * local265 >> 8 & 0xFF00);
								arg1[arg2] = arg6;
							}
							arg6 += arg7;
						}
					}
					local46 = arg2 + 1;
					if (arg6 < arg1[local46]) {
						local301 = arg0[local46];
						arg0[local46] = local290 + ((local301 & 0xFF00FF) * local265 >> 8 & 0xFF00FF) + ((local301 & 0xFF00) * local265 >> 8 & 0xFF00);
						arg1[local46] = arg6;
					}
					local61 = arg6 + arg7;
					local46++;
					if (local61 < arg1[local46]) {
						local301 = arg0[local46];
						arg0[local46] = local290 + ((local301 & 0xFF00FF) * local265 >> 8 & 0xFF00FF) + ((local301 & 0xFF00) * local265 >> 8 & 0xFF00);
						arg1[local46] = local61;
					}
					local61 += arg7;
					local46++;
					if (local61 < arg1[local46]) {
						local301 = arg0[local46];
						arg0[local46] = local290 + ((local301 & 0xFF00FF) * local265 >> 8 & 0xFF00FF) + ((local301 & 0xFF00) * local265 >> 8 & 0xFF00);
						arg1[local46] = local61;
					}
					local61 += arg7;
					arg2 = local46 + 1;
					if (local61 < arg1[arg2]) {
						local301 = arg0[arg2];
						arg0[arg2] = local290 + ((local301 & 0xFF00FF) * local265 >> 8 & 0xFF00FF) + ((local301 & 0xFF00) * local265 >> 8 & 0xFF00);
						arg1[arg2] = local61;
					}
					arg6 = local61 + arg7;
				}
			} else if (arg5 <= this.anInt3217 - 1) {
				while (true) {
					local29--;
					if (local29 < 0) {
						local29 = arg5 - arg4 & 0x3;
						while (true) {
							local29--;
							if (local29 < 0) {
								return;
							}
							arg2++;
							if (arg6 < arg1[arg2]) {
								arg0[arg2 - 1] = arg0[arg2];
							}
							arg6 += arg7;
						}
					}
					local46 = arg2 + 1;
					if (arg6 < arg1[local46]) {
						arg0[local46 - 1] = arg0[local46];
					}
					local61 = arg6 + arg7;
					local46++;
					if (local61 < arg1[local46]) {
						arg0[local46 - 1] = arg0[local46];
					}
					local61 += arg7;
					local46++;
					if (local61 < arg1[local46]) {
						arg0[local46 - 1] = arg0[local46];
					}
					local61 += arg7;
					arg2 = local46 + 1;
					if (local61 < arg1[arg2]) {
						arg0[arg2 - 1] = arg0[arg2];
					}
					arg6 = local61 + arg7;
				}
			}
		} else if (this.anInt3219 == 0) {
			while (true) {
				local29--;
				if (local29 < 0) {
					local29 = arg5 - arg4 & 0x3;
					while (true) {
						local29--;
						if (local29 < 0) {
							return;
						}
						arg2++;
						if (arg6 < arg1[arg2]) {
							arg0[arg2] = arg3;
						}
						arg6 += arg7;
					}
				}
				local46 = arg2 + 1;
				if (arg6 < arg1[local46]) {
					arg0[local46] = arg3;
				}
				local61 = arg6 + arg7;
				local46++;
				if (local61 < arg1[local46]) {
					arg0[local46] = arg3;
				}
				local61 += arg7;
				local46++;
				if (local61 < arg1[local46]) {
					arg0[local46] = arg3;
				}
				local61 += arg7;
				arg2 = local46 + 1;
				if (local61 < arg1[arg2]) {
					arg0[arg2] = arg3;
				}
				arg6 = local61 + arg7;
			}
		} else if (this.anInt3219 != 254) {
			local265 = this.anInt3219;
			local270 = 256 - this.anInt3219;
			local290 = ((arg3 & 0xFF00FF) * local270 >> 8 & 0xFF00FF) + ((arg3 & 0xFF00) * local270 >> 8 & 0xFF00);
			while (true) {
				local29--;
				if (local29 < 0) {
					local29 = arg5 - arg4 & 0x3;
					while (true) {
						local29--;
						if (local29 < 0) {
							return;
						}
						arg2++;
						if (arg6 < arg1[arg2]) {
							local301 = arg0[arg2];
							arg0[arg2] = local290 + ((local301 & 0xFF00FF) * local265 >> 8 & 0xFF00FF) + ((local301 & 0xFF00) * local265 >> 8 & 0xFF00);
						}
						arg6 += arg7;
					}
				}
				local46 = arg2 + 1;
				if (arg6 < arg1[local46]) {
					local301 = arg0[local46];
					arg0[local46] = local290 + ((local301 & 0xFF00FF) * local265 >> 8 & 0xFF00FF) + ((local301 & 0xFF00) * local265 >> 8 & 0xFF00);
				}
				local61 = arg6 + arg7;
				local46++;
				if (local61 < arg1[local46]) {
					local301 = arg0[local46];
					arg0[local46] = local290 + ((local301 & 0xFF00FF) * local265 >> 8 & 0xFF00FF) + ((local301 & 0xFF00) * local265 >> 8 & 0xFF00);
				}
				local61 += arg7;
				local46++;
				if (local61 < arg1[local46]) {
					local301 = arg0[local46];
					arg0[local46] = local290 + ((local301 & 0xFF00FF) * local265 >> 8 & 0xFF00FF) + ((local301 & 0xFF00) * local265 >> 8 & 0xFF00);
				}
				local61 += arg7;
				arg2 = local46 + 1;
				if (local61 < arg1[arg2]) {
					local301 = arg0[arg2];
					arg0[arg2] = local290 + ((local301 & 0xFF00FF) * local265 >> 8 & 0xFF00FF) + ((local301 & 0xFF00) * local265 >> 8 & 0xFF00);
				}
				arg6 = local61 + arg7;
			}
		} else if (arg5 <= this.anInt3217 - 1) {
			while (true) {
				local29--;
				if (local29 < 0) {
					local29 = arg5 - arg4 & 0x3;
					while (true) {
						local29--;
						if (local29 < 0) {
							return;
						}
						arg2++;
						if (arg6 < arg1[arg2]) {
							arg0[arg2 - 1] = arg0[arg2];
						}
						arg6 += arg7;
					}
				}
				local46 = arg2 + 1;
				if (arg6 < arg1[local46]) {
					arg0[local46 - 1] = arg0[local46];
				}
				local61 = arg6 + arg7;
				local46++;
				if (local61 < arg1[local46]) {
					arg0[local46 - 1] = arg0[local46];
				}
				local61 += arg7;
				local46++;
				if (local61 < arg1[local46]) {
					arg0[local46 - 1] = arg0[local46];
				}
				local61 += arg7;
				arg2 = local46 + 1;
				if (local61 < arg1[arg2]) {
					arg0[arg2 - 1] = arg0[arg2];
				}
				arg6 = local61 + arg7;
			}
		}
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "()I")
	public int method2723() {
		return this.anIntArray190[0] % this.anInt3220;
	}

	@OriginalMember(owner = "client!gw", name = "c", descriptor = "([I[IIIIIIIIIIIIIFFFFFF)V")
	private void method2724(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int arg8, @OriginalArg(11) int arg9, @OriginalArg(12) int arg10, @OriginalArg(13) int arg11, @OriginalArg(14) float arg12, @OriginalArg(15) float arg13, @OriginalArg(16) float arg14, @OriginalArg(17) float arg15, @OriginalArg(18) float arg16, @OriginalArg(19) float arg17) {
		if (this.anInt3219 == 0) {
			if (this.aClass216_1.aBoolean425) {
				this.method2719(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17);
			} else {
				this.method2729(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17);
			}
		} else if (this.aClass216_1.aBoolean425) {
			this.method2721(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17);
		} else {
			this.method2738(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17);
		}
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "([I[IIIIIIIIII)V")
	private void method2725(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int arg8) {
		if (this.aBoolean250) {
			if (arg4 > this.anInt3217) {
				arg4 = this.anInt3217;
			}
			if (arg3 < 0) {
				arg3 = 0;
			}
		}
		if (arg3 >= arg4) {
			return;
		}
		arg2 += arg3 - 1;
		arg5 += arg6 * arg3;
		arg7 += arg8 * arg3;
		@Pc(181) int local181;
		@Pc(186) int local186;
		@Pc(228) int local228;
		@Pc(48) int local48;
		@Pc(63) int local63;
		@Pc(70) int local70;
		@Pc(52) int local52;
		@Pc(85) int local85;
		if (this.aClass216_1.aBoolean425) {
			if (this.aBoolean254) {
				local48 = arg4 - arg3 >> 2;
				local52 = arg6 << 2;
				if (this.anInt3219 == 0) {
					if (local48 > 0) {
						do {
							local63 = Static341.anIntArray409[arg5 >> 8];
							arg5 += local52;
							local70 = arg2 + 1;
							if (arg7 < arg1[local70]) {
								arg0[local70] = local63;
								arg1[local70] = arg7;
							}
							local85 = arg7 + arg8;
							local70++;
							if (local85 < arg1[local70]) {
								arg0[local70] = local63;
								arg1[local70] = local85;
							}
							local85 += arg8;
							local70++;
							if (local85 < arg1[local70]) {
								arg0[local70] = local63;
								arg1[local70] = local85;
							}
							local85 += arg8;
							arg2 = local70 + 1;
							if (local85 < arg1[arg2]) {
								arg0[arg2] = local63;
								arg1[arg2] = local85;
							}
							arg7 = local85 + arg8;
							local48--;
						} while (local48 > 0);
					}
					local48 = arg4 - arg3 & 0x3;
					if (local48 > 0) {
						local63 = Static341.anIntArray409[arg5 >> 8];
						do {
							arg2++;
							if (arg7 < arg1[arg2]) {
								arg0[arg2] = local63;
								arg1[arg2] = arg7;
							}
							arg7 += arg8;
							local48--;
						} while (local48 > 0);
						return;
					}
				} else {
					local181 = this.anInt3219;
					local186 = 256 - this.anInt3219;
					if (local48 > 0) {
						do {
							local63 = Static341.anIntArray409[arg5 >> 8];
							arg5 += local52;
							local63 = ((local63 & 0xFF00FF) * local186 >> 8 & 0xFF00FF) + ((local63 & 0xFF00) * local186 >> 8 & 0xFF00);
							local70 = arg2 + 1;
							if (arg7 < arg1[local70]) {
								local228 = arg0[local70];
								arg0[local70] = local63 + ((local228 & 0xFF00FF) * local181 >> 8 & 0xFF00FF) + ((local228 & 0xFF00) * local181 >> 8 & 0xFF00);
								arg1[local70] = arg7;
							}
							local85 = arg7 + arg8;
							local70++;
							if (local85 < arg1[local70]) {
								local228 = arg0[local70];
								arg0[local70] = local63 + ((local228 & 0xFF00FF) * local181 >> 8 & 0xFF00FF) + ((local228 & 0xFF00) * local181 >> 8 & 0xFF00);
								arg1[local70] = local85;
							}
							local85 += arg8;
							local70++;
							if (local85 < arg1[local70]) {
								local228 = arg0[local70];
								arg0[local70] = local63 + ((local228 & 0xFF00FF) * local181 >> 8 & 0xFF00FF) + ((local228 & 0xFF00) * local181 >> 8 & 0xFF00);
								arg1[local70] = local85;
							}
							local85 += arg8;
							arg2 = local70 + 1;
							if (local85 < arg1[arg2]) {
								local228 = arg0[arg2];
								arg0[arg2] = local63 + ((local228 & 0xFF00FF) * local181 >> 8 & 0xFF00FF) + ((local228 & 0xFF00) * local181 >> 8 & 0xFF00);
								arg1[arg2] = local85;
							}
							arg7 = local85 + arg8;
							local48--;
						} while (local48 > 0);
					}
					local48 = arg4 - arg3 & 0x3;
					if (local48 <= 0) {
						return;
					}
					local63 = Static341.anIntArray409[arg5 >> 8];
					local63 = ((local63 & 0xFF00FF) * local186 >> 8 & 0xFF00FF) + ((local63 & 0xFF00) * local186 >> 8 & 0xFF00);
					do {
						arg2++;
						if (arg7 < arg1[arg2]) {
							local228 = arg0[arg2];
							arg0[arg2] = local63 + ((local228 & 0xFF00FF) * local181 >> 8 & 0xFF00FF) + ((local228 & 0xFF00) * local181 >> 8 & 0xFF00);
							arg1[arg2] = arg7;
						}
						arg7 += arg8;
						local48--;
					} while (local48 > 0);
				}
			} else {
				local48 = arg4 - arg3;
				if (this.anInt3219 == 0) {
					do {
						arg2++;
						if (arg7 < arg1[arg2]) {
							arg0[arg2] = Static341.anIntArray409[arg5 >> 8];
							arg1[arg2] = arg7;
						}
						arg7 += arg8;
						arg5 += arg6;
						local48--;
					} while (local48 > 0);
				} else {
					local181 = this.anInt3219;
					local186 = 256 - this.anInt3219;
					do {
						arg2++;
						if (arg7 < arg1[arg2]) {
							local63 = Static341.anIntArray409[arg5 >> 8];
							local63 = ((local63 & 0xFF00FF) * local186 >> 8 & 0xFF00FF) + ((local63 & 0xFF00) * local186 >> 8 & 0xFF00);
							local228 = arg0[arg2];
							arg0[arg2] = local63 + ((local228 & 0xFF00FF) * local181 >> 8 & 0xFF00FF) + ((local228 & 0xFF00) * local181 >> 8 & 0xFF00);
							arg1[arg2] = arg7;
						}
						arg5 += arg6;
						arg7 += arg8;
						local48--;
					} while (local48 > 0);
				}
			}
		} else if (this.aBoolean254) {
			local48 = arg4 - arg3 >> 2;
			local52 = arg6 << 2;
			if (this.anInt3219 == 0) {
				if (local48 > 0) {
					do {
						local63 = Static341.anIntArray409[arg5 >> 8];
						arg5 += local52;
						local70 = arg2 + 1;
						if (arg7 < arg1[local70]) {
							arg0[local70] = local63;
						}
						local85 = arg7 + arg8;
						local70++;
						if (local85 < arg1[local70]) {
							arg0[local70] = local63;
						}
						local85 += arg8;
						local70++;
						if (local85 < arg1[local70]) {
							arg0[local70] = local63;
						}
						local85 += arg8;
						arg2 = local70 + 1;
						if (local85 < arg1[arg2]) {
							arg0[arg2] = local63;
						}
						arg7 = local85 + arg8;
						local48--;
					} while (local48 > 0);
				}
				local48 = arg4 - arg3 & 0x3;
				if (local48 > 0) {
					local63 = Static341.anIntArray409[arg5 >> 8];
					do {
						arg2++;
						if (arg7 < arg1[arg2]) {
							arg0[arg2] = local63;
						}
						arg7 += arg8;
						local48--;
					} while (local48 > 0);
					return;
				}
			} else {
				local181 = this.anInt3219;
				local186 = 256 - this.anInt3219;
				if (local48 > 0) {
					do {
						local63 = Static341.anIntArray409[arg5 >> 8];
						arg5 += local52;
						local63 = ((local63 & 0xFF00FF) * local186 >> 8 & 0xFF00FF) + ((local63 & 0xFF00) * local186 >> 8 & 0xFF00);
						local70 = arg2 + 1;
						if (arg7 < arg1[local70]) {
							local228 = arg0[local70];
							arg0[local70] = local63 + ((local228 & 0xFF00FF) * local181 >> 8 & 0xFF00FF) + ((local228 & 0xFF00) * local181 >> 8 & 0xFF00);
						}
						local85 = arg7 + arg8;
						local70++;
						if (local85 < arg1[local70]) {
							local228 = arg0[local70];
							arg0[local70] = local63 + ((local228 & 0xFF00FF) * local181 >> 8 & 0xFF00FF) + ((local228 & 0xFF00) * local181 >> 8 & 0xFF00);
						}
						local85 += arg8;
						local70++;
						if (local85 < arg1[local70]) {
							local228 = arg0[local70];
							arg0[local70] = local63 + ((local228 & 0xFF00FF) * local181 >> 8 & 0xFF00FF) + ((local228 & 0xFF00) * local181 >> 8 & 0xFF00);
						}
						local85 += arg8;
						arg2 = local70 + 1;
						if (local85 < arg1[arg2]) {
							local228 = arg0[arg2];
							arg0[arg2] = local63 + ((local228 & 0xFF00FF) * local181 >> 8 & 0xFF00FF) + ((local228 & 0xFF00) * local181 >> 8 & 0xFF00);
						}
						arg7 = local85 + arg8;
						local48--;
					} while (local48 > 0);
				}
				local48 = arg4 - arg3 & 0x3;
				if (local48 <= 0) {
					return;
				}
				local63 = Static341.anIntArray409[arg5 >> 8];
				local63 = ((local63 & 0xFF00FF) * local186 >> 8 & 0xFF00FF) + ((local63 & 0xFF00) * local186 >> 8 & 0xFF00);
				do {
					arg2++;
					if (arg7 < arg1[arg2]) {
						local228 = arg0[arg2];
						arg0[arg2] = local63 + ((local228 & 0xFF00FF) * local181 >> 8 & 0xFF00FF) + ((local228 & 0xFF00) * local181 >> 8 & 0xFF00);
					}
					arg7 += arg8;
					local48--;
				} while (local48 > 0);
			}
		} else {
			local48 = arg4 - arg3;
			if (this.anInt3219 == 0) {
				do {
					arg2++;
					if (arg7 < arg1[arg2]) {
						arg0[arg2] = Static341.anIntArray409[arg5 >> 8];
					}
					arg7 += arg8;
					arg5 += arg6;
					local48--;
				} while (local48 > 0);
			} else {
				local181 = this.anInt3219;
				local186 = 256 - this.anInt3219;
				do {
					arg2++;
					if (arg7 < arg1[arg2]) {
						local63 = Static341.anIntArray409[arg5 >> 8];
						local63 = ((local63 & 0xFF00FF) * local186 >> 8 & 0xFF00FF) + ((local63 & 0xFF00) * local186 >> 8 & 0xFF00);
						local228 = arg0[arg2];
						arg0[arg2] = local63 + ((local228 & 0xFF00FF) * local181 >> 8 & 0xFF00FF) + ((local228 & 0xFF00) * local181 >> 8 & 0xFF00);
					}
					arg5 += arg6;
					arg7 += arg8;
					local48--;
				} while (local48 > 0);
			}
		}
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "([I[I[IIIIIIIIIIFFFFFF)V")
	private void method2726(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int arg8, @OriginalArg(11) int arg9, @OriginalArg(12) float arg10, @OriginalArg(13) float arg11, @OriginalArg(14) float arg12, @OriginalArg(15) float arg13, @OriginalArg(16) float arg14, @OriginalArg(17) float arg15) {
		@Pc(3) int local3 = arg5 - arg4;
		@Pc(6) int local6 = this.anInt3219;
		@Pc(11) int local11 = 256 - this.anInt3219;
		@Pc(136) int local136;
		@Pc(124) int local124;
		@Pc(57) int local57;
		@Pc(64) int local64;
		@Pc(92) int local92;
		@Pc(99) int local99;
		@Pc(150) int local150;
		@Pc(19) int local19;
		@Pc(110) int local110;
		@Pc(132) int local132;
		@Pc(28) float local28;
		@Pc(37) float local37;
		@Pc(46) float local46;
		@Pc(160) int local160;
		if (!this.aBoolean253) {
			local19 = arg4 - this.anInt3215;
			local28 = arg10 + arg13 / 8.0F * (float) local19;
			local37 = arg11 + arg14 / 8.0F * (float) local19;
			local46 = arg12 + arg15 / 8.0F * (float) local19;
			if (local46 == 0.0F) {
				local57 = 0;
				local64 = 0;
			} else {
				local57 = (int) (local28 * 16384.0F / local46);
				local64 = (int) (local37 * 16384.0F / local46);
			}
			arg10 = local28 + arg13;
			arg11 = local37 + arg14;
			arg12 = local46 + arg15;
			if (arg12 == 0.0F) {
				local92 = 0;
				local99 = 0;
			} else {
				local92 = (int) (arg10 * 16384.0F / arg12);
				local99 = (int) (arg11 * 16384.0F / arg12);
			}
			local110 = (local57 << 18) + local64;
			local124 = (local92 - local57 >> 3 << 18) + (local99 - local64 >> 3);
			local3 >>= 0x3;
			local132 = arg9 << 3;
			local136 = arg8 >> 8;
			if (this.aBoolean248) {
				if (local3 > 0) {
					do {
						if (arg6 < arg1[arg3]) {
							local160 = arg2[(local110 & 0x3F80) + (local110 >>> 25)];
							local150 = arg0[arg3];
							local160 = ((local160 & 0xFF00FF) * local136 & 0xFF00FF00) + ((local160 & 0xFF00) * local136 & 0xFF0000) >> 8;
							arg0[arg3] = ((local150 & 0xFF00FF) * local6 + (local160 & 0xFF00FF) * local11 & 0xFF00FF00) + ((local150 & 0xFF00) * local6 + (local160 & 0xFF00) * local11 & 0xFF0000) >> 8;
						}
						arg6 += arg7;
						arg3++;
						local110 += local124;
						if (arg6 < arg1[arg3]) {
							local160 = arg2[(local110 & 0x3F80) + (local110 >>> 25)];
							local150 = arg0[arg3];
							local160 = ((local160 & 0xFF00FF) * local136 & 0xFF00FF00) + ((local160 & 0xFF00) * local136 & 0xFF0000) >> 8;
							arg0[arg3] = ((local150 & 0xFF00FF) * local6 + (local160 & 0xFF00FF) * local11 & 0xFF00FF00) + ((local150 & 0xFF00) * local6 + (local160 & 0xFF00) * local11 & 0xFF0000) >> 8;
						}
						arg6 += arg7;
						arg3++;
						local110 += local124;
						if (arg6 < arg1[arg3]) {
							local160 = arg2[(local110 & 0x3F80) + (local110 >>> 25)];
							local150 = arg0[arg3];
							local160 = ((local160 & 0xFF00FF) * local136 & 0xFF00FF00) + ((local160 & 0xFF00) * local136 & 0xFF0000) >> 8;
							arg0[arg3] = ((local150 & 0xFF00FF) * local6 + (local160 & 0xFF00FF) * local11 & 0xFF00FF00) + ((local150 & 0xFF00) * local6 + (local160 & 0xFF00) * local11 & 0xFF0000) >> 8;
						}
						arg6 += arg7;
						arg3++;
						local110 += local124;
						if (arg6 < arg1[arg3]) {
							local160 = arg2[(local110 & 0x3F80) + (local110 >>> 25)];
							local150 = arg0[arg3];
							local160 = ((local160 & 0xFF00FF) * local136 & 0xFF00FF00) + ((local160 & 0xFF00) * local136 & 0xFF0000) >> 8;
							arg0[arg3] = ((local150 & 0xFF00FF) * local6 + (local160 & 0xFF00FF) * local11 & 0xFF00FF00) + ((local150 & 0xFF00) * local6 + (local160 & 0xFF00) * local11 & 0xFF0000) >> 8;
						}
						arg6 += arg7;
						arg3++;
						local110 += local124;
						if (arg6 < arg1[arg3]) {
							local160 = arg2[(local110 & 0x3F80) + (local110 >>> 25)];
							local150 = arg0[arg3];
							local160 = ((local160 & 0xFF00FF) * local136 & 0xFF00FF00) + ((local160 & 0xFF00) * local136 & 0xFF0000) >> 8;
							arg0[arg3] = ((local150 & 0xFF00FF) * local6 + (local160 & 0xFF00FF) * local11 & 0xFF00FF00) + ((local150 & 0xFF00) * local6 + (local160 & 0xFF00) * local11 & 0xFF0000) >> 8;
						}
						arg6 += arg7;
						arg3++;
						local110 += local124;
						if (arg6 < arg1[arg3]) {
							local160 = arg2[(local110 & 0x3F80) + (local110 >>> 25)];
							local150 = arg0[arg3];
							local160 = ((local160 & 0xFF00FF) * local136 & 0xFF00FF00) + ((local160 & 0xFF00) * local136 & 0xFF0000) >> 8;
							arg0[arg3] = ((local150 & 0xFF00FF) * local6 + (local160 & 0xFF00FF) * local11 & 0xFF00FF00) + ((local150 & 0xFF00) * local6 + (local160 & 0xFF00) * local11 & 0xFF0000) >> 8;
						}
						arg6 += arg7;
						arg3++;
						local110 += local124;
						if (arg6 < arg1[arg3]) {
							local160 = arg2[(local110 & 0x3F80) + (local110 >>> 25)];
							local150 = arg0[arg3];
							local160 = ((local160 & 0xFF00FF) * local136 & 0xFF00FF00) + ((local160 & 0xFF00) * local136 & 0xFF0000) >> 8;
							arg0[arg3] = ((local150 & 0xFF00FF) * local6 + (local160 & 0xFF00FF) * local11 & 0xFF00FF00) + ((local150 & 0xFF00) * local6 + (local160 & 0xFF00) * local11 & 0xFF0000) >> 8;
						}
						arg6 += arg7;
						arg3++;
						local110 += local124;
						if (arg6 < arg1[arg3]) {
							local160 = arg2[(local110 & 0x3F80) + (local110 >>> 25)];
							local150 = arg0[arg3];
							local160 = ((local160 & 0xFF00FF) * local136 & 0xFF00FF00) + ((local160 & 0xFF00) * local136 & 0xFF0000) >> 8;
							arg0[arg3] = ((local150 & 0xFF00FF) * local6 + (local160 & 0xFF00FF) * local11 & 0xFF00FF00) + ((local150 & 0xFF00) * local6 + (local160 & 0xFF00) * local11 & 0xFF0000) >> 8;
						}
						arg6 += arg7;
						arg3++;
						local57 = local92;
						local64 = local99;
						arg10 += arg13;
						arg11 += arg14;
						arg12 += arg15;
						if (arg12 == 0.0F) {
							local92 = 0;
							local99 = 0;
						} else {
							local92 = (int) (arg10 * 16384.0F / arg12);
							local99 = (int) (arg11 * 16384.0F / arg12);
						}
						local110 = (local57 << 18) + local64;
						local124 = (local92 - local57 >> 3 << 18) + (local99 - local64 >> 3);
						arg8 += local132;
						local136 = arg8 >> 8;
						local3--;
					} while (local3 > 0);
				}
				local3 = arg5 - arg4 & 0x7;
				if (local3 > 0) {
					do {
						if (arg6 < arg1[arg3]) {
							local160 = arg2[(local110 & 0x3F80) + (local110 >>> 25)];
							local150 = arg0[arg3];
							local160 = ((local160 & 0xFF00FF) * local136 & 0xFF00FF00) + ((local160 & 0xFF00) * local136 & 0xFF0000) >> 8;
							arg0[arg3] = ((local150 & 0xFF00FF) * local6 + (local160 & 0xFF00FF) * local11 & 0xFF00FF00) + ((local150 & 0xFF00) * local6 + (local160 & 0xFF00) * local11 & 0xFF0000) >> 8;
						}
						arg6 += arg7;
						arg3++;
						local110 += local124;
						local3--;
					} while (local3 > 0);
					return;
				}
			} else {
				if (local3 > 0) {
					do {
						@Pc(2658) int local2658;
						if (arg6 < arg1[arg3] && (local2658 = arg2[(local110 & 0x3F80) + (local110 >>> 25)]) != 0) {
							local150 = arg0[arg3];
							local160 = ((local2658 & 0xFF00FF) * local136 & 0xFF00FF00) + ((local2658 & 0xFF00) * local136 & 0xFF0000) >> 8;
							arg0[arg3] = ((local150 & 0xFF00FF) * local6 + (local160 & 0xFF00FF) * local11 & 0xFF00FF00) + ((local150 & 0xFF00) * local6 + (local160 & 0xFF00) * local11 & 0xFF0000) >> 8;
						}
						arg6 += arg7;
						arg3++;
						local110 += local124;
						@Pc(2738) int local2738;
						if (arg6 < arg1[arg3] && (local2738 = arg2[(local110 & 0x3F80) + (local110 >>> 25)]) != 0) {
							local150 = arg0[arg3];
							local160 = ((local2738 & 0xFF00FF) * local136 & 0xFF00FF00) + ((local2738 & 0xFF00) * local136 & 0xFF0000) >> 8;
							arg0[arg3] = ((local150 & 0xFF00FF) * local6 + (local160 & 0xFF00FF) * local11 & 0xFF00FF00) + ((local150 & 0xFF00) * local6 + (local160 & 0xFF00) * local11 & 0xFF0000) >> 8;
						}
						arg6 += arg7;
						arg3++;
						local110 += local124;
						@Pc(2818) int local2818;
						if (arg6 < arg1[arg3] && (local2818 = arg2[(local110 & 0x3F80) + (local110 >>> 25)]) != 0) {
							local150 = arg0[arg3];
							local160 = ((local2818 & 0xFF00FF) * local136 & 0xFF00FF00) + ((local2818 & 0xFF00) * local136 & 0xFF0000) >> 8;
							arg0[arg3] = ((local150 & 0xFF00FF) * local6 + (local160 & 0xFF00FF) * local11 & 0xFF00FF00) + ((local150 & 0xFF00) * local6 + (local160 & 0xFF00) * local11 & 0xFF0000) >> 8;
						}
						arg6 += arg7;
						arg3++;
						local110 += local124;
						@Pc(2898) int local2898;
						if (arg6 < arg1[arg3] && (local2898 = arg2[(local110 & 0x3F80) + (local110 >>> 25)]) != 0) {
							local150 = arg0[arg3];
							local160 = ((local2898 & 0xFF00FF) * local136 & 0xFF00FF00) + ((local2898 & 0xFF00) * local136 & 0xFF0000) >> 8;
							arg0[arg3] = ((local150 & 0xFF00FF) * local6 + (local160 & 0xFF00FF) * local11 & 0xFF00FF00) + ((local150 & 0xFF00) * local6 + (local160 & 0xFF00) * local11 & 0xFF0000) >> 8;
						}
						arg6 += arg7;
						arg3++;
						local110 += local124;
						@Pc(2978) int local2978;
						if (arg6 < arg1[arg3] && (local2978 = arg2[(local110 & 0x3F80) + (local110 >>> 25)]) != 0) {
							local150 = arg0[arg3];
							local160 = ((local2978 & 0xFF00FF) * local136 & 0xFF00FF00) + ((local2978 & 0xFF00) * local136 & 0xFF0000) >> 8;
							arg0[arg3] = ((local150 & 0xFF00FF) * local6 + (local160 & 0xFF00FF) * local11 & 0xFF00FF00) + ((local150 & 0xFF00) * local6 + (local160 & 0xFF00) * local11 & 0xFF0000) >> 8;
						}
						arg6 += arg7;
						arg3++;
						local110 += local124;
						@Pc(3058) int local3058;
						if (arg6 < arg1[arg3] && (local3058 = arg2[(local110 & 0x3F80) + (local110 >>> 25)]) != 0) {
							local150 = arg0[arg3];
							local160 = ((local3058 & 0xFF00FF) * local136 & 0xFF00FF00) + ((local3058 & 0xFF00) * local136 & 0xFF0000) >> 8;
							arg0[arg3] = ((local150 & 0xFF00FF) * local6 + (local160 & 0xFF00FF) * local11 & 0xFF00FF00) + ((local150 & 0xFF00) * local6 + (local160 & 0xFF00) * local11 & 0xFF0000) >> 8;
						}
						arg6 += arg7;
						arg3++;
						local110 += local124;
						@Pc(3138) int local3138;
						if (arg6 < arg1[arg3] && (local3138 = arg2[(local110 & 0x3F80) + (local110 >>> 25)]) != 0) {
							local150 = arg0[arg3];
							local160 = ((local3138 & 0xFF00FF) * local136 & 0xFF00FF00) + ((local3138 & 0xFF00) * local136 & 0xFF0000) >> 8;
							arg0[arg3] = ((local150 & 0xFF00FF) * local6 + (local160 & 0xFF00FF) * local11 & 0xFF00FF00) + ((local150 & 0xFF00) * local6 + (local160 & 0xFF00) * local11 & 0xFF0000) >> 8;
						}
						arg6 += arg7;
						arg3++;
						local110 += local124;
						@Pc(3218) int local3218;
						if (arg6 < arg1[arg3] && (local3218 = arg2[(local110 & 0x3F80) + (local110 >>> 25)]) != 0) {
							local150 = arg0[arg3];
							local160 = ((local3218 & 0xFF00FF) * local136 & 0xFF00FF00) + ((local3218 & 0xFF00) * local136 & 0xFF0000) >> 8;
							arg0[arg3] = ((local150 & 0xFF00FF) * local6 + (local160 & 0xFF00FF) * local11 & 0xFF00FF00) + ((local150 & 0xFF00) * local6 + (local160 & 0xFF00) * local11 & 0xFF0000) >> 8;
						}
						arg6 += arg7;
						arg3++;
						local57 = local92;
						local64 = local99;
						arg10 += arg13;
						arg11 += arg14;
						arg12 += arg15;
						if (arg12 == 0.0F) {
							local92 = 0;
							local99 = 0;
						} else {
							local92 = (int) (arg10 * 16384.0F / arg12);
							local99 = (int) (arg11 * 16384.0F / arg12);
						}
						local110 = (local57 << 18) + local64;
						local124 = (local92 - local57 >> 3 << 18) + (local99 - local64 >> 3);
						arg8 += local132;
						local136 = arg8 >> 8;
						local3--;
					} while (local3 > 0);
				}
				local3 = arg5 - arg4 & 0x7;
				if (local3 > 0) {
					do {
						@Pc(3376) int local3376;
						if (arg6 < arg1[arg3] && (local3376 = arg2[(local110 & 0x3F80) + (local110 >>> 25)]) != 0) {
							local150 = arg0[arg3];
							local160 = ((local3376 & 0xFF00FF) * local136 & 0xFF00FF00) + ((local3376 & 0xFF00) * local136 & 0xFF0000) >> 8;
							arg0[arg3] = ((local150 & 0xFF00FF) * local6 + (local160 & 0xFF00FF) * local11 & 0xFF00FF00) + ((local150 & 0xFF00) * local6 + (local160 & 0xFF00) * local11 & 0xFF0000) >> 8;
						}
						arg6 += arg7;
						arg3++;
						local110 += local124;
						local3--;
					} while (local3 > 0);
				}
			}
			return;
		}
		local19 = arg4 - this.anInt3215;
		local28 = arg10 + arg13 / 8.0F * (float) local19;
		local37 = arg11 + arg14 / 8.0F * (float) local19;
		local46 = arg12 + arg15 / 8.0F * (float) local19;
		if (local46 == 0.0F) {
			local57 = 0;
			local64 = 0;
		} else {
			local57 = (int) (local28 * 4096.0F / local46);
			local64 = (int) (local37 * 4096.0F / local46);
		}
		arg10 = local28 + arg13;
		arg11 = local37 + arg14;
		arg12 = local46 + arg15;
		if (arg12 == 0.0F) {
			local92 = 0;
			local99 = 0;
		} else {
			local92 = (int) (arg10 * 4096.0F / arg12);
			local99 = (int) (arg11 * 4096.0F / arg12);
		}
		local110 = (local57 << 20) + local64;
		local124 = (local92 - local57 >> 3 << 20) + (local99 - local64 >> 3);
		local3 >>= 0x3;
		local132 = arg9 << 3;
		local136 = arg8 >> 8;
		if (this.aBoolean248) {
			if (local3 > 0) {
				do {
					if (arg6 < arg1[arg3]) {
						local150 = arg0[arg3];
						local160 = arg2[(local110 & 0xFC0) + (local110 >>> 26)];
						local160 = ((local160 & 0xFF00FF) * local136 & 0xFF00FF00) + ((local160 & 0xFF00) * local136 & 0xFF0000) >> 8;
						arg0[arg3] = ((local150 & 0xFF00FF) * local6 + (local160 & 0xFF00FF) * local11 & 0xFF00FF00) + ((local150 & 0xFF00) * local6 + (local160 & 0xFF00) * local11 & 0xFF0000) >> 8;
					}
					arg6 += arg7;
					local110 += local124;
					arg3++;
					if (arg6 < arg1[arg3]) {
						local150 = arg0[arg3];
						local160 = arg2[(local110 & 0xFC0) + (local110 >>> 26)];
						local160 = ((local160 & 0xFF00FF) * local136 & 0xFF00FF00) + ((local160 & 0xFF00) * local136 & 0xFF0000) >> 8;
						arg0[arg3] = ((local150 & 0xFF00FF) * local6 + (local160 & 0xFF00FF) * local11 & 0xFF00FF00) + ((local150 & 0xFF00) * local6 + (local160 & 0xFF00) * local11 & 0xFF0000) >> 8;
					}
					arg6 += arg7;
					local110 += local124;
					arg3++;
					if (arg6 < arg1[arg3]) {
						local150 = arg0[arg3];
						local160 = arg2[(local110 & 0xFC0) + (local110 >>> 26)];
						local160 = ((local160 & 0xFF00FF) * local136 & 0xFF00FF00) + ((local160 & 0xFF00) * local136 & 0xFF0000) >> 8;
						arg0[arg3] = ((local150 & 0xFF00FF) * local6 + (local160 & 0xFF00FF) * local11 & 0xFF00FF00) + ((local150 & 0xFF00) * local6 + (local160 & 0xFF00) * local11 & 0xFF0000) >> 8;
					}
					arg6 += arg7;
					local110 += local124;
					arg3++;
					if (arg6 < arg1[arg3]) {
						local150 = arg0[arg3];
						local160 = arg2[(local110 & 0xFC0) + (local110 >>> 26)];
						local160 = ((local160 & 0xFF00FF) * local136 & 0xFF00FF00) + ((local160 & 0xFF00) * local136 & 0xFF0000) >> 8;
						arg0[arg3] = ((local150 & 0xFF00FF) * local6 + (local160 & 0xFF00FF) * local11 & 0xFF00FF00) + ((local150 & 0xFF00) * local6 + (local160 & 0xFF00) * local11 & 0xFF0000) >> 8;
					}
					arg6 += arg7;
					local110 += local124;
					arg3++;
					if (arg6 < arg1[arg3]) {
						local150 = arg0[arg3];
						local160 = arg2[(local110 & 0xFC0) + (local110 >>> 26)];
						local160 = ((local160 & 0xFF00FF) * local136 & 0xFF00FF00) + ((local160 & 0xFF00) * local136 & 0xFF0000) >> 8;
						arg0[arg3] = ((local150 & 0xFF00FF) * local6 + (local160 & 0xFF00FF) * local11 & 0xFF00FF00) + ((local150 & 0xFF00) * local6 + (local160 & 0xFF00) * local11 & 0xFF0000) >> 8;
					}
					arg6 += arg7;
					local110 += local124;
					arg3++;
					if (arg6 < arg1[arg3]) {
						local150 = arg0[arg3];
						local160 = arg2[(local110 & 0xFC0) + (local110 >>> 26)];
						local160 = ((local160 & 0xFF00FF) * local136 & 0xFF00FF00) + ((local160 & 0xFF00) * local136 & 0xFF0000) >> 8;
						arg0[arg3] = ((local150 & 0xFF00FF) * local6 + (local160 & 0xFF00FF) * local11 & 0xFF00FF00) + ((local150 & 0xFF00) * local6 + (local160 & 0xFF00) * local11 & 0xFF0000) >> 8;
					}
					arg6 += arg7;
					local110 += local124;
					arg3++;
					if (arg6 < arg1[arg3]) {
						local150 = arg0[arg3];
						local160 = arg2[(local110 & 0xFC0) + (local110 >>> 26)];
						local160 = ((local160 & 0xFF00FF) * local136 & 0xFF00FF00) + ((local160 & 0xFF00) * local136 & 0xFF0000) >> 8;
						arg0[arg3] = ((local150 & 0xFF00FF) * local6 + (local160 & 0xFF00FF) * local11 & 0xFF00FF00) + ((local150 & 0xFF00) * local6 + (local160 & 0xFF00) * local11 & 0xFF0000) >> 8;
					}
					arg6 += arg7;
					local110 += local124;
					arg3++;
					if (arg6 < arg1[arg3]) {
						local150 = arg0[arg3];
						local160 = arg2[(local110 & 0xFC0) + (local110 >>> 26)];
						local160 = ((local160 & 0xFF00FF) * local136 & 0xFF00FF00) + ((local160 & 0xFF00) * local136 & 0xFF0000) >> 8;
						arg0[arg3] = ((local150 & 0xFF00FF) * local6 + (local160 & 0xFF00FF) * local11 & 0xFF00FF00) + ((local150 & 0xFF00) * local6 + (local160 & 0xFF00) * local11 & 0xFF0000) >> 8;
					}
					arg6 += arg7;
					arg3++;
					local57 = local92;
					local64 = local99;
					arg10 += arg13;
					arg11 += arg14;
					arg12 += arg15;
					if (arg12 == 0.0F) {
						local92 = 0;
						local99 = 0;
					} else {
						local92 = (int) (arg10 * 4096.0F / arg12);
						local99 = (int) (arg11 * 4096.0F / arg12);
					}
					local110 = (local57 << 20) + local64;
					local124 = (local92 - local57 >> 3 << 20) + (local99 - local64 >> 3);
					arg8 += local132;
					local136 = arg8 >> 8;
					local3--;
				} while (local3 > 0);
			}
			local3 = arg5 - arg4 & 0x7;
			if (local3 > 0) {
				do {
					if (arg6 < arg1[arg3]) {
						local150 = arg0[arg3];
						local160 = arg2[(local110 & 0xFC0) + (local110 >>> 26)];
						local160 = ((local160 & 0xFF00FF) * local136 & 0xFF00FF00) + ((local160 & 0xFF00) * local136 & 0xFF0000) >> 8;
						arg0[arg3] = ((local150 & 0xFF00FF) * local6 + (local160 & 0xFF00FF) * local11 & 0xFF00FF00) + ((local150 & 0xFF00) * local6 + (local160 & 0xFF00) * local11 & 0xFF0000) >> 8;
					}
					arg6 += arg7;
					local110 += local124;
					arg3++;
					local3--;
				} while (local3 > 0);
				return;
			}
			return;
		}
		if (local3 > 0) {
			do {
				@Pc(943) int local943;
				if (arg6 < arg1[arg3] && (local943 = arg2[(local110 & 0xFC0) + (local110 >>> 26)]) != 0) {
					local150 = arg0[arg3];
					local160 = ((local943 & 0xFF00FF) * local136 & 0xFF00FF00) + ((local943 & 0xFF00) * local136 & 0xFF0000) >> 8;
					arg0[arg3] = ((local150 & 0xFF00FF) * local6 + (local160 & 0xFF00FF) * local11 & 0xFF00FF00) + ((local150 & 0xFF00) * local6 + (local160 & 0xFF00) * local11 & 0xFF0000) >> 8;
				}
				arg6 += arg7;
				arg3++;
				local110 += local124;
				@Pc(1023) int local1023;
				if (arg6 < arg1[arg3] && (local1023 = arg2[(local110 & 0xFC0) + (local110 >>> 26)]) != 0) {
					local150 = arg0[arg3];
					local160 = ((local1023 & 0xFF00FF) * local136 & 0xFF00FF00) + ((local1023 & 0xFF00) * local136 & 0xFF0000) >> 8;
					arg0[arg3] = ((local150 & 0xFF00FF) * local6 + (local160 & 0xFF00FF) * local11 & 0xFF00FF00) + ((local150 & 0xFF00) * local6 + (local160 & 0xFF00) * local11 & 0xFF0000) >> 8;
				}
				arg6 += arg7;
				arg3++;
				local110 += local124;
				@Pc(1103) int local1103;
				if (arg6 < arg1[arg3] && (local1103 = arg2[(local110 & 0xFC0) + (local110 >>> 26)]) != 0) {
					local150 = arg0[arg3];
					local160 = ((local1103 & 0xFF00FF) * local136 & 0xFF00FF00) + ((local1103 & 0xFF00) * local136 & 0xFF0000) >> 8;
					arg0[arg3] = ((local150 & 0xFF00FF) * local6 + (local160 & 0xFF00FF) * local11 & 0xFF00FF00) + ((local150 & 0xFF00) * local6 + (local160 & 0xFF00) * local11 & 0xFF0000) >> 8;
				}
				arg6 += arg7;
				arg3++;
				local110 += local124;
				@Pc(1183) int local1183;
				if (arg6 < arg1[arg3] && (local1183 = arg2[(local110 & 0xFC0) + (local110 >>> 26)]) != 0) {
					local150 = arg0[arg3];
					local160 = ((local1183 & 0xFF00FF) * local136 & 0xFF00FF00) + ((local1183 & 0xFF00) * local136 & 0xFF0000) >> 8;
					arg0[arg3] = ((local150 & 0xFF00FF) * local6 + (local160 & 0xFF00FF) * local11 & 0xFF00FF00) + ((local150 & 0xFF00) * local6 + (local160 & 0xFF00) * local11 & 0xFF0000) >> 8;
				}
				arg6 += arg7;
				arg3++;
				local110 += local124;
				@Pc(1263) int local1263;
				if (arg6 < arg1[arg3] && (local1263 = arg2[(local110 & 0xFC0) + (local110 >>> 26)]) != 0) {
					local150 = arg0[arg3];
					local160 = ((local1263 & 0xFF00FF) * local136 & 0xFF00FF00) + ((local1263 & 0xFF00) * local136 & 0xFF0000) >> 8;
					arg0[arg3] = ((local150 & 0xFF00FF) * local6 + (local160 & 0xFF00FF) * local11 & 0xFF00FF00) + ((local150 & 0xFF00) * local6 + (local160 & 0xFF00) * local11 & 0xFF0000) >> 8;
				}
				arg6 += arg7;
				arg3++;
				local110 += local124;
				@Pc(1343) int local1343;
				if (arg6 < arg1[arg3] && (local1343 = arg2[(local110 & 0xFC0) + (local110 >>> 26)]) != 0) {
					local150 = arg0[arg3];
					local160 = ((local1343 & 0xFF00FF) * local136 & 0xFF00FF00) + ((local1343 & 0xFF00) * local136 & 0xFF0000) >> 8;
					arg0[arg3] = ((local150 & 0xFF00FF) * local6 + (local160 & 0xFF00FF) * local11 & 0xFF00FF00) + ((local150 & 0xFF00) * local6 + (local160 & 0xFF00) * local11 & 0xFF0000) >> 8;
				}
				arg6 += arg7;
				arg3++;
				local110 += local124;
				@Pc(1423) int local1423;
				if (arg6 < arg1[arg3] && (local1423 = arg2[(local110 & 0xFC0) + (local110 >>> 26)]) != 0) {
					local150 = arg0[arg3];
					local160 = ((local1423 & 0xFF00FF) * local136 & 0xFF00FF00) + ((local1423 & 0xFF00) * local136 & 0xFF0000) >> 8;
					arg0[arg3] = ((local150 & 0xFF00FF) * local6 + (local160 & 0xFF00FF) * local11 & 0xFF00FF00) + ((local150 & 0xFF00) * local6 + (local160 & 0xFF00) * local11 & 0xFF0000) >> 8;
				}
				arg6 += arg7;
				arg3++;
				local110 += local124;
				@Pc(1503) int local1503;
				if (arg6 < arg1[arg3] && (local1503 = arg2[(local110 & 0xFC0) + (local110 >>> 26)]) != 0) {
					local150 = arg0[arg3];
					local160 = ((local1503 & 0xFF00FF) * local136 & 0xFF00FF00) + ((local1503 & 0xFF00) * local136 & 0xFF0000) >> 8;
					arg0[arg3] = ((local150 & 0xFF00FF) * local6 + (local160 & 0xFF00FF) * local11 & 0xFF00FF00) + ((local150 & 0xFF00) * local6 + (local160 & 0xFF00) * local11 & 0xFF0000) >> 8;
				}
				arg6 += arg7;
				arg3++;
				local57 = local92;
				local64 = local99;
				arg10 += arg13;
				arg11 += arg14;
				arg12 += arg15;
				if (arg12 == 0.0F) {
					local92 = 0;
					local99 = 0;
				} else {
					local92 = (int) (arg10 * 4096.0F / arg12);
					local99 = (int) (arg11 * 4096.0F / arg12);
				}
				local110 = (local57 << 20) + local64;
				local124 = (local92 - local57 >> 3 << 20) + (local99 - local64 >> 3);
				arg8 += local132;
				local136 = arg8 >> 8;
				local3--;
			} while (local3 > 0);
		}
		local3 = arg5 - arg4 & 0x7;
		if (local3 <= 0) {
			return;
		}
		do {
			@Pc(1661) int local1661;
			if (arg6 < arg1[arg3] && (local1661 = arg2[(local110 & 0xFC0) + (local110 >>> 26)]) != 0) {
				local150 = arg0[arg3];
				local160 = ((local1661 & 0xFF00FF) * local136 & 0xFF00FF00) + ((local1661 & 0xFF00) * local136 & 0xFF0000) >> 8;
				arg0[arg3] = ((local150 & 0xFF00FF) * local6 + (local160 & 0xFF00FF) * local11 & 0xFF00FF00) + ((local150 & 0xFF00) * local6 + (local160 & 0xFF00) * local11 & 0xFF0000) >> 8;
			}
			arg6 += arg7;
			arg3++;
			local110 += local124;
			local3--;
		} while (local3 > 0);
		return;
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(IIIIIIIIIIII)V")
	public void method2728(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		if (this.aBoolean252) {
			this.aClass12_Sub3_7.method6427(arg9 | 0xFF000000, arg3, arg1, arg4, arg0);
			this.aClass12_Sub3_7.method6427(arg9 | 0xFF000000, arg4, arg2, arg5, arg1);
			this.aClass12_Sub3_7.method6427(arg9 | 0xFF000000, arg5, arg0, arg3, arg2);
			return;
		}
		@Pc(40) int local40 = arg4 - arg3;
		@Pc(44) int local44 = arg1 - arg0;
		@Pc(48) int local48 = arg5 - arg3;
		@Pc(52) int local52 = arg2 - arg0;
		@Pc(56) int local56 = arg7 - arg6;
		@Pc(60) int local60 = arg8 - arg6;
		@Pc(70) int local70 = (arg10 & 0xFF0000) - (arg9 & 0xFF0000) >> 8;
		@Pc(80) int local80 = (arg11 & 0xFF0000) - (arg9 & 0xFF0000) >> 8;
		@Pc(88) int local88 = (arg10 & 0xFF00) - (arg9 & 0xFF00);
		@Pc(96) int local96 = (arg11 & 0xFF00) - (arg9 & 0xFF00);
		@Pc(104) int local104 = (arg10 & 0xFF) - (arg9 & 0xFF);
		@Pc(112) int local112 = (arg11 & 0xFF) - (arg9 & 0xFF);
		@Pc(125) int local125;
		if (arg2 == arg1) {
			local125 = 0;
		} else {
			local125 = (arg5 - arg4 << 16) / (arg2 - arg1);
		}
		@Pc(137) int local137;
		if (arg1 == arg0) {
			local137 = 0;
		} else {
			local137 = (local40 << 16) / local44;
		}
		@Pc(149) int local149;
		if (arg2 == arg0) {
			local149 = 0;
		} else {
			local149 = (local48 << 16) / local52;
		}
		@Pc(160) int local160 = local40 * local52 - local48 * local44;
		if (local160 == 0) {
			return;
		}
		@Pc(175) int local175 = (local56 * local52 - local60 * local44 << 8) / local160;
		@Pc(187) int local187 = (local60 * local40 - local56 * local48 << 8) / local160;
		@Pc(197) int local197 = (local70 * local52 - local80 * local44) / local160;
		@Pc(207) int local207 = (local80 * local40 - local70 * local48) / local160;
		@Pc(217) int local217 = (local88 * local52 - local96 * local44) / local160;
		@Pc(227) int local227 = (local96 * local40 - local88 * local48) / local160;
		@Pc(239) int local239 = (local104 * local52 - local112 * local44 << 8) / local160;
		@Pc(251) int local251 = (local112 * local40 - local104 * local48 << 8) / local160;
		@Pc(298) int local298;
		@Pc(308) int local308;
		@Pc(320) int local320;
		if (arg0 <= arg1 && arg0 <= arg2) {
			if (arg0 < this.anInt3218) {
				if (arg1 > this.anInt3218) {
					arg1 = this.anInt3218;
				}
				if (arg2 > this.anInt3218) {
					arg2 = this.anInt3218;
				}
				arg6 = (arg6 << 8) + local175 - local175 * arg3;
				local298 = (arg9 >> 8 & 0xFF00) + local197 - local197 * arg3;
				local308 = (arg9 & 0xFF00) + local217 - local217 * arg3;
				local320 = ((arg9 & 0xFF) << 8) + local239 - local239 * arg3;
				if (arg1 < arg2) {
					arg5 = arg3 <<= 0x10;
					if (arg0 < 0) {
						arg5 -= local149 * arg0;
						arg3 -= local137 * arg0;
						arg6 -= local187 * arg0;
						local298 -= local207 * arg0;
						local308 -= local227 * arg0;
						local320 -= local251 * arg0;
						arg0 = 0;
					}
					arg4 <<= 0x10;
					if (arg1 < 0) {
						arg4 -= local125 * arg1;
						arg1 = 0;
					}
					if ((arg0 == arg1 || local149 >= local137) && (arg0 != arg1 || local149 <= local125)) {
						arg2 -= arg1;
						arg1 -= arg0;
						arg0 = this.anIntArray190[arg0];
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									this.method2740(this.anIntArray191, this.anIntArray189, arg0, arg4 >> 16, arg5 >> 16, arg6, local175, local298, local197, local308, local217, local320, local239);
									arg5 += local149;
									arg4 += local125;
									arg6 += local187;
									local298 += local207;
									local308 += local227;
									local320 += local251;
									arg0 += this.anInt3220;
								}
							}
							this.method2740(this.anIntArray191, this.anIntArray189, arg0, arg3 >> 16, arg5 >> 16, arg6, local175, local298, local197, local308, local217, local320, local239);
							arg5 += local149;
							arg3 += local137;
							arg6 += local187;
							local298 += local207;
							local308 += local227;
							local320 += local251;
							arg0 += this.anInt3220;
						}
					} else {
						arg2 -= arg1;
						arg1 -= arg0;
						arg0 = this.anIntArray190[arg0];
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									this.method2740(this.anIntArray191, this.anIntArray189, arg0, arg5 >> 16, arg4 >> 16, arg6, local175, local298, local197, local308, local217, local320, local239);
									arg5 += local149;
									arg4 += local125;
									arg6 += local187;
									local298 += local207;
									local308 += local227;
									local320 += local251;
									arg0 += this.anInt3220;
								}
							}
							this.method2740(this.anIntArray191, this.anIntArray189, arg0, arg5 >> 16, arg3 >> 16, arg6, local175, local298, local197, local308, local217, local320, local239);
							arg5 += local149;
							arg3 += local137;
							arg6 += local187;
							local298 += local207;
							local308 += local227;
							local320 += local251;
							arg0 += this.anInt3220;
						}
					}
				} else {
					arg4 = arg3 <<= 0x10;
					if (arg0 < 0) {
						arg4 -= local149 * arg0;
						arg3 -= local137 * arg0;
						arg6 -= local187 * arg0;
						local298 -= local207 * arg0;
						local308 -= local227 * arg0;
						local320 -= local251 * arg0;
						arg0 = 0;
					}
					arg5 <<= 0x10;
					if (arg2 < 0) {
						arg5 -= local125 * arg2;
						arg2 = 0;
					}
					if (arg0 != arg2 && local149 < local137 || arg0 == arg2 && local125 > local137) {
						arg1 -= arg2;
						arg2 -= arg0;
						arg0 = this.anIntArray190[arg0];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return;
									}
									this.method2740(this.anIntArray191, this.anIntArray189, arg0, arg5 >> 16, arg3 >> 16, arg6, local175, local298, local197, local308, local217, local320, local239);
									arg5 += local125;
									arg3 += local137;
									arg6 += local187;
									local298 += local207;
									local308 += local227;
									local320 += local251;
									arg0 += this.anInt3220;
								}
							}
							this.method2740(this.anIntArray191, this.anIntArray189, arg0, arg4 >> 16, arg3 >> 16, arg6, local175, local298, local197, local308, local217, local320, local239);
							arg4 += local149;
							arg3 += local137;
							arg6 += local187;
							local298 += local207;
							local308 += local227;
							local320 += local251;
							arg0 += this.anInt3220;
						}
					} else {
						arg1 -= arg2;
						arg2 -= arg0;
						arg0 = this.anIntArray190[arg0];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return;
									}
									this.method2740(this.anIntArray191, this.anIntArray189, arg0, arg3 >> 16, arg5 >> 16, arg6, local175, local298, local197, local308, local217, local320, local239);
									arg5 += local125;
									arg3 += local137;
									arg6 += local187;
									local298 += local207;
									local308 += local227;
									local320 += local251;
									arg0 += this.anInt3220;
								}
							}
							this.method2740(this.anIntArray191, this.anIntArray189, arg0, arg3 >> 16, arg4 >> 16, arg6, local175, local298, local197, local308, local217, local320, local239);
							arg4 += local149;
							arg3 += local137;
							arg6 += local187;
							local298 += local207;
							local308 += local227;
							local320 += local251;
							arg0 += this.anInt3220;
						}
					}
				}
			}
		} else if (arg1 <= arg2) {
			if (arg1 < this.anInt3218) {
				if (arg2 > this.anInt3218) {
					arg2 = this.anInt3218;
				}
				if (arg0 > this.anInt3218) {
					arg0 = this.anInt3218;
				}
				arg7 = (arg7 << 8) + local175 - local175 * arg4;
				local298 = (arg10 >> 8 & 0xFF00) + local197 - local197 * arg4;
				local308 = (arg10 & 0xFF00) + local217 - local217 * arg4;
				local320 = ((arg10 & 0xFF) << 8) + local239 - local239 * arg4;
				if (arg2 < arg0) {
					arg3 = arg4 <<= 0x10;
					if (arg1 < 0) {
						arg3 -= local137 * arg1;
						arg4 -= local125 * arg1;
						arg7 -= local187 * arg1;
						local298 -= local207 * arg1;
						local308 -= local227 * arg1;
						local320 -= local251 * arg1;
						arg1 = 0;
					}
					arg5 <<= 0x10;
					if (arg2 < 0) {
						arg5 -= local149 * arg2;
						arg2 = 0;
					}
					if ((arg1 == arg2 || local137 >= local125) && (arg1 != arg2 || local137 <= local149)) {
						arg0 -= arg2;
						arg2 -= arg1;
						arg1 = this.anIntArray190[arg1];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return;
									}
									this.method2740(this.anIntArray191, this.anIntArray189, arg1, arg5 >> 16, arg3 >> 16, arg7, local175, local298, local197, local308, local217, local320, local239);
									arg3 += local137;
									arg5 += local149;
									arg7 += local187;
									local298 += local207;
									local308 += local227;
									local320 += local251;
									arg1 += this.anInt3220;
								}
							}
							this.method2740(this.anIntArray191, this.anIntArray189, arg1, arg4 >> 16, arg3 >> 16, arg7, local175, local298, local197, local308, local217, local320, local239);
							arg3 += local137;
							arg4 += local125;
							arg7 += local187;
							local298 += local207;
							local308 += local227;
							local320 += local251;
							arg1 += this.anInt3220;
						}
					} else {
						arg0 -= arg2;
						arg2 -= arg1;
						arg1 = this.anIntArray190[arg1];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return;
									}
									this.method2740(this.anIntArray191, this.anIntArray189, arg1, arg3 >> 16, arg5 >> 16, arg7, local175, local298, local197, local308, local217, local320, local239);
									arg3 += local137;
									arg5 += local149;
									arg7 += local187;
									local298 += local207;
									local308 += local227;
									local320 += local251;
									arg1 += this.anInt3220;
								}
							}
							this.method2740(this.anIntArray191, this.anIntArray189, arg1, arg3 >> 16, arg4 >> 16, arg7, local175, local298, local197, local308, local217, local320, local239);
							arg3 += local137;
							arg4 += local125;
							arg7 += local187;
							local298 += local207;
							local308 += local227;
							local320 += local251;
							arg1 += this.anInt3220;
						}
					}
				} else {
					arg5 = arg4 <<= 0x10;
					if (arg1 < 0) {
						arg5 -= local137 * arg1;
						arg4 -= local125 * arg1;
						arg7 -= local187 * arg1;
						local298 -= local207 * arg1;
						local308 -= local227 * arg1;
						local320 -= local251 * arg1;
						arg1 = 0;
					}
					arg3 <<= 0x10;
					if (arg0 < 0) {
						arg3 -= local149 * arg0;
						arg0 = 0;
					}
					if (local137 < local125) {
						arg2 -= arg0;
						arg0 -= arg1;
						arg1 = this.anIntArray190[arg1];
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									this.method2740(this.anIntArray191, this.anIntArray189, arg1, arg3 >> 16, arg4 >> 16, arg7, local175, local298, local197, local308, local217, local320, local239);
									arg3 += local149;
									arg4 += local125;
									arg7 += local187;
									local298 += local207;
									local308 += local227;
									local320 += local251;
									arg1 += this.anInt3220;
								}
							}
							this.method2740(this.anIntArray191, this.anIntArray189, arg1, arg5 >> 16, arg4 >> 16, arg7, local175, local298, local197, local308, local217, local320, local239);
							arg5 += local137;
							arg4 += local125;
							arg7 += local187;
							local298 += local207;
							local308 += local227;
							local320 += local251;
							arg1 += this.anInt3220;
						}
					} else {
						arg2 -= arg0;
						arg0 -= arg1;
						arg1 = this.anIntArray190[arg1];
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									this.method2740(this.anIntArray191, this.anIntArray189, arg1, arg4 >> 16, arg3 >> 16, arg7, local175, local298, local197, local308, local217, local320, local239);
									arg3 += local149;
									arg4 += local125;
									arg7 += local187;
									local298 += local207;
									local308 += local227;
									local320 += local251;
									arg1 += this.anInt3220;
								}
							}
							this.method2740(this.anIntArray191, this.anIntArray189, arg1, arg4 >> 16, arg5 >> 16, arg7, local175, local298, local197, local308, local217, local320, local239);
							arg5 += local137;
							arg4 += local125;
							arg7 += local187;
							local298 += local207;
							local308 += local227;
							local320 += local251;
							arg1 += this.anInt3220;
						}
					}
				}
			}
		} else if (arg2 < this.anInt3218) {
			if (arg0 > this.anInt3218) {
				arg0 = this.anInt3218;
			}
			if (arg1 > this.anInt3218) {
				arg1 = this.anInt3218;
			}
			arg8 = (arg8 << 8) + local175 - local175 * arg5;
			local298 = (arg11 >> 8 & 0xFF00) + local197 - local197 * arg5;
			local308 = (arg11 & 0xFF00) + local217 - local217 * arg5;
			local320 = ((arg11 & 0xFF) << 8) + local239 - local239 * arg5;
			if (arg0 < arg1) {
				arg4 = arg5 <<= 0x10;
				if (arg2 < 0) {
					arg4 -= local125 * arg2;
					arg5 -= local149 * arg2;
					arg8 -= local187 * arg2;
					local298 -= local207 * arg2;
					local308 -= local227 * arg2;
					local320 -= local251 * arg2;
					arg2 = 0;
				}
				arg3 <<= 0x10;
				if (arg0 < 0) {
					arg3 -= local137 * arg0;
					arg0 = 0;
				}
				if (local125 < local149) {
					arg1 -= arg0;
					arg0 -= arg2;
					arg2 = this.anIntArray190[arg2];
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								this.method2740(this.anIntArray191, this.anIntArray189, arg2, arg4 >> 16, arg3 >> 16, arg8, local175, local298, local197, local308, local217, local320, local239);
								arg4 += local125;
								arg3 += local137;
								arg8 += local187;
								local298 += local207;
								local308 += local227;
								local320 += local251;
								arg2 += this.anInt3220;
							}
						}
						this.method2740(this.anIntArray191, this.anIntArray189, arg2, arg4 >> 16, arg5 >> 16, arg8, local175, local298, local197, local308, local217, local320, local239);
						arg4 += local125;
						arg5 += local149;
						arg8 += local187;
						local298 += local207;
						local308 += local227;
						local320 += local251;
						arg2 += this.anInt3220;
					}
				} else {
					arg1 -= arg0;
					arg0 -= arg2;
					arg2 = this.anIntArray190[arg2];
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								this.method2740(this.anIntArray191, this.anIntArray189, arg2, arg3 >> 16, arg4 >> 16, arg8, local175, local298, local197, local308, local217, local320, local239);
								arg4 += local125;
								arg3 += local137;
								arg8 += local187;
								local298 += local207;
								local308 += local227;
								local320 += local251;
								arg2 += this.anInt3220;
							}
						}
						this.method2740(this.anIntArray191, this.anIntArray189, arg2, arg5 >> 16, arg4 >> 16, arg8, local175, local298, local197, local308, local217, local320, local239);
						arg4 += local125;
						arg5 += local149;
						arg8 += local187;
						local298 += local207;
						local308 += local227;
						local320 += local251;
						arg2 += this.anInt3220;
					}
				}
			} else {
				arg3 = arg5 <<= 0x10;
				if (arg2 < 0) {
					arg3 -= local125 * arg2;
					arg5 -= local149 * arg2;
					arg8 -= local187 * arg2;
					local298 -= local207 * arg2;
					local308 -= local227 * arg2;
					local320 -= local251 * arg2;
					arg2 = 0;
				}
				arg4 <<= 0x10;
				if (arg1 < 0) {
					arg4 -= local137 * arg1;
					arg1 = 0;
				}
				if (local125 < local149) {
					arg0 -= arg1;
					arg1 -= arg2;
					arg2 = this.anIntArray190[arg2];
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								this.method2740(this.anIntArray191, this.anIntArray189, arg2, arg4 >> 16, arg5 >> 16, arg8, local175, local298, local197, local308, local217, local320, local239);
								arg4 += local137;
								arg5 += local149;
								arg8 += local187;
								local298 += local207;
								local308 += local227;
								local320 += local251;
								arg2 += this.anInt3220;
							}
						}
						this.method2740(this.anIntArray191, this.anIntArray189, arg2, arg3 >> 16, arg5 >> 16, arg8, local175, local298, local197, local308, local217, local320, local239);
						arg3 += local125;
						arg5 += local149;
						arg8 += local187;
						local298 += local207;
						local308 += local227;
						local320 += local251;
						arg2 += this.anInt3220;
					}
				} else {
					arg0 -= arg1;
					arg1 -= arg2;
					arg2 = this.anIntArray190[arg2];
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								this.method2740(this.anIntArray191, this.anIntArray189, arg2, arg5 >> 16, arg4 >> 16, arg8, local175, local298, local197, local308, local217, local320, local239);
								arg4 += local137;
								arg5 += local149;
								arg8 += local187;
								local298 += local207;
								local308 += local227;
								local320 += local251;
								arg2 += this.anInt3220;
							}
						}
						this.method2740(this.anIntArray191, this.anIntArray189, arg2, arg5 >> 16, arg3 >> 16, arg8, local175, local298, local197, local308, local217, local320, local239);
						arg3 += local125;
						arg5 += local149;
						arg8 += local187;
						local298 += local207;
						local308 += local227;
						local320 += local251;
						arg2 += this.anInt3220;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!gw", name = "d", descriptor = "([I[IIIIIIIIIIIIIFFFFFF)V")
	private void method2729(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int arg8, @OriginalArg(11) int arg9, @OriginalArg(12) int arg10, @OriginalArg(13) int arg11, @OriginalArg(14) float arg12, @OriginalArg(15) float arg13, @OriginalArg(16) float arg14, @OriginalArg(17) float arg15, @OriginalArg(18) float arg16, @OriginalArg(19) float arg17) {
		if (this.aBoolean250) {
			if (arg4 > this.anInt3217) {
				arg4 = this.anInt3217;
			}
			if (arg3 < 0) {
				arg3 = 0;
			}
		}
		if (arg3 >= arg4) {
			return;
		}
		arg2 += arg3;
		arg7 += arg8 * arg3;
		arg10 += arg11 * arg3;
		arg5 += arg6 * arg3;
		@Pc(43) int local43 = arg4 - arg3;
		@Pc(47) int local47 = arg8 << 3;
		@Pc(51) int local51 = arg7 >> 16;
		@Pc(55) int local55 = 255 - local51;
		@Pc(73) int local73 = ((arg9 & 0xFF00FF) * local51 & 0xFF00FF00 | (arg9 & 0xFF00) * local51 & 0xFF0000) >>> 8;
		@Pc(198) int local198;
		@Pc(186) int local186;
		@Pc(119) int local119;
		@Pc(126) int local126;
		@Pc(154) int local154;
		@Pc(161) int local161;
		@Pc(81) int local81;
		@Pc(219) int local219;
		@Pc(172) int local172;
		@Pc(268) int local268;
		@Pc(267) int local267;
		@Pc(194) int local194;
		@Pc(90) float local90;
		@Pc(99) float local99;
		@Pc(108) float local108;
		if (!this.aBoolean253) {
			local81 = arg3 - this.anInt3215;
			local90 = arg12 + arg15 / 8.0F * (float) local81;
			local99 = arg13 + arg16 / 8.0F * (float) local81;
			local108 = arg14 + arg17 / 8.0F * (float) local81;
			if (local108 == 0.0F) {
				local119 = 0;
				local126 = 0;
			} else {
				local119 = (int) (local90 * 16384.0F / local108);
				local126 = (int) (local99 * 16384.0F / local108);
			}
			arg12 = local90 + arg15;
			arg13 = local99 + arg16;
			arg14 = local108 + arg17;
			if (arg14 == 0.0F) {
				local154 = 0;
				local161 = 0;
			} else {
				local154 = (int) (arg12 * 16384.0F / arg14);
				local161 = (int) (arg13 * 16384.0F / arg14);
			}
			local172 = (local119 << 18) + local126;
			local186 = (local154 - local119 >> 3 << 18) + (local161 - local126 >> 3);
			local43 >>= 0x3;
			local194 = arg11 << 3;
			local198 = arg10 >> 8;
			if (this.aBoolean248) {
				if (local43 > 0) {
					do {
						if (arg5 < this.anIntArray189[arg2]) {
							local219 = arg1[(local172 & 0x3F80) + (local172 >>> 25)];
							@Pc(1778) int local1778 = ((local219 & 0xFF00FF) * local198 & 0xFF00FF00) + ((local219 & 0xFF00) * local198 & 0xFF0000) >> 8;
							arg0[arg2] = (((local1778 & 0xFF00FF) * local55 & 0xFF00FF00 | (local1778 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
						}
						local172 += local186;
						local268 = arg2 + 1;
						local267 = arg5 + arg6;
						if (local267 < this.anIntArray189[local268]) {
							local219 = arg1[(local172 & 0x3F80) + (local172 >>> 25)];
							local219 = ((local219 & 0xFF00FF) * local198 & 0xFF00FF00) + ((local219 & 0xFF00) * local198 & 0xFF0000) >> 8;
							arg0[local268] = (((local219 & 0xFF00FF) * local55 & 0xFF00FF00 | (local219 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
						}
						local172 += local186;
						local268++;
						local267 += arg6;
						if (local267 < this.anIntArray189[local268]) {
							local219 = arg1[(local172 & 0x3F80) + (local172 >>> 25)];
							local219 = ((local219 & 0xFF00FF) * local198 & 0xFF00FF00) + ((local219 & 0xFF00) * local198 & 0xFF0000) >> 8;
							arg0[local268] = (((local219 & 0xFF00FF) * local55 & 0xFF00FF00 | (local219 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
						}
						local172 += local186;
						local268++;
						local267 += arg6;
						if (local267 < this.anIntArray189[local268]) {
							local219 = arg1[(local172 & 0x3F80) + (local172 >>> 25)];
							local219 = ((local219 & 0xFF00FF) * local198 & 0xFF00FF00) + ((local219 & 0xFF00) * local198 & 0xFF0000) >> 8;
							arg0[local268] = (((local219 & 0xFF00FF) * local55 & 0xFF00FF00 | (local219 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
						}
						local172 += local186;
						local268++;
						local267 += arg6;
						if (local267 < this.anIntArray189[local268]) {
							local219 = arg1[(local172 & 0x3F80) + (local172 >>> 25)];
							local219 = ((local219 & 0xFF00FF) * local198 & 0xFF00FF00) + ((local219 & 0xFF00) * local198 & 0xFF0000) >> 8;
							arg0[local268] = (((local219 & 0xFF00FF) * local55 & 0xFF00FF00 | (local219 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
						}
						local172 += local186;
						local268++;
						local267 += arg6;
						if (local267 < this.anIntArray189[local268]) {
							local219 = arg1[(local172 & 0x3F80) + (local172 >>> 25)];
							local219 = ((local219 & 0xFF00FF) * local198 & 0xFF00FF00) + ((local219 & 0xFF00) * local198 & 0xFF0000) >> 8;
							arg0[local268] = (((local219 & 0xFF00FF) * local55 & 0xFF00FF00 | (local219 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
						}
						local172 += local186;
						local268++;
						local267 += arg6;
						if (local267 < this.anIntArray189[local268]) {
							local219 = arg1[(local172 & 0x3F80) + (local172 >>> 25)];
							local219 = ((local219 & 0xFF00FF) * local198 & 0xFF00FF00) + ((local219 & 0xFF00) * local198 & 0xFF0000) >> 8;
							arg0[local268] = (((local219 & 0xFF00FF) * local55 & 0xFF00FF00 | (local219 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
						}
						local172 += local186;
						local268++;
						local267 += arg6;
						if (local267 < this.anIntArray189[local268]) {
							local219 = arg1[(local172 & 0x3F80) + (local172 >>> 25)];
							local219 = ((local219 & 0xFF00FF) * local198 & 0xFF00FF00) + ((local219 & 0xFF00) * local198 & 0xFF0000) >> 8;
							arg0[local268] = (((local219 & 0xFF00FF) * local55 & 0xFF00FF00 | (local219 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
						}
						arg2 = local268 + 1;
						arg5 = local267 + arg6;
						local119 = local154;
						local126 = local161;
						arg12 += arg15;
						arg13 += arg16;
						arg14 += arg17;
						if (arg14 == 0.0F) {
							local154 = 0;
							local161 = 0;
						} else {
							local154 = (int) (arg12 * 16384.0F / arg14);
							local161 = (int) (arg13 * 16384.0F / arg14);
						}
						local172 = (local119 << 18) + local126;
						local186 = (local154 - local119 >> 3 << 18) + (local161 - local126 >> 3);
						arg10 += local194;
						local198 = arg10 >> 8;
						arg7 += local47;
						local51 = arg7 >> 16;
						local55 = 255 - local51;
						local73 = ((arg9 & 0xFF00FF) * local51 & 0xFF00FF00 | (arg9 & 0xFF00) * local51 & 0xFF0000) >>> 8;
						local43--;
					} while (local43 > 0);
				}
				local43 = arg4 - arg3 & 0x7;
				if (local43 > 0) {
					do {
						if (arg5 < this.anIntArray189[arg2]) {
							local219 = arg1[(local172 & 0x3F80) + (local172 >>> 25)];
							local219 = ((local219 & 0xFF00FF) * local198 & 0xFF00FF00) + ((local219 & 0xFF00) * local198 & 0xFF0000) >> 8;
							arg0[arg2] = (((local219 & 0xFF00FF) * local55 & 0xFF00FF00 | (local219 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
						}
						local172 += local186;
						arg2++;
						arg5 += arg6;
						local43--;
					} while (local43 > 0);
					return;
				}
			} else {
				if (local43 > 0) {
					do {
						@Pc(2460) int local2460;
						if (arg5 < this.anIntArray189[arg2] && (local2460 = arg1[(local172 & 0x3F80) + (local172 >>> 25)]) != 0) {
							local219 = ((local2460 & 0xFF00FF) * local198 & 0xFF00FF00) + ((local2460 & 0xFF00) * local198 & 0xFF0000) >> 8;
							arg0[arg2] = (((local219 & 0xFF00FF) * local55 & 0xFF00FF00 | (local219 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
						}
						local268 = arg2 + 1;
						local172 += local186;
						local267 = arg5 + arg6;
						@Pc(2527) int local2527;
						if (local267 < this.anIntArray189[local268] && (local2527 = arg1[(local172 & 0x3F80) + (local172 >>> 25)]) != 0) {
							local219 = ((local2527 & 0xFF00FF) * local198 & 0xFF00FF00) + ((local2527 & 0xFF00) * local198 & 0xFF0000) >> 8;
							arg0[local268] = (((local219 & 0xFF00FF) * local55 & 0xFF00FF00 | (local219 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
						}
						local268++;
						local172 += local186;
						local267 += arg6;
						@Pc(2594) int local2594;
						if (local267 < this.anIntArray189[local268] && (local2594 = arg1[(local172 & 0x3F80) + (local172 >>> 25)]) != 0) {
							local219 = ((local2594 & 0xFF00FF) * local198 & 0xFF00FF00) + ((local2594 & 0xFF00) * local198 & 0xFF0000) >> 8;
							arg0[local268] = (((local219 & 0xFF00FF) * local55 & 0xFF00FF00 | (local219 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
						}
						local268++;
						local172 += local186;
						local267 += arg6;
						@Pc(2661) int local2661;
						if (local267 < this.anIntArray189[local268] && (local2661 = arg1[(local172 & 0x3F80) + (local172 >>> 25)]) != 0) {
							local219 = ((local2661 & 0xFF00FF) * local198 & 0xFF00FF00) + ((local2661 & 0xFF00) * local198 & 0xFF0000) >> 8;
							arg0[local268] = (((local219 & 0xFF00FF) * local55 & 0xFF00FF00 | (local219 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
						}
						local268++;
						local172 += local186;
						local267 += arg6;
						@Pc(2728) int local2728;
						if (local267 < this.anIntArray189[local268] && (local2728 = arg1[(local172 & 0x3F80) + (local172 >>> 25)]) != 0) {
							local219 = ((local2728 & 0xFF00FF) * local198 & 0xFF00FF00) + ((local2728 & 0xFF00) * local198 & 0xFF0000) >> 8;
							arg0[local268] = (((local219 & 0xFF00FF) * local55 & 0xFF00FF00 | (local219 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
						}
						local268++;
						local172 += local186;
						local267 += arg6;
						@Pc(2795) int local2795;
						if (local267 < this.anIntArray189[local268] && (local2795 = arg1[(local172 & 0x3F80) + (local172 >>> 25)]) != 0) {
							local219 = ((local2795 & 0xFF00FF) * local198 & 0xFF00FF00) + ((local2795 & 0xFF00) * local198 & 0xFF0000) >> 8;
							arg0[local268] = (((local219 & 0xFF00FF) * local55 & 0xFF00FF00 | (local219 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
						}
						local268++;
						local172 += local186;
						local267 += arg6;
						@Pc(2862) int local2862;
						if (local267 < this.anIntArray189[local268] && (local2862 = arg1[(local172 & 0x3F80) + (local172 >>> 25)]) != 0) {
							local219 = ((local2862 & 0xFF00FF) * local198 & 0xFF00FF00) + ((local2862 & 0xFF00) * local198 & 0xFF0000) >> 8;
							arg0[local268] = (((local219 & 0xFF00FF) * local55 & 0xFF00FF00 | (local219 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
						}
						local268++;
						local172 += local186;
						local267 += arg6;
						@Pc(2929) int local2929;
						if (local267 < this.anIntArray189[local268] && (local2929 = arg1[(local172 & 0x3F80) + (local172 >>> 25)]) != 0) {
							local219 = ((local2929 & 0xFF00FF) * local198 & 0xFF00FF00) + ((local2929 & 0xFF00) * local198 & 0xFF0000) >> 8;
							arg0[local268] = (((local219 & 0xFF00FF) * local55 & 0xFF00FF00 | (local219 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
						}
						arg2 = local268 + 1;
						arg5 = local267 + arg6;
						local119 = local154;
						local126 = local161;
						arg12 += arg15;
						arg13 += arg16;
						arg14 += arg17;
						if (arg14 == 0.0F) {
							local154 = 0;
							local161 = 0;
						} else {
							local154 = (int) (arg12 / arg14 * 16384.0F);
							local161 = (int) (arg13 / arg14 * 16384.0F);
						}
						local172 = (local119 << 18) + local126;
						local186 = (local154 - local119 >> 3 << 18) + (local161 - local126 >> 3);
						arg10 += local194;
						local198 = arg10 >> 8;
						arg7 += local47;
						local51 = arg7 >> 16;
						local55 = 255 - local51;
						local73 = ((arg9 & 0xFF00FF) * local51 & 0xFF00FF00 | (arg9 & 0xFF00) * local51 & 0xFF0000) >>> 8;
						local43--;
					} while (local43 > 0);
				}
				local43 = arg4 - arg3 & 0x7;
				if (local43 > 0) {
					do {
						@Pc(3104) int local3104;
						if (arg5 < this.anIntArray189[arg2] && (local3104 = arg1[(local172 & 0x3F80) + (local172 >>> 25)]) != 0) {
							local219 = ((local3104 & 0xFF00FF) * local198 & 0xFF00FF00) + ((local3104 & 0xFF00) * local198 & 0xFF0000) >> 8;
							arg0[arg2] = (((local219 & 0xFF00FF) * local55 & 0xFF00FF00 | (local219 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
						}
						arg2++;
						local172 += local186;
						arg5 += arg6;
						local43--;
					} while (local43 > 0);
				}
			}
			return;
		}
		local81 = arg3 - this.anInt3215;
		local90 = arg12 + arg15 / 8.0F * (float) local81;
		local99 = arg13 + arg16 / 8.0F * (float) local81;
		local108 = arg14 + arg17 / 8.0F * (float) local81;
		if (local108 == 0.0F) {
			local119 = 0;
			local126 = 0;
		} else {
			local119 = (int) (local90 * 4096.0F / local108);
			local126 = (int) (local99 * 4096.0F / local108);
		}
		arg12 = local90 + arg15;
		arg13 = local99 + arg16;
		arg14 = local108 + arg17;
		if (arg14 == 0.0F) {
			local154 = 0;
			local161 = 0;
		} else {
			local154 = (int) (arg12 * 4096.0F / arg14);
			local161 = (int) (arg13 * 4096.0F / arg14);
		}
		local172 = (local119 << 20) + local126;
		local186 = (local154 - local119 >> 3 << 20) + (local161 - local126 >> 3);
		local43 >>= 0x3;
		local194 = arg11 << 3;
		local198 = arg10 >> 8;
		if (this.aBoolean248) {
			if (local43 > 0) {
				do {
					if (arg5 < this.anIntArray189[arg2]) {
						local219 = arg1[(local172 & 0xFC0) + (local172 >>> 26)];
						local219 = ((local219 & 0xFF00FF) * local198 & 0xFF00FF00) + ((local219 & 0xFF00) * local198 & 0xFF0000) >> 8;
						arg0[arg2] = (((local219 & 0xFF00FF) * local55 & 0xFF00FF00 | (local219 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
					}
					local172 += local186;
					local267 = arg5 + arg6;
					local268 = arg2 + 1;
					if (local267 < this.anIntArray189[local268]) {
						local219 = arg1[(local172 & 0xFC0) + (local172 >>> 26)];
						local219 = ((local219 & 0xFF00FF) * local198 & 0xFF00FF00) + ((local219 & 0xFF00) * local198 & 0xFF0000) >> 8;
						arg0[local268] = (((local219 & 0xFF00FF) * local55 & 0xFF00FF00 | (local219 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
					}
					local172 += local186;
					local267 += arg6;
					local268++;
					if (local267 < this.anIntArray189[local268]) {
						local219 = arg1[(local172 & 0xFC0) + (local172 >>> 26)];
						local219 = ((local219 & 0xFF00FF) * local198 & 0xFF00FF00) + ((local219 & 0xFF00) * local198 & 0xFF0000) >> 8;
						arg0[local268] = (((local219 & 0xFF00FF) * local55 & 0xFF00FF00 | (local219 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
					}
					local172 += local186;
					local267 += arg6;
					local268++;
					if (local267 < this.anIntArray189[local268]) {
						local219 = arg1[(local172 & 0xFC0) + (local172 >>> 26)];
						local219 = ((local219 & 0xFF00FF) * local198 & 0xFF00FF00) + ((local219 & 0xFF00) * local198 & 0xFF0000) >> 8;
						arg0[local268] = (((local219 & 0xFF00FF) * local55 & 0xFF00FF00 | (local219 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
					}
					local172 += local186;
					local267 += arg6;
					local268++;
					if (local267 < this.anIntArray189[local268]) {
						local219 = arg1[(local172 & 0xFC0) + (local172 >>> 26)];
						local219 = ((local219 & 0xFF00FF) * local198 & 0xFF00FF00) + ((local219 & 0xFF00) * local198 & 0xFF0000) >> 8;
						arg0[local268] = (((local219 & 0xFF00FF) * local55 & 0xFF00FF00 | (local219 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
					}
					local172 += local186;
					local267 += arg6;
					local268++;
					if (local267 < this.anIntArray189[local268]) {
						local219 = arg1[(local172 & 0xFC0) + (local172 >>> 26)];
						local219 = ((local219 & 0xFF00FF) * local198 & 0xFF00FF00) + ((local219 & 0xFF00) * local198 & 0xFF0000) >> 8;
						arg0[local268] = (((local219 & 0xFF00FF) * local55 & 0xFF00FF00 | (local219 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
					}
					local172 += local186;
					local267 += arg6;
					local268++;
					if (local267 < this.anIntArray189[local268]) {
						local219 = arg1[(local172 & 0xFC0) + (local172 >>> 26)];
						local219 = ((local219 & 0xFF00FF) * local198 & 0xFF00FF00) + ((local219 & 0xFF00) * local198 & 0xFF0000) >> 8;
						arg0[local268] = (((local219 & 0xFF00FF) * local55 & 0xFF00FF00 | (local219 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
					}
					local172 += local186;
					local267 += arg6;
					local268++;
					if (local267 < this.anIntArray189[local268]) {
						local219 = arg1[(local172 & 0xFC0) + (local172 >>> 26)];
						local219 = ((local219 & 0xFF00FF) * local198 & 0xFF00FF00) + ((local219 & 0xFF00) * local198 & 0xFF0000) >> 8;
						arg0[local268] = (((local219 & 0xFF00FF) * local55 & 0xFF00FF00 | (local219 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
					}
					arg5 = local267 + arg6;
					arg2 = local268 + 1;
					local119 = local154;
					local126 = local161;
					arg12 += arg15;
					arg13 += arg16;
					arg14 += arg17;
					if (arg14 == 0.0F) {
						local154 = 0;
						local161 = 0;
					} else {
						local154 = (int) (arg12 * 4096.0F / arg14);
						local161 = (int) (arg13 * 4096.0F / arg14);
					}
					local172 = (local119 << 20) + local126;
					local186 = (local154 - local119 >> 3 << 20) + (local161 - local126 >> 3);
					arg10 += local194;
					local198 = arg10 >> 8;
					arg7 += local47;
					local51 = arg7 >> 16;
					local55 = 255 - local51;
					local73 = ((arg9 & 0xFF00FF) * local51 & 0xFF00FF00 | (arg9 & 0xFF00) * local51 & 0xFF0000) >>> 8;
					local43--;
				} while (local43 > 0);
			}
			local43 = arg4 - arg3 & 0x7;
			if (local43 > 0) {
				do {
					if (arg5 < this.anIntArray189[arg2]) {
						local219 = arg1[(local172 & 0xFC0) + (local172 >>> 26)];
						local219 = ((local219 & 0xFF00FF) * local198 & 0xFF00FF00) + ((local219 & 0xFF00) * local198 & 0xFF0000) >> 8;
						arg0[arg2] = (((local219 & 0xFF00FF) * local55 & 0xFF00FF00 | (local219 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
					}
					local172 += local186;
					arg5 += arg6;
					arg2++;
					local43--;
				} while (local43 > 0);
				return;
			}
		} else {
			if (local43 > 0) {
				do {
					@Pc(919) int local919;
					if (arg5 < this.anIntArray189[arg2] && (local919 = arg1[(local172 & 0xFC0) + (local172 >>> 26)]) != 0) {
						local219 = ((local919 & 0xFF00FF) * local198 & 0xFF00FF00) + ((local919 & 0xFF00) * local198 & 0xFF0000) >> 8;
						arg0[arg2] = (((local219 & 0xFF00FF) * local55 & 0xFF00FF00 | (local219 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
					}
					local268 = arg2 + 1;
					local172 += local186;
					local267 = arg5 + arg6;
					@Pc(986) int local986;
					if (local267 < this.anIntArray189[local268] && (local986 = arg1[(local172 & 0xFC0) + (local172 >>> 26)]) != 0) {
						local219 = ((local986 & 0xFF00FF) * local198 & 0xFF00FF00) + ((local986 & 0xFF00) * local198 & 0xFF0000) >> 8;
						arg0[local268] = (((local219 & 0xFF00FF) * local55 & 0xFF00FF00 | (local219 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
					}
					local268++;
					local172 += local186;
					local267 += arg6;
					@Pc(1053) int local1053;
					if (local267 < this.anIntArray189[local268] && (local1053 = arg1[(local172 & 0xFC0) + (local172 >>> 26)]) != 0) {
						local219 = ((local1053 & 0xFF00FF) * local198 & 0xFF00FF00) + ((local1053 & 0xFF00) * local198 & 0xFF0000) >> 8;
						arg0[local268] = (((local219 & 0xFF00FF) * local55 & 0xFF00FF00 | (local219 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
					}
					local268++;
					local172 += local186;
					local267 += arg6;
					@Pc(1120) int local1120;
					if (local267 < this.anIntArray189[local268] && (local1120 = arg1[(local172 & 0xFC0) + (local172 >>> 26)]) != 0) {
						local219 = ((local1120 & 0xFF00FF) * local198 & 0xFF00FF00) + ((local1120 & 0xFF00) * local198 & 0xFF0000) >> 8;
						arg0[local268] = (((local219 & 0xFF00FF) * local55 & 0xFF00FF00 | (local219 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
					}
					local268++;
					local172 += local186;
					local267 += arg6;
					@Pc(1187) int local1187;
					if (local267 < this.anIntArray189[local268] && (local1187 = arg1[(local172 & 0xFC0) + (local172 >>> 26)]) != 0) {
						local219 = ((local1187 & 0xFF00FF) * local198 & 0xFF00FF00) + ((local1187 & 0xFF00) * local198 & 0xFF0000) >> 8;
						arg0[local268] = (((local219 & 0xFF00FF) * local55 & 0xFF00FF00 | (local219 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
					}
					local268++;
					local172 += local186;
					local267 += arg6;
					@Pc(1254) int local1254;
					if (local267 < this.anIntArray189[local268] && (local1254 = arg1[(local172 & 0xFC0) + (local172 >>> 26)]) != 0) {
						local219 = ((local1254 & 0xFF00FF) * local198 & 0xFF00FF00) + ((local1254 & 0xFF00) * local198 & 0xFF0000) >> 8;
						arg0[local268] = (((local219 & 0xFF00FF) * local55 & 0xFF00FF00 | (local219 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
					}
					local268++;
					local172 += local186;
					local267 += arg6;
					@Pc(1321) int local1321;
					if (local267 < this.anIntArray189[local268] && (local1321 = arg1[(local172 & 0xFC0) + (local172 >>> 26)]) != 0) {
						local219 = ((local1321 & 0xFF00FF) * local198 & 0xFF00FF00) + ((local1321 & 0xFF00) * local198 & 0xFF0000) >> 8;
						arg0[local268] = (((local219 & 0xFF00FF) * local55 & 0xFF00FF00 | (local219 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
					}
					local268++;
					local172 += local186;
					local267 += arg6;
					@Pc(1388) int local1388;
					if (local267 < this.anIntArray189[local268] && (local1388 = arg1[(local172 & 0xFC0) + (local172 >>> 26)]) != 0) {
						local219 = ((local1388 & 0xFF00FF) * local198 & 0xFF00FF00) + ((local1388 & 0xFF00) * local198 & 0xFF0000) >> 8;
						arg0[local268] = (((local219 & 0xFF00FF) * local55 & 0xFF00FF00 | (local219 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
					}
					arg2 = local268 + 1;
					arg5 = local267 + arg6;
					local119 = local154;
					local126 = local161;
					arg12 += arg15;
					arg13 += arg16;
					arg14 += arg17;
					if (arg14 == 0.0F) {
						local154 = 0;
						local161 = 0;
					} else {
						local154 = (int) (arg12 * 4096.0F / arg14);
						local161 = (int) (arg13 * 4096.0F / arg14);
					}
					local172 = (local119 << 20) + local126;
					local186 = (local154 - local119 >> 3 << 20) + (local161 - local126 >> 3);
					arg10 += local194;
					local198 = arg10 >> 8;
					arg7 += local47;
					local51 = arg7 >> 16;
					local55 = 255 - local51;
					local73 = ((arg9 & 0xFF00FF) * local51 & 0xFF00FF00 | (arg9 & 0xFF00) * local51 & 0xFF0000) >>> 8;
					local43--;
				} while (local43 > 0);
			}
			local43 = arg4 - arg3 & 0x7;
			if (local43 <= 0) {
				return;
			}
			do {
				@Pc(1563) int local1563;
				if (arg5 < this.anIntArray189[arg2] && (local1563 = arg1[(local172 & 0xFC0) + (local172 >>> 26)]) != 0) {
					local219 = ((local1563 & 0xFF00FF) * local198 & 0xFF00FF00) + ((local1563 & 0xFF00) * local198 & 0xFF0000) >> 8;
					arg0[arg2] = (((local219 & 0xFF00FF) * local55 & 0xFF00FF00 | (local219 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
				}
				arg2++;
				local172 += local186;
				arg5 += arg6;
				local43--;
			} while (local43 > 0);
		}
		return;
	}

	@OriginalMember(owner = "client!gw", name = "b", descriptor = "([I[I[IIIIIIIIIIFFFFFF)V")
	private void method2730(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int arg8, @OriginalArg(11) int arg9, @OriginalArg(12) float arg10, @OriginalArg(13) float arg11, @OriginalArg(14) float arg12, @OriginalArg(15) float arg13, @OriginalArg(16) float arg14, @OriginalArg(17) float arg15) {
		if (this.aBoolean250) {
			if (arg5 > this.anInt3217) {
				arg5 = this.anInt3217;
			}
			if (arg4 < 0) {
				arg4 = 0;
			}
		}
		if (arg4 >= arg5) {
			return;
		}
		@Pc(21) int local21 = arg3 + arg4;
		@Pc(27) int local27 = arg8 + arg9 * arg4;
		@Pc(33) int local33 = arg6 + arg7 * arg4;
		if (this.anInt3219 == 0) {
			if (this.aClass216_1.aBoolean425) {
				this.method2733(arg0, arg1, arg2, local21, arg4, arg5, local33, arg7, local27, arg9, arg10, arg11, arg12, arg13, arg14, arg15);
			} else {
				this.method2739(arg0, arg1, arg2, local21, arg4, arg5, local33, arg7, local27, arg9, arg10, arg11, arg12, arg13, arg14, arg15);
			}
		} else if (this.aClass216_1.aBoolean425) {
			this.method2736(arg0, arg1, arg2, local21, arg4, arg5, local33, arg7, local27, arg9, arg10, arg11, arg12, arg13, arg14, arg15);
		} else {
			this.method2726(arg0, arg1, arg2, local21, arg4, arg5, local33, arg7, local27, arg9, arg10, arg11, arg12, arg13, arg14, arg15);
		}
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIIIIIIIII)V")
	public void method2731(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) int arg17, @OriginalArg(18) int arg18, @OriginalArg(19) int arg19, @OriginalArg(20) int arg20, @OriginalArg(21) int arg21, @OriginalArg(22) int arg22, @OriginalArg(23) int arg23, @OriginalArg(24) int arg24, @OriginalArg(25) int arg25) {
		@Pc(4) int[] local4 = this.aClass12_Sub3_7.method6487(arg25);
		@Pc(11) int local11;
		if (local4 == null) {
			local11 = this.aClass12_Sub3_7.method6481(arg25);
			this.method2728(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, Static463.method6578(local11, arg9 | arg10 << 24), Static463.method6578(local11, arg9 | arg11 << 24), Static463.method6578(local11, arg9 | arg12 << 24));
			return;
		}
		this.aBoolean253 = this.aClass12_Sub3_7.method6480(arg25);
		this.aBoolean248 = this.aClass12_Sub3_7.method6476(arg25);
		local11 = arg4 - arg3;
		@Pc(67) int local67 = arg1 - arg0;
		@Pc(71) int local71 = arg5 - arg3;
		@Pc(75) int local75 = arg2 - arg0;
		@Pc(79) int local79 = arg7 - arg6;
		@Pc(83) int local83 = arg8 - arg6;
		@Pc(85) int local85 = 0;
		if (arg1 != arg0) {
			local85 = (arg4 - arg3 << 16) / (arg1 - arg0);
		}
		@Pc(100) int local100 = 0;
		if (arg2 != arg1) {
			local100 = (arg5 - arg4 << 16) / (arg2 - arg1);
		}
		@Pc(115) int local115 = 0;
		if (arg2 != arg0) {
			local115 = (arg3 - arg5 << 16) / (arg0 - arg2);
		}
		@Pc(136) int local136 = local11 * local75 - local71 * local67;
		if (local136 == 0) {
			return;
		}
		@Pc(143) int local143 = arg11 - arg10;
		@Pc(147) int local147 = arg12 - arg10;
		@Pc(159) int local159 = (local143 * local75 - local147 * local67 << 16) / local136;
		@Pc(171) int local171 = (local147 * local11 - local143 * local71 << 16) / local136;
		@Pc(175) int local175 = arg14 - arg13;
		@Pc(179) int local179 = arg15 - arg13;
		@Pc(191) int local191 = (local175 * local75 - local179 * local67 << 9) / local136;
		@Pc(203) int local203 = (local179 * local11 - local175 * local71 << 9) / local136;
		@Pc(215) int local215 = (local79 * local75 - local83 * local67 << 8) / local136;
		@Pc(227) int local227 = (local83 * local11 - local79 * local71 << 8) / local136;
		@Pc(234) float local234 = 8.0F / (float) this.aClass12_Sub3_7.anInt7804;
		@Pc(239) float local239 = (float) this.aClass12_Sub3_7.anInt7797;
		@Pc(243) int local243 = arg16 - arg17;
		@Pc(247) int local247 = arg19 - arg20;
		@Pc(251) int local251 = arg22 - arg23;
		@Pc(255) int local255 = arg18 - arg16;
		@Pc(259) int local259 = arg21 - arg19;
		@Pc(263) int local263 = arg24 - arg22;
		@Pc(272) float local272 = (float) (local255 * arg19 - local259 * arg16);
		@Pc(283) float local283 = (float) (local259 * arg22 - local263 * arg19) * local234;
		@Pc(294) float local294 = (float) (local263 * arg16 - local255 * arg22) / local239;
		@Pc(303) float local303 = (float) (local243 * arg19 - local247 * arg16);
		@Pc(314) float local314 = (float) (local247 * arg22 - local251 * arg19) * local234;
		@Pc(325) float local325 = (float) (local251 * arg16 - local243 * arg22) / local239;
		@Pc(334) float local334 = (float) (local247 * local255 - local243 * local259);
		@Pc(345) float local345 = (float) (local251 * local259 - local247 * local263) * local234;
		@Pc(356) float local356 = (float) (local243 * local263 - local251 * local255) / local239;
		@Pc(473) int local473;
		if (arg0 <= arg1 && arg0 <= arg2) {
			if (arg0 < this.anInt3218) {
				if (arg1 > this.anInt3218) {
					arg1 = this.anInt3218;
				}
				if (arg2 > this.anInt3218) {
					arg2 = this.anInt3218;
				}
				arg10 = (arg10 << 16) + local159 - local159 * arg3;
				arg13 = (arg13 << 9) + local191 - local191 * arg3;
				arg6 = (arg6 << 8) + local215 - local215 * arg3;
				if (arg1 < arg2) {
					arg5 = arg3 <<= 0x10;
					if (arg0 < 0) {
						arg5 -= local115 * arg0;
						arg3 -= local85 * arg0;
						arg10 -= local171 * arg0;
						arg13 -= local203 * arg0;
						arg6 -= local227 * arg0;
						arg0 = 0;
					}
					arg4 <<= 0x10;
					if (arg1 < 0) {
						arg4 -= local100 * arg1;
						arg1 = 0;
					}
					local473 = arg0 - this.anInt3216;
					local272 += local294 * (float) local473;
					local303 += local325 * (float) local473;
					local334 += local356 * (float) local473;
					if (arg0 != arg1 && local115 < local85 || arg0 == arg1 && local115 > local100) {
						arg2 -= arg1;
						arg1 -= arg0;
						arg0 = this.anIntArray190[arg0];
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									this.method2724(this.anIntArray191, local4, arg0, arg5 >> 16, arg4 >> 16, arg6, local215, arg10, local159, arg9, arg13, local191, local272, local303, local334, local283, local314, local345);
									arg5 += local115;
									arg4 += local100;
									arg10 += local171;
									arg13 += local203;
									arg6 += local227;
									arg0 += this.anInt3220;
									local272 += local294;
									local303 += local325;
									local334 += local356;
								}
							}
							this.method2724(this.anIntArray191, local4, arg0, arg5 >> 16, arg3 >> 16, arg6, local215, arg10, local159, arg9, arg13, local191, local272, local303, local334, local283, local314, local345);
							arg5 += local115;
							arg3 += local85;
							arg10 += local171;
							arg13 += local203;
							arg6 += local227;
							arg0 += this.anInt3220;
							local272 += local294;
							local303 += local325;
							local334 += local356;
						}
					} else {
						arg2 -= arg1;
						arg1 -= arg0;
						arg0 = this.anIntArray190[arg0];
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									this.method2724(this.anIntArray191, local4, arg0, arg4 >> 16, arg5 >> 16, arg6, local215, arg10, local159, arg9, arg13, local191, local272, local303, local334, local283, local314, local345);
									arg5 += local115;
									arg4 += local100;
									arg10 += local171;
									arg13 += local203;
									arg6 += local227;
									arg0 += this.anInt3220;
									local272 += local294;
									local303 += local325;
									local334 += local356;
								}
							}
							this.method2724(this.anIntArray191, local4, arg0, arg3 >> 16, arg5 >> 16, arg6, local215, arg10, local159, arg9, arg13, local191, local272, local303, local334, local283, local314, local345);
							arg5 += local115;
							arg3 += local85;
							arg10 += local171;
							arg13 += local203;
							arg6 += local227;
							arg0 += this.anInt3220;
							local272 += local294;
							local303 += local325;
							local334 += local356;
						}
					}
				} else {
					arg4 = arg3 <<= 0x10;
					if (arg0 < 0) {
						arg4 -= local115 * arg0;
						arg3 -= local85 * arg0;
						arg10 -= local171 * arg0;
						arg13 -= local203 * arg0;
						arg6 -= local227 * arg0;
						arg0 = 0;
					}
					arg5 <<= 0x10;
					if (arg2 < 0) {
						arg5 -= local100 * arg2;
						arg2 = 0;
					}
					local473 = arg0 - this.anInt3216;
					local272 += local294 * (float) local473;
					local303 += local325 * (float) local473;
					local334 += local356 * (float) local473;
					if ((arg0 == arg2 || local115 >= local85) && (arg0 != arg2 || local100 <= local85)) {
						arg1 -= arg2;
						arg2 -= arg0;
						arg0 = this.anIntArray190[arg0];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return;
									}
									this.method2724(this.anIntArray191, local4, arg0, arg3 >> 16, arg5 >> 16, arg6, local215, arg10, local159, arg9, arg13, local191, local272, local303, local334, local283, local314, local345);
									arg5 += local100;
									arg3 += local85;
									arg10 += local171;
									arg13 += local203;
									arg6 += local227;
									arg0 += this.anInt3220;
									local272 += local294;
									local303 += local325;
									local334 += local356;
								}
							}
							this.method2724(this.anIntArray191, local4, arg0, arg3 >> 16, arg4 >> 16, arg6, local215, arg10, local159, arg9, arg13, local191, local272, local303, local334, local283, local314, local345);
							arg4 += local115;
							arg3 += local85;
							arg10 += local171;
							arg13 += local203;
							arg6 += local227;
							arg0 += this.anInt3220;
							local272 += local294;
							local303 += local325;
							local334 += local356;
						}
					} else {
						arg1 -= arg2;
						arg2 -= arg0;
						arg0 = this.anIntArray190[arg0];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return;
									}
									this.method2724(this.anIntArray191, local4, arg0, arg5 >> 16, arg3 >> 16, arg6, local215, arg10, local159, arg9, arg13, local191, local272, local303, local334, local283, local314, local345);
									arg5 += local100;
									arg3 += local85;
									arg10 += local171;
									arg13 += local203;
									arg6 += local227;
									arg0 += this.anInt3220;
									local272 += local294;
									local303 += local325;
									local334 += local356;
								}
							}
							this.method2724(this.anIntArray191, local4, arg0, arg4 >> 16, arg3 >> 16, arg6, local215, arg10, local159, arg9, arg13, local191, local272, local303, local334, local283, local314, local345);
							arg4 += local115;
							arg3 += local85;
							arg10 += local171;
							arg13 += local203;
							arg6 += local227;
							arg0 += this.anInt3220;
							local272 += local294;
							local303 += local325;
							local334 += local356;
						}
					}
				}
			}
		} else if (arg1 <= arg2) {
			if (arg1 < this.anInt3218) {
				if (arg2 > this.anInt3218) {
					arg2 = this.anInt3218;
				}
				if (arg0 > this.anInt3218) {
					arg0 = this.anInt3218;
				}
				arg11 = (arg11 << 16) + local159 - local159 * arg4;
				arg14 = (arg14 << 9) + local191 - local191 * arg4;
				arg7 = (arg7 << 8) + local215 - local215 * arg4;
				if (arg2 < arg0) {
					arg3 = arg4 <<= 0x10;
					if (arg1 < 0) {
						arg3 -= local85 * arg1;
						arg4 -= local100 * arg1;
						arg11 -= local171 * arg1;
						arg14 -= local203 * arg1;
						arg7 -= local227 * arg1;
						arg1 = 0;
					}
					arg5 <<= 0x10;
					if (arg2 < 0) {
						arg5 -= local115 * arg2;
						arg2 = 0;
					}
					local473 = arg1 - this.anInt3216;
					local272 += local294 * (float) local473;
					local303 += local325 * (float) local473;
					local334 += local356 * (float) local473;
					if (arg1 != arg2 && local85 < local100 || arg1 == arg2 && local85 > local115) {
						arg0 -= arg2;
						arg2 -= arg1;
						arg1 = this.anIntArray190[arg1];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return;
									}
									this.method2724(this.anIntArray191, local4, arg1, arg3 >> 16, arg5 >> 16, arg7, local215, arg11, local159, arg9, arg14, local191, local272, local303, local334, local283, local314, local345);
									arg3 += local85;
									arg5 += local115;
									arg11 += local171;
									arg14 += local203;
									arg7 += local227;
									arg1 += this.anInt3220;
									local272 += local294;
									local303 += local325;
									local334 += local356;
								}
							}
							this.method2724(this.anIntArray191, local4, arg1, arg3 >> 16, arg4 >> 16, arg7, local215, arg11, local159, arg9, arg14, local191, local272, local303, local334, local283, local314, local345);
							arg3 += local85;
							arg4 += local100;
							arg11 += local171;
							arg14 += local203;
							arg7 += local227;
							arg1 += this.anInt3220;
							local272 += local294;
							local303 += local325;
							local334 += local356;
						}
					} else {
						arg0 -= arg2;
						arg2 -= arg1;
						arg1 = this.anIntArray190[arg1];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return;
									}
									this.method2724(this.anIntArray191, local4, arg1, arg5 >> 16, arg3 >> 16, arg7, local215, arg11, local159, arg9, arg14, local191, local272, local303, local334, local283, local314, local345);
									arg3 += local85;
									arg5 += local115;
									arg11 += local171;
									arg14 += local203;
									arg7 += local227;
									arg1 += this.anInt3220;
									local272 += local294;
									local303 += local325;
									local334 += local356;
								}
							}
							this.method2724(this.anIntArray191, local4, arg1, arg4 >> 16, arg3 >> 16, arg7, local215, arg11, local159, arg9, arg14, local191, local272, local303, local334, local283, local314, local345);
							arg3 += local85;
							arg4 += local100;
							arg11 += local171;
							arg14 += local203;
							arg7 += local227;
							arg1 += this.anInt3220;
							local272 += local294;
							local303 += local325;
							local334 += local356;
						}
					}
				} else {
					arg5 = arg4 <<= 0x10;
					if (arg1 < 0) {
						arg5 -= local85 * arg1;
						arg4 -= local100 * arg1;
						arg11 -= local171 * arg1;
						arg14 -= local203 * arg1;
						arg7 -= local227 * arg1;
						arg1 = 0;
					}
					arg3 <<= 0x10;
					if (arg0 < 0) {
						arg3 -= local115 * arg0;
						arg0 = 0;
					}
					local473 = arg1 - this.anInt3216;
					local272 += local294 * (float) local473;
					local303 += local325 * (float) local473;
					local334 += local356 * (float) local473;
					if (local85 < local100) {
						arg2 -= arg0;
						arg0 -= arg1;
						arg1 = this.anIntArray190[arg1];
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									this.method2724(this.anIntArray191, local4, arg1, arg3 >> 16, arg4 >> 16, arg7, local215, arg11, local159, arg9, arg14, local191, local272, local303, local334, local283, local314, local345);
									arg3 += local115;
									arg4 += local100;
									arg11 += local171;
									arg14 += local203;
									arg7 += local227;
									arg1 += this.anInt3220;
									local272 += local294;
									local303 += local325;
									local334 += local356;
								}
							}
							this.method2724(this.anIntArray191, local4, arg1, arg5 >> 16, arg4 >> 16, arg7, local215, arg11, local159, arg9, arg14, local191, local272, local303, local334, local283, local314, local345);
							arg5 += local85;
							arg4 += local100;
							arg11 += local171;
							arg14 += local203;
							arg7 += local227;
							arg1 += this.anInt3220;
							local272 += local294;
							local303 += local325;
							local334 += local356;
						}
					} else {
						arg2 -= arg0;
						arg0 -= arg1;
						arg1 = this.anIntArray190[arg1];
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									this.method2724(this.anIntArray191, local4, arg1, arg4 >> 16, arg3 >> 16, arg7, local215, arg11, local159, arg9, arg14, local191, local272, local303, local334, local283, local314, local345);
									arg3 += local115;
									arg4 += local100;
									arg11 += local171;
									arg14 += local203;
									arg7 += local227;
									arg1 += this.anInt3220;
									local272 += local294;
									local303 += local325;
									local334 += local356;
								}
							}
							this.method2724(this.anIntArray191, local4, arg1, arg4 >> 16, arg5 >> 16, arg7, local215, arg11, local159, arg9, arg14, local191, local272, local303, local334, local283, local314, local345);
							arg5 += local85;
							arg4 += local100;
							arg11 += local171;
							arg14 += local203;
							arg7 += local227;
							arg1 += this.anInt3220;
							local272 += local294;
							local303 += local325;
							local334 += local356;
						}
					}
				}
			}
		} else if (arg2 < this.anInt3218) {
			if (arg0 > this.anInt3218) {
				arg0 = this.anInt3218;
			}
			if (arg1 > this.anInt3218) {
				arg1 = this.anInt3218;
			}
			arg12 = (arg12 << 16) + local159 - local159 * arg5;
			arg15 = (arg15 << 9) + local191 - local191 * arg5;
			arg8 = (arg8 << 8) + local215 - local215 * arg5;
			if (arg0 < arg1) {
				arg4 = arg5 <<= 0x10;
				if (arg2 < 0) {
					arg4 -= local100 * arg2;
					arg5 -= local115 * arg2;
					arg12 -= local171 * arg2;
					arg15 -= local203 * arg2;
					arg8 -= local227 * arg2;
					arg2 = 0;
				}
				arg3 <<= 0x10;
				if (arg0 < 0) {
					arg3 -= local85 * arg0;
					arg0 = 0;
				}
				local473 = arg2 - this.anInt3216;
				local272 += local294 * (float) local473;
				local303 += local325 * (float) local473;
				local334 += local356 * (float) local473;
				if (local100 < local115) {
					arg1 -= arg0;
					arg0 -= arg2;
					arg2 = this.anIntArray190[arg2];
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								this.method2724(this.anIntArray191, local4, arg2, arg4 >> 16, arg3 >> 16, arg8, local215, arg12, local159, arg9, arg15, local191, local272, local303, local334, local283, local314, local345);
								arg4 += local100;
								arg3 += local85;
								arg12 += local171;
								arg15 += local203;
								arg8 += local227;
								arg2 += this.anInt3220;
								local272 += local294;
								local303 += local325;
								local334 += local356;
							}
						}
						this.method2724(this.anIntArray191, local4, arg2, arg4 >> 16, arg5 >> 16, arg8, local215, arg12, local159, arg9, arg15, local191, local272, local303, local334, local283, local314, local345);
						arg4 += local100;
						arg5 += local115;
						arg12 += local171;
						arg15 += local203;
						arg8 += local227;
						arg2 += this.anInt3220;
						local272 += local294;
						local303 += local325;
						local334 += local356;
					}
				} else {
					arg1 -= arg0;
					arg0 -= arg2;
					arg2 = this.anIntArray190[arg2];
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								this.method2724(this.anIntArray191, local4, arg2, arg3 >> 16, arg4 >> 16, arg8, local215, arg12, local159, arg9, arg15, local191, local272, local303, local334, local283, local314, local345);
								arg4 += local100;
								arg3 += local85;
								arg12 += local171;
								arg15 += local203;
								arg8 += local227;
								arg2 += this.anInt3220;
								local272 += local294;
								local303 += local325;
								local334 += local356;
							}
						}
						this.method2724(this.anIntArray191, local4, arg2, arg5 >> 16, arg4 >> 16, arg8, local215, arg12, local159, arg9, arg15, local191, local272, local303, local334, local283, local314, local345);
						arg4 += local100;
						arg5 += local115;
						arg12 += local171;
						arg15 += local203;
						arg8 += local227;
						arg2 += this.anInt3220;
						local272 += local294;
						local303 += local325;
						local334 += local356;
					}
				}
			} else {
				arg3 = arg5 <<= 0x10;
				if (arg2 < 0) {
					arg3 -= local100 * arg2;
					arg5 -= local115 * arg2;
					arg12 -= local171 * arg2;
					arg15 -= local203 * arg2;
					arg8 -= local227 * arg2;
					arg2 = 0;
				}
				arg4 <<= 0x10;
				if (arg1 < 0) {
					arg4 -= local85 * arg1;
					arg1 = 0;
				}
				local473 = arg2 - this.anInt3216;
				local272 += local294 * (float) local473;
				local303 += local325 * (float) local473;
				local334 += local356 * (float) local473;
				if (local100 < local115) {
					arg0 -= arg1;
					arg1 -= arg2;
					arg2 = this.anIntArray190[arg2];
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								this.method2724(this.anIntArray191, local4, arg2, arg4 >> 16, arg5 >> 16, arg8, local215, arg12, local159, arg9, arg15, local191, local272, local303, local334, local283, local314, local345);
								arg4 += local85;
								arg5 += local115;
								arg12 += local171;
								arg15 += local203;
								arg8 += local227;
								arg2 += this.anInt3220;
								local272 += local294;
								local303 += local325;
								local334 += local356;
							}
						}
						this.method2724(this.anIntArray191, local4, arg2, arg3 >> 16, arg5 >> 16, arg8, local215, arg12, local159, arg9, arg15, local191, local272, local303, local334, local283, local314, local345);
						arg3 += local100;
						arg5 += local115;
						arg12 += local171;
						arg15 += local203;
						arg8 += local227;
						arg2 += this.anInt3220;
						local272 += local294;
						local303 += local325;
						local334 += local356;
					}
				} else {
					arg0 -= arg1;
					arg1 -= arg2;
					arg2 = this.anIntArray190[arg2];
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								this.method2724(this.anIntArray191, local4, arg2, arg5 >> 16, arg4 >> 16, arg8, local215, arg12, local159, arg9, arg15, local191, local272, local303, local334, local283, local314, local345);
								arg4 += local85;
								arg5 += local115;
								arg12 += local171;
								arg15 += local203;
								arg8 += local227;
								arg2 += this.anInt3220;
								local272 += local294;
								local303 += local325;
								local334 += local356;
							}
						}
						this.method2724(this.anIntArray191, local4, arg2, arg5 >> 16, arg3 >> 16, arg8, local215, arg12, local159, arg9, arg15, local191, local272, local303, local334, local283, local314, local345);
						arg3 += local100;
						arg5 += local115;
						arg12 += local171;
						arg15 += local203;
						arg8 += local227;
						arg2 += this.anInt3220;
						local272 += local294;
						local303 += local325;
						local334 += local356;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!gw", name = "b", descriptor = "()I")
	public int method2732() {
		return this.anIntArray190[0] / this.anInt3220;
	}

	@OriginalMember(owner = "client!gw", name = "c", descriptor = "([I[I[IIIIIIIIIIFFFFFF)V")
	private void method2733(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int arg8, @OriginalArg(11) int arg9, @OriginalArg(12) float arg10, @OriginalArg(13) float arg11, @OriginalArg(14) float arg12, @OriginalArg(15) float arg13, @OriginalArg(16) float arg14, @OriginalArg(17) float arg15) {
		@Pc(3) int local3 = arg5 - arg4;
		@Pc(128) int local128;
		@Pc(116) int local116;
		@Pc(49) int local49;
		@Pc(56) int local56;
		@Pc(84) int local84;
		@Pc(91) int local91;
		@Pc(11) int local11;
		@Pc(102) int local102;
		@Pc(124) int local124;
		@Pc(20) float local20;
		@Pc(29) float local29;
		@Pc(38) float local38;
		@Pc(148) int local148;
		if (!this.aBoolean253) {
			local11 = arg4 - this.anInt3215;
			local20 = arg10 + arg13 / 8.0F * (float) local11;
			local29 = arg11 + arg14 / 8.0F * (float) local11;
			local38 = arg12 + arg15 / 8.0F * (float) local11;
			if (local38 == 0.0F) {
				local49 = 0;
				local56 = 0;
			} else {
				local49 = (int) (local20 * 16384.0F / local38);
				local56 = (int) (local29 * 16384.0F / local38);
			}
			arg10 = local20 + arg13;
			arg11 = local29 + arg14;
			arg12 = local38 + arg15;
			if (arg12 == 0.0F) {
				local84 = 0;
				local91 = 0;
			} else {
				local84 = (int) (arg10 * 16384.0F / arg12);
				local91 = (int) (arg11 * 16384.0F / arg12);
			}
			local102 = (local49 << 18) + local56;
			local116 = (local84 - local49 >> 3 << 18) + (local91 - local56 >> 3);
			local3 >>= 0x3;
			local124 = arg9 << 3;
			local128 = arg8 >> 8;
			if (this.aBoolean248) {
				if (local3 > 0) {
					do {
						if (arg6 < arg1[arg3]) {
							local148 = arg2[(local102 & 0x3F80) + (local102 >>> 25)];
							arg0[arg3] = ((local148 & 0xFF00FF) * local128 & 0xFF00FF00) + ((local148 & 0xFF00) * local128 & 0xFF0000) >> 8;
							arg1[arg3] = arg6;
						}
						arg6 += arg7;
						local102 += local116;
						arg3++;
						if (arg6 < arg1[arg3]) {
							local148 = arg2[(local102 & 0x3F80) + (local102 >>> 25)];
							arg0[arg3] = ((local148 & 0xFF00FF) * local128 & 0xFF00FF00) + ((local148 & 0xFF00) * local128 & 0xFF0000) >> 8;
							arg1[arg3] = arg6;
						}
						arg6 += arg7;
						local102 += local116;
						arg3++;
						if (arg6 < arg1[arg3]) {
							local148 = arg2[(local102 & 0x3F80) + (local102 >>> 25)];
							arg0[arg3] = ((local148 & 0xFF00FF) * local128 & 0xFF00FF00) + ((local148 & 0xFF00) * local128 & 0xFF0000) >> 8;
							arg1[arg3] = arg6;
						}
						arg6 += arg7;
						local102 += local116;
						arg3++;
						if (arg6 < arg1[arg3]) {
							local148 = arg2[(local102 & 0x3F80) + (local102 >>> 25)];
							arg0[arg3] = ((local148 & 0xFF00FF) * local128 & 0xFF00FF00) + ((local148 & 0xFF00) * local128 & 0xFF0000) >> 8;
							arg1[arg3] = arg6;
						}
						arg6 += arg7;
						local102 += local116;
						arg3++;
						if (arg6 < arg1[arg3]) {
							local148 = arg2[(local102 & 0x3F80) + (local102 >>> 25)];
							arg0[arg3] = ((local148 & 0xFF00FF) * local128 & 0xFF00FF00) + ((local148 & 0xFF00) * local128 & 0xFF0000) >> 8;
							arg1[arg3] = arg6;
						}
						arg6 += arg7;
						local102 += local116;
						arg3++;
						if (arg6 < arg1[arg3]) {
							local148 = arg2[(local102 & 0x3F80) + (local102 >>> 25)];
							arg0[arg3] = ((local148 & 0xFF00FF) * local128 & 0xFF00FF00) + ((local148 & 0xFF00) * local128 & 0xFF0000) >> 8;
							arg1[arg3] = arg6;
						}
						arg6 += arg7;
						local102 += local116;
						arg3++;
						if (arg6 < arg1[arg3]) {
							local148 = arg2[(local102 & 0x3F80) + (local102 >>> 25)];
							arg0[arg3] = ((local148 & 0xFF00FF) * local128 & 0xFF00FF00) + ((local148 & 0xFF00) * local128 & 0xFF0000) >> 8;
							arg1[arg3] = arg6;
						}
						arg6 += arg7;
						local102 += local116;
						arg3++;
						if (arg6 < arg1[arg3]) {
							local148 = arg2[(local102 & 0x3F80) + (local102 >>> 25)];
							arg0[arg3] = ((local148 & 0xFF00FF) * local128 & 0xFF00FF00) + ((local148 & 0xFF00) * local128 & 0xFF0000) >> 8;
							arg1[arg3] = arg6;
						}
						arg6 += arg7;
						arg3++;
						local49 = local84;
						local56 = local91;
						arg10 += arg13;
						arg11 += arg14;
						arg12 += arg15;
						if (arg12 == 0.0F) {
							local84 = 0;
							local91 = 0;
						} else {
							local84 = (int) (arg10 * 16384.0F / arg12);
							local91 = (int) (arg11 * 16384.0F / arg12);
						}
						local102 = (local49 << 18) + local56;
						local116 = (local84 - local49 >> 3 << 18) + (local91 - local56 >> 3);
						arg8 += local124;
						local128 = arg8 >> 8;
						local3--;
					} while (local3 > 0);
				}
				local3 = arg5 - arg4 & 0x7;
				if (local3 > 0) {
					do {
						if (arg6 < arg1[arg3]) {
							local148 = arg2[(local102 & 0x3F80) + (local102 >>> 25)];
							arg0[arg3] = ((local148 & 0xFF00FF) * local128 & 0xFF00FF00) + ((local148 & 0xFF00) * local128 & 0xFF0000) >> 8;
							arg1[arg3] = arg6;
						}
						arg6 += arg7;
						local102 += local116;
						arg3++;
						local3--;
					} while (local3 > 0);
					return;
				}
			} else {
				if (local3 > 0) {
					do {
						@Pc(1840) int local1840;
						if (arg6 < arg1[arg3] && (local1840 = arg2[(local102 & 0x3F80) + (local102 >>> 25)]) != 0) {
							arg0[arg3] = ((local1840 & 0xFF00FF) * local128 & 0xFF00FF00) + ((local1840 & 0xFF00) * local128 & 0xFF0000) >> 8;
							arg1[arg3] = arg6;
						}
						arg6 += arg7;
						local102 += local116;
						arg3++;
						@Pc(1890) int local1890;
						if (arg6 < arg1[arg3] && (local1890 = arg2[(local102 & 0x3F80) + (local102 >>> 25)]) != 0) {
							arg0[arg3] = ((local1890 & 0xFF00FF) * local128 & 0xFF00FF00) + ((local1890 & 0xFF00) * local128 & 0xFF0000) >> 8;
							arg1[arg3] = arg6;
						}
						arg6 += arg7;
						local102 += local116;
						arg3++;
						@Pc(1940) int local1940;
						if (arg6 < arg1[arg3] && (local1940 = arg2[(local102 & 0x3F80) + (local102 >>> 25)]) != 0) {
							arg0[arg3] = ((local1940 & 0xFF00FF) * local128 & 0xFF00FF00) + ((local1940 & 0xFF00) * local128 & 0xFF0000) >> 8;
							arg1[arg3] = arg6;
						}
						arg6 += arg7;
						local102 += local116;
						arg3++;
						@Pc(1990) int local1990;
						if (arg6 < arg1[arg3] && (local1990 = arg2[(local102 & 0x3F80) + (local102 >>> 25)]) != 0) {
							arg0[arg3] = ((local1990 & 0xFF00FF) * local128 & 0xFF00FF00) + ((local1990 & 0xFF00) * local128 & 0xFF0000) >> 8;
							arg1[arg3] = arg6;
						}
						arg6 += arg7;
						local102 += local116;
						arg3++;
						@Pc(2040) int local2040;
						if (arg6 < arg1[arg3] && (local2040 = arg2[(local102 & 0x3F80) + (local102 >>> 25)]) != 0) {
							arg0[arg3] = ((local2040 & 0xFF00FF) * local128 & 0xFF00FF00) + ((local2040 & 0xFF00) * local128 & 0xFF0000) >> 8;
							arg1[arg3] = arg6;
						}
						arg6 += arg7;
						local102 += local116;
						arg3++;
						@Pc(2090) int local2090;
						if (arg6 < arg1[arg3] && (local2090 = arg2[(local102 & 0x3F80) + (local102 >>> 25)]) != 0) {
							arg0[arg3] = ((local2090 & 0xFF00FF) * local128 & 0xFF00FF00) + ((local2090 & 0xFF00) * local128 & 0xFF0000) >> 8;
							arg1[arg3] = arg6;
						}
						arg6 += arg7;
						local102 += local116;
						arg3++;
						@Pc(2140) int local2140;
						if (arg6 < arg1[arg3] && (local2140 = arg2[(local102 & 0x3F80) + (local102 >>> 25)]) != 0) {
							arg0[arg3] = ((local2140 & 0xFF00FF) * local128 & 0xFF00FF00) + ((local2140 & 0xFF00) * local128 & 0xFF0000) >> 8;
							arg1[arg3] = arg6;
						}
						arg6 += arg7;
						local102 += local116;
						arg3++;
						@Pc(2190) int local2190;
						if (arg6 < arg1[arg3] && (local2190 = arg2[(local102 & 0x3F80) + (local102 >>> 25)]) != 0) {
							arg0[arg3] = ((local2190 & 0xFF00FF) * local128 & 0xFF00FF00) + ((local2190 & 0xFF00) * local128 & 0xFF0000) >> 8;
							arg1[arg3] = arg6;
						}
						arg6 += arg7;
						arg3++;
						local49 = local84;
						local56 = local91;
						arg10 += arg13;
						arg11 += arg14;
						arg12 += arg15;
						if (arg12 == 0.0F) {
							local84 = 0;
							local91 = 0;
						} else {
							local84 = (int) (arg10 / arg12 * 16384.0F);
							local91 = (int) (arg11 / arg12 * 16384.0F);
						}
						local102 = (local49 << 18) + local56;
						local116 = (local84 - local49 >> 3 << 18) + (local91 - local56 >> 3);
						arg8 += local124;
						local128 = arg8 >> 8;
						local3--;
					} while (local3 > 0);
				}
				local3 = arg5 - arg4 & 0x7;
				if (local3 > 0) {
					do {
						@Pc(2318) int local2318;
						if (arg6 < arg1[arg3] && (local2318 = arg2[(local102 & 0x3F80) + (local102 >>> 25)]) != 0) {
							arg0[arg3] = ((local2318 & 0xFF00FF) * local128 & 0xFF00FF00) + ((local2318 & 0xFF00) * local128 & 0xFF0000) >> 8;
							arg1[arg3] = arg6;
						}
						arg6 += arg7;
						local102 += local116;
						arg3++;
						local3--;
					} while (local3 > 0);
				}
			}
			return;
		}
		local11 = arg4 - this.anInt3215;
		local20 = arg10 + arg13 / 8.0F * (float) local11;
		local29 = arg11 + arg14 / 8.0F * (float) local11;
		local38 = arg12 + arg15 / 8.0F * (float) local11;
		if (local38 == 0.0F) {
			local49 = 0;
			local56 = 0;
		} else {
			local49 = (int) (local20 * 4096.0F / local38);
			local56 = (int) (local29 * 4096.0F / local38);
		}
		arg10 = local20 + arg13;
		arg11 = local29 + arg14;
		arg12 = local38 + arg15;
		if (arg12 == 0.0F) {
			local84 = 0;
			local91 = 0;
		} else {
			local84 = (int) (arg10 * 4096.0F / arg12);
			local91 = (int) (arg11 * 4096.0F / arg12);
		}
		local102 = (local49 << 20) + local56;
		local116 = (local84 - local49 >> 3 << 20) + (local91 - local56 >> 3);
		local3 >>= 0x3;
		local124 = arg9 << 3;
		local128 = arg8 >> 8;
		if (this.aBoolean248) {
			if (local3 > 0) {
				do {
					if (arg6 < arg1[arg3]) {
						local148 = arg2[(local102 & 0xFC0) + (local102 >>> 26)];
						arg0[arg3] = ((local148 & 0xFF00FF) * local128 & 0xFF00FF00) + ((local148 & 0xFF00) * local128 & 0xFF0000) >> 8;
						arg1[arg3] = arg6;
					}
					arg6 += arg7;
					local102 += local116;
					arg3++;
					if (arg6 < arg1[arg3]) {
						local148 = arg2[(local102 & 0xFC0) + (local102 >>> 26)];
						arg0[arg3] = ((local148 & 0xFF00FF) * local128 & 0xFF00FF00) + ((local148 & 0xFF00) * local128 & 0xFF0000) >> 8;
						arg1[arg3] = arg6;
					}
					arg6 += arg7;
					local102 += local116;
					arg3++;
					if (arg6 < arg1[arg3]) {
						local148 = arg2[(local102 & 0xFC0) + (local102 >>> 26)];
						arg0[arg3] = ((local148 & 0xFF00FF) * local128 & 0xFF00FF00) + ((local148 & 0xFF00) * local128 & 0xFF0000) >> 8;
						arg1[arg3] = arg6;
					}
					arg6 += arg7;
					local102 += local116;
					arg3++;
					if (arg6 < arg1[arg3]) {
						local148 = arg2[(local102 & 0xFC0) + (local102 >>> 26)];
						arg0[arg3] = ((local148 & 0xFF00FF) * local128 & 0xFF00FF00) + ((local148 & 0xFF00) * local128 & 0xFF0000) >> 8;
						arg1[arg3] = arg6;
					}
					arg6 += arg7;
					local102 += local116;
					arg3++;
					if (arg6 < arg1[arg3]) {
						local148 = arg2[(local102 & 0xFC0) + (local102 >>> 26)];
						arg0[arg3] = ((local148 & 0xFF00FF) * local128 & 0xFF00FF00) + ((local148 & 0xFF00) * local128 & 0xFF0000) >> 8;
						arg1[arg3] = arg6;
					}
					arg6 += arg7;
					local102 += local116;
					arg3++;
					if (arg6 < arg1[arg3]) {
						local148 = arg2[(local102 & 0xFC0) + (local102 >>> 26)];
						arg0[arg3] = ((local148 & 0xFF00FF) * local128 & 0xFF00FF00) + ((local148 & 0xFF00) * local128 & 0xFF0000) >> 8;
						arg1[arg3] = arg6;
					}
					arg6 += arg7;
					local102 += local116;
					arg3++;
					if (arg6 < arg1[arg3]) {
						local148 = arg2[(local102 & 0xFC0) + (local102 >>> 26)];
						arg0[arg3] = ((local148 & 0xFF00FF) * local128 & 0xFF00FF00) + ((local148 & 0xFF00) * local128 & 0xFF0000) >> 8;
						arg1[arg3] = arg6;
					}
					arg6 += arg7;
					local102 += local116;
					arg3++;
					if (arg6 < arg1[arg3]) {
						local148 = arg2[(local102 & 0xFC0) + (local102 >>> 26)];
						arg0[arg3] = ((local148 & 0xFF00FF) * local128 & 0xFF00FF00) + ((local148 & 0xFF00) * local128 & 0xFF0000) >> 8;
						arg1[arg3] = arg6;
					}
					arg6 += arg7;
					arg3++;
					local49 = local84;
					local56 = local91;
					arg10 += arg13;
					arg11 += arg14;
					arg12 += arg15;
					if (arg12 == 0.0F) {
						local84 = 0;
						local91 = 0;
					} else {
						local84 = (int) (arg10 * 4096.0F / arg12);
						local91 = (int) (arg11 * 4096.0F / arg12);
					}
					local102 = (local49 << 20) + local56;
					local116 = (local84 - local49 >> 3 << 20) + (local91 - local56 >> 3);
					arg8 += local124;
					local128 = arg8 >> 8;
					local3--;
				} while (local3 > 0);
			}
			local3 = arg5 - arg4 & 0x7;
			if (local3 > 0) {
				do {
					if (arg6 < arg1[arg3]) {
						local148 = arg2[(local102 & 0xFC0) + (local102 >>> 26)];
						arg0[arg3] = ((local148 & 0xFF00FF) * local128 & 0xFF00FF00) + ((local148 & 0xFF00) * local128 & 0xFF0000) >> 8;
						arg1[arg3] = arg6;
					}
					arg6 += arg7;
					local102 += local116;
					arg3++;
					local3--;
				} while (local3 > 0);
				return;
			}
			return;
		}
		if (local3 > 0) {
			do {
				@Pc(665) int local665;
				if (arg6 < arg1[arg3] && (local665 = arg2[(local102 & 0xFC0) + (local102 >>> 26)]) != 0) {
					arg0[arg3] = ((local665 & 0xFF00FF) * local128 & 0xFF00FF00) + ((local665 & 0xFF00) * local128 & 0xFF0000) >> 8;
					arg1[arg3] = arg6;
				}
				arg6 += arg7;
				local102 += local116;
				arg3++;
				@Pc(715) int local715;
				if (arg6 < arg1[arg3] && (local715 = arg2[(local102 & 0xFC0) + (local102 >>> 26)]) != 0) {
					arg0[arg3] = ((local715 & 0xFF00FF) * local128 & 0xFF00FF00) + ((local715 & 0xFF00) * local128 & 0xFF0000) >> 8;
					arg1[arg3] = arg6;
				}
				arg6 += arg7;
				local102 += local116;
				arg3++;
				@Pc(765) int local765;
				if (arg6 < arg1[arg3] && (local765 = arg2[(local102 & 0xFC0) + (local102 >>> 26)]) != 0) {
					arg0[arg3] = ((local765 & 0xFF00FF) * local128 & 0xFF00FF00) + ((local765 & 0xFF00) * local128 & 0xFF0000) >> 8;
					arg1[arg3] = arg6;
				}
				arg6 += arg7;
				local102 += local116;
				arg3++;
				@Pc(815) int local815;
				if (arg6 < arg1[arg3] && (local815 = arg2[(local102 & 0xFC0) + (local102 >>> 26)]) != 0) {
					arg0[arg3] = ((local815 & 0xFF00FF) * local128 & 0xFF00FF00) + ((local815 & 0xFF00) * local128 & 0xFF0000) >> 8;
					arg1[arg3] = arg6;
				}
				arg6 += arg7;
				local102 += local116;
				arg3++;
				@Pc(865) int local865;
				if (arg6 < arg1[arg3] && (local865 = arg2[(local102 & 0xFC0) + (local102 >>> 26)]) != 0) {
					arg0[arg3] = ((local865 & 0xFF00FF) * local128 & 0xFF00FF00) + ((local865 & 0xFF00) * local128 & 0xFF0000) >> 8;
					arg1[arg3] = arg6;
				}
				arg6 += arg7;
				local102 += local116;
				arg3++;
				@Pc(915) int local915;
				if (arg6 < arg1[arg3] && (local915 = arg2[(local102 & 0xFC0) + (local102 >>> 26)]) != 0) {
					arg0[arg3] = ((local915 & 0xFF00FF) * local128 & 0xFF00FF00) + ((local915 & 0xFF00) * local128 & 0xFF0000) >> 8;
					arg1[arg3] = arg6;
				}
				arg6 += arg7;
				local102 += local116;
				arg3++;
				@Pc(965) int local965;
				if (arg6 < arg1[arg3] && (local965 = arg2[(local102 & 0xFC0) + (local102 >>> 26)]) != 0) {
					arg0[arg3] = ((local965 & 0xFF00FF) * local128 & 0xFF00FF00) + ((local965 & 0xFF00) * local128 & 0xFF0000) >> 8;
					arg1[arg3] = arg6;
				}
				arg6 += arg7;
				local102 += local116;
				arg3++;
				@Pc(1015) int local1015;
				if (arg6 < arg1[arg3] && (local1015 = arg2[(local102 & 0xFC0) + (local102 >>> 26)]) != 0) {
					arg0[arg3] = ((local1015 & 0xFF00FF) * local128 & 0xFF00FF00) + ((local1015 & 0xFF00) * local128 & 0xFF0000) >> 8;
					arg1[arg3] = arg6;
				}
				arg6 += arg7;
				arg3++;
				local49 = local84;
				local56 = local91;
				arg10 += arg13;
				arg11 += arg14;
				arg12 += arg15;
				if (arg12 == 0.0F) {
					local84 = 0;
					local91 = 0;
				} else {
					local84 = (int) (arg10 * 4096.0F / arg12);
					local91 = (int) (arg11 * 4096.0F / arg12);
				}
				local102 = (local49 << 20) + local56;
				local116 = (local84 - local49 >> 3 << 20) + (local91 - local56 >> 3);
				arg8 += local124;
				local128 = arg8 >> 8;
				local3--;
			} while (local3 > 0);
		}
		local3 = arg5 - arg4 & 0x7;
		if (local3 <= 0) {
			return;
		}
		do {
			@Pc(1143) int local1143;
			if (arg6 < arg1[arg3] && (local1143 = arg2[(local102 & 0xFC0) + (local102 >>> 26)]) != 0) {
				arg0[arg3] = ((local1143 & 0xFF00FF) * local128 & 0xFF00FF00) + ((local1143 & 0xFF00) * local128 & 0xFF0000) >> 8;
				arg1[arg3] = arg6;
			}
			arg6 += arg7;
			local102 += local116;
			arg3++;
			local3--;
		} while (local3 > 0);
		return;
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIIIII)V")
	public void method2734(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) int arg17, @OriginalArg(18) int arg18, @OriginalArg(19) int arg19, @OriginalArg(20) int arg20, @OriginalArg(21) int arg21) {
		@Pc(4) int[] local4 = this.aClass12_Sub3_7.method6487(arg21);
		@Pc(11) int local11;
		if (local4 == null) {
			local11 = this.aClass12_Sub3_7.method6481(arg21);
			this.method2737(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, Static599.method2727(local11, arg9), Static599.method2727(local11, arg10), Static599.method2727(local11, arg11));
			return;
		}
		this.aBoolean253 = this.aClass12_Sub3_7.method6480(arg21);
		this.aBoolean248 = this.aClass12_Sub3_7.method6476(arg21);
		local11 = arg4 - arg3;
		@Pc(52) int local52 = arg1 - arg0;
		@Pc(56) int local56 = arg5 - arg3;
		@Pc(60) int local60 = arg2 - arg0;
		@Pc(64) int local64 = arg10 - arg9;
		@Pc(68) int local68 = arg11 - arg9;
		@Pc(72) int local72 = arg7 - arg6;
		@Pc(76) int local76 = arg8 - arg6;
		@Pc(78) int local78 = 0;
		if (arg1 != arg0) {
			local78 = (arg4 - arg3 << 16) / (arg1 - arg0);
		}
		@Pc(93) int local93 = 0;
		if (arg2 != arg1) {
			local93 = (arg5 - arg4 << 16) / (arg2 - arg1);
		}
		@Pc(108) int local108 = 0;
		if (arg2 != arg0) {
			local108 = (arg3 - arg5 << 16) / (arg0 - arg2);
		}
		@Pc(129) int local129 = local11 * local60 - local56 * local52;
		if (local129 == 0) {
			return;
		}
		@Pc(144) int local144 = (local64 * local60 - local68 * local52 << 9) / local129;
		@Pc(156) int local156 = (local68 * local11 - local64 * local56 << 9) / local129;
		@Pc(168) int local168 = (local72 * local60 - local76 * local52 << 8) / local129;
		@Pc(180) int local180 = (local76 * local11 - local72 * local56 << 8) / local129;
		@Pc(187) float local187 = 8.0F / (float) this.aClass12_Sub3_7.anInt7804;
		@Pc(192) float local192 = (float) this.aClass12_Sub3_7.anInt7797;
		@Pc(196) int local196 = arg12 - arg13;
		@Pc(200) int local200 = arg15 - arg16;
		@Pc(204) int local204 = arg18 - arg19;
		@Pc(208) int local208 = arg14 - arg12;
		@Pc(212) int local212 = arg17 - arg15;
		@Pc(216) int local216 = arg20 - arg18;
		@Pc(225) float local225 = (float) (local208 * arg15 - local212 * arg12);
		@Pc(236) float local236 = (float) (local212 * arg18 - local216 * arg15) * local187;
		@Pc(247) float local247 = (float) (local216 * arg12 - local208 * arg18) / local192;
		@Pc(256) float local256 = (float) (local196 * arg15 - local200 * arg12);
		@Pc(267) float local267 = (float) (local200 * arg18 - local204 * arg15) * local187;
		@Pc(278) float local278 = (float) (local204 * arg12 - local196 * arg18) / local192;
		@Pc(287) float local287 = (float) (local200 * local208 - local196 * local212);
		@Pc(298) float local298 = (float) (local204 * local212 - local200 * local216) * local187;
		@Pc(309) float local309 = (float) (local196 * local216 - local204 * local208) / local192;
		@Pc(410) int local410;
		if (arg0 <= arg1 && arg0 <= arg2) {
			if (arg0 < this.anInt3218) {
				if (arg1 > this.anInt3218) {
					arg1 = this.anInt3218;
				}
				if (arg2 > this.anInt3218) {
					arg2 = this.anInt3218;
				}
				arg9 = (arg9 << 9) + local144 - local144 * arg3;
				arg6 = (arg6 << 8) + local168 - local168 * arg3;
				if (arg1 < arg2) {
					arg5 = arg3 <<= 0x10;
					if (arg0 < 0) {
						arg5 -= local108 * arg0;
						arg3 -= local78 * arg0;
						arg9 -= local156 * arg0;
						arg6 -= local180 * arg0;
						arg0 = 0;
					}
					arg4 <<= 0x10;
					if (arg1 < 0) {
						arg4 -= local93 * arg1;
						arg1 = 0;
					}
					local410 = arg0 - this.anInt3216;
					local225 += local247 * (float) local410;
					local256 += local278 * (float) local410;
					local287 += local309 * (float) local410;
					if (arg0 != arg1 && local108 < local78 || arg0 == arg1 && local108 > local93) {
						arg2 -= arg1;
						arg1 -= arg0;
						arg0 = this.anIntArray190[arg0];
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									this.method2730(this.anIntArray191, this.anIntArray189, local4, arg0, arg5 >> 16, arg4 >> 16, arg6, local168, arg9, local144, local225, local256, local287, local236, local267, local298);
									arg5 += local108;
									arg4 += local93;
									arg9 += local156;
									arg6 += local180;
									arg0 += this.anInt3220;
									local225 += local247;
									local256 += local278;
									local287 += local309;
								}
							}
							this.method2730(this.anIntArray191, this.anIntArray189, local4, arg0, arg5 >> 16, arg3 >> 16, arg6, local168, arg9, local144, local225, local256, local287, local236, local267, local298);
							arg5 += local108;
							arg3 += local78;
							arg9 += local156;
							arg6 += local180;
							arg0 += this.anInt3220;
							local225 += local247;
							local256 += local278;
							local287 += local309;
						}
					} else {
						arg2 -= arg1;
						arg1 -= arg0;
						arg0 = this.anIntArray190[arg0];
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									this.method2730(this.anIntArray191, this.anIntArray189, local4, arg0, arg4 >> 16, arg5 >> 16, arg6, local168, arg9, local144, local225, local256, local287, local236, local267, local298);
									arg5 += local108;
									arg4 += local93;
									arg9 += local156;
									arg6 += local180;
									arg0 += this.anInt3220;
									local225 += local247;
									local256 += local278;
									local287 += local309;
								}
							}
							this.method2730(this.anIntArray191, this.anIntArray189, local4, arg0, arg3 >> 16, arg5 >> 16, arg6, local168, arg9, local144, local225, local256, local287, local236, local267, local298);
							arg5 += local108;
							arg3 += local78;
							arg9 += local156;
							arg6 += local180;
							arg0 += this.anInt3220;
							local225 += local247;
							local256 += local278;
							local287 += local309;
						}
					}
				} else {
					arg4 = arg3 <<= 0x10;
					if (arg0 < 0) {
						arg4 -= local108 * arg0;
						arg3 -= local78 * arg0;
						arg9 -= local156 * arg0;
						arg6 -= local180 * arg0;
						arg0 = 0;
					}
					arg5 <<= 0x10;
					if (arg2 < 0) {
						arg5 -= local93 * arg2;
						arg2 = 0;
					}
					local410 = arg0 - this.anInt3216;
					local225 += local247 * (float) local410;
					local256 += local278 * (float) local410;
					local287 += local309 * (float) local410;
					if ((arg0 == arg2 || local108 >= local78) && (arg0 != arg2 || local93 <= local78)) {
						arg1 -= arg2;
						arg2 -= arg0;
						arg0 = this.anIntArray190[arg0];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return;
									}
									this.method2730(this.anIntArray191, this.anIntArray189, local4, arg0, arg3 >> 16, arg5 >> 16, arg6, local168, arg9, local144, local225, local256, local287, local236, local267, local298);
									arg5 += local93;
									arg3 += local78;
									arg9 += local156;
									arg6 += local180;
									arg0 += this.anInt3220;
									local225 += local247;
									local256 += local278;
									local287 += local309;
								}
							}
							this.method2730(this.anIntArray191, this.anIntArray189, local4, arg0, arg3 >> 16, arg4 >> 16, arg6, local168, arg9, local144, local225, local256, local287, local236, local267, local298);
							arg4 += local108;
							arg3 += local78;
							arg9 += local156;
							arg6 += local180;
							arg0 += this.anInt3220;
							local225 += local247;
							local256 += local278;
							local287 += local309;
						}
					} else {
						arg1 -= arg2;
						arg2 -= arg0;
						arg0 = this.anIntArray190[arg0];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return;
									}
									this.method2730(this.anIntArray191, this.anIntArray189, local4, arg0, arg5 >> 16, arg3 >> 16, arg6, local168, arg9, local144, local225, local256, local287, local236, local267, local298);
									arg5 += local93;
									arg3 += local78;
									arg9 += local156;
									arg6 += local180;
									arg0 += this.anInt3220;
									local225 += local247;
									local256 += local278;
									local287 += local309;
								}
							}
							this.method2730(this.anIntArray191, this.anIntArray189, local4, arg0, arg4 >> 16, arg3 >> 16, arg6, local168, arg9, local144, local225, local256, local287, local236, local267, local298);
							arg4 += local108;
							arg3 += local78;
							arg9 += local156;
							arg6 += local180;
							arg0 += this.anInt3220;
							local225 += local247;
							local256 += local278;
							local287 += local309;
						}
					}
				}
			}
		} else if (arg1 <= arg2) {
			if (arg1 < this.anInt3218) {
				if (arg2 > this.anInt3218) {
					arg2 = this.anInt3218;
				}
				if (arg0 > this.anInt3218) {
					arg0 = this.anInt3218;
				}
				arg10 = (arg10 << 9) + local144 - local144 * arg4;
				arg7 = (arg7 << 8) + local168 - local168 * arg4;
				if (arg2 < arg0) {
					arg3 = arg4 <<= 0x10;
					if (arg1 < 0) {
						arg3 -= local78 * arg1;
						arg4 -= local93 * arg1;
						arg10 -= local156 * arg1;
						arg7 -= local180 * arg1;
						arg1 = 0;
					}
					arg5 <<= 0x10;
					if (arg2 < 0) {
						arg5 -= local108 * arg2;
						arg2 = 0;
					}
					local410 = arg1 - this.anInt3216;
					local225 += local247 * (float) local410;
					local256 += local278 * (float) local410;
					local287 += local309 * (float) local410;
					if (arg1 != arg2 && local78 < local93 || arg1 == arg2 && local78 > local108) {
						arg0 -= arg2;
						arg2 -= arg1;
						arg1 = this.anIntArray190[arg1];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return;
									}
									this.method2730(this.anIntArray191, this.anIntArray189, local4, arg1, arg3 >> 16, arg5 >> 16, arg7, local168, arg10, local144, local225, local256, local287, local236, local267, local298);
									arg3 += local78;
									arg5 += local108;
									arg10 += local156;
									arg7 += local180;
									arg1 += this.anInt3220;
									local225 += local247;
									local256 += local278;
									local287 += local309;
								}
							}
							this.method2730(this.anIntArray191, this.anIntArray189, local4, arg1, arg3 >> 16, arg4 >> 16, arg7, local168, arg10, local144, local225, local256, local287, local236, local267, local298);
							arg3 += local78;
							arg4 += local93;
							arg10 += local156;
							arg7 += local180;
							arg1 += this.anInt3220;
							local225 += local247;
							local256 += local278;
							local287 += local309;
						}
					} else {
						arg0 -= arg2;
						arg2 -= arg1;
						arg1 = this.anIntArray190[arg1];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return;
									}
									this.method2730(this.anIntArray191, this.anIntArray189, local4, arg1, arg5 >> 16, arg3 >> 16, arg7, local168, arg10, local144, local225, local256, local287, local236, local267, local298);
									arg3 += local78;
									arg5 += local108;
									arg10 += local156;
									arg7 += local180;
									arg1 += this.anInt3220;
									local225 += local247;
									local256 += local278;
									local287 += local309;
								}
							}
							this.method2730(this.anIntArray191, this.anIntArray189, local4, arg1, arg4 >> 16, arg3 >> 16, arg7, local168, arg10, local144, local225, local256, local287, local236, local267, local298);
							arg3 += local78;
							arg4 += local93;
							arg10 += local156;
							arg7 += local180;
							arg1 += this.anInt3220;
							local225 += local247;
							local256 += local278;
							local287 += local309;
						}
					}
				} else {
					arg5 = arg4 <<= 0x10;
					if (arg1 < 0) {
						arg5 -= local78 * arg1;
						arg4 -= local93 * arg1;
						arg10 -= local156 * arg1;
						arg7 -= local180 * arg1;
						arg1 = 0;
					}
					arg3 <<= 0x10;
					if (arg0 < 0) {
						arg3 -= local108 * arg0;
						arg0 = 0;
					}
					local410 = arg1 - this.anInt3216;
					local225 += local247 * (float) local410;
					local256 += local278 * (float) local410;
					local287 += local309 * (float) local410;
					if (local78 < local93) {
						arg2 -= arg0;
						arg0 -= arg1;
						arg1 = this.anIntArray190[arg1];
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									this.method2730(this.anIntArray191, this.anIntArray189, local4, arg1, arg3 >> 16, arg4 >> 16, arg7, local168, arg10, local144, local225, local256, local287, local236, local267, local298);
									arg3 += local108;
									arg4 += local93;
									arg10 += local156;
									arg7 += local180;
									arg1 += this.anInt3220;
									local225 += local247;
									local256 += local278;
									local287 += local309;
								}
							}
							this.method2730(this.anIntArray191, this.anIntArray189, local4, arg1, arg5 >> 16, arg4 >> 16, arg7, local168, arg10, local144, local225, local256, local287, local236, local267, local298);
							arg5 += local78;
							arg4 += local93;
							arg10 += local156;
							arg7 += local180;
							arg1 += this.anInt3220;
							local225 += local247;
							local256 += local278;
							local287 += local309;
						}
					} else {
						arg2 -= arg0;
						arg0 -= arg1;
						arg1 = this.anIntArray190[arg1];
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									this.method2730(this.anIntArray191, this.anIntArray189, local4, arg1, arg4 >> 16, arg3 >> 16, arg7, local168, arg10, local144, local225, local256, local287, local236, local267, local298);
									arg3 += local108;
									arg4 += local93;
									arg10 += local156;
									arg7 += local180;
									arg1 += this.anInt3220;
									local225 += local247;
									local256 += local278;
									local287 += local309;
								}
							}
							this.method2730(this.anIntArray191, this.anIntArray189, local4, arg1, arg4 >> 16, arg5 >> 16, arg7, local168, arg10, local144, local225, local256, local287, local236, local267, local298);
							arg5 += local78;
							arg4 += local93;
							arg10 += local156;
							arg7 += local180;
							arg1 += this.anInt3220;
							local225 += local247;
							local256 += local278;
							local287 += local309;
						}
					}
				}
			}
		} else if (arg2 < this.anInt3218) {
			if (arg0 > this.anInt3218) {
				arg0 = this.anInt3218;
			}
			if (arg1 > this.anInt3218) {
				arg1 = this.anInt3218;
			}
			arg11 = (arg11 << 9) + local144 - local144 * arg5;
			arg8 = (arg8 << 8) + local168 - local168 * arg5;
			if (arg0 < arg1) {
				arg4 = arg5 <<= 0x10;
				if (arg2 < 0) {
					arg4 -= local93 * arg2;
					arg5 -= local108 * arg2;
					arg11 -= local156 * arg2;
					arg8 -= local180 * arg2;
					arg2 = 0;
				}
				arg3 <<= 0x10;
				if (arg0 < 0) {
					arg3 -= local78 * arg0;
					arg0 = 0;
				}
				local410 = arg2 - this.anInt3216;
				local225 += local247 * (float) local410;
				local256 += local278 * (float) local410;
				local287 += local309 * (float) local410;
				if (local93 < local108) {
					arg1 -= arg0;
					arg0 -= arg2;
					arg2 = this.anIntArray190[arg2];
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								this.method2730(this.anIntArray191, this.anIntArray189, local4, arg2, arg4 >> 16, arg3 >> 16, arg8, local168, arg11, local144, local225, local256, local287, local236, local267, local298);
								arg4 += local93;
								arg3 += local78;
								arg11 += local156;
								arg8 += local180;
								arg2 += this.anInt3220;
								local225 += local247;
								local256 += local278;
								local287 += local309;
							}
						}
						this.method2730(this.anIntArray191, this.anIntArray189, local4, arg2, arg4 >> 16, arg5 >> 16, arg8, local168, arg11, local144, local225, local256, local287, local236, local267, local298);
						arg4 += local93;
						arg5 += local108;
						arg11 += local156;
						arg8 += local180;
						arg2 += this.anInt3220;
						local225 += local247;
						local256 += local278;
						local287 += local309;
					}
				} else {
					arg1 -= arg0;
					arg0 -= arg2;
					arg2 = this.anIntArray190[arg2];
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								this.method2730(this.anIntArray191, this.anIntArray189, local4, arg2, arg3 >> 16, arg4 >> 16, arg8, local168, arg11, local144, local225, local256, local287, local236, local267, local298);
								arg4 += local93;
								arg3 += local78;
								arg11 += local156;
								arg8 += local180;
								arg2 += this.anInt3220;
								local225 += local247;
								local256 += local278;
								local287 += local309;
							}
						}
						this.method2730(this.anIntArray191, this.anIntArray189, local4, arg2, arg5 >> 16, arg4 >> 16, arg8, local168, arg11, local144, local225, local256, local287, local236, local267, local298);
						arg4 += local93;
						arg5 += local108;
						arg11 += local156;
						arg8 += local180;
						arg2 += this.anInt3220;
						local225 += local247;
						local256 += local278;
						local287 += local309;
					}
				}
			} else {
				arg3 = arg5 <<= 0x10;
				if (arg2 < 0) {
					arg3 -= local93 * arg2;
					arg5 -= local108 * arg2;
					arg11 -= local156 * arg2;
					arg8 -= local180 * arg2;
					arg2 = 0;
				}
				arg4 <<= 0x10;
				if (arg1 < 0) {
					arg4 -= local78 * arg1;
					arg1 = 0;
				}
				local410 = arg2 - this.anInt3216;
				local225 += local247 * (float) local410;
				local256 += local278 * (float) local410;
				local287 += local309 * (float) local410;
				if (local93 < local108) {
					arg0 -= arg1;
					arg1 -= arg2;
					arg2 = this.anIntArray190[arg2];
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								this.method2730(this.anIntArray191, this.anIntArray189, local4, arg2, arg4 >> 16, arg5 >> 16, arg8, local168, arg11, local144, local225, local256, local287, local236, local267, local298);
								arg4 += local78;
								arg5 += local108;
								arg11 += local156;
								arg8 += local180;
								arg2 += this.anInt3220;
								local225 += local247;
								local256 += local278;
								local287 += local309;
							}
						}
						this.method2730(this.anIntArray191, this.anIntArray189, local4, arg2, arg3 >> 16, arg5 >> 16, arg8, local168, arg11, local144, local225, local256, local287, local236, local267, local298);
						arg3 += local93;
						arg5 += local108;
						arg11 += local156;
						arg8 += local180;
						arg2 += this.anInt3220;
						local225 += local247;
						local256 += local278;
						local287 += local309;
					}
				} else {
					arg0 -= arg1;
					arg1 -= arg2;
					arg2 = this.anIntArray190[arg2];
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								this.method2730(this.anIntArray191, this.anIntArray189, local4, arg2, arg5 >> 16, arg4 >> 16, arg8, local168, arg11, local144, local225, local256, local287, local236, local267, local298);
								arg4 += local78;
								arg5 += local108;
								arg11 += local156;
								arg8 += local180;
								arg2 += this.anInt3220;
								local225 += local247;
								local256 += local278;
								local287 += local309;
							}
						}
						this.method2730(this.anIntArray191, this.anIntArray189, local4, arg2, arg5 >> 16, arg3 >> 16, arg8, local168, arg11, local144, local225, local256, local287, local236, local267, local298);
						arg3 += local93;
						arg5 += local108;
						arg11 += local156;
						arg8 += local180;
						arg2 += this.anInt3220;
						local225 += local247;
						local256 += local278;
						local287 += local309;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(IIIIIIIIII)V")
	public void method2735(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (this.aBoolean252) {
			this.aClass12_Sub3_7.method6427(arg9, arg3, arg1, arg4, arg0);
			this.aClass12_Sub3_7.method6427(arg9, arg4, arg2, arg5, arg1);
			this.aClass12_Sub3_7.method6427(arg9, arg5, arg0, arg3, arg2);
			return;
		}
		@Pc(34) int local34 = arg4 - arg3;
		@Pc(38) int local38 = arg1 - arg0;
		@Pc(42) int local42 = arg5 - arg3;
		@Pc(46) int local46 = arg2 - arg0;
		@Pc(50) int local50 = arg7 - arg6;
		@Pc(54) int local54 = arg8 - arg6;
		@Pc(56) int local56 = 0;
		if (arg1 != arg0) {
			local56 = (arg4 - arg3 << 16) / (arg1 - arg0);
		}
		@Pc(71) int local71 = 0;
		if (arg2 != arg1) {
			local71 = (arg5 - arg4 << 16) / (arg2 - arg1);
		}
		@Pc(86) int local86 = 0;
		if (arg2 != arg0) {
			local86 = (arg3 - arg5 << 16) / (arg0 - arg2);
		}
		@Pc(107) int local107 = local34 * local46 - local42 * local38;
		if (local107 == 0) {
			return;
		}
		@Pc(122) int local122 = (local50 * local46 - local54 * local38 << 8) / local107;
		@Pc(134) int local134 = (local54 * local34 - local50 * local42 << 8) / local107;
		if (arg0 <= arg1 && arg0 <= arg2) {
			if (arg0 < this.anInt3218) {
				if (arg1 > this.anInt3218) {
					arg1 = this.anInt3218;
				}
				if (arg2 > this.anInt3218) {
					arg2 = this.anInt3218;
				}
				arg6 = (arg6 << 8) + local122 - local122 * arg3;
				if (arg1 < arg2) {
					arg5 = arg3 <<= 0x10;
					if (arg0 < 0) {
						arg5 -= local86 * arg0;
						arg3 -= local56 * arg0;
						arg6 -= local134 * arg0;
						arg0 = 0;
					}
					arg4 <<= 0x10;
					if (arg1 < 0) {
						arg4 -= local71 * arg1;
						arg1 = 0;
					}
					if (arg0 != arg1 && local86 < local56 || arg0 == arg1 && local86 > local71) {
						arg2 -= arg1;
						arg1 -= arg0;
						arg0 = this.anIntArray190[arg0];
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									this.method2722(this.anIntArray191, this.anIntArray189, arg0, arg9, arg5 >> 16, arg4 >> 16, arg6, local122);
									arg5 += local86;
									arg4 += local71;
									arg6 += local134;
									arg0 += this.anInt3220;
								}
							}
							this.method2722(this.anIntArray191, this.anIntArray189, arg0, arg9, arg5 >> 16, arg3 >> 16, arg6, local122);
							arg5 += local86;
							arg3 += local56;
							arg6 += local134;
							arg0 += this.anInt3220;
						}
					} else {
						arg2 -= arg1;
						arg1 -= arg0;
						arg0 = this.anIntArray190[arg0];
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									this.method2722(this.anIntArray191, this.anIntArray189, arg0, arg9, arg4 >> 16, arg5 >> 16, arg6, local122);
									arg5 += local86;
									arg4 += local71;
									arg6 += local134;
									arg0 += this.anInt3220;
								}
							}
							this.method2722(this.anIntArray191, this.anIntArray189, arg0, arg9, arg3 >> 16, arg5 >> 16, arg6, local122);
							arg5 += local86;
							arg3 += local56;
							arg6 += local134;
							arg0 += this.anInt3220;
						}
					}
				} else {
					arg4 = arg3 <<= 0x10;
					if (arg0 < 0) {
						arg4 -= local86 * arg0;
						arg3 -= local56 * arg0;
						arg6 -= local134 * arg0;
						arg0 = 0;
					}
					arg5 <<= 0x10;
					if (arg2 < 0) {
						arg5 -= local71 * arg2;
						arg2 = 0;
					}
					if ((arg0 == arg2 || local86 >= local56) && (arg0 != arg2 || local71 <= local56)) {
						arg1 -= arg2;
						arg2 -= arg0;
						arg0 = this.anIntArray190[arg0];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return;
									}
									this.method2722(this.anIntArray191, this.anIntArray189, arg0, arg9, arg3 >> 16, arg5 >> 16, arg6, local122);
									arg5 += local71;
									arg3 += local56;
									arg6 += local134;
									arg0 += this.anInt3220;
								}
							}
							this.method2722(this.anIntArray191, this.anIntArray189, arg0, arg9, arg3 >> 16, arg4 >> 16, arg6, local122);
							arg4 += local86;
							arg3 += local56;
							arg6 += local134;
							arg0 += this.anInt3220;
						}
					} else {
						arg1 -= arg2;
						arg2 -= arg0;
						arg0 = this.anIntArray190[arg0];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return;
									}
									this.method2722(this.anIntArray191, this.anIntArray189, arg0, arg9, arg5 >> 16, arg3 >> 16, arg6, local122);
									arg5 += local71;
									arg3 += local56;
									arg6 += local134;
									arg0 += this.anInt3220;
								}
							}
							this.method2722(this.anIntArray191, this.anIntArray189, arg0, arg9, arg4 >> 16, arg3 >> 16, arg6, local122);
							arg4 += local86;
							arg3 += local56;
							arg6 += local134;
							arg0 += this.anInt3220;
						}
					}
				}
			}
		} else if (arg1 <= arg2) {
			if (arg1 < this.anInt3218) {
				if (arg2 > this.anInt3218) {
					arg2 = this.anInt3218;
				}
				if (arg0 > this.anInt3218) {
					arg0 = this.anInt3218;
				}
				arg7 = (arg7 << 8) + local122 - local122 * arg4;
				if (arg2 < arg0) {
					arg3 = arg4 <<= 0x10;
					if (arg1 < 0) {
						arg3 -= local56 * arg1;
						arg4 -= local71 * arg1;
						arg7 -= local134 * arg1;
						arg1 = 0;
					}
					arg5 <<= 0x10;
					if (arg2 < 0) {
						arg5 -= local86 * arg2;
						arg2 = 0;
					}
					if (arg1 != arg2 && local56 < local71 || arg1 == arg2 && local56 > local86) {
						arg0 -= arg2;
						arg2 -= arg1;
						arg1 = this.anIntArray190[arg1];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return;
									}
									this.method2722(this.anIntArray191, this.anIntArray189, arg1, arg9, arg3 >> 16, arg5 >> 16, arg7, local122);
									arg3 += local56;
									arg5 += local86;
									arg7 += local134;
									arg1 += this.anInt3220;
								}
							}
							this.method2722(this.anIntArray191, this.anIntArray189, arg1, arg9, arg3 >> 16, arg4 >> 16, arg7, local122);
							arg3 += local56;
							arg4 += local71;
							arg7 += local134;
							arg1 += this.anInt3220;
						}
					} else {
						arg0 -= arg2;
						arg2 -= arg1;
						arg1 = this.anIntArray190[arg1];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return;
									}
									this.method2722(this.anIntArray191, this.anIntArray189, arg1, arg9, arg5 >> 16, arg3 >> 16, arg7, local122);
									arg3 += local56;
									arg5 += local86;
									arg7 += local134;
									arg1 += this.anInt3220;
								}
							}
							this.method2722(this.anIntArray191, this.anIntArray189, arg1, arg9, arg4 >> 16, arg3 >> 16, arg7, local122);
							arg3 += local56;
							arg4 += local71;
							arg7 += local134;
							arg1 += this.anInt3220;
						}
					}
				} else {
					arg5 = arg4 <<= 0x10;
					if (arg1 < 0) {
						arg5 -= local56 * arg1;
						arg4 -= local71 * arg1;
						arg7 -= local134 * arg1;
						arg1 = 0;
					}
					arg3 <<= 0x10;
					if (arg0 < 0) {
						arg3 -= local86 * arg0;
						arg0 = 0;
					}
					if (local56 < local71) {
						arg2 -= arg0;
						arg0 -= arg1;
						arg1 = this.anIntArray190[arg1];
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									this.method2722(this.anIntArray191, this.anIntArray189, arg1, arg9, arg3 >> 16, arg4 >> 16, arg7, local122);
									arg3 += local86;
									arg4 += local71;
									arg7 += local134;
									arg1 += this.anInt3220;
								}
							}
							this.method2722(this.anIntArray191, this.anIntArray189, arg1, arg9, arg5 >> 16, arg4 >> 16, arg7, local122);
							arg5 += local56;
							arg4 += local71;
							arg7 += local134;
							arg1 += this.anInt3220;
						}
					} else {
						arg2 -= arg0;
						arg0 -= arg1;
						arg1 = this.anIntArray190[arg1];
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									this.method2722(this.anIntArray191, this.anIntArray189, arg1, arg9, arg4 >> 16, arg3 >> 16, arg7, local122);
									arg3 += local86;
									arg4 += local71;
									arg7 += local134;
									arg1 += this.anInt3220;
								}
							}
							this.method2722(this.anIntArray191, this.anIntArray189, arg1, arg9, arg4 >> 16, arg5 >> 16, arg7, local122);
							arg5 += local56;
							arg4 += local71;
							arg7 += local134;
							arg1 += this.anInt3220;
						}
					}
				}
			}
		} else if (arg2 < this.anInt3218) {
			if (arg0 > this.anInt3218) {
				arg0 = this.anInt3218;
			}
			if (arg1 > this.anInt3218) {
				arg1 = this.anInt3218;
			}
			arg8 = (arg8 << 8) + local122 - local122 * arg5;
			if (arg0 < arg1) {
				arg4 = arg5 <<= 0x10;
				if (arg2 < 0) {
					arg4 -= local71 * arg2;
					arg5 -= local86 * arg2;
					arg8 -= local134 * arg2;
					arg2 = 0;
				}
				arg3 <<= 0x10;
				if (arg0 < 0) {
					arg3 -= local56 * arg0;
					arg0 = 0;
				}
				if (local71 < local86) {
					arg1 -= arg0;
					arg0 -= arg2;
					arg2 = this.anIntArray190[arg2];
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								this.method2722(this.anIntArray191, this.anIntArray189, arg2, arg9, arg4 >> 16, arg3 >> 16, arg8, local122);
								arg4 += local71;
								arg3 += local56;
								arg8 += local134;
								arg2 += this.anInt3220;
							}
						}
						this.method2722(this.anIntArray191, this.anIntArray189, arg2, arg9, arg4 >> 16, arg5 >> 16, arg8, local122);
						arg4 += local71;
						arg5 += local86;
						arg8 += local134;
						arg2 += this.anInt3220;
					}
				} else {
					arg1 -= arg0;
					arg0 -= arg2;
					arg2 = this.anIntArray190[arg2];
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								this.method2722(this.anIntArray191, this.anIntArray189, arg2, arg9, arg3 >> 16, arg4 >> 16, arg8, local122);
								arg4 += local71;
								arg3 += local56;
								arg8 += local134;
								arg2 += this.anInt3220;
							}
						}
						this.method2722(this.anIntArray191, this.anIntArray189, arg2, arg9, arg5 >> 16, arg4 >> 16, arg8, local122);
						arg4 += local71;
						arg5 += local86;
						arg8 += local134;
						arg2 += this.anInt3220;
					}
				}
			} else {
				arg3 = arg5 <<= 0x10;
				if (arg2 < 0) {
					arg3 -= local71 * arg2;
					arg5 -= local86 * arg2;
					arg8 -= local134 * arg2;
					arg2 = 0;
				}
				arg4 <<= 0x10;
				if (arg1 < 0) {
					arg4 -= local56 * arg1;
					arg1 = 0;
				}
				if (local71 < local86) {
					arg0 -= arg1;
					arg1 -= arg2;
					arg2 = this.anIntArray190[arg2];
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								this.method2722(this.anIntArray191, this.anIntArray189, arg2, arg9, arg4 >> 16, arg5 >> 16, arg8, local122);
								arg4 += local56;
								arg5 += local86;
								arg8 += local134;
								arg2 += this.anInt3220;
							}
						}
						this.method2722(this.anIntArray191, this.anIntArray189, arg2, arg9, arg3 >> 16, arg5 >> 16, arg8, local122);
						arg3 += local71;
						arg5 += local86;
						arg8 += local134;
						arg2 += this.anInt3220;
					}
				} else {
					arg0 -= arg1;
					arg1 -= arg2;
					arg2 = this.anIntArray190[arg2];
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								this.method2722(this.anIntArray191, this.anIntArray189, arg2, arg9, arg5 >> 16, arg4 >> 16, arg8, local122);
								arg4 += local56;
								arg5 += local86;
								arg8 += local134;
								arg2 += this.anInt3220;
							}
						}
						this.method2722(this.anIntArray191, this.anIntArray189, arg2, arg9, arg5 >> 16, arg3 >> 16, arg8, local122);
						arg3 += local71;
						arg5 += local86;
						arg8 += local134;
						arg2 += this.anInt3220;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!gw", name = "d", descriptor = "([I[I[IIIIIIIIIIFFFFFF)V")
	private void method2736(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int arg8, @OriginalArg(11) int arg9, @OriginalArg(12) float arg10, @OriginalArg(13) float arg11, @OriginalArg(14) float arg12, @OriginalArg(15) float arg13, @OriginalArg(16) float arg14, @OriginalArg(17) float arg15) {
		@Pc(3) int local3 = arg5 - arg4;
		@Pc(6) int local6 = this.anInt3219;
		@Pc(11) int local11 = 256 - this.anInt3219;
		@Pc(136) int local136;
		@Pc(124) int local124;
		@Pc(57) int local57;
		@Pc(64) int local64;
		@Pc(92) int local92;
		@Pc(99) int local99;
		@Pc(150) int local150;
		@Pc(19) int local19;
		@Pc(110) int local110;
		@Pc(132) int local132;
		@Pc(28) float local28;
		@Pc(37) float local37;
		@Pc(46) float local46;
		@Pc(160) int local160;
		if (!this.aBoolean253) {
			local19 = arg4 - this.anInt3215;
			local28 = arg10 + arg13 / 8.0F * (float) local19;
			local37 = arg11 + arg14 / 8.0F * (float) local19;
			local46 = arg12 + arg15 / 8.0F * (float) local19;
			if (local46 == 0.0F) {
				local57 = 0;
				local64 = 0;
			} else {
				local57 = (int) (local28 * 16384.0F / local46);
				local64 = (int) (local37 * 16384.0F / local46);
			}
			arg10 = local28 + arg13;
			arg11 = local37 + arg14;
			arg12 = local46 + arg15;
			if (arg12 == 0.0F) {
				local92 = 0;
				local99 = 0;
			} else {
				local92 = (int) (arg10 * 16384.0F / arg12);
				local99 = (int) (arg11 * 16384.0F / arg12);
			}
			local110 = (local57 << 18) + local64;
			local124 = (local92 - local57 >> 3 << 18) + (local99 - local64 >> 3);
			local3 >>= 0x3;
			local132 = arg9 << 3;
			local136 = arg8 >> 8;
			if (this.aBoolean248) {
				if (local3 > 0) {
					do {
						if (arg6 < arg1[arg3]) {
							local160 = arg2[(local110 & 0x3F80) + (local110 >>> 25)];
							local150 = arg0[arg3];
							local160 = ((local160 & 0xFF00FF) * local136 & 0xFF00FF00) + ((local160 & 0xFF00) * local136 & 0xFF0000) >> 8;
							arg0[arg3] = ((local150 & 0xFF00FF) * local6 + (local160 & 0xFF00FF) * local11 & 0xFF00FF00) + ((local150 & 0xFF00) * local6 + (local160 & 0xFF00) * local11 & 0xFF0000) >> 8;
							arg1[arg3] = arg6;
						}
						arg6 += arg7;
						arg3++;
						local110 += local124;
						if (arg6 < arg1[arg3]) {
							local160 = arg2[(local110 & 0x3F80) + (local110 >>> 25)];
							local150 = arg0[arg3];
							local160 = ((local160 & 0xFF00FF) * local136 & 0xFF00FF00) + ((local160 & 0xFF00) * local136 & 0xFF0000) >> 8;
							arg0[arg3] = ((local150 & 0xFF00FF) * local6 + (local160 & 0xFF00FF) * local11 & 0xFF00FF00) + ((local150 & 0xFF00) * local6 + (local160 & 0xFF00) * local11 & 0xFF0000) >> 8;
							arg1[arg3] = arg6;
						}
						arg6 += arg7;
						arg3++;
						local110 += local124;
						if (arg6 < arg1[arg3]) {
							local160 = arg2[(local110 & 0x3F80) + (local110 >>> 25)];
							local150 = arg0[arg3];
							local160 = ((local160 & 0xFF00FF) * local136 & 0xFF00FF00) + ((local160 & 0xFF00) * local136 & 0xFF0000) >> 8;
							arg0[arg3] = ((local150 & 0xFF00FF) * local6 + (local160 & 0xFF00FF) * local11 & 0xFF00FF00) + ((local150 & 0xFF00) * local6 + (local160 & 0xFF00) * local11 & 0xFF0000) >> 8;
							arg1[arg3] = arg6;
						}
						arg6 += arg7;
						arg3++;
						local110 += local124;
						if (arg6 < arg1[arg3]) {
							local160 = arg2[(local110 & 0x3F80) + (local110 >>> 25)];
							local150 = arg0[arg3];
							local160 = ((local160 & 0xFF00FF) * local136 & 0xFF00FF00) + ((local160 & 0xFF00) * local136 & 0xFF0000) >> 8;
							arg0[arg3] = ((local150 & 0xFF00FF) * local6 + (local160 & 0xFF00FF) * local11 & 0xFF00FF00) + ((local150 & 0xFF00) * local6 + (local160 & 0xFF00) * local11 & 0xFF0000) >> 8;
							arg1[arg3] = arg6;
						}
						arg6 += arg7;
						arg3++;
						local110 += local124;
						if (arg6 < arg1[arg3]) {
							local160 = arg2[(local110 & 0x3F80) + (local110 >>> 25)];
							local150 = arg0[arg3];
							local160 = ((local160 & 0xFF00FF) * local136 & 0xFF00FF00) + ((local160 & 0xFF00) * local136 & 0xFF0000) >> 8;
							arg0[arg3] = ((local150 & 0xFF00FF) * local6 + (local160 & 0xFF00FF) * local11 & 0xFF00FF00) + ((local150 & 0xFF00) * local6 + (local160 & 0xFF00) * local11 & 0xFF0000) >> 8;
							arg1[arg3] = arg6;
						}
						arg6 += arg7;
						arg3++;
						local110 += local124;
						if (arg6 < arg1[arg3]) {
							local160 = arg2[(local110 & 0x3F80) + (local110 >>> 25)];
							local150 = arg0[arg3];
							local160 = ((local160 & 0xFF00FF) * local136 & 0xFF00FF00) + ((local160 & 0xFF00) * local136 & 0xFF0000) >> 8;
							arg0[arg3] = ((local150 & 0xFF00FF) * local6 + (local160 & 0xFF00FF) * local11 & 0xFF00FF00) + ((local150 & 0xFF00) * local6 + (local160 & 0xFF00) * local11 & 0xFF0000) >> 8;
							arg1[arg3] = arg6;
						}
						arg6 += arg7;
						arg3++;
						local110 += local124;
						if (arg6 < arg1[arg3]) {
							local160 = arg2[(local110 & 0x3F80) + (local110 >>> 25)];
							local150 = arg0[arg3];
							local160 = ((local160 & 0xFF00FF) * local136 & 0xFF00FF00) + ((local160 & 0xFF00) * local136 & 0xFF0000) >> 8;
							arg0[arg3] = ((local150 & 0xFF00FF) * local6 + (local160 & 0xFF00FF) * local11 & 0xFF00FF00) + ((local150 & 0xFF00) * local6 + (local160 & 0xFF00) * local11 & 0xFF0000) >> 8;
							arg1[arg3] = arg6;
						}
						arg6 += arg7;
						arg3++;
						local110 += local124;
						if (arg6 < arg1[arg3]) {
							local160 = arg2[(local110 & 0x3F80) + (local110 >>> 25)];
							local150 = arg0[arg3];
							local160 = ((local160 & 0xFF00FF) * local136 & 0xFF00FF00) + ((local160 & 0xFF00) * local136 & 0xFF0000) >> 8;
							arg0[arg3] = ((local150 & 0xFF00FF) * local6 + (local160 & 0xFF00FF) * local11 & 0xFF00FF00) + ((local150 & 0xFF00) * local6 + (local160 & 0xFF00) * local11 & 0xFF0000) >> 8;
							arg1[arg3] = arg6;
						}
						arg6 += arg7;
						arg3++;
						local57 = local92;
						local64 = local99;
						arg10 += arg13;
						arg11 += arg14;
						arg12 += arg15;
						if (arg12 == 0.0F) {
							local92 = 0;
							local99 = 0;
						} else {
							local92 = (int) (arg10 * 16384.0F / arg12);
							local99 = (int) (arg11 * 16384.0F / arg12);
						}
						local110 = (local57 << 18) + local64;
						local124 = (local92 - local57 >> 3 << 18) + (local99 - local64 >> 3);
						arg8 += local132;
						local136 = arg8 >> 8;
						local3--;
					} while (local3 > 0);
				}
				local3 = arg5 - arg4 & 0x7;
				if (local3 > 0) {
					do {
						if (arg6 < arg1[arg3]) {
							local160 = arg2[(local110 & 0x3F80) + (local110 >>> 25)];
							local150 = arg0[arg3];
							local160 = ((local160 & 0xFF00FF) * local136 & 0xFF00FF00) + ((local160 & 0xFF00) * local136 & 0xFF0000) >> 8;
							arg0[arg3] = ((local150 & 0xFF00FF) * local6 + (local160 & 0xFF00FF) * local11 & 0xFF00FF00) + ((local150 & 0xFF00) * local6 + (local160 & 0xFF00) * local11 & 0xFF0000) >> 8;
							arg1[arg3] = arg6;
						}
						arg6 += arg7;
						arg3++;
						local110 += local124;
						local3--;
					} while (local3 > 0);
					return;
				}
			} else {
				if (local3 > 0) {
					do {
						@Pc(2766) int local2766;
						if (arg6 < arg1[arg3] && (local2766 = arg2[(local110 & 0x3F80) + (local110 >>> 25)]) != 0) {
							local150 = arg0[arg3];
							local160 = ((local2766 & 0xFF00FF) * local136 & 0xFF00FF00) + ((local2766 & 0xFF00) * local136 & 0xFF0000) >> 8;
							arg0[arg3] = ((local150 & 0xFF00FF) * local6 + (local160 & 0xFF00FF) * local11 & 0xFF00FF00) + ((local150 & 0xFF00) * local6 + (local160 & 0xFF00) * local11 & 0xFF0000) >> 8;
							arg1[arg3] = arg6;
						}
						arg6 += arg7;
						arg3++;
						local110 += local124;
						@Pc(2850) int local2850;
						if (arg6 < arg1[arg3] && (local2850 = arg2[(local110 & 0x3F80) + (local110 >>> 25)]) != 0) {
							local150 = arg0[arg3];
							local160 = ((local2850 & 0xFF00FF) * local136 & 0xFF00FF00) + ((local2850 & 0xFF00) * local136 & 0xFF0000) >> 8;
							arg0[arg3] = ((local150 & 0xFF00FF) * local6 + (local160 & 0xFF00FF) * local11 & 0xFF00FF00) + ((local150 & 0xFF00) * local6 + (local160 & 0xFF00) * local11 & 0xFF0000) >> 8;
							arg1[arg3] = arg6;
						}
						arg6 += arg7;
						arg3++;
						local110 += local124;
						@Pc(2934) int local2934;
						if (arg6 < arg1[arg3] && (local2934 = arg2[(local110 & 0x3F80) + (local110 >>> 25)]) != 0) {
							local150 = arg0[arg3];
							local160 = ((local2934 & 0xFF00FF) * local136 & 0xFF00FF00) + ((local2934 & 0xFF00) * local136 & 0xFF0000) >> 8;
							arg0[arg3] = ((local150 & 0xFF00FF) * local6 + (local160 & 0xFF00FF) * local11 & 0xFF00FF00) + ((local150 & 0xFF00) * local6 + (local160 & 0xFF00) * local11 & 0xFF0000) >> 8;
							arg1[arg3] = arg6;
						}
						arg6 += arg7;
						arg3++;
						local110 += local124;
						@Pc(3018) int local3018;
						if (arg6 < arg1[arg3] && (local3018 = arg2[(local110 & 0x3F80) + (local110 >>> 25)]) != 0) {
							local150 = arg0[arg3];
							local160 = ((local3018 & 0xFF00FF) * local136 & 0xFF00FF00) + ((local3018 & 0xFF00) * local136 & 0xFF0000) >> 8;
							arg0[arg3] = ((local150 & 0xFF00FF) * local6 + (local160 & 0xFF00FF) * local11 & 0xFF00FF00) + ((local150 & 0xFF00) * local6 + (local160 & 0xFF00) * local11 & 0xFF0000) >> 8;
							arg1[arg3] = arg6;
						}
						arg6 += arg7;
						arg3++;
						local110 += local124;
						@Pc(3102) int local3102;
						if (arg6 < arg1[arg3] && (local3102 = arg2[(local110 & 0x3F80) + (local110 >>> 25)]) != 0) {
							local150 = arg0[arg3];
							local160 = ((local3102 & 0xFF00FF) * local136 & 0xFF00FF00) + ((local3102 & 0xFF00) * local136 & 0xFF0000) >> 8;
							arg0[arg3] = ((local150 & 0xFF00FF) * local6 + (local160 & 0xFF00FF) * local11 & 0xFF00FF00) + ((local150 & 0xFF00) * local6 + (local160 & 0xFF00) * local11 & 0xFF0000) >> 8;
							arg1[arg3] = arg6;
						}
						arg6 += arg7;
						arg3++;
						local110 += local124;
						@Pc(3186) int local3186;
						if (arg6 < arg1[arg3] && (local3186 = arg2[(local110 & 0x3F80) + (local110 >>> 25)]) != 0) {
							local150 = arg0[arg3];
							local160 = ((local3186 & 0xFF00FF) * local136 & 0xFF00FF00) + ((local3186 & 0xFF00) * local136 & 0xFF0000) >> 8;
							arg0[arg3] = ((local150 & 0xFF00FF) * local6 + (local160 & 0xFF00FF) * local11 & 0xFF00FF00) + ((local150 & 0xFF00) * local6 + (local160 & 0xFF00) * local11 & 0xFF0000) >> 8;
							arg1[arg3] = arg6;
						}
						arg6 += arg7;
						arg3++;
						local110 += local124;
						@Pc(3270) int local3270;
						if (arg6 < arg1[arg3] && (local3270 = arg2[(local110 & 0x3F80) + (local110 >>> 25)]) != 0) {
							local150 = arg0[arg3];
							local160 = ((local3270 & 0xFF00FF) * local136 & 0xFF00FF00) + ((local3270 & 0xFF00) * local136 & 0xFF0000) >> 8;
							arg0[arg3] = ((local150 & 0xFF00FF) * local6 + (local160 & 0xFF00FF) * local11 & 0xFF00FF00) + ((local150 & 0xFF00) * local6 + (local160 & 0xFF00) * local11 & 0xFF0000) >> 8;
							arg1[arg3] = arg6;
						}
						arg6 += arg7;
						arg3++;
						local110 += local124;
						@Pc(3354) int local3354;
						if (arg6 < arg1[arg3] && (local3354 = arg2[(local110 & 0x3F80) + (local110 >>> 25)]) != 0) {
							local150 = arg0[arg3];
							local160 = ((local3354 & 0xFF00FF) * local136 & 0xFF00FF00) + ((local3354 & 0xFF00) * local136 & 0xFF0000) >> 8;
							arg0[arg3] = ((local150 & 0xFF00FF) * local6 + (local160 & 0xFF00FF) * local11 & 0xFF00FF00) + ((local150 & 0xFF00) * local6 + (local160 & 0xFF00) * local11 & 0xFF0000) >> 8;
							arg1[arg3] = arg6;
						}
						arg6 += arg7;
						arg3++;
						local57 = local92;
						local64 = local99;
						arg10 += arg13;
						arg11 += arg14;
						arg12 += arg15;
						if (arg12 == 0.0F) {
							local92 = 0;
							local99 = 0;
						} else {
							local92 = (int) (arg10 * 16384.0F / arg12);
							local99 = (int) (arg11 * 16384.0F / arg12);
						}
						local110 = (local57 << 18) + local64;
						local124 = (local92 - local57 >> 3 << 18) + (local99 - local64 >> 3);
						arg8 += local132;
						local136 = arg8 >> 8;
						local3--;
					} while (local3 > 0);
				}
				local3 = arg5 - arg4 & 0x7;
				if (local3 > 0) {
					do {
						@Pc(3516) int local3516;
						if (arg6 < arg1[arg3] && (local3516 = arg2[(local110 & 0x3F80) + (local110 >>> 25)]) != 0) {
							local150 = arg0[arg3];
							local160 = ((local3516 & 0xFF00FF) * local136 & 0xFF00FF00) + ((local3516 & 0xFF00) * local136 & 0xFF0000) >> 8;
							arg0[arg3] = ((local150 & 0xFF00FF) * local6 + (local160 & 0xFF00FF) * local11 & 0xFF00FF00) + ((local150 & 0xFF00) * local6 + (local160 & 0xFF00) * local11 & 0xFF0000) >> 8;
							arg1[arg3] = arg6;
						}
						arg6 += arg7;
						arg3++;
						local110 += local124;
						local3--;
					} while (local3 > 0);
				}
			}
			return;
		}
		local19 = arg4 - this.anInt3215;
		local28 = arg10 + arg13 / 8.0F * (float) local19;
		local37 = arg11 + arg14 / 8.0F * (float) local19;
		local46 = arg12 + arg15 / 8.0F * (float) local19;
		if (local46 == 0.0F) {
			local57 = 0;
			local64 = 0;
		} else {
			local57 = (int) (local28 * 4096.0F / local46);
			local64 = (int) (local37 * 4096.0F / local46);
		}
		arg10 = local28 + arg13;
		arg11 = local37 + arg14;
		arg12 = local46 + arg15;
		if (arg12 == 0.0F) {
			local92 = 0;
			local99 = 0;
		} else {
			local92 = (int) (arg10 * 4096.0F / arg12);
			local99 = (int) (arg11 * 4096.0F / arg12);
		}
		local110 = (local57 << 20) + local64;
		local124 = (local92 - local57 >> 3 << 20) + (local99 - local64 >> 3);
		local3 >>= 0x3;
		local132 = arg9 << 3;
		local136 = arg8 >> 8;
		if (this.aBoolean248) {
			if (local3 > 0) {
				do {
					if (arg6 < arg1[arg3]) {
						local150 = arg0[arg3];
						local160 = arg2[(local110 & 0xFC0) + (local110 >>> 26)];
						local160 = ((local160 & 0xFF00FF) * local136 & 0xFF00FF00) + ((local160 & 0xFF00) * local136 & 0xFF0000) >> 8;
						arg0[arg3] = ((local150 & 0xFF00FF) * local6 + (local160 & 0xFF00FF) * local11 & 0xFF00FF00) + ((local150 & 0xFF00) * local6 + (local160 & 0xFF00) * local11 & 0xFF0000) >> 8;
						arg1[arg3] = arg6;
					}
					arg6 += arg7;
					local110 += local124;
					arg3++;
					if (arg6 < arg1[arg3]) {
						local150 = arg0[arg3];
						local160 = arg2[(local110 & 0xFC0) + (local110 >>> 26)];
						local160 = ((local160 & 0xFF00FF) * local136 & 0xFF00FF00) + ((local160 & 0xFF00) * local136 & 0xFF0000) >> 8;
						arg0[arg3] = ((local150 & 0xFF00FF) * local6 + (local160 & 0xFF00FF) * local11 & 0xFF00FF00) + ((local150 & 0xFF00) * local6 + (local160 & 0xFF00) * local11 & 0xFF0000) >> 8;
						arg1[arg3] = arg6;
					}
					arg6 += arg7;
					local110 += local124;
					arg3++;
					if (arg6 < arg1[arg3]) {
						local150 = arg0[arg3];
						local160 = arg2[(local110 & 0xFC0) + (local110 >>> 26)];
						local160 = ((local160 & 0xFF00FF) * local136 & 0xFF00FF00) + ((local160 & 0xFF00) * local136 & 0xFF0000) >> 8;
						arg0[arg3] = ((local150 & 0xFF00FF) * local6 + (local160 & 0xFF00FF) * local11 & 0xFF00FF00) + ((local150 & 0xFF00) * local6 + (local160 & 0xFF00) * local11 & 0xFF0000) >> 8;
						arg1[arg3] = arg6;
					}
					arg6 += arg7;
					local110 += local124;
					arg3++;
					if (arg6 < arg1[arg3]) {
						local150 = arg0[arg3];
						local160 = arg2[(local110 & 0xFC0) + (local110 >>> 26)];
						local160 = ((local160 & 0xFF00FF) * local136 & 0xFF00FF00) + ((local160 & 0xFF00) * local136 & 0xFF0000) >> 8;
						arg0[arg3] = ((local150 & 0xFF00FF) * local6 + (local160 & 0xFF00FF) * local11 & 0xFF00FF00) + ((local150 & 0xFF00) * local6 + (local160 & 0xFF00) * local11 & 0xFF0000) >> 8;
						arg1[arg3] = arg6;
					}
					arg6 += arg7;
					local110 += local124;
					arg3++;
					if (arg6 < arg1[arg3]) {
						local150 = arg0[arg3];
						local160 = arg2[(local110 & 0xFC0) + (local110 >>> 26)];
						local160 = ((local160 & 0xFF00FF) * local136 & 0xFF00FF00) + ((local160 & 0xFF00) * local136 & 0xFF0000) >> 8;
						arg0[arg3] = ((local150 & 0xFF00FF) * local6 + (local160 & 0xFF00FF) * local11 & 0xFF00FF00) + ((local150 & 0xFF00) * local6 + (local160 & 0xFF00) * local11 & 0xFF0000) >> 8;
						arg1[arg3] = arg6;
					}
					arg6 += arg7;
					local110 += local124;
					arg3++;
					if (arg6 < arg1[arg3]) {
						local150 = arg0[arg3];
						local160 = arg2[(local110 & 0xFC0) + (local110 >>> 26)];
						local160 = ((local160 & 0xFF00FF) * local136 & 0xFF00FF00) + ((local160 & 0xFF00) * local136 & 0xFF0000) >> 8;
						arg0[arg3] = ((local150 & 0xFF00FF) * local6 + (local160 & 0xFF00FF) * local11 & 0xFF00FF00) + ((local150 & 0xFF00) * local6 + (local160 & 0xFF00) * local11 & 0xFF0000) >> 8;
						arg1[arg3] = arg6;
					}
					arg6 += arg7;
					local110 += local124;
					arg3++;
					if (arg6 < arg1[arg3]) {
						local150 = arg0[arg3];
						local160 = arg2[(local110 & 0xFC0) + (local110 >>> 26)];
						local160 = ((local160 & 0xFF00FF) * local136 & 0xFF00FF00) + ((local160 & 0xFF00) * local136 & 0xFF0000) >> 8;
						arg0[arg3] = ((local150 & 0xFF00FF) * local6 + (local160 & 0xFF00FF) * local11 & 0xFF00FF00) + ((local150 & 0xFF00) * local6 + (local160 & 0xFF00) * local11 & 0xFF0000) >> 8;
						arg1[arg3] = arg6;
					}
					arg6 += arg7;
					local110 += local124;
					arg3++;
					if (arg6 < arg1[arg3]) {
						local150 = arg0[arg3];
						local160 = arg2[(local110 & 0xFC0) + (local110 >>> 26)];
						local160 = ((local160 & 0xFF00FF) * local136 & 0xFF00FF00) + ((local160 & 0xFF00) * local136 & 0xFF0000) >> 8;
						arg0[arg3] = ((local150 & 0xFF00FF) * local6 + (local160 & 0xFF00FF) * local11 & 0xFF00FF00) + ((local150 & 0xFF00) * local6 + (local160 & 0xFF00) * local11 & 0xFF0000) >> 8;
						arg1[arg3] = arg6;
					}
					arg6 += arg7;
					arg3++;
					local57 = local92;
					local64 = local99;
					arg10 += arg13;
					arg11 += arg14;
					arg12 += arg15;
					if (arg12 == 0.0F) {
						local92 = 0;
						local99 = 0;
					} else {
						local92 = (int) (arg10 * 4096.0F / arg12);
						local99 = (int) (arg11 * 4096.0F / arg12);
					}
					local110 = (local57 << 20) + local64;
					local124 = (local92 - local57 >> 3 << 20) + (local99 - local64 >> 3);
					arg8 += local132;
					local136 = arg8 >> 8;
					local3--;
				} while (local3 > 0);
			}
			local3 = arg5 - arg4 & 0x7;
			if (local3 > 0) {
				do {
					if (arg6 < arg1[arg3]) {
						local150 = arg0[arg3];
						local160 = arg2[(local110 & 0xFC0) + (local110 >>> 26)];
						local160 = ((local160 & 0xFF00FF) * local136 & 0xFF00FF00) + ((local160 & 0xFF00) * local136 & 0xFF0000) >> 8;
						arg0[arg3] = ((local150 & 0xFF00FF) * local6 + (local160 & 0xFF00FF) * local11 & 0xFF00FF00) + ((local150 & 0xFF00) * local6 + (local160 & 0xFF00) * local11 & 0xFF0000) >> 8;
						arg1[arg3] = arg6;
					}
					arg6 += arg7;
					local110 += local124;
					arg3++;
					local3--;
				} while (local3 > 0);
				return;
			}
			return;
		}
		if (local3 > 0) {
			do {
				@Pc(979) int local979;
				if (arg6 < arg1[arg3] && (local979 = arg2[(local110 & 0xFC0) + (local110 >>> 26)]) != 0) {
					local150 = arg0[arg3];
					local160 = ((local979 & 0xFF00FF) * local136 & 0xFF00FF00) + ((local979 & 0xFF00) * local136 & 0xFF0000) >> 8;
					arg0[arg3] = ((local150 & 0xFF00FF) * local6 + (local160 & 0xFF00FF) * local11 & 0xFF00FF00) + ((local150 & 0xFF00) * local6 + (local160 & 0xFF00) * local11 & 0xFF0000) >> 8;
					arg1[arg3] = arg6;
				}
				arg6 += arg7;
				arg3++;
				local110 += local124;
				@Pc(1063) int local1063;
				if (arg6 < arg1[arg3] && (local1063 = arg2[(local110 & 0xFC0) + (local110 >>> 26)]) != 0) {
					local150 = arg0[arg3];
					local160 = ((local1063 & 0xFF00FF) * local136 & 0xFF00FF00) + ((local1063 & 0xFF00) * local136 & 0xFF0000) >> 8;
					arg0[arg3] = ((local150 & 0xFF00FF) * local6 + (local160 & 0xFF00FF) * local11 & 0xFF00FF00) + ((local150 & 0xFF00) * local6 + (local160 & 0xFF00) * local11 & 0xFF0000) >> 8;
					arg1[arg3] = arg6;
				}
				arg6 += arg7;
				arg3++;
				local110 += local124;
				@Pc(1147) int local1147;
				if (arg6 < arg1[arg3] && (local1147 = arg2[(local110 & 0xFC0) + (local110 >>> 26)]) != 0) {
					local150 = arg0[arg3];
					local160 = ((local1147 & 0xFF00FF) * local136 & 0xFF00FF00) + ((local1147 & 0xFF00) * local136 & 0xFF0000) >> 8;
					arg0[arg3] = ((local150 & 0xFF00FF) * local6 + (local160 & 0xFF00FF) * local11 & 0xFF00FF00) + ((local150 & 0xFF00) * local6 + (local160 & 0xFF00) * local11 & 0xFF0000) >> 8;
					arg1[arg3] = arg6;
				}
				arg6 += arg7;
				arg3++;
				local110 += local124;
				@Pc(1231) int local1231;
				if (arg6 < arg1[arg3] && (local1231 = arg2[(local110 & 0xFC0) + (local110 >>> 26)]) != 0) {
					local150 = arg0[arg3];
					local160 = ((local1231 & 0xFF00FF) * local136 & 0xFF00FF00) + ((local1231 & 0xFF00) * local136 & 0xFF0000) >> 8;
					arg0[arg3] = ((local150 & 0xFF00FF) * local6 + (local160 & 0xFF00FF) * local11 & 0xFF00FF00) + ((local150 & 0xFF00) * local6 + (local160 & 0xFF00) * local11 & 0xFF0000) >> 8;
					arg1[arg3] = arg6;
				}
				arg6 += arg7;
				arg3++;
				local110 += local124;
				@Pc(1315) int local1315;
				if (arg6 < arg1[arg3] && (local1315 = arg2[(local110 & 0xFC0) + (local110 >>> 26)]) != 0) {
					local150 = arg0[arg3];
					local160 = ((local1315 & 0xFF00FF) * local136 & 0xFF00FF00) + ((local1315 & 0xFF00) * local136 & 0xFF0000) >> 8;
					arg0[arg3] = ((local150 & 0xFF00FF) * local6 + (local160 & 0xFF00FF) * local11 & 0xFF00FF00) + ((local150 & 0xFF00) * local6 + (local160 & 0xFF00) * local11 & 0xFF0000) >> 8;
					arg1[arg3] = arg6;
				}
				arg6 += arg7;
				arg3++;
				local110 += local124;
				@Pc(1399) int local1399;
				if (arg6 < arg1[arg3] && (local1399 = arg2[(local110 & 0xFC0) + (local110 >>> 26)]) != 0) {
					local150 = arg0[arg3];
					local160 = ((local1399 & 0xFF00FF) * local136 & 0xFF00FF00) + ((local1399 & 0xFF00) * local136 & 0xFF0000) >> 8;
					arg0[arg3] = ((local150 & 0xFF00FF) * local6 + (local160 & 0xFF00FF) * local11 & 0xFF00FF00) + ((local150 & 0xFF00) * local6 + (local160 & 0xFF00) * local11 & 0xFF0000) >> 8;
					arg1[arg3] = arg6;
				}
				arg6 += arg7;
				arg3++;
				local110 += local124;
				@Pc(1483) int local1483;
				if (arg6 < arg1[arg3] && (local1483 = arg2[(local110 & 0xFC0) + (local110 >>> 26)]) != 0) {
					local150 = arg0[arg3];
					local160 = ((local1483 & 0xFF00FF) * local136 & 0xFF00FF00) + ((local1483 & 0xFF00) * local136 & 0xFF0000) >> 8;
					arg0[arg3] = ((local150 & 0xFF00FF) * local6 + (local160 & 0xFF00FF) * local11 & 0xFF00FF00) + ((local150 & 0xFF00) * local6 + (local160 & 0xFF00) * local11 & 0xFF0000) >> 8;
					arg1[arg3] = arg6;
				}
				arg6 += arg7;
				arg3++;
				local110 += local124;
				@Pc(1567) int local1567;
				if (arg6 < arg1[arg3] && (local1567 = arg2[(local110 & 0xFC0) + (local110 >>> 26)]) != 0) {
					local150 = arg0[arg3];
					local160 = ((local1567 & 0xFF00FF) * local136 & 0xFF00FF00) + ((local1567 & 0xFF00) * local136 & 0xFF0000) >> 8;
					arg0[arg3] = ((local150 & 0xFF00FF) * local6 + (local160 & 0xFF00FF) * local11 & 0xFF00FF00) + ((local150 & 0xFF00) * local6 + (local160 & 0xFF00) * local11 & 0xFF0000) >> 8;
					arg1[arg3] = arg6;
				}
				arg6 += arg7;
				arg3++;
				local57 = local92;
				local64 = local99;
				arg10 += arg13;
				arg11 += arg14;
				arg12 += arg15;
				if (arg12 == 0.0F) {
					local92 = 0;
					local99 = 0;
				} else {
					local92 = (int) (arg10 * 4096.0F / arg12);
					local99 = (int) (arg11 * 4096.0F / arg12);
				}
				local110 = (local57 << 20) + local64;
				local124 = (local92 - local57 >> 3 << 20) + (local99 - local64 >> 3);
				arg8 += local132;
				local136 = arg8 >> 8;
				local3--;
			} while (local3 > 0);
		}
		local3 = arg5 - arg4 & 0x7;
		if (local3 <= 0) {
			return;
		}
		do {
			@Pc(1729) int local1729;
			if (arg6 < arg1[arg3] && (local1729 = arg2[(local110 & 0xFC0) + (local110 >>> 26)]) != 0) {
				local150 = arg0[arg3];
				local160 = ((local1729 & 0xFF00FF) * local136 & 0xFF00FF00) + ((local1729 & 0xFF00) * local136 & 0xFF0000) >> 8;
				arg0[arg3] = ((local150 & 0xFF00FF) * local6 + (local160 & 0xFF00FF) * local11 & 0xFF00FF00) + ((local150 & 0xFF00) * local6 + (local160 & 0xFF00) * local11 & 0xFF0000) >> 8;
				arg1[arg3] = arg6;
			}
			arg6 += arg7;
			arg3++;
			local110 += local124;
			local3--;
		} while (local3 > 0);
		return;
	}

	@OriginalMember(owner = "client!gw", name = "b", descriptor = "(IIIIIIIIIIII)V")
	public void method2737(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		if (this.aBoolean252) {
			this.aClass12_Sub3_7.method6427(Static341.anIntArray409[arg9], arg3, arg1, arg4, arg0);
			this.aClass12_Sub3_7.method6427(Static341.anIntArray409[arg9], arg4, arg2, arg5, arg1);
			this.aClass12_Sub3_7.method6427(Static341.anIntArray409[arg9], arg5, arg0, arg3, arg2);
			return;
		}
		@Pc(40) int local40 = arg4 - arg3;
		@Pc(44) int local44 = arg1 - arg0;
		@Pc(48) int local48 = arg5 - arg3;
		@Pc(52) int local52 = arg2 - arg0;
		@Pc(56) int local56 = arg10 - arg9;
		@Pc(60) int local60 = arg11 - arg9;
		@Pc(64) int local64 = arg7 - arg6;
		@Pc(68) int local68 = arg8 - arg6;
		@Pc(81) int local81;
		if (arg2 == arg1) {
			local81 = 0;
		} else {
			local81 = (arg5 - arg4 << 16) / (arg2 - arg1);
		}
		@Pc(93) int local93;
		if (arg1 == arg0) {
			local93 = 0;
		} else {
			local93 = (local40 << 16) / local44;
		}
		@Pc(105) int local105;
		if (arg2 == arg0) {
			local105 = 0;
		} else {
			local105 = (local48 << 16) / local52;
		}
		@Pc(116) int local116 = local40 * local52 - local48 * local44;
		if (local116 == 0) {
			return;
		}
		@Pc(131) int local131 = (local56 * local52 - local60 * local44 << 8) / local116;
		@Pc(143) int local143 = (local60 * local40 - local56 * local48 << 8) / local116;
		@Pc(155) int local155 = (local64 * local52 - local68 * local44 << 8) / local116;
		@Pc(167) int local167 = (local68 * local40 - local64 * local48 << 8) / local116;
		if (arg0 <= arg1 && arg0 <= arg2) {
			if (arg0 < this.anInt3218) {
				if (arg1 > this.anInt3218) {
					arg1 = this.anInt3218;
				}
				if (arg2 > this.anInt3218) {
					arg2 = this.anInt3218;
				}
				arg9 = (arg9 << 8) + local131 - local131 * arg3;
				arg6 = (arg6 << 8) + local155 - local155 * arg3;
				if (arg1 < arg2) {
					arg5 = arg3 <<= 0x10;
					if (arg0 < 0) {
						arg5 -= local105 * arg0;
						arg3 -= local93 * arg0;
						arg9 -= local143 * arg0;
						arg6 -= local167 * arg0;
						arg0 = 0;
					}
					arg4 <<= 0x10;
					if (arg1 < 0) {
						arg4 -= local81 * arg1;
						arg1 = 0;
					}
					if ((arg0 == arg1 || local105 >= local93) && (arg0 != arg1 || local105 <= local81)) {
						arg2 -= arg1;
						arg1 -= arg0;
						arg0 = this.anIntArray190[arg0];
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									this.method2725(this.anIntArray191, this.anIntArray189, arg0, arg4 >> 16, arg5 >> 16, arg9, local131, arg6, local155);
									arg5 += local105;
									arg4 += local81;
									arg9 += local143;
									arg6 += local167;
									arg0 += this.anInt3220;
								}
							}
							this.method2725(this.anIntArray191, this.anIntArray189, arg0, arg3 >> 16, arg5 >> 16, arg9, local131, arg6, local155);
							arg5 += local105;
							arg3 += local93;
							arg9 += local143;
							arg6 += local167;
							arg0 += this.anInt3220;
						}
					} else {
						arg2 -= arg1;
						arg1 -= arg0;
						arg0 = this.anIntArray190[arg0];
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									this.method2725(this.anIntArray191, this.anIntArray189, arg0, arg5 >> 16, arg4 >> 16, arg9, local131, arg6, local155);
									arg5 += local105;
									arg4 += local81;
									arg9 += local143;
									arg6 += local167;
									arg0 += this.anInt3220;
								}
							}
							this.method2725(this.anIntArray191, this.anIntArray189, arg0, arg5 >> 16, arg3 >> 16, arg9, local131, arg6, local155);
							arg5 += local105;
							arg3 += local93;
							arg9 += local143;
							arg6 += local167;
							arg0 += this.anInt3220;
						}
					}
				} else {
					arg4 = arg3 <<= 0x10;
					if (arg0 < 0) {
						arg4 -= local105 * arg0;
						arg3 -= local93 * arg0;
						arg9 -= local143 * arg0;
						arg6 -= local167 * arg0;
						arg0 = 0;
					}
					arg5 <<= 0x10;
					if (arg2 < 0) {
						arg5 -= local81 * arg2;
						arg2 = 0;
					}
					if (arg0 != arg2 && local105 < local93 || arg0 == arg2 && local81 > local93) {
						arg1 -= arg2;
						arg2 -= arg0;
						arg0 = this.anIntArray190[arg0];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return;
									}
									this.method2725(this.anIntArray191, this.anIntArray189, arg0, arg5 >> 16, arg3 >> 16, arg9, local131, arg6, local155);
									arg5 += local81;
									arg3 += local93;
									arg9 += local143;
									arg6 += local167;
									arg0 += this.anInt3220;
								}
							}
							this.method2725(this.anIntArray191, this.anIntArray189, arg0, arg4 >> 16, arg3 >> 16, arg9, local131, arg6, local155);
							arg4 += local105;
							arg3 += local93;
							arg9 += local143;
							arg6 += local167;
							arg0 += this.anInt3220;
						}
					} else {
						arg1 -= arg2;
						arg2 -= arg0;
						arg0 = this.anIntArray190[arg0];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return;
									}
									this.method2725(this.anIntArray191, this.anIntArray189, arg0, arg3 >> 16, arg5 >> 16, arg9, local131, arg6, local155);
									arg5 += local81;
									arg3 += local93;
									arg9 += local143;
									arg6 += local167;
									arg0 += this.anInt3220;
								}
							}
							this.method2725(this.anIntArray191, this.anIntArray189, arg0, arg3 >> 16, arg4 >> 16, arg9, local131, arg6, local155);
							arg4 += local105;
							arg3 += local93;
							arg9 += local143;
							arg6 += local167;
							arg0 += this.anInt3220;
						}
					}
				}
			}
		} else if (arg1 <= arg2) {
			if (arg1 < this.anInt3218) {
				if (arg2 > this.anInt3218) {
					arg2 = this.anInt3218;
				}
				if (arg0 > this.anInt3218) {
					arg0 = this.anInt3218;
				}
				arg10 = (arg10 << 8) + local131 - local131 * arg4;
				arg7 = (arg7 << 8) + local155 - local155 * arg4;
				if (arg2 < arg0) {
					arg3 = arg4 <<= 0x10;
					if (arg1 < 0) {
						arg3 -= local93 * arg1;
						arg4 -= local81 * arg1;
						arg10 -= local143 * arg1;
						arg7 -= local167 * arg1;
						arg1 = 0;
					}
					arg5 <<= 0x10;
					if (arg2 < 0) {
						arg5 -= local105 * arg2;
						arg2 = 0;
					}
					if ((arg1 == arg2 || local93 >= local81) && (arg1 != arg2 || local93 <= local105)) {
						arg0 -= arg2;
						arg2 -= arg1;
						arg1 = this.anIntArray190[arg1];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return;
									}
									this.method2725(this.anIntArray191, this.anIntArray189, arg1, arg5 >> 16, arg3 >> 16, arg10, local131, arg7, local155);
									arg3 += local93;
									arg5 += local105;
									arg10 += local143;
									arg7 += local167;
									arg1 += this.anInt3220;
								}
							}
							this.method2725(this.anIntArray191, this.anIntArray189, arg1, arg4 >> 16, arg3 >> 16, arg10, local131, arg7, local155);
							arg3 += local93;
							arg4 += local81;
							arg10 += local143;
							arg7 += local167;
							arg1 += this.anInt3220;
						}
					} else {
						arg0 -= arg2;
						arg2 -= arg1;
						arg1 = this.anIntArray190[arg1];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return;
									}
									this.method2725(this.anIntArray191, this.anIntArray189, arg1, arg3 >> 16, arg5 >> 16, arg10, local131, arg7, local155);
									arg3 += local93;
									arg5 += local105;
									arg10 += local143;
									arg7 += local167;
									arg1 += this.anInt3220;
								}
							}
							this.method2725(this.anIntArray191, this.anIntArray189, arg1, arg3 >> 16, arg4 >> 16, arg10, local131, arg7, local155);
							arg3 += local93;
							arg4 += local81;
							arg10 += local143;
							arg7 += local167;
							arg1 += this.anInt3220;
						}
					}
				} else {
					arg5 = arg4 <<= 0x10;
					if (arg1 < 0) {
						arg5 -= local93 * arg1;
						arg4 -= local81 * arg1;
						arg10 -= local143 * arg1;
						arg7 -= local167 * arg1;
						arg1 = 0;
					}
					arg3 <<= 0x10;
					if (arg0 < 0) {
						arg3 -= local105 * arg0;
						arg0 = 0;
					}
					if (local93 < local81) {
						arg2 -= arg0;
						arg0 -= arg1;
						arg1 = this.anIntArray190[arg1];
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									this.method2725(this.anIntArray191, this.anIntArray189, arg1, arg3 >> 16, arg4 >> 16, arg10, local131, arg7, local155);
									arg3 += local105;
									arg4 += local81;
									arg10 += local143;
									arg7 += local167;
									arg1 += this.anInt3220;
								}
							}
							this.method2725(this.anIntArray191, this.anIntArray189, arg1, arg5 >> 16, arg4 >> 16, arg10, local131, arg7, local155);
							arg5 += local93;
							arg4 += local81;
							arg10 += local143;
							arg7 += local167;
							arg1 += this.anInt3220;
						}
					} else {
						arg2 -= arg0;
						arg0 -= arg1;
						arg1 = this.anIntArray190[arg1];
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									this.method2725(this.anIntArray191, this.anIntArray189, arg1, arg4 >> 16, arg3 >> 16, arg10, local131, arg7, local155);
									arg3 += local105;
									arg4 += local81;
									arg10 += local143;
									arg7 += local167;
									arg1 += this.anInt3220;
								}
							}
							this.method2725(this.anIntArray191, this.anIntArray189, arg1, arg4 >> 16, arg5 >> 16, arg10, local131, arg7, local155);
							arg5 += local93;
							arg4 += local81;
							arg10 += local143;
							arg7 += local167;
							arg1 += this.anInt3220;
						}
					}
				}
			}
		} else if (arg2 < this.anInt3218) {
			if (arg0 > this.anInt3218) {
				arg0 = this.anInt3218;
			}
			if (arg1 > this.anInt3218) {
				arg1 = this.anInt3218;
			}
			arg11 = (arg11 << 8) + local131 - local131 * arg5;
			arg8 = (arg8 << 8) + local155 - local155 * arg5;
			if (arg0 < arg1) {
				arg4 = arg5 <<= 0x10;
				if (arg2 < 0) {
					arg4 -= local81 * arg2;
					arg5 -= local105 * arg2;
					arg11 -= local143 * arg2;
					arg8 -= local167 * arg2;
					arg2 = 0;
				}
				arg3 <<= 0x10;
				if (arg0 < 0) {
					arg3 -= local93 * arg0;
					arg0 = 0;
				}
				if (local81 < local105) {
					arg1 -= arg0;
					arg0 -= arg2;
					arg2 = this.anIntArray190[arg2];
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								this.method2725(this.anIntArray191, this.anIntArray189, arg2, arg4 >> 16, arg3 >> 16, arg11, local131, arg8, local155);
								arg4 += local81;
								arg3 += local93;
								arg11 += local143;
								arg8 += local167;
								arg2 += this.anInt3220;
							}
						}
						this.method2725(this.anIntArray191, this.anIntArray189, arg2, arg4 >> 16, arg5 >> 16, arg11, local131, arg8, local155);
						arg4 += local81;
						arg5 += local105;
						arg11 += local143;
						arg8 += local167;
						arg2 += this.anInt3220;
					}
				} else {
					arg1 -= arg0;
					arg0 -= arg2;
					arg2 = this.anIntArray190[arg2];
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								this.method2725(this.anIntArray191, this.anIntArray189, arg2, arg3 >> 16, arg4 >> 16, arg11, local131, arg8, local155);
								arg4 += local81;
								arg3 += local93;
								arg11 += local143;
								arg8 += local167;
								arg2 += this.anInt3220;
							}
						}
						this.method2725(this.anIntArray191, this.anIntArray189, arg2, arg5 >> 16, arg4 >> 16, arg11, local131, arg8, local155);
						arg4 += local81;
						arg5 += local105;
						arg11 += local143;
						arg8 += local167;
						arg2 += this.anInt3220;
					}
				}
			} else {
				arg3 = arg5 <<= 0x10;
				if (arg2 < 0) {
					arg3 -= local81 * arg2;
					arg5 -= local105 * arg2;
					arg11 -= local143 * arg2;
					arg8 -= local167 * arg2;
					arg2 = 0;
				}
				arg4 <<= 0x10;
				if (arg1 < 0) {
					arg4 -= local93 * arg1;
					arg1 = 0;
				}
				if (local81 < local105) {
					arg0 -= arg1;
					arg1 -= arg2;
					arg2 = this.anIntArray190[arg2];
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								this.method2725(this.anIntArray191, this.anIntArray189, arg2, arg4 >> 16, arg5 >> 16, arg11, local131, arg8, local155);
								arg4 += local93;
								arg5 += local105;
								arg11 += local143;
								arg8 += local167;
								arg2 += this.anInt3220;
							}
						}
						this.method2725(this.anIntArray191, this.anIntArray189, arg2, arg3 >> 16, arg5 >> 16, arg11, local131, arg8, local155);
						arg3 += local81;
						arg5 += local105;
						arg11 += local143;
						arg8 += local167;
						arg2 += this.anInt3220;
					}
				} else {
					arg0 -= arg1;
					arg1 -= arg2;
					arg2 = this.anIntArray190[arg2];
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								this.method2725(this.anIntArray191, this.anIntArray189, arg2, arg5 >> 16, arg4 >> 16, arg11, local131, arg8, local155);
								arg4 += local93;
								arg5 += local105;
								arg11 += local143;
								arg8 += local167;
								arg2 += this.anInt3220;
							}
						}
						this.method2725(this.anIntArray191, this.anIntArray189, arg2, arg5 >> 16, arg3 >> 16, arg11, local131, arg8, local155);
						arg3 += local81;
						arg5 += local105;
						arg11 += local143;
						arg8 += local167;
						arg2 += this.anInt3220;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!gw", name = "e", descriptor = "([I[IIIIIIIIIIIIIFFFFFF)V")
	private void method2738(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int arg8, @OriginalArg(11) int arg9, @OriginalArg(12) int arg10, @OriginalArg(13) int arg11, @OriginalArg(14) float arg12, @OriginalArg(15) float arg13, @OriginalArg(16) float arg14, @OriginalArg(17) float arg15, @OriginalArg(18) float arg16, @OriginalArg(19) float arg17) {
		if (this.aBoolean250) {
			if (arg4 > this.anInt3217) {
				arg4 = this.anInt3217;
			}
			if (arg3 < 0) {
				arg3 = 0;
			}
		}
		if (arg3 >= arg4) {
			return;
		}
		arg2 += arg3;
		arg7 += arg8 * arg3;
		arg10 += arg11 * arg3;
		arg5 += arg6 * arg3;
		@Pc(43) int local43 = arg4 - arg3;
		@Pc(47) int local47 = arg8 << 3;
		@Pc(51) int local51 = arg7 >> 16;
		@Pc(55) int local55 = 255 - local51;
		@Pc(73) int local73 = ((arg9 & 0xFF00FF) * local51 & 0xFF00FF00 | (arg9 & 0xFF00) * local51 & 0xFF0000) >>> 8;
		@Pc(76) int local76 = this.anInt3219;
		@Pc(81) int local81 = 256 - this.anInt3219;
		@Pc(206) int local206;
		@Pc(194) int local194;
		@Pc(127) int local127;
		@Pc(134) int local134;
		@Pc(162) int local162;
		@Pc(169) int local169;
		@Pc(221) int local221;
		@Pc(89) int local89;
		@Pc(231) int local231;
		@Pc(180) int local180;
		@Pc(306) int local306;
		@Pc(310) int local310;
		@Pc(202) int local202;
		@Pc(98) float local98;
		@Pc(107) float local107;
		@Pc(116) float local116;
		if (!this.aBoolean253) {
			local89 = arg3 - this.anInt3215;
			local98 = arg12 + arg15 / 8.0F * (float) local89;
			local107 = arg13 + arg16 / 8.0F * (float) local89;
			local116 = arg14 + arg17 / 8.0F * (float) local89;
			if (local116 == 0.0F) {
				local127 = 0;
				local134 = 0;
			} else {
				local127 = (int) (local98 * 16384.0F / local116);
				local134 = (int) (local107 * 16384.0F / local116);
			}
			arg12 = local98 + arg15;
			arg13 = local107 + arg16;
			arg14 = local116 + arg17;
			if (arg14 == 0.0F) {
				local162 = 0;
				local169 = 0;
			} else {
				local162 = (int) (arg12 * 16384.0F / arg14);
				local169 = (int) (arg13 * 16384.0F / arg14);
			}
			local180 = (local127 << 18) + local134;
			local194 = (local162 - local127 >> 3 << 18) + (local169 - local134 >> 3);
			local43 >>= 0x3;
			local202 = arg11 << 3;
			local206 = arg10 >> 8;
			if (this.aBoolean248) {
				if (local43 > 0) {
					do {
						if (arg5 < this.anIntArray189[arg2]) {
							local231 = arg1[(local180 & 0x3F80) + (local180 >>> 25)];
							local221 = arg0[arg2];
							@Pc(2402) int local2402 = ((local231 & 0xFF00FF) * local206 & 0xFF00FF00) + ((local231 & 0xFF00) * local206 & 0xFF0000) >> 8;
							@Pc(2432) int local2432 = ((local221 & 0xFF00FF) * local76 + (local2402 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local221 & 0xFF00) * local76 + (local2402 & 0xFF00) * local81 & 0xFF0000) >> 8;
							arg0[arg2] = (((local2432 & 0xFF00FF) * local55 & 0xFF00FF00 | (local2432 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
						}
						local180 += local194;
						local306 = arg2 + 1;
						local310 = arg5 + arg6;
						if (local310 < this.anIntArray189[local306]) {
							local231 = arg1[(local180 & 0x3F80) + (local180 >>> 25)];
							local221 = arg0[local306];
							local231 = ((local231 & 0xFF00FF) * local206 & 0xFF00FF00) + ((local231 & 0xFF00) * local206 & 0xFF0000) >> 8;
							local231 = ((local221 & 0xFF00FF) * local76 + (local231 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local221 & 0xFF00) * local76 + (local231 & 0xFF00) * local81 & 0xFF0000) >> 8;
							arg0[local306] = (((local231 & 0xFF00FF) * local55 & 0xFF00FF00 | (local231 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
						}
						local180 += local194;
						local306++;
						local310 += arg6;
						if (local310 < this.anIntArray189[local306]) {
							local231 = arg1[(local180 & 0x3F80) + (local180 >>> 25)];
							local221 = arg0[local306];
							local231 = ((local231 & 0xFF00FF) * local206 & 0xFF00FF00) + ((local231 & 0xFF00) * local206 & 0xFF0000) >> 8;
							local231 = ((local221 & 0xFF00FF) * local76 + (local231 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local221 & 0xFF00) * local76 + (local231 & 0xFF00) * local81 & 0xFF0000) >> 8;
							arg0[local306] = (((local231 & 0xFF00FF) * local55 & 0xFF00FF00 | (local231 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
						}
						local180 += local194;
						local306++;
						local310 += arg6;
						if (local310 < this.anIntArray189[local306]) {
							local231 = arg1[(local180 & 0x3F80) + (local180 >>> 25)];
							local221 = arg0[local306];
							local231 = ((local231 & 0xFF00FF) * local206 & 0xFF00FF00) + ((local231 & 0xFF00) * local206 & 0xFF0000) >> 8;
							local231 = ((local221 & 0xFF00FF) * local76 + (local231 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local221 & 0xFF00) * local76 + (local231 & 0xFF00) * local81 & 0xFF0000) >> 8;
							arg0[local306] = (((local231 & 0xFF00FF) * local55 & 0xFF00FF00 | (local231 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
						}
						local180 += local194;
						local306++;
						local310 += arg6;
						if (local310 < this.anIntArray189[local306]) {
							local231 = arg1[(local180 & 0x3F80) + (local180 >>> 25)];
							local221 = arg0[local306];
							local231 = ((local231 & 0xFF00FF) * local206 & 0xFF00FF00) + ((local231 & 0xFF00) * local206 & 0xFF0000) >> 8;
							local231 = ((local221 & 0xFF00FF) * local76 + (local231 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local221 & 0xFF00) * local76 + (local231 & 0xFF00) * local81 & 0xFF0000) >> 8;
							arg0[local306] = (((local231 & 0xFF00FF) * local55 & 0xFF00FF00 | (local231 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
						}
						local180 += local194;
						local306++;
						local310 += arg6;
						if (local310 < this.anIntArray189[local306]) {
							local231 = arg1[(local180 & 0x3F80) + (local180 >>> 25)];
							local221 = arg0[local306];
							local231 = ((local231 & 0xFF00FF) * local206 & 0xFF00FF00) + ((local231 & 0xFF00) * local206 & 0xFF0000) >> 8;
							local231 = ((local221 & 0xFF00FF) * local76 + (local231 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local221 & 0xFF00) * local76 + (local231 & 0xFF00) * local81 & 0xFF0000) >> 8;
							arg0[local306] = (((local231 & 0xFF00FF) * local55 & 0xFF00FF00 | (local231 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
						}
						local180 += local194;
						local306++;
						local310 += arg6;
						if (local310 < this.anIntArray189[local306]) {
							local231 = arg1[(local180 & 0x3F80) + (local180 >>> 25)];
							local221 = arg0[local306];
							local231 = ((local231 & 0xFF00FF) * local206 & 0xFF00FF00) + ((local231 & 0xFF00) * local206 & 0xFF0000) >> 8;
							local231 = ((local221 & 0xFF00FF) * local76 + (local231 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local221 & 0xFF00) * local76 + (local231 & 0xFF00) * local81 & 0xFF0000) >> 8;
							arg0[local306] = (((local231 & 0xFF00FF) * local55 & 0xFF00FF00 | (local231 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
						}
						local180 += local194;
						local306++;
						local310 += arg6;
						if (local310 < this.anIntArray189[local306]) {
							local231 = arg1[(local180 & 0x3F80) + (local180 >>> 25)];
							local221 = arg0[local306];
							local231 = ((local231 & 0xFF00FF) * local206 & 0xFF00FF00) + ((local231 & 0xFF00) * local206 & 0xFF0000) >> 8;
							local231 = ((local221 & 0xFF00FF) * local76 + (local231 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local221 & 0xFF00) * local76 + (local231 & 0xFF00) * local81 & 0xFF0000) >> 8;
							arg0[local306] = (((local231 & 0xFF00FF) * local55 & 0xFF00FF00 | (local231 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
						}
						arg2 = local306 + 1;
						arg5 = local310 + arg6;
						local127 = local162;
						local134 = local169;
						arg12 += arg15;
						arg13 += arg16;
						arg14 += arg17;
						if (arg14 == 0.0F) {
							local162 = 0;
							local169 = 0;
						} else {
							local162 = (int) (arg12 * 16384.0F / arg14);
							local169 = (int) (arg13 * 16384.0F / arg14);
						}
						local180 = (local127 << 18) + local134;
						local194 = (local162 - local127 >> 3 << 18) + (local169 - local134 >> 3);
						arg10 += local202;
						local206 = arg10 >> 8;
						arg7 += local47;
						local51 = arg7 >> 16;
						local55 = 255 - local51;
						local73 = ((arg9 & 0xFF00FF) * local51 & 0xFF00FF00 | (arg9 & 0xFF00) * local51 & 0xFF0000) >>> 8;
						local43--;
					} while (local43 > 0);
				}
				local43 = arg4 - arg3 & 0x7;
				if (local43 > 0) {
					do {
						if (arg5 < this.anIntArray189[arg2]) {
							local231 = arg1[(local180 & 0x3F80) + (local180 >>> 25)];
							local221 = arg0[arg2];
							local231 = ((local231 & 0xFF00FF) * local206 & 0xFF00FF00) + ((local231 & 0xFF00) * local206 & 0xFF0000) >> 8;
							local231 = ((local221 & 0xFF00FF) * local76 + (local231 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local221 & 0xFF00) * local76 + (local231 & 0xFF00) * local81 & 0xFF0000) >> 8;
							arg0[arg2] = (((local231 & 0xFF00FF) * local55 & 0xFF00FF00 | (local231 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
						}
						local180 += local194;
						arg2++;
						arg5 += arg6;
						local43--;
					} while (local43 > 0);
					return;
				}
			} else {
				if (local43 > 0) {
					do {
						@Pc(3386) int local3386;
						if (arg5 < this.anIntArray189[arg2] && (local3386 = arg1[(local180 & 0x3F80) + (local180 >>> 25)]) != 0) {
							local221 = arg0[arg2];
							local231 = ((local3386 & 0xFF00FF) * local206 & 0xFF00FF00) + ((local3386 & 0xFF00) * local206 & 0xFF0000) >> 8;
							local231 = ((local221 & 0xFF00FF) * local76 + (local231 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local221 & 0xFF00) * local76 + (local231 & 0xFF00) * local81 & 0xFF0000) >> 8;
							arg0[arg2] = (((local231 & 0xFF00FF) * local55 & 0xFF00FF00 | (local231 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
						}
						local306 = arg2 + 1;
						local180 += local194;
						local310 = arg5 + arg6;
						@Pc(3487) int local3487;
						if (local310 < this.anIntArray189[local306] && (local3487 = arg1[(local180 & 0x3F80) + (local180 >>> 25)]) != 0) {
							local221 = arg0[local306];
							local231 = ((local3487 & 0xFF00FF) * local206 & 0xFF00FF00) + ((local3487 & 0xFF00) * local206 & 0xFF0000) >> 8;
							local231 = ((local221 & 0xFF00FF) * local76 + (local231 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local221 & 0xFF00) * local76 + (local231 & 0xFF00) * local81 & 0xFF0000) >> 8;
							arg0[local306] = (((local231 & 0xFF00FF) * local55 & 0xFF00FF00 | (local231 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
						}
						local306++;
						local180 += local194;
						local310 += arg6;
						@Pc(3588) int local3588;
						if (local310 < this.anIntArray189[local306] && (local3588 = arg1[(local180 & 0x3F80) + (local180 >>> 25)]) != 0) {
							local221 = arg0[local306];
							local231 = ((local3588 & 0xFF00FF) * local206 & 0xFF00FF00) + ((local3588 & 0xFF00) * local206 & 0xFF0000) >> 8;
							local231 = ((local221 & 0xFF00FF) * local76 + (local231 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local221 & 0xFF00) * local76 + (local231 & 0xFF00) * local81 & 0xFF0000) >> 8;
							arg0[local306] = (((local231 & 0xFF00FF) * local55 & 0xFF00FF00 | (local231 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
						}
						local306++;
						local180 += local194;
						local310 += arg6;
						@Pc(3689) int local3689;
						if (local310 < this.anIntArray189[local306] && (local3689 = arg1[(local180 & 0x3F80) + (local180 >>> 25)]) != 0) {
							local221 = arg0[local306];
							local231 = ((local3689 & 0xFF00FF) * local206 & 0xFF00FF00) + ((local3689 & 0xFF00) * local206 & 0xFF0000) >> 8;
							local231 = ((local221 & 0xFF00FF) * local76 + (local231 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local221 & 0xFF00) * local76 + (local231 & 0xFF00) * local81 & 0xFF0000) >> 8;
							arg0[local306] = (((local231 & 0xFF00FF) * local55 & 0xFF00FF00 | (local231 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
						}
						local306++;
						local180 += local194;
						local310 += arg6;
						@Pc(3790) int local3790;
						if (local310 < this.anIntArray189[local306] && (local3790 = arg1[(local180 & 0x3F80) + (local180 >>> 25)]) != 0) {
							local221 = arg0[local306];
							local231 = ((local3790 & 0xFF00FF) * local206 & 0xFF00FF00) + ((local3790 & 0xFF00) * local206 & 0xFF0000) >> 8;
							local231 = ((local221 & 0xFF00FF) * local76 + (local231 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local221 & 0xFF00) * local76 + (local231 & 0xFF00) * local81 & 0xFF0000) >> 8;
							arg0[local306] = (((local231 & 0xFF00FF) * local55 & 0xFF00FF00 | (local231 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
						}
						local306++;
						local180 += local194;
						local310 += arg6;
						@Pc(3891) int local3891;
						if (local310 < this.anIntArray189[local306] && (local3891 = arg1[(local180 & 0x3F80) + (local180 >>> 25)]) != 0) {
							local221 = arg0[local306];
							local231 = ((local3891 & 0xFF00FF) * local206 & 0xFF00FF00) + ((local3891 & 0xFF00) * local206 & 0xFF0000) >> 8;
							local231 = ((local221 & 0xFF00FF) * local76 + (local231 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local221 & 0xFF00) * local76 + (local231 & 0xFF00) * local81 & 0xFF0000) >> 8;
							arg0[local306] = (((local231 & 0xFF00FF) * local55 & 0xFF00FF00 | (local231 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
						}
						local306++;
						local180 += local194;
						local310 += arg6;
						@Pc(3992) int local3992;
						if (local310 < this.anIntArray189[local306] && (local3992 = arg1[(local180 & 0x3F80) + (local180 >>> 25)]) != 0) {
							local221 = arg0[local306];
							local231 = ((local3992 & 0xFF00FF) * local206 & 0xFF00FF00) + ((local3992 & 0xFF00) * local206 & 0xFF0000) >> 8;
							local231 = ((local221 & 0xFF00FF) * local76 + (local231 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local221 & 0xFF00) * local76 + (local231 & 0xFF00) * local81 & 0xFF0000) >> 8;
							arg0[local306] = (((local231 & 0xFF00FF) * local55 & 0xFF00FF00 | (local231 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
						}
						local306++;
						local180 += local194;
						local310 += arg6;
						@Pc(4093) int local4093;
						if (local310 < this.anIntArray189[local306] && (local4093 = arg1[(local180 & 0x3F80) + (local180 >>> 25)]) != 0) {
							local221 = arg0[local306];
							local231 = ((local4093 & 0xFF00FF) * local206 & 0xFF00FF00) + ((local4093 & 0xFF00) * local206 & 0xFF0000) >> 8;
							local231 = ((local221 & 0xFF00FF) * local76 + (local231 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local221 & 0xFF00) * local76 + (local231 & 0xFF00) * local81 & 0xFF0000) >> 8;
							arg0[local306] = (((local231 & 0xFF00FF) * local55 & 0xFF00FF00 | (local231 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
						}
						arg2 = local306 + 1;
						arg5 = local310 + arg6;
						local127 = local162;
						local134 = local169;
						arg12 += arg15;
						arg13 += arg16;
						arg14 += arg17;
						if (arg14 == 0.0F) {
							local162 = 0;
							local169 = 0;
						} else {
							local162 = (int) (arg12 * 16384.0F / arg14);
							local169 = (int) (arg13 * 16384.0F / arg14);
						}
						local180 = (local127 << 18) + local134;
						local194 = (local162 - local127 >> 3 << 18) + (local169 - local134 >> 3);
						arg10 += local202;
						local206 = arg10 >> 8;
						arg7 += local47;
						local51 = arg7 >> 16;
						local55 = 255 - local51;
						local73 = ((arg9 & 0xFF00FF) * local51 & 0xFF00FF00 | (arg9 & 0xFF00) * local51 & 0xFF0000) >>> 8;
						local43--;
					} while (local43 > 0);
				}
				local43 = arg4 - arg3 & 0x7;
				if (local43 > 0) {
					do {
						@Pc(4302) int local4302;
						if (arg5 < this.anIntArray189[arg2] && (local4302 = arg1[(local180 & 0x3F80) + (local180 >>> 25)]) != 0) {
							local221 = arg0[arg2];
							local231 = ((local4302 & 0xFF00FF) * local206 & 0xFF00FF00) + ((local4302 & 0xFF00) * local206 & 0xFF0000) >> 8;
							local231 = ((local221 & 0xFF00FF) * local76 + (local231 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local221 & 0xFF00) * local76 + (local231 & 0xFF00) * local81 & 0xFF0000) >> 8;
							arg0[arg2] = (((local231 & 0xFF00FF) * local55 & 0xFF00FF00 | (local231 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
						}
						arg2++;
						local180 += local194;
						arg5 += arg6;
						local43--;
					} while (local43 > 0);
				}
			}
			return;
		}
		local89 = arg3 - this.anInt3215;
		local98 = arg12 + arg15 / 8.0F * (float) local89;
		local107 = arg13 + arg16 / 8.0F * (float) local89;
		local116 = arg14 + arg17 / 8.0F * (float) local89;
		if (local116 == 0.0F) {
			local127 = 0;
			local134 = 0;
		} else {
			local127 = (int) (local98 * 4096.0F / local116);
			local134 = (int) (local107 * 4096.0F / local116);
		}
		arg12 = local98 + arg15;
		arg13 = local107 + arg16;
		arg14 = local116 + arg17;
		if (arg14 == 0.0F) {
			local162 = 0;
			local169 = 0;
		} else {
			local162 = (int) (arg12 * 4096.0F / arg14);
			local169 = (int) (arg13 * 4096.0F / arg14);
		}
		local180 = (local127 << 20) + local134;
		local194 = (local162 - local127 >> 3 << 20) + (local169 - local134 >> 3);
		local43 >>= 0x3;
		local202 = arg11 << 3;
		local206 = arg10 >> 8;
		if (this.aBoolean248) {
			if (local43 > 0) {
				do {
					if (arg5 < this.anIntArray189[arg2]) {
						local221 = arg0[arg2];
						local231 = arg1[(local180 & 0xFC0) + (local180 >>> 26)];
						local231 = ((local231 & 0xFF00FF) * local206 & 0xFF00FF00) + ((local231 & 0xFF00) * local206 & 0xFF0000) >> 8;
						local231 = ((local221 & 0xFF00FF) * local76 + (local231 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local221 & 0xFF00) * local76 + (local231 & 0xFF00) * local81 & 0xFF0000) >> 8;
						arg0[arg2] = (((local231 & 0xFF00FF) * local55 & 0xFF00FF00 | (local231 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
					}
					local180 += local194;
					local306 = arg2 + 1;
					local310 = arg5 + arg6;
					if (local310 < this.anIntArray189[local306]) {
						local221 = arg0[local306];
						local231 = arg1[(local180 & 0xFC0) + (local180 >>> 26)];
						local231 = ((local231 & 0xFF00FF) * local206 & 0xFF00FF00) + ((local231 & 0xFF00) * local206 & 0xFF0000) >> 8;
						local231 = ((local221 & 0xFF00FF) * local76 + (local231 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local221 & 0xFF00) * local76 + (local231 & 0xFF00) * local81 & 0xFF0000) >> 8;
						arg0[local306] = (((local231 & 0xFF00FF) * local55 & 0xFF00FF00 | (local231 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
					}
					local180 += local194;
					local306++;
					local310 += arg6;
					if (local310 < this.anIntArray189[local306]) {
						local221 = arg0[local306];
						local231 = arg1[(local180 & 0xFC0) + (local180 >>> 26)];
						local231 = ((local231 & 0xFF00FF) * local206 & 0xFF00FF00) + ((local231 & 0xFF00) * local206 & 0xFF0000) >> 8;
						local231 = ((local221 & 0xFF00FF) * local76 + (local231 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local221 & 0xFF00) * local76 + (local231 & 0xFF00) * local81 & 0xFF0000) >> 8;
						arg0[local306] = (((local231 & 0xFF00FF) * local55 & 0xFF00FF00 | (local231 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
					}
					local180 += local194;
					local306++;
					local310 += arg6;
					if (local310 < this.anIntArray189[local306]) {
						local221 = arg0[local306];
						local231 = arg1[(local180 & 0xFC0) + (local180 >>> 26)];
						local231 = ((local231 & 0xFF00FF) * local206 & 0xFF00FF00) + ((local231 & 0xFF00) * local206 & 0xFF0000) >> 8;
						local231 = ((local221 & 0xFF00FF) * local76 + (local231 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local221 & 0xFF00) * local76 + (local231 & 0xFF00) * local81 & 0xFF0000) >> 8;
						arg0[local306] = (((local231 & 0xFF00FF) * local55 & 0xFF00FF00 | (local231 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
					}
					local180 += local194;
					local306++;
					local310 += arg6;
					if (local310 < this.anIntArray189[local306]) {
						local221 = arg0[local306];
						local231 = arg1[(local180 & 0xFC0) + (local180 >>> 26)];
						local231 = ((local231 & 0xFF00FF) * local206 & 0xFF00FF00) + ((local231 & 0xFF00) * local206 & 0xFF0000) >> 8;
						local231 = ((local221 & 0xFF00FF) * local76 + (local231 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local221 & 0xFF00) * local76 + (local231 & 0xFF00) * local81 & 0xFF0000) >> 8;
						arg0[local306] = (((local231 & 0xFF00FF) * local55 & 0xFF00FF00 | (local231 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
					}
					local180 += local194;
					local306++;
					local310 += arg6;
					if (local310 < this.anIntArray189[local306]) {
						local221 = arg0[local306];
						local231 = arg1[(local180 & 0xFC0) + (local180 >>> 26)];
						local231 = ((local231 & 0xFF00FF) * local206 & 0xFF00FF00) + ((local231 & 0xFF00) * local206 & 0xFF0000) >> 8;
						local231 = ((local221 & 0xFF00FF) * local76 + (local231 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local221 & 0xFF00) * local76 + (local231 & 0xFF00) * local81 & 0xFF0000) >> 8;
						arg0[local306] = (((local231 & 0xFF00FF) * local55 & 0xFF00FF00 | (local231 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
					}
					local180 += local194;
					local306++;
					local310 += arg6;
					if (local310 < this.anIntArray189[local306]) {
						local221 = arg0[local306];
						local231 = arg1[(local180 & 0xFC0) + (local180 >>> 26)];
						local231 = ((local231 & 0xFF00FF) * local206 & 0xFF00FF00) + ((local231 & 0xFF00) * local206 & 0xFF0000) >> 8;
						local231 = ((local221 & 0xFF00FF) * local76 + (local231 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local221 & 0xFF00) * local76 + (local231 & 0xFF00) * local81 & 0xFF0000) >> 8;
						arg0[local306] = (((local231 & 0xFF00FF) * local55 & 0xFF00FF00 | (local231 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
					}
					local180 += local194;
					local306++;
					local310 += arg6;
					if (local310 < this.anIntArray189[local306]) {
						local221 = arg0[local306];
						local231 = arg1[(local180 & 0xFC0) + (local180 >>> 26)];
						local231 = ((local231 & 0xFF00FF) * local206 & 0xFF00FF00) + ((local231 & 0xFF00) * local206 & 0xFF0000) >> 8;
						local231 = ((local221 & 0xFF00FF) * local76 + (local231 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local221 & 0xFF00) * local76 + (local231 & 0xFF00) * local81 & 0xFF0000) >> 8;
						arg0[local306] = (((local231 & 0xFF00FF) * local55 & 0xFF00FF00 | (local231 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
					}
					arg2 = local306 + 1;
					arg5 = local310 + arg6;
					local127 = local162;
					local134 = local169;
					arg12 += arg15;
					arg13 += arg16;
					arg14 += arg17;
					if (arg14 == 0.0F) {
						local162 = 0;
						local169 = 0;
					} else {
						local162 = (int) (arg12 * 4096.0F / arg14);
						local169 = (int) (arg13 * 4096.0F / arg14);
					}
					local180 = (local127 << 20) + local134;
					local194 = (local162 - local127 >> 3 << 20) + (local169 - local134 >> 3);
					arg10 += local202;
					local206 = arg10 >> 8;
					arg7 += local47;
					local51 = arg7 >> 16;
					local55 = 255 - local51;
					local73 = ((arg9 & 0xFF00FF) * local51 & 0xFF00FF00 | (arg9 & 0xFF00) * local51 & 0xFF0000) >>> 8;
					local43--;
				} while (local43 > 0);
			}
			local43 = arg4 - arg3 & 0x7;
			if (local43 > 0) {
				do {
					if (arg5 < this.anIntArray189[arg2]) {
						local221 = arg0[arg2];
						local231 = arg1[(local180 & 0xFC0) + (local180 >>> 26)];
						local231 = ((local231 & 0xFF00FF) * local206 & 0xFF00FF00) + ((local231 & 0xFF00) * local206 & 0xFF0000) >> 8;
						local231 = ((local221 & 0xFF00FF) * local76 + (local231 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local221 & 0xFF00) * local76 + (local231 & 0xFF00) * local81 & 0xFF0000) >> 8;
						arg0[arg2] = (((local231 & 0xFF00FF) * local55 & 0xFF00FF00 | (local231 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
					}
					local180 += local194;
					arg2++;
					arg5 += arg6;
					local43--;
				} while (local43 > 0);
				return;
			}
		} else {
			if (local43 > 0) {
				do {
					@Pc(1233) int local1233;
					if (arg5 < this.anIntArray189[arg2] && (local1233 = arg1[(local180 & 0xFC0) + (local180 >>> 26)]) != 0) {
						local221 = arg0[arg2];
						local231 = ((local1233 & 0xFF00FF) * local206 & 0xFF00FF00) + ((local1233 & 0xFF00) * local206 & 0xFF0000) >> 8;
						local231 = ((local221 & 0xFF00FF) * local76 + (local231 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local221 & 0xFF00) * local76 + (local231 & 0xFF00) * local81 & 0xFF0000) >> 8;
						arg0[arg2] = (((local231 & 0xFF00FF) * local55 & 0xFF00FF00 | (local231 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
					}
					local306 = arg2 + 1;
					local180 += local194;
					local310 = arg5 + arg6;
					@Pc(1334) int local1334;
					if (local310 < this.anIntArray189[local306] && (local1334 = arg1[(local180 & 0xFC0) + (local180 >>> 26)]) != 0) {
						local221 = arg0[local306];
						local231 = ((local1334 & 0xFF00FF) * local206 & 0xFF00FF00) + ((local1334 & 0xFF00) * local206 & 0xFF0000) >> 8;
						local231 = ((local221 & 0xFF00FF) * local76 + (local231 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local221 & 0xFF00) * local76 + (local231 & 0xFF00) * local81 & 0xFF0000) >> 8;
						arg0[local306] = (((local231 & 0xFF00FF) * local55 & 0xFF00FF00 | (local231 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
					}
					local306++;
					local180 += local194;
					local310 += arg6;
					@Pc(1435) int local1435;
					if (local310 < this.anIntArray189[local306] && (local1435 = arg1[(local180 & 0xFC0) + (local180 >>> 26)]) != 0) {
						local221 = arg0[local306];
						local231 = ((local1435 & 0xFF00FF) * local206 & 0xFF00FF00) + ((local1435 & 0xFF00) * local206 & 0xFF0000) >> 8;
						local231 = ((local221 & 0xFF00FF) * local76 + (local231 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local221 & 0xFF00) * local76 + (local231 & 0xFF00) * local81 & 0xFF0000) >> 8;
						arg0[local306] = (((local231 & 0xFF00FF) * local55 & 0xFF00FF00 | (local231 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
					}
					local306++;
					local180 += local194;
					local310 += arg6;
					@Pc(1536) int local1536;
					if (local310 < this.anIntArray189[local306] && (local1536 = arg1[(local180 & 0xFC0) + (local180 >>> 26)]) != 0) {
						local221 = arg0[local306];
						local231 = ((local1536 & 0xFF00FF) * local206 & 0xFF00FF00) + ((local1536 & 0xFF00) * local206 & 0xFF0000) >> 8;
						local231 = ((local221 & 0xFF00FF) * local76 + (local231 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local221 & 0xFF00) * local76 + (local231 & 0xFF00) * local81 & 0xFF0000) >> 8;
						arg0[local306] = (((local231 & 0xFF00FF) * local55 & 0xFF00FF00 | (local231 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
					}
					local306++;
					local180 += local194;
					local310 += arg6;
					@Pc(1637) int local1637;
					if (local310 < this.anIntArray189[local306] && (local1637 = arg1[(local180 & 0xFC0) + (local180 >>> 26)]) != 0) {
						local221 = arg0[local306];
						local231 = ((local1637 & 0xFF00FF) * local206 & 0xFF00FF00) + ((local1637 & 0xFF00) * local206 & 0xFF0000) >> 8;
						local231 = ((local221 & 0xFF00FF) * local76 + (local231 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local221 & 0xFF00) * local76 + (local231 & 0xFF00) * local81 & 0xFF0000) >> 8;
						arg0[local306] = (((local231 & 0xFF00FF) * local55 & 0xFF00FF00 | (local231 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
					}
					local306++;
					local180 += local194;
					local310 += arg6;
					@Pc(1738) int local1738;
					if (local310 < this.anIntArray189[local306] && (local1738 = arg1[(local180 & 0xFC0) + (local180 >>> 26)]) != 0) {
						local221 = arg0[local306];
						local231 = ((local1738 & 0xFF00FF) * local206 & 0xFF00FF00) + ((local1738 & 0xFF00) * local206 & 0xFF0000) >> 8;
						local231 = ((local221 & 0xFF00FF) * local76 + (local231 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local221 & 0xFF00) * local76 + (local231 & 0xFF00) * local81 & 0xFF0000) >> 8;
						arg0[local306] = (((local231 & 0xFF00FF) * local55 & 0xFF00FF00 | (local231 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
					}
					local306++;
					local180 += local194;
					local310 += arg6;
					@Pc(1839) int local1839;
					if (local310 < this.anIntArray189[local306] && (local1839 = arg1[(local180 & 0xFC0) + (local180 >>> 26)]) != 0) {
						local221 = arg0[local306];
						local231 = ((local1839 & 0xFF00FF) * local206 & 0xFF00FF00) + ((local1839 & 0xFF00) * local206 & 0xFF0000) >> 8;
						local231 = ((local221 & 0xFF00FF) * local76 + (local231 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local221 & 0xFF00) * local76 + (local231 & 0xFF00) * local81 & 0xFF0000) >> 8;
						arg0[local306] = (((local231 & 0xFF00FF) * local55 & 0xFF00FF00 | (local231 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
					}
					local306++;
					local180 += local194;
					local310 += arg6;
					@Pc(1940) int local1940;
					if (local310 < this.anIntArray189[local306] && (local1940 = arg1[(local180 & 0xFC0) + (local180 >>> 26)]) != 0) {
						local221 = arg0[local306];
						local231 = ((local1940 & 0xFF00FF) * local206 & 0xFF00FF00) + ((local1940 & 0xFF00) * local206 & 0xFF0000) >> 8;
						local231 = ((local221 & 0xFF00FF) * local76 + (local231 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local221 & 0xFF00) * local76 + (local231 & 0xFF00) * local81 & 0xFF0000) >> 8;
						arg0[local306] = (((local231 & 0xFF00FF) * local55 & 0xFF00FF00 | (local231 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
					}
					arg2 = local306 + 1;
					arg5 = local310 + arg6;
					local127 = local162;
					local134 = local169;
					arg12 += arg15;
					arg13 += arg16;
					arg14 += arg17;
					if (arg14 == 0.0F) {
						local162 = 0;
						local169 = 0;
					} else {
						local162 = (int) (arg12 * 4096.0F / arg14);
						local169 = (int) (arg13 * 4096.0F / arg14);
					}
					local180 = (local127 << 20) + local134;
					local194 = (local162 - local127 >> 3 << 20) + (local169 - local134 >> 3);
					arg10 += local202;
					local206 = arg10 >> 8;
					arg7 += local47;
					local51 = arg7 >> 16;
					local55 = 255 - local51;
					local73 = ((arg9 & 0xFF00FF) * local51 & 0xFF00FF00 | (arg9 & 0xFF00) * local51 & 0xFF0000) >>> 8;
					local43--;
				} while (local43 > 0);
			}
			local43 = arg4 - arg3 & 0x7;
			if (local43 <= 0) {
				return;
			}
			do {
				@Pc(2149) int local2149;
				if (arg5 < this.anIntArray189[arg2] && (local2149 = arg1[(local180 & 0xFC0) + (local180 >>> 26)]) != 0) {
					local221 = arg0[arg2];
					local231 = ((local2149 & 0xFF00FF) * local206 & 0xFF00FF00) + ((local2149 & 0xFF00) * local206 & 0xFF0000) >> 8;
					local231 = ((local221 & 0xFF00FF) * local76 + (local231 & 0xFF00FF) * local81 & 0xFF00FF00) + ((local221 & 0xFF00) * local76 + (local231 & 0xFF00) * local81 & 0xFF0000) >> 8;
					arg0[arg2] = (((local231 & 0xFF00FF) * local55 & 0xFF00FF00 | (local231 & 0xFF00) * local55 & 0xFF0000) >>> 8) + local73;
				}
				arg2++;
				local180 += local194;
				arg5 += arg6;
				local43--;
			} while (local43 > 0);
		}
		return;
	}

	@OriginalMember(owner = "client!gw", name = "e", descriptor = "([I[I[IIIIIIIIIIFFFFFF)V")
	private void method2739(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int arg8, @OriginalArg(11) int arg9, @OriginalArg(12) float arg10, @OriginalArg(13) float arg11, @OriginalArg(14) float arg12, @OriginalArg(15) float arg13, @OriginalArg(16) float arg14, @OriginalArg(17) float arg15) {
		@Pc(3) int local3 = arg5 - arg4;
		@Pc(128) int local128;
		@Pc(116) int local116;
		@Pc(49) int local49;
		@Pc(56) int local56;
		@Pc(84) int local84;
		@Pc(91) int local91;
		@Pc(11) int local11;
		@Pc(102) int local102;
		@Pc(124) int local124;
		@Pc(20) float local20;
		@Pc(29) float local29;
		@Pc(38) float local38;
		@Pc(148) int local148;
		if (!this.aBoolean253) {
			local11 = arg4 - this.anInt3215;
			local20 = arg10 + arg13 / 8.0F * (float) local11;
			local29 = arg11 + arg14 / 8.0F * (float) local11;
			local38 = arg12 + arg15 / 8.0F * (float) local11;
			if (local38 == 0.0F) {
				local49 = 0;
				local56 = 0;
			} else {
				local49 = (int) (local20 * 16384.0F / local38);
				local56 = (int) (local29 * 16384.0F / local38);
			}
			arg10 = local20 + arg13;
			arg11 = local29 + arg14;
			arg12 = local38 + arg15;
			if (arg12 == 0.0F) {
				local84 = 0;
				local91 = 0;
			} else {
				local84 = (int) (arg10 * 16384.0F / arg12);
				local91 = (int) (arg11 * 16384.0F / arg12);
			}
			local102 = (local49 << 18) + local56;
			local116 = (local84 - local49 >> 3 << 18) + (local91 - local56 >> 3);
			local3 >>= 0x3;
			local124 = arg9 << 3;
			local128 = arg8 >> 8;
			if (this.aBoolean248) {
				if (local3 > 0) {
					do {
						if (arg6 < arg1[arg3]) {
							local148 = arg2[(local102 & 0x3F80) + (local102 >>> 25)];
							arg0[arg3] = ((local148 & 0xFF00FF) * local128 & 0xFF00FF00) + ((local148 & 0xFF00) * local128 & 0xFF0000) >> 8;
						}
						arg6 += arg7;
						local102 += local116;
						arg3++;
						if (arg6 < arg1[arg3]) {
							local148 = arg2[(local102 & 0x3F80) + (local102 >>> 25)];
							arg0[arg3] = ((local148 & 0xFF00FF) * local128 & 0xFF00FF00) + ((local148 & 0xFF00) * local128 & 0xFF0000) >> 8;
						}
						arg6 += arg7;
						local102 += local116;
						arg3++;
						if (arg6 < arg1[arg3]) {
							local148 = arg2[(local102 & 0x3F80) + (local102 >>> 25)];
							arg0[arg3] = ((local148 & 0xFF00FF) * local128 & 0xFF00FF00) + ((local148 & 0xFF00) * local128 & 0xFF0000) >> 8;
						}
						arg6 += arg7;
						local102 += local116;
						arg3++;
						if (arg6 < arg1[arg3]) {
							local148 = arg2[(local102 & 0x3F80) + (local102 >>> 25)];
							arg0[arg3] = ((local148 & 0xFF00FF) * local128 & 0xFF00FF00) + ((local148 & 0xFF00) * local128 & 0xFF0000) >> 8;
						}
						arg6 += arg7;
						local102 += local116;
						arg3++;
						if (arg6 < arg1[arg3]) {
							local148 = arg2[(local102 & 0x3F80) + (local102 >>> 25)];
							arg0[arg3] = ((local148 & 0xFF00FF) * local128 & 0xFF00FF00) + ((local148 & 0xFF00) * local128 & 0xFF0000) >> 8;
						}
						arg6 += arg7;
						local102 += local116;
						arg3++;
						if (arg6 < arg1[arg3]) {
							local148 = arg2[(local102 & 0x3F80) + (local102 >>> 25)];
							arg0[arg3] = ((local148 & 0xFF00FF) * local128 & 0xFF00FF00) + ((local148 & 0xFF00) * local128 & 0xFF0000) >> 8;
						}
						arg6 += arg7;
						local102 += local116;
						arg3++;
						if (arg6 < arg1[arg3]) {
							local148 = arg2[(local102 & 0x3F80) + (local102 >>> 25)];
							arg0[arg3] = ((local148 & 0xFF00FF) * local128 & 0xFF00FF00) + ((local148 & 0xFF00) * local128 & 0xFF0000) >> 8;
						}
						arg6 += arg7;
						local102 += local116;
						arg3++;
						if (arg6 < arg1[arg3]) {
							local148 = arg2[(local102 & 0x3F80) + (local102 >>> 25)];
							arg0[arg3] = ((local148 & 0xFF00FF) * local128 & 0xFF00FF00) + ((local148 & 0xFF00) * local128 & 0xFF0000) >> 8;
						}
						arg6 += arg7;
						arg3++;
						local49 = local84;
						local56 = local91;
						arg10 += arg13;
						arg11 += arg14;
						arg12 += arg15;
						if (arg12 == 0.0F) {
							local84 = 0;
							local91 = 0;
						} else {
							local84 = (int) (arg10 * 16384.0F / arg12);
							local91 = (int) (arg11 * 16384.0F / arg12);
						}
						local102 = (local49 << 18) + local56;
						local116 = (local84 - local49 >> 3 << 18) + (local91 - local56 >> 3);
						arg8 += local124;
						local128 = arg8 >> 8;
						local3--;
					} while (local3 > 0);
				}
				local3 = arg5 - arg4 & 0x7;
				if (local3 > 0) {
					do {
						if (arg6 < arg1[arg3]) {
							local148 = arg2[(local102 & 0x3F80) + (local102 >>> 25)];
							arg0[arg3] = ((local148 & 0xFF00FF) * local128 & 0xFF00FF00) + ((local148 & 0xFF00) * local128 & 0xFF0000) >> 8;
						}
						arg6 += arg7;
						local102 += local116;
						arg3++;
						local3--;
					} while (local3 > 0);
					return;
				}
			} else {
				if (local3 > 0) {
					do {
						@Pc(1732) int local1732;
						if (arg6 < arg1[arg3] && (local1732 = arg2[(local102 & 0x3F80) + (local102 >>> 25)]) != 0) {
							arg0[arg3] = ((local1732 & 0xFF00FF) * local128 & 0xFF00FF00) + ((local1732 & 0xFF00) * local128 & 0xFF0000) >> 8;
						}
						arg6 += arg7;
						local102 += local116;
						arg3++;
						@Pc(1778) int local1778;
						if (arg6 < arg1[arg3] && (local1778 = arg2[(local102 & 0x3F80) + (local102 >>> 25)]) != 0) {
							arg0[arg3] = ((local1778 & 0xFF00FF) * local128 & 0xFF00FF00) + ((local1778 & 0xFF00) * local128 & 0xFF0000) >> 8;
						}
						arg6 += arg7;
						local102 += local116;
						arg3++;
						@Pc(1824) int local1824;
						if (arg6 < arg1[arg3] && (local1824 = arg2[(local102 & 0x3F80) + (local102 >>> 25)]) != 0) {
							arg0[arg3] = ((local1824 & 0xFF00FF) * local128 & 0xFF00FF00) + ((local1824 & 0xFF00) * local128 & 0xFF0000) >> 8;
						}
						arg6 += arg7;
						local102 += local116;
						arg3++;
						@Pc(1870) int local1870;
						if (arg6 < arg1[arg3] && (local1870 = arg2[(local102 & 0x3F80) + (local102 >>> 25)]) != 0) {
							arg0[arg3] = ((local1870 & 0xFF00FF) * local128 & 0xFF00FF00) + ((local1870 & 0xFF00) * local128 & 0xFF0000) >> 8;
						}
						arg6 += arg7;
						local102 += local116;
						arg3++;
						@Pc(1916) int local1916;
						if (arg6 < arg1[arg3] && (local1916 = arg2[(local102 & 0x3F80) + (local102 >>> 25)]) != 0) {
							arg0[arg3] = ((local1916 & 0xFF00FF) * local128 & 0xFF00FF00) + ((local1916 & 0xFF00) * local128 & 0xFF0000) >> 8;
						}
						arg6 += arg7;
						local102 += local116;
						arg3++;
						@Pc(1962) int local1962;
						if (arg6 < arg1[arg3] && (local1962 = arg2[(local102 & 0x3F80) + (local102 >>> 25)]) != 0) {
							arg0[arg3] = ((local1962 & 0xFF00FF) * local128 & 0xFF00FF00) + ((local1962 & 0xFF00) * local128 & 0xFF0000) >> 8;
						}
						arg6 += arg7;
						local102 += local116;
						arg3++;
						@Pc(2008) int local2008;
						if (arg6 < arg1[arg3] && (local2008 = arg2[(local102 & 0x3F80) + (local102 >>> 25)]) != 0) {
							arg0[arg3] = ((local2008 & 0xFF00FF) * local128 & 0xFF00FF00) + ((local2008 & 0xFF00) * local128 & 0xFF0000) >> 8;
						}
						arg6 += arg7;
						local102 += local116;
						arg3++;
						@Pc(2054) int local2054;
						if (arg6 < arg1[arg3] && (local2054 = arg2[(local102 & 0x3F80) + (local102 >>> 25)]) != 0) {
							arg0[arg3] = ((local2054 & 0xFF00FF) * local128 & 0xFF00FF00) + ((local2054 & 0xFF00) * local128 & 0xFF0000) >> 8;
						}
						arg6 += arg7;
						arg3++;
						local49 = local84;
						local56 = local91;
						arg10 += arg13;
						arg11 += arg14;
						arg12 += arg15;
						if (arg12 == 0.0F) {
							local84 = 0;
							local91 = 0;
						} else {
							local84 = (int) (arg10 / arg12 * 16384.0F);
							local91 = (int) (arg11 / arg12 * 16384.0F);
						}
						local102 = (local49 << 18) + local56;
						local116 = (local84 - local49 >> 3 << 18) + (local91 - local56 >> 3);
						arg8 += local124;
						local128 = arg8 >> 8;
						local3--;
					} while (local3 > 0);
				}
				local3 = arg5 - arg4 & 0x7;
				if (local3 > 0) {
					do {
						@Pc(2178) int local2178;
						if (arg6 < arg1[arg3] && (local2178 = arg2[(local102 & 0x3F80) + (local102 >>> 25)]) != 0) {
							arg0[arg3] = ((local2178 & 0xFF00FF) * local128 & 0xFF00FF00) + ((local2178 & 0xFF00) * local128 & 0xFF0000) >> 8;
						}
						arg6 += arg7;
						local102 += local116;
						arg3++;
						local3--;
					} while (local3 > 0);
				}
			}
			return;
		}
		local11 = arg4 - this.anInt3215;
		local20 = arg10 + arg13 / 8.0F * (float) local11;
		local29 = arg11 + arg14 / 8.0F * (float) local11;
		local38 = arg12 + arg15 / 8.0F * (float) local11;
		if (local38 == 0.0F) {
			local49 = 0;
			local56 = 0;
		} else {
			local49 = (int) (local20 * 4096.0F / local38);
			local56 = (int) (local29 * 4096.0F / local38);
		}
		arg10 = local20 + arg13;
		arg11 = local29 + arg14;
		arg12 = local38 + arg15;
		if (arg12 == 0.0F) {
			local84 = 0;
			local91 = 0;
		} else {
			local84 = (int) (arg10 * 4096.0F / arg12);
			local91 = (int) (arg11 * 4096.0F / arg12);
		}
		local102 = (local49 << 20) + local56;
		local116 = (local84 - local49 >> 3 << 20) + (local91 - local56 >> 3);
		local3 >>= 0x3;
		local124 = arg9 << 3;
		local128 = arg8 >> 8;
		if (this.aBoolean248) {
			if (local3 > 0) {
				do {
					if (arg6 < arg1[arg3]) {
						local148 = arg2[(local102 & 0xFC0) + (local102 >>> 26)];
						arg0[arg3] = ((local148 & 0xFF00FF) * local128 & 0xFF00FF00) + ((local148 & 0xFF00) * local128 & 0xFF0000) >> 8;
					}
					arg6 += arg7;
					local102 += local116;
					arg3++;
					if (arg6 < arg1[arg3]) {
						local148 = arg2[(local102 & 0xFC0) + (local102 >>> 26)];
						arg0[arg3] = ((local148 & 0xFF00FF) * local128 & 0xFF00FF00) + ((local148 & 0xFF00) * local128 & 0xFF0000) >> 8;
					}
					arg6 += arg7;
					local102 += local116;
					arg3++;
					if (arg6 < arg1[arg3]) {
						local148 = arg2[(local102 & 0xFC0) + (local102 >>> 26)];
						arg0[arg3] = ((local148 & 0xFF00FF) * local128 & 0xFF00FF00) + ((local148 & 0xFF00) * local128 & 0xFF0000) >> 8;
					}
					arg6 += arg7;
					local102 += local116;
					arg3++;
					if (arg6 < arg1[arg3]) {
						local148 = arg2[(local102 & 0xFC0) + (local102 >>> 26)];
						arg0[arg3] = ((local148 & 0xFF00FF) * local128 & 0xFF00FF00) + ((local148 & 0xFF00) * local128 & 0xFF0000) >> 8;
					}
					arg6 += arg7;
					local102 += local116;
					arg3++;
					if (arg6 < arg1[arg3]) {
						local148 = arg2[(local102 & 0xFC0) + (local102 >>> 26)];
						arg0[arg3] = ((local148 & 0xFF00FF) * local128 & 0xFF00FF00) + ((local148 & 0xFF00) * local128 & 0xFF0000) >> 8;
					}
					arg6 += arg7;
					local102 += local116;
					arg3++;
					if (arg6 < arg1[arg3]) {
						local148 = arg2[(local102 & 0xFC0) + (local102 >>> 26)];
						arg0[arg3] = ((local148 & 0xFF00FF) * local128 & 0xFF00FF00) + ((local148 & 0xFF00) * local128 & 0xFF0000) >> 8;
					}
					arg6 += arg7;
					local102 += local116;
					arg3++;
					if (arg6 < arg1[arg3]) {
						local148 = arg2[(local102 & 0xFC0) + (local102 >>> 26)];
						arg0[arg3] = ((local148 & 0xFF00FF) * local128 & 0xFF00FF00) + ((local148 & 0xFF00) * local128 & 0xFF0000) >> 8;
					}
					arg6 += arg7;
					local102 += local116;
					arg3++;
					if (arg6 < arg1[arg3]) {
						local148 = arg2[(local102 & 0xFC0) + (local102 >>> 26)];
						arg0[arg3] = ((local148 & 0xFF00FF) * local128 & 0xFF00FF00) + ((local148 & 0xFF00) * local128 & 0xFF0000) >> 8;
					}
					arg6 += arg7;
					arg3++;
					local49 = local84;
					local56 = local91;
					arg10 += arg13;
					arg11 += arg14;
					arg12 += arg15;
					if (arg12 == 0.0F) {
						local84 = 0;
						local91 = 0;
					} else {
						local84 = (int) (arg10 * 4096.0F / arg12);
						local91 = (int) (arg11 * 4096.0F / arg12);
					}
					local102 = (local49 << 20) + local56;
					local116 = (local84 - local49 >> 3 << 20) + (local91 - local56 >> 3);
					arg8 += local124;
					local128 = arg8 >> 8;
					local3--;
				} while (local3 > 0);
			}
			local3 = arg5 - arg4 & 0x7;
			if (local3 > 0) {
				do {
					if (arg6 < arg1[arg3]) {
						local148 = arg2[(local102 & 0xFC0) + (local102 >>> 26)];
						arg0[arg3] = ((local148 & 0xFF00FF) * local128 & 0xFF00FF00) + ((local148 & 0xFF00) * local128 & 0xFF0000) >> 8;
					}
					arg6 += arg7;
					local102 += local116;
					arg3++;
					local3--;
				} while (local3 > 0);
				return;
			}
			return;
		}
		if (local3 > 0) {
			do {
				@Pc(629) int local629;
				if (arg6 < arg1[arg3] && (local629 = arg2[(local102 & 0xFC0) + (local102 >>> 26)]) != 0) {
					arg0[arg3] = ((local629 & 0xFF00FF) * local128 & 0xFF00FF00) + ((local629 & 0xFF00) * local128 & 0xFF0000) >> 8;
				}
				arg6 += arg7;
				local102 += local116;
				arg3++;
				@Pc(675) int local675;
				if (arg6 < arg1[arg3] && (local675 = arg2[(local102 & 0xFC0) + (local102 >>> 26)]) != 0) {
					arg0[arg3] = ((local675 & 0xFF00FF) * local128 & 0xFF00FF00) + ((local675 & 0xFF00) * local128 & 0xFF0000) >> 8;
				}
				arg6 += arg7;
				local102 += local116;
				arg3++;
				@Pc(721) int local721;
				if (arg6 < arg1[arg3] && (local721 = arg2[(local102 & 0xFC0) + (local102 >>> 26)]) != 0) {
					arg0[arg3] = ((local721 & 0xFF00FF) * local128 & 0xFF00FF00) + ((local721 & 0xFF00) * local128 & 0xFF0000) >> 8;
				}
				arg6 += arg7;
				local102 += local116;
				arg3++;
				@Pc(767) int local767;
				if (arg6 < arg1[arg3] && (local767 = arg2[(local102 & 0xFC0) + (local102 >>> 26)]) != 0) {
					arg0[arg3] = ((local767 & 0xFF00FF) * local128 & 0xFF00FF00) + ((local767 & 0xFF00) * local128 & 0xFF0000) >> 8;
				}
				arg6 += arg7;
				local102 += local116;
				arg3++;
				@Pc(813) int local813;
				if (arg6 < arg1[arg3] && (local813 = arg2[(local102 & 0xFC0) + (local102 >>> 26)]) != 0) {
					arg0[arg3] = ((local813 & 0xFF00FF) * local128 & 0xFF00FF00) + ((local813 & 0xFF00) * local128 & 0xFF0000) >> 8;
				}
				arg6 += arg7;
				local102 += local116;
				arg3++;
				@Pc(859) int local859;
				if (arg6 < arg1[arg3] && (local859 = arg2[(local102 & 0xFC0) + (local102 >>> 26)]) != 0) {
					arg0[arg3] = ((local859 & 0xFF00FF) * local128 & 0xFF00FF00) + ((local859 & 0xFF00) * local128 & 0xFF0000) >> 8;
				}
				arg6 += arg7;
				local102 += local116;
				arg3++;
				@Pc(905) int local905;
				if (arg6 < arg1[arg3] && (local905 = arg2[(local102 & 0xFC0) + (local102 >>> 26)]) != 0) {
					arg0[arg3] = ((local905 & 0xFF00FF) * local128 & 0xFF00FF00) + ((local905 & 0xFF00) * local128 & 0xFF0000) >> 8;
				}
				arg6 += arg7;
				local102 += local116;
				arg3++;
				@Pc(951) int local951;
				if (arg6 < arg1[arg3] && (local951 = arg2[(local102 & 0xFC0) + (local102 >>> 26)]) != 0) {
					arg0[arg3] = ((local951 & 0xFF00FF) * local128 & 0xFF00FF00) + ((local951 & 0xFF00) * local128 & 0xFF0000) >> 8;
				}
				arg6 += arg7;
				arg3++;
				local49 = local84;
				local56 = local91;
				arg10 += arg13;
				arg11 += arg14;
				arg12 += arg15;
				if (arg12 == 0.0F) {
					local84 = 0;
					local91 = 0;
				} else {
					local84 = (int) (arg10 * 4096.0F / arg12);
					local91 = (int) (arg11 * 4096.0F / arg12);
				}
				local102 = (local49 << 20) + local56;
				local116 = (local84 - local49 >> 3 << 20) + (local91 - local56 >> 3);
				arg8 += local124;
				local128 = arg8 >> 8;
				local3--;
			} while (local3 > 0);
		}
		local3 = arg5 - arg4 & 0x7;
		if (local3 <= 0) {
			return;
		}
		do {
			@Pc(1075) int local1075;
			if (arg6 < arg1[arg3] && (local1075 = arg2[(local102 & 0xFC0) + (local102 >>> 26)]) != 0) {
				arg0[arg3] = ((local1075 & 0xFF00FF) * local128 & 0xFF00FF00) + ((local1075 & 0xFF00) * local128 & 0xFF0000) >> 8;
			}
			arg6 += arg7;
			local102 += local116;
			arg3++;
			local3--;
		} while (local3 > 0);
		return;
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "([I[IIIIIIIIIIIIII)V")
	private void method2740(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int arg8, @OriginalArg(11) int arg9, @OriginalArg(12) int arg10, @OriginalArg(13) int arg11, @OriginalArg(14) int arg12) {
		if (this.aBoolean250) {
			if (arg4 > this.anInt3217) {
				arg4 = this.anInt3217;
			}
			if (arg3 < 0) {
				arg3 = 0;
			}
		}
		if (arg3 >= arg4) {
			return;
		}
		@Pc(162) int local162;
		@Pc(167) int local167;
		@Pc(223) int local223;
		@Pc(458) int local458;
		@Pc(462) int local462;
		@Pc(470) int local470;
		@Pc(51) int local51;
		@Pc(86) int local86;
		@Pc(101) int local101;
		@Pc(55) int local55;
		@Pc(59) int local59;
		@Pc(63) int local63;
		if (this.aBoolean249) {
			arg2 += arg3;
			arg7 += arg8 * arg3;
			arg9 += arg10 * arg3;
			arg11 += arg12 * arg3;
			if (this.aBoolean254) {
				local51 = arg4 - arg3 >> 2;
				local55 = arg8 << 2;
				local59 = arg10 << 2;
				local63 = arg12 << 2;
				if (this.anInt3219 == 0) {
					if (local51 > 0) {
						do {
							local86 = (arg7 & 0xFF00 | 0xFF0000) << 8 | arg9 & 0xFF00 | arg11 >> 8 & 0xFF;
							arg7 += local55;
							arg9 += local59;
							arg11 += local63;
							local101 = arg2 + 1;
							arg0[arg2] = local86;
							arg0[local101++] = local86;
							arg0[local101++] = local86;
							arg2 = local101 + 1;
							arg0[local101] = local86;
							local51--;
						} while (local51 > 0);
					}
					local51 = arg4 - arg3 & 0x3;
					if (local51 > 0) {
						local86 = (arg7 & 0xFF00 | 0xFF0000) << 8 | arg9 & 0xFF00 | arg11 >> 8 & 0xFF;
						do {
							arg0[arg2++] = local86;
							local51--;
						} while (local51 > 0);
						return;
					}
				} else if (this.aBoolean251) {
					if (local51 > 0) {
						do {
							local86 = (arg7 & 0xFF00) << 8 | arg9 & 0xFF00 | arg11 >> 8 & 0xFF;
							arg7 += local55;
							arg9 += local59;
							arg11 += local63;
							local101 = arg2 + 1;
							local458 = arg0[arg2];
							local462 = local86 + local458;
							local470 = (local86 & 0xFF00FF) + (local458 & 0xFF00FF);
							local458 = (local470 & 0x1000100) + (local462 - local470 & 0x10000);
							arg0[arg2] = local462 - local458 | 0xFF000000 | local458 - (local458 >>> 8);
							@Pc(499) int local499 = local101++;
							@Pc(505) int local505 = arg0[local499];
							@Pc(509) int local509 = local86 + local505;
							@Pc(517) int local517 = (local86 & 0xFF00FF) + (local505 & 0xFF00FF);
							@Pc(527) int local527 = (local517 & 0x1000100) + (local509 - local517 & 0x10000);
							arg0[local499] = local509 - local527 | 0xFF000000 | local527 - (local527 >>> 8);
							@Pc(546) int local546 = local101++;
							@Pc(552) int local552 = arg0[local546];
							@Pc(556) int local556 = local86 + local552;
							@Pc(564) int local564 = (local86 & 0xFF00FF) + (local552 & 0xFF00FF);
							@Pc(574) int local574 = (local564 & 0x1000100) + (local556 - local564 & 0x10000);
							arg0[local546] = local556 - local574 | 0xFF000000 | local574 - (local574 >>> 8);
							arg2 = local101 + 1;
							@Pc(599) int local599 = arg0[local101];
							@Pc(603) int local603 = local86 + local599;
							@Pc(611) int local611 = (local86 & 0xFF00FF) + (local599 & 0xFF00FF);
							@Pc(621) int local621 = (local611 & 0x1000100) + (local603 - local611 & 0x10000);
							arg0[local101] = local603 - local621 | 0xFF000000 | local621 - (local621 >>> 8);
							local51--;
						} while (local51 > 0);
					}
					local51 = arg4 - arg3 & 0x3;
					if (local51 > 0) {
						local86 = (arg7 & 0xFF00) << 8 | arg9 & 0xFF00 | arg11 >> 8 & 0xFF;
						do {
							local167 = arg2++;
							local458 = arg0[local167];
							local462 = local86 + local458;
							local470 = (local86 & 0xFF00FF) + (local458 & 0xFF00FF);
							local458 = (local470 & 0x1000100) + (local462 - local470 & 0x10000);
							arg0[local167] = local462 - local458 | 0xFF000000 | local458 - (local458 >>> 8);
							local51--;
						} while (local51 > 0);
					}
				} else {
					local162 = this.anInt3219;
					local167 = 256 - this.anInt3219;
					if (local51 > 0) {
						do {
							local86 = (arg7 & 0xFF00 | 0xFF0000) << 8 | arg9 & 0xFF00 | arg11 >> 8 & 0xFF;
							arg7 += local55;
							arg9 += local59;
							arg11 += local63;
							local86 = ((local86 & 0xFF00FF) * local167 >> 8 & 0xFF00FF) + ((local86 & 0xFF00) * local167 >> 8 & 0xFF00);
							local223 = arg0[arg2];
							local101 = arg2 + 1;
							arg0[arg2] = local86 + ((local223 & 0xFF00FF) * local162 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local162 >> 8 & 0xFF00);
							local223 = arg0[local101];
							arg0[local101++] = local86 + ((local223 & 0xFF00FF) * local162 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local162 >> 8 & 0xFF00);
							local223 = arg0[local101];
							arg0[local101++] = local86 + ((local223 & 0xFF00FF) * local162 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local162 >> 8 & 0xFF00);
							local223 = arg0[local101];
							arg2 = local101 + 1;
							arg0[local101] = local86 + ((local223 & 0xFF00FF) * local162 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local162 >> 8 & 0xFF00);
							local51--;
						} while (local51 > 0);
					}
					local51 = arg4 - arg3 & 0x3;
					if (local51 > 0) {
						local86 = (arg7 & 0xFF00 | 0xFF0000) << 8 | arg9 & 0xFF00 | arg11 >> 8 & 0xFF;
						local86 = ((local86 & 0xFF00FF) * local167 >> 8 & 0xFF00FF) + ((local86 & 0xFF00) * local167 >> 8 & 0xFF00);
						do {
							local223 = arg0[arg2];
							arg0[arg2++] = local86 + ((local223 & 0xFF00FF) * local162 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local162 >> 8 & 0xFF00);
							local51--;
						} while (local51 > 0);
						return;
					}
				}
			} else {
				local51 = arg4 - arg3;
				if (this.anInt3219 == 0) {
					do {
						arg0[arg2++] = (arg7 & 0xFF00 | 0xFF0000) << 8 | arg9 & 0xFF00 | arg11 >> 8 & 0xFF;
						arg7 += arg8;
						arg9 += arg10;
						arg11 += arg12;
						local51--;
					} while (local51 > 0);
				} else if (this.aBoolean251) {
					do {
						local167 = arg2++;
						local223 = (arg7 & 0xFF00) << 8 | arg9 & 0xFF00 | arg11 >> 8 & 0xFF;
						local458 = arg0[local167];
						local462 = local223 + local458;
						local470 = (local223 & 0xFF00FF) + (local458 & 0xFF00FF);
						local458 = (local470 & 0x1000100) + (local462 - local470 & 0x10000);
						arg0[local167] = local462 - local458 | 0xFF000000 | local458 - (local458 >>> 8);
						arg7 += arg8;
						arg9 += arg10;
						arg11 += arg12;
						local51--;
					} while (local51 > 0);
				} else {
					local162 = this.anInt3219;
					local167 = 256 - this.anInt3219;
					do {
						local86 = (arg7 & 0xFF00 | 0xFF0000) << 8 | arg9 & 0xFF00 | arg11 >> 8 & 0xFF;
						arg7 += arg8;
						arg9 += arg10;
						arg11 += arg12;
						local86 = ((local86 & 0xFF00FF) * local167 >> 8 & 0xFF00FF) + ((local86 & 0xFF00) * local167 >> 8 & 0xFF00);
						local223 = arg0[arg2];
						arg0[arg2++] = local86 + ((local223 & 0xFF00FF) * local162 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local162 >> 8 & 0xFF00);
						local51--;
					} while (local51 > 0);
				}
			}
			return;
		}
		arg2 += arg3 - 1;
		arg5 += arg6 * arg3;
		arg7 += arg8 * arg3;
		arg9 += arg10 * arg3;
		arg11 += arg12 * arg3;
		@Pc(1036) int local1036;
		if (this.aClass216_1.aBoolean425) {
			if (this.aBoolean254) {
				local51 = arg4 - arg3 >> 2;
				local55 = arg8 << 2;
				local59 = arg10 << 2;
				local63 = arg12 << 2;
				if (this.anInt3219 == 0) {
					if (local51 > 0) {
						do {
							local86 = (arg7 & 0xFF00 | 0xFF0000) << 8 | arg9 & 0xFF00 | arg11 >> 8 & 0xFF;
							arg7 += local55;
							arg9 += local59;
							arg11 += local63;
							local101 = arg2 + 1;
							if (arg5 < arg1[local101]) {
								arg0[local101] = local86;
								arg1[local101] = arg5;
							}
							local1036 = arg5 + arg6;
							local101++;
							if (local1036 < arg1[local101]) {
								arg0[local101] = local86;
								arg1[local101] = local1036;
							}
							local1036 += arg6;
							local101++;
							if (local1036 < arg1[local101]) {
								arg0[local101] = local86;
								arg1[local101] = local1036;
							}
							local1036 += arg6;
							arg2 = local101 + 1;
							if (local1036 < arg1[arg2]) {
								arg0[arg2] = local86;
								arg1[arg2] = local1036;
							}
							arg5 = local1036 + arg6;
							local51--;
						} while (local51 > 0);
					}
					local51 = arg4 - arg3 & 0x3;
					if (local51 > 0) {
						local86 = (arg7 & 0xFF00 | 0xFF0000) << 8 | arg9 & 0xFF00 | arg11 >> 8 & 0xFF;
						do {
							arg2++;
							if (arg5 < arg1[arg2]) {
								arg0[arg2] = local86;
								arg1[arg2] = arg5;
							}
							arg5 += arg6;
							local51--;
						} while (local51 > 0);
						return;
					}
				} else if (this.aBoolean251) {
					if (local51 > 0) {
						do {
							local86 = (arg7 & 0xFF00) << 8 | arg9 & 0xFF00 | arg11 >> 8 & 0xFF;
							arg7 += local55;
							arg9 += local59;
							arg11 += local63;
							local101 = arg2 + 1;
							if (arg5 < arg1[local101]) {
								local458 = arg0[local101];
								local462 = local86 + local458;
								local470 = (local86 & 0xFF00FF) + (local458 & 0xFF00FF);
								local458 = (local470 & 0x1000100) + (local462 - local470 & 0x10000);
								arg0[local101] = local462 - local458 | 0xFF000000 | local458 - (local458 >>> 8);
								arg1[local101] = arg5;
							}
							local1036 = arg5 + arg6;
							local101++;
							if (local1036 < arg1[local101]) {
								local458 = arg0[local101];
								local462 = local86 + local458;
								local470 = (local86 & 0xFF00FF) + (local458 & 0xFF00FF);
								local458 = (local470 & 0x1000100) + (local462 - local470 & 0x10000);
								arg0[local101] = local462 - local458 | 0xFF000000 | local458 - (local458 >>> 8);
								arg1[local101] = local1036;
							}
							local1036 += arg6;
							local101++;
							if (local1036 < arg1[local101]) {
								local458 = arg0[local101];
								local462 = local86 + local458;
								local470 = (local86 & 0xFF00FF) + (local458 & 0xFF00FF);
								local458 = (local470 & 0x1000100) + (local462 - local470 & 0x10000);
								arg0[local101] = local462 - local458 | 0xFF000000 | local458 - (local458 >>> 8);
								arg1[local101] = local1036;
							}
							local1036 += arg6;
							arg2 = local101 + 1;
							if (local1036 < arg1[arg2]) {
								local458 = arg0[arg2];
								local462 = local86 + local458;
								local470 = (local86 & 0xFF00FF) + (local458 & 0xFF00FF);
								local458 = (local470 & 0x1000100) + (local462 - local470 & 0x10000);
								arg0[arg2] = local462 - local458 | 0xFF000000 | local458 - (local458 >>> 8);
								arg1[arg2] = local1036;
							}
							arg5 = local1036 + arg6;
							local51--;
						} while (local51 > 0);
					}
					local51 = arg4 - arg3 & 0x3;
					if (local51 > 0) {
						local86 = (arg7 & 0xFF00) << 8 | arg9 & 0xFF00 | arg11 >> 8 & 0xFF;
						do {
							arg2++;
							if (arg5 < arg1[arg2]) {
								local458 = arg0[arg2];
								local462 = local86 + local458;
								local470 = (local86 & 0xFF00FF) + (local458 & 0xFF00FF);
								local458 = (local470 & 0x1000100) + (local462 - local470 & 0x10000);
								arg0[arg2] = local462 - local458 | 0xFF000000 | local458 - (local458 >>> 8);
								arg1[arg2] = arg5;
							}
							arg5 += arg6;
							local51--;
						} while (local51 > 0);
					}
				} else {
					local162 = this.anInt3219;
					local167 = 256 - this.anInt3219;
					if (local51 > 0) {
						do {
							local86 = (arg7 & 0xFF00 | 0xFF0000) << 8 | arg9 & 0xFF00 | arg11 >> 8 & 0xFF;
							arg7 += local55;
							arg9 += local59;
							arg11 += local63;
							local86 = ((local86 & 0xFF00FF) * local167 >> 8 & 0xFF00FF) + ((local86 & 0xFF00) * local167 >> 8 & 0xFF00);
							local101 = arg2 + 1;
							if (arg5 < arg1[local101]) {
								local223 = arg0[local101];
								arg0[local101] = local86 + ((local223 & 0xFF00FF) * local162 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local162 >> 8 & 0xFF00);
								arg1[local101] = arg5;
							}
							local1036 = arg5 + arg6;
							local101++;
							if (local1036 < arg1[local101]) {
								local223 = arg0[local101];
								arg0[local101] = local86 + ((local223 & 0xFF00FF) * local162 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local162 >> 8 & 0xFF00);
								arg1[local101] = local1036;
							}
							local1036 += arg6;
							local101++;
							if (local1036 < arg1[local101]) {
								local223 = arg0[local101];
								arg0[local101] = local86 + ((local223 & 0xFF00FF) * local162 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local162 >> 8 & 0xFF00);
								arg1[local101] = local1036;
							}
							local1036 += arg6;
							arg2 = local101 + 1;
							if (local1036 < arg1[arg2]) {
								local223 = arg0[arg2];
								arg0[arg2] = local86 + ((local223 & 0xFF00FF) * local162 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local162 >> 8 & 0xFF00);
								arg1[arg2] = local1036;
							}
							arg5 = local1036 + arg6;
							local51--;
						} while (local51 > 0);
					}
					local51 = arg4 - arg3 & 0x3;
					if (local51 > 0) {
						local86 = (arg7 & 0xFF00 | 0xFF0000) << 8 | arg9 & 0xFF00 | arg11 >> 8 & 0xFF;
						local86 = ((local86 & 0xFF00FF) * local167 >> 8 & 0xFF00FF) + ((local86 & 0xFF00) * local167 >> 8 & 0xFF00);
						do {
							arg2++;
							if (arg5 < arg1[arg2]) {
								local223 = arg0[arg2];
								arg0[arg2] = local86 + ((local223 & 0xFF00FF) * local162 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local162 >> 8 & 0xFF00);
								arg1[arg2] = arg5;
							}
							arg5 += arg6;
							local51--;
						} while (local51 > 0);
						return;
					}
				}
			} else {
				local51 = arg4 - arg3;
				if (this.anInt3219 == 0) {
					do {
						arg2++;
						if (arg5 < arg1[arg2]) {
							arg0[arg2] = (arg7 & 0xFF00 | 0xFF0000) << 8 | arg9 & 0xFF00 | arg11 >> 8 & 0xFF;
							arg1[arg2] = arg5;
						}
						arg5 += arg6;
						arg7 += arg8;
						arg9 += arg10;
						arg11 += arg12;
						local51--;
					} while (local51 > 0);
				} else if (this.aBoolean251) {
					do {
						arg2++;
						if (arg5 < arg1[arg2]) {
							local223 = (arg7 & 0xFF00) << 8 | arg9 & 0xFF00 | arg11 >> 8 & 0xFF;
							local458 = arg0[arg2];
							local462 = local223 + local458;
							local470 = (local223 & 0xFF00FF) + (local458 & 0xFF00FF);
							local458 = (local470 & 0x1000100) + (local462 - local470 & 0x10000);
							arg0[arg2] = local462 - local458 | 0xFF000000 | local458 - (local458 >>> 8);
							arg1[arg2] = arg5;
						}
						arg5 += arg6;
						arg7 += arg8;
						arg9 += arg10;
						arg11 += arg12;
						local51--;
					} while (local51 > 0);
				} else {
					local162 = this.anInt3219;
					local167 = 256 - this.anInt3219;
					do {
						arg2++;
						if (arg5 < arg1[arg2]) {
							local86 = (arg7 & 0xFF00 | 0xFF0000) << 8 | arg9 & 0xFF00 | arg11 >> 8 & 0xFF;
							local86 = ((local86 & 0xFF00FF) * local167 >> 8 & 0xFF00FF) + ((local86 & 0xFF00) * local167 >> 8 & 0xFF00);
							local223 = arg0[arg2];
							arg0[arg2] = local86 + ((local223 & 0xFF00FF) * local162 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local162 >> 8 & 0xFF00);
							arg1[arg2] = arg5;
						}
						arg5 += arg6;
						arg7 += arg8;
						arg9 += arg10;
						arg11 += arg12;
						local51--;
					} while (local51 > 0);
				}
			}
		} else if (this.aBoolean254) {
			local51 = arg4 - arg3 >> 2;
			local55 = arg8 << 2;
			local59 = arg10 << 2;
			local63 = arg12 << 2;
			if (this.anInt3219 == 0) {
				if (local51 > 0) {
					do {
						local86 = (arg7 & 0xFF00 | 0xFF0000) << 8 | arg9 & 0xFF00 | arg11 >> 8 & 0xFF;
						arg7 += local55;
						arg9 += local59;
						arg11 += local63;
						local101 = arg2 + 1;
						if (arg5 < arg1[local101]) {
							arg0[local101] = local86;
						}
						local1036 = arg5 + arg6;
						local101++;
						if (local1036 < arg1[local101]) {
							arg0[local101] = local86;
						}
						local1036 += arg6;
						local101++;
						if (local1036 < arg1[local101]) {
							arg0[local101] = local86;
						}
						local1036 += arg6;
						arg2 = local101 + 1;
						if (local1036 < arg1[arg2]) {
							arg0[arg2] = local86;
						}
						arg5 = local1036 + arg6;
						local51--;
					} while (local51 > 0);
				}
				local51 = arg4 - arg3 & 0x3;
				if (local51 > 0) {
					local86 = (arg7 & 0xFF00 | 0xFF0000) << 8 | arg9 & 0xFF00 | arg11 >> 8 & 0xFF;
					do {
						arg2++;
						if (arg5 < arg1[arg2]) {
							arg0[arg2] = local86;
						}
						arg5 += arg6;
						local51--;
					} while (local51 > 0);
					return;
				}
			} else if (this.aBoolean251) {
				if (local51 > 0) {
					do {
						local86 = (arg7 & 0xFF00) << 8 | arg9 & 0xFF00 | arg11 >> 8 & 0xFF;
						arg7 += local55;
						arg9 += local59;
						arg11 += local63;
						local101 = arg2 + 1;
						if (arg5 < arg1[local101]) {
							local458 = arg0[local101];
							local462 = local86 + local458;
							local470 = (local86 & 0xFF00FF) + (local458 & 0xFF00FF);
							local458 = (local470 & 0x1000100) + (local462 - local470 & 0x10000);
							arg0[local101] = local462 - local458 | 0xFF000000 | local458 - (local458 >>> 8);
						}
						local1036 = arg5 + arg6;
						local101++;
						if (local1036 < arg1[local101]) {
							local458 = arg0[local101];
							local462 = local86 + local458;
							local470 = (local86 & 0xFF00FF) + (local458 & 0xFF00FF);
							local458 = (local470 & 0x1000100) + (local462 - local470 & 0x10000);
							arg0[local101] = local462 - local458 | 0xFF000000 | local458 - (local458 >>> 8);
						}
						local1036 += arg6;
						local101++;
						if (local1036 < arg1[local101]) {
							local458 = arg0[local101];
							local462 = local86 + local458;
							local470 = (local86 & 0xFF00FF) + (local458 & 0xFF00FF);
							local458 = (local470 & 0x1000100) + (local462 - local470 & 0x10000);
							arg0[local101] = local462 - local458 | 0xFF000000 | local458 - (local458 >>> 8);
						}
						local1036 += arg6;
						arg2 = local101 + 1;
						if (local1036 < arg1[arg2]) {
							local458 = arg0[arg2];
							local462 = local86 + local458;
							local470 = (local86 & 0xFF00FF) + (local458 & 0xFF00FF);
							local458 = (local470 & 0x1000100) + (local462 - local470 & 0x10000);
							arg0[arg2] = local462 - local458 | 0xFF000000 | local458 - (local458 >>> 8);
						}
						arg5 = local1036 + arg6;
						local51--;
					} while (local51 > 0);
				}
				local51 = arg4 - arg3 & 0x3;
				if (local51 > 0) {
					local86 = (arg7 & 0xFF00) << 8 | arg9 & 0xFF00 | arg11 >> 8 & 0xFF;
					do {
						arg2++;
						if (arg5 < arg1[arg2]) {
							local458 = arg0[arg2];
							local462 = local86 + local458;
							local470 = (local86 & 0xFF00FF) + (local458 & 0xFF00FF);
							local458 = (local470 & 0x1000100) + (local462 - local470 & 0x10000);
							arg0[arg2] = local462 - local458 | 0xFF000000 | local458 - (local458 >>> 8);
						}
						arg5 += arg6;
						local51--;
					} while (local51 > 0);
				}
			} else {
				local162 = this.anInt3219;
				local167 = 256 - this.anInt3219;
				if (local51 > 0) {
					do {
						local86 = (arg7 & 0xFF00 | 0xFF0000) << 8 | arg9 & 0xFF00 | arg11 >> 8 & 0xFF;
						arg7 += local55;
						arg9 += local59;
						arg11 += local63;
						local86 = ((local86 & 0xFF00FF) * local167 >> 8 & 0xFF00FF) + ((local86 & 0xFF00) * local167 >> 8 & 0xFF00);
						local101 = arg2 + 1;
						if (arg5 < arg1[local101]) {
							local223 = arg0[local101];
							arg0[local101] = local86 + ((local223 & 0xFF00FF) * local162 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local162 >> 8 & 0xFF00);
						}
						local1036 = arg5 + arg6;
						local101++;
						if (local1036 < arg1[local101]) {
							local223 = arg0[local101];
							arg0[local101] = local86 + ((local223 & 0xFF00FF) * local162 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local162 >> 8 & 0xFF00);
						}
						local1036 += arg6;
						local101++;
						if (local1036 < arg1[local101]) {
							local223 = arg0[local101];
							arg0[local101] = local86 + ((local223 & 0xFF00FF) * local162 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local162 >> 8 & 0xFF00);
						}
						local1036 += arg6;
						arg2 = local101 + 1;
						if (local1036 < arg1[arg2]) {
							local223 = arg0[arg2];
							arg0[arg2] = local86 + ((local223 & 0xFF00FF) * local162 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local162 >> 8 & 0xFF00);
						}
						arg5 = local1036 + arg6;
						local51--;
					} while (local51 > 0);
				}
				local51 = arg4 - arg3 & 0x3;
				if (local51 > 0) {
					local86 = (arg7 & 0xFF00 | 0xFF0000) << 8 | arg9 & 0xFF00 | arg11 >> 8 & 0xFF;
					local86 = ((local86 & 0xFF00FF) * local167 >> 8 & 0xFF00FF) + ((local86 & 0xFF00) * local167 >> 8 & 0xFF00);
					do {
						arg2++;
						if (arg5 < arg1[arg2]) {
							local223 = arg0[arg2];
							arg0[arg2] = local86 + ((local223 & 0xFF00FF) * local162 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local162 >> 8 & 0xFF00);
						}
						arg5 += arg6;
						local51--;
					} while (local51 > 0);
					return;
				}
			}
		} else {
			local51 = arg4 - arg3;
			if (this.anInt3219 == 0) {
				do {
					arg2++;
					if (arg5 < arg1[arg2]) {
						arg0[arg2] = (arg7 & 0xFF00 | 0xFF0000) << 8 | arg9 & 0xFF00 | arg11 >> 8 & 0xFF;
					}
					arg5 += arg6;
					arg7 += arg8;
					arg9 += arg10;
					arg11 += arg12;
					local51--;
				} while (local51 > 0);
			} else if (this.aBoolean251) {
				do {
					arg2++;
					if (arg5 < arg1[arg2]) {
						local223 = (arg7 & 0xFF00) << 8 | arg9 & 0xFF00 | arg11 >> 8 & 0xFF;
						local458 = arg0[arg2];
						local462 = local223 + local458;
						local470 = (local223 & 0xFF00FF) + (local458 & 0xFF00FF);
						@Pc(3096) int local3096 = (local470 & 0x1000100) + (local462 - local470 & 0x10000);
						arg0[arg2] = local462 - local3096 | 0xFF000000 | local3096 - (local3096 >>> 8);
					}
					arg5 += arg6;
					arg7 += arg8;
					arg9 += arg10;
					arg11 += arg12;
					local51--;
				} while (local51 > 0);
			} else {
				local162 = this.anInt3219;
				local167 = 256 - this.anInt3219;
				do {
					arg2++;
					if (arg5 < arg1[arg2]) {
						local86 = (arg7 & 0xFF00 | 0xFF0000) << 8 | arg9 & 0xFF00 | arg11 >> 8 & 0xFF;
						@Pc(2996) int local2996 = ((local86 & 0xFF00FF) * local167 >> 8 & 0xFF00FF) + ((local86 & 0xFF00) * local167 >> 8 & 0xFF00);
						local223 = arg0[arg2];
						arg0[arg2] = local2996 + ((local223 & 0xFF00FF) * local162 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local162 >> 8 & 0xFF00);
					}
					arg5 += arg6;
					arg7 += arg8;
					arg9 += arg10;
					arg11 += arg12;
					local51--;
				} while (local51 > 0);
			}
		}
	}
}

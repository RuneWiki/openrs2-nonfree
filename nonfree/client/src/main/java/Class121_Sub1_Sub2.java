import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kv")
public final class Class121_Sub1_Sub2 extends Class121_Sub1 {

	@OriginalMember(owner = "client!kv", name = "vb", descriptor = "I")
	private int anInt4534;

	@OriginalMember(owner = "client!kv", name = "Bb", descriptor = "I")
	private int anInt4539;

	@OriginalMember(owner = "client!kv", name = "Eb", descriptor = "[I")
	public int[] anIntArray445;

	@OriginalMember(owner = "client!kv", name = "Rb", descriptor = "Z")
	public boolean aBoolean280 = true;

	@OriginalMember(owner = "client!kv", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!e;)V")
	public Class121_Sub1_Sub2(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface7 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!kv", name = "g", descriptor = "(I)V")
	@Override
	public void method7119(@OriginalArg(0) int arg0) {
		super.anInt4503 = arg0;
		super.aClass77Array3 = new Class77_Sub1[super.anInt4503];
		for (@Pc(15) int local15 = 0; local15 < super.anInt4503; local15++) {
			super.aClass77Array3[local15] = new Class77_Sub1(this);
		}
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(Lclient!rf;IIII)Lclient!ba;")
	@Override
	public Class22 method7088(@OriginalArg(0) Class274 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class22_Sub1_Sub1(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!kv", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7156(@OriginalArg(0) Canvas arg0) {
		@Pc(12) Class6_Sub16 local12 = (Class6_Sub16) super.aClass212_17.method5106((long) arg0.hashCode());
		if (local12 == null) {
			return;
		}
		local12.method7849();
		local12 = Static296.method7809(arg0);
		super.aClass212_17.method5104((long) arg0.hashCode(), local12);
		if (super.aCanvas6 != arg0 || super.aClass4_15 != null) {
			return;
		}
		super.aClass6_Sub16_3 = local12;
		super.anInt4508 = local12.anInt7173;
		super.anIntArray444 = local12.anIntArray574;
		super.anInt4529 = local12.anInt7174;
		if (this.anInt4539 != super.anInt4529 || this.anInt4534 != super.anInt4508) {
			this.anInt4539 = super.anInt4529;
			this.anInt4534 = super.anInt4508;
			this.anIntArray445 = new int[this.anInt4534 * this.anInt4539];
		}
		this.method3923();
		return;
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method7115() {
		@Pc(10) Class77_Sub1 local10 = (Class77_Sub1) this.method3922(Thread.currentThread());
		@Pc(13) Class116 local13 = local10.aClass116_2;
		local13.aBoolean186 = local13.anInt2776 < 5 || local13.anInt2776 < 75 || local13.anInt2776 < 15;
		local13.aBoolean187 = false;
		@Pc(57) int local57 = 10 - super.anInt4521;
		@Pc(62) int local62 = 90 - super.anInt4521;
		@Pc(67) int local67 = 75 - super.anInt4500;
		@Pc(72) int local72 = 5 - super.anInt4500;
		@Pc(77) int local77 = 50 - super.anInt4521;
		@Pc(82) int local82 = 15 - super.anInt4500;
		local13.anInt2773 = 0;
		local13.aBoolean184 = false;
		local13.method2298(local57, local77, local62, local72, local67, local82, 100, 100, 100, -65536, -65536, -65536);
		local13.aBoolean187 = true;
	}

	@OriginalMember(owner = "client!kv", name = "b", descriptor = "(I)V")
	@Override
	public void method7089(@OriginalArg(0) int arg0) {
		super.aClass77Array3[arg0].method2704(null);
	}

	@OriginalMember(owner = "client!kv", name = "b", descriptor = "()V")
	@Override
	public void method7084() {
		@Pc(32) int local32;
		@Pc(39) int local39;
		@Pc(41) int local41;
		if (super.anInt4519 == 0 && super.anInt4502 == super.anInt4529 && super.anInt4514 == 0 && super.anInt4508 == super.anInt4523) {
			local32 = this.anIntArray445.length;
			local39 = local32 - local32 & 0x7;
			local41 = 0;
			while (local41 < local39) {
				this.anIntArray445[local41++] = Integer.MAX_VALUE;
				this.anIntArray445[local41++] = Integer.MAX_VALUE;
				this.anIntArray445[local41++] = Integer.MAX_VALUE;
				this.anIntArray445[local41++] = Integer.MAX_VALUE;
				this.anIntArray445[local41++] = Integer.MAX_VALUE;
				this.anIntArray445[local41++] = Integer.MAX_VALUE;
				this.anIntArray445[local41++] = Integer.MAX_VALUE;
				this.anIntArray445[local41++] = Integer.MAX_VALUE;
			}
			while (local32 > local41) {
				this.anIntArray445[local41++] = Integer.MAX_VALUE;
			}
			return;
		}
		local32 = super.anInt4502 - super.anInt4519;
		local39 = -super.anInt4514 + super.anInt4523;
		local41 = super.anInt4529 - local32;
		@Pc(139) int local139 = super.anInt4514 * super.anInt4529 + super.anInt4519;
		@Pc(143) int local143 = local32 >> 3;
		@Pc(147) int local147 = local32 & 0x7;
		local32 = local139 - 1;
		for (@Pc(154) int local154 = -local39; local154 < 0; local154++) {
			@Pc(163) int local163;
			if (local143 > 0) {
				local163 = local143;
				do {
					local32++;
					this.anIntArray445[local32] = Integer.MAX_VALUE;
					local32++;
					this.anIntArray445[local32] = Integer.MAX_VALUE;
					local32++;
					this.anIntArray445[local32] = Integer.MAX_VALUE;
					local32++;
					this.anIntArray445[local32] = Integer.MAX_VALUE;
					local32++;
					this.anIntArray445[local32] = Integer.MAX_VALUE;
					local32++;
					this.anIntArray445[local32] = Integer.MAX_VALUE;
					local32++;
					this.anIntArray445[local32] = Integer.MAX_VALUE;
					local32++;
					this.anIntArray445[local32] = Integer.MAX_VALUE;
					local163--;
				} while (local163 > 0);
			}
			if (local147 > 0) {
				local163 = local147;
				do {
					local32++;
					this.anIntArray445[local32] = Integer.MAX_VALUE;
					local163--;
				} while (local163 > 0);
			}
			local32 += local41;
		}
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "([Lclient!ba;Lclient!q;[Lclient!qn;I)V")
	@Override
	public void method7136(@OriginalArg(0) Class22[] arg0, @OriginalArg(1) Class34 arg1, @OriginalArg(2) Class102_Sub5[] arg2, @OriginalArg(3) int arg3) {
		for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
			if (arg0[local3] != null) {
				arg0[local3].method4689(arg1, arg2 == null ? null : arg2[local3], arg3);
			}
		}
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7101(@OriginalArg(0) Canvas arg0) {
		if (arg0 == null) {
			super.aClass6_Sub16_3 = null;
			super.aCanvas6 = null;
			if (super.aClass4_15 == null) {
				super.anIntArray444 = null;
				super.anInt4529 = super.anInt4508 = 1;
				this.anInt4539 = this.anInt4534 = 1;
				this.method3923();
			}
			return;
		}
		@Pc(10) Class6_Sub16 local10 = (Class6_Sub16) super.aClass212_17.method5106((long) arg0.hashCode());
		if (local10 == null) {
			return;
		}
		super.aCanvas6 = arg0;
		super.aClass6_Sub16_3 = local10;
		if (super.aClass4_15 != null) {
			return;
		}
		super.anInt4529 = local10.anInt7174;
		super.anIntArray444 = local10.anIntArray574;
		super.anInt4508 = local10.anInt7173;
		if (this.anInt4539 != super.anInt4529 || this.anInt4534 != super.anInt4508) {
			this.anInt4534 = super.anInt4508;
			this.anInt4539 = super.anInt4529;
			this.anIntArray445 = new int[this.anInt4534 * this.anInt4539];
		}
		this.method3923();
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(II[[I[[IIII)Lclient!d;")
	@Override
	public Class60 method7121(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class60_Sub1_Sub1(this, arg4, arg5, arg0, arg1, arg2, arg3, 512);
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "([Lclient!ba;Lclient!ob;Lclient!q;[Lclient!qn;I)V")
	@Override
	public void method7151(@OriginalArg(0) Class22[] arg0, @OriginalArg(1) Class222 arg1, @OriginalArg(2) Class34 arg2, @OriginalArg(3) Class102_Sub5[] arg3, @OriginalArg(4) int arg4) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			if (arg0[local7] != null) {
				((Class22_Sub1) arg0[local7]).method4727(arg2, arg3 == null ? null : arg3[local7], arg1, arg4);
			}
		}
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(Lclient!pl;IIII)V")
	@Override
	public void method3927(@OriginalArg(0) Class102_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) int local6 = arg0.anInt2522;
		@Pc(12) int local12 = arg4 << 1;
		if (local6 == -1) {
			this.method3937(1, arg2, arg0.anInt2519, arg3, arg1, arg4);
			return;
		}
		if (super.anInt4530 != local6) {
			@Pc(27) Class4 local27 = (Class4) super.aClass332_114.method7502((long) local6);
			if (local27 == null) {
				@Pc(33) int[] local33 = this.method3933(local6);
				if (local33 == null) {
					return;
				}
				@Pc(44) int local44 = this.method3931(local6) ? 64 : 128;
				local27 = this.method7110(local33, local44, local44, local44);
				super.aClass332_114.method7498((long) local6, local27);
			}
			super.anInt4530 = local6;
			super.aClass4_16 = local27;
		}
		local12++;
		this.method3938(1, arg3, arg1 - arg4, 0, (Class4_Sub1_Sub1) super.aClass4_16, local12, arg0.anInt2519, local12, arg2 - arg4);
	}

	@OriginalMember(owner = "client!kv", name = "d", descriptor = "(Z)V")
	@Override
	public void method7129(@OriginalArg(0) boolean arg0) {
		this.aBoolean280 = arg0;
	}

	@OriginalMember(owner = "client!kv", name = "e", descriptor = "(I)V")
	@Override
	public void method7105(@OriginalArg(0) int arg0) {
		super.aClass77Array3[arg0].method2704(Thread.currentThread());
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(IIIBIII)V")
	private void method3937(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg5 < 0) {
			arg5 = -arg5;
		}
		@Pc(14) int local14 = arg3 << 8;
		@Pc(19) int local19 = arg1 - arg5;
		if (local19 < super.anInt4514) {
			local19 = super.anInt4514;
		}
		@Pc(32) int local32 = arg5 + arg1 + 1;
		if (local32 > super.anInt4523) {
			local32 = super.anInt4523;
		}
		@Pc(45) int local45 = local19;
		@Pc(49) int local49 = arg5 * arg5;
		@Pc(51) int local51 = 0;
		@Pc(55) int local55 = arg1 - local19;
		@Pc(63) int local63 = local55 * local55;
		@Pc(68) int local68 = local63 - local55;
		if (local32 < arg1) {
			arg1 = local32;
		}
		@Pc(81) int local81 = arg2 >>> 24;
		@Pc(128) int local128;
		@Pc(143) int local143;
		@Pc(157) int local157;
		@Pc(160) int local160;
		if (arg0 == 0 || arg0 == 1 && local81 == 255) {
			while (local45 < arg1) {
				while (local68 <= local49 || local63 <= local49) {
					local63 += local51 + local51;
					local68 += local51++ + local51;
				}
				local128 = arg4 + 1 - local51;
				if (local128 < super.anInt4519) {
					local128 = super.anInt4519;
				}
				local143 = local51 + arg4;
				if (super.anInt4502 < local143) {
					local143 = super.anInt4502;
				}
				local157 = local128 + super.anInt4529 * local45;
				local45++;
				for (local160 = local128; local160 < local143; local160++) {
					if (this.anIntArray445[local157] > local14) {
						super.anIntArray444[local157] = arg2;
					}
					local157++;
				}
				local63 -= local55-- + local55;
				local68 -= local55 + local55;
			}
			local51 = arg5;
			local55 = local45 - arg1;
			local68 = local55 * local55 + local49;
			local63 = local68 - arg5;
			local68 -= local55;
			while (local45 < local32) {
				while (local68 > local49 && local63 > local49) {
					local68 -= local51-- + local51;
					local63 -= local51 + local51;
				}
				local128 = arg4 - local51;
				if (super.anInt4519 > local128) {
					local128 = super.anInt4519;
				}
				local143 = local51 + arg4;
				if (super.anInt4502 - 1 < local143) {
					local143 = super.anInt4502 - 1;
				}
				local157 = local128 + super.anInt4529 * local45;
				local45++;
				local68 += local55 + local55;
				for (local160 = local128; local160 <= local143; local160++) {
					if (this.anIntArray445[local157] > local14) {
						super.anIntArray444[local157] = arg2;
					}
					local157++;
				}
				local63 += local55++ + local55;
			}
			return;
		}
		@Pc(412) int local412;
		@Pc(417) int local417;
		if (arg0 == 1) {
			@Pc(664) int local664 = (local81 << 24) + (local81 * (arg2 & 0xFF00) >> 8 & 0xFF00) + ((arg2 & 0xFF00FF) * local81 >> 8 & 0xFF00FF);
			local128 = 256 - local81;
			while (local45 < arg1) {
				while (local49 >= local68 || local63 <= local49) {
					local63 += local51 + local51;
					local68 += local51++ + local51;
				}
				local143 = arg4 + 1 - local51;
				if (local143 < super.anInt4519) {
					local143 = super.anInt4519;
				}
				local157 = arg4 + local51;
				if (super.anInt4502 < local157) {
					local157 = super.anInt4502;
				}
				local160 = local143 + local45 * super.anInt4529;
				for (local412 = local143; local412 < local157; local412++) {
					if (this.anIntArray445[local160] > local14) {
						local417 = super.anIntArray444[local160];
						@Pc(766) int local766 = (local128 * (local417 & 0xFF00FF) >> 8 & 0xFF00FF) + (local128 * (local417 & 0xFF00) >> 8 & 0xFF00);
						super.anIntArray444[local160] = local766 + local664;
					}
					local160++;
				}
				local63 -= local55-- + local55;
				local45++;
				local68 -= local55 + local55;
			}
			local55 = -local55;
			local51 = arg5;
			local68 = local55 * local55 + local49;
			local63 = local68 - arg5;
			local68 -= local55;
			while (local32 > local45) {
				while (local68 > local49 && local49 < local63) {
					local68 -= local51-- + local51;
					local63 -= local51 + local51;
				}
				local143 = arg4 - local51;
				if (local143 < super.anInt4519) {
					local143 = super.anInt4519;
				}
				local157 = arg4 + local51;
				if (local157 > super.anInt4502 - 1) {
					local157 = super.anInt4502 - 1;
				}
				local160 = local45 * super.anInt4529 + local143;
				for (local412 = local143; local412 <= local157; local412++) {
					if (local14 < this.anIntArray445[local160]) {
						local417 = super.anIntArray444[local160];
						local417 = (local128 * (local417 & 0xFF00FF) >> 8 & 0xFF00FF) + (((local417 & 0xFF00) * local128 & 0xFF00B5) >> 8);
						super.anIntArray444[local160] = local417 + local664;
					}
					local160++;
				}
				local68 += local55 + local55;
				local45++;
				local63 += local55++ + local55;
			}
		} else if (arg0 == 2) {
			@Pc(425) int local425;
			while (local45 < arg1) {
				while (local49 >= local68 || local63 <= local49) {
					local63 += local51 + local51;
					local68 += local51++ + local51;
				}
				local128 = arg4 + 1 - local51;
				if (local128 < super.anInt4519) {
					local128 = super.anInt4519;
				}
				local143 = local51 + arg4;
				if (super.anInt4502 < local143) {
					local143 = super.anInt4502;
				}
				local157 = super.anInt4529 * local45 + local128;
				for (local160 = local128; local160 < local143; local160++) {
					if (local14 < this.anIntArray445[local157]) {
						local412 = super.anIntArray444[local157];
						local417 = arg2 + local412;
						local425 = (arg2 & 0xFF00FF) + (local412 & 0xFF00FF);
						local412 = (local425 & 0x1000100) + (local417 - local425 & 0x10000);
						super.anIntArray444[local157] = local412 - (local412 >>> 8) | -local412 + local417;
					}
					local157++;
				}
				local63 -= local55-- + local55;
				local45++;
				local68 -= local55 + local55;
			}
			local51 = arg5;
			local55 = -local55;
			local68 = local55 * local55 + local49;
			local63 = local68 - arg5;
			local68 -= local55;
			while (local45 < local32) {
				while (local68 > local49 && local49 < local63) {
					local68 -= local51-- + local51;
					local63 -= local51 + local51;
				}
				local128 = arg4 - local51;
				if (local128 < super.anInt4519) {
					local128 = super.anInt4519;
				}
				local143 = local51 + arg4;
				if (local143 > super.anInt4502 - 1) {
					local143 = super.anInt4502 - 1;
				}
				local157 = super.anInt4529 * local45 + local128;
				local45++;
				local68 += local55 + local55;
				for (local160 = local128; local160 <= local143; local160++) {
					if (this.anIntArray445[local157] > local14) {
						local412 = super.anIntArray444[local157];
						local417 = arg2 + local412;
						local425 = (arg2 & 0xFF00FF) + (local412 & 0xFF00FF);
						local412 = (local417 - local425 & 0x10000) + (local425 & 0x1000100);
						super.anIntArray444[local157] = local417 - local412 | local412 - (local412 >>> 8);
					}
					local157++;
				}
				local63 += local55++ + local55;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method7154(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(10) Class77_Sub1 local10 = (Class77_Sub1) this.method3922(Thread.currentThread());
		@Pc(13) Class116 local13 = local10.aClass116_2;
		@Pc(17) int local17 = arg2 - arg0;
		@Pc(22) int local22 = arg3 - arg1;
		@Pc(29) int local29 = local17 < 0 ? -local17 : local17;
		@Pc(36) int local36 = local22 >= 0 ? local22 : -local22;
		@Pc(38) int local38 = local29;
		if (local36 > local29) {
			local38 = local36;
		}
		if (local38 == 0) {
			return;
		}
		@Pc(55) int local55 = (local17 << 16) / local38;
		@Pc(61) int local61 = (local22 << 16) / local38;
		local17 += local55 >> 16;
		local22 += local61 >> 16;
		if (local61 > local55) {
			local61 = -local61;
		} else {
			local55 = -local55;
		}
		@Pc(94) int local94 = arg5 * local61 >> 17;
		@Pc(102) int local102 = local61 * arg5 + 1 >> 17;
		@Pc(108) int local108 = arg5 * local55 >> 17;
		@Pc(116) int local116 = local55 * arg5 + 1 >> 17;
		@Pc(121) int local121 = arg0 - local13.method2314();
		@Pc(126) int local126 = arg1 - local13.method2309();
		@Pc(131) int local131 = local121 + local94;
		@Pc(136) int local136 = local121 - local102;
		@Pc(142) int local142 = local121 + local17 - local102;
		@Pc(149) int local149 = local121 + local17 + local94;
		@Pc(154) int local154 = local126 + local108;
		@Pc(159) int local159 = local126 - local116;
		@Pc(167) int local167 = local126 + local22 - local116;
		@Pc(173) int local173 = local108 + local22 + local126;
		local13.anInt2773 = 0;
		local13.aBoolean186 = local131 < 0 || local13.anInt2776 < local131 || local136 < 0 || local136 > local13.anInt2776 || local142 < 0 || local13.anInt2776 < local142;
		local13.method2312(local154, local159, local167, local131, local136, local142, 0, 0, 0, arg4);
		local13.aBoolean186 = local131 < 0 || local13.anInt2776 < local131 || local142 < 0 || local142 > local13.anInt2776 || local149 < 0 || local13.anInt2776 < local149;
		local13.method2312(local154, local167, local173, local131, local142, local149, 0, 0, 0, arg4);
	}

	@OriginalMember(owner = "client!kv", name = "b", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method3925(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg3 == 0 || arg4 == 0) {
			return;
		}
		if (arg6 == 65535 || super.anInterface7_14.method5209(arg6).aBoolean107) {
			this.method3937(arg9, arg1, arg7, arg2, arg0, arg3);
			return;
		}
		if (arg6 != super.anInt4530) {
			@Pc(36) Class4 local36 = (Class4) super.aClass332_114.method7502((long) arg6);
			if (local36 == null) {
				@Pc(42) int[] local42 = this.method3933(arg6);
				if (local42 == null) {
					return;
				}
				@Pc(53) int local53 = this.method3931(arg6) ? 64 : 128;
				local36 = this.method7110(local42, local53, local53, local53);
				super.aClass332_114.method7498((long) arg6, local36);
			}
			super.anInt4530 = arg6;
			super.aClass4_16 = local36;
		}
		this.method3938(arg9, arg2, arg0 - arg3, arg8, (Class4_Sub1_Sub1) super.aClass4_16, arg3 << 1, arg7, arg4 << 1, arg1 - arg4);
	}

	@OriginalMember(owner = "client!kv", name = "G", descriptor = "()V")
	@Override
	protected void method3929() {
		super.anInt4521 = -super.anInt4528 + super.anInt4514;
		super.anInt4518 = -super.anInt4528 + super.anInt4523;
		super.anInt4500 = -super.anInt4510 + super.anInt4519;
		super.anInt4515 = super.anInt4502 - super.anInt4510;
		for (@Pc(38) int local38 = 0; super.anInt4503 > local38; local38++) {
			@Pc(47) Class116 local47 = ((Class77_Sub1) super.aClass77Array3[local38]).aClass116_2;
			local47.anInt2771 = -super.anInt4514 + super.anInt4523;
			local47.anInt2776 = super.anInt4502 - super.anInt4519;
			local47.anInt2774 = -super.anInt4514 + super.anInt4528;
			local47.anInt2775 = super.anInt4510 - super.anInt4519;
		}
		@Pc(96) int local96 = super.anInt4519 + super.anInt4529 * super.anInt4514;
		for (@Pc(99) int local99 = super.anInt4514; local99 < super.anInt4523; local99++) {
			for (@Pc(103) int local103 = 0; local103 < super.anInt4503; local103++) {
				((Class77_Sub1) super.aClass77Array3[local103]).aClass116_2.anIntArray323[local99 - super.anInt4514] = local96;
			}
			local96 += super.anInt4529;
		}
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(Ljava/lang/Runnable;)Lclient!hi;")
	@Override
	public Class77 method3922(@OriginalArg(0) Runnable arg0) {
		for (@Pc(7) int local7 = 0; super.anInt4503 > local7; local7++) {
			if (super.aClass77Array3[local7].aRunnable3 == arg0) {
				return super.aClass77Array3[local7];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(IIIZILclient!baa;IIII)V")
	private void method3938(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class4_Sub1_Sub1 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg5 <= 0 || arg7 <= 0) {
			return;
		}
		@Pc(20) int local20 = arg1 << 8;
		@Pc(22) int local22 = 0;
		@Pc(24) int local24 = 0;
		@Pc(33) int local33 = arg4.anInt7876 + arg4.anInt7872 + arg4.anInt7882;
		@Pc(42) int local42 = arg4.anInt7884 + arg4.anInt7887 + arg4.anInt7867;
		@Pc(48) int local48 = (local33 << 16) / arg5;
		@Pc(54) int local54 = (local42 << 16) / arg7;
		@Pc(71) int local71;
		if (arg4.anInt7882 > 0) {
			local71 = (local48 + (arg4.anInt7882 << 16) - 1) / local48;
			local22 = local48 * local71 - (arg4.anInt7882 << 16);
			arg2 += local71;
		}
		if (arg4.anInt7887 > 0) {
			local71 = (local54 + (arg4.anInt7887 << 16) - 1) / local54;
			local24 = local71 * local54 - (arg4.anInt7887 << 16);
			arg8 += local71;
		}
		if (local33 > arg4.anInt7872) {
			arg5 = (local48 + (arg4.anInt7872 << 16) - local22 - 1) / local48;
		}
		if (arg4.anInt7867 < local42) {
			arg7 = (local54 + (arg4.anInt7867 << 16) - local24 - 1) / local54;
		}
		local71 = arg2 + super.anInt4529 * arg8;
		if (arg7 + arg8 > super.anInt4523) {
			arg7 -= arg8 + arg7 - super.anInt4523;
		}
		@Pc(194) int local194 = super.anInt4529 - arg5;
		@Pc(208) int local208;
		if (super.anInt4514 > arg8) {
			local208 = super.anInt4514 - arg8;
			local71 += super.anInt4529 * local208;
			local24 += local208 * local54;
			arg7 -= local208;
		}
		if (arg2 + arg5 > super.anInt4502) {
			local208 = arg2 + arg5 - super.anInt4502;
			local194 += local208;
			arg5 -= local208;
		}
		if (super.anInt4519 > arg2) {
			local208 = super.anInt4519 - arg2;
			arg5 -= local208;
			local194 += local208;
			local71 += local208;
			local22 += local208 * local48;
		}
		@Pc(315) int local315;
		@Pc(321) int local321;
		@Pc(325) int local325;
		@Pc(328) int local328;
		@Pc(337) int local337;
		@Pc(344) int local344;
		@Pc(361) int local361;
		@Pc(374) int local374;
		@Pc(382) int local382;
		@Pc(390) int local390;
		@Pc(652) int local652;
		if (arg0 != 0) {
			@Pc(403) int local403;
			@Pc(407) int local407;
			@Pc(415) int local415;
			if (arg0 == 1) {
				if (arg3 == 1) {
					local208 = local22;
					for (local315 = -arg7; local315 < 0; local315++) {
						local321 = arg4.anInt7872 * (local24 >> 16);
						local24 += local54;
						for (local325 = -arg5; local325 < 0; local325++) {
							if (local20 < this.anIntArray445[local71]) {
								local328 = arg4.anIntArray33[local321 + (local22 >> 16)];
								local337 = local328 >>> 24;
								local344 = 256 - local337;
								local361 = super.anIntArray444[local71];
								super.anIntArray444[local71] = (local344 * (local361 & 0xFF00FF) + local337 * (local328 & 0xFF00FF) >> 8 & 0xFFFF00FF) + (local337 * ((local328 & -16711936) >>> 8) + (local344 * (local361 >>> 8 & 0xFF00FF)) & 0xFF00FF00);
							}
							local22 += local48;
							local71++;
						}
						local22 = local208;
						local71 += local194;
					}
				} else if (arg3 == 0) {
					local208 = local22;
					if ((arg6 & 0xFFFFFF) == 16777215) {
						for (local315 = -arg7; local315 < 0; local315++) {
							local321 = (local24 >> 16) * arg4.anInt7872;
							local24 += local54;
							for (local325 = -arg5; local325 < 0; local325++) {
								if (this.anIntArray445[local71] > local20) {
									local328 = arg4.anIntArray33[local321 + (local22 >> 16)];
									local337 = (arg6 >>> 24) * (local328 >>> 24) >> 8;
									local344 = 256 - local337;
									local361 = super.anIntArray444[local71];
									super.anIntArray444[local71] = ((local328 & 0xFF00) * local337 + (local361 & 0xFF00) * local344 & 0xFF0000) + (local344 * (local361 & 0xFF00FF) + local337 * (local328 & 0xFF00FF) & 0xFF00FF00) >> 8;
								}
								local71++;
								local22 += local48;
							}
							local71 += local194;
							local22 = local208;
						}
					} else {
						local315 = arg6 >> 16 & 0xFF;
						local321 = arg6 >> 8 & 0xFF;
						local325 = arg6 & 0xFF;
						for (local328 = -arg7; local328 < 0; local328++) {
							local337 = arg4.anInt7872 * (local24 >> 16);
							local24 += local54;
							for (local344 = -arg5; local344 < 0; local344++) {
								if (local20 < this.anIntArray445[local71]) {
									local361 = arg4.anIntArray33[local337 + (local22 >> 16)];
									local374 = (local361 >>> 24) * (arg6 >>> 24) >> 8;
									local382 = 256 - local374;
									if (local374 == 255) {
										local390 = (local361 & 0xFF0000) * local315 & 0xFF000000;
										local403 = local321 * (local361 & 0xFF00) & 0xFF0000;
										local407 = local325 * (local361 & 0xFF) & 0xFF00;
										super.anIntArray444[local71] = (local407 | local403 | local390) >>> 8;
									} else {
										local390 = (local361 & 0xFF0000) * local315 & 0xFF000000;
										local403 = local321 * (local361 & 0xFF00) & 0xFF0000;
										local407 = (local361 & 0xFF) * local325 & 0xFF00;
										local361 = (local407 | local403 | local390) >>> 8;
										local415 = super.anIntArray444[local71];
										super.anIntArray444[local71] = ((local361 & 0xFF00) * local374 + local382 * (local415 & 0xFF00) & 0xFF0000) + (local382 * (local415 & 0xFF00FF) + local374 * (local361 & 0xFF00FF) & 0xFF00FF00) >> 8;
									}
								}
								local22 += local48;
								local71++;
							}
							local71 += local194;
							local22 = local208;
						}
					}
				} else if (arg3 == 3) {
					local208 = local22;
					for (local315 = -arg7; local315 < 0; local315++) {
						local321 = (local24 >> 16) * arg4.anInt7872;
						for (local325 = -arg5; local325 < 0; local325++) {
							if (local20 < this.anIntArray445[local71]) {
								local328 = arg4.anIntArray33[local321 + (local22 >> 16)];
								local337 = arg6 + local328;
								local344 = (local328 & 0xFF00FF) + (arg6 & 0xFF00FF);
								local361 = (local344 & 0x1000100) + (local337 - local344 & 0x10000);
								local361 = local337 - local361 | -(local361 >>> 8) + local361;
								local374 = (arg6 >>> 24) * (local361 >>> 24) >> 8;
								local382 = 256 - local374;
								if (local374 != 255) {
									local328 = local361;
									local361 = super.anIntArray444[local71];
									local361 = ((local328 & 0xFF00) * local374 + (local361 & 0xFF00) * local382 & 0xFF0000) + (local374 * (local328 & 0xFF00FF) + (local361 & 0xFF00FF) * local382 & 0xFF00FF00) >> 8;
								}
								super.anIntArray444[local71] = local361;
							}
							local22 += local48;
							local71++;
						}
						local24 += local54;
						local22 = local208;
						local71 += local194;
					}
				} else if (arg3 == 2) {
					local208 = arg6 >>> 24;
					local315 = 256 - local208;
					local321 = local315 * (arg6 & 0xFF00FF) & 0xFF00FF00;
					local325 = local315 * (arg6 & 0xFF00) & 0xFF0000;
					local652 = (local325 | local321) >>> 8;
					local328 = local22;
					for (local337 = -arg7; local337 < 0; local337++) {
						local344 = (local24 >> 16) * arg4.anInt7872;
						for (local361 = -arg5; local361 < 0; local361++) {
							if (local20 < this.anIntArray445[local71]) {
								local374 = arg4.anIntArray33[(local22 >> 16) + local344];
								local382 = local374 >>> 24;
								local321 = local208 * (local374 & 0xFF00FF) & 0xFF00FF00;
								local390 = 256 - local382;
								local325 = (local374 & 0xFF00) * local208 & 0xFF0000;
								local374 = ((local321 | local325) >>> 8) + local652;
								local403 = super.anIntArray444[local71];
								super.anIntArray444[local71] = ((local374 & 0xFF00FF) * local382 + local390 * (local403 & 0xFF00FF) & 0xFF00FF00) + ((local374 & 0xFF00) * local382 + local390 * (local403 & 0xFF00) & 0xFF0000) >> 8;
							}
							local71++;
							local22 += local48;
						}
						local24 += local54;
						local22 = local328;
						local71 += local194;
					}
				} else {
					throw new IllegalArgumentException();
				}
			} else if (arg0 != 2) {
				throw new IllegalArgumentException();
			} else if (arg3 == 1) {
				local208 = local22;
				for (local315 = -arg7; local315 < 0; local315++) {
					local321 = (local24 >> 16) * arg4.anInt7872;
					local24 += local54;
					for (local325 = -arg5; local325 < 0; local325++) {
						if (local20 < this.anIntArray445[local71]) {
							local328 = arg4.anIntArray33[(local22 >> 16) + local321];
							if (local328 != 0) {
								local337 = super.anIntArray444[local71];
								local344 = local328 + local337;
								local361 = (local328 & 0xFF00FF) + (local337 & 0xFF00FF);
								local337 = (local344 - local361 & 0x10000) + (local361 & 0x1000100);
								super.anIntArray444[local71] = local337 - (local337 >>> 8) | -local337 + local344;
							}
						}
						local71++;
						local22 += local48;
					}
					local71 += local194;
					local22 = local208;
				}
			} else if (arg3 == 0) {
				local208 = local22;
				local315 = arg6 >> 16 & 0xFF;
				local321 = arg6 >> 8 & 0xFF;
				local325 = arg6 & 0xFF;
				for (local328 = -arg7; local328 < 0; local328++) {
					local337 = arg4.anInt7872 * (local24 >> 16);
					local24 += local54;
					for (local344 = -arg5; local344 < 0; local344++) {
						if (local20 < this.anIntArray445[local71]) {
							local361 = arg4.anIntArray33[local337 + (local22 >> 16)];
							if (local361 != 0) {
								local374 = (local361 & 0xFF0000) * local315 & 0xFF000000;
								local382 = local321 * (local361 & 0xFF00) & 0xFF0000;
								local390 = local325 * (local361 & 0xFF) & 0xFF00;
								local361 = (local390 | local374 | local382) >>> 8;
								local403 = super.anIntArray444[local71];
								local407 = local361 + local403;
								local415 = (local403 & 0xFF00FF) + (local361 & 0xFF00FF);
								local403 = (local407 - local415 & 0x10000) + (local415 & 0x1000100);
								super.anIntArray444[local71] = local407 - local403 | -(local403 >>> 8) + local403;
							}
						}
						local22 += local48;
						local71++;
					}
					local22 = local208;
					local71 += local194;
				}
			} else if (arg3 == 3) {
				local208 = local22;
				for (local315 = -arg7; local315 < 0; local315++) {
					local321 = (local24 >> 16) * arg4.anInt7872;
					for (local325 = -arg5; local325 < 0; local325++) {
						if (local20 < this.anIntArray445[local71]) {
							local328 = arg4.anIntArray33[(local22 >> 16) + local321];
							local337 = local328 + arg6;
							local344 = (arg6 & 0xFF00FF) + (local328 & 0xFF00FF);
							local361 = (local344 & 0x1000100) + (local337 - local344 & 0x10000);
							local328 = local361 - (local361 >>> 8) | -local361 + local337;
							local361 = super.anIntArray444[local71];
							local337 = local361 + local328;
							local344 = (local328 & 0xFF00FF) + (local361 & 0xFF00FF);
							local361 = (local344 & 0x1000100) + (local337 - local344 & 0x10000);
							super.anIntArray444[local71] = local361 - (local361 >>> 8) | -local361 + local337;
						}
						local71++;
						local22 += local48;
					}
					local24 += local54;
					local22 = local208;
					local71 += local194;
				}
			} else if (arg3 == 2) {
				local208 = arg6 >>> 24;
				local315 = 256 - local208;
				local321 = (arg6 & 0xFF00FF) * local315 & 0xFF00FF00;
				local325 = local315 * (arg6 & 0xFF00) & 0xFF0000;
				local652 = (local321 | local325) >>> 8;
				local328 = local22;
				for (local337 = -arg7; local337 < 0; local337++) {
					local344 = (local24 >> 16) * arg4.anInt7872;
					local24 += local54;
					for (local361 = -arg5; local361 < 0; local361++) {
						if (this.anIntArray445[local71] > local20) {
							local374 = arg4.anIntArray33[local344 + (local22 >> 16)];
							if (local374 != 0) {
								local325 = local208 * (local374 & 0xFF00) & 0xFF0000;
								local321 = (local374 & 0xFF00FF) * local208 & 0xFF00FF00;
								local374 = ((local325 | local321) >>> 8) + local652;
								local382 = super.anIntArray444[local71];
								local390 = local382 + local374;
								local403 = (local374 & 0xFF00FF) + (local382 & 0xFF00FF);
								local382 = (local403 & 0x1000100) + (local390 - local403 & 0x10000);
								super.anIntArray444[local71] = local390 - local382 | -(local382 >>> 8) + local382;
							}
						}
						local71++;
						local22 += local48;
					}
					local22 = local328;
					local71 += local194;
				}
			} else {
				throw new IllegalArgumentException();
			}
		} else if (arg3 == 1) {
			local208 = local22;
			for (local315 = -arg7; local315 < 0; local315++) {
				local321 = arg4.anInt7872 * (local24 >> 16);
				local24 += local54;
				for (local325 = -arg5; local325 < 0; local325++) {
					if (this.anIntArray445[local71] > local20) {
						super.anIntArray444[local71] = arg4.anIntArray33[local321 + (local22 >> 16)];
					}
					local22 += local48;
					local71++;
				}
				local71 += local194;
				local22 = local208;
			}
		} else if (arg3 == 0) {
			local208 = arg6 >> 16 & 0xFF;
			local315 = arg6 >> 8 & 0xFF;
			local321 = arg6 & 0xFF;
			local325 = local22;
			for (local328 = -arg7; local328 < 0; local328++) {
				local337 = (local24 >> 16) * arg4.anInt7872;
				local24 += local54;
				for (local344 = -arg5; local344 < 0; local344++) {
					if (local20 < this.anIntArray445[local71]) {
						local361 = arg4.anIntArray33[local337 + (local22 >> 16)];
						local374 = local208 * (local361 & 0xFF0000) & 0xFF000000;
						local382 = local315 * (local361 & 0xFF00) & 0xFF0000;
						local390 = (local361 & 0xFF) * local321 & 0xFF00;
						super.anIntArray444[local71] = (local374 | local382 | local390) >>> 8;
					}
					local71++;
					local22 += local48;
				}
				local71 += local194;
				local22 = local325;
			}
		} else if (arg3 == 3) {
			local208 = local22;
			for (local315 = -arg7; local315 < 0; local315++) {
				local321 = (local24 >> 16) * arg4.anInt7872;
				for (local325 = -arg5; local325 < 0; local325++) {
					if (local20 < this.anIntArray445[local71]) {
						local328 = arg4.anIntArray33[local321 + (local22 >> 16)];
						local337 = arg6 + local328;
						local344 = (arg6 & 0xFF00FF) + (local328 & 0xFF00FF);
						local361 = (local337 - local344 & 0x10000) + (local344 & 0x1000100);
						super.anIntArray444[local71] = local337 - local361 | local361 - (local361 >>> 8);
					}
					local71++;
					local22 += local48;
				}
				local24 += local54;
				local22 = local208;
				local71 += local194;
			}
		} else if (arg3 == 2) {
			local208 = arg6 >>> 24;
			local315 = 256 - local208;
			local321 = local315 * (arg6 & 0xFF00FF) & 0xFF00FF00;
			local325 = local315 * (arg6 & 0xFF00) & 0xFF0000;
			local652 = (local321 | local325) >>> 8;
			local328 = local22;
			for (local337 = -arg7; local337 < 0; local337++) {
				local344 = (local24 >> 16) * arg4.anInt7872;
				local24 += local54;
				for (local361 = -arg5; local361 < 0; local361++) {
					if (local20 < this.anIntArray445[local71]) {
						local374 = arg4.anIntArray33[(local22 >> 16) + local344];
						local321 = (local374 & 0xFF00FF) * local208 & 0xFF00FF00;
						local325 = (local374 & 0xFF00) * local208 & 0xFF0000;
						super.anIntArray444[local71] = ((local325 | local321) >>> 8) + local652;
					}
					local22 += local48;
					local71++;
				}
				local71 += local194;
				local22 = local328;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!kv", name = "w", descriptor = "()Z")
	@Override
	public boolean method7142() {
		return true;
	}
}

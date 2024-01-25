import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!su")
public final class Class310 {

	@OriginalMember(owner = "client!su", name = "k", descriptor = "Lclient!gv;")
	private Class131 aClass131_10;

	@OriginalMember(owner = "client!su", name = "l", descriptor = "Lclient!gv;")
	private Class131 aClass131_11;

	@OriginalMember(owner = "client!su", name = "m", descriptor = "Lclient!nl;")
	private Interface18 anInterface18_6;

	@OriginalMember(owner = "client!su", name = "o", descriptor = "Lclient!gv;")
	private Class131 aClass131_12;

	@OriginalMember(owner = "client!su", name = "g", descriptor = "[F")
	private final float[] aFloatArray65 = new float[16];

	@OriginalMember(owner = "client!su", name = "b", descriptor = "Lclient!fw;")
	private final Class2_Sub15_Sub1 aClass2_Sub15_Sub1_3 = new Class2_Sub15_Sub1(786336);

	@OriginalMember(owner = "client!su", name = "n", descriptor = "I")
	private final int anInt8340 = Static233.method3626(1600);

	@OriginalMember(owner = "client!su", name = "p", descriptor = "[I")
	private final int[] anIntArray595 = new int[64];

	@OriginalMember(owner = "client!su", name = "r", descriptor = "[I")
	private final int[] anIntArray597 = new int[8191];

	@OriginalMember(owner = "client!su", name = "s", descriptor = "[[Lclient!mm;")
	private final Class6_Sub3_Sub1[][] aClass6_Sub3_Sub1ArrayArray1 = new Class6_Sub3_Sub1[1600][64];

	@OriginalMember(owner = "client!su", name = "t", descriptor = "[[Lclient!mm;")
	private final Class6_Sub3_Sub1[][] aClass6_Sub3_Sub1ArrayArray2 = new Class6_Sub3_Sub1[64][768];

	@OriginalMember(owner = "client!su", name = "u", descriptor = "I")
	private int anInt8341 = 0;

	@OriginalMember(owner = "client!su", name = "q", descriptor = "[I")
	private final int[] anIntArray596 = new int[1600];

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(IILclient!qj;)V")
	private void method6917(@OriginalArg(1) int arg0, @OriginalArg(2) Class100_Sub3 arg1) {
		OpenGL.glGetFloatv(2982, this.aFloatArray65, 0);
		@Pc(15) float local15 = this.aFloatArray65[0];
		@Pc(20) float local20 = this.aFloatArray65[4];
		@Pc(32) float local32 = this.aFloatArray65[8];
		@Pc(37) float local37 = this.aFloatArray65[1];
		@Pc(42) float local42 = this.aFloatArray65[5];
		@Pc(47) float local47 = this.aFloatArray65[9];
		@Pc(51) float local51 = local37 + local15;
		@Pc(55) float local55 = local42 + local20;
		@Pc(59) float local59 = local47 + local32;
		@Pc(63) float local63 = local15 - local37;
		@Pc(67) float local67 = local20 - local42;
		@Pc(71) float local71 = local32 - local47;
		@Pc(75) float local75 = local37 - local15;
		@Pc(80) float local80 = local42 - local20;
		this.aClass2_Sub15_Sub1_3.anInt5241 = 0;
		@Pc(88) float local88 = local47 - local32;
		@Pc(95) int local95;
		@Pc(110) int local110;
		@Pc(119) int local119;
		@Pc(128) Class6_Sub3_Sub1 local128;
		@Pc(131) int local131;
		@Pc(136) byte local136;
		@Pc(141) byte local141;
		@Pc(144) byte local144;
		@Pc(149) byte local149;
		@Pc(155) float local155;
		@Pc(161) float local161;
		@Pc(167) float local167;
		@Pc(172) int local172;
		@Pc(488) float local488;
		@Pc(493) int local493;
		@Pc(433) int local433;
		@Pc(449) Class6_Sub3_Sub1 local449;
		@Pc(452) int local452;
		@Pc(465) byte local465;
		@Pc(470) byte local470;
		@Pc(482) float local482;
		if (arg1.aBoolean595) {
			for (local95 = arg0 - 1; local95 >= 0; local95--) {
				local110 = this.anIntArray596[local95] > 64 ? 64 : this.anIntArray596[local95];
				if (local110 > 0) {
					for (local119 = local110 - 1; local119 >= 0; local119--) {
						local128 = this.aClass6_Sub3_Sub1ArrayArray1[local95][local119];
						local131 = local128.anInt2915;
						local136 = (byte) (local131 >> 16);
						local141 = (byte) (local131 >> 8);
						local144 = (byte) local131;
						local149 = (byte) (local131 >>> 24);
						local155 = local128.anInt2921 >> 12;
						local161 = local128.anInt2919 >> 12;
						local167 = local128.anInt2917 >> 12;
						local172 = local128.anInt2914 >> 12;
						this.aClass2_Sub15_Sub1_3.method2575(0.0F);
						this.aClass2_Sub15_Sub1_3.method2575(0.0F);
						this.aClass2_Sub15_Sub1_3.method2575((float) -local172 * local51 + local155);
						this.aClass2_Sub15_Sub1_3.method2575(local161 + local55 * (float) -local172);
						this.aClass2_Sub15_Sub1_3.method2575(local167 + (float) -local172 * local59);
						this.aClass2_Sub15_Sub1_3.method4333(local136);
						this.aClass2_Sub15_Sub1_3.method4333(local141);
						this.aClass2_Sub15_Sub1_3.method4333(local144);
						this.aClass2_Sub15_Sub1_3.method4333(local149);
						this.aClass2_Sub15_Sub1_3.method2575(1.0F);
						this.aClass2_Sub15_Sub1_3.method2575(0.0F);
						this.aClass2_Sub15_Sub1_3.method2575(local63 * (float) local172 + local155);
						this.aClass2_Sub15_Sub1_3.method2575(local67 * (float) local172 + local161);
						this.aClass2_Sub15_Sub1_3.method2575(local71 * (float) local172 + local167);
						this.aClass2_Sub15_Sub1_3.method4333(local136);
						this.aClass2_Sub15_Sub1_3.method4333(local141);
						this.aClass2_Sub15_Sub1_3.method4333(local144);
						this.aClass2_Sub15_Sub1_3.method4333(local149);
						this.aClass2_Sub15_Sub1_3.method2575(1.0F);
						this.aClass2_Sub15_Sub1_3.method2575(1.0F);
						this.aClass2_Sub15_Sub1_3.method2575(local155 + local51 * (float) local172);
						this.aClass2_Sub15_Sub1_3.method2575(local161 + (float) local172 * local55);
						this.aClass2_Sub15_Sub1_3.method2575(local59 * (float) local172 + local167);
						this.aClass2_Sub15_Sub1_3.method4333(local136);
						this.aClass2_Sub15_Sub1_3.method4333(local141);
						this.aClass2_Sub15_Sub1_3.method4333(local144);
						this.aClass2_Sub15_Sub1_3.method4333(local149);
						this.aClass2_Sub15_Sub1_3.method2575(0.0F);
						this.aClass2_Sub15_Sub1_3.method2575(1.0F);
						this.aClass2_Sub15_Sub1_3.method2575((float) local172 * local75 + local155);
						this.aClass2_Sub15_Sub1_3.method2575(local80 * (float) local172 + local161);
						this.aClass2_Sub15_Sub1_3.method2575(local167 + local88 * (float) local172);
						this.aClass2_Sub15_Sub1_3.method4333(local136);
						this.aClass2_Sub15_Sub1_3.method4333(local141);
						this.aClass2_Sub15_Sub1_3.method4333(local144);
						this.aClass2_Sub15_Sub1_3.method4333(local149);
					}
					if (this.anIntArray596[local95] > 64) {
						local433 = this.anIntArray596[local95] - 64 - 1;
						for (local131 = this.anIntArray595[local433] - 1; local131 >= 0; local131--) {
							local449 = this.aClass6_Sub3_Sub1ArrayArray2[local433][local131];
							local452 = local449.anInt2915;
							local144 = (byte) (local452 >> 16);
							local149 = (byte) (local452 >> 8);
							local465 = (byte) local452;
							local470 = (byte) (local452 >>> 24);
							local167 = local449.anInt2921 >> 12;
							local482 = local449.anInt2919 >> 12;
							local488 = local449.anInt2917 >> 12;
							local493 = local449.anInt2914 >> 12;
							this.aClass2_Sub15_Sub1_3.method2575(0.0F);
							this.aClass2_Sub15_Sub1_3.method2575(0.0F);
							this.aClass2_Sub15_Sub1_3.method2575(local167 + (float) -local493 * local51);
							this.aClass2_Sub15_Sub1_3.method2575((float) -local493 * local55 + local482);
							this.aClass2_Sub15_Sub1_3.method2575(local59 * (float) -local493 + local488);
							this.aClass2_Sub15_Sub1_3.method4333(local144);
							this.aClass2_Sub15_Sub1_3.method4333(local149);
							this.aClass2_Sub15_Sub1_3.method4333(local465);
							this.aClass2_Sub15_Sub1_3.method4333(local470);
							this.aClass2_Sub15_Sub1_3.method2575(1.0F);
							this.aClass2_Sub15_Sub1_3.method2575(0.0F);
							this.aClass2_Sub15_Sub1_3.method2575(local63 * (float) local493 + local167);
							this.aClass2_Sub15_Sub1_3.method2575(local482 + (float) local493 * local67);
							this.aClass2_Sub15_Sub1_3.method2575(local71 * (float) local493 + local488);
							this.aClass2_Sub15_Sub1_3.method4333(local144);
							this.aClass2_Sub15_Sub1_3.method4333(local149);
							this.aClass2_Sub15_Sub1_3.method4333(local465);
							this.aClass2_Sub15_Sub1_3.method4333(local470);
							this.aClass2_Sub15_Sub1_3.method2575(1.0F);
							this.aClass2_Sub15_Sub1_3.method2575(1.0F);
							this.aClass2_Sub15_Sub1_3.method2575(local167 + local51 * (float) local493);
							this.aClass2_Sub15_Sub1_3.method2575(local482 + local55 * (float) local493);
							this.aClass2_Sub15_Sub1_3.method2575((float) local493 * local59 + local488);
							this.aClass2_Sub15_Sub1_3.method4333(local144);
							this.aClass2_Sub15_Sub1_3.method4333(local149);
							this.aClass2_Sub15_Sub1_3.method4333(local465);
							this.aClass2_Sub15_Sub1_3.method4333(local470);
							this.aClass2_Sub15_Sub1_3.method2575(0.0F);
							this.aClass2_Sub15_Sub1_3.method2575(1.0F);
							this.aClass2_Sub15_Sub1_3.method2575((float) local493 * local75 + local167);
							this.aClass2_Sub15_Sub1_3.method2575((float) local493 * local80 + local482);
							this.aClass2_Sub15_Sub1_3.method2575(local488 + (float) local493 * local88);
							this.aClass2_Sub15_Sub1_3.method4333(local144);
							this.aClass2_Sub15_Sub1_3.method4333(local149);
							this.aClass2_Sub15_Sub1_3.method4333(local465);
							this.aClass2_Sub15_Sub1_3.method4333(local470);
						}
					}
				}
			}
		} else {
			for (local95 = arg0 - 1; local95 >= 0; local95--) {
				local110 = this.anIntArray596[local95] > 64 ? 64 : this.anIntArray596[local95];
				if (local110 > 0) {
					for (local119 = local110 - 1; local119 >= 0; local119--) {
						local128 = this.aClass6_Sub3_Sub1ArrayArray1[local95][local119];
						local131 = local128.anInt2915;
						local136 = (byte) (local131 >> 16);
						local141 = (byte) (local131 >> 8);
						local144 = (byte) local131;
						local149 = (byte) (local131 >>> 24);
						local155 = local128.anInt2921 >> 12;
						local161 = local128.anInt2919 >> 12;
						local167 = local128.anInt2917 >> 12;
						local172 = local128.anInt2914 >> 12;
						this.aClass2_Sub15_Sub1_3.method2573(0.0F);
						this.aClass2_Sub15_Sub1_3.method2573(0.0F);
						this.aClass2_Sub15_Sub1_3.method2573((float) -local172 * local51 + local155);
						this.aClass2_Sub15_Sub1_3.method2573(local161 + local55 * (float) -local172);
						this.aClass2_Sub15_Sub1_3.method2573(local167 + (float) -local172 * local59);
						this.aClass2_Sub15_Sub1_3.method4333(local136);
						this.aClass2_Sub15_Sub1_3.method4333(local141);
						this.aClass2_Sub15_Sub1_3.method4333(local144);
						this.aClass2_Sub15_Sub1_3.method4333(local149);
						this.aClass2_Sub15_Sub1_3.method2573(1.0F);
						this.aClass2_Sub15_Sub1_3.method2573(0.0F);
						this.aClass2_Sub15_Sub1_3.method2573((float) local172 * local63 + local155);
						this.aClass2_Sub15_Sub1_3.method2573(local67 * (float) local172 + local161);
						this.aClass2_Sub15_Sub1_3.method2573(local167 + (float) local172 * local71);
						this.aClass2_Sub15_Sub1_3.method4333(local136);
						this.aClass2_Sub15_Sub1_3.method4333(local141);
						this.aClass2_Sub15_Sub1_3.method4333(local144);
						this.aClass2_Sub15_Sub1_3.method4333(local149);
						this.aClass2_Sub15_Sub1_3.method2573(1.0F);
						this.aClass2_Sub15_Sub1_3.method2573(1.0F);
						this.aClass2_Sub15_Sub1_3.method2573(local155 + (float) local172 * local51);
						this.aClass2_Sub15_Sub1_3.method2573(local161 + (float) local172 * local55);
						this.aClass2_Sub15_Sub1_3.method2573(local167 + local59 * (float) local172);
						this.aClass2_Sub15_Sub1_3.method4333(local136);
						this.aClass2_Sub15_Sub1_3.method4333(local141);
						this.aClass2_Sub15_Sub1_3.method4333(local144);
						this.aClass2_Sub15_Sub1_3.method4333(local149);
						this.aClass2_Sub15_Sub1_3.method2573(0.0F);
						this.aClass2_Sub15_Sub1_3.method2573(1.0F);
						this.aClass2_Sub15_Sub1_3.method2573((float) local172 * local75 + local155);
						this.aClass2_Sub15_Sub1_3.method2573(local161 + local80 * (float) local172);
						this.aClass2_Sub15_Sub1_3.method2573(local88 * (float) local172 + local167);
						this.aClass2_Sub15_Sub1_3.method4333(local136);
						this.aClass2_Sub15_Sub1_3.method4333(local141);
						this.aClass2_Sub15_Sub1_3.method4333(local144);
						this.aClass2_Sub15_Sub1_3.method4333(local149);
					}
					if (this.anIntArray596[local95] > 64) {
						local433 = this.anIntArray596[local95] - 65;
						for (local131 = this.anIntArray595[local433] - 1; local131 >= 0; local131--) {
							local449 = this.aClass6_Sub3_Sub1ArrayArray2[local433][local131];
							local452 = local449.anInt2915;
							local144 = (byte) (local452 >> 16);
							local149 = (byte) (local452 >> 8);
							local465 = (byte) local452;
							local470 = (byte) (local452 >>> 24);
							local167 = local449.anInt2921 >> 12;
							local482 = local449.anInt2919 >> 12;
							local488 = local449.anInt2917 >> 12;
							local493 = local449.anInt2914 >> 12;
							this.aClass2_Sub15_Sub1_3.method2573(0.0F);
							this.aClass2_Sub15_Sub1_3.method2573(0.0F);
							this.aClass2_Sub15_Sub1_3.method2573((float) -local493 * local51 + local167);
							this.aClass2_Sub15_Sub1_3.method2573((float) -local493 * local55 + local482);
							this.aClass2_Sub15_Sub1_3.method2573((float) -local493 * local59 + local488);
							this.aClass2_Sub15_Sub1_3.method4333(local144);
							this.aClass2_Sub15_Sub1_3.method4333(local149);
							this.aClass2_Sub15_Sub1_3.method4333(local465);
							this.aClass2_Sub15_Sub1_3.method4333(local470);
							this.aClass2_Sub15_Sub1_3.method2573(1.0F);
							this.aClass2_Sub15_Sub1_3.method2573(0.0F);
							this.aClass2_Sub15_Sub1_3.method2573(local167 + (float) local493 * local63);
							this.aClass2_Sub15_Sub1_3.method2573((float) local493 * local67 + local482);
							this.aClass2_Sub15_Sub1_3.method2573(local488 + local71 * (float) local493);
							this.aClass2_Sub15_Sub1_3.method4333(local144);
							this.aClass2_Sub15_Sub1_3.method4333(local149);
							this.aClass2_Sub15_Sub1_3.method4333(local465);
							this.aClass2_Sub15_Sub1_3.method4333(local470);
							this.aClass2_Sub15_Sub1_3.method2573(1.0F);
							this.aClass2_Sub15_Sub1_3.method2573(1.0F);
							this.aClass2_Sub15_Sub1_3.method2573(local167 + (float) local493 * local51);
							this.aClass2_Sub15_Sub1_3.method2573(local55 * (float) local493 + local482);
							this.aClass2_Sub15_Sub1_3.method2573(local59 * (float) local493 + local488);
							this.aClass2_Sub15_Sub1_3.method4333(local144);
							this.aClass2_Sub15_Sub1_3.method4333(local149);
							this.aClass2_Sub15_Sub1_3.method4333(local465);
							this.aClass2_Sub15_Sub1_3.method4333(local470);
							this.aClass2_Sub15_Sub1_3.method2573(0.0F);
							this.aClass2_Sub15_Sub1_3.method2573(1.0F);
							this.aClass2_Sub15_Sub1_3.method2573((float) local493 * local75 + local167);
							this.aClass2_Sub15_Sub1_3.method2573(local482 + (float) local493 * local80);
							this.aClass2_Sub15_Sub1_3.method2573((float) local493 * local88 + local488);
							this.aClass2_Sub15_Sub1_3.method4333(local144);
							this.aClass2_Sub15_Sub1_3.method4333(local149);
							this.aClass2_Sub15_Sub1_3.method4333(local465);
							this.aClass2_Sub15_Sub1_3.method4333(local470);
						}
					}
				}
			}
		}
		if (this.aClass2_Sub15_Sub1_3.anInt5241 != 0) {
			this.anInterface18_6.method3532(this.aClass2_Sub15_Sub1_3.aByteArray62, this.aClass2_Sub15_Sub1_3.anInt5241, 24);
			arg1.method6302(this.aClass131_10, this.aClass131_11, this.aClass131_12, null);
			arg1.method6321(this.aClass2_Sub15_Sub1_3.anInt5241 / 24);
		}
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(Lclient!qj;I)V")
	private void method6918(@OriginalArg(0) Class100_Sub3 arg0) {
		arg0.method6270(true);
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		if (arg0.aFloat223 != Static304.aFloat149) {
			arg0.ra(Static304.aFloat149);
		}
	}

	@OriginalMember(owner = "client!su", name = "b", descriptor = "(IILclient!qj;)V")
	private void method6919(@OriginalArg(1) int arg0, @OriginalArg(2) Class100_Sub3 arg1) {
		Static304.aFloat149 = arg1.aFloat223;
		arg1.method6294((float) arg0);
		arg1.method6267();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		arg1.method6270(false);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(Lclient!qj;B)V")
	private void method6921(@OriginalArg(0) Class100_Sub3 arg0) {
		Static304.aFloat149 = arg0.aFloat223;
		arg0.method6305();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		arg0.method6270(false);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(BLclient!qj;)V")
	public void method6922(@OriginalArg(1) Class100_Sub3 arg0) {
		this.anInterface18_6 = arg0.method6341(null, 196584, true, 24);
		this.aClass131_12 = new Class131(this.anInterface18_6, 5126, 2, 0);
		this.aClass131_10 = new Class131(this.anInterface18_6, 5126, 3, 8);
		this.aClass131_11 = new Class131(this.anInterface18_6, 5121, 4, 20);
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(ZLclient!ir;Lclient!qj;I)V")
	public void method6923(@OriginalArg(1) Class164 arg0, @OriginalArg(2) Class100_Sub3 arg1, @OriginalArg(3) int arg2) {
		if (arg1.aClass68_Sub1_3 == null) {
			return;
		}
		if (arg2 >= 0) {
			this.method6919(arg2, arg1);
		} else {
			this.method6921(arg1);
		}
		@Pc(26) float local26 = arg1.aClass68_Sub1_3.aFloat38;
		@Pc(30) float local30 = arg1.aClass68_Sub1_3.aFloat33;
		@Pc(34) float local34 = arg1.aClass68_Sub1_3.aFloat44;
		@Pc(44) float local44 = arg1.aClass68_Sub1_3.aFloat35;
		try {
			@Pc(46) int local46 = 0;
			@Pc(48) int local48 = Integer.MAX_VALUE;
			@Pc(50) int local50 = 0;
			@Pc(54) Class6_Sub3 local54 = arg0.aClass234_1.aClass6_Sub3_7;
			@Pc(57) Class6_Sub3 local57;
			@Pc(89) int local89;
			for (local57 = local54.aClass6_Sub3_10; local57 != local54; local57 = local57.aClass6_Sub3_10) {
				@Pc(62) Class6_Sub3_Sub1 local62 = (Class6_Sub3_Sub1) local57;
				local89 = (int) (local44 + local34 * (float) (local62.anInt2917 >> 12) + local26 * (float) (local62.anInt2921 >> 12) + local30 * (float) (local62.anInt2919 >> 12));
				if (local50 < local89) {
					local50 = local89;
				}
				this.anIntArray597[local46++] = local89;
				if (local89 < local48) {
					local48 = local89;
				}
			}
			@Pc(116) int local116 = local50 - local48;
			if (local116 + 2 <= 1600) {
				local116 += 2;
				local89 = 0;
			} else {
				local89 = Static233.method3626(local116) + 1 - this.anInt8340;
				local116 = (local116 >> local89) + 2;
			}
			local57 = local54.aClass6_Sub3_10;
			local46 = 0;
			@Pc(151) int local151 = -2;
			@Pc(153) boolean local153 = true;
			@Pc(155) boolean local155 = true;
			while (local54 != local57) {
				this.anInt8341 = 0;
				for (@Pc(162) int local162 = 0; local162 < local116; local162++) {
					this.anIntArray596[local162] = 0;
				}
				for (@Pc(179) int local179 = 0; local179 < 64; local179++) {
					this.anIntArray595[local179] = 0;
				}
				while (local57 != local54) {
					@Pc(195) Class6_Sub3_Sub1 local195 = (Class6_Sub3_Sub1) local57;
					if (local155) {
						local151 = local195.anInt2924;
						local153 = local195.aBoolean238;
						local155 = false;
					}
					if (local46 > 0 && (local151 != local195.anInt2924 || local153 != local195.aBoolean238)) {
						local155 = true;
						break;
					}
					@Pc(237) int local237 = this.anIntArray597[local46++] - local48 >> local89;
					if (local237 < 1600) {
						if (this.anIntArray596[local237] >= 64) {
							label101: {
								if (this.anIntArray596[local237] == 64) {
									if (this.anInt8341 == 64) {
										break label101;
									}
									this.anIntArray596[local237] += this.anInt8341++ + 1;
								}
								@Pc(286) Class6_Sub3_Sub1[] local286 = this.aClass6_Sub3_Sub1ArrayArray2[this.anIntArray596[local237] - 65];
								@Pc(294) int local294 = this.anIntArray596[local237] - 65;
								@Pc(296) int local296 = this.anIntArray595[this.anIntArray596[local237] - 65];
								this.anIntArray595[local294] = this.anIntArray595[this.anIntArray596[local237] - 65] + 1;
								local286[local296] = local195;
							}
						} else {
							this.aClass6_Sub3_Sub1ArrayArray1[local237][this.anIntArray596[local237]++] = local195;
						}
					}
					local57 = local57.aClass6_Sub3_10;
				}
				if (local151 < 0) {
					arg1.method6278(-1);
				} else {
					arg1.method6278(local151);
				}
				if (local153 && Static304.aFloat149 != arg1.aFloat223) {
					arg1.ra(Static304.aFloat149);
				} else if (arg1.aFloat223 != 1.0F) {
					arg1.ra(1.0F);
				}
				this.method6917(local116, arg1);
			}
		} catch (@Pc(367) Exception local367) {
		}
		this.method6918(arg1);
	}
}

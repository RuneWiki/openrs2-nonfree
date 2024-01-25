import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uw")
public final class Class354 {

	@OriginalMember(owner = "client!uw", name = "n", descriptor = "Lclient!eca;")
	private Class82 aClass82_14;

	@OriginalMember(owner = "client!uw", name = "o", descriptor = "Lclient!eca;")
	private Class82 aClass82_15;

	@OriginalMember(owner = "client!uw", name = "p", descriptor = "Lclient!hu;")
	private Interface12 anInterface12_7;

	@OriginalMember(owner = "client!uw", name = "q", descriptor = "Lclient!eca;")
	private Class82 aClass82_16;

	@OriginalMember(owner = "client!uw", name = "c", descriptor = "[F")
	private final float[] aFloatArray80 = new float[16];

	@OriginalMember(owner = "client!uw", name = "i", descriptor = "Lclient!jga;")
	private final Class2_Sub22_Sub1 aClass2_Sub22_Sub1_3 = new Class2_Sub22_Sub1(786336);

	@OriginalMember(owner = "client!uw", name = "l", descriptor = "I")
	private final int anInt9577 = Static418.method5598(1600);

	@OriginalMember(owner = "client!uw", name = "r", descriptor = "I")
	private int anInt9578 = 0;

	@OriginalMember(owner = "client!uw", name = "s", descriptor = "[[Lclient!sm;")
	private final Class13_Sub3_Sub2[][] aClass13_Sub3_Sub2ArrayArray3 = new Class13_Sub3_Sub2[1600][64];

	@OriginalMember(owner = "client!uw", name = "t", descriptor = "[I")
	private final int[] anIntArray655 = new int[8191];

	@OriginalMember(owner = "client!uw", name = "w", descriptor = "[I")
	private final int[] anIntArray657 = new int[1600];

	@OriginalMember(owner = "client!uw", name = "u", descriptor = "[[Lclient!sm;")
	private final Class13_Sub3_Sub2[][] aClass13_Sub3_Sub2ArrayArray4 = new Class13_Sub3_Sub2[64][768];

	@OriginalMember(owner = "client!uw", name = "v", descriptor = "[I")
	private final int[] anIntArray656 = new int[64];

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(Lclient!ep;I)V")
	private void method8012(@OriginalArg(0) Class95_Sub1 arg0) {
		Static465.aFloat148 = arg0.aFloat36;
		arg0.method2060();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		arg0.method2096(false);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(IBLclient!ep;)V")
	private void method8014(@OriginalArg(0) int arg0, @OriginalArg(2) Class95_Sub1 arg1) {
		Static465.aFloat148 = arg1.aFloat36;
		arg1.method2040((float) arg0);
		arg1.method2063();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		arg1.method2096(false);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(IILclient!ep;Lclient!ev;)V")
	public void method8015(@OriginalArg(1) int arg0, @OriginalArg(2) Class95_Sub1 arg1, @OriginalArg(3) Class98 arg2) {
		if (arg1.aClass177_Sub3_3 == null) {
			return;
		}
		if (arg0 >= 0) {
			this.method8014(arg0, arg1);
		} else {
			this.method8012(arg1);
		}
		@Pc(29) float local29 = arg1.aClass177_Sub3_3.aFloat203;
		@Pc(33) float local33 = arg1.aClass177_Sub3_3.aFloat204;
		@Pc(37) float local37 = arg1.aClass177_Sub3_3.aFloat201;
		@Pc(41) float local41 = arg1.aClass177_Sub3_3.aFloat202;
		try {
			@Pc(43) int local43 = 0;
			@Pc(45) int local45 = Integer.MAX_VALUE;
			@Pc(47) int local47 = 0;
			@Pc(51) Class13_Sub3 local51 = arg2.aClass220_1.aClass13_Sub3_5;
			@Pc(62) Class13_Sub3 local62;
			@Pc(94) int local94;
			for (local62 = local51.aClass13_Sub3_9; local62 != local51; local62 = local62.aClass13_Sub3_9) {
				@Pc(67) Class13_Sub3_Sub2 local67 = (Class13_Sub3_Sub2) local62;
				local94 = (int) ((float) (local67.anInt5954 >> 12) * local37 + local33 * (float) (local67.anInt5959 >> 12) + (float) (local67.anInt5953 >> 12) * local29 + local41);
				this.anIntArray655[local43++] = local94;
				if (local47 < local94) {
					local47 = local94;
				}
				if (local45 > local94) {
					local45 = local94;
				}
			}
			@Pc(125) int local125 = local47 - local45;
			if (local125 + 2 <= 1600) {
				local125 += 2;
				local94 = 0;
			} else {
				local94 = Static418.method5598(local125) + 1 - this.anInt9577;
				local125 = (local125 >> local94) + 2;
			}
			local43 = 0;
			local62 = local51.aClass13_Sub3_9;
			@Pc(157) int local157 = -2;
			@Pc(159) boolean local159 = true;
			@Pc(161) boolean local161 = true;
			while (local62 != local51) {
				this.anInt9578 = 0;
				for (@Pc(168) int local168 = 0; local168 < local125; local168++) {
					this.anIntArray657[local168] = 0;
				}
				for (@Pc(181) int local181 = 0; local181 < 64; local181++) {
					this.anIntArray656[local181] = 0;
				}
				while (local51 != local62) {
					@Pc(199) Class13_Sub3_Sub2 local199 = (Class13_Sub3_Sub2) local62;
					if (local161) {
						local159 = local199.aBoolean432;
						local157 = local199.anInt5952;
						local161 = false;
					}
					if (local43 > 0 && (local157 != local199.anInt5952 || local199.aBoolean432 != local159)) {
						local161 = true;
						break;
					}
					@Pc(241) int local241 = this.anIntArray655[local43++] - local45 >> local94;
					if (local241 < 1600) {
						if (this.anIntArray657[local241] >= 64) {
							label101: {
								if (this.anIntArray657[local241] == 64) {
									if (this.anInt9578 == 64) {
										break label101;
									}
									this.anIntArray657[local241] += this.anInt9578++ + 1;
								}
								@Pc(289) Class13_Sub3_Sub2[] local289 = this.aClass13_Sub3_Sub2ArrayArray4[this.anIntArray657[local241] - 65];
								@Pc(299) int local299 = this.anIntArray657[local241] - 64 - 1;
								@Pc(301) int local301 = this.anIntArray656[this.anIntArray657[local241] - 64 - 1];
								this.anIntArray656[local299] = this.anIntArray656[this.anIntArray657[local241] - 64 - 1] + 1;
								local289[local301] = local199;
							}
						} else {
							this.aClass13_Sub3_Sub2ArrayArray3[local241][this.anIntArray657[local241]++] = local199;
						}
					}
					local62 = local62.aClass13_Sub3_9;
				}
				if (local157 >= 0) {
					arg1.method2053(local157);
				} else {
					arg1.method2053(-1);
				}
				if (local159 && Static465.aFloat148 != arg1.aFloat36) {
					arg1.xa(Static465.aFloat148);
				} else if (arg1.aFloat36 != 1.0F) {
					arg1.xa(1.0F);
				}
				this.method8016(arg1, local125);
			}
		} catch (@Pc(372) Exception local372) {
		}
		this.method8019(arg1);
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(Lclient!ep;IZ)V")
	private void method8016(@OriginalArg(0) Class95_Sub1 arg0, @OriginalArg(1) int arg1) {
		OpenGL.glGetFloatv(2982, this.aFloatArray80, 0);
		@Pc(15) float local15 = this.aFloatArray80[0];
		@Pc(20) float local20 = this.aFloatArray80[4];
		@Pc(25) float local25 = this.aFloatArray80[8];
		@Pc(30) float local30 = this.aFloatArray80[1];
		@Pc(35) float local35 = this.aFloatArray80[5];
		@Pc(40) float local40 = this.aFloatArray80[9];
		@Pc(44) float local44 = local30 + local15;
		@Pc(48) float local48 = local20 + local35;
		@Pc(52) float local52 = local40 + local25;
		@Pc(57) float local57 = local15 - local30;
		@Pc(67) float local67 = local20 - local35;
		@Pc(71) float local71 = local25 - local40;
		@Pc(75) float local75 = local30 - local15;
		@Pc(79) float local79 = local35 - local20;
		this.aClass2_Sub22_Sub1_3.anInt10247 = 0;
		@Pc(87) float local87 = local40 - local25;
		@Pc(94) int local94;
		@Pc(111) int local111;
		@Pc(120) int local120;
		@Pc(129) Class13_Sub3_Sub2 local129;
		@Pc(132) int local132;
		@Pc(137) byte local137;
		@Pc(142) byte local142;
		@Pc(145) byte local145;
		@Pc(150) byte local150;
		@Pc(156) float local156;
		@Pc(162) float local162;
		@Pc(168) float local168;
		@Pc(173) int local173;
		@Pc(492) float local492;
		@Pc(497) int local497;
		@Pc(437) int local437;
		@Pc(453) Class13_Sub3_Sub2 local453;
		@Pc(456) int local456;
		@Pc(469) byte local469;
		@Pc(474) byte local474;
		@Pc(486) float local486;
		if (arg0.aBoolean174) {
			for (local94 = arg1 - 1; local94 >= 0; local94--) {
				local111 = this.anIntArray657[local94] > 64 ? 64 : this.anIntArray657[local94];
				if (local111 > 0) {
					for (local120 = local111 - 1; local120 >= 0; local120--) {
						local129 = this.aClass13_Sub3_Sub2ArrayArray3[local94][local120];
						local132 = local129.anInt5957;
						local137 = (byte) (local132 >> 16);
						local142 = (byte) (local132 >> 8);
						local145 = (byte) local132;
						local150 = (byte) (local132 >>> 24);
						local156 = local129.anInt5953 >> 12;
						local162 = local129.anInt5959 >> 12;
						local168 = local129.anInt5954 >> 12;
						local173 = local129.anInt5956 >> 12;
						this.aClass2_Sub22_Sub1_3.method3702(0.0F);
						this.aClass2_Sub22_Sub1_3.method3702(0.0F);
						this.aClass2_Sub22_Sub1_3.method3702(local44 * (float) -local173 + local156);
						this.aClass2_Sub22_Sub1_3.method3702((float) -local173 * local48 + local162);
						this.aClass2_Sub22_Sub1_3.method3702(local52 * (float) -local173 + local168);
						this.aClass2_Sub22_Sub1_3.method8537(local137);
						this.aClass2_Sub22_Sub1_3.method8537(local142);
						this.aClass2_Sub22_Sub1_3.method8537(local145);
						this.aClass2_Sub22_Sub1_3.method8537(local150);
						this.aClass2_Sub22_Sub1_3.method3702(1.0F);
						this.aClass2_Sub22_Sub1_3.method3702(0.0F);
						this.aClass2_Sub22_Sub1_3.method3702(local57 * (float) local173 + local156);
						this.aClass2_Sub22_Sub1_3.method3702(local162 + local67 * (float) local173);
						this.aClass2_Sub22_Sub1_3.method3702((float) local173 * local71 + local168);
						this.aClass2_Sub22_Sub1_3.method8537(local137);
						this.aClass2_Sub22_Sub1_3.method8537(local142);
						this.aClass2_Sub22_Sub1_3.method8537(local145);
						this.aClass2_Sub22_Sub1_3.method8537(local150);
						this.aClass2_Sub22_Sub1_3.method3702(1.0F);
						this.aClass2_Sub22_Sub1_3.method3702(1.0F);
						this.aClass2_Sub22_Sub1_3.method3702(local156 + local44 * (float) local173);
						this.aClass2_Sub22_Sub1_3.method3702(local48 * (float) local173 + local162);
						this.aClass2_Sub22_Sub1_3.method3702(local168 + (float) local173 * local52);
						this.aClass2_Sub22_Sub1_3.method8537(local137);
						this.aClass2_Sub22_Sub1_3.method8537(local142);
						this.aClass2_Sub22_Sub1_3.method8537(local145);
						this.aClass2_Sub22_Sub1_3.method8537(local150);
						this.aClass2_Sub22_Sub1_3.method3702(0.0F);
						this.aClass2_Sub22_Sub1_3.method3702(1.0F);
						this.aClass2_Sub22_Sub1_3.method3702((float) local173 * local75 + local156);
						this.aClass2_Sub22_Sub1_3.method3702(local162 + local79 * (float) local173);
						this.aClass2_Sub22_Sub1_3.method3702(local87 * (float) local173 + local168);
						this.aClass2_Sub22_Sub1_3.method8537(local137);
						this.aClass2_Sub22_Sub1_3.method8537(local142);
						this.aClass2_Sub22_Sub1_3.method8537(local145);
						this.aClass2_Sub22_Sub1_3.method8537(local150);
					}
					if (this.anIntArray657[local94] > 64) {
						local437 = this.anIntArray657[local94] - 64 - 1;
						for (local132 = this.anIntArray656[local437] - 1; local132 >= 0; local132--) {
							local453 = this.aClass13_Sub3_Sub2ArrayArray4[local437][local132];
							local456 = local453.anInt5957;
							local145 = (byte) (local456 >> 16);
							local150 = (byte) (local456 >> 8);
							local469 = (byte) local456;
							local474 = (byte) (local456 >>> 24);
							local168 = local453.anInt5953 >> 12;
							local486 = local453.anInt5959 >> 12;
							local492 = local453.anInt5954 >> 12;
							local497 = local453.anInt5956 >> 12;
							this.aClass2_Sub22_Sub1_3.method3702(0.0F);
							this.aClass2_Sub22_Sub1_3.method3702(0.0F);
							this.aClass2_Sub22_Sub1_3.method3702(local44 * (float) -local497 + local168);
							this.aClass2_Sub22_Sub1_3.method3702(local48 * (float) -local497 + local486);
							this.aClass2_Sub22_Sub1_3.method3702((float) -local497 * local52 + local492);
							this.aClass2_Sub22_Sub1_3.method8537(local145);
							this.aClass2_Sub22_Sub1_3.method8537(local150);
							this.aClass2_Sub22_Sub1_3.method8537(local469);
							this.aClass2_Sub22_Sub1_3.method8537(local474);
							this.aClass2_Sub22_Sub1_3.method3702(1.0F);
							this.aClass2_Sub22_Sub1_3.method3702(0.0F);
							this.aClass2_Sub22_Sub1_3.method3702((float) local497 * local57 + local168);
							this.aClass2_Sub22_Sub1_3.method3702(local486 + (float) local497 * local67);
							this.aClass2_Sub22_Sub1_3.method3702(local71 * (float) local497 + local492);
							this.aClass2_Sub22_Sub1_3.method8537(local145);
							this.aClass2_Sub22_Sub1_3.method8537(local150);
							this.aClass2_Sub22_Sub1_3.method8537(local469);
							this.aClass2_Sub22_Sub1_3.method8537(local474);
							this.aClass2_Sub22_Sub1_3.method3702(1.0F);
							this.aClass2_Sub22_Sub1_3.method3702(1.0F);
							this.aClass2_Sub22_Sub1_3.method3702(local44 * (float) local497 + local168);
							this.aClass2_Sub22_Sub1_3.method3702((float) local497 * local48 + local486);
							this.aClass2_Sub22_Sub1_3.method3702(local492 + (float) local497 * local52);
							this.aClass2_Sub22_Sub1_3.method8537(local145);
							this.aClass2_Sub22_Sub1_3.method8537(local150);
							this.aClass2_Sub22_Sub1_3.method8537(local469);
							this.aClass2_Sub22_Sub1_3.method8537(local474);
							this.aClass2_Sub22_Sub1_3.method3702(0.0F);
							this.aClass2_Sub22_Sub1_3.method3702(1.0F);
							this.aClass2_Sub22_Sub1_3.method3702(local168 + (float) local497 * local75);
							this.aClass2_Sub22_Sub1_3.method3702(local486 + local79 * (float) local497);
							this.aClass2_Sub22_Sub1_3.method3702((float) local497 * local87 + local492);
							this.aClass2_Sub22_Sub1_3.method8537(local145);
							this.aClass2_Sub22_Sub1_3.method8537(local150);
							this.aClass2_Sub22_Sub1_3.method8537(local469);
							this.aClass2_Sub22_Sub1_3.method8537(local474);
						}
					}
				}
			}
		} else {
			for (local94 = arg1 - 1; local94 >= 0; local94--) {
				local111 = this.anIntArray657[local94] <= 64 ? this.anIntArray657[local94] : 64;
				if (local111 > 0) {
					for (local120 = local111 - 1; local120 >= 0; local120--) {
						local129 = this.aClass13_Sub3_Sub2ArrayArray3[local94][local120];
						local132 = local129.anInt5957;
						local137 = (byte) (local132 >> 16);
						local142 = (byte) (local132 >> 8);
						local145 = (byte) local132;
						local150 = (byte) (local132 >>> 24);
						local156 = local129.anInt5953 >> 12;
						local162 = local129.anInt5959 >> 12;
						local168 = local129.anInt5954 >> 12;
						local173 = local129.anInt5956 >> 12;
						this.aClass2_Sub22_Sub1_3.method3701(0.0F);
						this.aClass2_Sub22_Sub1_3.method3701(0.0F);
						this.aClass2_Sub22_Sub1_3.method3701((float) -local173 * local44 + local156);
						this.aClass2_Sub22_Sub1_3.method3701(local48 * (float) -local173 + local162);
						this.aClass2_Sub22_Sub1_3.method3701((float) -local173 * local52 + local168);
						this.aClass2_Sub22_Sub1_3.method8537(local137);
						this.aClass2_Sub22_Sub1_3.method8537(local142);
						this.aClass2_Sub22_Sub1_3.method8537(local145);
						this.aClass2_Sub22_Sub1_3.method8537(local150);
						this.aClass2_Sub22_Sub1_3.method3701(1.0F);
						this.aClass2_Sub22_Sub1_3.method3701(0.0F);
						this.aClass2_Sub22_Sub1_3.method3701((float) local173 * local57 + local156);
						this.aClass2_Sub22_Sub1_3.method3701(local162 + (float) local173 * local67);
						this.aClass2_Sub22_Sub1_3.method3701(local168 + (float) local173 * local71);
						this.aClass2_Sub22_Sub1_3.method8537(local137);
						this.aClass2_Sub22_Sub1_3.method8537(local142);
						this.aClass2_Sub22_Sub1_3.method8537(local145);
						this.aClass2_Sub22_Sub1_3.method8537(local150);
						this.aClass2_Sub22_Sub1_3.method3701(1.0F);
						this.aClass2_Sub22_Sub1_3.method3701(1.0F);
						this.aClass2_Sub22_Sub1_3.method3701(local156 + (float) local173 * local44);
						this.aClass2_Sub22_Sub1_3.method3701(local162 + (float) local173 * local48);
						this.aClass2_Sub22_Sub1_3.method3701(local52 * (float) local173 + local168);
						this.aClass2_Sub22_Sub1_3.method8537(local137);
						this.aClass2_Sub22_Sub1_3.method8537(local142);
						this.aClass2_Sub22_Sub1_3.method8537(local145);
						this.aClass2_Sub22_Sub1_3.method8537(local150);
						this.aClass2_Sub22_Sub1_3.method3701(0.0F);
						this.aClass2_Sub22_Sub1_3.method3701(1.0F);
						this.aClass2_Sub22_Sub1_3.method3701(local156 + (float) local173 * local75);
						this.aClass2_Sub22_Sub1_3.method3701(local79 * (float) local173 + local162);
						this.aClass2_Sub22_Sub1_3.method3701(local168 + (float) local173 * local87);
						this.aClass2_Sub22_Sub1_3.method8537(local137);
						this.aClass2_Sub22_Sub1_3.method8537(local142);
						this.aClass2_Sub22_Sub1_3.method8537(local145);
						this.aClass2_Sub22_Sub1_3.method8537(local150);
					}
					if (this.anIntArray657[local94] > 64) {
						local437 = this.anIntArray657[local94] - 1 - 64;
						for (local132 = this.anIntArray656[local437] - 1; local132 >= 0; local132--) {
							local453 = this.aClass13_Sub3_Sub2ArrayArray4[local437][local132];
							local456 = local453.anInt5957;
							local145 = (byte) (local456 >> 16);
							local150 = (byte) (local456 >> 8);
							local469 = (byte) local456;
							local474 = (byte) (local456 >>> 24);
							local168 = local453.anInt5953 >> 12;
							local486 = local453.anInt5959 >> 12;
							local492 = local453.anInt5954 >> 12;
							local497 = local453.anInt5956 >> 12;
							this.aClass2_Sub22_Sub1_3.method3701(0.0F);
							this.aClass2_Sub22_Sub1_3.method3701(0.0F);
							this.aClass2_Sub22_Sub1_3.method3701(local44 * (float) -local497 + local168);
							this.aClass2_Sub22_Sub1_3.method3701((float) -local497 * local48 + local486);
							this.aClass2_Sub22_Sub1_3.method3701(local492 + local52 * (float) -local497);
							this.aClass2_Sub22_Sub1_3.method8537(local145);
							this.aClass2_Sub22_Sub1_3.method8537(local150);
							this.aClass2_Sub22_Sub1_3.method8537(local469);
							this.aClass2_Sub22_Sub1_3.method8537(local474);
							this.aClass2_Sub22_Sub1_3.method3701(1.0F);
							this.aClass2_Sub22_Sub1_3.method3701(0.0F);
							this.aClass2_Sub22_Sub1_3.method3701(local168 + local57 * (float) local497);
							this.aClass2_Sub22_Sub1_3.method3701(local67 * (float) local497 + local486);
							this.aClass2_Sub22_Sub1_3.method3701(local492 + (float) local497 * local71);
							this.aClass2_Sub22_Sub1_3.method8537(local145);
							this.aClass2_Sub22_Sub1_3.method8537(local150);
							this.aClass2_Sub22_Sub1_3.method8537(local469);
							this.aClass2_Sub22_Sub1_3.method8537(local474);
							this.aClass2_Sub22_Sub1_3.method3701(1.0F);
							this.aClass2_Sub22_Sub1_3.method3701(1.0F);
							this.aClass2_Sub22_Sub1_3.method3701(local168 + local44 * (float) local497);
							this.aClass2_Sub22_Sub1_3.method3701(local486 + local48 * (float) local497);
							this.aClass2_Sub22_Sub1_3.method3701(local492 + (float) local497 * local52);
							this.aClass2_Sub22_Sub1_3.method8537(local145);
							this.aClass2_Sub22_Sub1_3.method8537(local150);
							this.aClass2_Sub22_Sub1_3.method8537(local469);
							this.aClass2_Sub22_Sub1_3.method8537(local474);
							this.aClass2_Sub22_Sub1_3.method3701(0.0F);
							this.aClass2_Sub22_Sub1_3.method3701(1.0F);
							this.aClass2_Sub22_Sub1_3.method3701((float) local497 * local75 + local168);
							this.aClass2_Sub22_Sub1_3.method3701(local486 + (float) local497 * local79);
							this.aClass2_Sub22_Sub1_3.method3701(local492 + local87 * (float) local497);
							this.aClass2_Sub22_Sub1_3.method8537(local145);
							this.aClass2_Sub22_Sub1_3.method8537(local150);
							this.aClass2_Sub22_Sub1_3.method8537(local469);
							this.aClass2_Sub22_Sub1_3.method8537(local474);
						}
					}
				}
			}
		}
		if (this.aClass2_Sub22_Sub1_3.anInt10247 != 0) {
			this.anInterface12_7.method7601(24, this.aClass2_Sub22_Sub1_3.anInt10247, this.aClass2_Sub22_Sub1_3.aByteArray115);
			arg0.method2086(this.aClass82_14, this.aClass82_15, this.aClass82_16, null);
			arg0.method2038(this.aClass2_Sub22_Sub1_3.anInt10247 / 24);
		}
	}

	@OriginalMember(owner = "client!uw", name = "b", descriptor = "(Lclient!ep;I)V")
	private void method8019(@OriginalArg(0) Class95_Sub1 arg0) {
		arg0.method2096(true);
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		if (Static465.aFloat148 != arg0.aFloat36) {
			arg0.xa(Static465.aFloat148);
		}
	}

	@OriginalMember(owner = "client!uw", name = "c", descriptor = "(Lclient!ep;I)V")
	public void method8020(@OriginalArg(0) Class95_Sub1 arg0) {
		this.anInterface12_7 = arg0.method2071(196584, true, null, 24);
		this.aClass82_16 = new Class82(this.anInterface12_7, 5126, 2, 0);
		this.aClass82_15 = new Class82(this.anInterface12_7, 5126, 3, 8);
		this.aClass82_14 = new Class82(this.anInterface12_7, 5121, 4, 20);
	}
}

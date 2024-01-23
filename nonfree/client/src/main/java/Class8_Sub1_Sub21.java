import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uh")
public final class Class8_Sub1_Sub21 extends Class8_Sub1 {

	@OriginalMember(owner = "client!uh", name = "x", descriptor = "I")
	private int anInt5320;

	@OriginalMember(owner = "client!uh", name = "y", descriptor = "[I")
	private int[] anIntArray462;

	@OriginalMember(owner = "client!uh", name = "H", descriptor = "I")
	private int anInt5325;

	@OriginalMember(owner = "client!uh", name = "J", descriptor = "F")
	private float aFloat60;

	@OriginalMember(owner = "client!uh", name = "v", descriptor = "I")
	private int anInt5319 = -1;

	@OriginalMember(owner = "client!uh", name = "z", descriptor = "I")
	private int anInt5321 = 0;

	@OriginalMember(owner = "client!uh", name = "G", descriptor = "Z")
	public boolean aBoolean447 = false;

	@OriginalMember(owner = "client!uh", name = "D", descriptor = "Lclient!be;")
	public Class8_Sub1_Sub1 aClass8_Sub1_Sub1_1;

	@OriginalMember(owner = "client!uh", name = "u", descriptor = "Z")
	private boolean aBoolean444;

	@OriginalMember(owner = "client!uh", name = "K", descriptor = "Z")
	private boolean aBoolean449;

	@OriginalMember(owner = "client!uh", name = "I", descriptor = "Z")
	private boolean aBoolean448;

	@OriginalMember(owner = "client!uh", name = "B", descriptor = "Z")
	private boolean aBoolean446;

	@OriginalMember(owner = "client!uh", name = "L", descriptor = "I")
	private int anInt5326;

	@OriginalMember(owner = "client!uh", name = "C", descriptor = "I")
	private int anInt5322;

	@OriginalMember(owner = "client!uh", name = "w", descriptor = "Z")
	private boolean aBoolean445;

	@OriginalMember(owner = "client!uh", name = "E", descriptor = "I")
	private int anInt5323;

	@OriginalMember(owner = "client!uh", name = "F", descriptor = "I")
	private int anInt5324;

	@OriginalMember(owner = "client!uh", name = "<init>", descriptor = "(Lclient!aj;)V")
	public Class8_Sub1_Sub21(@OriginalArg(0) Class8_Sub2 arg0) {
		this.aClass8_Sub1_Sub1_1 = new Class8_Sub1_Sub1(arg0);
		this.aBoolean444 = arg0.method2334() == 1;
		this.aBoolean449 = arg0.method2334() == 1;
		this.aBoolean448 = arg0.method2334() == 1;
		this.aBoolean446 = arg0.method2334() == 1;
		@Pc(62) int local62 = arg0.method2334() & 0x3;
		this.anInt5326 = arg0.method2374();
		this.anInt5322 = arg0.method2374();
		@Pc(76) int local76 = arg0.method2334();
		arg0.method2334();
		this.aBoolean445 = arg0.method2334() == 1;
		this.anInt5323 = local76 >> 4 & 0xF;
		if (local62 == 1) {
			this.anInt5324 = 2;
		} else if (local62 == 2) {
			this.anInt5324 = 3;
		} else if (local62 == 3) {
			this.anInt5324 = 4;
		} else {
			this.anInt5324 = 0;
		}
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lclient!ln;Lclient!pk;I)Z")
	public boolean method4026(@OriginalArg(0) Interface3 arg0, @OriginalArg(1) Class132 arg1, @OriginalArg(2) int arg2) {
		if (!this.aClass8_Sub1_Sub1_1.method359(arg1, arg0)) {
			return false;
		}
		@Pc(10) GL local10 = Static116.aGL1;
		@Pc(13) int local13 = Static158.method2545();
		if ((local13 & 0x1) == 0) {
			if (this.anInt5319 != -1 && this.anInt5320 == arg2) {
				Static116.method1897(this.anInt5319);
			} else {
				if (this.anInt5319 == -1) {
					@Pc(32) int[] local32 = new int[1];
					local10.glGenTextures(1, local32, 0);
					this.anInt5319 = local32[0];
					this.anInt5325 = Static166.anInt3350;
				}
				Static116.method1897(this.anInt5319);
				if (this.aBoolean445 && Static154.method2459()) {
					@Pc(64) float[] local64 = this.aClass8_Sub1_Sub1_1.method371(arg0, arg2, this.aBoolean449, arg2, arg1);
					if (this.anInt5323 == 2) {
						Static268.method4027(Static287.anInt5637, Static287.anInt5643, arg2, arg2, Static287.anInt5640, Static287.anInt5650, local64);
						local10.glTexParameteri(3553, 10241, 9987);
						local10.glTexParameteri(3553, 10240, 9729);
						Static166.anInt3351 += local64.length * 4 / 3 - this.anInt5321;
						this.anInt5321 = local64.length * 4 / 3;
					} else {
						local10.glTexImage2D(3553, 0, 34842, arg2, arg2, 0, 6408, 5126, FloatBuffer.wrap(local64));
						local10.glTexParameteri(3553, 10241, 9729);
						local10.glTexParameteri(3553, 10240, 9729);
						Static166.anInt3351 += local64.length - this.anInt5321;
						this.anInt5321 = local64.length;
					}
				} else {
					@Pc(148) int local148 = Static116.aBoolean189 ? 33639 : 5121;
					@Pc(160) int[] local160 = this.aClass8_Sub1_Sub1_1.method358(0.7D, arg2, this.aBoolean449, arg2, arg0, arg1);
					if (this.anInt5323 == 2) {
						Static268.method4031(Static287.anInt5637, Static287.anInt5640, arg2, arg2, Static287.anInt5641, local148, local160);
						local10.glTexParameteri(3553, 10241, 9987);
						local10.glTexParameteri(3553, 10240, 9729);
						Static166.anInt3351 += local160.length * 4 / 3 - this.anInt5321;
						this.anInt5321 = local160.length * 4 / 3;
					} else if (this.anInt5323 == 1) {
						@Pc(209) int local209 = 0;
						while (true) {
							local10.glTexImage2D(3553, local209++, 6408, arg2, arg2, 0, 32993, local148, IntBuffer.wrap(local160));
							arg2 >>= 0x1;
							if (arg2 == 0) {
								local10.glTexParameteri(3553, 10241, 9987);
								local10.glTexParameteri(3553, 10240, 9729);
								Static166.anInt3351 += local160.length * 4 / 3 - this.anInt5321;
								this.anInt5321 = local160.length * 4 / 3;
								break;
							}
							local160 = this.aClass8_Sub1_Sub1_1.method358(0.7D, arg2, this.aBoolean449, arg2, arg0, arg1);
						}
					} else {
						local10.glTexImage2D(3553, 0, 6408, arg2, arg2, 0, 32993, local148, IntBuffer.wrap(local160));
						local10.glTexParameteri(3553, 10241, 9729);
						local10.glTexParameteri(3553, 10240, 9729);
						Static166.anInt3351 += local160.length - this.anInt5321;
						this.anInt5321 = local160.length;
					}
				}
				local10.glTexParameteri(3553, 10242, this.aBoolean448 ? 10497 : 33071);
				local10.glTexParameteri(3553, 10243, this.aBoolean446 ? 10497 : 33071);
				this.anInt5320 = arg2;
			}
		}
		if ((local13 & 0x2) == 0) {
			Static116.method1884(this.anInt5324);
		}
		if ((local13 & 0x4) == 0) {
			Static116.method1889(0);
		}
		if ((local13 & 0x8) == 0) {
			if (this.anInt5322 == 0 && this.anInt5326 == 0) {
				Static116.method1892();
			} else {
				@Pc(367) float local367 = (float) (Static116.anInt2376 * this.anInt5322) / (float) this.anInt5320;
				@Pc(377) float local377 = (float) (Static116.anInt2376 * this.anInt5326) / (float) this.anInt5320;
				Static116.method1880(local377, local367, 0.0F);
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!uh", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.anInt5319 != -1) {
			Static166.method2639(this.anInt5319, this.anInt5321, this.anInt5325);
			this.anInt5319 = -1;
			this.anInt5321 = 0;
		}
		super.finalize();
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lclient!ln;Lclient!pk;FZ)[I")
	public int[] method4028(@OriginalArg(0) Interface3 arg0, @OriginalArg(1) Class132 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) boolean arg3) {
		if (this.anIntArray462 == null || this.aFloat60 != arg2) {
			if (!this.aClass8_Sub1_Sub1_1.method359(arg1, arg0)) {
				return null;
			}
			this.anInt5320 = arg3 ? 64 : 128;
			this.anIntArray462 = this.aClass8_Sub1_Sub1_1.method360((double) arg2, this.anInt5320, arg1, this.anInt5320, arg0, true, this.aBoolean449);
			this.aFloat60 = arg2;
			if (this.aBoolean444) {
				@Pc(50) int[] local50 = new int[this.anInt5320];
				@Pc(54) int[] local54 = new int[this.anInt5320];
				@Pc(58) int[] local58 = new int[this.anInt5320];
				@Pc(65) int[] local65 = new int[this.anInt5320 * this.anInt5320];
				@Pc(68) int local68 = this.anInt5320;
				@Pc(71) int local71 = this.anInt5320;
				@Pc(75) int local75 = local68 - 1;
				@Pc(79) int local79 = local71 - 1;
				@Pc(83) int local83 = local68 * local71;
				@Pc(88) int local88;
				@Pc(89) int local89 = local88 = local68;
				@Pc(95) int local95;
				@Pc(91) int local91;
				for (local91 = 2; local91 >= 0; local91--) {
					for (local95 = local75; local95 >= 0; local95--) {
						local88--;
						@Pc(103) int local103 = this.anIntArray462[local88];
						local50[local95] += local103 >> 16 & 0xFF;
						local54[local95] += local103 >> 8 & 0xFF;
						local58[local95] += local103 & 0xFF;
					}
					if (local88 == 0) {
						local88 = local83;
					}
				}
				@Pc(144) int local144 = local83;
				for (@Pc(146) int local146 = local79; local146 >= 0; local146--) {
					@Pc(150) int local150 = 1;
					@Pc(152) int local152 = 1;
					@Pc(155) int local155 = 0;
					@Pc(157) int local157 = 0;
					@Pc(158) int local158 = 0;
					for (local95 = 2; local95 >= 0; local95--) {
						local152--;
						local158 += local50[local152];
						local155 += local54[local152];
						local157 += local58[local152];
						if (local152 == 0) {
							local152 = local68;
						}
					}
					for (local95 = local75; local95 >= 0; local95--) {
						local152--;
						local150--;
						local91 = local158 / 9;
						@Pc(201) int local201 = local155 / 9;
						@Pc(205) int local205 = local157 / 9;
						local144--;
						local65[local144] = local91 << 16 | local201 << 8 | local205;
						local158 += local50[local152] - local50[local150];
						local157 += local58[local152] - local58[local150];
						local155 += local54[local152] - local54[local150];
						if (local152 == 0) {
							local152 = local68;
						}
						if (local150 == 0) {
							local150 = local68;
						}
					}
					for (local95 = local75; local95 >= 0; local95--) {
						local88--;
						@Pc(268) int local268 = this.anIntArray462[local88];
						local89--;
						@Pc(274) int local274 = this.anIntArray462[local89];
						local50[local95] += (local268 >> 16 & 0xFF) - (local274 >> 16 & 0xFF);
						local54[local95] += (local268 >> 8 & 0xFF) - (local274 >> 8 & 0xFF);
						local58[local95] += (local268 & 0xFF) - (local274 & 0xFF);
					}
					if (local88 == 0) {
						local88 = local83;
					}
					if (local89 == 0) {
						local89 = local83;
					}
				}
				this.anIntArray462 = local65;
			}
		}
		return this.anIntArray462;
	}

	@OriginalMember(owner = "client!uh", name = "c", descriptor = "(I)V")
	public void method4030(@OriginalArg(0) int arg0) {
		if (this.anIntArray462 == null || this.anInt5322 == 0 && this.anInt5326 == 0) {
			return;
		}
		if (Static268.anIntArray463 == null || Static268.anIntArray463.length < this.anIntArray462.length) {
			Static268.anIntArray463 = new int[this.anIntArray462.length];
		}
		@Pc(26) int local26 = this.anIntArray462.length;
		@Pc(31) int local31 = arg0 * this.anInt5326;
		@Pc(36) int local36 = this.anInt5320 - 1;
		@Pc(44) int local44 = this.anInt5320 * arg0 * this.anInt5322;
		@Pc(48) int local48 = local26 - 1;
		for (@Pc(50) int local50 = 0; local50 < local26; local50 += this.anInt5320) {
			@Pc(59) int local59 = local50 + local44 & local48;
			for (@Pc(61) int local61 = 0; local61 < this.anInt5320; local61++) {
				@Pc(69) int local69 = local50 + local61;
				@Pc(77) int local77 = local59 + (local61 + local31 & local36);
				Static268.anIntArray463[local69] = this.anIntArray462[local77];
			}
		}
		@Pc(95) int[] local95 = this.anIntArray462;
		this.anIntArray462 = Static268.anIntArray463;
		Static268.anIntArray463 = local95;
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lclient!ln;Lclient!pk;Z)[I")
	public int[] method4032(@OriginalArg(0) Interface3 arg0, @OriginalArg(1) Class132 arg1, @OriginalArg(2) boolean arg2) {
		if (this.aClass8_Sub1_Sub1_1.method359(arg1, arg0)) {
			@Pc(14) int local14 = arg2 ? 64 : 128;
			return this.aClass8_Sub1_Sub1_1.method360(1.0D, local14, arg1, local14, arg0, false, this.aBoolean449);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lclient!ln;Lclient!pk;)Z")
	public boolean method4033(@OriginalArg(0) Interface3 arg0, @OriginalArg(1) Class132 arg1) {
		return this.aClass8_Sub1_Sub1_1.method359(arg1, arg0);
	}
}

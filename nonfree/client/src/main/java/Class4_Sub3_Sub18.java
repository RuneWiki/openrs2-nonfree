import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!so")
public final class Class4_Sub3_Sub18 extends Class4_Sub3 {

	@OriginalMember(owner = "client!so", name = "A", descriptor = "[I")
	private int[] anIntArray538;

	@OriginalMember(owner = "client!so", name = "H", descriptor = "I")
	private int anInt4972;

	@OriginalMember(owner = "client!so", name = "I", descriptor = "I")
	private int anInt4973;

	@OriginalMember(owner = "client!so", name = "O", descriptor = "F")
	private float aFloat131;

	@OriginalMember(owner = "client!so", name = "M", descriptor = "I")
	private int anInt4974 = 0;

	@OriginalMember(owner = "client!so", name = "z", descriptor = "I")
	private int anInt4967 = -1;

	@OriginalMember(owner = "client!so", name = "L", descriptor = "Z")
	public boolean aBoolean345 = false;

	@OriginalMember(owner = "client!so", name = "J", descriptor = "Lclient!ln;")
	public Class4_Sub3_Sub15 aClass4_Sub3_Sub15_1;

	@OriginalMember(owner = "client!so", name = "N", descriptor = "Z")
	private boolean aBoolean346;

	@OriginalMember(owner = "client!so", name = "y", descriptor = "Z")
	private boolean aBoolean342;

	@OriginalMember(owner = "client!so", name = "P", descriptor = "Z")
	private boolean aBoolean347;

	@OriginalMember(owner = "client!so", name = "F", descriptor = "Z")
	private boolean aBoolean343;

	@OriginalMember(owner = "client!so", name = "C", descriptor = "I")
	private int anInt4969;

	@OriginalMember(owner = "client!so", name = "G", descriptor = "I")
	private int anInt4971;

	@OriginalMember(owner = "client!so", name = "K", descriptor = "Z")
	private boolean aBoolean344;

	@OriginalMember(owner = "client!so", name = "E", descriptor = "I")
	private int anInt4970;

	@OriginalMember(owner = "client!so", name = "B", descriptor = "I")
	private int anInt4968;

	@OriginalMember(owner = "client!so", name = "<init>", descriptor = "(Lclient!fd;)V")
	public Class4_Sub3_Sub18(@OriginalArg(0) Class4_Sub10 arg0) {
		this.aClass4_Sub3_Sub15_1 = new Class4_Sub3_Sub15(arg0);
		this.aBoolean346 = arg0.method4666() == 1;
		this.aBoolean342 = arg0.method4666() == 1;
		this.aBoolean347 = arg0.method4666() == 1;
		this.aBoolean343 = arg0.method4666() == 1;
		@Pc(62) int local62 = arg0.method4666() & 0x3;
		this.anInt4969 = arg0.method4674();
		this.anInt4971 = arg0.method4674();
		@Pc(76) int local76 = arg0.method4666();
		arg0.method4666();
		this.aBoolean344 = arg0.method4666() == 1;
		this.anInt4970 = local76 >> 4 & 0xF;
		if (local62 == 1) {
			this.anInt4968 = 2;
		} else if (local62 == 2) {
			this.anInt4968 = 3;
		} else if (local62 == 3) {
			this.anInt4968 = 4;
		} else {
			this.anInt4968 = 0;
		}
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(Lclient!kj;Lclient!fh;Z)[I")
	public int[] method4108(@OriginalArg(0) Interface3 arg0, @OriginalArg(1) Class58 arg1, @OriginalArg(2) boolean arg2) {
		if (this.aClass4_Sub3_Sub15_1.method2662(arg0, arg1)) {
			@Pc(14) int local14 = arg2 ? 64 : 128;
			return this.aClass4_Sub3_Sub15_1.method2666(1.0D, this.aBoolean342, arg1, arg0, local14, false, local14);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(Lclient!kj;Lclient!fh;FZ)[I")
	public int[] method4110(@OriginalArg(0) Interface3 arg0, @OriginalArg(1) Class58 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) boolean arg3) {
		if (this.anIntArray538 == null || this.aFloat131 != arg2) {
			if (!this.aClass4_Sub3_Sub15_1.method2662(arg0, arg1)) {
				return null;
			}
			this.anInt4972 = arg3 ? 64 : 128;
			this.anIntArray538 = this.aClass4_Sub3_Sub15_1.method2666((double) arg2, this.aBoolean342, arg1, arg0, this.anInt4972, true, this.anInt4972);
			this.aFloat131 = arg2;
			if (this.aBoolean346) {
				@Pc(50) int[] local50 = new int[this.anInt4972];
				@Pc(54) int[] local54 = new int[this.anInt4972];
				@Pc(58) int[] local58 = new int[this.anInt4972];
				@Pc(65) int[] local65 = new int[this.anInt4972 * this.anInt4972];
				@Pc(68) int local68 = this.anInt4972;
				@Pc(71) int local71 = this.anInt4972;
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
						@Pc(103) int local103 = this.anIntArray538[local88];
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
						@Pc(268) int local268 = this.anIntArray538[local88];
						local89--;
						@Pc(274) int local274 = this.anIntArray538[local89];
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
				this.anIntArray538 = local65;
			}
		}
		return this.anIntArray538;
	}

	@OriginalMember(owner = "client!so", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.anInt4967 != -1) {
			Static173.method2733(this.anInt4967, this.anInt4974, this.anInt4973);
			this.anInt4967 = -1;
			this.anInt4974 = 0;
		}
		super.finalize();
	}

	@OriginalMember(owner = "client!so", name = "d", descriptor = "(I)V")
	public void method4111(@OriginalArg(0) int arg0) {
		if (this.anIntArray538 == null || this.anInt4971 == 0 && this.anInt4969 == 0) {
			return;
		}
		if (Static260.anIntArray539 == null || Static260.anIntArray539.length < this.anIntArray538.length) {
			Static260.anIntArray539 = new int[this.anIntArray538.length];
		}
		@Pc(26) int local26 = this.anIntArray538.length;
		@Pc(31) int local31 = arg0 * this.anInt4969;
		@Pc(36) int local36 = this.anInt4972 - 1;
		@Pc(44) int local44 = this.anInt4972 * arg0 * this.anInt4971;
		@Pc(48) int local48 = local26 - 1;
		for (@Pc(50) int local50 = 0; local50 < local26; local50 += this.anInt4972) {
			@Pc(59) int local59 = local50 + local44 & local48;
			for (@Pc(61) int local61 = 0; local61 < this.anInt4972; local61++) {
				@Pc(69) int local69 = local50 + local61;
				@Pc(77) int local77 = local59 + (local61 + local31 & local36);
				Static260.anIntArray539[local69] = this.anIntArray538[local77];
			}
		}
		@Pc(95) int[] local95 = this.anIntArray538;
		this.anIntArray538 = Static260.anIntArray539;
		Static260.anIntArray539 = local95;
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(Lclient!kj;Lclient!fh;)Z")
	public boolean method4113(@OriginalArg(0) Interface3 arg0, @OriginalArg(1) Class58 arg1) {
		return this.aClass4_Sub3_Sub15_1.method2662(arg0, arg1);
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(Lclient!kj;Lclient!fh;I)Z")
	public boolean method4114(@OriginalArg(0) Interface3 arg0, @OriginalArg(1) Class58 arg1, @OriginalArg(2) int arg2) {
		if (!this.aClass4_Sub3_Sub15_1.method2662(arg0, arg1)) {
			return false;
		}
		@Pc(10) GL local10 = Static94.aGL1;
		@Pc(13) int local13 = Static77.method1323();
		if ((local13 & 0x1) == 0) {
			if (this.anInt4967 != -1 && this.anInt4972 == arg2) {
				Static94.method1600(this.anInt4967);
			} else {
				if (this.anInt4967 == -1) {
					@Pc(32) int[] local32 = new int[1];
					local10.glGenTextures(1, local32, 0);
					this.anInt4967 = local32[0];
					this.anInt4973 = Static173.anInt3332;
				}
				Static94.method1600(this.anInt4967);
				if (this.aBoolean344 && Static53.method881()) {
					@Pc(64) float[] local64 = this.aClass4_Sub3_Sub15_1.method2661(arg2, this.aBoolean342, arg0, arg1, arg2);
					if (this.anInt4970 == 2) {
						Static260.method4107(Static267.anInt5134, Static267.anInt5140, arg2, arg2, Static267.anInt5137, Static267.anInt5147, local64);
						local10.glTexParameteri(3553, 10241, 9987);
						local10.glTexParameteri(3553, 10240, 9729);
						Static173.anInt3330 += local64.length * 4 / 3 - this.anInt4974;
						this.anInt4974 = local64.length * 4 / 3;
					} else {
						local10.glTexImage2D(3553, 0, 34842, arg2, arg2, 0, 6408, 5126, FloatBuffer.wrap(local64));
						local10.glTexParameteri(3553, 10241, 9729);
						local10.glTexParameteri(3553, 10240, 9729);
						Static173.anInt3330 += local64.length - this.anInt4974;
						this.anInt4974 = local64.length;
					}
				} else {
					@Pc(148) int local148 = Static94.aBoolean126 ? 33639 : 5121;
					@Pc(160) int[] local160 = this.aClass4_Sub3_Sub15_1.method2659(arg2, arg2, arg1, 0.7D, arg0, this.aBoolean342);
					if (this.anInt4970 == 2) {
						Static260.method4109(Static267.anInt5134, Static267.anInt5137, arg2, arg2, Static267.anInt5138, local148, local160);
						local10.glTexParameteri(3553, 10241, 9987);
						local10.glTexParameteri(3553, 10240, 9729);
						Static173.anInt3330 += local160.length * 4 / 3 - this.anInt4974;
						this.anInt4974 = local160.length * 4 / 3;
					} else if (this.anInt4970 == 1) {
						@Pc(209) int local209 = 0;
						while (true) {
							local10.glTexImage2D(3553, local209++, 6408, arg2, arg2, 0, 32993, local148, IntBuffer.wrap(local160));
							arg2 >>= 0x1;
							if (arg2 == 0) {
								local10.glTexParameteri(3553, 10241, 9987);
								local10.glTexParameteri(3553, 10240, 9729);
								Static173.anInt3330 += local160.length * 4 / 3 - this.anInt4974;
								this.anInt4974 = local160.length * 4 / 3;
								break;
							}
							local160 = this.aClass4_Sub3_Sub15_1.method2659(arg2, arg2, arg1, 0.7D, arg0, this.aBoolean342);
						}
					} else {
						local10.glTexImage2D(3553, 0, 6408, arg2, arg2, 0, 32993, local148, IntBuffer.wrap(local160));
						local10.glTexParameteri(3553, 10241, 9729);
						local10.glTexParameteri(3553, 10240, 9729);
						Static173.anInt3330 += local160.length - this.anInt4974;
						this.anInt4974 = local160.length;
					}
				}
				local10.glTexParameteri(3553, 10242, this.aBoolean347 ? 10497 : 33071);
				local10.glTexParameteri(3553, 10243, this.aBoolean343 ? 10497 : 33071);
				this.anInt4972 = arg2;
			}
		}
		if ((local13 & 0x2) == 0) {
			Static94.method1597(this.anInt4968);
		}
		if ((local13 & 0x4) == 0) {
			Static94.method1607(0);
		}
		if ((local13 & 0x8) == 0) {
			if (this.anInt4971 == 0 && this.anInt4969 == 0) {
				Static94.method1595();
			} else {
				@Pc(367) float local367 = (float) (Static94.anInt2085 * this.anInt4971) / (float) this.anInt4972;
				@Pc(377) float local377 = (float) (Static94.anInt2085 * this.anInt4969) / (float) this.anInt4972;
				Static94.method1609(local377, local367, 0.0F);
			}
		}
		return true;
	}
}

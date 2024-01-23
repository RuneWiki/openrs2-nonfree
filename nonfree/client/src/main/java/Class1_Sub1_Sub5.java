import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cb")
public final class Class1_Sub1_Sub5 extends Class1_Sub1 {

	@OriginalMember(owner = "client!cb", name = "y", descriptor = "F")
	private float aFloat5;

	@OriginalMember(owner = "client!cb", name = "A", descriptor = "[I")
	private int[] anIntArray44;

	@OriginalMember(owner = "client!cb", name = "F", descriptor = "I")
	private int anInt524;

	@OriginalMember(owner = "client!cb", name = "O", descriptor = "I")
	private int anInt528;

	@OriginalMember(owner = "client!cb", name = "H", descriptor = "Z")
	public boolean aBoolean36 = false;

	@OriginalMember(owner = "client!cb", name = "E", descriptor = "I")
	private int anInt523 = -1;

	@OriginalMember(owner = "client!cb", name = "C", descriptor = "I")
	private int anInt521 = 0;

	@OriginalMember(owner = "client!cb", name = "L", descriptor = "Lclient!ud;")
	public Class1_Sub1_Sub23 aClass1_Sub1_Sub23_1;

	@OriginalMember(owner = "client!cb", name = "x", descriptor = "Z")
	private boolean aBoolean34;

	@OriginalMember(owner = "client!cb", name = "J", descriptor = "Z")
	private boolean aBoolean37;

	@OriginalMember(owner = "client!cb", name = "w", descriptor = "Z")
	private boolean aBoolean33;

	@OriginalMember(owner = "client!cb", name = "K", descriptor = "Z")
	private boolean aBoolean38;

	@OriginalMember(owner = "client!cb", name = "G", descriptor = "I")
	private int anInt525;

	@OriginalMember(owner = "client!cb", name = "M", descriptor = "I")
	private int anInt527;

	@OriginalMember(owner = "client!cb", name = "B", descriptor = "Z")
	private boolean aBoolean35;

	@OriginalMember(owner = "client!cb", name = "D", descriptor = "I")
	private int anInt522;

	@OriginalMember(owner = "client!cb", name = "I", descriptor = "I")
	private int anInt526;

	@OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(Lclient!sb;)V")
	public Class1_Sub1_Sub5(@OriginalArg(0) Class1_Sub14 arg0) {
		this.aClass1_Sub1_Sub23_1 = new Class1_Sub1_Sub23(arg0);
		this.aBoolean34 = arg0.method2595() == 1;
		this.aBoolean37 = arg0.method2595() == 1;
		this.aBoolean33 = arg0.method2595() == 1;
		this.aBoolean38 = arg0.method2595() == 1;
		@Pc(62) int local62 = arg0.method2595() & 0x3;
		this.anInt525 = arg0.method2598();
		this.anInt527 = arg0.method2598();
		@Pc(76) int local76 = arg0.method2595();
		arg0.method2595();
		this.aBoolean35 = arg0.method2595() == 1;
		this.anInt522 = local76 >> 4 & 0xF;
		if (local62 == 1) {
			this.anInt526 = 2;
		} else if (local62 == 2) {
			this.anInt526 = 3;
		} else if (local62 == 3) {
			this.anInt526 = 4;
		} else {
			this.anInt526 = 0;
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lclient!pe;Lclient!ph;FZ)[I")
	public int[] method501(@OriginalArg(0) Interface5 arg0, @OriginalArg(1) Class138 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) boolean arg3) {
		if (this.anIntArray44 == null || this.aFloat5 != arg2) {
			if (!this.aClass1_Sub1_Sub23_1.method4216(arg1, arg0)) {
				return null;
			}
			this.anInt524 = arg3 ? 64 : 128;
			this.anIntArray44 = this.aClass1_Sub1_Sub23_1.method4215(arg1, true, this.anInt524, arg0, this.anInt524, (double) arg2, this.aBoolean37);
			this.aFloat5 = arg2;
			if (this.aBoolean34) {
				@Pc(50) int[] local50 = new int[this.anInt524];
				@Pc(54) int[] local54 = new int[this.anInt524];
				@Pc(58) int[] local58 = new int[this.anInt524];
				@Pc(65) int[] local65 = new int[this.anInt524 * this.anInt524];
				@Pc(68) int local68 = this.anInt524;
				@Pc(71) int local71 = this.anInt524;
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
						@Pc(103) int local103 = this.anIntArray44[local88];
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
						@Pc(268) int local268 = this.anIntArray44[local88];
						local89--;
						@Pc(274) int local274 = this.anIntArray44[local89];
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
				this.anIntArray44 = local65;
			}
		}
		return this.anIntArray44;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lclient!pe;Lclient!ph;Z)[I")
	public int[] method502(@OriginalArg(0) Interface5 arg0, @OriginalArg(1) Class138 arg1, @OriginalArg(2) boolean arg2) {
		if (this.aClass1_Sub1_Sub23_1.method4216(arg1, arg0)) {
			@Pc(14) int local14 = arg2 ? 64 : 128;
			return this.aClass1_Sub1_Sub23_1.method4215(arg1, false, local14, arg0, local14, 1.0D, this.aBoolean37);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lclient!pe;Lclient!ph;I)Z")
	public boolean method503(@OriginalArg(0) Interface5 arg0, @OriginalArg(1) Class138 arg1, @OriginalArg(2) int arg2) {
		if (!this.aClass1_Sub1_Sub23_1.method4216(arg1, arg0)) {
			return false;
		}
		@Pc(10) GL local10 = Static291.aGL1;
		@Pc(13) int local13 = Static250.method2599();
		if ((local13 & 0x1) == 0) {
			if (this.anInt523 != -1 && this.anInt524 == arg2) {
				Static291.method4310(this.anInt523);
			} else {
				if (this.anInt523 == -1) {
					@Pc(32) int[] local32 = new int[1];
					local10.glGenTextures(1, local32, 0);
					this.anInt523 = local32[0];
					this.anInt528 = Static74.anInt1419;
				}
				Static291.method4310(this.anInt523);
				if (this.aBoolean35 && Static266.method3963()) {
					@Pc(64) float[] local64 = this.aClass1_Sub1_Sub23_1.method4214(arg2, arg2, this.aBoolean37, arg1, arg0);
					if (this.anInt522 == 2) {
						Static28.method505(Static160.anInt3367, Static160.anInt3373, arg2, arg2, Static160.anInt3370, Static160.anInt3380, local64);
						local10.glTexParameteri(3553, 10241, 9987);
						local10.glTexParameteri(3553, 10240, 9729);
						Static74.anInt1418 += local64.length * 4 / 3 - this.anInt521;
						this.anInt521 = local64.length * 4 / 3;
					} else {
						local10.glTexImage2D(3553, 0, 34842, arg2, arg2, 0, 6408, 5126, FloatBuffer.wrap(local64));
						local10.glTexParameteri(3553, 10241, 9729);
						local10.glTexParameteri(3553, 10240, 9729);
						Static74.anInt1418 += local64.length - this.anInt521;
						this.anInt521 = local64.length;
					}
				} else {
					@Pc(148) int local148 = Static291.aBoolean413 ? 33639 : 5121;
					@Pc(160) int[] local160 = this.aClass1_Sub1_Sub23_1.method4217(arg0, arg2, arg2, this.aBoolean37, 0.7D, arg1);
					if (this.anInt522 == 2) {
						Static28.method499(Static160.anInt3367, Static160.anInt3370, arg2, arg2, Static160.anInt3371, local148, local160);
						local10.glTexParameteri(3553, 10241, 9987);
						local10.glTexParameteri(3553, 10240, 9729);
						Static74.anInt1418 += local160.length * 4 / 3 - this.anInt521;
						this.anInt521 = local160.length * 4 / 3;
					} else if (this.anInt522 == 1) {
						@Pc(209) int local209 = 0;
						while (true) {
							local10.glTexImage2D(3553, local209++, 6408, arg2, arg2, 0, 32993, local148, IntBuffer.wrap(local160));
							arg2 >>= 0x1;
							if (arg2 == 0) {
								local10.glTexParameteri(3553, 10241, 9987);
								local10.glTexParameteri(3553, 10240, 9729);
								Static74.anInt1418 += local160.length * 4 / 3 - this.anInt521;
								this.anInt521 = local160.length * 4 / 3;
								break;
							}
							local160 = this.aClass1_Sub1_Sub23_1.method4217(arg0, arg2, arg2, this.aBoolean37, 0.7D, arg1);
						}
					} else {
						local10.glTexImage2D(3553, 0, 6408, arg2, arg2, 0, 32993, local148, IntBuffer.wrap(local160));
						local10.glTexParameteri(3553, 10241, 9729);
						local10.glTexParameteri(3553, 10240, 9729);
						Static74.anInt1418 += local160.length - this.anInt521;
						this.anInt521 = local160.length;
					}
				}
				local10.glTexParameteri(3553, 10242, this.aBoolean33 ? 10497 : 33071);
				local10.glTexParameteri(3553, 10243, this.aBoolean38 ? 10497 : 33071);
				this.anInt524 = arg2;
			}
		}
		if ((local13 & 0x2) == 0) {
			Static291.method4296(this.anInt526);
		}
		if ((local13 & 0x4) == 0) {
			Static291.method4323(0);
		}
		if ((local13 & 0x8) == 0) {
			if (this.anInt527 == 0 && this.anInt525 == 0) {
				Static291.method4297();
			} else {
				@Pc(367) float local367 = (float) (Static291.anInt5513 * this.anInt527) / (float) this.anInt524;
				@Pc(377) float local377 = (float) (Static291.anInt5513 * this.anInt525) / (float) this.anInt524;
				Static291.method4303(local377, local367, 0.0F);
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!cb", name = "f", descriptor = "(I)V")
	public void method504(@OriginalArg(0) int arg0) {
		if (this.anIntArray44 == null || this.anInt527 == 0 && this.anInt525 == 0) {
			return;
		}
		if (Static28.anIntArray43 == null || Static28.anIntArray43.length < this.anIntArray44.length) {
			Static28.anIntArray43 = new int[this.anIntArray44.length];
		}
		@Pc(26) int local26 = this.anIntArray44.length;
		@Pc(31) int local31 = arg0 * this.anInt525;
		@Pc(36) int local36 = this.anInt524 - 1;
		@Pc(44) int local44 = this.anInt524 * arg0 * this.anInt527;
		@Pc(48) int local48 = local26 - 1;
		for (@Pc(50) int local50 = 0; local50 < local26; local50 += this.anInt524) {
			@Pc(59) int local59 = local50 + local44 & local48;
			for (@Pc(61) int local61 = 0; local61 < this.anInt524; local61++) {
				@Pc(69) int local69 = local50 + local61;
				@Pc(77) int local77 = local59 + (local61 + local31 & local36);
				Static28.anIntArray43[local69] = this.anIntArray44[local77];
			}
		}
		@Pc(95) int[] local95 = this.anIntArray44;
		this.anIntArray44 = Static28.anIntArray43;
		Static28.anIntArray43 = local95;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lclient!pe;Lclient!ph;)Z")
	public boolean method506(@OriginalArg(0) Interface5 arg0, @OriginalArg(1) Class138 arg1) {
		return this.aClass1_Sub1_Sub23_1.method4216(arg1, arg0);
	}

	@OriginalMember(owner = "client!cb", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.anInt523 != -1) {
			Static74.method1189(this.anInt523, this.anInt521, this.anInt528);
			this.anInt523 = -1;
			this.anInt521 = 0;
		}
		super.finalize();
	}
}

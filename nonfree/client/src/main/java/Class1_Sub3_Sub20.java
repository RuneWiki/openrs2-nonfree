import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!to")
public final class Class1_Sub3_Sub20 extends Class1_Sub3 {

	@OriginalMember(owner = "client!to", name = "I", descriptor = "[I")
	private int[] anIntArray492;

	@OriginalMember(owner = "client!to", name = "J", descriptor = "I")
	private int anInt5485;

	@OriginalMember(owner = "client!to", name = "K", descriptor = "I")
	private int anInt5486;

	@OriginalMember(owner = "client!to", name = "R", descriptor = "F")
	private float aFloat52;

	@OriginalMember(owner = "client!to", name = "U", descriptor = "I")
	private int anInt5490 = 0;

	@OriginalMember(owner = "client!to", name = "V", descriptor = "I")
	private int anInt5491 = -1;

	@OriginalMember(owner = "client!to", name = "X", descriptor = "Z")
	public boolean aBoolean343 = false;

	@OriginalMember(owner = "client!to", name = "P", descriptor = "Lclient!jb;")
	public Class1_Sub3_Sub9 aClass1_Sub3_Sub9_1;

	@OriginalMember(owner = "client!to", name = "N", descriptor = "Z")
	private boolean aBoolean341;

	@OriginalMember(owner = "client!to", name = "M", descriptor = "Z")
	private boolean aBoolean340;

	@OriginalMember(owner = "client!to", name = "W", descriptor = "Z")
	private boolean aBoolean342;

	@OriginalMember(owner = "client!to", name = "L", descriptor = "Z")
	private boolean aBoolean339;

	@OriginalMember(owner = "client!to", name = "O", descriptor = "I")
	private int anInt5487;

	@OriginalMember(owner = "client!to", name = "Z", descriptor = "I")
	private int anInt5492;

	@OriginalMember(owner = "client!to", name = "Y", descriptor = "Z")
	private boolean aBoolean344;

	@OriginalMember(owner = "client!to", name = "Q", descriptor = "I")
	private int anInt5488;

	@OriginalMember(owner = "client!to", name = "S", descriptor = "I")
	private int anInt5489;

	@OriginalMember(owner = "client!to", name = "<init>", descriptor = "(Lclient!qm;)V")
	public Class1_Sub3_Sub20(@OriginalArg(0) Class1_Sub14 arg0) {
		this.aClass1_Sub3_Sub9_1 = new Class1_Sub3_Sub9(arg0);
		this.aBoolean341 = arg0.method2199() == 1;
		this.aBoolean340 = arg0.method2199() == 1;
		this.aBoolean342 = arg0.method2199() == 1;
		this.aBoolean339 = arg0.method2199() == 1;
		@Pc(62) int local62 = arg0.method2199() & 0x3;
		this.anInt5487 = arg0.method2212();
		this.anInt5492 = arg0.method2212();
		@Pc(76) int local76 = arg0.method2199();
		arg0.method2199();
		this.aBoolean344 = arg0.method2199() == 1;
		this.anInt5488 = local76 >> 4 & 0xF;
		if (local62 == 1) {
			this.anInt5489 = 2;
		} else if (local62 == 2) {
			this.anInt5489 = 3;
		} else if (local62 == 3) {
			this.anInt5489 = 4;
		} else {
			this.anInt5489 = 0;
		}
	}

	@OriginalMember(owner = "client!to", name = "e", descriptor = "(I)V")
	public void method4152(@OriginalArg(0) int arg0) {
		if (this.anIntArray492 == null || this.anInt5492 == 0 && this.anInt5487 == 0) {
			return;
		}
		if (Static274.anIntArray493 == null || Static274.anIntArray493.length < this.anIntArray492.length) {
			Static274.anIntArray493 = new int[this.anIntArray492.length];
		}
		@Pc(26) int local26 = this.anIntArray492.length;
		@Pc(31) int local31 = arg0 * this.anInt5487;
		@Pc(36) int local36 = this.anInt5486 - 1;
		@Pc(44) int local44 = this.anInt5486 * arg0 * this.anInt5492;
		@Pc(48) int local48 = local26 - 1;
		for (@Pc(50) int local50 = 0; local50 < local26; local50 += this.anInt5486) {
			@Pc(59) int local59 = local50 + local44 & local48;
			for (@Pc(61) int local61 = 0; local61 < this.anInt5486; local61++) {
				@Pc(69) int local69 = local50 + local61;
				@Pc(77) int local77 = local59 + (local61 + local31 & local36);
				Static274.anIntArray493[local69] = this.anIntArray492[local77];
			}
		}
		@Pc(95) int[] local95 = this.anIntArray492;
		this.anIntArray492 = Static274.anIntArray493;
		Static274.anIntArray493 = local95;
	}

	@OriginalMember(owner = "client!to", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.anInt5491 != -1) {
			Static113.method1837(this.anInt5491, this.anInt5490, this.anInt5485);
			this.anInt5491 = -1;
			this.anInt5490 = 0;
		}
		super.finalize();
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(Lclient!la;Lclient!th;)Z")
	public boolean method4154(@OriginalArg(0) Interface3 arg0, @OriginalArg(1) Class168 arg1) {
		return this.aClass1_Sub3_Sub9_1.method2039(arg0, arg1);
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(Lclient!la;Lclient!th;I)Z")
	public boolean method4155(@OriginalArg(0) Interface3 arg0, @OriginalArg(1) Class168 arg1, @OriginalArg(2) int arg2) {
		if (!this.aClass1_Sub3_Sub9_1.method2039(arg0, arg1)) {
			return false;
		}
		@Pc(10) GL local10 = Static294.aGL1;
		@Pc(13) int local13 = Static308.method4678();
		if ((local13 & 0x1) == 0) {
			if (this.anInt5491 != -1 && this.anInt5486 == arg2) {
				Static294.method4486(this.anInt5491);
			} else {
				if (this.anInt5491 == -1) {
					@Pc(32) int[] local32 = new int[1];
					local10.glGenTextures(1, local32, 0);
					this.anInt5491 = local32[0];
					this.anInt5485 = Static113.anInt2464;
				}
				Static294.method4486(this.anInt5491);
				if (this.aBoolean344 && Static314.method4745()) {
					@Pc(64) float[] local64 = this.aClass1_Sub3_Sub9_1.method2037(arg1, arg2, arg0, this.aBoolean340, arg2);
					if (this.anInt5488 == 2) {
						Static274.method4151(Static201.anInt4366, Static201.anInt4372, arg2, arg2, Static201.anInt4369, Static201.anInt4379, local64);
						local10.glTexParameteri(3553, 10241, 9987);
						local10.glTexParameteri(3553, 10240, 9729);
						Static113.anInt2465 += local64.length * 4 / 3 - this.anInt5490;
						this.anInt5490 = local64.length * 4 / 3;
					} else {
						local10.glTexImage2D(3553, 0, 34842, arg2, arg2, 0, 6408, 5126, FloatBuffer.wrap(local64));
						local10.glTexParameteri(3553, 10241, 9729);
						local10.glTexParameteri(3553, 10240, 9729);
						Static113.anInt2465 += local64.length - this.anInt5490;
						this.anInt5490 = local64.length;
					}
				} else {
					@Pc(148) int local148 = Static294.aBoolean377 ? 33639 : 5121;
					@Pc(160) int[] local160 = this.aClass1_Sub3_Sub9_1.method2033(0.7D, arg1, this.aBoolean340, arg2, arg0, arg2);
					if (this.anInt5488 == 2) {
						Static274.method4153(Static201.anInt4366, Static201.anInt4369, arg2, arg2, Static201.anInt4370, local148, local160);
						local10.glTexParameteri(3553, 10241, 9987);
						local10.glTexParameteri(3553, 10240, 9729);
						Static113.anInt2465 += local160.length * 4 / 3 - this.anInt5490;
						this.anInt5490 = local160.length * 4 / 3;
					} else if (this.anInt5488 == 1) {
						@Pc(209) int local209 = 0;
						while (true) {
							local10.glTexImage2D(3553, local209++, 6408, arg2, arg2, 0, 32993, local148, IntBuffer.wrap(local160));
							arg2 >>= 0x1;
							if (arg2 == 0) {
								local10.glTexParameteri(3553, 10241, 9987);
								local10.glTexParameteri(3553, 10240, 9729);
								Static113.anInt2465 += local160.length * 4 / 3 - this.anInt5490;
								this.anInt5490 = local160.length * 4 / 3;
								break;
							}
							local160 = this.aClass1_Sub3_Sub9_1.method2033(0.7D, arg1, this.aBoolean340, arg2, arg0, arg2);
						}
					} else {
						local10.glTexImage2D(3553, 0, 6408, arg2, arg2, 0, 32993, local148, IntBuffer.wrap(local160));
						local10.glTexParameteri(3553, 10241, 9729);
						local10.glTexParameteri(3553, 10240, 9729);
						Static113.anInt2465 += local160.length - this.anInt5490;
						this.anInt5490 = local160.length;
					}
				}
				local10.glTexParameteri(3553, 10242, this.aBoolean342 ? 10497 : 33071);
				local10.glTexParameteri(3553, 10243, this.aBoolean339 ? 10497 : 33071);
				this.anInt5486 = arg2;
			}
		}
		if ((local13 & 0x2) == 0) {
			Static294.method4488(this.anInt5489);
		}
		if ((local13 & 0x4) == 0) {
			Static294.method4490(0);
		}
		if ((local13 & 0x8) == 0) {
			if (this.anInt5492 == 0 && this.anInt5487 == 0) {
				Static294.method4512();
			} else {
				@Pc(367) float local367 = (float) (Static294.anInt5871 * this.anInt5492) / (float) this.anInt5486;
				@Pc(377) float local377 = (float) (Static294.anInt5871 * this.anInt5487) / (float) this.anInt5486;
				Static294.method4517(local377, local367, 0.0F);
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(Lclient!la;Lclient!th;Z)[I")
	public int[] method4156(@OriginalArg(0) Interface3 arg0, @OriginalArg(1) Class168 arg1, @OriginalArg(2) boolean arg2) {
		if (this.aClass1_Sub3_Sub9_1.method2039(arg0, arg1)) {
			@Pc(14) int local14 = arg2 ? 64 : 128;
			return this.aClass1_Sub3_Sub9_1.method2032(arg0, local14, this.aBoolean340, local14, 1.0D, false, arg1);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(Lclient!la;Lclient!th;FZ)[I")
	public int[] method4157(@OriginalArg(0) Interface3 arg0, @OriginalArg(1) Class168 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) boolean arg3) {
		if (this.anIntArray492 == null || this.aFloat52 != arg2) {
			if (!this.aClass1_Sub3_Sub9_1.method2039(arg0, arg1)) {
				return null;
			}
			this.anInt5486 = arg3 ? 64 : 128;
			this.anIntArray492 = this.aClass1_Sub3_Sub9_1.method2032(arg0, this.anInt5486, this.aBoolean340, this.anInt5486, (double) arg2, true, arg1);
			this.aFloat52 = arg2;
			if (this.aBoolean341) {
				@Pc(50) int[] local50 = new int[this.anInt5486];
				@Pc(54) int[] local54 = new int[this.anInt5486];
				@Pc(58) int[] local58 = new int[this.anInt5486];
				@Pc(65) int[] local65 = new int[this.anInt5486 * this.anInt5486];
				@Pc(68) int local68 = this.anInt5486;
				@Pc(71) int local71 = this.anInt5486;
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
						@Pc(103) int local103 = this.anIntArray492[local88];
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
						@Pc(268) int local268 = this.anIntArray492[local88];
						local89--;
						@Pc(274) int local274 = this.anIntArray492[local89];
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
				this.anIntArray492 = local65;
			}
		}
		return this.anIntArray492;
	}
}

import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nh")
public final class Class2_Sub3_Sub19 extends Class2_Sub3 {

	@OriginalMember(owner = "client!nh", name = "J", descriptor = "I")
	private int anInt3750;

	@OriginalMember(owner = "client!nh", name = "L", descriptor = "I")
	private int anInt3751;

	@OriginalMember(owner = "client!nh", name = "N", descriptor = "F")
	private float aFloat38;

	@OriginalMember(owner = "client!nh", name = "S", descriptor = "[I")
	private int[] anIntArray301;

	@OriginalMember(owner = "client!nh", name = "P", descriptor = "Z")
	public boolean aBoolean315 = false;

	@OriginalMember(owner = "client!nh", name = "O", descriptor = "I")
	private int anInt3752 = 0;

	@OriginalMember(owner = "client!nh", name = "W", descriptor = "I")
	private int anInt3756 = -1;

	@OriginalMember(owner = "client!nh", name = "G", descriptor = "Lclient!fb;")
	public Class2_Sub3_Sub4 aClass2_Sub3_Sub4_1;

	@OriginalMember(owner = "client!nh", name = "M", descriptor = "Z")
	private boolean aBoolean314;

	@OriginalMember(owner = "client!nh", name = "H", descriptor = "Z")
	private boolean aBoolean312;

	@OriginalMember(owner = "client!nh", name = "T", descriptor = "Z")
	private boolean aBoolean317;

	@OriginalMember(owner = "client!nh", name = "K", descriptor = "Z")
	private boolean aBoolean313;

	@OriginalMember(owner = "client!nh", name = "Q", descriptor = "I")
	private int anInt3753;

	@OriginalMember(owner = "client!nh", name = "V", descriptor = "I")
	private int anInt3755;

	@OriginalMember(owner = "client!nh", name = "R", descriptor = "Z")
	private boolean aBoolean316;

	@OriginalMember(owner = "client!nh", name = "U", descriptor = "I")
	private int anInt3754;

	@OriginalMember(owner = "client!nh", name = "E", descriptor = "I")
	private int anInt3749;

	@OriginalMember(owner = "client!nh", name = "<init>", descriptor = "(Lclient!wm;)V")
	public Class2_Sub3_Sub19(@OriginalArg(0) Class2_Sub26 arg0) {
		this.aClass2_Sub3_Sub4_1 = new Class2_Sub3_Sub4(arg0);
		this.aBoolean314 = arg0.method4261() == 1;
		this.aBoolean312 = arg0.method4261() == 1;
		this.aBoolean317 = arg0.method4261() == 1;
		this.aBoolean313 = arg0.method4261() == 1;
		@Pc(62) int local62 = arg0.method4261() & 0x3;
		this.anInt3753 = arg0.method4220();
		this.anInt3755 = arg0.method4220();
		@Pc(76) int local76 = arg0.method4261();
		arg0.method4261();
		this.aBoolean316 = arg0.method4261() == 1;
		this.anInt3754 = local76 >> 4 & 0xF;
		if (local62 == 1) {
			this.anInt3749 = 2;
		} else if (local62 == 2) {
			this.anInt3749 = 3;
		} else if (local62 == 3) {
			this.anInt3749 = 4;
		} else {
			this.anInt3749 = 0;
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lclient!em;Lclient!jd;)Z")
	public boolean method3028(@OriginalArg(0) Interface1 arg0, @OriginalArg(1) Class84 arg1) {
		return this.aClass2_Sub3_Sub4_1.method1289(arg1, arg0);
	}

	@OriginalMember(owner = "client!nh", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.anInt3756 != -1) {
			Static256.method4129(this.anInt3756, this.anInt3752, this.anInt3751);
			this.anInt3756 = -1;
			this.anInt3752 = 0;
		}
		super.finalize();
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lclient!em;Lclient!jd;FZ)[I")
	public int[] method3029(@OriginalArg(0) Interface1 arg0, @OriginalArg(1) Class84 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) boolean arg3) {
		if (this.anIntArray301 == null || this.aFloat38 != arg2) {
			if (!this.aClass2_Sub3_Sub4_1.method1289(arg1, arg0)) {
				return null;
			}
			this.anInt3750 = arg3 ? 64 : 128;
			this.anIntArray301 = this.aClass2_Sub3_Sub4_1.method1288(this.anInt3750, arg1, this.aBoolean312, true, arg0, (double) arg2, this.anInt3750);
			this.aFloat38 = arg2;
			if (this.aBoolean314) {
				@Pc(50) int[] local50 = new int[this.anInt3750];
				@Pc(54) int[] local54 = new int[this.anInt3750];
				@Pc(58) int[] local58 = new int[this.anInt3750];
				@Pc(65) int[] local65 = new int[this.anInt3750 * this.anInt3750];
				@Pc(68) int local68 = this.anInt3750;
				@Pc(71) int local71 = this.anInt3750;
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
						@Pc(103) int local103 = this.anIntArray301[local88];
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
						@Pc(268) int local268 = this.anIntArray301[local88];
						local89--;
						@Pc(274) int local274 = this.anIntArray301[local89];
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
				this.anIntArray301 = local65;
			}
		}
		return this.anIntArray301;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lclient!em;Lclient!jd;Z)[I")
	public int[] method3031(@OriginalArg(0) Interface1 arg0, @OriginalArg(1) Class84 arg1, @OriginalArg(2) boolean arg2) {
		if (this.aClass2_Sub3_Sub4_1.method1289(arg1, arg0)) {
			@Pc(14) int local14 = arg2 ? 64 : 128;
			return this.aClass2_Sub3_Sub4_1.method1288(local14, arg1, this.aBoolean312, false, arg0, 1.0D, local14);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!nh", name = "d", descriptor = "(I)V")
	public void method3034(@OriginalArg(0) int arg0) {
		if (this.anIntArray301 == null || this.anInt3755 == 0 && this.anInt3753 == 0) {
			return;
		}
		if (Static175.anIntArray300 == null || Static175.anIntArray300.length < this.anIntArray301.length) {
			Static175.anIntArray300 = new int[this.anIntArray301.length];
		}
		@Pc(26) int local26 = this.anIntArray301.length;
		@Pc(31) int local31 = arg0 * this.anInt3753;
		@Pc(36) int local36 = this.anInt3750 - 1;
		@Pc(44) int local44 = this.anInt3750 * arg0 * this.anInt3755;
		@Pc(48) int local48 = local26 - 1;
		for (@Pc(50) int local50 = 0; local50 < local26; local50 += this.anInt3750) {
			@Pc(59) int local59 = local50 + local44 & local48;
			for (@Pc(61) int local61 = 0; local61 < this.anInt3750; local61++) {
				@Pc(69) int local69 = local50 + local61;
				@Pc(77) int local77 = local59 + (local61 + local31 & local36);
				Static175.anIntArray300[local69] = this.anIntArray301[local77];
			}
		}
		@Pc(95) int[] local95 = this.anIntArray301;
		this.anIntArray301 = Static175.anIntArray300;
		Static175.anIntArray300 = local95;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lclient!em;Lclient!jd;I)Z")
	public boolean method3035(@OriginalArg(0) Interface1 arg0, @OriginalArg(1) Class84 arg1, @OriginalArg(2) int arg2) {
		if (!this.aClass2_Sub3_Sub4_1.method1289(arg1, arg0)) {
			return false;
		}
		@Pc(10) GL local10 = Static60.aGL1;
		@Pc(13) int local13 = Static115.method2111();
		if ((local13 & 0x1) == 0) {
			if (this.anInt3756 != -1 && this.anInt3750 == arg2) {
				Static60.method1157(this.anInt3756);
			} else {
				if (this.anInt3756 == -1) {
					@Pc(32) int[] local32 = new int[1];
					local10.glGenTextures(1, local32, 0);
					this.anInt3756 = local32[0];
					this.anInt3751 = Static256.anInt5185;
				}
				Static60.method1157(this.anInt3756);
				if (this.aBoolean316 && Static276.method4597()) {
					@Pc(64) float[] local64 = this.aClass2_Sub3_Sub4_1.method1287(arg2, this.aBoolean312, arg2, arg0, arg1);
					if (this.anInt3754 == 2) {
						Static175.method3032(Static48.anInt1118, Static48.anInt1124, arg2, arg2, Static48.anInt1121, Static48.anInt1131, local64);
						local10.glTexParameteri(3553, 10241, 9987);
						local10.glTexParameteri(3553, 10240, 9729);
						Static256.anInt5188 += local64.length * 4 / 3 - this.anInt3752;
						this.anInt3752 = local64.length * 4 / 3;
					} else {
						local10.glTexImage2D(3553, 0, 34842, arg2, arg2, 0, 6408, 5126, FloatBuffer.wrap(local64));
						local10.glTexParameteri(3553, 10241, 9729);
						local10.glTexParameteri(3553, 10240, 9729);
						Static256.anInt5188 += local64.length - this.anInt3752;
						this.anInt3752 = local64.length;
					}
				} else {
					@Pc(148) int local148 = Static60.aBoolean114 ? 33639 : 5121;
					@Pc(160) int[] local160 = this.aClass2_Sub3_Sub4_1.method1286(this.aBoolean312, arg2, arg0, arg2, 0.7D, arg1);
					if (this.anInt3754 == 2) {
						Static175.method3030(Static48.anInt1118, Static48.anInt1121, arg2, arg2, Static48.anInt1122, local148, local160);
						local10.glTexParameteri(3553, 10241, 9987);
						local10.glTexParameteri(3553, 10240, 9729);
						Static256.anInt5188 += local160.length * 4 / 3 - this.anInt3752;
						this.anInt3752 = local160.length * 4 / 3;
					} else if (this.anInt3754 == 1) {
						@Pc(209) int local209 = 0;
						while (true) {
							local10.glTexImage2D(3553, local209++, 6408, arg2, arg2, 0, 32993, local148, IntBuffer.wrap(local160));
							arg2 >>= 0x1;
							if (arg2 == 0) {
								local10.glTexParameteri(3553, 10241, 9987);
								local10.glTexParameteri(3553, 10240, 9729);
								Static256.anInt5188 += local160.length * 4 / 3 - this.anInt3752;
								this.anInt3752 = local160.length * 4 / 3;
								break;
							}
							local160 = this.aClass2_Sub3_Sub4_1.method1286(this.aBoolean312, arg2, arg0, arg2, 0.7D, arg1);
						}
					} else {
						local10.glTexImage2D(3553, 0, 6408, arg2, arg2, 0, 32993, local148, IntBuffer.wrap(local160));
						local10.glTexParameteri(3553, 10241, 9729);
						local10.glTexParameteri(3553, 10240, 9729);
						Static256.anInt5188 += local160.length - this.anInt3752;
						this.anInt3752 = local160.length;
					}
				}
				local10.glTexParameteri(3553, 10242, this.aBoolean317 ? 10497 : 33071);
				local10.glTexParameteri(3553, 10243, this.aBoolean313 ? 10497 : 33071);
				this.anInt3750 = arg2;
			}
		}
		if ((local13 & 0x2) == 0) {
			Static60.method1139(this.anInt3749);
		}
		if ((local13 & 0x4) == 0) {
			Static60.method1168(0);
		}
		if ((local13 & 0x8) == 0) {
			if (this.anInt3755 == 0 && this.anInt3753 == 0) {
				Static60.method1172();
			} else {
				@Pc(367) float local367 = (float) (Static60.anInt1340 * this.anInt3755) / (float) this.anInt3750;
				@Pc(377) float local377 = (float) (Static60.anInt1340 * this.anInt3753) / (float) this.anInt3750;
				Static60.method1138(local377, local367, 0.0F);
			}
		}
		return true;
	}
}

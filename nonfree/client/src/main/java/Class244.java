import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mq")
public final class Class244 {

	@OriginalMember(owner = "client!mq", name = "d", descriptor = "[[Lclient!kea;")
	private Class202[][] aClass202ArrayArray1;

	@OriginalMember(owner = "client!mq", name = "i", descriptor = "Lclient!gia;")
	private final Class67_Sub2 aClass67_Sub2_26;

	@OriginalMember(owner = "client!mq", name = "h", descriptor = "Lclient!vr;")
	private final Class313_Sub3 aClass313_Sub3_3;

	@OriginalMember(owner = "client!mq", name = "f", descriptor = "I")
	public final int anInt7175;

	@OriginalMember(owner = "client!mq", name = "k", descriptor = "I")
	private final int anInt7179;

	@OriginalMember(owner = "client!mq", name = "b", descriptor = "I")
	private final int anInt7180;

	@OriginalMember(owner = "client!mq", name = "e", descriptor = "[B")
	public final byte[] aByteArray57;

	@OriginalMember(owner = "client!mq", name = "j", descriptor = "I")
	private final int anInt7181;

	@OriginalMember(owner = "client!mq", name = "c", descriptor = "I")
	private final int anInt7177;

	@OriginalMember(owner = "client!mq", name = "<init>", descriptor = "(Lclient!gia;Lclient!vr;)V")
	public Class244(@OriginalArg(0) Class67_Sub2 arg0, @OriginalArg(1) Class313_Sub3 arg1) {
		this.aClass67_Sub2_26 = arg0;
		this.aClass313_Sub3_3 = arg1;
		this.anInt7175 = (this.aClass313_Sub3_3.anInt10875 * this.aClass313_Sub3_3.anInt10871 >> this.aClass67_Sub2_26.anInt3875) + 2;
		this.anInt7179 = (this.aClass313_Sub3_3.anInt10872 * this.aClass313_Sub3_3.anInt10871 >> this.aClass67_Sub2_26.anInt3875) + 2;
		this.anInt7180 = this.aClass67_Sub2_26.anInt3875 + 7 - this.aClass313_Sub3_3.anInt10873;
		this.aByteArray57 = new byte[this.anInt7179 * this.anInt7175];
		this.anInt7181 = this.aClass313_Sub3_3.anInt10875 >> this.anInt7180;
		this.anInt7177 = this.aClass313_Sub3_3.anInt10872 >> this.anInt7180;
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(ILclient!r;IB)Z")
	public boolean method6014(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub4_Sub13 arg1, @OriginalArg(2) int arg2) {
		@Pc(6) Class3_Sub4_Sub13_Sub2 local6 = (Class3_Sub4_Sub13_Sub2) arg1;
		arg2 += local6.anInt7455 + 1;
		arg0 += local6.anInt7462 + 1;
		@Pc(27) int local27 = arg0 + this.anInt7175 * arg2;
		@Pc(30) int local30 = local6.anInt7460;
		@Pc(33) int local33 = local6.anInt7457;
		@Pc(42) int local42;
		if (arg2 <= 0) {
			local42 = 1 - arg2;
			local27 += local42 * this.anInt7175;
			arg2 = 1;
			local30 -= local42;
		}
		@Pc(61) int local61 = this.anInt7175 - local33;
		if (local30 + arg2 >= this.anInt7179) {
			local42 = local30 + arg2 + 1 - this.anInt7179;
			local30 -= local42;
		}
		if (arg0 <= 0) {
			local42 = 1 - arg0;
			arg0 = 1;
			local33 -= local42;
			local61 += local42;
			local27 += local42;
		}
		if (this.anInt7175 <= arg0 + local33) {
			local42 = arg0 + local33 + 1 - this.anInt7175;
			local33 -= local42;
			local61 += local42;
		}
		if (local33 > 0 && local30 > 0) {
			local61 += this.anInt7175 * 7;
			return Static489.method7099(local33, this.aByteArray57, local30, local27, local61);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(IIIIB)V")
	private void method6015(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass202ArrayArray1 == null) {
			return;
		}
		@Pc(16) int local16 = arg2 - 1 >> 7;
		@Pc(24) int local24 = arg0 + arg2 - 2 >> 7;
		@Pc(30) int local30 = arg1 - 1 >> 7;
		@Pc(39) int local39 = arg1 + arg3 - 2 >> 7;
		for (@Pc(41) int local41 = local16; local41 <= local24; local41++) {
			@Pc(48) Class202[] local48 = this.aClass202ArrayArray1[local41];
			for (@Pc(50) int local50 = local30; local50 <= local39; local50++) {
				local48[local50].aBoolean470 = true;
			}
		}
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(Lclient!r;III)V")
	public void method6016(@OriginalArg(0) Class3_Sub4_Sub13 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(6) Class3_Sub4_Sub13_Sub2 local6 = (Class3_Sub4_Sub13_Sub2) arg0;
		arg1 += local6.anInt7455 + 1;
		arg2 += local6.anInt7462 + 1;
		@Pc(32) int local32 = arg1 * this.anInt7175 + arg2;
		@Pc(34) int local34 = 0;
		@Pc(37) int local37 = local6.anInt7460;
		@Pc(40) int local40 = local6.anInt7457;
		@Pc(46) int local46 = this.anInt7175 - local40;
		@Pc(52) int local52;
		if (arg1 <= 0) {
			local52 = 1 - arg1;
			local34 = local40 * local52;
			arg1 = 1;
			local37 -= local52;
			local32 += local52 * this.anInt7175;
		}
		@Pc(73) int local73 = 0;
		if (arg1 + local37 >= this.anInt7179) {
			local52 = arg1 + local37 + 1 - this.anInt7179;
			local37 -= local52;
		}
		if (arg2 <= 0) {
			local52 = 1 - arg2;
			local32 += local52;
			local46 += local52;
			local40 -= local52;
			local34 += local52;
			local73 = local52;
			arg2 = 1;
		}
		if (arg2 + local40 >= this.anInt7175) {
			local52 = local40 + arg2 + 1 - this.anInt7175;
			local46 += local52;
			local73 += local52;
			local40 -= local52;
		}
		if (local40 > 0 && local37 > 0) {
			Static97.method1290(local37, local40, local32, this.aByteArray57, local73, local34, local46, local6.aByteArray59);
			this.method6015(local40, arg1, arg2, local37);
		}
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(IIBLclient!r;)V")
	public void method6017(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class3_Sub4_Sub13 arg2) {
		@Pc(6) Class3_Sub4_Sub13_Sub2 local6 = (Class3_Sub4_Sub13_Sub2) arg2;
		arg1 += local6.anInt7455 + 1;
		arg0 += local6.anInt7462 + 1;
		@Pc(27) int local27 = arg1 * this.anInt7175 + arg0;
		@Pc(29) int local29 = 0;
		@Pc(37) int local37 = local6.anInt7460;
		@Pc(40) int local40 = local6.anInt7457;
		@Pc(46) int local46 = this.anInt7175 - local40;
		@Pc(55) int local55;
		if (arg1 <= 0) {
			local55 = 1 - arg1;
			local37 -= local55;
			arg1 = 1;
			local27 += local55 * this.anInt7175;
			local29 = local55 * local40;
		}
		@Pc(76) int local76 = 0;
		if (this.anInt7179 <= arg1 + local37) {
			local55 = arg1 + local37 + 1 - this.anInt7179;
			local37 -= local55;
		}
		if (arg0 <= 0) {
			local55 = 1 - arg0;
			local29 += local55;
			local76 = local55;
			local27 += local55;
			arg0 = 1;
			local40 -= local55;
			local46 += local55;
		}
		if (local40 + arg0 >= this.anInt7175) {
			local55 = arg0 + local40 + 1 - this.anInt7175;
			local76 += local55;
			local46 += local55;
			local40 -= local55;
		}
		if (local40 > 0 && local37 > 0) {
			Static304.method4647(local29, local27, local46, local6.aByteArray59, local40, local37, local76, this.aByteArray57);
			this.method6015(local40, arg1, arg0, local37);
		}
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(IIIZI[[Z)V")
	public void method6019(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean[][] arg4) {
		this.aClass67_Sub2_26.method3299(false);
		this.aClass67_Sub2_26.method3227(false);
		this.aClass67_Sub2_26.method3245(-2);
		this.aClass67_Sub2_26.method3255(1);
		this.aClass67_Sub2_26.method3257(1);
		@Pc(41) float local41 = 1.0F / (float) (this.aClass67_Sub2_26.anInt3877 * 128);
		@Pc(45) int local45;
		@Pc(52) int local52;
		@Pc(59) int local59;
		@Pc(61) int local61;
		@Pc(68) int local68;
		@Pc(75) int local75;
		@Pc(77) int local77;
		if (arg2) {
			for (local45 = 0; local45 < this.anInt7177; local45++) {
				local52 = local45 << this.anInt7180;
				local59 = local45 + 1 << this.anInt7180;
				label128: for (local61 = 0; local61 < this.anInt7181; local61++) {
					local68 = local61 << this.anInt7180;
					local75 = local61 + 1 << this.anInt7180;
					for (local77 = local68; local77 < local75; local77++) {
						if (local77 - arg3 >= -arg0 && arg0 >= local77 - arg3) {
							for (@Pc(106) int local106 = local52; local106 < local59; local106++) {
								if (local106 - arg1 >= -arg0 && arg0 >= local106 - arg1 && arg4[local77 + arg0 - arg3][arg0 + local106 - arg1]) {
									OpenGL.glMatrixMode(5890);
									OpenGL.glLoadIdentity();
									OpenGL.glScalef(local41, local41, 1.0F);
									OpenGL.glTranslatef((float) -local61 / local41, (float) -local45 / local41, 1.0F);
									OpenGL.glMatrixMode(5888);
									this.aClass202ArrayArray1[local61][local45].method4888();
									continue label128;
								}
							}
						}
					}
				}
			}
		} else {
			for (local45 = 0; local45 < this.anInt7177; local45++) {
				local52 = local45 << this.anInt7180;
				local59 = local45 + 1 << this.anInt7180;
				for (local61 = 0; local61 < this.anInt7181; local61++) {
					local68 = 0;
					local75 = local61 << this.anInt7180;
					local77 = local61 + 1 << this.anInt7180;
					@Pc(257) Class3_Sub28_Sub1 local257 = this.aClass67_Sub2_26.aClass3_Sub28_Sub1_3;
					local257.anInt6241 = 0;
					for (@Pc(262) int local262 = local52; local262 < local59; local262++) {
						if (local262 - arg1 >= -arg0 && arg0 >= local262 - arg1) {
							@Pc(289) int local289 = local75 + local262 * this.aClass313_Sub3_3.anInt10875;
							for (@Pc(291) int local291 = local75; local291 < local77; local291++) {
								if (-arg0 <= local291 - arg3 && arg0 >= local291 - arg3 && arg4[local291 + arg0 - arg3][local262 + arg0 - arg1]) {
									@Pc(337) short[] local337 = this.aClass313_Sub3_3.aShortArrayArray6[local289];
									if (local337 != null) {
										@Pc(347) int local347;
										if (this.aClass67_Sub2_26.aBoolean322) {
											for (local347 = 0; local347 < local337.length; local347++) {
												local68++;
												local257.method5282(local337[local347] & 0xFFFF);
											}
										} else {
											for (local347 = 0; local347 < local337.length; local347++) {
												local257.method5280(local337[local347] & 0xFFFF);
												local68++;
											}
										}
									}
								}
								local289++;
							}
						}
					}
					if (local68 > 0) {
						OpenGL.glMatrixMode(5890);
						OpenGL.glLoadIdentity();
						OpenGL.glScalef(local41, local41, 1.0F);
						OpenGL.glTranslatef((float) -local61 / local41, (float) -local45 / local41, 1.0F);
						OpenGL.glMatrixMode(5888);
						this.aClass202ArrayArray1[local61][local45].method4887(local68, local257.aByteArray50);
					}
				}
			}
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(I)V")
	public void method6020() {
		this.aClass202ArrayArray1 = new Class202[this.anInt7181][this.anInt7177];
		for (@Pc(14) int local14 = 0; local14 < this.anInt7177; local14++) {
			for (@Pc(18) int local18 = 0; local18 < this.anInt7181; local18++) {
				this.aClass202ArrayArray1[local18][local14] = new Class202(this.aClass67_Sub2_26, this, this.aClass313_Sub3_3, local18, local14, this.anInt7180, local18 * 128 + 1, local14 * 128 + 1);
			}
		}
	}
}

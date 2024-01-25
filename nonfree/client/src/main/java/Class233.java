import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mj")
public final class Class233 {

	@OriginalMember(owner = "client!mj", name = "j", descriptor = "[[Lclient!ek;")
	private Class95[][] aClass95ArrayArray1;

	@OriginalMember(owner = "client!mj", name = "r", descriptor = "Lclient!pc;")
	private final Class33_Sub3 aClass33_Sub3_20;

	@OriginalMember(owner = "client!mj", name = "l", descriptor = "Lclient!cea;")
	private final Class42_Sub1 aClass42_Sub1_2;

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "I")
	public final int anInt5604;

	@OriginalMember(owner = "client!mj", name = "q", descriptor = "I")
	private final int anInt5615;

	@OriginalMember(owner = "client!mj", name = "b", descriptor = "I")
	private final int anInt5605;

	@OriginalMember(owner = "client!mj", name = "d", descriptor = "[B")
	public final byte[] aByteArray56;

	@OriginalMember(owner = "client!mj", name = "s", descriptor = "I")
	private final int anInt5616;

	@OriginalMember(owner = "client!mj", name = "f", descriptor = "I")
	private final int anInt5608;

	@OriginalMember(owner = "client!mj", name = "<init>", descriptor = "(Lclient!pc;Lclient!cea;)V")
	public Class233(@OriginalArg(0) Class33_Sub3 arg0, @OriginalArg(1) Class42_Sub1 arg1) {
		this.aClass33_Sub3_20 = arg0;
		this.aClass42_Sub1_2 = arg1;
		this.anInt5604 = (this.aClass42_Sub1_2.anInt8631 * this.aClass42_Sub1_2.anInt8638 >> this.aClass33_Sub3_20.anInt7265) + 2;
		this.anInt5615 = (this.aClass42_Sub1_2.anInt8631 * this.aClass42_Sub1_2.anInt8630 >> this.aClass33_Sub3_20.anInt7265) + 2;
		this.anInt5605 = this.aClass33_Sub3_20.anInt7265 + 7 - this.aClass42_Sub1_2.anInt8635;
		this.aByteArray56 = new byte[this.anInt5604 * this.anInt5615];
		this.anInt5616 = this.aClass42_Sub1_2.anInt8638 >> this.anInt5605;
		this.anInt5608 = this.aClass42_Sub1_2.anInt8630 >> this.anInt5605;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(BILclient!r;I)V")
	public void method4934(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub5_Sub9 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class4_Sub5_Sub9_Sub2 local6 = (Class4_Sub5_Sub9_Sub2) arg1;
		arg2 += local6.anInt5831 + 1;
		arg0 += local6.anInt5830 + 1;
		@Pc(28) int local28 = arg2 + this.anInt5604 * arg0;
		@Pc(30) int local30 = 0;
		@Pc(33) int local33 = local6.anInt5826;
		@Pc(36) int local36 = local6.anInt5829;
		@Pc(42) int local42 = this.anInt5604 - local36;
		@Pc(48) int local48;
		if (arg0 <= 0) {
			local48 = 1 - arg0;
			local28 += local48 * this.anInt5604;
			local30 = local36 * local48;
			arg0 = 1;
			local33 -= local48;
		}
		@Pc(69) int local69 = 0;
		if (local33 + arg0 >= this.anInt5615) {
			local48 = local33 + arg0 + 1 - this.anInt5615;
			local33 -= local48;
		}
		if (arg2 <= 0) {
			local48 = 1 - arg2;
			local30 += local48;
			local42 += local48;
			local69 = local48;
			local28 += local48;
			local36 -= local48;
			arg2 = 1;
		}
		if (local36 + arg2 >= this.anInt5604) {
			local48 = local36 + arg2 + 1 - this.anInt5604;
			local69 += local48;
			local42 += local48;
			local36 -= local48;
		}
		if (local36 > 0 && local33 > 0) {
			Static541.method7237(local42, local6.aByteArray57, local36, local69, this.aByteArray56, local33, local28, local30);
			this.method4940(local33, arg2, local36, arg0);
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIII[[ZZ)V")
	public void method4936(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean[][] arg3, @OriginalArg(5) boolean arg4) {
		this.aClass33_Sub3_20.method6296(false);
		this.aClass33_Sub3_20.method6312(false);
		this.aClass33_Sub3_20.method6305(-2);
		this.aClass33_Sub3_20.method6336(1);
		this.aClass33_Sub3_20.method6292(1);
		@Pc(43) float local43 = 1.0F / (float) (this.aClass33_Sub3_20.anInt7263 * 128);
		@Pc(47) int local47;
		@Pc(54) int local54;
		@Pc(61) int local61;
		@Pc(63) int local63;
		@Pc(67) int local67;
		@Pc(72) int local72;
		@Pc(79) int local79;
		if (arg4) {
			for (local47 = 0; local47 < this.anInt5608; local47++) {
				local54 = local47 << this.anInt5605;
				local61 = local47 + 1 << this.anInt5605;
				label81: for (local63 = 0; local63 < this.anInt5616; local63++) {
					local67 = local63 << this.anInt5605;
					local72 = local63 + 1 << this.anInt5605;
					for (local79 = local67; local79 < local72; local79++) {
						if (local79 - arg2 >= -arg1 && arg1 >= local79 - arg2) {
							for (@Pc(325) int local325 = local54; local325 < local61; local325++) {
								if (local325 - arg0 >= -arg1 && local325 - arg0 <= arg1 && arg3[arg1 + local79 - arg2][arg1 + local325 - arg0]) {
									OpenGL.glMatrixMode(5890);
									OpenGL.glLoadIdentity();
									OpenGL.glScalef(local43, local43, 1.0F);
									OpenGL.glTranslatef((float) -local63 / local43, (float) -local47 / local43, 1.0F);
									OpenGL.glMatrixMode(5888);
									this.aClass95ArrayArray1[local63][local47].method2326();
									continue label81;
								}
							}
						}
					}
				}
			}
		} else {
			for (local47 = 0; local47 < this.anInt5608; local47++) {
				local54 = local47 << this.anInt5605;
				local61 = local47 + 1 << this.anInt5605;
				for (local63 = 0; local63 < this.anInt5616; local63++) {
					local67 = 0;
					local72 = local63 << this.anInt5605;
					local79 = local63 + 1 << this.anInt5605;
					@Pc(83) Class4_Sub11_Sub2 local83 = this.aClass33_Sub3_20.aClass4_Sub11_Sub2_3;
					local83.anInt10466 = 0;
					for (@Pc(88) int local88 = local54; local88 < local61; local88++) {
						if (-arg1 <= local88 - arg0 && local88 - arg0 <= arg1) {
							@Pc(114) int local114 = local72 + this.aClass42_Sub1_2.anInt8638 * local88;
							for (@Pc(116) int local116 = local72; local116 < local79; local116++) {
								if (-arg1 <= local116 - arg2 && local116 - arg2 <= arg1 && arg3[arg1 + local116 - arg2][arg1 + local88 - arg0]) {
									@Pc(151) short[] local151 = this.aClass42_Sub1_2.aShortArrayArray5[local114];
									if (local151 != null) {
										@Pc(159) int local159;
										if (this.aClass33_Sub3_20.aBoolean555) {
											for (local159 = 0; local159 < local151.length; local159++) {
												local67++;
												local83.method8838(local151[local159] & 0xFFFF);
											}
										} else {
											for (local159 = 0; local159 < local151.length; local159++) {
												local67++;
												local83.method8848(local151[local159] & 0xFFFF);
											}
										}
									}
								}
								local114++;
							}
						}
					}
					if (local67 > 0) {
						OpenGL.glMatrixMode(5890);
						OpenGL.glLoadIdentity();
						OpenGL.glScalef(local43, local43, 1.0F);
						OpenGL.glTranslatef((float) -local63 / local43, (float) -local47 / local43, 1.0F);
						OpenGL.glMatrixMode(5888);
						this.aClass95ArrayArray1[local63][local47].method2329(local67, local83.aByteArray107);
					}
				}
			}
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(B)V")
	public void method4937() {
		this.aClass95ArrayArray1 = new Class95[this.anInt5616][this.anInt5608];
		for (@Pc(14) int local14 = 0; local14 < this.anInt5608; local14++) {
			for (@Pc(20) int local20 = 0; local20 < this.anInt5616; local20++) {
				this.aClass95ArrayArray1[local20][local14] = new Class95(this.aClass33_Sub3_20, this, this.aClass42_Sub1_2, local20, local14, this.anInt5605, local20 * 128 + 1, local14 * 128 + 1);
			}
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIIII)V")
	private void method4940(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass95ArrayArray1 == null) {
			return;
		}
		@Pc(15) int local15 = arg1 - 1 >> 7;
		@Pc(30) int local30 = arg1 + arg2 - 2 >> 7;
		@Pc(36) int local36 = arg3 - 1 >> 7;
		@Pc(46) int local46 = arg3 + arg0 - 1 - 1 >> 7;
		for (@Pc(48) int local48 = local15; local48 <= local30; local48++) {
			@Pc(55) Class95[] local55 = this.aClass95ArrayArray1[local48];
			for (@Pc(57) int local57 = local36; local57 <= local46; local57++) {
				local55[local57].aBoolean170 = true;
			}
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IILclient!r;Z)Z")
	public boolean method4941(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class4_Sub5_Sub9 arg2) {
		@Pc(6) Class4_Sub5_Sub9_Sub2 local6 = (Class4_Sub5_Sub9_Sub2) arg2;
		arg1 += local6.anInt5831 + 1;
		arg0 += local6.anInt5830 + 1;
		@Pc(27) int local27 = this.anInt5604 * arg0 + arg1;
		@Pc(30) int local30 = local6.anInt5826;
		@Pc(33) int local33 = local6.anInt5829;
		@Pc(43) int local43;
		if (arg0 <= 0) {
			local43 = 1 - arg0;
			arg0 = 1;
			local27 += local43 * this.anInt5604;
			local30 -= local43;
		}
		@Pc(61) int local61 = this.anInt5604 - local33;
		if (this.anInt5615 <= arg0 + local30) {
			local43 = arg0 + local30 + 1 - this.anInt5615;
			local30 -= local43;
		}
		if (arg1 <= 0) {
			local43 = 1 - arg1;
			local61 += local43;
			local33 -= local43;
			local27 += local43;
			arg1 = 1;
		}
		if (this.anInt5604 <= local33 + arg1) {
			local43 = arg1 + local33 + 1 - this.anInt5604;
			local33 -= local43;
			local61 += local43;
		}
		if (local33 > 0 && local30 > 0) {
			local61 += this.anInt5604 * 7;
			return Static222.method6630(this.aByteArray56, local61, local33, local27, local30);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(ILclient!r;II)V")
	public void method4943(@OriginalArg(1) Class4_Sub5_Sub9 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class4_Sub5_Sub9_Sub2 local6 = (Class4_Sub5_Sub9_Sub2) arg0;
		arg2 += local6.anInt5830 + 1;
		arg1 += local6.anInt5831 + 1;
		@Pc(28) int local28 = arg1 + this.anInt5604 * arg2;
		@Pc(30) int local30 = 0;
		@Pc(33) int local33 = local6.anInt5826;
		@Pc(36) int local36 = local6.anInt5829;
		@Pc(42) int local42 = this.anInt5604 - local36;
		@Pc(44) int local44 = 0;
		@Pc(54) int local54;
		if (arg2 <= 0) {
			local54 = 1 - arg2;
			local33 -= local54;
			arg2 = 1;
			local30 = local54 * local36;
			local28 += this.anInt5604 * local54;
		}
		if (arg2 + local33 >= this.anInt5615) {
			local54 = local33 + arg2 + 1 - this.anInt5615;
			local33 -= local54;
		}
		if (arg1 <= 0) {
			local54 = 1 - arg1;
			local36 -= local54;
			local44 = local54;
			local28 += local54;
			arg1 = 1;
			local42 += local54;
			local30 += local54;
		}
		if (this.anInt5604 <= local36 + arg1) {
			local54 = arg1 + local36 + 1 - this.anInt5604;
			local44 += local54;
			local36 -= local54;
			local42 += local54;
		}
		if (local36 > 0 && local33 > 0) {
			Static522.method7030(local30, this.aByteArray56, local28, local33, local36, local42, local6.aByteArray57, local44);
			this.method4940(local33, arg1, local36, arg2);
		}
	}
}

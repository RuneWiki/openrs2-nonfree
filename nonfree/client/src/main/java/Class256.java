import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rw")
public final class Class256 {

	@OriginalMember(owner = "client!rw", name = "g", descriptor = "[[Lclient!dba;")
	private Class49[][] aClass49ArrayArray1;

	@OriginalMember(owner = "client!rw", name = "f", descriptor = "Lclient!os;")
	private final Class39_Sub3 aClass39_Sub3_32;

	@OriginalMember(owner = "client!rw", name = "o", descriptor = "Lclient!nba;")
	private final Class75_Sub3 aClass75_Sub3_2;

	@OriginalMember(owner = "client!rw", name = "q", descriptor = "I")
	public final int anInt7888;

	@OriginalMember(owner = "client!rw", name = "l", descriptor = "I")
	private final int anInt7884;

	@OriginalMember(owner = "client!rw", name = "k", descriptor = "[B")
	public final byte[] aByteArray105;

	@OriginalMember(owner = "client!rw", name = "h", descriptor = "I")
	private final int anInt7881;

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "I")
	private final int anInt7877;

	@OriginalMember(owner = "client!rw", name = "i", descriptor = "I")
	private final int anInt7882;

	@OriginalMember(owner = "client!rw", name = "<init>", descriptor = "(Lclient!os;Lclient!nba;)V")
	public Class256(@OriginalArg(0) Class39_Sub3 arg0, @OriginalArg(1) Class75_Sub3 arg1) {
		this.aClass39_Sub3_32 = arg0;
		this.aClass75_Sub3_2 = arg1;
		this.anInt7888 = (this.aClass75_Sub3_2.anInt7998 * this.aClass75_Sub3_2.anInt7994 >> this.aClass39_Sub3_32.anInt6716) + 2;
		this.anInt7884 = (this.aClass75_Sub3_2.anInt7994 * this.aClass75_Sub3_2.anInt7995 >> this.aClass39_Sub3_32.anInt6716) + 2;
		this.aByteArray105 = new byte[this.anInt7888 * this.anInt7884];
		this.anInt7881 = this.aClass39_Sub3_32.anInt6716 + 7 - this.aClass75_Sub3_2.anInt7996;
		this.anInt7877 = this.aClass75_Sub3_2.anInt7998 >> this.anInt7881;
		this.anInt7882 = this.aClass75_Sub3_2.anInt7995 >> this.anInt7881;
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(ZIIII[[Z)V")
	public void method6589(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean[][] arg4) {
		this.aClass39_Sub3_32.method5736(false);
		this.aClass39_Sub3_32.method5708(false);
		this.aClass39_Sub3_32.method5686(-2);
		this.aClass39_Sub3_32.method5699(1);
		this.aClass39_Sub3_32.method5704(1);
		@Pc(47) float local47 = 1.0F / (float) (this.aClass39_Sub3_32.anInt6715 * 128);
		@Pc(51) int local51;
		@Pc(58) int local58;
		@Pc(65) int local65;
		@Pc(67) int local67;
		@Pc(71) int local71;
		@Pc(76) int local76;
		@Pc(83) int local83;
		if (arg0) {
			for (local51 = 0; local51 < this.anInt7882; local51++) {
				local58 = local51 << this.anInt7881;
				local65 = local51 + 1 << this.anInt7881;
				label81: for (local67 = 0; local67 < this.anInt7877; local67++) {
					local71 = local67 << this.anInt7881;
					local76 = local67 + 1 << this.anInt7881;
					for (local83 = local71; local83 < local76; local83++) {
						if (local83 - arg1 >= -arg3 && arg3 >= local83 - arg1) {
							for (@Pc(336) int local336 = local58; local336 < local65; local336++) {
								if (local336 - arg2 >= -arg3 && arg3 >= local336 - arg2 && arg4[arg3 + local83 - arg1][local336 + arg3 - arg2]) {
									OpenGL.glMatrixMode(5890);
									OpenGL.glLoadIdentity();
									OpenGL.glScalef(local47, local47, 1.0F);
									OpenGL.glTranslatef((float) -local67 / local47, (float) -local51 / local47, 1.0F);
									OpenGL.glMatrixMode(5888);
									this.aClass49ArrayArray1[local67][local51].method1569();
									continue label81;
								}
							}
						}
					}
				}
			}
		} else {
			for (local51 = 0; local51 < this.anInt7882; local51++) {
				local58 = local51 << this.anInt7881;
				local65 = local51 + 1 << this.anInt7881;
				for (local67 = 0; local67 < this.anInt7877; local67++) {
					local71 = 0;
					local76 = local67 << this.anInt7881;
					local83 = local67 + 1 << this.anInt7881;
					@Pc(87) Class2_Sub29_Sub1 local87 = this.aClass39_Sub3_32.aClass2_Sub29_Sub1_2;
					local87.anInt6132 = 0;
					for (@Pc(92) int local92 = local58; local92 < local65; local92++) {
						if (-arg3 <= local92 - arg2 && arg3 >= local92 - arg2) {
							@Pc(119) int local119 = this.aClass75_Sub3_2.anInt7998 * local92 + local76;
							for (@Pc(121) int local121 = local76; local121 < local83; local121++) {
								if (-arg3 <= local121 - arg1 && arg3 >= local121 - arg1 && arg4[arg3 + local121 - arg1][local92 + arg3 - arg2]) {
									@Pc(162) short[] local162 = this.aClass75_Sub3_2.aShortArrayArray8[local119];
									if (local162 != null) {
										@Pc(170) int local170;
										if (this.aClass39_Sub3_32.aBoolean485) {
											for (local170 = 0; local170 < local162.length; local170++) {
												local87.method5217(local162[local170] & 0xFFFF);
												local71++;
											}
										} else {
											for (local170 = 0; local170 < local162.length; local170++) {
												local71++;
												local87.method5199(local162[local170] & 0xFFFF);
											}
										}
									}
								}
								local119++;
							}
						}
					}
					if (local71 > 0) {
						OpenGL.glMatrixMode(5890);
						OpenGL.glLoadIdentity();
						OpenGL.glScalef(local47, local47, 1.0F);
						OpenGL.glTranslatef((float) -local67 / local47, (float) -local51 / local47, 1.0F);
						OpenGL.glMatrixMode(5888);
						this.aClass49ArrayArray1[local67][local51].method1574(local71, local87.aByteArray96);
					}
				}
			}
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(IILclient!k;I)Z")
	public boolean method6590(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub13_Sub6 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class2_Sub13_Sub6_Sub1 local6 = (Class2_Sub13_Sub6_Sub1) arg1;
		arg2 += local6.anInt3542 + 1;
		arg0 += local6.anInt3541 + 1;
		@Pc(27) int local27 = arg0 + arg2 * this.anInt7888;
		@Pc(30) int local30 = local6.anInt3534;
		@Pc(33) int local33 = local6.anInt3538;
		@Pc(43) int local43;
		if (arg2 <= 0) {
			local43 = 1 - arg2;
			local27 += local43 * this.anInt7888;
			arg2 = 1;
			local30 -= local43;
		}
		@Pc(62) int local62 = this.anInt7888 - local33;
		if (this.anInt7884 <= arg2 + local30) {
			local43 = local30 + arg2 + 1 - this.anInt7884;
			local30 -= local43;
		}
		if (arg0 <= 0) {
			local43 = 1 - arg0;
			local62 += local43;
			arg0 = 1;
			local27 += local43;
			local33 -= local43;
		}
		if (arg0 + local33 >= this.anInt7888) {
			local43 = local33 + arg0 + 1 - this.anInt7888;
			local62 += local43;
			local33 -= local43;
		}
		if (local33 > 0 && local30 > 0) {
			local62 += this.anInt7888 * 7;
			return Static67.method1239(local30, local33, this.aByteArray105, local27, local62);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(ILclient!k;II)V")
	public void method6592(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub13_Sub6 arg1, @OriginalArg(2) int arg2) {
		@Pc(6) Class2_Sub13_Sub6_Sub1 local6 = (Class2_Sub13_Sub6_Sub1) arg1;
		arg2 += local6.anInt3542 + 1;
		arg0 += local6.anInt3541 + 1;
		@Pc(27) int local27 = arg2 * this.anInt7888 + arg0;
		@Pc(29) int local29 = 0;
		@Pc(32) int local32 = local6.anInt3534;
		@Pc(41) int local41 = local6.anInt3538;
		@Pc(47) int local47 = this.anInt7888 - local41;
		@Pc(57) int local57;
		if (arg2 <= 0) {
			local57 = 1 - arg2;
			local27 += local57 * this.anInt7888;
			arg2 = 1;
			local32 -= local57;
			local29 = local57 * local41;
		}
		@Pc(78) int local78 = 0;
		if (this.anInt7884 <= arg2 + local32) {
			local57 = arg2 + local32 + 1 - this.anInt7884;
			local32 -= local57;
		}
		if (arg0 <= 0) {
			local57 = 1 - arg0;
			local41 -= local57;
			arg0 = 1;
			local29 += local57;
			local47 += local57;
			local27 += local57;
			local78 = local57;
		}
		if (local41 + arg0 >= this.anInt7888) {
			local57 = arg0 + local41 + 1 - this.anInt7888;
			local41 -= local57;
			local47 += local57;
			local78 += local57;
		}
		if (local41 > 0 && local32 > 0) {
			Static519.method7541(local47, local6.aByteArray71, local41, local32, local29, local27, local78, this.aByteArray105);
			this.method6596(arg0, local32, arg2, local41);
		}
	}

	@OriginalMember(owner = "client!rw", name = "b", descriptor = "(ILclient!k;II)V")
	public void method6595(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub13_Sub6 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class2_Sub13_Sub6_Sub1 local6 = (Class2_Sub13_Sub6_Sub1) arg1;
		arg0 += local6.anInt3542 + 1;
		arg2 += local6.anInt3541 + 1;
		@Pc(27) int local27 = arg0 * this.anInt7888 + arg2;
		@Pc(29) int local29 = 0;
		@Pc(32) int local32 = local6.anInt3534;
		@Pc(35) int local35 = local6.anInt3538;
		@Pc(41) int local41 = this.anInt7888 - local35;
		@Pc(43) int local43 = 0;
		@Pc(52) int local52;
		if (arg0 <= 0) {
			local52 = 1 - arg0;
			local27 += local52 * this.anInt7888;
			local29 = local52 * local35;
			local32 -= local52;
			arg0 = 1;
		}
		if (arg0 + local32 >= this.anInt7884) {
			local52 = local32 + arg0 + 1 - this.anInt7884;
			local32 -= local52;
		}
		if (arg2 <= 0) {
			local52 = 1 - arg2;
			arg2 = 1;
			local29 += local52;
			local27 += local52;
			local43 = local52;
			local35 -= local52;
			local41 += local52;
		}
		if (local35 + arg2 >= this.anInt7888) {
			local52 = local35 + arg2 + 1 - this.anInt7888;
			local35 -= local52;
			local41 += local52;
			local43 += local52;
		}
		if (local35 > 0 && local32 > 0) {
			Static230.method3626(local43, local6.aByteArray71, local32, local41, local35, local27, local29, this.aByteArray105);
			this.method6596(arg2, local32, arg0, local35);
		}
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(IZIII)V")
	private void method6596(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass49ArrayArray1 == null) {
			return;
		}
		@Pc(19) int local19 = arg0 - 1 >> 7;
		@Pc(30) int local30 = arg0 + arg3 - 1 - 1 >> 7;
		@Pc(36) int local36 = arg2 - 1 >> 7;
		@Pc(46) int local46 = arg1 + arg2 - 1 - 1 >> 7;
		for (@Pc(48) int local48 = local19; local48 <= local30; local48++) {
			@Pc(55) Class49[] local55 = this.aClass49ArrayArray1[local48];
			for (@Pc(57) int local57 = local36; local57 <= local46; local57++) {
				local55[local57].aBoolean119 = true;
			}
		}
	}

	@OriginalMember(owner = "client!rw", name = "b", descriptor = "(B)V")
	public void method6597() {
		this.aClass49ArrayArray1 = new Class49[this.anInt7877][this.anInt7882];
		for (@Pc(14) int local14 = 0; local14 < this.anInt7882; local14++) {
			for (@Pc(18) int local18 = 0; local18 < this.anInt7877; local18++) {
				this.aClass49ArrayArray1[local18][local14] = new Class49(this.aClass39_Sub3_32, this, this.aClass75_Sub3_2, local18, local14, this.anInt7881, local18 * 128 + 1, local14 * 128 - -1);
			}
		}
	}
}

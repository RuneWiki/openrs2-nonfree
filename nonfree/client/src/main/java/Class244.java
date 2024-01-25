import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ou")
public final class Class244 {

	@OriginalMember(owner = "client!ou", name = "t", descriptor = "[[Lclient!sd;")
	private Class304[][] aClass304ArrayArray1;

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "Lclient!eo;")
	private final Class86_Sub1 aClass86_Sub1_3;

	@OriginalMember(owner = "client!ou", name = "j", descriptor = "Lclient!nv;")
	private final Class16_Sub3 aClass16_Sub3_32;

	@OriginalMember(owner = "client!ou", name = "m", descriptor = "I")
	public final int anInt7802;

	@OriginalMember(owner = "client!ou", name = "n", descriptor = "I")
	private final int anInt7803;

	@OriginalMember(owner = "client!ou", name = "e", descriptor = "[B")
	public final byte[] aByteArray67;

	@OriginalMember(owner = "client!ou", name = "c", descriptor = "I")
	private final int anInt7796;

	@OriginalMember(owner = "client!ou", name = "r", descriptor = "I")
	private final int anInt7807;

	@OriginalMember(owner = "client!ou", name = "s", descriptor = "I")
	private final int anInt7808;

	@OriginalMember(owner = "client!ou", name = "<init>", descriptor = "(Lclient!nv;Lclient!eo;)V")
	public Class244(@OriginalArg(0) Class16_Sub3 arg0, @OriginalArg(1) Class86_Sub1 arg1) {
		this.aClass86_Sub1_3 = arg1;
		this.aClass16_Sub3_32 = arg0;
		this.anInt7802 = (this.aClass86_Sub1_3.anInt9958 * this.aClass86_Sub1_3.anInt9955 >> this.aClass16_Sub3_32.anInt7339) + 2;
		this.anInt7803 = (this.aClass86_Sub1_3.anInt9953 * this.aClass86_Sub1_3.anInt9958 >> this.aClass16_Sub3_32.anInt7339) + 2;
		this.aByteArray67 = new byte[this.anInt7803 * this.anInt7802];
		this.anInt7796 = this.aClass16_Sub3_32.anInt7339 + 7 - this.aClass86_Sub1_3.anInt9954;
		this.anInt7807 = this.aClass86_Sub1_3.anInt9955 >> this.anInt7796;
		this.anInt7808 = this.aClass86_Sub1_3.anInt9953 >> this.anInt7796;
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(IZI[[ZII)V")
	public void method6460(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) int arg4) {
		this.aClass16_Sub3_32.method6024(false);
		this.aClass16_Sub3_32.method5955(false);
		this.aClass16_Sub3_32.method6023(-2);
		this.aClass16_Sub3_32.method5972(1);
		this.aClass16_Sub3_32.method6005(1);
		@Pc(41) float local41 = 1.0F / (float) (this.aClass16_Sub3_32.anInt7337 * 128);
		@Pc(45) int local45;
		@Pc(52) int local52;
		@Pc(59) int local59;
		@Pc(61) int local61;
		@Pc(65) int local65;
		@Pc(70) int local70;
		@Pc(77) int local77;
		if (arg1) {
			for (local45 = 0; local45 < this.anInt7808; local45++) {
				local52 = local45 << this.anInt7796;
				local59 = local45 + 1 << this.anInt7796;
				label81: for (local61 = 0; local61 < this.anInt7807; local61++) {
					local65 = local61 << this.anInt7796;
					local70 = local61 + 1 << this.anInt7796;
					for (local77 = local65; local77 < local70; local77++) {
						if (-arg0 <= local77 - arg4 && arg0 >= local77 - arg4) {
							for (@Pc(330) int local330 = local52; local330 < local59; local330++) {
								if (-arg0 <= local330 - arg2 && local330 - arg2 <= arg0 && arg3[local77 + arg0 - arg4][local330 + arg0 - arg2]) {
									OpenGL.glMatrixMode(5890);
									OpenGL.glLoadIdentity();
									OpenGL.glScalef(local41, local41, 1.0F);
									OpenGL.glTranslatef((float) -local61 / local41, (float) -local45 / local41, 1.0F);
									OpenGL.glMatrixMode(5888);
									this.aClass304ArrayArray1[local61][local45].method7339();
									continue label81;
								}
							}
						}
					}
				}
			}
		} else {
			for (local45 = 0; local45 < this.anInt7808; local45++) {
				local52 = local45 << this.anInt7796;
				local59 = local45 + 1 << this.anInt7796;
				for (local61 = 0; local61 < this.anInt7807; local61++) {
					local65 = 0;
					local70 = local61 << this.anInt7796;
					local77 = local61 + 1 << this.anInt7796;
					@Pc(81) Class8_Sub8_Sub1 local81 = this.aClass16_Sub3_32.aClass8_Sub8_Sub1_2;
					local81.anInt10588 = 0;
					for (@Pc(86) int local86 = local52; local86 < local59; local86++) {
						if (-arg0 <= local86 - arg2 && arg0 >= local86 - arg2) {
							@Pc(112) int local112 = local70 + local86 * this.aClass86_Sub1_3.anInt9955;
							for (@Pc(114) int local114 = local70; local114 < local77; local114++) {
								if (-arg0 <= local114 - arg4 && local114 - arg4 <= arg0 && arg3[local114 + arg0 - arg4][local86 + arg0 - arg2]) {
									@Pc(157) short[] local157 = this.aClass86_Sub1_3.aShortArrayArray5[local112];
									if (local157 != null) {
										@Pc(165) int local165;
										if (this.aClass16_Sub3_32.aBoolean519) {
											for (local165 = 0; local165 < local157.length; local165++) {
												local81.method8548(local157[local165] & 0xFFFF);
												local65++;
											}
										} else {
											for (local165 = 0; local165 < local157.length; local165++) {
												local81.method8534(local157[local165] & 0xFFFF);
												local65++;
											}
										}
									}
								}
								local112++;
							}
						}
					}
					if (local65 > 0) {
						OpenGL.glMatrixMode(5890);
						OpenGL.glLoadIdentity();
						OpenGL.glScalef(local41, local41, 1.0F);
						OpenGL.glTranslatef((float) -local61 / local41, (float) -local45 / local41, 1.0F);
						OpenGL.glMatrixMode(5888);
						this.aClass304ArrayArray1[local61][local45].method7337(local65, local81.aByteArray107);
					}
				}
			}
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(IILclient!r;I)V")
	public void method6461(@OriginalArg(0) int arg0, @OriginalArg(2) Class8_Sub5_Sub11 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class8_Sub5_Sub11_Sub1 local6 = (Class8_Sub5_Sub11_Sub1) arg1;
		arg0 += local6.anInt6762 + 1;
		arg2 += local6.anInt6760 + 1;
		@Pc(27) int local27 = arg2 + this.anInt7802 * arg0;
		@Pc(29) int local29 = 0;
		@Pc(32) int local32 = local6.anInt6764;
		@Pc(35) int local35 = local6.anInt6766;
		@Pc(41) int local41 = this.anInt7802 - local35;
		@Pc(48) int local48;
		if (arg0 <= 0) {
			local48 = 1 - arg0;
			local29 = local48 * local35;
			local27 += local48 * this.anInt7802;
			local32 -= local48;
			arg0 = 1;
		}
		@Pc(69) int local69 = 0;
		if (this.anInt7803 <= local32 + arg0) {
			local48 = arg0 + local32 + 1 - this.anInt7803;
			local32 -= local48;
		}
		if (arg2 <= 0) {
			local48 = 1 - arg2;
			local27 += local48;
			local29 += local48;
			local35 -= local48;
			local41 += local48;
			local69 = local48;
			arg2 = 1;
		}
		if (this.anInt7802 <= arg2 + local35) {
			local48 = arg2 + local35 + 1 - this.anInt7802;
			local41 += local48;
			local35 -= local48;
			local69 += local48;
		}
		if (local35 > 0 && local32 > 0) {
			Static420.method6585(local69, local6.aByteArray51, local29, this.aByteArray67, local32, local41, local27, local35);
			this.method6469(arg2, local35, arg0, local32);
		}
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(ILclient!r;BI)Z")
	public boolean method6465(@OriginalArg(0) int arg0, @OriginalArg(1) Class8_Sub5_Sub11 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class8_Sub5_Sub11_Sub1 local6 = (Class8_Sub5_Sub11_Sub1) arg1;
		arg2 += local6.anInt6762 + 1;
		arg0 += local6.anInt6760 + 1;
		@Pc(27) int local27 = arg2 * this.anInt7802 + arg0;
		@Pc(30) int local30 = local6.anInt6764;
		@Pc(33) int local33 = local6.anInt6766;
		@Pc(39) int local39 = this.anInt7802 - local33;
		@Pc(45) int local45;
		if (arg2 <= 0) {
			local45 = 1 - arg2;
			arg2 = 1;
			local30 -= local45;
			local27 += local45 * this.anInt7802;
		}
		if (this.anInt7803 <= local30 + arg2) {
			local45 = arg2 + local30 + 1 - this.anInt7803;
			local30 -= local45;
		}
		if (arg0 <= 0) {
			local45 = 1 - arg0;
			arg0 = 1;
			local33 -= local45;
			local39 += local45;
			local27 += local45;
		}
		if (local33 + arg0 >= this.anInt7802) {
			local45 = arg0 + local33 + 1 - this.anInt7802;
			local33 -= local45;
			local39 += local45;
		}
		if (local33 > 0 && local30 > 0) {
			local39 += this.anInt7802 * 7;
			return Static216.method4077(local33, local27, this.aByteArray67, local39, local30);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(Z)V")
	public void method6466() {
		this.aClass304ArrayArray1 = new Class304[this.anInt7807][this.anInt7808];
		for (@Pc(19) int local19 = 0; local19 < this.anInt7808; local19++) {
			for (@Pc(23) int local23 = 0; local23 < this.anInt7807; local23++) {
				this.aClass304ArrayArray1[local23][local19] = new Class304(this.aClass16_Sub3_32, this, this.aClass86_Sub1_3, local23, local19, this.anInt7796, local23 * 128 + 1, local19 * 128 + 1);
			}
		}
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(Lclient!r;III)V")
	public void method6468(@OriginalArg(0) Class8_Sub5_Sub11 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class8_Sub5_Sub11_Sub1 local6 = (Class8_Sub5_Sub11_Sub1) arg0;
		arg2 += local6.anInt6762 + 1;
		arg1 += local6.anInt6760 + 1;
		@Pc(27) int local27 = arg1 + arg2 * this.anInt7802;
		@Pc(29) int local29 = 0;
		@Pc(32) int local32 = local6.anInt6764;
		@Pc(35) int local35 = local6.anInt6766;
		@Pc(41) int local41 = this.anInt7802 - local35;
		@Pc(43) int local43 = 0;
		@Pc(53) int local53;
		if (arg2 <= 0) {
			local53 = 1 - arg2;
			local32 -= local53;
			local29 = local35 * local53;
			local27 += local53 * this.anInt7802;
			arg2 = 1;
		}
		if (this.anInt7803 <= local32 + arg2) {
			local53 = arg2 + local32 + 1 - this.anInt7803;
			local32 -= local53;
		}
		if (arg1 <= 0) {
			local53 = 1 - arg1;
			local35 -= local53;
			local43 = local53;
			arg1 = 1;
			local41 += local53;
			local29 += local53;
			local27 += local53;
		}
		if (this.anInt7802 <= local35 + arg1) {
			local53 = arg1 + local35 + 1 - this.anInt7802;
			local43 += local53;
			local41 += local53;
			local35 -= local53;
		}
		if (local35 > 0 && local32 > 0) {
			Static641.method8620(local29, local6.aByteArray51, local41, local35, local32, local27, this.aByteArray67, local43);
			this.method6469(arg1, local35, arg2, local32);
		}
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(IIBII)V")
	private void method6469(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass304ArrayArray1 == null) {
			return;
		}
		@Pc(15) int local15 = arg0 - 1 >> 7;
		@Pc(26) int local26 = arg0 + arg1 - 1 - 1 >> 7;
		@Pc(32) int local32 = arg2 - 1 >> 7;
		@Pc(43) int local43 = arg2 + arg3 - 1 - 1 >> 7;
		for (@Pc(53) int local53 = local15; local53 <= local26; local53++) {
			@Pc(60) Class304[] local60 = this.aClass304ArrayArray1[local53];
			for (@Pc(62) int local62 = local32; local62 <= local43; local62++) {
				local60[local62].aBoolean639 = true;
			}
		}
	}
}

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tj")
public final class Class238 {

	@OriginalMember(owner = "client!tj", name = "l", descriptor = "[[Lclient!ws;")
	private Class273[][] aClass273ArrayArray1;

	@OriginalMember(owner = "client!tj", name = "i", descriptor = "Lclient!na;")
	private final Class75_Sub2 aClass75_Sub2_37;

	@OriginalMember(owner = "client!tj", name = "n", descriptor = "Lclient!hk;")
	private final Class22_Sub2 aClass22_Sub2_2;

	@OriginalMember(owner = "client!tj", name = "d", descriptor = "I")
	public final int anInt6755;

	@OriginalMember(owner = "client!tj", name = "j", descriptor = "I")
	private final int anInt6760;

	@OriginalMember(owner = "client!tj", name = "h", descriptor = "I")
	private final int anInt6759;

	@OriginalMember(owner = "client!tj", name = "p", descriptor = "[B")
	public final byte[] aByteArray79;

	@OriginalMember(owner = "client!tj", name = "u", descriptor = "I")
	private final int anInt6764;

	@OriginalMember(owner = "client!tj", name = "g", descriptor = "I")
	private final int anInt6758;

	@OriginalMember(owner = "client!tj", name = "<init>", descriptor = "(Lclient!na;Lclient!hk;)V")
	public Class238(@OriginalArg(0) Class75_Sub2 arg0, @OriginalArg(1) Class22_Sub2 arg1) {
		this.aClass75_Sub2_37 = arg0;
		this.aClass22_Sub2_2 = arg1;
		this.anInt6755 = (this.aClass22_Sub2_2.anInt2818 * this.aClass22_Sub2_2.anInt2819 >> this.aClass75_Sub2_37.anInt4859) + 2;
		this.anInt6760 = (this.aClass22_Sub2_2.anInt2818 * this.aClass22_Sub2_2.anInt2816 >> this.aClass75_Sub2_37.anInt4859) + 2;
		this.anInt6759 = this.aClass75_Sub2_37.anInt4859 + 7 - this.aClass22_Sub2_2.anInt2817;
		this.aByteArray79 = new byte[this.anInt6760 * this.anInt6755];
		this.anInt6764 = this.aClass22_Sub2_2.anInt2819 >> this.anInt6759;
		this.anInt6758 = this.aClass22_Sub2_2.anInt2816 >> this.anInt6759;
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(BLclient!i;II)V")
	public void method5425(@OriginalArg(1) Class2_Sub1_Sub5 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class2_Sub1_Sub5_Sub1 local6 = (Class2_Sub1_Sub5_Sub1) arg0;
		arg1 += local6.anInt6348 + 1;
		arg2 += local6.anInt6343 + 1;
		@Pc(27) int local27 = arg1 * this.anInt6755 + arg2;
		@Pc(29) int local29 = 0;
		@Pc(32) int local32 = local6.anInt6350;
		@Pc(35) int local35 = local6.anInt6347;
		@Pc(41) int local41 = this.anInt6755 - local35;
		@Pc(48) int local48;
		if (arg1 <= 0) {
			local48 = 1 - arg1;
			local27 += this.anInt6755 * local48;
			local29 = local35 * local48;
			arg1 = 1;
			local32 -= local48;
		}
		@Pc(69) int local69 = 0;
		if (this.anInt6760 <= arg1 + local32) {
			local48 = local32 + arg1 + 1 - this.anInt6760;
			local32 -= local48;
		}
		if (arg2 <= 0) {
			local48 = 1 - arg2;
			local41 += local48;
			local35 -= local48;
			local29 += local48;
			arg2 = 1;
			local69 = local48;
			local27 += local48;
		}
		if (this.anInt6755 <= arg2 + local35) {
			local48 = arg2 + local35 + 1 - this.anInt6755;
			local35 -= local48;
			local41 += local48;
			local69 += local48;
		}
		if (local35 > 0 && local32 > 0) {
			Static101.method1453(local41, local32, local35, this.aByteArray79, local27, local29, local6.aByteArray68, local69);
			this.method5428(arg1, arg2, local35, local32);
		}
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(I)V")
	public void method5426() {
		this.aClass273ArrayArray1 = new Class273[this.anInt6764][this.anInt6758];
		for (@Pc(14) int local14 = 0; local14 < this.anInt6758; local14++) {
			for (@Pc(18) int local18 = 0; local18 < this.anInt6764; local18++) {
				this.aClass273ArrayArray1[local18][local14] = new Class273(this.aClass75_Sub2_37, this, this.aClass22_Sub2_2, local18, local14, this.anInt6759, local18 * 128 + 1, local14 * 128 - -1);
			}
		}
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIIII)V")
	private void method5428(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass273ArrayArray1 == null) {
			return;
		}
		@Pc(15) int local15 = arg1 - 1 >> 7;
		@Pc(26) int local26 = arg1 + arg2 - 1 - 1 >> 7;
		@Pc(32) int local32 = arg0 - 1 >> 7;
		@Pc(42) int local42 = arg3 + arg0 - 1 - 1 >> 7;
		for (@Pc(44) int local44 = local15; local44 <= local26; local44++) {
			@Pc(51) Class273[] local51 = this.aClass273ArrayArray1[local44];
			for (@Pc(53) int local53 = local32; local53 <= local42; local53++) {
				local51[local53].aBoolean517 = true;
			}
		}
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(IZZII[[Z)V")
	public void method5429(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean[][] arg4) {
		this.aClass75_Sub2_37.method3808(false);
		this.aClass75_Sub2_37.method3875(false);
		this.aClass75_Sub2_37.method3857(-2);
		this.aClass75_Sub2_37.method3798(1);
		this.aClass75_Sub2_37.method3870(1);
		@Pc(43) float local43 = 1.0F / (float) (this.aClass75_Sub2_37.anInt4858 * 128);
		@Pc(47) int local47;
		@Pc(54) int local54;
		@Pc(61) int local61;
		@Pc(63) int local63;
		@Pc(70) int local70;
		@Pc(77) int local77;
		@Pc(79) int local79;
		if (arg1) {
			for (local47 = 0; local47 < this.anInt6758; local47++) {
				local54 = local47 << this.anInt6759;
				local61 = local47 + 1 << this.anInt6759;
				label128: for (local63 = 0; local63 < this.anInt6764; local63++) {
					local70 = local63 << this.anInt6759;
					local77 = local63 + 1 << this.anInt6759;
					for (local79 = local70; local79 < local77; local79++) {
						if (-arg2 <= local79 - arg3 && arg2 >= local79 - arg3) {
							for (@Pc(99) int local99 = local54; local99 < local61; local99++) {
								if (-arg2 <= local99 - arg0 && arg2 >= local99 - arg0 && arg4[arg2 + local79 - arg3][local99 + arg2 - arg0]) {
									OpenGL.glMatrixMode(5890);
									OpenGL.glLoadIdentity();
									OpenGL.glScalef(local43, local43, 1.0F);
									OpenGL.glTranslatef((float) -local63 / local43, (float) -local47 / local43, 1.0F);
									OpenGL.glMatrixMode(5888);
									this.aClass273ArrayArray1[local63][local47].method6246();
									continue label128;
								}
							}
						}
					}
				}
			}
		} else {
			for (local47 = 0; local47 < this.anInt6758; local47++) {
				local54 = local47 << this.anInt6759;
				local61 = local47 + 1 << this.anInt6759;
				for (local63 = 0; local63 < this.anInt6764; local63++) {
					local70 = 0;
					local77 = local63 << this.anInt6759;
					local79 = local63 + 1 << this.anInt6759;
					@Pc(239) Class2_Sub17_Sub2 local239 = this.aClass75_Sub2_37.aClass2_Sub17_Sub2_1;
					local239.anInt7523 = 0;
					for (@Pc(244) int local244 = local54; local244 < local61; local244++) {
						if (local244 - arg0 >= -arg2 && local244 - arg0 <= arg2) {
							@Pc(267) int local267 = local77 + this.aClass22_Sub2_2.anInt2819 * local244;
							for (@Pc(269) int local269 = local77; local269 < local79; local269++) {
								if (local269 - arg3 >= -arg2 && arg2 >= local269 - arg3 && arg4[local269 + arg2 - arg3][arg2 + local244 - arg0]) {
									@Pc(309) short[] local309 = this.aClass22_Sub2_2.aShortArrayArray4[local267];
									if (local309 != null) {
										@Pc(317) int local317;
										if (this.aClass75_Sub2_37.aBoolean349) {
											for (local317 = 0; local317 < local309.length; local317++) {
												local239.method6130(local309[local317] & 0xFFFF);
												local70++;
											}
										} else {
											for (local317 = 0; local317 < local309.length; local317++) {
												local239.method6160(local309[local317] & 0xFFFF);
												local70++;
											}
										}
									}
								}
								local267++;
							}
						}
					}
					if (local70 > 0) {
						OpenGL.glMatrixMode(5890);
						OpenGL.glLoadIdentity();
						OpenGL.glScalef(local43, local43, 1.0F);
						OpenGL.glTranslatef((float) -local63 / local43, (float) -local47 / local43, 1.0F);
						OpenGL.glMatrixMode(5888);
						this.aClass273ArrayArray1[local63][local47].method6247(local239.aByteArray94, local70);
					}
				}
			}
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(Lclient!i;III)V")
	public void method5430(@OriginalArg(0) Class2_Sub1_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(6) Class2_Sub1_Sub5_Sub1 local6 = (Class2_Sub1_Sub5_Sub1) arg0;
		arg2 += local6.anInt6348 + 1;
		arg1 += local6.anInt6343 + 1;
		@Pc(27) int local27 = this.anInt6755 * arg2 + arg1;
		@Pc(29) int local29 = 0;
		@Pc(32) int local32 = local6.anInt6350;
		@Pc(35) int local35 = local6.anInt6347;
		@Pc(41) int local41 = this.anInt6755 - local35;
		@Pc(48) int local48;
		if (arg2 <= 0) {
			local48 = 1 - arg2;
			local32 -= local48;
			arg2 = 1;
			local27 += this.anInt6755 * local48;
			local29 = local35 * local48;
		}
		@Pc(69) int local69 = 0;
		if (this.anInt6760 <= arg2 + local32) {
			local48 = arg2 + local32 + 1 - this.anInt6760;
			local32 -= local48;
		}
		if (arg1 <= 0) {
			local48 = 1 - arg1;
			local29 += local48;
			arg1 = 1;
			local69 = local48;
			local27 += local48;
			local41 += local48;
			local35 -= local48;
		}
		if (local35 + arg1 >= this.anInt6755) {
			local48 = arg1 + local35 + 1 - this.anInt6755;
			local41 += local48;
			local69 += local48;
			local35 -= local48;
		}
		if (local35 > 0 && local32 > 0) {
			Static239.method3265(local32, local6.aByteArray68, this.aByteArray79, local29, local69, local41, local27, local35);
			this.method5428(arg2, arg1, local35, local32);
		}
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(IILclient!i;B)Z")
	public boolean method5431(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub1_Sub5 arg2) {
		@Pc(6) Class2_Sub1_Sub5_Sub1 local6 = (Class2_Sub1_Sub5_Sub1) arg2;
		arg0 += local6.anInt6348 + 1;
		arg1 += local6.anInt6343 + 1;
		@Pc(36) int local36 = arg1 + this.anInt6755 * arg0;
		@Pc(39) int local39 = local6.anInt6350;
		@Pc(42) int local42 = local6.anInt6347;
		@Pc(48) int local48 = this.anInt6755 - local42;
		@Pc(58) int local58;
		if (arg0 <= 0) {
			local58 = 1 - arg0;
			local36 += local58 * this.anInt6755;
			arg0 = 1;
			local39 -= local58;
		}
		if (this.anInt6760 <= local39 + arg0) {
			local58 = arg0 + local39 + 1 - this.anInt6760;
			local39 -= local58;
		}
		if (arg1 <= 0) {
			local58 = 1 - arg1;
			arg1 = 1;
			local42 -= local58;
			local36 += local58;
			local48 += local58;
		}
		if (arg1 + local42 >= this.anInt6755) {
			local58 = arg1 + local42 + 1 - this.anInt6755;
			local42 -= local58;
			local48 += local58;
		}
		if (local42 > 0 && local39 > 0) {
			local48 += this.anInt6755 * 7;
			return Static454.method6178(local36, local39, this.aByteArray79, local48, local42);
		} else {
			return false;
		}
	}
}

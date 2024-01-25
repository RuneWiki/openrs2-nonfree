import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oi")
public final class Class248 {

	@OriginalMember(owner = "client!oi", name = "g", descriptor = "[[Lclient!fl;")
	private Class110[][] aClass110ArrayArray1;

	@OriginalMember(owner = "client!oi", name = "c", descriptor = "Lclient!kfa;")
	private final Class7_Sub2 aClass7_Sub2_32;

	@OriginalMember(owner = "client!oi", name = "u", descriptor = "Lclient!fw;")
	private final Class115_Sub1 aClass115_Sub1_3;

	@OriginalMember(owner = "client!oi", name = "k", descriptor = "I")
	public final int anInt7455;

	@OriginalMember(owner = "client!oi", name = "m", descriptor = "I")
	private final int anInt7457;

	@OriginalMember(owner = "client!oi", name = "d", descriptor = "[B")
	public final byte[] aByteArray69;

	@OriginalMember(owner = "client!oi", name = "r", descriptor = "I")
	private final int anInt7459;

	@OriginalMember(owner = "client!oi", name = "v", descriptor = "I")
	private final int anInt7461;

	@OriginalMember(owner = "client!oi", name = "j", descriptor = "I")
	private final int anInt7454;

	@OriginalMember(owner = "client!oi", name = "<init>", descriptor = "(Lclient!kfa;Lclient!fw;)V")
	public Class248(@OriginalArg(0) Class7_Sub2 arg0, @OriginalArg(1) Class115_Sub1 arg1) {
		this.aClass7_Sub2_32 = arg0;
		this.aClass115_Sub1_3 = arg1;
		this.anInt7455 = (this.aClass115_Sub1_3.anInt10333 * this.aClass115_Sub1_3.anInt10330 >> this.aClass7_Sub2_32.anInt5598) + 2;
		this.anInt7457 = (this.aClass115_Sub1_3.anInt10327 * this.aClass115_Sub1_3.anInt10333 >> this.aClass7_Sub2_32.anInt5598) + 2;
		this.aByteArray69 = new byte[this.anInt7455 * this.anInt7457];
		this.anInt7459 = this.aClass7_Sub2_32.anInt5598 + 7 - this.aClass115_Sub1_3.anInt10331;
		this.anInt7461 = this.aClass115_Sub1_3.anInt10330 >> this.anInt7459;
		this.anInt7454 = this.aClass115_Sub1_3.anInt10327 >> this.anInt7459;
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(IZIII[[Z)V")
	public void method5877(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean[][] arg4) {
		this.aClass7_Sub2_32.method4290(false);
		this.aClass7_Sub2_32.method4293(false);
		this.aClass7_Sub2_32.method4339(-2);
		this.aClass7_Sub2_32.method4288(1);
		this.aClass7_Sub2_32.method4343(1);
		@Pc(44) float local44 = 1.0F / (float) (this.aClass7_Sub2_32.anInt5599 * 128);
		@Pc(48) int local48;
		@Pc(55) int local55;
		@Pc(62) int local62;
		@Pc(64) int local64;
		@Pc(71) int local71;
		@Pc(78) int local78;
		@Pc(80) int local80;
		if (arg0) {
			for (local48 = 0; local48 < this.anInt7454; local48++) {
				local55 = local48 << this.anInt7459;
				local62 = local48 + 1 << this.anInt7459;
				label128: for (local64 = 0; local64 < this.anInt7461; local64++) {
					local71 = local64 << this.anInt7459;
					local78 = local64 + 1 << this.anInt7459;
					for (local80 = local71; local80 < local78; local80++) {
						if (-arg1 <= local80 - arg3 && local80 - arg3 <= arg1) {
							for (@Pc(101) int local101 = local55; local101 < local62; local101++) {
								if (local101 - arg2 >= -arg1 && arg1 >= local101 - arg2 && arg4[local80 + arg1 - arg3][local101 + arg1 - arg2]) {
									OpenGL.glMatrixMode(5890);
									OpenGL.glLoadIdentity();
									OpenGL.glScalef(local44, local44, 1.0F);
									OpenGL.glTranslatef((float) -local64 / local44, (float) -local48 / local44, 1.0F);
									OpenGL.glMatrixMode(5888);
									this.aClass110ArrayArray1[local64][local48].method2514();
									continue label128;
								}
							}
						}
					}
				}
			}
		} else {
			for (local48 = 0; local48 < this.anInt7454; local48++) {
				local55 = local48 << this.anInt7459;
				local62 = local48 + 1 << this.anInt7459;
				for (local64 = 0; local64 < this.anInt7461; local64++) {
					local71 = 0;
					local78 = local64 << this.anInt7459;
					local80 = local64 + 1 << this.anInt7459;
					@Pc(225) Class4_Sub13_Sub1 local225 = this.aClass7_Sub2_32.aClass4_Sub13_Sub1_3;
					local225.anInt9170 = 0;
					for (@Pc(230) int local230 = local55; local230 < local62; local230++) {
						if (local230 - arg2 >= -arg1 && arg1 >= local230 - arg2) {
							@Pc(257) int local257 = this.aClass115_Sub1_3.anInt10330 * local230 + local78;
							for (@Pc(259) int local259 = local78; local259 < local80; local259++) {
								if (-arg1 <= local259 - arg3 && local259 - arg3 <= arg1 && arg4[local259 + arg1 - arg3][arg1 + local230 - arg2]) {
									@Pc(297) short[] local297 = this.aClass115_Sub1_3.aShortArrayArray10[local257];
									if (local297 != null) {
										@Pc(305) int local305;
										if (this.aClass7_Sub2_32.aBoolean388) {
											for (local305 = 0; local305 < local297.length; local305++) {
												local225.method7038(local297[local305] & 0xFFFF);
												local71++;
											}
										} else {
											for (local305 = 0; local305 < local297.length; local305++) {
												local225.method7041(local297[local305] & 0xFFFF);
												local71++;
											}
										}
									}
								}
								local257++;
							}
						}
					}
					if (local71 > 0) {
						OpenGL.glMatrixMode(5890);
						OpenGL.glLoadIdentity();
						OpenGL.glScalef(local44, local44, 1.0F);
						OpenGL.glTranslatef((float) -local64 / local44, (float) -local48 / local44, 1.0F);
						OpenGL.glMatrixMode(5888);
						this.aClass110ArrayArray1[local64][local48].method2518(local225.aByteArray88, local71);
					}
				}
			}
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lclient!ha;III)V")
	public void method5879(@OriginalArg(0) Class4_Sub6_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class4_Sub6_Sub7_Sub1 local6 = (Class4_Sub6_Sub7_Sub1) arg0;
		arg2 += local6.anInt4046 + 1;
		arg1 += local6.anInt4044 + 1;
		@Pc(28) int local28 = arg2 + arg1 * this.anInt7455;
		@Pc(30) int local30 = 0;
		@Pc(39) int local39 = local6.anInt4049;
		@Pc(42) int local42 = local6.anInt4052;
		@Pc(48) int local48 = this.anInt7455 - local42;
		@Pc(54) int local54;
		if (arg1 <= 0) {
			local54 = 1 - arg1;
			local28 += local54 * this.anInt7455;
			local39 -= local54;
			arg1 = 1;
			local30 = local54 * local42;
		}
		@Pc(75) int local75 = 0;
		if (local39 + arg1 >= this.anInt7457) {
			local54 = local39 + arg1 + 1 - this.anInt7457;
			local39 -= local54;
		}
		if (arg2 <= 0) {
			local54 = 1 - arg2;
			local42 -= local54;
			local48 += local54;
			arg2 = 1;
			local30 += local54;
			local28 += local54;
			local75 = local54;
		}
		if (arg2 + local42 >= this.anInt7455) {
			local54 = local42 + arg2 + 1 - this.anInt7455;
			local75 += local54;
			local48 += local54;
			local42 -= local54;
		}
		if (local42 > 0 && local39 > 0) {
			Static544.method7635(local75, local42, local6.aByteArray33, local30, local48, this.aByteArray69, local28, local39);
			this.method5882(local42, arg2, local39, arg1);
		}
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(Z)V")
	public void method5880() {
		this.aClass110ArrayArray1 = new Class110[this.anInt7461][this.anInt7454];
		for (@Pc(14) int local14 = 0; local14 < this.anInt7454; local14++) {
			for (@Pc(27) int local27 = 0; local27 < this.anInt7461; local27++) {
				this.aClass110ArrayArray1[local27][local14] = new Class110(this.aClass7_Sub2_32, this, this.aClass115_Sub1_3, local27, local14, this.anInt7459, local27 * 128 + 1, local14 * 128 + 1);
			}
		}
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(IIIII)V")
	private void method5882(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass110ArrayArray1 == null) {
			return;
		}
		@Pc(21) int local21 = arg1 - 1 >> 7;
		@Pc(31) int local31 = arg1 + arg0 - 1 - 1 >> 7;
		@Pc(37) int local37 = arg3 - 1 >> 7;
		@Pc(47) int local47 = arg2 + arg3 - 1 - 1 >> 7;
		for (@Pc(49) int local49 = local21; local49 <= local31; local49++) {
			@Pc(56) Class110[] local56 = this.aClass110ArrayArray1[local49];
			for (@Pc(58) int local58 = local37; local58 <= local47; local58++) {
				local56[local58].aBoolean231 = true;
			}
		}
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(IBLclient!ha;I)V")
	public void method5883(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub6_Sub7 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class4_Sub6_Sub7_Sub1 local6 = (Class4_Sub6_Sub7_Sub1) arg1;
		arg2 += local6.anInt4046 + 1;
		arg0 += local6.anInt4044 + 1;
		@Pc(27) int local27 = this.anInt7455 * arg0 + arg2;
		@Pc(29) int local29 = 0;
		@Pc(38) int local38 = local6.anInt4049;
		@Pc(41) int local41 = local6.anInt4052;
		@Pc(47) int local47 = this.anInt7455 - local41;
		@Pc(54) int local54;
		if (arg0 <= 0) {
			local54 = 1 - arg0;
			local38 -= local54;
			arg0 = 1;
			local27 += this.anInt7455 * local54;
			local29 = local41 * local54;
		}
		@Pc(75) int local75 = 0;
		if (arg0 + local38 >= this.anInt7457) {
			local54 = local38 + arg0 + 1 - this.anInt7457;
			local38 -= local54;
		}
		if (arg2 <= 0) {
			local54 = 1 - arg2;
			local27 += local54;
			local75 = local54;
			local29 += local54;
			arg2 = 1;
			local41 -= local54;
			local47 += local54;
		}
		if (this.anInt7455 <= local41 + arg2) {
			local54 = local41 + arg2 + 1 - this.anInt7455;
			local41 -= local54;
			local75 += local54;
			local47 += local54;
		}
		if (local41 > 0 && local38 > 0) {
			Static386.method5964(local27, local29, local41, this.aByteArray69, local75, local38, local6.aByteArray33, local47);
			this.method5882(local41, arg2, local38, arg0);
		}
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(IILclient!ha;I)Z")
	public boolean method5885(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub6_Sub7 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class4_Sub6_Sub7_Sub1 local6 = (Class4_Sub6_Sub7_Sub1) arg1;
		arg0 += local6.anInt4044 + 1;
		arg2 += local6.anInt4046 + 1;
		@Pc(28) int local28 = arg2 + arg0 * this.anInt7455;
		@Pc(31) int local31 = local6.anInt4049;
		@Pc(34) int local34 = local6.anInt4052;
		@Pc(44) int local44;
		if (arg0 <= 0) {
			local44 = 1 - arg0;
			local31 -= local44;
			arg0 = 1;
			local28 += this.anInt7455 * local44;
		}
		@Pc(63) int local63 = this.anInt7455 - local34;
		if (this.anInt7457 <= local31 + arg0) {
			local44 = local31 + arg0 + 1 - this.anInt7457;
			local31 -= local44;
		}
		if (arg2 <= 0) {
			local44 = 1 - arg2;
			local63 += local44;
			arg2 = 1;
			local34 -= local44;
			local28 += local44;
		}
		if (this.anInt7455 <= local34 + arg2) {
			local44 = local34 + arg2 + 1 - this.anInt7455;
			local34 -= local44;
			local63 += local44;
		}
		if (local34 > 0 && local31 > 0) {
			local63 += this.anInt7455 * 7;
			return Static118.method2169(local31, local34, local28, this.aByteArray69, local63);
		} else {
			return false;
		}
	}
}

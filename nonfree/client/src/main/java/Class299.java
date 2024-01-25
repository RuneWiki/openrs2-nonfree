import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sn")
public final class Class299 {

	@OriginalMember(owner = "client!sn", name = "s", descriptor = "[[Lclient!ad;")
	private Class8[][] aClass8ArrayArray1;

	@OriginalMember(owner = "client!sn", name = "h", descriptor = "Lclient!ag;")
	private final Class12_Sub1 aClass12_Sub1_33;

	@OriginalMember(owner = "client!sn", name = "t", descriptor = "Lclient!al;")
	private final Class17_Sub1 aClass17_Sub1_2;

	@OriginalMember(owner = "client!sn", name = "n", descriptor = "I")
	public final int anInt8214;

	@OriginalMember(owner = "client!sn", name = "c", descriptor = "I")
	private final int anInt8205;

	@OriginalMember(owner = "client!sn", name = "p", descriptor = "I")
	private final int anInt8216;

	@OriginalMember(owner = "client!sn", name = "u", descriptor = "[B")
	public final byte[] aByteArray84;

	@OriginalMember(owner = "client!sn", name = "b", descriptor = "I")
	private final int anInt8204;

	@OriginalMember(owner = "client!sn", name = "q", descriptor = "I")
	private final int anInt8217;

	@OriginalMember(owner = "client!sn", name = "<init>", descriptor = "(Lclient!ag;Lclient!al;)V")
	public Class299(@OriginalArg(0) Class12_Sub1 arg0, @OriginalArg(1) Class17_Sub1 arg1) {
		this.aClass12_Sub1_33 = arg0;
		this.aClass17_Sub1_2 = arg1;
		this.anInt8214 = (this.aClass17_Sub1_2.anInt7986 * this.aClass17_Sub1_2.anInt7983 >> this.aClass12_Sub1_33.anInt463) + 2;
		this.anInt8205 = (this.aClass17_Sub1_2.anInt7986 * this.aClass17_Sub1_2.anInt7984 >> this.aClass12_Sub1_33.anInt463) + 2;
		this.anInt8216 = this.aClass12_Sub1_33.anInt463 + 7 - this.aClass17_Sub1_2.anInt7988;
		this.aByteArray84 = new byte[this.anInt8214 * this.anInt8205];
		this.anInt8204 = this.aClass17_Sub1_2.anInt7983 >> this.anInt8216;
		this.anInt8217 = this.aClass17_Sub1_2.anInt7984 >> this.anInt8216;
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(I)V")
	public void method6809() {
		this.aClass8ArrayArray1 = new Class8[this.anInt8204][this.anInt8217];
		for (@Pc(23) int local23 = 0; local23 < this.anInt8217; local23++) {
			for (@Pc(27) int local27 = 0; local27 < this.anInt8204; local27++) {
				this.aClass8ArrayArray1[local27][local23] = new Class8(this.aClass12_Sub1_33, this, this.aClass17_Sub1_2, local27, local23, this.anInt8216, local27 * 128 + 1, local23 * 128 + 1);
			}
		}
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(BIILclient!ha;)V")
	public void method6810(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class1_Sub3_Sub4 arg2) {
		@Pc(6) Class1_Sub3_Sub4_Sub1 local6 = (Class1_Sub3_Sub4_Sub1) arg2;
		arg1 += local6.anInt958 + 1;
		arg0 += local6.anInt960 + 1;
		@Pc(27) int local27 = this.anInt8214 * arg1 + arg0;
		@Pc(29) int local29 = 0;
		@Pc(32) int local32 = local6.anInt954;
		@Pc(35) int local35 = local6.anInt961;
		@Pc(41) int local41 = this.anInt8214 - local35;
		@Pc(51) int local51;
		if (arg1 <= 0) {
			local51 = 1 - arg1;
			arg1 = 1;
			local32 -= local51;
			local29 = local51 * local35;
			local27 += local51 * this.anInt8214;
		}
		@Pc(72) int local72 = 0;
		if (this.anInt8205 <= local32 + arg1) {
			local51 = local32 + arg1 + 1 - this.anInt8205;
			local32 -= local51;
		}
		if (arg0 <= 0) {
			local51 = 1 - arg0;
			local41 += local51;
			local27 += local51;
			local72 = local51;
			local35 -= local51;
			arg0 = 1;
			local29 += local51;
		}
		if (local35 + arg0 >= this.anInt8214) {
			local51 = local35 + arg0 + 1 - this.anInt8214;
			local72 += local51;
			local35 -= local51;
			local41 += local51;
		}
		if (local35 > 0 && local32 > 0) {
			Static34.method808(this.aByteArray84, local29, local41, local6.aByteArray4, local32, local72, local35, local27);
			this.method6817(local35, local32, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "([[ZIIZBI)V")
	public void method6812(@OriginalArg(0) boolean[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) int arg4) {
		this.aClass12_Sub1_33.method454(false);
		this.aClass12_Sub1_33.method404(false);
		this.aClass12_Sub1_33.method444(-2);
		this.aClass12_Sub1_33.method401(1);
		this.aClass12_Sub1_33.method395(1);
		@Pc(39) float local39 = 1.0F / (float) (this.aClass12_Sub1_33.anInt462 * 128);
		@Pc(43) int local43;
		@Pc(50) int local50;
		@Pc(57) int local57;
		@Pc(59) int local59;
		@Pc(63) int local63;
		@Pc(68) int local68;
		@Pc(75) int local75;
		if (arg3) {
			for (local43 = 0; local43 < this.anInt8217; local43++) {
				local50 = local43 << this.anInt8216;
				local57 = local43 + 1 << this.anInt8216;
				label81: for (local59 = 0; local59 < this.anInt8204; local59++) {
					local63 = local59 << this.anInt8216;
					local68 = local59 + 1 << this.anInt8216;
					for (local75 = local63; local75 < local68; local75++) {
						if (-arg4 <= local75 - arg2 && arg4 >= local75 - arg2) {
							for (@Pc(327) int local327 = local50; local327 < local57; local327++) {
								if (local327 - arg1 >= -arg4 && arg4 >= local327 - arg1 && arg0[local75 + arg4 - arg2][arg4 + local327 - arg1]) {
									OpenGL.glMatrixMode(5890);
									OpenGL.glLoadIdentity();
									OpenGL.glScalef(local39, local39, 1.0F);
									OpenGL.glTranslatef((float) -local59 / local39, (float) -local43 / local39, 1.0F);
									OpenGL.glMatrixMode(5888);
									this.aClass8ArrayArray1[local59][local43].method127();
									continue label81;
								}
							}
						}
					}
				}
			}
		} else {
			for (local43 = 0; local43 < this.anInt8217; local43++) {
				local50 = local43 << this.anInt8216;
				local57 = local43 + 1 << this.anInt8216;
				for (local59 = 0; local59 < this.anInt8204; local59++) {
					local63 = 0;
					local68 = local59 << this.anInt8216;
					local75 = local59 + 1 << this.anInt8216;
					@Pc(79) Class1_Sub20_Sub2 local79 = this.aClass12_Sub1_33.aClass1_Sub20_Sub2_1;
					local79.anInt5238 = 0;
					for (@Pc(84) int local84 = local50; local84 < local57; local84++) {
						if (local84 - arg1 >= -arg4 && arg4 >= local84 - arg1) {
							@Pc(110) int local110 = local68 + this.aClass17_Sub1_2.anInt7983 * local84;
							for (@Pc(112) int local112 = local68; local112 < local75; local112++) {
								if (local112 - arg2 >= -arg4 && local112 - arg2 <= arg4 && arg0[arg4 + local112 - arg2][arg4 + local84 - arg1]) {
									@Pc(153) short[] local153 = this.aClass17_Sub1_2.aShortArrayArray1[local110];
									if (local153 != null) {
										@Pc(161) int local161;
										if (this.aClass12_Sub1_33.aBoolean23) {
											for (local161 = 0; local161 < local153.length; local161++) {
												local79.method4381(local153[local161] & 0xFFFF);
												local63++;
											}
										} else {
											for (local161 = 0; local161 < local153.length; local161++) {
												local63++;
												local79.method4376(local153[local161] & 0xFFFF);
											}
										}
									}
								}
								local110++;
							}
						}
					}
					if (local63 > 0) {
						OpenGL.glMatrixMode(5890);
						OpenGL.glLoadIdentity();
						OpenGL.glScalef(local39, local39, 1.0F);
						OpenGL.glTranslatef((float) -local59 / local39, (float) -local43 / local39, 1.0F);
						OpenGL.glMatrixMode(5888);
						this.aClass8ArrayArray1[local59][local43].method126(local63, local79.aByteArray52);
					}
				}
			}
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(IILclient!ha;I)V")
	public void method6813(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub3_Sub4 arg2) {
		@Pc(6) Class1_Sub3_Sub4_Sub1 local6 = (Class1_Sub3_Sub4_Sub1) arg2;
		arg1 += local6.anInt960 + 1;
		arg0 += local6.anInt958 + 1;
		@Pc(28) int local28 = arg1 + this.anInt8214 * arg0;
		@Pc(30) int local30 = 0;
		@Pc(33) int local33 = local6.anInt954;
		@Pc(36) int local36 = local6.anInt961;
		@Pc(42) int local42 = this.anInt8214 - local36;
		@Pc(44) int local44 = 0;
		@Pc(51) int local51;
		if (arg0 <= 0) {
			local51 = 1 - arg0;
			arg0 = 1;
			local33 -= local51;
			local30 = local36 * local51;
			local28 += local51 * this.anInt8214;
		}
		if (this.anInt8205 <= arg0 + local33) {
			local51 = local33 + arg0 + 1 - this.anInt8205;
			local33 -= local51;
		}
		if (arg1 <= 0) {
			local51 = 1 - arg1;
			arg1 = 1;
			local42 += local51;
			local28 += local51;
			local36 -= local51;
			local44 = local51;
			local30 += local51;
		}
		if (local36 + arg1 >= this.anInt8214) {
			local51 = local36 + arg1 + 1 - this.anInt8214;
			local44 += local51;
			local36 -= local51;
			local42 += local51;
		}
		if (local36 > 0 && local33 > 0) {
			Static6.method5137(local44, local28, local42, local30, this.aByteArray84, local33, local6.aByteArray4, local36);
			this.method6817(local36, local33, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!sn", name = "b", descriptor = "(IILclient!ha;I)Z")
	public boolean method6816(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub3_Sub4 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class1_Sub3_Sub4_Sub1 local6 = (Class1_Sub3_Sub4_Sub1) arg1;
		arg2 += local6.anInt960 + 1;
		arg0 += local6.anInt958 + 1;
		@Pc(28) int local28 = arg2 + arg0 * this.anInt8214;
		@Pc(36) int local36 = local6.anInt954;
		@Pc(39) int local39 = local6.anInt961;
		@Pc(45) int local45 = this.anInt8214 - local39;
		@Pc(55) int local55;
		if (arg0 <= 0) {
			local55 = 1 - arg0;
			arg0 = 1;
			local28 += local55 * this.anInt8214;
			local36 -= local55;
		}
		if (local36 + arg0 >= this.anInt8205) {
			local55 = arg0 + local36 + 1 - this.anInt8205;
			local36 -= local55;
		}
		if (arg2 <= 0) {
			local55 = 1 - arg2;
			local28 += local55;
			arg2 = 1;
			local45 += local55;
			local39 -= local55;
		}
		if (this.anInt8214 <= arg2 + local39) {
			local55 = arg2 + local39 + 1 - this.anInt8214;
			local45 += local55;
			local39 -= local55;
		}
		if (local39 > 0 && local36 > 0) {
			local45 += this.anInt8214 * 7;
			return Static310.method6060(this.aByteArray84, local39, local36, local28, local45);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(IIIII)V")
	private void method6817(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass8ArrayArray1 == null) {
			return;
		}
		@Pc(15) int local15 = arg3 - 1 >> 7;
		@Pc(25) int local25 = arg0 + arg3 - 1 - 1 >> 7;
		@Pc(39) int local39 = arg2 - 1 >> 7;
		@Pc(47) int local47 = arg2 + arg1 - 2 >> 7;
		for (@Pc(49) int local49 = local15; local49 <= local25; local49++) {
			@Pc(56) Class8[] local56 = this.aClass8ArrayArray1[local49];
			for (@Pc(58) int local58 = local39; local58 <= local47; local58++) {
				local56[local58].aBoolean6 = true;
			}
		}
	}
}

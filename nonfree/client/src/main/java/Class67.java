import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!er")
public final class Class67 {

	@OriginalMember(owner = "client!er", name = "n", descriptor = "[[Lclient!ff;")
	private Class73[][] aClass73ArrayArray1;

	@OriginalMember(owner = "client!er", name = "o", descriptor = "Lclient!lk;")
	private final Class149_Sub1 aClass149_Sub1_1;

	@OriginalMember(owner = "client!er", name = "e", descriptor = "Lclient!kd;")
	private final Class39_Sub2 aClass39_Sub2_9;

	@OriginalMember(owner = "client!er", name = "j", descriptor = "I")
	public final int anInt2139;

	@OriginalMember(owner = "client!er", name = "p", descriptor = "I")
	private final int anInt2142;

	@OriginalMember(owner = "client!er", name = "q", descriptor = "[B")
	public final byte[] aByteArray45;

	@OriginalMember(owner = "client!er", name = "i", descriptor = "I")
	private final int anInt2138;

	@OriginalMember(owner = "client!er", name = "d", descriptor = "I")
	private final int anInt2134;

	@OriginalMember(owner = "client!er", name = "l", descriptor = "I")
	private final int anInt2141;

	@OriginalMember(owner = "client!er", name = "<init>", descriptor = "(Lclient!kd;Lclient!lk;)V")
	public Class67(@OriginalArg(0) Class39_Sub2 arg0, @OriginalArg(1) Class149_Sub1 arg1) {
		this.aClass149_Sub1_1 = arg1;
		this.aClass39_Sub2_9 = arg0;
		this.anInt2139 = (this.aClass149_Sub1_1.anInt4317 * this.aClass149_Sub1_1.anInt4318 >> this.aClass39_Sub2_9.anInt3777) + 2;
		this.anInt2142 = (this.aClass149_Sub1_1.anInt4319 * this.aClass149_Sub1_1.anInt4318 >> this.aClass39_Sub2_9.anInt3777) + 2;
		this.aByteArray45 = new byte[this.anInt2139 * this.anInt2142];
		this.anInt2138 = this.aClass39_Sub2_9.anInt3777 + 7 - this.aClass149_Sub1_1.anInt4316;
		this.anInt2134 = this.aClass149_Sub1_1.anInt4317 >> this.anInt2138;
		this.anInt2141 = this.aClass149_Sub1_1.anInt4319 >> this.anInt2138;
	}

	@OriginalMember(owner = "client!er", name = "b", descriptor = "(B)V")
	public void method1836() {
		this.aClass73ArrayArray1 = new Class73[this.anInt2134][this.anInt2141];
		for (@Pc(20) int local20 = 0; local20 < this.anInt2141; local20++) {
			for (@Pc(24) int local24 = 0; local24 < this.anInt2134; local24++) {
				this.aClass73ArrayArray1[local24][local20] = new Class73(this.aClass39_Sub2_9, this, this.aClass149_Sub1_1, local24, local20, this.anInt2138, local24 * 128 + 1, local20 * 128 + 1);
			}
		}
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(Lclient!ba;III)V")
	public void method1837(@OriginalArg(0) Class1_Sub2_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class1_Sub2_Sub1_Sub1 local6 = (Class1_Sub2_Sub1_Sub1) arg0;
		arg1 += local6.anInt57 + 1;
		arg2 += local6.anInt53 + 1;
		@Pc(27) int local27 = arg1 + arg2 * this.anInt2139;
		@Pc(29) int local29 = 0;
		@Pc(32) int local32 = local6.anInt58;
		@Pc(35) int local35 = local6.anInt61;
		@Pc(41) int local41 = this.anInt2139 - local35;
		@Pc(43) int local43 = 0;
		@Pc(52) int local52;
		if (arg2 <= 0) {
			local52 = 1 - arg2;
			local32 -= local52;
			arg2 = 1;
			local27 += this.anInt2139 * local52;
			local29 = local35 * local52;
		}
		if (this.anInt2142 <= arg2 + local32) {
			local52 = local32 + arg2 + 1 - this.anInt2142;
			local32 -= local52;
		}
		if (arg1 <= 0) {
			local52 = 1 - arg1;
			arg1 = 1;
			local27 += local52;
			local35 -= local52;
			local43 = local52;
			local41 += local52;
			local29 += local52;
		}
		if (this.anInt2139 <= arg1 + local35) {
			local52 = local35 + arg1 + 1 - this.anInt2139;
			local35 -= local52;
			local41 += local52;
			local43 += local52;
		}
		if (local35 > 0 && local32 > 0) {
			Static57.method1247(local29, local6.aByteArray2, local41, local32, local43, local27, local35, this.aByteArray45);
			this.method1840(local32, arg1, local35, arg2);
		}
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(ILclient!ba;II)Z")
	public boolean method1838(@OriginalArg(1) Class1_Sub2_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class1_Sub2_Sub1_Sub1 local6 = (Class1_Sub2_Sub1_Sub1) arg0;
		arg2 += local6.anInt57 + 1;
		arg1 += local6.anInt53 + 1;
		@Pc(27) int local27 = arg2 + this.anInt2139 * arg1;
		@Pc(30) int local30 = local6.anInt58;
		@Pc(33) int local33 = local6.anInt61;
		@Pc(39) int local39 = this.anInt2139 - local33;
		if (arg1 <= 0) {
			@Pc(45) int local45 = 1 - arg1;
			local30 -= local45;
			arg1 = 1;
			local27 += local45 * this.anInt2139;
		}
		@Pc(82) int local82;
		if (this.anInt2142 <= arg1 + local30) {
			local82 = arg1 + local30 + 1 - this.anInt2142;
			local30 -= local82;
		}
		if (arg2 <= 0) {
			local82 = 1 - arg2;
			local27 += local82;
			local39 += local82;
			arg2 = 1;
			local33 -= local82;
		}
		if (arg2 + local33 >= this.anInt2139) {
			local82 = local33 + arg2 + 1 - this.anInt2139;
			local39 += local82;
			local33 -= local82;
		}
		if (local33 > 0 && local30 > 0) {
			local39 += this.anInt2139 * 7;
			return Static454.method5965(local30, local39, this.aByteArray45, local33, local27);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(ZZ[[ZIII)V")
	public void method1839(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean[][] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.aClass39_Sub2_9.method3186(false);
		this.aClass39_Sub2_9.method3208(false);
		this.aClass39_Sub2_9.method3218(-2);
		this.aClass39_Sub2_9.method3162(1);
		this.aClass39_Sub2_9.method3205(1);
		@Pc(43) float local43 = 1.0F / (float) (this.aClass39_Sub2_9.anInt3775 * 128);
		@Pc(47) int local47;
		@Pc(54) int local54;
		@Pc(61) int local61;
		@Pc(63) int local63;
		@Pc(70) int local70;
		@Pc(77) int local77;
		@Pc(79) int local79;
		if (arg0) {
			for (local47 = 0; local47 < this.anInt2141; local47++) {
				local54 = local47 << this.anInt2138;
				local61 = local47 + 1 << this.anInt2138;
				label128: for (local63 = 0; local63 < this.anInt2134; local63++) {
					local70 = local63 << this.anInt2138;
					local77 = local63 + 1 << this.anInt2138;
					for (local79 = local70; local79 < local77; local79++) {
						if (local79 - arg2 >= -arg3 && arg3 >= local79 - arg2) {
							for (@Pc(99) int local99 = local54; local99 < local61; local99++) {
								if (-arg3 <= local99 - arg4 && local99 - arg4 <= arg3 && arg1[local79 + arg3 - arg2][local99 + arg3 - arg4]) {
									OpenGL.glMatrixMode(5890);
									OpenGL.glLoadIdentity();
									OpenGL.glScalef(local43, local43, 1.0F);
									OpenGL.glTranslatef((float) -local63 / local43, (float) -local47 / local43, 1.0F);
									OpenGL.glMatrixMode(5888);
									this.aClass73ArrayArray1[local63][local47].method1974();
									continue label128;
								}
							}
						}
					}
				}
			}
		} else {
			for (local47 = 0; local47 < this.anInt2141; local47++) {
				local54 = local47 << this.anInt2138;
				local61 = local47 + 1 << this.anInt2138;
				for (local63 = 0; local63 < this.anInt2134; local63++) {
					local70 = 0;
					local77 = local63 << this.anInt2138;
					local79 = local63 + 1 << this.anInt2138;
					@Pc(239) Class1_Sub5_Sub2 local239 = this.aClass39_Sub2_9.aClass1_Sub5_Sub2_1;
					local239.anInt6475 = 0;
					for (@Pc(244) int local244 = local54; local244 < local61; local244++) {
						if (local244 - arg4 >= -arg3 && arg3 >= local244 - arg4) {
							@Pc(271) int local271 = local77 + this.aClass149_Sub1_1.anInt4317 * local244;
							for (@Pc(273) int local273 = local77; local273 < local79; local273++) {
								if (local273 - arg2 >= -arg3 && local273 - arg2 <= arg3 && arg1[local273 + arg3 - arg2][local244 + arg3 - arg4]) {
									@Pc(318) short[] local318 = this.aClass149_Sub1_1.aShortArrayArray6[local271];
									if (local318 != null) {
										@Pc(326) int local326;
										if (this.aClass39_Sub2_9.aBoolean250) {
											for (local326 = 0; local326 < local318.length; local326++) {
												local239.method5393(local318[local326] & 0xFFFF);
												local70++;
											}
										} else {
											for (local326 = 0; local326 < local318.length; local326++) {
												local239.method5355(local318[local326] & 0xFFFF);
												local70++;
											}
										}
									}
								}
								local271++;
							}
						}
					}
					if (local70 > 0) {
						OpenGL.glMatrixMode(5890);
						OpenGL.glLoadIdentity();
						OpenGL.glScalef(local43, local43, 1.0F);
						OpenGL.glTranslatef((float) -local63 / local43, (float) -local47 / local43, 1.0F);
						OpenGL.glMatrixMode(5888);
						this.aClass73ArrayArray1[local63][local47].method1975(local70, local239.aByteArray89);
					}
				}
			}
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(IIIII)V")
	private void method1840(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass73ArrayArray1 == null) {
			return;
		}
		@Pc(21) int local21 = arg1 - 1 >> 7;
		@Pc(31) int local31 = arg1 + arg2 - 1 - 1 >> 7;
		@Pc(37) int local37 = arg3 - 1 >> 7;
		@Pc(47) int local47 = arg0 + arg3 - 1 - 1 >> 7;
		for (@Pc(49) int local49 = local21; local49 <= local31; local49++) {
			@Pc(56) Class73[] local56 = this.aClass73ArrayArray1[local49];
			for (@Pc(58) int local58 = local37; local58 <= local47; local58++) {
				local56[local58].aBoolean134 = true;
			}
		}
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(ZILclient!ba;I)V")
	public void method1841(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub2_Sub1 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class1_Sub2_Sub1_Sub1 local6 = (Class1_Sub2_Sub1_Sub1) arg1;
		arg0 += local6.anInt53 + 1;
		arg2 += local6.anInt57 + 1;
		@Pc(33) int local33 = this.anInt2139 * arg0 + arg2;
		@Pc(35) int local35 = 0;
		@Pc(38) int local38 = local6.anInt58;
		@Pc(41) int local41 = local6.anInt61;
		@Pc(47) int local47 = this.anInt2139 - local41;
		@Pc(49) int local49 = 0;
		@Pc(56) int local56;
		if (arg0 <= 0) {
			local56 = 1 - arg0;
			local33 += this.anInt2139 * local56;
			arg0 = 1;
			local38 -= local56;
			local35 = local41 * local56;
		}
		if (local38 + arg0 >= this.anInt2142) {
			local56 = local38 + arg0 + 1 - this.anInt2142;
			local38 -= local56;
		}
		if (arg2 <= 0) {
			local56 = 1 - arg2;
			local47 += local56;
			local35 += local56;
			local49 = local56;
			arg2 = 1;
			local41 -= local56;
			local33 += local56;
		}
		if (arg2 + local41 >= this.anInt2139) {
			local56 = local41 + arg2 + 1 - this.anInt2139;
			local49 += local56;
			local47 += local56;
			local41 -= local56;
		}
		if (local41 > 0 && local38 > 0) {
			Static14.method386(local33, local35, local6.aByteArray2, local41, local38, local49, local47, this.aByteArray45);
			this.method1840(local38, arg2, local41, arg0);
		}
	}
}

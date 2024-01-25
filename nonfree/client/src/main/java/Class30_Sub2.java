import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qc")
public final class Class30_Sub2 extends Class30 {

	@OriginalMember(owner = "client!qc", name = "D", descriptor = "Lclient!kd;")
	private Class46_Sub1 aClass46_Sub1_9;

	@OriginalMember(owner = "client!qc", name = "A", descriptor = "[I")
	private final int[] anIntArray455;

	@OriginalMember(owner = "client!qc", name = "z", descriptor = "[I")
	private final int[] anIntArray454;

	@OriginalMember(owner = "client!qc", name = "B", descriptor = "[[B")
	private final byte[][] aByteArrayArray21;

	@OriginalMember(owner = "client!qc", name = "y", descriptor = "[I")
	private final int[] anIntArray453;

	@OriginalMember(owner = "client!qc", name = "F", descriptor = "[I")
	private final int[] anIntArray456;

	@OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(Lclient!kd;Lclient!gh;[Lclient!vp;[I[I)V")
	public Class30_Sub2(@OriginalArg(0) Class46_Sub1 arg0, @OriginalArg(1) Class76 arg1, @OriginalArg(2) Class207[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		super(arg0, arg1);
		this.aClass46_Sub1_9 = arg0;
		this.aClass46_Sub1_9 = arg0;
		this.anIntArray455 = arg3;
		this.anIntArray454 = arg4;
		this.aByteArrayArray21 = new byte[arg2.length][];
		this.anIntArray453 = new int[arg2.length];
		this.anIntArray456 = new int[arg2.length];
		for (@Pc(32) int local32 = 0; local32 < arg2.length; local32++) {
			this.aByteArrayArray21[local32] = arg2[local32].aByteArray209;
			this.anIntArray453[local32] = arg2[local32].anInt6510;
			this.anIntArray456[local32] = arg2[local32].anInt6507;
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "([B[IIIIIIII)V")
	private void method4463(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		for (@Pc(2) int local2 = -arg6; local2 < 0; local2++) {
			for (@Pc(6) int local6 = -arg5; local6 < 0; local6++) {
				@Pc(14) int local14 = arg0[arg3++] & 0xFF;
				if (local14 == 0) {
					arg4++;
				} else {
					@Pc(34) int local34 = ((arg2 & 0xFF00FF) * local14 & 0xFF00FF00) + ((arg2 & 0xFF00) * local14 & 0xFF0000) >> 8;
					local14 = 256 - local14;
					@Pc(42) int local42 = arg1[arg4];
					arg1[arg4++] = (((local42 & 0xFF00FF) * local14 & 0xFF00FF00) + ((local42 & 0xFF00) * local14 & 0xFF0000) >> 8) + local34;
				}
			}
			arg4 += arg7;
			arg3 += arg8;
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(CIIIZLclient!q;II)V")
	@Override
	protected void method5581(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class156 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg5 == null) {
			this.method5582(arg0, arg1, arg2, arg3, arg4);
			return;
		}
		arg1 += this.anIntArray456[arg0];
		arg2 += this.anIntArray453[arg0];
		@Pc(28) int local28 = this.anIntArray455[arg0];
		@Pc(33) int local33 = this.anIntArray454[arg0];
		@Pc(37) int local37 = this.aClass46_Sub1_9.lb;
		@Pc(43) int local43 = arg1 + arg2 * local37;
		@Pc(47) int local47 = local37 - local28;
		@Pc(49) int local49 = 0;
		@Pc(51) int local51 = 0;
		@Pc(62) int local62;
		if (arg2 < this.aClass46_Sub1_9.anInt3374) {
			local62 = this.aClass46_Sub1_9.anInt3374 - arg2;
			local33 -= local62;
			arg2 = this.aClass46_Sub1_9.anInt3374;
			local51 = local62 * local28;
			local43 += local62 * local37;
		}
		if (arg2 + local33 > this.aClass46_Sub1_9.anInt3372) {
			local33 -= arg2 + local33 - this.aClass46_Sub1_9.anInt3372;
		}
		if (arg1 < this.aClass46_Sub1_9.anInt3390) {
			local62 = this.aClass46_Sub1_9.anInt3390 - arg1;
			local28 -= local62;
			arg1 = this.aClass46_Sub1_9.anInt3390;
			local51 += local62;
			local43 += local62;
			local49 = local62;
			local47 += local62;
		}
		if (arg1 + local28 > this.aClass46_Sub1_9.anInt3394) {
			local62 = arg1 + local28 - this.aClass46_Sub1_9.anInt3394;
			local28 -= local62;
			local49 += local62;
			local47 += local62;
		}
		if (local28 > 0 && local33 > 0) {
			this.method4464(this.aByteArrayArray21[arg0], this.aClass46_Sub1_9.anIntArray297, arg3, local51, local43, local28, local33, local47, local49, arg1, arg2, this.anIntArray455[arg0], arg5, arg6, arg7);
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(CIIIZ)V")
	@Override
	protected void method5582(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		arg1 += this.anIntArray456[arg0];
		arg2 += this.anIntArray453[arg0];
		@Pc(18) int local18 = this.anIntArray455[arg0];
		@Pc(23) int local23 = this.anIntArray454[arg0];
		@Pc(27) int local27 = this.aClass46_Sub1_9.lb;
		@Pc(33) int local33 = arg1 + arg2 * local27;
		@Pc(37) int local37 = local27 - local18;
		@Pc(39) int local39 = 0;
		@Pc(41) int local41 = 0;
		@Pc(52) int local52;
		if (arg2 < this.aClass46_Sub1_9.anInt3374) {
			local52 = this.aClass46_Sub1_9.anInt3374 - arg2;
			local23 -= local52;
			arg2 = this.aClass46_Sub1_9.anInt3374;
			local41 = local52 * local18;
			local33 += local52 * local27;
		}
		if (arg2 + local23 > this.aClass46_Sub1_9.anInt3372) {
			local23 -= arg2 + local23 - this.aClass46_Sub1_9.anInt3372;
		}
		if (arg1 < this.aClass46_Sub1_9.anInt3390) {
			local52 = this.aClass46_Sub1_9.anInt3390 - arg1;
			local18 -= local52;
			arg1 = this.aClass46_Sub1_9.anInt3390;
			local41 += local52;
			local33 += local52;
			local39 = local52;
			local37 += local52;
		}
		if (arg1 + local18 > this.aClass46_Sub1_9.anInt3394) {
			local52 = arg1 + local18 - this.aClass46_Sub1_9.anInt3394;
			local18 -= local52;
			local39 += local52;
			local37 += local52;
		}
		if (local18 > 0 && local23 > 0) {
			this.method4463(this.aByteArrayArray21[arg0], this.aClass46_Sub1_9.anIntArray297, arg3, local41, local33, local18, local23, local37, local39);
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "([B[IIIIIIIIIIILclient!q;II)V")
	private void method4464(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) Class156 arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		@Pc(2) Class156_Sub2 local2 = (Class156_Sub2) arg12;
		@Pc(5) int[] local5 = local2.anIntArray399;
		@Pc(8) int[] local8 = local2.anIntArray398;
		@Pc(14) int local14 = arg9 - this.aClass46_Sub1_9.anInt3390;
		@Pc(16) int local16 = arg10;
		if (arg14 > arg10) {
			local16 = arg14;
			arg4 += (arg14 - arg10) * this.aClass46_Sub1_9.lb;
			arg3 += (arg14 - arg10) * arg11;
		}
		@Pc(56) int local56 = arg14 + local5.length < arg10 + arg6 ? arg14 + local5.length : arg10 + arg6;
		for (@Pc(58) int local58 = local16; local58 < local56; local58++) {
			@Pc(67) int local67 = local5[local58 - arg14] + arg13;
			@Pc(73) int local73 = local8[local58 - arg14];
			@Pc(75) int local75 = arg5;
			@Pc(82) int local82;
			if (local14 > local67) {
				local82 = local14 - local67;
				if (local82 >= local73) {
					arg3 += arg5 + arg8;
					arg4 += arg5 + arg7;
					continue;
				}
				local73 -= local82;
			} else {
				local82 = local67 - local14;
				if (local82 >= arg5) {
					arg3 += arg5 + arg8;
					arg4 += arg5 + arg7;
					continue;
				}
				arg3 += local82;
				local75 = arg5 - local82;
				arg4 += local82;
			}
			local82 = 0;
			if (local75 < local73) {
				local73 = local75;
			} else {
				local82 = local75 - local73;
			}
			for (@Pc(150) int local150 = -local73; local150 < 0; local150++) {
				@Pc(158) int local158 = arg0[arg3++] & 0xFF;
				if (local158 == 0) {
					arg4++;
				} else {
					@Pc(178) int local178 = ((arg2 & 0xFF00FF) * local158 & 0xFF00FF00) + ((arg2 & 0xFF00) * local158 & 0xFF0000) >> 8;
					local158 = 256 - local158;
					@Pc(186) int local186 = arg1[arg4];
					arg1[arg4++] = (((local186 & 0xFF00FF) * local158 & 0xFF00FF00) + ((local186 & 0xFF00) * local158 & 0xFF0000) >> 8) + local178;
				}
			}
			arg3 += local82 + arg8;
			arg4 += local82 + arg7;
		}
	}
}

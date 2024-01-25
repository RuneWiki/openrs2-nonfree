import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ug")
public final class Class18_Sub4 extends Class18 {

	@OriginalMember(owner = "client!ug", name = "E", descriptor = "Lclient!fg;")
	private Class30_Sub2 aClass30_Sub2_11;

	@OriginalMember(owner = "client!ug", name = "C", descriptor = "[I")
	private final int[] anIntArray584;

	@OriginalMember(owner = "client!ug", name = "D", descriptor = "[I")
	private final int[] anIntArray585;

	@OriginalMember(owner = "client!ug", name = "z", descriptor = "[[B")
	private final byte[][] aByteArrayArray21;

	@OriginalMember(owner = "client!ug", name = "F", descriptor = "[I")
	private final int[] anIntArray586;

	@OriginalMember(owner = "client!ug", name = "B", descriptor = "[I")
	private final int[] anIntArray583;

	@OriginalMember(owner = "client!ug", name = "<init>", descriptor = "(Lclient!fg;Lclient!gg;[Lclient!ho;[I[I)V")
	public Class18_Sub4(@OriginalArg(0) Class30_Sub2 arg0, @OriginalArg(1) Class84 arg1, @OriginalArg(2) Class98[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		super(arg0, arg1);
		this.aClass30_Sub2_11 = arg0;
		this.aClass30_Sub2_11 = arg0;
		this.anIntArray584 = arg3;
		this.anIntArray585 = arg4;
		this.aByteArrayArray21 = new byte[arg2.length][];
		this.anIntArray586 = new int[arg2.length];
		this.anIntArray583 = new int[arg2.length];
		for (@Pc(32) int local32 = 0; local32 < arg2.length; local32++) {
			this.aByteArrayArray21[local32] = arg2[local32].aByteArray34;
			this.anIntArray586[local32] = arg2[local32].anInt3176;
			this.anIntArray583[local32] = arg2[local32].anInt3173;
		}
	}

	@OriginalMember(owner = "client!ug", name = "g", descriptor = "(CIIIZ)V")
	@Override
	protected void g(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		arg1 += this.anIntArray583[arg0];
		arg2 += this.anIntArray586[arg0];
		@Pc(18) int local18 = this.anIntArray584[arg0];
		@Pc(23) int local23 = this.anIntArray585[arg0];
		@Pc(27) int local27 = this.aClass30_Sub2_11.anInt2299;
		@Pc(33) int local33 = arg1 + arg2 * local27;
		@Pc(37) int local37 = local27 - local18;
		@Pc(39) int local39 = 0;
		@Pc(41) int local41 = 0;
		@Pc(52) int local52;
		if (arg2 < this.aClass30_Sub2_11.anInt2303) {
			local52 = this.aClass30_Sub2_11.anInt2303 - arg2;
			local23 -= local52;
			arg2 = this.aClass30_Sub2_11.anInt2303;
			local41 += local52 * local18;
			local33 += local52 * local27;
		}
		if (arg2 + local23 > this.aClass30_Sub2_11.anInt2310) {
			local23 -= arg2 + local23 - this.aClass30_Sub2_11.anInt2310;
		}
		if (arg1 < this.aClass30_Sub2_11.anInt2308) {
			local52 = this.aClass30_Sub2_11.anInt2308 - arg1;
			local18 -= local52;
			arg1 = this.aClass30_Sub2_11.anInt2308;
			local41 += local52;
			local33 += local52;
			local39 += local52;
			local37 += local52;
		}
		if (arg1 + local18 > this.aClass30_Sub2_11.anInt2305) {
			local52 = arg1 + local18 - this.aClass30_Sub2_11.anInt2305;
			local18 -= local52;
			local39 += local52;
			local37 += local52;
		}
		if (local18 > 0 && local23 > 0) {
			this.method5777(this.aByteArrayArray21[arg0], this.aClass30_Sub2_11.anIntArray199, arg3, local41, local33, local18, local23, local37, local39);
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(CIIIZLclient!i;II)V")
	@Override
	protected void method5756(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class74 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg5 == null) {
			this.g(arg0, arg1, arg2, arg3, arg4);
			return;
		}
		arg1 += this.anIntArray583[arg0];
		arg2 += this.anIntArray586[arg0];
		@Pc(28) int local28 = this.anIntArray584[arg0];
		@Pc(33) int local33 = this.anIntArray585[arg0];
		@Pc(37) int local37 = this.aClass30_Sub2_11.anInt2299;
		@Pc(43) int local43 = arg1 + arg2 * local37;
		@Pc(47) int local47 = local37 - local28;
		@Pc(49) int local49 = 0;
		@Pc(51) int local51 = 0;
		@Pc(62) int local62;
		if (arg2 < this.aClass30_Sub2_11.anInt2303) {
			local62 = this.aClass30_Sub2_11.anInt2303 - arg2;
			local33 -= local62;
			arg2 = this.aClass30_Sub2_11.anInt2303;
			local51 = local62 * local28;
			local43 += local62 * local37;
		}
		if (arg2 + local33 > this.aClass30_Sub2_11.anInt2310) {
			local33 -= arg2 + local33 - this.aClass30_Sub2_11.anInt2310;
		}
		if (arg1 < this.aClass30_Sub2_11.anInt2308) {
			local62 = this.aClass30_Sub2_11.anInt2308 - arg1;
			local28 -= local62;
			arg1 = this.aClass30_Sub2_11.anInt2308;
			local51 += local62;
			local43 += local62;
			local49 = local62;
			local47 += local62;
		}
		if (arg1 + local28 > this.aClass30_Sub2_11.anInt2305) {
			local62 = arg1 + local28 - this.aClass30_Sub2_11.anInt2305;
			local28 -= local62;
			local49 += local62;
			local47 += local62;
		}
		if (local28 > 0 && local33 > 0) {
			this.method5778(this.aByteArrayArray21[arg0], this.aClass30_Sub2_11.anIntArray199, arg3, local51, local43, local28, local33, local47, local49, arg1, arg2, this.anIntArray584[arg0], arg5, arg6, arg7);
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "([B[IIIIIIII)V")
	private void method5777(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
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

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "([B[IIIIIIIIIIILclient!i;II)V")
	private void method5778(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) Class74 arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		@Pc(2) Class74_Sub1 local2 = (Class74_Sub1) arg12;
		@Pc(5) int[] local5 = local2.anIntArray205;
		@Pc(8) int[] local8 = local2.anIntArray204;
		@Pc(14) int local14 = arg9 - this.aClass30_Sub2_11.anInt2308;
		@Pc(16) int local16 = arg10;
		if (arg14 > arg10) {
			local16 = arg14;
			arg4 += (arg14 - arg10) * this.aClass30_Sub2_11.anInt2299;
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

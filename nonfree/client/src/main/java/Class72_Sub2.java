import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eea")
public final class Class72_Sub2 extends Class72 {

	@OriginalMember(owner = "client!eea", name = "x", descriptor = "Lclient!ni;")
	private Class143_Sub3 aClass143_Sub3_4;

	@OriginalMember(owner = "client!eea", name = "v", descriptor = "[I")
	private final int[] anIntArray110;

	@OriginalMember(owner = "client!eea", name = "w", descriptor = "[I")
	private final int[] anIntArray111;

	@OriginalMember(owner = "client!eea", name = "z", descriptor = "[[B")
	private final byte[][] aByteArrayArray5;

	@OriginalMember(owner = "client!eea", name = "B", descriptor = "[I")
	private final int[] anIntArray113;

	@OriginalMember(owner = "client!eea", name = "y", descriptor = "[I")
	private final int[] anIntArray112;

	@OriginalMember(owner = "client!eea", name = "<init>", descriptor = "(Lclient!ni;Lclient!kf;[Lclient!re;[I[I)V")
	public Class72_Sub2(@OriginalArg(0) Class143_Sub3 arg0, @OriginalArg(1) Class198 arg1, @OriginalArg(2) Class301[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		super(arg0, arg1);
		this.aClass143_Sub3_4 = arg0;
		this.aClass143_Sub3_4 = arg0;
		this.anIntArray110 = arg3;
		this.anIntArray111 = arg4;
		this.aByteArrayArray5 = new byte[arg2.length][];
		this.anIntArray113 = new int[arg2.length];
		this.anIntArray112 = new int[arg2.length];
		for (@Pc(32) int local32 = 0; local32 < arg2.length; local32++) {
			@Pc(37) Class301 local37 = arg2[local32];
			if (local37.aByteArray81 == null) {
				@Pc(50) byte[] local50 = local37.aByteArray82;
				@Pc(59) byte[] local59 = this.aByteArrayArray5[local32] = new byte[local50.length];
				for (@Pc(61) int local61 = 0; local61 < local50.length; local61++) {
					local59[local61] = (byte) (local50[local61] == 0 ? 0 : -1);
				}
			} else {
				this.aByteArrayArray5[local32] = local37.aByteArray81;
			}
			this.anIntArray113[local32] = local37.anInt8499;
			this.anIntArray112[local32] = local37.anInt8500;
		}
	}

	@OriginalMember(owner = "client!eea", name = "fa", descriptor = "(CIIIZ)V")
	@Override
	protected void fa(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		arg1 += this.anIntArray112[arg0];
		arg2 += this.anIntArray113[arg0];
		@Pc(18) int local18 = this.anIntArray110[arg0];
		@Pc(23) int local23 = this.anIntArray111[arg0];
		@Pc(27) int local27 = this.aClass143_Sub3_4.anInt6863;
		@Pc(33) int local33 = arg1 + arg2 * local27;
		@Pc(37) int local37 = local27 - local18;
		@Pc(39) int local39 = 0;
		@Pc(41) int local41 = 0;
		@Pc(52) int local52;
		if (arg2 < this.aClass143_Sub3_4.anInt6856) {
			local52 = this.aClass143_Sub3_4.anInt6856 - arg2;
			local23 -= local52;
			arg2 = this.aClass143_Sub3_4.anInt6856;
			local41 += local52 * local18;
			local33 += local52 * local27;
		}
		if (arg2 + local23 > this.aClass143_Sub3_4.anInt6852) {
			local23 -= arg2 + local23 - this.aClass143_Sub3_4.anInt6852;
		}
		if (arg1 < this.aClass143_Sub3_4.anInt6859) {
			local52 = this.aClass143_Sub3_4.anInt6859 - arg1;
			local18 -= local52;
			arg1 = this.aClass143_Sub3_4.anInt6859;
			local41 += local52;
			local33 += local52;
			local39 += local52;
			local37 += local52;
		}
		if (arg1 + local18 > this.aClass143_Sub3_4.anInt6870) {
			local52 = arg1 + local18 - this.aClass143_Sub3_4.anInt6870;
			local18 -= local52;
			local39 += local52;
			local37 += local52;
		}
		if (local18 > 0 && local23 > 0) {
			this.method1973(this.aByteArrayArray5[arg0], this.aClass143_Sub3_4.anIntArray386, arg3, local41, local33, local18, local23, local37, local39);
		}
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "([B[IIIIIIII)V")
	private void method1973(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
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

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(CIIIZLclient!aa;II)V")
	@Override
	protected void method6910(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg5 == null) {
			this.fa(arg0, arg1, arg2, arg3, arg4);
			return;
		}
		arg1 += this.anIntArray112[arg0];
		arg2 += this.anIntArray113[arg0];
		@Pc(28) int local28 = this.anIntArray110[arg0];
		@Pc(33) int local33 = this.anIntArray111[arg0];
		@Pc(37) int local37 = this.aClass143_Sub3_4.anInt6863;
		@Pc(43) int local43 = arg1 + arg2 * local37;
		@Pc(47) int local47 = local37 - local28;
		@Pc(49) int local49 = 0;
		@Pc(51) int local51 = 0;
		@Pc(62) int local62;
		if (arg2 < this.aClass143_Sub3_4.anInt6856) {
			local62 = this.aClass143_Sub3_4.anInt6856 - arg2;
			local33 -= local62;
			arg2 = this.aClass143_Sub3_4.anInt6856;
			local51 = local62 * local28;
			local43 += local62 * local37;
		}
		if (arg2 + local33 > this.aClass143_Sub3_4.anInt6852) {
			local33 -= arg2 + local33 - this.aClass143_Sub3_4.anInt6852;
		}
		if (arg1 < this.aClass143_Sub3_4.anInt6859) {
			local62 = this.aClass143_Sub3_4.anInt6859 - arg1;
			local28 -= local62;
			arg1 = this.aClass143_Sub3_4.anInt6859;
			local51 += local62;
			local43 += local62;
			local49 = local62;
			local47 += local62;
		}
		if (arg1 + local28 > this.aClass143_Sub3_4.anInt6870) {
			local62 = arg1 + local28 - this.aClass143_Sub3_4.anInt6870;
			local28 -= local62;
			local49 += local62;
			local47 += local62;
		}
		if (local28 > 0 && local33 > 0) {
			this.method1974(this.aByteArrayArray5[arg0], this.aClass143_Sub3_4.anIntArray386, arg3, local51, local43, local28, local33, local47, local49, arg1, arg2, this.anIntArray110[arg0], arg5, arg6, arg7);
		}
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "([B[IIIIIIIIIIILclient!aa;II)V")
	private void method1974(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) Class1 arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		@Pc(2) Class1_Sub1 local2 = (Class1_Sub1) arg12;
		@Pc(5) int[] local5 = local2.anIntArray102;
		@Pc(8) int[] local8 = local2.anIntArray101;
		@Pc(14) int local14 = arg9 - this.aClass143_Sub3_4.anInt6859;
		@Pc(16) int local16 = arg10;
		if (arg14 > arg10) {
			local16 = arg14;
			arg4 += (arg14 - arg10) * this.aClass143_Sub3_4.anInt6863;
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

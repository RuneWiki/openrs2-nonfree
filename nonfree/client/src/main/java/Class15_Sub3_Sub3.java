import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!km")
public abstract class Class15_Sub3_Sub3 extends Class15_Sub3 {

	@OriginalMember(owner = "client!km", name = "I", descriptor = "S")
	public short aShort63;

	@OriginalMember(owner = "client!km", name = "M", descriptor = "B")
	public final byte aByte86;

	@OriginalMember(owner = "client!km", name = "F", descriptor = "S")
	public short aShort62;

	@OriginalMember(owner = "client!km", name = "N", descriptor = "S")
	public short aShort64;

	@OriginalMember(owner = "client!km", name = "P", descriptor = "Z")
	public final boolean aBoolean432;

	@OriginalMember(owner = "client!km", name = "Q", descriptor = "S")
	public short aShort65;

	@OriginalMember(owner = "client!km", name = "<init>", descriptor = "(IIIIIIIIIZB)V")
	protected Class15_Sub3_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) byte arg10) {
		super.anInt11024 = arg4;
		this.aShort63 = (short) arg6;
		super.anInt11029 = arg3;
		this.aByte86 = arg10;
		super.anInt11022 = arg2;
		this.aShort62 = (short) arg5;
		super.aByte141 = (byte) arg1;
		super.aByte142 = (byte) arg0;
		this.aShort64 = (short) arg7;
		this.aBoolean432 = arg9;
		this.aShort65 = (short) arg8;
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(I[Lclient!mfa;)I")
	@Override
	public final int method9428(@OriginalArg(1) Class2_Sub13[] arg0) {
		@Pc(7) int local7 = 0;
		@Pc(15) int local15;
		@Pc(38) int local38;
		@Pc(50) int local50;
		label113: for (@Pc(10) int local10 = this.aShort62; local10 <= this.aShort63; local10++) {
			label111: for (local15 = this.aShort64; local15 <= this.aShort65; local15++) {
				@Pc(26) long local26 = Static163.aLongArrayArrayArray1[super.aByte142][local10][local15];
				@Pc(28) long local28 = 0L;
				while (true) {
					label106: while (true) {
						if (local28 > 48L) {
							continue label111;
						}
						local38 = (int) (local26 >>> (int) local28 & 0xFFFFL);
						if (local38 <= 0) {
							continue label111;
						}
						@Pc(48) Class84 local48 = Static320.aClass84Array8[local38 - 1];
						for (local50 = 0; local50 < local7; local50++) {
							if (local48.aClass2_Sub13_1 == arg0[local50]) {
								local28 += 16L;
								continue label106;
							}
						}
						arg0[local7++] = local48.aClass2_Sub13_1;
						if (local7 == 4) {
							break label113;
						}
						local28 += 16L;
					}
				}
			}
		}
		for (local15 = local7; local15 < 4; local15++) {
			arg0[local15] = null;
		}
		if (this.aByte86 != 0) {
			local38 = this.aShort62 - Static440.anInt8000;
			@Pc(138) int local138 = this.aShort64 - Static139.anInt2631;
			@Pc(162) int local162;
			@Pc(152) short local152;
			@Pc(165) short local165;
			@Pc(157) int local157;
			if (this.aByte86 == 1) {
				if (local38 >= local138) {
					local152 = this.aShort64;
					local157 = this.aShort62 - 1;
					local162 = this.aShort64 + 1;
					local165 = this.aShort62;
				} else {
					local162 = this.aShort64 - 1;
					local157 = this.aShort62 + 1;
					local165 = this.aShort62;
					local152 = this.aShort64;
				}
			} else if (-local38 >= local138) {
				local152 = this.aShort64;
				local157 = this.aShort62 + 1;
				local162 = this.aShort64 + 1;
				local165 = this.aShort62;
			} else {
				local152 = this.aShort64;
				local162 = this.aShort64 - 1;
				local165 = this.aShort62;
				local157 = this.aShort62 - 1;
			}
			label77: for (local50 = 0; local50 < local7; local50++) {
				@Pc(240) long local240 = Static163.aLongArrayArrayArray1[super.aByte142][local165][local162];
				@Pc(251) Class84 local251;
				while (local240 != 0L) {
					local251 = Static320.aClass84Array8[(int) ((local240 & 0xFFFFL) - 1L)];
					local240 >>>= 0x10;
					if (arg0[local50] == local251.aClass2_Sub13_1) {
						continue label77;
					}
				}
				local240 = Static163.aLongArrayArrayArray1[super.aByte142][local157][local152];
				while (local240 != 0L) {
					local251 = Static320.aClass84Array8[(int) ((local240 & 0xFFFFL) - 1L)];
					local240 >>>= 0x10;
					if (arg0[local50] == local251.aClass2_Sub13_1) {
						continue label77;
					}
				}
				for (@Pc(307) int local307 = local50; local307 < local7 - 1; local307++) {
					arg0[local307] = arg0[local307 + 1];
				}
				local7--;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(BLclient!ha;)Z")
	@Override
	public final boolean method9433(@OriginalArg(1) Class101 arg0) {
		return Static152.method3140(this.aShort64, this.aShort63, super.aByte141, this.method9442(arg0), this.aShort62, this.aShort65);
	}

	@OriginalMember(owner = "client!km", name = "i", descriptor = "(I)V")
	public void method5328() {
	}

	@OriginalMember(owner = "client!km", name = "g", descriptor = "(B)Z")
	@Override
	public final boolean method9437() {
		for (@Pc(8) int local8 = this.aShort62; local8 <= this.aShort63; local8++) {
			for (@Pc(21) int local21 = this.aShort64; local21 <= this.aShort65; local21++) {
				@Pc(29) int local29 = Static602.anInt10539 + local8 - Static440.anInt8000;
				if (local29 >= 0 && Static423.aBooleanArrayArray8.length > local29) {
					@Pc(47) int local47 = Static602.anInt10539 + local21 - Static139.anInt2631;
					if (local47 >= 0 && local47 < Static423.aBooleanArrayArray8.length && Static423.aBooleanArrayArray8[local29][local47]) {
						return true;
					}
				}
			}
		}
		return false;
	}
}

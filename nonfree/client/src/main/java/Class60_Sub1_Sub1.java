import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!laa")
public abstract class Class60_Sub1_Sub1 extends Class60_Sub1 {

	@OriginalMember(owner = "client!laa", name = "N", descriptor = "Z")
	public final boolean aBoolean637;

	@OriginalMember(owner = "client!laa", name = "I", descriptor = "S")
	public short aShort99;

	@OriginalMember(owner = "client!laa", name = "O", descriptor = "S")
	public short aShort101;

	@OriginalMember(owner = "client!laa", name = "J", descriptor = "S")
	public short aShort100;

	@OriginalMember(owner = "client!laa", name = "D", descriptor = "S")
	public short aShort102;

	@OriginalMember(owner = "client!laa", name = "H", descriptor = "B")
	public final byte aByte127;

	@OriginalMember(owner = "client!laa", name = "<init>", descriptor = "(IIIIIIIIIZB)V")
	protected Class60_Sub1_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) byte arg10) {
		this.aBoolean637 = arg9;
		super.aByte134 = (byte) arg1;
		this.aShort99 = (short) arg8;
		super.anInt9048 = arg2;
		super.aByte135 = (byte) arg0;
		this.aShort101 = (short) arg6;
		super.anInt9051 = arg3;
		this.aShort100 = (short) arg5;
		this.aShort102 = (short) arg7;
		this.aByte127 = arg10;
		super.anInt9057 = arg4;
	}

	@OriginalMember(owner = "client!laa", name = "b", descriptor = "(B)Z")
	@Override
	public final boolean method7912() {
		for (@Pc(8) int local8 = this.aShort100; local8 <= this.aShort101; local8++) {
			for (@Pc(15) int local15 = this.aShort102; local15 <= this.aShort99; local15++) {
				@Pc(24) int local24 = Static382.anInt6636 + local8 - Static506.anInt8446;
				if (local24 >= 0 && local24 < Static488.aBooleanArrayArray4.length) {
					@Pc(47) int local47 = local15 + Static382.anInt6636 - Static676.anInt10368;
					if (local47 >= 0 && local47 < Static488.aBooleanArrayArray4.length && Static488.aBooleanArrayArray4[local24][local47]) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(B[Lclient!ta;)I")
	@Override
	public final int method7923(@OriginalArg(1) Class6_Sub10[] arg0) {
		@Pc(7) int local7 = 0;
		@Pc(15) int local15;
		@Pc(53) int local53;
		label113: for (@Pc(10) int local10 = this.aShort100; local10 <= this.aShort101; local10++) {
			label111: for (local15 = this.aShort102; local15 <= this.aShort99; local15++) {
				@Pc(26) long local26 = Static191.aLongArrayArrayArray1[super.aByte135][local10][local15];
				@Pc(28) long local28 = 0L;
				while (true) {
					label106: while (true) {
						if (local28 > 48L) {
							continue label111;
						}
						@Pc(38) int local38 = (int) (local26 >>> (int) local28 & 0xFFFFL);
						if (local38 <= 0) {
							continue label111;
						}
						@Pc(51) Class256 local51 = Static483.aClass256Array1[local38 - 1];
						for (local53 = 0; local53 < local7; local53++) {
							if (local51.aClass6_Sub10_3 == arg0[local53]) {
								local28 += 16L;
								continue label106;
							}
						}
						arg0[local7++] = local51.aClass6_Sub10_3;
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
		if (this.aByte127 != 0) {
			@Pc(164) int local164 = this.aShort100 - Static506.anInt8446;
			local53 = this.aShort102 - Static676.anInt10368;
			@Pc(187) short local187;
			@Pc(200) int local200;
			@Pc(195) int local195;
			@Pc(190) short local190;
			if (this.aByte127 == 1) {
				if (local164 >= local53) {
					local187 = this.aShort100;
					local190 = this.aShort102;
					local200 = this.aShort100 - 1;
					local195 = this.aShort102 + 1;
				} else {
					local190 = this.aShort102;
					local200 = this.aShort100 + 1;
					local187 = this.aShort100;
					local195 = this.aShort102 - 1;
				}
			} else if (local53 <= -local164) {
				local187 = this.aShort100;
				local190 = this.aShort102;
				local195 = this.aShort102 + 1;
				local200 = this.aShort100 + 1;
			} else {
				local200 = this.aShort100 - 1;
				local190 = this.aShort102;
				local187 = this.aShort100;
				local195 = this.aShort102 - 1;
			}
			label77: for (@Pc(261) int local261 = 0; local261 < local7; local261++) {
				@Pc(272) long local272 = Static191.aLongArrayArrayArray1[super.aByte135][local187][local195];
				@Pc(283) Class256 local283;
				while (local272 != 0L) {
					local283 = Static483.aClass256Array1[(int) ((local272 & 0xFFFFL) - 1L)];
					local272 >>>= 0x10;
					if (local283.aClass6_Sub10_3 == arg0[local261]) {
						continue label77;
					}
				}
				local272 = Static191.aLongArrayArrayArray1[super.aByte135][local200][local190];
				while (local272 != 0L) {
					local283 = Static483.aClass256Array1[(int) ((local272 & 0xFFFFL) - 1L)];
					local272 >>>= 0x10;
					if (local283.aClass6_Sub10_3 == arg0[local261]) {
						continue label77;
					}
				}
				for (@Pc(347) int local347 = local261; local347 < local7 - 1; local347++) {
					arg0[local347] = arg0[local347 + 1];
				}
				local7--;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!laa", name = "e", descriptor = "(B)V")
	public void method7280() {
	}

	@OriginalMember(owner = "client!laa", name = "b", descriptor = "(Lclient!ha;B)Z")
	@Override
	public final boolean method7925(@OriginalArg(0) Class75 arg0) {
		return Static74.method1010(this.aShort100, super.aByte134, this.method7924(arg0), this.aShort102, this.aShort101, this.aShort99);
	}
}

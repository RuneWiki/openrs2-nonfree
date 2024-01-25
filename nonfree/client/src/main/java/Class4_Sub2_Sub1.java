import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kg")
public abstract class Class4_Sub2_Sub1 extends Class4_Sub2 {

	@OriginalMember(owner = "client!kg", name = "E", descriptor = "S")
	public short aShort130;

	@OriginalMember(owner = "client!kg", name = "D", descriptor = "S")
	public short aShort128;

	@OriginalMember(owner = "client!kg", name = "I", descriptor = "S")
	public short aShort129;

	@OriginalMember(owner = "client!kg", name = "B", descriptor = "B")
	public final byte aByte135;

	@OriginalMember(owner = "client!kg", name = "J", descriptor = "S")
	public short aShort127;

	@OriginalMember(owner = "client!kg", name = "A", descriptor = "Z")
	public final boolean aBoolean888;

	@OriginalMember(owner = "client!kg", name = "<init>", descriptor = "(IIIIIIIIIZB)V")
	protected Class4_Sub2_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) byte arg10) {
		this.aShort130 = (short) arg5;
		this.aShort128 = (short) arg6;
		super.anInt10228 = arg4;
		this.aShort129 = (short) arg8;
		super.anInt10229 = arg2;
		super.anInt10234 = arg3;
		super.aByte134 = (byte) arg1;
		this.aByte135 = arg10;
		this.aShort127 = (short) arg7;
		this.aBoolean888 = arg9;
		super.aByte133 = (byte) arg0;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(ILclient!ha;)Z")
	@Override
	public final boolean method8972(@OriginalArg(1) Class145 arg0) {
		return Static181.method2649(this.method8971(arg0), super.aByte134, this.aShort128, this.aShort127, this.aShort130, this.aShort129);
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "([Lclient!bba;B)I")
	@Override
	public final int method8969(@OriginalArg(0) Class2_Sub7[] arg0) {
		@Pc(7) int local7 = 0;
		@Pc(23) int local23;
		@Pc(46) int local46;
		@Pc(60) int local60;
		label113: for (@Pc(18) int local18 = this.aShort130; local18 <= this.aShort128; local18++) {
			label111: for (local23 = this.aShort127; local23 <= this.aShort129; local23++) {
				@Pc(34) long local34 = Static255.aLongArrayArrayArray1[super.aByte133][local18][local23];
				@Pc(36) long local36 = 0L;
				while (true) {
					label106: while (true) {
						if (local36 > 48L) {
							continue label111;
						}
						local46 = (int) (local34 >>> (int) local36 & 0xFFFFL);
						if (local46 <= 0) {
							continue label111;
						}
						@Pc(58) Class248 local58 = Static292.aClass248Array1[local46 - 1];
						for (local60 = 0; local60 < local7; local60++) {
							if (arg0[local60] == local58.aClass2_Sub7_3) {
								local36 += 16L;
								continue label106;
							}
						}
						arg0[local7++] = local58.aClass2_Sub7_3;
						if (local7 == 4) {
							break label113;
						}
						local36 += 16L;
					}
				}
			}
		}
		for (local23 = local7; local23 < 4; local23++) {
			arg0[local23] = null;
		}
		if (this.aByte135 != 0) {
			local46 = this.aShort130 - Static20.anInt267;
			@Pc(168) int local168 = this.aShort127 - Static503.anInt2766;
			@Pc(197) int local197;
			@Pc(200) short local200;
			@Pc(192) short local192;
			@Pc(189) int local189;
			if (this.aByte135 == 1) {
				if (local46 >= local168) {
					local189 = this.aShort130 - 1;
					local197 = this.aShort127 + 1;
					local200 = this.aShort127;
					local192 = this.aShort130;
				} else {
					local197 = this.aShort127 - 1;
					local189 = this.aShort130 + 1;
					local200 = this.aShort127;
					local192 = this.aShort130;
				}
			} else if (-local46 >= local168) {
				local189 = this.aShort130 + 1;
				local192 = this.aShort130;
				local197 = this.aShort127 + 1;
				local200 = this.aShort127;
			} else {
				local192 = this.aShort130;
				local197 = this.aShort127 - 1;
				local200 = this.aShort127;
				local189 = this.aShort130 - 1;
			}
			label77: for (local60 = 0; local60 < local7; local60++) {
				@Pc(272) long local272 = Static255.aLongArrayArrayArray1[super.aByte133][local192][local197];
				@Pc(283) Class248 local283;
				while (local272 != 0L) {
					local283 = Static292.aClass248Array1[(int) ((local272 & 0xFFFFL) - 1L)];
					local272 >>>= 0x10;
					if (arg0[local60] == local283.aClass2_Sub7_3) {
						continue label77;
					}
				}
				local272 = Static255.aLongArrayArrayArray1[super.aByte133][local189][local200];
				while (local272 != 0L) {
					local283 = Static292.aClass248Array1[(int) ((local272 & 0xFFFFL) - 1L)];
					local272 >>>= 0x10;
					if (arg0[local60] == local283.aClass2_Sub7_3) {
						continue label77;
					}
				}
				for (@Pc(347) int local347 = local60; local347 < local7 - 1; local347++) {
					arg0[local347] = arg0[local347 + 1];
				}
				local7--;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!kg", name = "b", descriptor = "(Z)Z")
	@Override
	public final boolean method8964() {
		for (@Pc(8) int local8 = this.aShort130; local8 <= this.aShort128; local8++) {
			for (@Pc(15) int local15 = this.aShort127; local15 <= this.aShort129; local15++) {
				@Pc(23) int local23 = Static128.anInt2136 + local8 - Static20.anInt267;
				if (local23 >= 0 && local23 < Static208.aBooleanArrayArray6.length) {
					@Pc(42) int local42 = local15 + Static128.anInt2136 - Static503.anInt2766;
					if (local42 >= 0 && local42 < Static208.aBooleanArrayArray6.length && Static208.aBooleanArrayArray6[local23][local42]) {
						return true;
					}
				}
			}
		}
		if (false) {
			return false;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!kg", name = "i", descriptor = "(I)V")
	public void method8985() {
	}
}

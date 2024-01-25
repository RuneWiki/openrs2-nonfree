import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iu")
public abstract class Class4_Sub3_Sub3 extends Class4_Sub3 {

	@OriginalMember(owner = "client!iu", name = "z", descriptor = "B")
	public final byte aByte133;

	@OriginalMember(owner = "client!iu", name = "E", descriptor = "S")
	public short aShort110;

	@OriginalMember(owner = "client!iu", name = "y", descriptor = "S")
	public short aShort109;

	@OriginalMember(owner = "client!iu", name = "J", descriptor = "Z")
	public final boolean aBoolean717;

	@OriginalMember(owner = "client!iu", name = "H", descriptor = "S")
	public short aShort107;

	@OriginalMember(owner = "client!iu", name = "x", descriptor = "S")
	public short aShort108;

	@OriginalMember(owner = "client!iu", name = "<init>", descriptor = "(IIIIIIIIIZB)V")
	protected Class4_Sub3_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) byte arg10) {
		super.anInt11178 = arg4;
		this.aByte133 = arg10;
		this.aShort110 = (short) arg8;
		this.aShort109 = (short) arg7;
		super.aByte147 = (byte) arg1;
		this.aBoolean717 = arg9;
		this.aShort107 = (short) arg6;
		this.aShort108 = (short) arg5;
		super.anInt11184 = arg2;
		super.anInt11182 = arg3;
		super.aByte146 = (byte) arg0;
	}

	@OriginalMember(owner = "client!iu", name = "j", descriptor = "(I)Z")
	@Override
	public final boolean method9486() {
		for (@Pc(18) int local18 = this.aShort108; local18 <= this.aShort107; local18++) {
			for (@Pc(22) int local22 = this.aShort109; local22 <= this.aShort110; local22++) {
				@Pc(30) int local30 = local18 + Static459.anInt10513 - Static307.anInt5453;
				if (local30 >= 0 && Static18.aBooleanArrayArray1.length > local30) {
					@Pc(51) int local51 = local22 + Static459.anInt10513 - Static325.anInt5630;
					if (local51 >= 0 && Static18.aBooleanArrayArray1.length > local51 && Static18.aBooleanArrayArray1[local30][local51]) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "([Lclient!rfa;B)I")
	@Override
	public final int method9488(@OriginalArg(0) Class14_Sub18[] arg0) {
		@Pc(7) int local7 = 0;
		@Pc(27) int local27;
		@Pc(50) int local50;
		@Pc(64) int local64;
		label113: for (@Pc(22) int local22 = this.aShort108; local22 <= this.aShort107; local22++) {
			label111: for (local27 = this.aShort109; local27 <= this.aShort110; local27++) {
				@Pc(38) long local38 = Static378.aLongArrayArrayArray1[super.aByte146][local22][local27];
				@Pc(40) long local40 = 0L;
				while (true) {
					label106: while (true) {
						if (local40 > 48L) {
							continue label111;
						}
						local50 = (int) (local38 >>> (int) local40 & 0xFFFFL);
						if (local50 <= 0) {
							continue label111;
						}
						@Pc(62) Class275 local62 = Static351.aClass275Array5[local50 - 1];
						for (local64 = 0; local64 < local7; local64++) {
							if (local62.aClass14_Sub18_2 == arg0[local64]) {
								local40 += 16L;
								continue label106;
							}
						}
						arg0[local7++] = local62.aClass14_Sub18_2;
						if (local7 == 4) {
							break label113;
						}
						local40 += 16L;
					}
				}
			}
		}
		for (local27 = local7; local27 < 4; local27++) {
			arg0[local27] = null;
		}
		if (this.aByte133 != 0) {
			local50 = this.aShort108 - Static307.anInt5453;
			@Pc(164) int local164 = this.aShort109 - Static325.anInt5630;
			@Pc(186) int local186;
			@Pc(189) short local189;
			@Pc(192) short local192;
			@Pc(181) int local181;
			if (this.aByte133 == 1) {
				if (local50 >= local164) {
					local189 = this.aShort109;
					local192 = this.aShort108;
					local181 = this.aShort108 - 1;
					local186 = this.aShort109 + 1;
				} else {
					local181 = this.aShort108 + 1;
					local186 = this.aShort109 - 1;
					local189 = this.aShort109;
					local192 = this.aShort108;
				}
			} else if (local164 <= -local50) {
				local181 = this.aShort108 + 1;
				local186 = this.aShort109 + 1;
				local189 = this.aShort109;
				local192 = this.aShort108;
			} else {
				local181 = this.aShort108 - 1;
				local186 = this.aShort109 - 1;
				local192 = this.aShort108;
				local189 = this.aShort109;
			}
			label77: for (local64 = 0; local64 < local7; local64++) {
				@Pc(268) long local268 = Static378.aLongArrayArrayArray1[super.aByte146][local192][local186];
				@Pc(279) Class275 local279;
				while (local268 != 0L) {
					local279 = Static351.aClass275Array5[(int) ((local268 & 0xFFFFL) - 1L)];
					local268 >>>= 0x10;
					if (arg0[local64] == local279.aClass14_Sub18_2) {
						continue label77;
					}
				}
				local268 = Static378.aLongArrayArrayArray1[super.aByte146][local181][local189];
				while (local268 != 0L) {
					local279 = Static351.aClass275Array5[(int) ((local268 & 0xFFFFL) - 1L)];
					local268 >>>= 0x10;
					if (local279.aClass14_Sub18_2 == arg0[local64]) {
						continue label77;
					}
				}
				for (@Pc(345) int local345 = local64; local345 < local7 - 1; local345++) {
					arg0[local345] = arg0[local345 + 1];
				}
				local7--;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!iu", name = "e", descriptor = "(B)V")
	public void method8782() {
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(Lclient!ha;B)Z")
	@Override
	public final boolean method9487(@OriginalArg(0) Class144 arg0) {
		return Static241.method4041(this.aShort110, super.aByte147, this.aShort109, this.method9492(arg0), this.aShort107, this.aShort108);
	}
}

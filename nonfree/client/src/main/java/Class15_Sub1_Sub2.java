import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cs")
public abstract class Class15_Sub1_Sub2 extends Class15_Sub1 {

	@OriginalMember(owner = "client!cs", name = "F", descriptor = "S")
	public short aShort104;

	@OriginalMember(owner = "client!cs", name = "K", descriptor = "S")
	public short aShort105;

	@OriginalMember(owner = "client!cs", name = "J", descriptor = "B")
	public final byte aByte106;

	@OriginalMember(owner = "client!cs", name = "R", descriptor = "S")
	public short aShort106;

	@OriginalMember(owner = "client!cs", name = "A", descriptor = "Z")
	public final boolean aBoolean652;

	@OriginalMember(owner = "client!cs", name = "C", descriptor = "S")
	public short aShort103;

	@OriginalMember(owner = "client!cs", name = "<init>", descriptor = "(IIIIIIIIIZB)V")
	protected Class15_Sub1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) byte arg10) {
		this.aShort104 = (short) arg6;
		this.aShort105 = (short) arg5;
		super.anInt10301 = arg2;
		super.anInt10297 = arg3;
		this.aByte106 = arg10;
		super.aByte125 = (byte) arg1;
		super.aByte124 = (byte) arg0;
		super.anInt10298 = arg4;
		this.aShort106 = (short) arg8;
		this.aBoolean652 = arg9;
		this.aShort103 = (short) arg7;
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(B[Lclient!ada;)I")
	@Override
	public final int method8329(@OriginalArg(1) Class8_Sub1[] arg0) {
		@Pc(7) int local7 = 0;
		@Pc(15) int local15;
		@Pc(38) int local38;
		@Pc(50) int local50;
		label113: for (@Pc(10) int local10 = this.aShort105; local10 <= this.aShort104; local10++) {
			label111: for (local15 = this.aShort103; local15 <= this.aShort106; local15++) {
				@Pc(26) long local26 = Static528.aLongArrayArrayArray1[super.aByte124][local10][local15];
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
						@Pc(48) Class204 local48 = Static626.aClass204Array1[local38 - 1];
						for (local50 = 0; local50 < local7; local50++) {
							if (arg0[local50] == local48.aClass8_Sub1_3) {
								local28 += 16L;
								continue label106;
							}
						}
						arg0[local7++] = local48.aClass8_Sub1_3;
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
		if (this.aByte106 != 0) {
			local38 = this.aShort105 - Static603.anInt10257;
			@Pc(143) int local143 = this.aShort103 - Static470.anInt8495;
			@Pc(173) int local173;
			@Pc(168) short local168;
			@Pc(165) short local165;
			@Pc(162) int local162;
			if (this.aByte106 == 1) {
				if (local143 > local38) {
					local173 = this.aShort103 - 1;
					local162 = this.aShort105 + 1;
					local165 = this.aShort105;
					local168 = this.aShort103;
				} else {
					local168 = this.aShort103;
					local173 = this.aShort103 + 1;
					local165 = this.aShort105;
					local162 = this.aShort105 - 1;
				}
			} else if (local143 <= -local38) {
				local162 = this.aShort105 + 1;
				local165 = this.aShort105;
				local168 = this.aShort103;
				local173 = this.aShort103 + 1;
			} else {
				local173 = this.aShort103 - 1;
				local162 = this.aShort105 - 1;
				local165 = this.aShort105;
				local168 = this.aShort103;
			}
			label77: for (local50 = 0; local50 < local7; local50++) {
				@Pc(243) long local243 = Static528.aLongArrayArrayArray1[super.aByte124][local165][local173];
				@Pc(254) Class204 local254;
				while (local243 != 0L) {
					local254 = Static626.aClass204Array1[(int) ((local243 & 0xFFFFL) - 1L)];
					local243 >>>= 0x10;
					if (arg0[local50] == local254.aClass8_Sub1_3) {
						continue label77;
					}
				}
				local243 = Static528.aLongArrayArrayArray1[super.aByte124][local162][local168];
				while (local243 != 0L) {
					local254 = Static626.aClass204Array1[(int) ((local243 & 0xFFFFL) - 1L)];
					local243 >>>= 0x10;
					if (arg0[local50] == local254.aClass8_Sub1_3) {
						continue label77;
					}
				}
				for (@Pc(308) int local308 = local50; local308 < local7 - 1; local308++) {
					arg0[local308] = arg0[local308 + 1];
				}
				local7--;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!cs", name = "e", descriptor = "(I)Z")
	@Override
	public final boolean method8325() {
		for (@Pc(8) int local8 = this.aShort105; local8 <= this.aShort104; local8++) {
			for (@Pc(13) int local13 = this.aShort103; local13 <= this.aShort106; local13++) {
				@Pc(21) int local21 = Static183.anInt4307 + local8 - Static603.anInt10257;
				if (local21 >= 0 && Static100.aBooleanArrayArray3.length > local21) {
					@Pc(40) int local40 = local13 + Static183.anInt4307 - Static470.anInt8495;
					if (local40 >= 0 && local40 < Static100.aBooleanArrayArray3.length && Static100.aBooleanArrayArray3[local21][local40]) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!cs", name = "i", descriptor = "(I)V")
	public void method7558() {
	}

	@OriginalMember(owner = "client!cs", name = "d", descriptor = "(I)Z")
	@Override
	public final boolean method8324() {
		return Static453.method6873(this.aShort105, super.aByte125, this.aShort106, this.aShort103, this.method8326(), this.aShort104);
	}
}

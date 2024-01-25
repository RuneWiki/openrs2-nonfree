import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tg")
public abstract class Class11_Sub1_Sub1 extends Class11_Sub1 {

	@OriginalMember(owner = "client!tg", name = "P", descriptor = "S")
	public short aShort91;

	@OriginalMember(owner = "client!tg", name = "F", descriptor = "S")
	public short aShort88;

	@OriginalMember(owner = "client!tg", name = "O", descriptor = "S")
	public short aShort90;

	@OriginalMember(owner = "client!tg", name = "K", descriptor = "B")
	public final byte aByte102;

	@OriginalMember(owner = "client!tg", name = "I", descriptor = "Z")
	public final boolean aBoolean574;

	@OriginalMember(owner = "client!tg", name = "L", descriptor = "S")
	public short aShort89;

	@OriginalMember(owner = "client!tg", name = "<init>", descriptor = "(IIIIIIIIIZB)V")
	protected Class11_Sub1_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) byte arg10) {
		this.aShort91 = (short) arg6;
		this.aShort88 = (short) arg7;
		super.aByte113 = (byte) arg0;
		this.aShort90 = (short) arg5;
		super.anInt8908 = arg3;
		super.anInt8902 = arg2;
		super.aByte112 = (byte) arg1;
		this.aByte102 = arg10;
		super.anInt8906 = arg4;
		this.aBoolean574 = arg9;
		this.aShort89 = (short) arg8;
	}

	@OriginalMember(owner = "client!tg", name = "f", descriptor = "(B)Z")
	@Override
	public final boolean method7221() {
		return Static4.method7627(this.method7212(), super.aByte112, this.aShort90, this.aShort88, this.aShort89, this.aShort91);
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "([Lclient!tw;I)I")
	@Override
	public final int method7204(@OriginalArg(0) Class1_Sub24[] arg0) {
		@Pc(7) int local7 = 0;
		@Pc(15) int local15;
		@Pc(38) int local38;
		@Pc(53) int local53;
		label113: for (@Pc(10) int local10 = this.aShort90; local10 <= this.aShort91; local10++) {
			label111: for (local15 = this.aShort88; local15 <= this.aShort89; local15++) {
				@Pc(26) long local26 = Static121.aLongArrayArrayArray1[super.aByte113][local10][local15];
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
						@Pc(51) Class49 local51 = Static31.aClass49Array1[local38 - 1];
						for (local53 = 0; local53 < local7; local53++) {
							if (local51.aClass1_Sub24_1 == arg0[local53]) {
								local28 += 16L;
								continue label106;
							}
						}
						arg0[local7++] = local51.aClass1_Sub24_1;
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
		if (this.aByte102 != 0) {
			local38 = this.aShort90 - Static115.anInt1985;
			@Pc(136) int local136 = this.aShort88 - Static326.anInt4975;
			@Pc(159) int local159;
			@Pc(149) short local149;
			@Pc(162) short local162;
			@Pc(154) int local154;
			if (this.aByte102 == 1) {
				if (local136 > local38) {
					local162 = this.aShort90;
					local154 = this.aShort90 + 1;
					local149 = this.aShort88;
					local159 = this.aShort88 - 1;
				} else {
					local162 = this.aShort90;
					local159 = this.aShort88 + 1;
					local154 = this.aShort90 - 1;
					local149 = this.aShort88;
				}
			} else if (-local38 >= local136) {
				local149 = this.aShort88;
				local154 = this.aShort90 + 1;
				local159 = this.aShort88 + 1;
				local162 = this.aShort90;
			} else {
				local149 = this.aShort88;
				local154 = this.aShort90 - 1;
				local162 = this.aShort90;
				local159 = this.aShort88 - 1;
			}
			label77: for (local53 = 0; local53 < local7; local53++) {
				@Pc(236) long local236 = Static121.aLongArrayArrayArray1[super.aByte113][local162][local159];
				@Pc(247) Class49 local247;
				while (local236 != 0L) {
					local247 = Static31.aClass49Array1[(int) ((local236 & 0xFFFFL) - 1L)];
					local236 >>>= 0x10;
					if (local247.aClass1_Sub24_1 == arg0[local53]) {
						continue label77;
					}
				}
				local236 = Static121.aLongArrayArrayArray1[super.aByte113][local154][local149];
				while (local236 != 0L) {
					local247 = Static31.aClass49Array1[(int) ((local236 & 0xFFFFL) - 1L)];
					local236 >>>= 0x10;
					if (arg0[local53] == local247.aClass1_Sub24_1) {
						continue label77;
					}
				}
				for (@Pc(303) int local303 = local53; local303 < local7 - 1; local303++) {
					arg0[local303] = arg0[local303 + 1];
				}
				local7--;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!tg", name = "g", descriptor = "(B)V")
	public void method6054() {
	}

	@OriginalMember(owner = "client!tg", name = "h", descriptor = "(I)Z")
	@Override
	public final boolean method7216() {
		for (@Pc(8) int local8 = this.aShort90; local8 <= this.aShort91; local8++) {
			for (@Pc(18) int local18 = this.aShort88; local18 <= this.aShort89; local18++) {
				@Pc(27) int local27 = Static548.anInt9156 + local8 - Static115.anInt1985;
				if (local27 >= 0 && local27 < Static496.aBooleanArrayArray7.length) {
					@Pc(49) int local49 = Static548.anInt9156 + local18 - Static326.anInt4975;
					if (local49 >= 0 && Static496.aBooleanArrayArray7.length > local49 && Static496.aBooleanArrayArray7[local27][local49]) {
						return true;
					}
				}
			}
		}
		return false;
	}
}

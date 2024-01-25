import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jf")
public abstract class Class4_Sub1_Sub2 extends Class4_Sub1 {

	@OriginalMember(owner = "client!jf", name = "C", descriptor = "Z")
	public final boolean aBoolean639;

	@OriginalMember(owner = "client!jf", name = "A", descriptor = "S")
	public short aShort118;

	@OriginalMember(owner = "client!jf", name = "y", descriptor = "S")
	public short aShort117;

	@OriginalMember(owner = "client!jf", name = "E", descriptor = "S")
	public short aShort119;

	@OriginalMember(owner = "client!jf", name = "u", descriptor = "B")
	public final byte aByte125;

	@OriginalMember(owner = "client!jf", name = "x", descriptor = "S")
	public short aShort116;

	@OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(IIIIIIIIIZB)V")
	protected Class4_Sub1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) byte arg10) {
		this.aBoolean639 = arg9;
		super.aByte123 = (byte) arg0;
		super.anInt8916 = arg2;
		super.anInt8911 = arg4;
		this.aShort118 = (short) arg5;
		super.aByte124 = (byte) arg1;
		super.anInt8915 = arg3;
		this.aShort117 = (short) arg6;
		this.aShort119 = (short) arg8;
		this.aByte125 = arg10;
		this.aShort116 = (short) arg7;
	}

	@OriginalMember(owner = "client!jf", name = "f", descriptor = "(B)Z")
	@Override
	public final boolean method7694() {
		for (@Pc(8) int local8 = this.aShort118; local8 <= this.aShort117; local8++) {
			for (@Pc(13) int local13 = this.aShort116; local13 <= this.aShort119; local13++) {
				@Pc(22) int local22 = Static468.anInt10228 + local8 - Static626.anInt10075;
				if (local22 >= 0 && Static579.aBooleanArrayArray7.length > local22) {
					@Pc(41) int local41 = Static468.anInt10228 + local13 - Static386.anInt7210;
					if (local41 >= 0 && local41 < Static579.aBooleanArrayArray7.length && Static579.aBooleanArrayArray7[local22][local41]) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!jf", name = "f", descriptor = "(I)Z")
	@Override
	public final boolean method7701() {
		return Static564.method8104(this.method7703(), super.aByte124, this.aShort118, this.aShort116, this.aShort119, this.aShort117);
	}

	@OriginalMember(owner = "client!jf", name = "i", descriptor = "(I)V")
	public void method7707() {
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(I[Lclient!wh;)I")
	@Override
	public final int method7698(@OriginalArg(1) Class3_Sub16[] arg0) {
		@Pc(7) int local7 = 0;
		@Pc(15) int local15;
		@Pc(38) int local38;
		@Pc(51) int local51;
		label112: for (@Pc(10) int local10 = this.aShort118; local10 <= this.aShort117; local10++) {
			label110: for (local15 = this.aShort116; local15 <= this.aShort119; local15++) {
				@Pc(26) long local26 = Static207.aLongArrayArrayArray1[super.aByte123][local10][local15];
				@Pc(28) long local28 = 0L;
				while (true) {
					label105: while (true) {
						if (local28 > 48L) {
							continue label110;
						}
						local38 = (int) (local26 >>> (int) local28 & 0xFFFFL);
						if (local38 <= 0) {
							continue label110;
						}
						@Pc(49) Class206 local49 = Static89.aClass206Array1[local38 - 1];
						for (local51 = 0; local51 < local7; local51++) {
							if (arg0[local51] == local49.aClass3_Sub16_3) {
								local28 += 16L;
								continue label105;
							}
						}
						arg0[local7++] = local49.aClass3_Sub16_3;
						if (local7 == 4) {
							break label112;
						}
						local28 += 16L;
					}
				}
			}
		}
		for (local15 = local7; local15 < 4; local15++) {
			arg0[local15] = null;
		}
		if (this.aByte125 != 0) {
			local38 = this.aShort118 - Static626.anInt10075;
			@Pc(134) int local134 = this.aShort116 - Static386.anInt7210;
			@Pc(149) int local149;
			@Pc(144) short local144;
			@Pc(157) short local157;
			@Pc(154) int local154;
			if (this.aByte125 == 1) {
				if (local134 > local38) {
					local144 = this.aShort116;
					local149 = this.aShort116 - 1;
					local154 = this.aShort118 + 1;
					local157 = this.aShort118;
				} else {
					local149 = this.aShort116 + 1;
					local154 = this.aShort118 - 1;
					local157 = this.aShort118;
					local144 = this.aShort116;
				}
			} else if (-local38 >= local134) {
				local149 = this.aShort116 + 1;
				local157 = this.aShort118;
				local144 = this.aShort116;
				local154 = this.aShort118 + 1;
			} else {
				local149 = this.aShort116 - 1;
				local154 = this.aShort118 - 1;
				local144 = this.aShort116;
				local157 = this.aShort118;
			}
			label76: for (local51 = 0; local51 < local7; local51++) {
				@Pc(232) long local232 = Static207.aLongArrayArrayArray1[super.aByte123][local157][local149];
				@Pc(243) Class206 local243;
				while (local232 != 0L) {
					local243 = Static89.aClass206Array1[(int) ((local232 & 0xFFFFL) - 1L)];
					local232 >>>= 0x10;
					if (arg0[local51] == local243.aClass3_Sub16_3) {
						continue label76;
					}
				}
				local232 = Static207.aLongArrayArrayArray1[super.aByte123][local154][local144];
				while (local232 != 0L) {
					local243 = Static89.aClass206Array1[(int) ((local232 & 0xFFFFL) - 1L)];
					local232 >>>= 0x10;
					if (arg0[local51] == local243.aClass3_Sub16_3) {
						continue label76;
					}
				}
				for (@Pc(299) int local299 = local51; local299 < local7 - 1; local299++) {
					arg0[local299] = arg0[local299 + 1];
				}
				local7--;
			}
		}
		return local7;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!at")
public abstract class Class21_Sub1_Sub1 extends Class21_Sub1 {

	@OriginalMember(owner = "client!at", name = "y", descriptor = "S")
	public short aShort119;

	@OriginalMember(owner = "client!at", name = "B", descriptor = "S")
	public short aShort121;

	@OriginalMember(owner = "client!at", name = "D", descriptor = "S")
	public short aShort122;

	@OriginalMember(owner = "client!at", name = "z", descriptor = "Z")
	public final boolean aBoolean662;

	@OriginalMember(owner = "client!at", name = "w", descriptor = "B")
	public final byte aByte126;

	@OriginalMember(owner = "client!at", name = "A", descriptor = "S")
	public short aShort120;

	@OriginalMember(owner = "client!at", name = "<init>", descriptor = "(IIIIIIIIIZB)V")
	protected Class21_Sub1_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) byte arg10) {
		this.aShort119 = (short) arg5;
		super.aByte128 = (byte) arg1;
		this.aShort121 = (short) arg7;
		this.aShort122 = (short) arg8;
		super.anInt10550 = arg4;
		this.aBoolean662 = arg9;
		super.anInt10551 = arg2;
		this.aByte126 = arg10;
		super.aByte127 = (byte) arg0;
		super.anInt10554 = arg3;
		this.aShort120 = (short) arg6;
	}

	@OriginalMember(owner = "client!at", name = "k", descriptor = "(I)V")
	public void method7567() {
	}

	@OriginalMember(owner = "client!at", name = "f", descriptor = "(I)Z")
	@Override
	public final boolean method8221() {
		return Static406.method6142(this.aShort120, super.aByte128, this.method8231(), this.aShort121, this.aShort122, this.aShort119);
	}

	@OriginalMember(owner = "client!at", name = "b", descriptor = "(B)Z")
	@Override
	public final boolean method8226() {
		for (@Pc(13) int local13 = this.aShort119; local13 <= this.aShort120; local13++) {
			for (@Pc(18) int local18 = this.aShort121; local18 <= this.aShort122; local18++) {
				@Pc(26) int local26 = Static30.anInt1124 + local13 - Static465.anInt8858;
				if (local26 >= 0 && Static339.aBooleanArrayArray8.length > local26) {
					@Pc(41) int local41 = local18 + Static30.anInt1124 - Static78.anInt1933;
					if (local41 >= 0 && local41 < Static339.aBooleanArrayArray8.length && Static339.aBooleanArrayArray8[local26][local41]) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(I[Lclient!am;)I")
	@Override
	public final int method8234(@OriginalArg(1) Class4_Sub3[] arg0) {
		@Pc(7) int local7 = 0;
		@Pc(15) int local15;
		@Pc(38) int local38;
		@Pc(48) int local48;
		label112: for (@Pc(10) int local10 = this.aShort119; local10 <= this.aShort120; local10++) {
			label110: for (local15 = this.aShort121; local15 <= this.aShort122; local15++) {
				@Pc(26) long local26 = Static358.aLongArrayArrayArray1[super.aByte127][local10][local15];
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
						@Pc(46) Class85 local46 = Static201.aClass85Array1[local38 - 1];
						for (local48 = 0; local48 < local7; local48++) {
							if (local46.aClass4_Sub3_1 == arg0[local48]) {
								local28 += 16L;
								continue label105;
							}
						}
						arg0[local7++] = local46.aClass4_Sub3_1;
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
		if (this.aByte126 != 0) {
			local38 = this.aShort119 - Static465.anInt8858;
			@Pc(133) int local133 = this.aShort121 - Static78.anInt1933;
			@Pc(162) int local162;
			@Pc(157) short local157;
			@Pc(154) short local154;
			@Pc(151) int local151;
			if (this.aByte126 == 1) {
				if (local133 <= local38) {
					local151 = this.aShort119 - 1;
					local154 = this.aShort119;
					local157 = this.aShort121;
					local162 = this.aShort121 + 1;
				} else {
					local162 = this.aShort121 - 1;
					local154 = this.aShort119;
					local157 = this.aShort121;
					local151 = this.aShort119 + 1;
				}
			} else if (-local38 < local133) {
				local151 = this.aShort119 - 1;
				local157 = this.aShort121;
				local154 = this.aShort119;
				local162 = this.aShort121 - 1;
			} else {
				local162 = this.aShort121 + 1;
				local157 = this.aShort121;
				local151 = this.aShort119 + 1;
				local154 = this.aShort119;
			}
			label76: for (local48 = 0; local48 < local7; local48++) {
				@Pc(233) long local233 = Static358.aLongArrayArrayArray1[super.aByte127][local154][local162];
				@Pc(244) Class85 local244;
				while (local233 != 0L) {
					local244 = Static201.aClass85Array1[(int) ((local233 & 0xFFFFL) - 1L)];
					local233 >>>= 0x10;
					if (local244.aClass4_Sub3_1 == arg0[local48]) {
						continue label76;
					}
				}
				local233 = Static358.aLongArrayArrayArray1[super.aByte127][local151][local157];
				while (local233 != 0L) {
					local244 = Static201.aClass85Array1[(int) ((local233 & 0xFFFFL) - 1L)];
					local233 >>>= 0x10;
					if (arg0[local48] == local244.aClass4_Sub3_1) {
						continue label76;
					}
				}
				for (@Pc(300) int local300 = local48; local300 < local7 - 1; local300++) {
					arg0[local300] = arg0[local300 + 1];
				}
				local7--;
			}
		}
		return local7;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!na")
public abstract class Class1_Sub4_Sub2 extends Class1_Sub4 {

	@OriginalMember(owner = "client!na", name = "B", descriptor = "Z")
	public final boolean aBoolean698;

	@OriginalMember(owner = "client!na", name = "H", descriptor = "S")
	public short aShort121;

	@OriginalMember(owner = "client!na", name = "I", descriptor = "S")
	public short aShort122;

	@OriginalMember(owner = "client!na", name = "C", descriptor = "B")
	public final byte aByte128;

	@OriginalMember(owner = "client!na", name = "G", descriptor = "S")
	public short aShort120;

	@OriginalMember(owner = "client!na", name = "D", descriptor = "S")
	public short aShort119;

	@OriginalMember(owner = "client!na", name = "<init>", descriptor = "(IIIIIIIIIZB)V")
	protected Class1_Sub4_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) byte arg10) {
		this.aBoolean698 = arg9;
		this.aShort121 = (short) arg5;
		this.aShort122 = (short) arg6;
		this.aByte128 = arg10;
		super.aByte127 = (byte) arg1;
		super.anInt9934 = arg2;
		super.anInt9932 = arg3;
		this.aShort120 = (short) arg7;
		super.aByte126 = (byte) arg0;
		super.anInt9935 = arg4;
		this.aShort119 = (short) arg8;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "([Lclient!ul;I)I")
	@Override
	public final int method8129(@OriginalArg(0) Class4_Sub24[] arg0) {
		@Pc(7) int local7 = 0;
		@Pc(15) int local15;
		@Pc(38) int local38;
		@Pc(51) int local51;
		label112: for (@Pc(10) int local10 = this.aShort121; local10 <= this.aShort122; local10++) {
			label110: for (local15 = this.aShort120; local15 <= this.aShort119; local15++) {
				@Pc(26) long local26 = Static461.aLongArrayArrayArray1[super.aByte126][local10][local15];
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
						@Pc(49) Class177 local49 = Static485.aClass177Array1[local38 - 1];
						for (local51 = 0; local51 < local7; local51++) {
							if (arg0[local51] == local49.aClass4_Sub24_1) {
								local28 += 16L;
								continue label105;
							}
						}
						arg0[local7++] = local49.aClass4_Sub24_1;
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
		if (this.aByte128 != 0) {
			local38 = this.aShort121 - Static26.anInt403;
			@Pc(136) int local136 = this.aShort120 - Static528.anInt9392;
			@Pc(162) int local162;
			@Pc(157) short local157;
			@Pc(154) short local154;
			@Pc(151) int local151;
			if (this.aByte128 == 1) {
				if (local38 >= local136) {
					local151 = this.aShort121 - 1;
					local154 = this.aShort121;
					local162 = this.aShort120 + 1;
					local157 = this.aShort120;
				} else {
					local151 = this.aShort121 + 1;
					local162 = this.aShort120 - 1;
					local154 = this.aShort121;
					local157 = this.aShort120;
				}
			} else if (-local38 >= local136) {
				local151 = this.aShort121 + 1;
				local154 = this.aShort121;
				local157 = this.aShort120;
				local162 = this.aShort120 + 1;
			} else {
				local151 = this.aShort121 - 1;
				local162 = this.aShort120 - 1;
				local154 = this.aShort121;
				local157 = this.aShort120;
			}
			label76: for (local51 = 0; local51 < local7; local51++) {
				@Pc(232) long local232 = Static461.aLongArrayArrayArray1[super.aByte126][local154][local162];
				@Pc(243) Class177 local243;
				while (local232 != 0L) {
					local243 = Static485.aClass177Array1[(int) ((local232 & 0xFFFFL) - 1L)];
					local232 >>>= 0x10;
					if (local243.aClass4_Sub24_1 == arg0[local51]) {
						continue label76;
					}
				}
				local232 = Static461.aLongArrayArrayArray1[super.aByte126][local151][local157];
				while (local232 != 0L) {
					local243 = Static485.aClass177Array1[(int) ((local232 & 0xFFFFL) - 1L)];
					local232 >>>= 0x10;
					if (arg0[local51] == local243.aClass4_Sub24_1) {
						continue label76;
					}
				}
				for (@Pc(297) int local297 = local51; local297 < local7 - 1; local297++) {
					arg0[local297] = arg0[local297 + 1];
				}
				local7--;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!na", name = "j", descriptor = "(I)Z")
	@Override
	public final boolean method8126() {
		for (@Pc(16) int local16 = this.aShort121; local16 <= this.aShort122; local16++) {
			for (@Pc(21) int local21 = this.aShort120; local21 <= this.aShort119; local21++) {
				@Pc(30) int local30 = Static579.anInt10075 + local16 - Static26.anInt403;
				if (local30 >= 0 && Static522.aBooleanArrayArray18.length > local30) {
					@Pc(49) int local49 = local21 + Static579.anInt10075 - Static528.anInt9392;
					if (local49 >= 0 && local49 < Static522.aBooleanArrayArray18.length && Static522.aBooleanArrayArray18[local30][local49]) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!na", name = "d", descriptor = "(B)Z")
	@Override
	public final boolean method8115() {
		return Static381.method6454(super.aByte127, this.method8117(), this.aShort119, this.aShort122, this.aShort120, this.aShort121);
	}

	@OriginalMember(owner = "client!na", name = "k", descriptor = "(I)V")
	public void method8132() {
	}
}

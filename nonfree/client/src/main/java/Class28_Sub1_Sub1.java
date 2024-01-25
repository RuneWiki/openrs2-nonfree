import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nb")
public abstract class Class28_Sub1_Sub1 extends Class28_Sub1 {

	@OriginalMember(owner = "client!nb", name = "G", descriptor = "B")
	public final byte aByte175;

	@OriginalMember(owner = "client!nb", name = "L", descriptor = "Z")
	public final boolean aBoolean818;

	@OriginalMember(owner = "client!nb", name = "K", descriptor = "S")
	public short aShort123;

	@OriginalMember(owner = "client!nb", name = "U", descriptor = "S")
	public short aShort125;

	@OriginalMember(owner = "client!nb", name = "F", descriptor = "S")
	public short aShort122;

	@OriginalMember(owner = "client!nb", name = "P", descriptor = "S")
	public short aShort124;

	@OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(IIIIIIIIIZB)V")
	protected Class28_Sub1_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) byte arg10) {
		super.aByte173 = (byte) arg1;
		super.anInt10729 = arg2;
		super.aByte174 = (byte) arg0;
		this.aByte175 = arg10;
		this.aBoolean818 = arg9;
		this.aShort123 = (short) arg7;
		super.anInt10722 = arg3;
		this.aShort125 = (short) arg5;
		super.anInt10731 = arg4;
		this.aShort122 = (short) arg8;
		this.aShort124 = (short) arg6;
	}

	@OriginalMember(owner = "client!nb", name = "o", descriptor = "(I)V")
	public void method9299() {
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(B[Lclient!uca;)I")
	@Override
	public final int method9298(@OriginalArg(1) Class3_Sub15[] arg0) {
		@Pc(7) int local7 = 0;
		@Pc(15) int local15;
		@Pc(38) int local38;
		@Pc(51) int local51;
		label112: for (@Pc(10) int local10 = this.aShort125; local10 <= this.aShort124; local10++) {
			label110: for (local15 = this.aShort123; local15 <= this.aShort122; local15++) {
				@Pc(26) long local26 = Static234.aLongArrayArrayArray1[super.aByte174][local10][local15];
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
						@Pc(49) Class265 local49 = Static541.aClass265Array1[local38 - 1];
						for (local51 = 0; local51 < local7; local51++) {
							if (arg0[local51] == local49.aClass3_Sub15_2) {
								local28 += 16L;
								continue label105;
							}
						}
						arg0[local7++] = local49.aClass3_Sub15_2;
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
		if (this.aByte175 != 0) {
			local38 = this.aShort125 - Static220.anInt4183;
			@Pc(137) int local137 = this.aShort123 - Static547.anInt8968;
			@Pc(153) int local153;
			@Pc(164) short local164;
			@Pc(161) short local161;
			@Pc(158) int local158;
			if (this.aByte175 == 1) {
				if (local38 < local137) {
					local153 = this.aShort123 - 1;
					local158 = this.aShort125 + 1;
					local161 = this.aShort125;
					local164 = this.aShort123;
				} else {
					local153 = this.aShort123 + 1;
					local161 = this.aShort125;
					local158 = this.aShort125 - 1;
					local164 = this.aShort123;
				}
			} else if (-local38 < local137) {
				local164 = this.aShort123;
				local153 = this.aShort123 - 1;
				local158 = this.aShort125 - 1;
				local161 = this.aShort125;
			} else {
				local158 = this.aShort125 + 1;
				local161 = this.aShort125;
				local153 = this.aShort123 + 1;
				local164 = this.aShort123;
			}
			label76: for (local51 = 0; local51 < local7; local51++) {
				@Pc(235) long local235 = Static234.aLongArrayArrayArray1[super.aByte174][local161][local153];
				@Pc(246) Class265 local246;
				while (local235 != 0L) {
					local246 = Static541.aClass265Array1[(int) ((local235 & 0xFFFFL) - 1L)];
					local235 >>>= 0x10;
					if (local246.aClass3_Sub15_2 == arg0[local51]) {
						continue label76;
					}
				}
				local235 = Static234.aLongArrayArrayArray1[super.aByte174][local158][local164];
				while (local235 != 0L) {
					local246 = Static541.aClass265Array1[(int) ((local235 & 0xFFFFL) - 1L)];
					local235 >>>= 0x10;
					if (local246.aClass3_Sub15_2 == arg0[local51]) {
						continue label76;
					}
				}
				for (@Pc(302) int local302 = local51; local302 < local7 - 1; local302++) {
					arg0[local302] = arg0[local302 + 1];
				}
				local7--;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!nb", name = "g", descriptor = "(I)Z")
	@Override
	public final boolean method9280() {
		for (@Pc(13) int local13 = this.aShort125; local13 <= this.aShort124; local13++) {
			for (@Pc(18) int local18 = this.aShort123; local18 <= this.aShort122; local18++) {
				@Pc(26) int local26 = Static7.anInt94 + local13 - Static220.anInt4183;
				if (local26 >= 0 && local26 < Static430.aBooleanArrayArray7.length) {
					@Pc(41) int local41 = local18 + Static7.anInt94 - Static547.anInt8968;
					if (local41 >= 0 && Static430.aBooleanArrayArray7.length > local41 && Static430.aBooleanArrayArray7[local26][local41]) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(ILclient!ha;)Z")
	@Override
	public final boolean method9295(@OriginalArg(1) Class13 arg0) {
		return Static230.method3906(this.aShort124, this.method9284(arg0), this.aShort123, this.aShort122, super.aByte173, this.aShort125);
	}
}

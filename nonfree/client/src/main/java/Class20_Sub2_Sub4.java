import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rc")
public abstract class Class20_Sub2_Sub4 extends Class20_Sub2 {

	@OriginalMember(owner = "client!rc", name = "M", descriptor = "S")
	public short aShort100;

	@OriginalMember(owner = "client!rc", name = "K", descriptor = "S")
	public short aShort99;

	@OriginalMember(owner = "client!rc", name = "E", descriptor = "Z")
	public final boolean aBoolean638;

	@OriginalMember(owner = "client!rc", name = "F", descriptor = "B")
	public final byte aByte113;

	@OriginalMember(owner = "client!rc", name = "J", descriptor = "S")
	public short aShort98;

	@OriginalMember(owner = "client!rc", name = "I", descriptor = "S")
	public short aShort97;

	@OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(IIIIIIIIIZB)V")
	protected Class20_Sub2_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) byte arg10) {
		this.aShort100 = (short) arg5;
		this.aShort99 = (short) arg8;
		super.anInt8796 = arg2;
		super.aByte116 = (byte) arg0;
		this.aBoolean638 = arg9;
		super.anInt8790 = arg3;
		this.aByte113 = arg10;
		super.aByte117 = (byte) arg1;
		this.aShort98 = (short) arg6;
		super.anInt8795 = arg4;
		this.aShort97 = (short) arg7;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "([Lclient!qea;B)I")
	@Override
	public final int method7258(@OriginalArg(0) Class1_Sub5[] arg0) {
		@Pc(7) int local7 = 0;
		@Pc(15) int local15;
		@Pc(38) int local38;
		@Pc(50) int local50;
		label113: for (@Pc(10) int local10 = this.aShort100; local10 <= this.aShort98; local10++) {
			label111: for (local15 = this.aShort97; local15 <= this.aShort99; local15++) {
				@Pc(26) long local26 = Static579.aLongArrayArrayArray1[super.aByte116][local10][local15];
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
						@Pc(48) Class237 local48 = Static502.aClass237Array1[local38 - 1];
						for (local50 = 0; local50 < local7; local50++) {
							if (local48.aClass1_Sub5_1 == arg0[local50]) {
								local28 += 16L;
								continue label106;
							}
						}
						arg0[local7++] = local48.aClass1_Sub5_1;
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
		if (this.aByte113 != 0) {
			local38 = this.aShort100 - Static251.anInt4676;
			@Pc(137) int local137 = this.aShort97 - Static63.anInt1544;
			@Pc(157) int local157;
			@Pc(152) short local152;
			@Pc(149) short local149;
			@Pc(162) int local162;
			if (this.aByte113 == 1) {
				if (local137 <= local38) {
					local149 = this.aShort100;
					local152 = this.aShort97;
					local157 = this.aShort97 + 1;
					local162 = this.aShort100 - 1;
				} else {
					local152 = this.aShort97;
					local162 = this.aShort100 + 1;
					local149 = this.aShort100;
					local157 = this.aShort97 - 1;
				}
			} else if (local137 <= -local38) {
				local157 = this.aShort97 + 1;
				local152 = this.aShort97;
				local149 = this.aShort100;
				local162 = this.aShort100 + 1;
			} else {
				local162 = this.aShort100 - 1;
				local152 = this.aShort97;
				local157 = this.aShort97 - 1;
				local149 = this.aShort100;
			}
			label77: for (local50 = 0; local50 < local7; local50++) {
				@Pc(237) long local237 = Static579.aLongArrayArrayArray1[super.aByte116][local149][local157];
				@Pc(248) Class237 local248;
				while (local237 != 0L) {
					local248 = Static502.aClass237Array1[(int) ((local237 & 0xFFFFL) - 1L)];
					local237 >>>= 0x10;
					if (arg0[local50] == local248.aClass1_Sub5_1) {
						continue label77;
					}
				}
				local237 = Static579.aLongArrayArrayArray1[super.aByte116][local162][local152];
				while (local237 != 0L) {
					local248 = Static502.aClass237Array1[(int) ((local237 & 0xFFFFL) - 1L)];
					local237 >>>= 0x10;
					if (local248.aClass1_Sub5_1 == arg0[local50]) {
						continue label77;
					}
				}
				for (@Pc(306) int local306 = local50; local306 < local7 - 1; local306++) {
					arg0[local306] = arg0[local306 + 1];
				}
				local7--;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Z)Z")
	@Override
	public final boolean method7259() {
		for (@Pc(15) int local15 = this.aShort100; local15 <= this.aShort98; local15++) {
			for (@Pc(20) int local20 = this.aShort97; local20 <= this.aShort99; local20++) {
				@Pc(29) int local29 = local15 + Static246.anInt8757 - Static251.anInt4676;
				if (local29 >= 0 && local29 < Static116.aBooleanArrayArray4.length) {
					@Pc(44) int local44 = Static246.anInt8757 + local20 - Static63.anInt1544;
					if (local44 >= 0 && Static116.aBooleanArrayArray4.length > local44 && Static116.aBooleanArrayArray4[local29][local44]) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!rc", name = "m", descriptor = "(I)V")
	public void method7202() {
	}

	@OriginalMember(owner = "client!rc", name = "h", descriptor = "(I)Z")
	@Override
	public final boolean method7252() {
		return Static481.method6761(super.aByte117, this.aShort99, this.method7264(), this.aShort97, this.aShort98, this.aShort100);
	}
}

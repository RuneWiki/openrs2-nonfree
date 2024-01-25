import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nga")
public abstract class Class34_Sub1_Sub1 extends Class34_Sub1 {

	@OriginalMember(owner = "client!nga", name = "B", descriptor = "Z")
	public final boolean aBoolean672;

	@OriginalMember(owner = "client!nga", name = "M", descriptor = "S")
	public short aShort99;

	@OriginalMember(owner = "client!nga", name = "G", descriptor = "B")
	public final byte aByte133;

	@OriginalMember(owner = "client!nga", name = "L", descriptor = "S")
	public short aShort98;

	@OriginalMember(owner = "client!nga", name = "y", descriptor = "S")
	public short aShort96;

	@OriginalMember(owner = "client!nga", name = "A", descriptor = "S")
	public short aShort97;

	@OriginalMember(owner = "client!nga", name = "<init>", descriptor = "(IIIIIIIIIZB)V")
	protected Class34_Sub1_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) byte arg10) {
		this.aBoolean672 = arg9;
		this.aShort99 = (short) arg7;
		super.anInt9614 = arg2;
		this.aByte133 = arg10;
		super.anInt9619 = arg4;
		super.anInt9622 = arg3;
		super.aByte132 = (byte) arg0;
		this.aShort98 = (short) arg5;
		super.aByte131 = (byte) arg1;
		this.aShort96 = (short) arg8;
		this.aShort97 = (short) arg6;
	}

	@OriginalMember(owner = "client!nga", name = "f", descriptor = "(I)Z")
	@Override
	public final boolean method7836() {
		for (@Pc(16) int local16 = this.aShort98; local16 <= this.aShort97; local16++) {
			for (@Pc(21) int local21 = this.aShort99; local21 <= this.aShort96; local21++) {
				@Pc(30) int local30 = local16 + Static362.anInt6205 - Static88.anInt1826;
				if (local30 >= 0 && Static375.aBooleanArrayArray6.length > local30) {
					@Pc(51) int local51 = Static362.anInt6205 + local21 - Static353.anInt6041;
					if (local51 >= 0 && local51 < Static375.aBooleanArrayArray6.length && Static375.aBooleanArrayArray6[local30][local51]) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!nga", name = "k", descriptor = "(I)V")
	public void method7856() {
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(B[Lclient!uaa;)I")
	@Override
	public final int method7851(@OriginalArg(1) Class3_Sub13[] arg0) {
		@Pc(7) int local7 = 0;
		@Pc(15) int local15;
		@Pc(38) int local38;
		@Pc(50) int local50;
		label113: for (@Pc(10) int local10 = this.aShort98; local10 <= this.aShort97; local10++) {
			label111: for (local15 = this.aShort99; local15 <= this.aShort96; local15++) {
				@Pc(26) long local26 = Static231.aLongArrayArrayArray3[super.aByte132][local10][local15];
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
						@Pc(48) Class165 local48 = Static192.aClass165Array1[local38 - 1];
						for (local50 = 0; local50 < local7; local50++) {
							if (arg0[local50] == local48.aClass3_Sub13_1) {
								local28 += 16L;
								continue label106;
							}
						}
						arg0[local7++] = local48.aClass3_Sub13_1;
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
		if (this.aByte133 != 0) {
			local38 = this.aShort98 - Static88.anInt1826;
			@Pc(138) int local138 = this.aShort99 - Static353.anInt6041;
			@Pc(164) int local164;
			@Pc(151) short local151;
			@Pc(154) short local154;
			@Pc(159) int local159;
			if (this.aByte133 == 1) {
				if (local138 <= local38) {
					local151 = this.aShort99;
					local164 = this.aShort99 + 1;
					local154 = this.aShort98;
					local159 = this.aShort98 - 1;
				} else {
					local151 = this.aShort99;
					local164 = this.aShort99 - 1;
					local154 = this.aShort98;
					local159 = this.aShort98 + 1;
				}
			} else if (local138 > -local38) {
				local151 = this.aShort99;
				local154 = this.aShort98;
				local159 = this.aShort98 - 1;
				local164 = this.aShort99 - 1;
			} else {
				local154 = this.aShort98;
				local151 = this.aShort99;
				local159 = this.aShort98 + 1;
				local164 = this.aShort99 + 1;
			}
			label77: for (local50 = 0; local50 < local7; local50++) {
				@Pc(238) long local238 = Static231.aLongArrayArrayArray3[super.aByte132][local154][local164];
				@Pc(249) Class165 local249;
				while (local238 != 0L) {
					local249 = Static192.aClass165Array1[(int) ((local238 & 0xFFFFL) - 1L)];
					local238 >>>= 0x10;
					if (local249.aClass3_Sub13_1 == arg0[local50]) {
						continue label77;
					}
				}
				local238 = Static231.aLongArrayArrayArray3[super.aByte132][local159][local151];
				while (local238 != 0L) {
					local249 = Static192.aClass165Array1[(int) ((local238 & 0xFFFFL) - 1L)];
					local238 >>>= 0x10;
					if (arg0[local50] == local249.aClass3_Sub13_1) {
						continue label77;
					}
				}
				for (@Pc(305) int local305 = local50; local305 < local7 - 1; local305++) {
					arg0[local305] = arg0[local305 + 1];
				}
				local7--;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(Lclient!ha;Z)Z")
	@Override
	public final boolean method7852(@OriginalArg(0) Class95 arg0) {
		return Static347.method5034(this.aShort96, this.aShort97, super.aByte131, this.aShort99, this.method7846(arg0), this.aShort98);
	}
}

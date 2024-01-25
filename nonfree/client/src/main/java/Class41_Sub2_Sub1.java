import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!et")
public abstract class Class41_Sub2_Sub1 extends Class41_Sub2 {

	@OriginalMember(owner = "client!et", name = "I", descriptor = "S")
	public short aShort146;

	@OriginalMember(owner = "client!et", name = "H", descriptor = "B")
	public final byte aByte119;

	@OriginalMember(owner = "client!et", name = "E", descriptor = "S")
	public short aShort145;

	@OriginalMember(owner = "client!et", name = "B", descriptor = "S")
	public short aShort144;

	@OriginalMember(owner = "client!et", name = "J", descriptor = "S")
	public short aShort147;

	@OriginalMember(owner = "client!et", name = "D", descriptor = "Z")
	public final boolean aBoolean737;

	@OriginalMember(owner = "client!et", name = "<init>", descriptor = "(IIIIIIIIIZB)V")
	protected Class41_Sub2_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) byte arg10) {
		super.anInt9442 = arg4;
		this.aShort146 = (short) arg6;
		this.aByte119 = arg10;
		this.aShort145 = (short) arg8;
		super.aByte118 = (byte) arg1;
		this.aShort144 = (short) arg7;
		this.aShort147 = (short) arg5;
		super.anInt9443 = arg3;
		this.aBoolean737 = arg9;
		super.anInt9444 = arg2;
		super.aByte117 = (byte) arg0;
	}

	@OriginalMember(owner = "client!et", name = "l", descriptor = "(I)V")
	public void method7854() {
	}

	@OriginalMember(owner = "client!et", name = "f", descriptor = "(I)Z")
	@Override
	public final boolean method7837() {
		for (@Pc(12) int local12 = this.aShort147; local12 <= this.aShort146; local12++) {
			for (@Pc(17) int local17 = this.aShort144; local17 <= this.aShort145; local17++) {
				@Pc(26) int local26 = local12 + Static453.anInt7589 - Static5.anInt120;
				if (local26 >= 0 && Static562.aBooleanArrayArray7.length > local26) {
					@Pc(45) int local45 = local17 + Static453.anInt7589 - Static394.anInt6891;
					if (local45 >= 0 && Static562.aBooleanArrayArray7.length > local45 && Static562.aBooleanArrayArray7[local26][local45]) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!et", name = "d", descriptor = "(B)Z")
	@Override
	public final boolean method7841() {
		return Static103.method1876(this.aShort144, this.aShort145, super.aByte118, this.aShort146, this.method7844(), this.aShort147);
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(I[Lclient!eq;)I")
	@Override
	public final int method7846(@OriginalArg(1) Class3_Sub10[] arg0) {
		@Pc(7) int local7 = 0;
		@Pc(15) int local15;
		@Pc(38) int local38;
		@Pc(48) int local48;
		label112: for (@Pc(10) int local10 = this.aShort147; local10 <= this.aShort146; local10++) {
			label110: for (local15 = this.aShort144; local15 <= this.aShort145; local15++) {
				@Pc(26) long local26 = Static473.aLongArrayArrayArray1[super.aByte117][local10][local15];
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
						@Pc(46) Class129 local46 = Static169.aClass129Array1[local38 - 1];
						for (local48 = 0; local48 < local7; local48++) {
							if (arg0[local48] == local46.aClass3_Sub10_2) {
								local28 += 16L;
								continue label105;
							}
						}
						arg0[local7++] = local46.aClass3_Sub10_2;
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
		if (this.aByte119 != 0) {
			local38 = this.aShort147 - Static5.anInt120;
			@Pc(135) int local135 = this.aShort144 - Static394.anInt6891;
			@Pc(157) int local157;
			@Pc(152) short local152;
			@Pc(160) short local160;
			@Pc(165) int local165;
			if (this.aByte119 == 1) {
				if (local135 > local38) {
					local152 = this.aShort144;
					local165 = this.aShort147 + 1;
					local160 = this.aShort147;
					local157 = this.aShort144 - 1;
				} else {
					local165 = this.aShort147 - 1;
					local160 = this.aShort147;
					local152 = this.aShort144;
					local157 = this.aShort144 + 1;
				}
			} else if (local135 > -local38) {
				local152 = this.aShort144;
				local157 = this.aShort144 - 1;
				local160 = this.aShort147;
				local165 = this.aShort147 - 1;
			} else {
				local152 = this.aShort144;
				local165 = this.aShort147 + 1;
				local157 = this.aShort144 + 1;
				local160 = this.aShort147;
			}
			label76: for (local48 = 0; local48 < local7; local48++) {
				@Pc(235) long local235 = Static473.aLongArrayArrayArray1[super.aByte117][local160][local157];
				@Pc(246) Class129 local246;
				while (local235 != 0L) {
					local246 = Static169.aClass129Array1[(int) ((local235 & 0xFFFFL) - 1L)];
					local235 >>>= 0x10;
					if (arg0[local48] == local246.aClass3_Sub10_2) {
						continue label76;
					}
				}
				local235 = Static473.aLongArrayArrayArray1[super.aByte117][local165][local152];
				while (local235 != 0L) {
					local246 = Static169.aClass129Array1[(int) ((local235 & 0xFFFFL) - 1L)];
					local235 >>>= 0x10;
					if (local246.aClass3_Sub10_2 == arg0[local48]) {
						continue label76;
					}
				}
				for (@Pc(302) int local302 = local48; local302 < local7 - 1; local302++) {
					arg0[local302] = arg0[local302 + 1];
				}
				local7--;
			}
		}
		return local7;
	}
}

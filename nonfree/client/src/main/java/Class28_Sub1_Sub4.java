import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hd")
public abstract class Class28_Sub1_Sub4 extends Class28_Sub1 {

	@OriginalMember(owner = "client!hd", name = "K", descriptor = "Z")
	public final boolean aBoolean914;

	@OriginalMember(owner = "client!hd", name = "D", descriptor = "S")
	public short aShort122;

	@OriginalMember(owner = "client!hd", name = "G", descriptor = "S")
	public short aShort124;

	@OriginalMember(owner = "client!hd", name = "E", descriptor = "S")
	public short aShort123;

	@OriginalMember(owner = "client!hd", name = "y", descriptor = "S")
	public short aShort121;

	@OriginalMember(owner = "client!hd", name = "z", descriptor = "B")
	public final byte aByte146;

	@OriginalMember(owner = "client!hd", name = "<init>", descriptor = "(IIIIIIIIIZB)V")
	protected Class28_Sub1_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) byte arg10) {
		super.anInt10779 = arg3;
		this.aBoolean914 = arg9;
		this.aShort122 = (short) arg6;
		super.anInt10784 = arg4;
		this.aShort124 = (short) arg5;
		this.aShort123 = (short) arg8;
		this.aShort121 = (short) arg7;
		super.aByte145 = (byte) arg0;
		this.aByte146 = arg10;
		super.aByte144 = (byte) arg1;
		super.anInt10781 = arg2;
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(Lclient!ha;I)Z")
	@Override
	public final boolean method8974(@OriginalArg(0) Class65 arg0) {
		return Static517.method7324(this.aShort123, this.aShort122, this.aShort121, super.aByte144, this.aShort124, this.method8978(arg0));
	}

	@OriginalMember(owner = "client!hd", name = "f", descriptor = "(I)V")
	public void method8981() {
	}

	@OriginalMember(owner = "client!hd", name = "c", descriptor = "(I)Z")
	@Override
	public final boolean method8961() {
		for (@Pc(8) int local8 = this.aShort124; local8 <= this.aShort122; local8++) {
			for (@Pc(13) int local13 = this.aShort121; local13 <= this.aShort123; local13++) {
				@Pc(22) int local22 = Static187.anInt6996 + local8 - Static57.anInt852;
				if (local22 >= 0 && Static453.aBooleanArrayArray4.length > local22) {
					@Pc(38) int local38 = local13 + Static187.anInt6996 - Static481.anInt8080;
					if (local38 >= 0 && local38 < Static453.aBooleanArrayArray4.length && Static453.aBooleanArrayArray4[local22][local38]) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "([Lclient!gu;I)I")
	@Override
	public final int method8970(@OriginalArg(0) Class5_Sub18[] arg0) {
		@Pc(7) int local7 = 0;
		@Pc(15) int local15;
		@Pc(38) int local38;
		@Pc(50) int local50;
		label113: for (@Pc(10) int local10 = this.aShort124; local10 <= this.aShort122; local10++) {
			label111: for (local15 = this.aShort121; local15 <= this.aShort123; local15++) {
				@Pc(26) long local26 = Static101.aLongArrayArrayArray1[super.aByte145][local10][local15];
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
						@Pc(48) Class199 local48 = Static50.aClass199Array1[local38 - 1];
						for (local50 = 0; local50 < local7; local50++) {
							if (arg0[local50] == local48.aClass5_Sub18_2) {
								local28 += 16L;
								continue label106;
							}
						}
						arg0[local7++] = local48.aClass5_Sub18_2;
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
		if (this.aByte146 != 0) {
			local38 = this.aShort124 - Static57.anInt852;
			@Pc(144) int local144 = this.aShort121 - Static481.anInt8080;
			@Pc(169) int local169;
			@Pc(164) short local164;
			@Pc(172) short local172;
			@Pc(161) int local161;
			if (this.aByte146 == 1) {
				if (local144 <= local38) {
					local169 = this.aShort121 + 1;
					local161 = this.aShort124 - 1;
					local164 = this.aShort121;
					local172 = this.aShort124;
				} else {
					local172 = this.aShort124;
					local164 = this.aShort121;
					local161 = this.aShort124 + 1;
					local169 = this.aShort121 - 1;
				}
			} else if (-local38 >= local144) {
				local161 = this.aShort124 + 1;
				local164 = this.aShort121;
				local169 = this.aShort121 + 1;
				local172 = this.aShort124;
			} else {
				local161 = this.aShort124 - 1;
				local169 = this.aShort121 - 1;
				local172 = this.aShort124;
				local164 = this.aShort121;
			}
			label77: for (local50 = 0; local50 < local7; local50++) {
				@Pc(246) long local246 = Static101.aLongArrayArrayArray1[super.aByte145][local172][local169];
				@Pc(257) Class199 local257;
				while (local246 != 0L) {
					local257 = Static50.aClass199Array1[(int) ((local246 & 0xFFFFL) - 1L)];
					local246 >>>= 0x10;
					if (arg0[local50] == local257.aClass5_Sub18_2) {
						continue label77;
					}
				}
				local246 = Static101.aLongArrayArrayArray1[super.aByte145][local161][local164];
				while (local246 != 0L) {
					local257 = Static50.aClass199Array1[(int) ((local246 & 0xFFFFL) - 1L)];
					local246 >>>= 0x10;
					if (arg0[local50] == local257.aClass5_Sub18_2) {
						continue label77;
					}
				}
				for (@Pc(311) int local311 = local50; local311 < local7 - 1; local311++) {
					arg0[local311] = arg0[local311 + 1];
				}
				local7--;
			}
		}
		return local7;
	}
}

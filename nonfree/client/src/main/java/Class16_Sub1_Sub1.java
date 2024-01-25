import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ii")
public abstract class Class16_Sub1_Sub1 extends Class16_Sub1 {

	@OriginalMember(owner = "client!ii", name = "C", descriptor = "Z")
	public final boolean aBoolean584;

	@OriginalMember(owner = "client!ii", name = "F", descriptor = "B")
	public final byte aByte110;

	@OriginalMember(owner = "client!ii", name = "I", descriptor = "S")
	public short aShort104;

	@OriginalMember(owner = "client!ii", name = "B", descriptor = "S")
	public short aShort103;

	@OriginalMember(owner = "client!ii", name = "N", descriptor = "S")
	public short aShort106;

	@OriginalMember(owner = "client!ii", name = "L", descriptor = "S")
	public short aShort105;

	@OriginalMember(owner = "client!ii", name = "<init>", descriptor = "(IIIIIIIIIZB)V")
	protected Class16_Sub1_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) byte arg10) {
		this.aBoolean584 = arg9;
		super.anInt8037 = arg2;
		this.aByte110 = arg10;
		super.aByte109 = (byte) arg0;
		this.aShort104 = (short) arg6;
		super.anInt8036 = arg3;
		super.aByte108 = (byte) arg1;
		this.aShort103 = (short) arg5;
		this.aShort106 = (short) arg7;
		super.anInt8034 = arg4;
		this.aShort105 = (short) arg8;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "([Lclient!laa;Z)I")
	@Override
	public final int method6977(@OriginalArg(0) Class2_Sub12[] arg0) {
		@Pc(7) int local7 = 0;
		@Pc(15) int local15;
		@Pc(38) int local38;
		@Pc(51) int local51;
		label112: for (@Pc(10) int local10 = this.aShort103; local10 <= this.aShort104; local10++) {
			label110: for (local15 = this.aShort106; local15 <= this.aShort105; local15++) {
				@Pc(26) long local26 = Static573.aLongArrayArrayArray1[super.aByte109][local10][local15];
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
						@Pc(49) Class342 local49 = Static547.aClass342Array1[local38 - 1];
						for (local51 = 0; local51 < local7; local51++) {
							if (local49.aClass2_Sub12_1 == arg0[local51]) {
								local28 += 16L;
								continue label105;
							}
						}
						arg0[local7++] = local49.aClass2_Sub12_1;
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
		if (this.aByte110 != 0) {
			local38 = this.aShort103 - Static636.anInt10301;
			@Pc(137) int local137 = this.aShort106 - Static66.anInt1803;
			@Pc(161) int local161;
			@Pc(164) short local164;
			@Pc(151) short local151;
			@Pc(156) int local156;
			if (this.aByte110 == 1) {
				if (local137 > local38) {
					local151 = this.aShort103;
					local156 = this.aShort103 + 1;
					local161 = this.aShort106 - 1;
					local164 = this.aShort106;
				} else {
					local151 = this.aShort103;
					local161 = this.aShort106 + 1;
					local164 = this.aShort106;
					local156 = this.aShort103 - 1;
				}
			} else if (-local38 >= local137) {
				local156 = this.aShort103 + 1;
				local164 = this.aShort106;
				local161 = this.aShort106 + 1;
				local151 = this.aShort103;
			} else {
				local161 = this.aShort106 - 1;
				local151 = this.aShort103;
				local164 = this.aShort106;
				local156 = this.aShort103 - 1;
			}
			label76: for (local51 = 0; local51 < local7; local51++) {
				@Pc(235) long local235 = Static573.aLongArrayArrayArray1[super.aByte109][local151][local161];
				@Pc(246) Class342 local246;
				while (local235 != 0L) {
					local246 = Static547.aClass342Array1[(int) ((local235 & 0xFFFFL) - 1L)];
					local235 >>>= 0x10;
					if (local246.aClass2_Sub12_1 == arg0[local51]) {
						continue label76;
					}
				}
				local235 = Static573.aLongArrayArrayArray1[super.aByte109][local156][local164];
				while (local235 != 0L) {
					local246 = Static547.aClass342Array1[(int) ((local235 & 0xFFFFL) - 1L)];
					local235 >>>= 0x10;
					if (arg0[local51] == local246.aClass2_Sub12_1) {
						continue label76;
					}
				}
				for (@Pc(304) int local304 = local51; local304 < local7 - 1; local304++) {
					arg0[local304] = arg0[local304 + 1];
				}
				local7--;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!ii", name = "j", descriptor = "(I)V")
	public void method6992() {
	}

	@OriginalMember(owner = "client!ii", name = "e", descriptor = "(B)Z")
	@Override
	public final boolean method6982() {
		for (@Pc(8) int local8 = this.aShort103; local8 <= this.aShort104; local8++) {
			for (@Pc(13) int local13 = this.aShort106; local13 <= this.aShort105; local13++) {
				@Pc(22) int local22 = local8 + Static621.anInt10151 - Static636.anInt10301;
				if (local22 >= 0 && local22 < Static447.aBooleanArrayArray9.length) {
					@Pc(44) int local44 = local13 + Static621.anInt10151 - Static66.anInt1803;
					if (local44 >= 0 && Static447.aBooleanArrayArray9.length > local44 && Static447.aBooleanArrayArray9[local22][local44]) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ii", name = "c", descriptor = "(ILclient!ha;)Z")
	@Override
	public final boolean method6979(@OriginalArg(1) Class13 arg0) {
		return Static637.method8023(super.aByte108, this.aShort103, this.aShort105, this.method6983(arg0), this.aShort104, this.aShort106);
	}
}

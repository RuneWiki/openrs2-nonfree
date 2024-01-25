import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vr")
public abstract class Class9_Sub1_Sub1 extends Class9_Sub1 {

	@OriginalMember(owner = "client!vr", name = "B", descriptor = "S")
	public short aShort113;

	@OriginalMember(owner = "client!vr", name = "G", descriptor = "S")
	public short aShort114;

	@OriginalMember(owner = "client!vr", name = "z", descriptor = "S")
	public short aShort112;

	@OriginalMember(owner = "client!vr", name = "J", descriptor = "S")
	public short aShort115;

	@OriginalMember(owner = "client!vr", name = "D", descriptor = "Z")
	public final boolean aBoolean655;

	@OriginalMember(owner = "client!vr", name = "E", descriptor = "B")
	public final byte aByte124;

	@OriginalMember(owner = "client!vr", name = "<init>", descriptor = "(IIIIIIIIIZB)V")
	protected Class9_Sub1_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) byte arg10) {
		this.aShort113 = (short) arg8;
		super.aByte126 = (byte) arg0;
		super.anInt8975 = arg2;
		this.aShort114 = (short) arg6;
		this.aShort112 = (short) arg5;
		super.aByte125 = (byte) arg1;
		this.aShort115 = (short) arg7;
		this.aBoolean655 = arg9;
		super.anInt8977 = arg3;
		this.aByte124 = arg10;
		super.anInt8980 = arg4;
	}

	@OriginalMember(owner = "client!vr", name = "f", descriptor = "(B)Z")
	@Override
	public final boolean method7484() {
		return Static555.method7394(this.aShort112, this.aShort115, this.aShort113, this.method7478(), super.aByte125, this.aShort114);
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "([Lclient!ff;B)I")
	@Override
	public final int method7468(@OriginalArg(0) Class3_Sub22[] arg0) {
		@Pc(7) int local7 = 0;
		@Pc(15) int local15;
		@Pc(38) int local38;
		@Pc(51) int local51;
		label112: for (@Pc(10) int local10 = this.aShort112; local10 <= this.aShort114; local10++) {
			label110: for (local15 = this.aShort115; local15 <= this.aShort113; local15++) {
				@Pc(26) long local26 = Static548.aLongArrayArrayArray1[super.aByte126][local10][local15];
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
						@Pc(49) Class258 local49 = Static569.aClass258Array1[local38 - 1];
						for (local51 = 0; local51 < local7; local51++) {
							if (local49.aClass3_Sub22_2 == arg0[local51]) {
								local28 += 16L;
								continue label105;
							}
						}
						arg0[local7++] = local49.aClass3_Sub22_2;
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
		if (this.aByte124 != 0) {
			local38 = this.aShort112 - Static210.anInt4205;
			@Pc(144) int local144 = this.aShort115 - Static12.anInt136;
			@Pc(166) int local166;
			@Pc(161) short local161;
			@Pc(169) short local169;
			@Pc(158) int local158;
			if (this.aByte124 == 1) {
				if (local38 < local144) {
					local158 = this.aShort112 + 1;
					local161 = this.aShort115;
					local166 = this.aShort115 - 1;
					local169 = this.aShort112;
				} else {
					local161 = this.aShort115;
					local169 = this.aShort112;
					local166 = this.aShort115 + 1;
					local158 = this.aShort112 - 1;
				}
			} else if (-local38 >= local144) {
				local158 = this.aShort112 + 1;
				local166 = this.aShort115 + 1;
				local161 = this.aShort115;
				local169 = this.aShort112;
			} else {
				local169 = this.aShort112;
				local158 = this.aShort112 - 1;
				local161 = this.aShort115;
				local166 = this.aShort115 - 1;
			}
			label76: for (local51 = 0; local51 < local7; local51++) {
				@Pc(240) long local240 = Static548.aLongArrayArrayArray1[super.aByte126][local169][local166];
				@Pc(251) Class258 local251;
				while (local240 != 0L) {
					local251 = Static569.aClass258Array1[(int) ((local240 & 0xFFFFL) - 1L)];
					local240 >>>= 0x10;
					if (local251.aClass3_Sub22_2 == arg0[local51]) {
						continue label76;
					}
				}
				local240 = Static548.aLongArrayArrayArray1[super.aByte126][local158][local161];
				while (local240 != 0L) {
					local251 = Static569.aClass258Array1[(int) ((local240 & 0xFFFFL) - 1L)];
					local240 >>>= 0x10;
					if (arg0[local51] == local251.aClass3_Sub22_2) {
						continue label76;
					}
				}
				for (@Pc(307) int local307 = local51; local307 < local7 - 1; local307++) {
					arg0[local307] = arg0[local307 + 1];
				}
				local7--;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!vr", name = "b", descriptor = "(Z)Z")
	@Override
	public final boolean method7475() {
		for (@Pc(16) int local16 = this.aShort112; local16 <= this.aShort114; local16++) {
			for (@Pc(21) int local21 = this.aShort115; local21 <= this.aShort113; local21++) {
				@Pc(30) int local30 = local16 + Static266.anInt4982 - Static210.anInt4205;
				if (local30 >= 0 && local30 < Static356.aBooleanArrayArray5.length) {
					@Pc(48) int local48 = local21 + Static266.anInt4982 - Static12.anInt136;
					if (local48 >= 0 && local48 < Static356.aBooleanArrayArray5.length && Static356.aBooleanArrayArray5[local30][local48]) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!vr", name = "i", descriptor = "(I)V")
	public void method7086() {
	}
}

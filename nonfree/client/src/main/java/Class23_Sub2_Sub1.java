import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fe")
public abstract class Class23_Sub2_Sub1 extends Class23_Sub2 {

	@OriginalMember(owner = "client!fe", name = "z", descriptor = "Z")
	public final boolean aBoolean745;

	@OriginalMember(owner = "client!fe", name = "y", descriptor = "S")
	public short aShort122;

	@OriginalMember(owner = "client!fe", name = "G", descriptor = "B")
	public final byte aByte144;

	@OriginalMember(owner = "client!fe", name = "C", descriptor = "S")
	public short aShort124;

	@OriginalMember(owner = "client!fe", name = "B", descriptor = "S")
	public short aShort123;

	@OriginalMember(owner = "client!fe", name = "F", descriptor = "S")
	public short aShort125;

	@OriginalMember(owner = "client!fe", name = "<init>", descriptor = "(IIIIIIIIIZB)V")
	protected Class23_Sub2_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) byte arg10) {
		this.aBoolean745 = arg9;
		this.aShort122 = (short) arg8;
		super.aByte142 = (byte) arg0;
		super.aByte143 = (byte) arg1;
		this.aByte144 = arg10;
		super.anInt10108 = arg2;
		this.aShort124 = (short) arg7;
		this.aShort123 = (short) arg5;
		super.anInt10114 = arg3;
		super.anInt10109 = arg4;
		this.aShort125 = (short) arg6;
	}

	@OriginalMember(owner = "client!fe", name = "f", descriptor = "(I)Z")
	@Override
	public final boolean method8598() {
		for (@Pc(8) int local8 = this.aShort123; local8 <= this.aShort125; local8++) {
			for (@Pc(13) int local13 = this.aShort124; local13 <= this.aShort122; local13++) {
				@Pc(22) int local22 = local8 + Static641.anInt9890 - Static177.anInt3330;
				if (local22 >= 0 && Static569.aBooleanArrayArray6.length > local22) {
					@Pc(44) int local44 = local13 + Static641.anInt9890 - Static227.anInt4358;
					if (local44 >= 0 && Static569.aBooleanArrayArray6.length > local44 && Static569.aBooleanArrayArray6[local22][local44]) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!fe", name = "f", descriptor = "(B)V")
	public void method8612() {
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(ILclient!ha;)Z")
	@Override
	public final boolean method8599(@OriginalArg(1) Class16 arg0) {
		return Static624.method8247(this.aShort124, this.method8595(arg0), super.aByte143, this.aShort123, this.aShort122, this.aShort125);
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "([Lclient!bq;Z)I")
	@Override
	public final int method8602(@OriginalArg(0) Class3_Sub7[] arg0) {
		@Pc(7) int local7 = 0;
		@Pc(15) int local15;
		@Pc(38) int local38;
		@Pc(48) int local48;
		label112: for (@Pc(10) int local10 = this.aShort123; local10 <= this.aShort125; local10++) {
			label110: for (local15 = this.aShort124; local15 <= this.aShort122; local15++) {
				@Pc(26) long local26 = Static71.aLongArrayArrayArray1[super.aByte142][local10][local15];
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
						@Pc(46) Class119 local46 = Static135.aClass119Array1[local38 - 1];
						for (local48 = 0; local48 < local7; local48++) {
							if (arg0[local48] == local46.aClass3_Sub7_1) {
								local28 += 16L;
								continue label105;
							}
						}
						arg0[local7++] = local46.aClass3_Sub7_1;
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
		if (this.aByte144 != 0) {
			local38 = this.aShort123 - Static177.anInt3330;
			@Pc(125) int local125 = this.aShort124 - Static227.anInt4358;
			@Pc(142) int local142;
			@Pc(137) short local137;
			@Pc(150) short local150;
			@Pc(147) int local147;
			if (this.aByte144 == 1) {
				if (local38 >= local125) {
					local137 = this.aShort124;
					local142 = this.aShort124 + 1;
					local147 = this.aShort123 - 1;
					local150 = this.aShort123;
				} else {
					local142 = this.aShort124 - 1;
					local150 = this.aShort123;
					local147 = this.aShort123 + 1;
					local137 = this.aShort124;
				}
			} else if (-local38 >= local125) {
				local150 = this.aShort123;
				local142 = this.aShort124 + 1;
				local147 = this.aShort123 + 1;
				local137 = this.aShort124;
			} else {
				local142 = this.aShort124 - 1;
				local147 = this.aShort123 - 1;
				local150 = this.aShort123;
				local137 = this.aShort124;
			}
			label76: for (local48 = 0; local48 < local7; local48++) {
				@Pc(221) long local221 = Static71.aLongArrayArrayArray1[super.aByte142][local150][local142];
				@Pc(232) Class119 local232;
				while (local221 != 0L) {
					local232 = Static135.aClass119Array1[(int) ((local221 & 0xFFFFL) - 1L)];
					local221 >>>= 0x10;
					if (local232.aClass3_Sub7_1 == arg0[local48]) {
						continue label76;
					}
				}
				local221 = Static71.aLongArrayArrayArray1[super.aByte142][local147][local137];
				while (local221 != 0L) {
					local232 = Static135.aClass119Array1[(int) ((local221 & 0xFFFFL) - 1L)];
					local221 >>>= 0x10;
					if (local232.aClass3_Sub7_1 == arg0[local48]) {
						continue label76;
					}
				}
				for (@Pc(290) int local290 = local48; local290 < local7 - 1; local290++) {
					arg0[local290] = arg0[local290 + 1];
				}
				local7--;
			}
		}
		return local7;
	}
}

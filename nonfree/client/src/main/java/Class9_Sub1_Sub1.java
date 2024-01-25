import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mga")
public abstract class Class9_Sub1_Sub1 extends Class9_Sub1 {

	@OriginalMember(owner = "client!mga", name = "N", descriptor = "S")
	public short aShort120;

	@OriginalMember(owner = "client!mga", name = "G", descriptor = "S")
	public short aShort122;

	@OriginalMember(owner = "client!mga", name = "Q", descriptor = "Z")
	public final boolean aBoolean725;

	@OriginalMember(owner = "client!mga", name = "I", descriptor = "S")
	public short aShort123;

	@OriginalMember(owner = "client!mga", name = "L", descriptor = "B")
	public final byte aByte141;

	@OriginalMember(owner = "client!mga", name = "O", descriptor = "S")
	public short aShort121;

	@OriginalMember(owner = "client!mga", name = "<init>", descriptor = "(IIIIIIIIIZB)V")
	protected Class9_Sub1_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) byte arg10) {
		super.anInt10695 = arg4;
		this.aShort120 = (short) arg7;
		this.aShort122 = (short) arg6;
		this.aBoolean725 = arg9;
		this.aShort123 = (short) arg5;
		this.aByte141 = arg10;
		super.aByte140 = (byte) arg1;
		super.anInt10694 = arg2;
		super.anInt10690 = arg3;
		super.aByte139 = (byte) arg0;
		this.aShort121 = (short) arg8;
	}

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(Lclient!ha;I)Z")
	@Override
	public final boolean method9082(@OriginalArg(0) Class22 arg0) {
		return Static98.method1976(this.aShort121, super.aByte140, this.method9080(arg0), this.aShort120, this.aShort122, this.aShort123);
	}

	@OriginalMember(owner = "client!mga", name = "h", descriptor = "(I)V")
	public void method9097() {
	}

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "([Lclient!jw;I)I")
	@Override
	public final int method9094(@OriginalArg(0) Class3_Sub5[] arg0) {
		@Pc(7) int local7 = 0;
		@Pc(15) int local15;
		@Pc(38) int local38;
		@Pc(48) int local48;
		label112: for (@Pc(10) int local10 = this.aShort123; local10 <= this.aShort122; local10++) {
			label110: for (local15 = this.aShort120; local15 <= this.aShort121; local15++) {
				@Pc(26) long local26 = Static136.aLongArrayArrayArray1[super.aByte139][local10][local15];
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
						@Pc(46) Class8 local46 = Static660.aClass8Array1[local38 - 1];
						for (local48 = 0; local48 < local7; local48++) {
							if (arg0[local48] == local46.aClass3_Sub5_1) {
								local28 += 16L;
								continue label105;
							}
						}
						arg0[local7++] = local46.aClass3_Sub5_1;
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
		if (this.aByte141 != 0) {
			local38 = this.aShort123 - Static507.anInt8070;
			@Pc(154) int local154 = this.aShort120 - Static527.anInt8230;
			@Pc(171) int local171;
			@Pc(179) short local179;
			@Pc(182) short local182;
			@Pc(176) int local176;
			if (this.aByte141 == 1) {
				if (local154 > local38) {
					local179 = this.aShort120;
					local171 = this.aShort120 - 1;
					local176 = this.aShort123 + 1;
					local182 = this.aShort123;
				} else {
					local179 = this.aShort120;
					local182 = this.aShort123;
					local176 = this.aShort123 - 1;
					local171 = this.aShort120 + 1;
				}
			} else if (-local38 < local154) {
				local171 = this.aShort120 - 1;
				local176 = this.aShort123 - 1;
				local179 = this.aShort120;
				local182 = this.aShort123;
			} else {
				local171 = this.aShort120 + 1;
				local179 = this.aShort120;
				local176 = this.aShort123 + 1;
				local182 = this.aShort123;
			}
			label76: for (local48 = 0; local48 < local7; local48++) {
				@Pc(258) long local258 = Static136.aLongArrayArrayArray1[super.aByte139][local182][local171];
				@Pc(269) Class8 local269;
				while (local258 != 0L) {
					local269 = Static660.aClass8Array1[(int) ((local258 & 0xFFFFL) - 1L)];
					local258 >>>= 0x10;
					if (arg0[local48] == local269.aClass3_Sub5_1) {
						continue label76;
					}
				}
				local258 = Static136.aLongArrayArrayArray1[super.aByte139][local176][local179];
				while (local258 != 0L) {
					local269 = Static660.aClass8Array1[(int) ((local258 & 0xFFFFL) - 1L)];
					local258 >>>= 0x10;
					if (arg0[local48] == local269.aClass3_Sub5_1) {
						continue label76;
					}
				}
				for (@Pc(335) int local335 = local48; local335 < local7 - 1; local335++) {
					arg0[local335] = arg0[local335 + 1];
				}
				local7--;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!mga", name = "f", descriptor = "(B)Z")
	@Override
	public final boolean method9079() {
		for (@Pc(16) int local16 = this.aShort123; local16 <= this.aShort122; local16++) {
			for (@Pc(23) int local23 = this.aShort120; local23 <= this.aShort121; local23++) {
				@Pc(33) int local33 = local16 + Static720.anInt11190 - Static507.anInt8070;
				if (local33 >= 0 && local33 < Static181.aBooleanArrayArray2.length) {
					@Pc(56) int local56 = local23 + Static720.anInt11190 - Static527.anInt8230;
					if (local56 >= 0 && Static181.aBooleanArrayArray2.length > local56 && Static181.aBooleanArrayArray2[local33][local56]) {
						return true;
					}
				}
			}
		}
		return false;
	}
}
